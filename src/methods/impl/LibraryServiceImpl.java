package methods.impl;

import methods.LibraryService;
import models.Library;

import java.util.ArrayList;
import java.util.List;

public class LibraryServiceImpl implements LibraryService {
     List<Library>libraries1=new ArrayList<>();
    @Override //erfolgreich
    public List<Library> saveLibrary(List<Library> libraries) {
        libraries1.addAll(libraries);


        return null;
    }

    @Override //erfolgreich
    public List<Library> getAllLibraries() {

        return libraries1;
    }

    @Override //erfolgreich
    public Library getLibraryById(Long id) {
        for (Library library: libraries1){
            if (library.getId().equals(id)){
                return library;
            }
        }

        return null;
    }

    @Override //erfolgreich
    public Library updateLibrary(Long id, Library library) {
        for (Library library1:libraries1){
            if (libraries1!=null && library1.getId().equals(id)){
                for (int i = 0; i < libraries1.size(); i++) {
                libraries1.set(i,library);
                return library;
                }
            }
        }

        return null;
    }

    @Override //erfolgreich
    public String deleteLibrary(Long id) {
        for (Library library: libraries1){
            if(library.getId().equals(id)){
                libraries1.remove(library);
            }
            System.out.println(" Erfolgreich gelosht:  "+ library);
        }
        return null;
    }
}
