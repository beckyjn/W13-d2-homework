package com.codeclan.fileshomework.fileshomework.projections;

import com.codeclan.fileshomework.fileshomework.models.File;
import com.codeclan.fileshomework.fileshomework.models.Folder;
import org.springframework.data.rest.core.config.Projection;

import java.util.ArrayList;

@Projection(name =  "embedFile", types = File.class )
public interface EmbedFile {
    String getName();
    String getExtension();
    int getSize();
    Folder getFolder();
}
