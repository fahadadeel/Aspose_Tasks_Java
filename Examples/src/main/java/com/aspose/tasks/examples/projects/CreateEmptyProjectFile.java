/*
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.projects;

import com.aspose.tasks.*;
import com.aspose.tasks.examples.Utils;

import java.io.FileOutputStream;
import java.io.IOException;

public class CreateEmptyProjectFile
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(CreateEmptyProjectFile.class);


        //Create a project instance
        Project newProject = new Project();

        newProject.save(dataDir + "Project1.xml", SaveFileFormat.XML);

        //Display result of conversion.
        System.out.println("Project file generated Successfully");
    }
}




