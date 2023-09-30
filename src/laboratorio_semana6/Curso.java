/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio_semana6;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User001
 */
public class Curso {
    
    private String Nombre;
    private String Codigo;
    private String Creditos;
    private Profesor profesores;

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }
    private Alumno alumno;

    public Curso  (String Nombre, Alumno alumno) {
        this.Nombre = Nombre;
        this.alumno = alumno;
    }
    public Profesor getProfesores() {
        return profesores;
    }

    public void setProfesores(Profesor profesores) {
        this.profesores = profesores;
    }
    

    public Curso(String Nombre, Profesor profesores) {
        this.Nombre = Nombre;
        this.profesores = profesores;
    }
    public Curso(String Nombre, String Codigo, String Creditos) {
        this.Nombre = Nombre;
        this.Codigo = Codigo;
        this.Creditos = Creditos;
    }
    

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getCreditos() {
        return Creditos;
    }

    public void setCreditos(String creditos) {
        this.Creditos = creditos;
    } 
}
