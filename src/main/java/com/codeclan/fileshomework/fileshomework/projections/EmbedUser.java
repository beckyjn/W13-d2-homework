package com.codeclan.fileshomework.fileshomework.projections;

import com.codeclan.fileshomework.fileshomework.models.Folder;
import com.codeclan.fileshomework.fileshomework.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.ArrayList;

@Projection(name = "embedUser", types = User.class)
public interface EmbedUser {
    String getName();
    ArrayList<Folder> getFolders();
}
