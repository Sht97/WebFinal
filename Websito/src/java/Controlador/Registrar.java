/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Banda;
import java.io.IOException;
import java.io.PrintWriter;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author danie
 */
@WebServlet(name = "Registrar", urlPatterns = {"/Registrar"})
public class Registrar extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String nombreArtistico=request.getParameter("nombreArtistico");
        String nombreRepresentante=request.getParameter("nombreRepresentante");
        String nominaciones=request.getParameter("nominaciones");
        String ultimoAlbum=request.getParameter("ultimoAlbum");
        String linkMejorCancion=request.getParameter("linkMejorCancion");
        String correoDeContacto=request.getParameter("correoDeContacto");
        
        
        Banda banda=new Banda();
        banda.setCorreoDeContacto(correoDeContacto);
        banda.setId(0);
        banda.setLinkMejorCancion(linkMejorCancion);
        banda.setNombreArtistico(nombreArtistico);
        banda.setNominaciones(nominaciones);
        banda.setUltimoAlbum(ultimoAlbum);
        banda.setRepresentante(nombreRepresentante);
        
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("WebsitoPU");
        EntityManager em=emf.createEntityManager();
        
        em.getTransaction().begin();
        em.persist(banda);
        em.flush();
        em.getTransaction().commit();
        
        response.sendRedirect("index.html");
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
