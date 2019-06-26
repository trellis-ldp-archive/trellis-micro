package org.trellisldp;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.trellisldp.api.AgentService;
import org.trellisldp.api.AuditService;
import org.trellisldp.api.BinaryService;
import org.trellisldp.api.EventService;
import org.trellisldp.api.IOService;
import org.trellisldp.api.MementoService;
import org.trellisldp.api.ResourceService;
import org.trellisldp.api.ServiceBundler;

/**
 * Use to supply injected components for a Trellis application.
 *
 */
@ApplicationScoped
public class CDIServiceBundler implements ServiceBundler {

    @Inject
    private AuditService auditService;

    @Inject
    private ResourceService resourceService;

    @Inject
    private MementoService mementoService;

    @Inject
    private BinaryService binaryService;

    @Inject
    private AgentService agentService;

    @Inject
    private IOService ioService;

    @Inject
    private EventService eventService;

    @Override
    public AgentService getAgentService() {
        return agentService;
    }

    @Override
    public ResourceService getResourceService() {
        return resourceService;
    }

    @Override
    public IOService getIOService() {
        return ioService;
    }

    @Override
    public BinaryService getBinaryService() {
        return binaryService;
    }

    @Override
    public AuditService getAuditService() {
        return auditService;
    }

    @Override
    public MementoService getMementoService() {
        return mementoService;
    }

    @Override
    public EventService getEventService() {
        return eventService;
    }
}
