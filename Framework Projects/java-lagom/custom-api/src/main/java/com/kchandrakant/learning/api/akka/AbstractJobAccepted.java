package com.kchandrakant.learning.api.akka;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.lightbend.lagom.javadsl.immutable.ImmutableStyle;
import com.lightbend.lagom.serialization.Jsonable;
import com.sapient.learning.api.akka.JobAccepted;

import org.immutables.value.Value;

@Value.Immutable
@ImmutableStyle
@JsonDeserialize(as = JobAccepted.class)
public interface AbstractJobAccepted extends Jsonable {
	@Value.Parameter
	public String getJobId();
}
