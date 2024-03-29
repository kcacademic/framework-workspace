package com.kchandrakant.learning.custom.impl;

import com.google.inject.AbstractModule;
import com.kchandrakant.learning.custom.akka.Worker;
import com.kchandrakant.learning.custom.api.CustomService;
import com.kchandrakant.learning.custom.play.*;
import com.lightbend.lagom.javadsl.server.ServiceGuiceSupport;

import play.libs.akka.AkkaGuiceSupport;

public class CustomModule extends AbstractModule implements ServiceGuiceSupport, AkkaGuiceSupport {
	@Override
	protected void configure() {
		bindService(CustomService.class, CustomServiceImpl.class, additionalRouter(SomePlayRouter.class));
		
		bindActor(Worker.class, "worker");
	}
}
