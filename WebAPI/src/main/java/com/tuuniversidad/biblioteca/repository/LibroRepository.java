package com.tuuniversidad.biblioteca.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;
import com.tuuniversidad.biblioteca.models.Libro;

@Repository
public class LibroRepository {
    private List<Libro> libros = new ArrayList<>();

    public LibroRepository(){
        libros.add(new Libro(10l, "El codigo da Vinci", "Dan Brown", "Doubleday", 2003));
        libros.add(new Libro(11l, "El señor de los anillos", "Tolkien", "George Allen", 1955));
        libros.add(new Libro(12l, "El principito", "Antoine de Saint", "Reynal", 1943));
        libros.add(new Libro(13l, "Don quijote de la Mancha", "Miguel de Cervantes", "Francisco de Robles", 1605));
    }
    

    public List<Libro> findAll() {
        return libros;
    }

    public Optional<Libro> findById(Long id) {
        return libros.stream().filter(libro -> libro.getId().equals(id)).findFirst();
    }

    public void save(Libro libro) {
        libros.add(libro);
    }
}
