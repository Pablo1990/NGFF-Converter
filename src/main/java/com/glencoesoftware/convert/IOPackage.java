package com.glencoesoftware.convert;

import java.io.File;

public class IOPackage {
    public File fileIn;
    public File fileOut;
    public String status;

    public IOPackage(File in, File out) {
        fileIn = in;
        fileOut = out;
        if (fileOut.exists()) {
            status = "error";
        } else {
            status = "ready";
        }
    }

    public void setFileIn(File newFile) {
        fileIn = newFile;
    }

    public void setFileOut(File newFile) {
        fileOut = newFile;
    }
}
