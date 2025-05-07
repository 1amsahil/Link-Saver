package com.eternity.linksaver.service;//package com.eternity.linksaver.service;

import com.eternity.linksaver.model.Link;
import com.eternity.linksaver.model.Users;
import com.eternity.linksaver.repo.LinkRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LinkService {

    @Autowired
    private LinkRepo repo;

    public Link saveLink(Link link) {
        return repo.save(link);
    }

    public List<Link> getLinksByUser(Users user) {
        return repo.findByUserId(user.getId());
    }
}
