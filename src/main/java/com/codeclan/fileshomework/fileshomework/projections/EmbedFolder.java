package com.codeclan.fileshomework.fileshomework.projections;

import com.codeclan.fileshomework.fileshomework.models.File;
import com.codeclan.fileshomework.fileshomework.models.Folder;
import com.codeclan.fileshomework.fileshomework.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.ArrayList;

@Projection(name = "embedFolder", types = Folder.class)
public interface EmbedFolder {
    String getTitle();
    ArrayList<File> getFiles();
    User getUser();
}
