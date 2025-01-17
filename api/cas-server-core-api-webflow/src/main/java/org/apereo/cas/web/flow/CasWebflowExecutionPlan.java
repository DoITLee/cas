package org.apereo.cas.web.flow;

import org.springframework.web.servlet.HandlerInterceptor;

import java.util.Collection;

/**
 * This is {@link CasWebflowExecutionPlan}.
 *
 * @author Misagh Moayyed
 * @since 5.3.0
 */
public interface CasWebflowExecutionPlan {

    /**
     * Register webflow configurer.
     *
     * @param cfg the cfg
     */
    void registerWebflowConfigurer(CasWebflowConfigurer cfg);

    /**
     * Register webflow interceptor.
     *
     * @param interceptor the interceptor
     */
    void registerWebflowInterceptor(HandlerInterceptor interceptor);

    /**
     * Gets webflow configurers.
     *
     * @return the webflow configurers
     */
    Collection<CasWebflowConfigurer> getWebflowConfigurers();

    /**
     * Gets webflow interceptors.
     *
     * @return the webflow interceptors
     */
    Collection<HandlerInterceptor> getWebflowInterceptors();

    /**
     * Execute the plan.
     */
    void execute();
}
