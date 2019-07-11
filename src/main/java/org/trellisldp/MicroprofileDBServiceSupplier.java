package org.trellisldp;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.sql.DataSource;

import org.trellisldp.ext.db.DBNamespaceService;
import org.trellisldp.ext.db.DBResourceService;

/**
 * Converts between {@link Resource} and {@link Inject}-triggered injection.
 *
 */
@ApplicationScoped
class MicroprofileDBServiceSupplier {

    @Resource(name = "jdbc/h2test")
    private DataSource db;

    @Produces
    private DBResourceService dbResourceService;

    @Produces
    private DBNamespaceService dbNamespaceService;

    @PostConstruct
    void buildServices() {
        this.dbResourceService = new DBResourceService(db);
        this.dbNamespaceService = new DBNamespaceService(db);
    }
}
