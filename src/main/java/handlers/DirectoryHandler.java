package handlers;

import models.Directory;
import models.File;
import models.Folder;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.io.FileNotFoundException;
import java.nio.file.NotDirectoryException;
import java.util.List;

public class DirectoryHandler {


    //region Files
    public List<File> GetAllFiles(){
        throw new NotImplementedException();
    }

    public File GetFile(int index) throws FileNotFoundException {
        throw new NotImplementedException();
    }

    public File GetFile(String name) throws FileNotFoundException {
        throw new NotImplementedException();
    }
    //endregion

    //region Folders
    public List<Folder> getAllFolders(){
        throw new NotImplementedException();
    }

    public Folder getFolder(int index) throws NotDirectoryException {
        throw new NotImplementedException();
    }

    public Folder getFolder(String name) throws NotDirectoryException {
        throw new NotImplementedException();
    }
    //endregion

    //region Directories
    public Directory getDirectory() throws NotDirectoryException {
        throw new NotImplementedException();
    }
    //endregion

    //region Moving
    public void MoveInto(Folder folder) {
        throw new NotImplementedException();
    }

    public void MoveOut() {
        throw new NotImplementedException();
    }
    //endregion
}
