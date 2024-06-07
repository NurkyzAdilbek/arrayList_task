package methods.impl;

import methods.ReaderService;
import models.Library;
import models.Reader;

import java.util.ArrayList;
import java.util.List;

public class ReaderServiceImpl implements ReaderService {
     List<Reader>readers=new ArrayList<>();
    List<Library>libraries=new ArrayList<>();
    @Override //erfolgreich
    public void saveReader(Reader reader) {
        readers.add(reader);

    }

    @Override //erfolgreich
    public List<Reader> getAllReaders() {

        return readers;
    }

    @Override // erfolgreich
    public Reader getReaderById(Long id) {
        for (Reader reader:readers){
            if (reader.getId().equals(id)){
                return reader;
            }
        }
        return null;
    }

    @Override
    public Reader updateReader(Long id, Reader reader) {
        for (Reader reader1:readers){
            if (reader1.getId().equals(id)){
                for (Reader reader2: readers){
                    if (readers.contains(reader2)){
                        readers.set(1,reader1);
                    }
                }
            }
        }
        return null;
    }

    @Override
    public void assignReaderToLibrary(Long readerId, Long libraryId) {
        for (Reader reader:readers){
            if (reader.getId().equals(readerId)){
                for (Library library:libraries){
                    if (library.getId().equals(libraryId)){
                        System.out.println("Diese "+ library+ " ist Library von "+reader);
                    }
                }
            }
        }


    }
}
