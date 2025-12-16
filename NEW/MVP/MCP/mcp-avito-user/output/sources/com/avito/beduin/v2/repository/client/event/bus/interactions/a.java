package com.avito.beduin.v2.repository.client.event.bus.interactions;

import Y61.k;
import com.avito.beduin.v2.engine.core.z;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import com.avito.beduin.v2.engine.field.m;
import com.avito.beduin.v2.interaction.repository.flow.l;
import dU0.f;
import dV0.C39630a;
import kotlin.Metadata;

/* compiled from: ClientEventBusRepositoryObserveInteraction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/repository/client/event/bus/interactions/a;", "Lcom/avito/beduin/v2/interaction/repository/flow/l;", "a", "client-event-bus_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a extends l {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final C39630a f338176e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Y41.a<f> f338177f;

    /* compiled from: ClientEventBusRepositoryObserveInteraction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/repository/client/event/bus/interactions/a$a;", "Lcom/avito/beduin/v2/interaction/repository/flow/l$a;", "<init>", "()V", "client-event-bus_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.beduin.v2.repository.client.event.bus.interactions.a$a, reason: collision with other inner class name */
    public static final class C10478a extends l.a {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final C10478a f338178b = new C10478a();

        public C10478a() {
            super("ClientEventBus", null, 2, null);
        }

        @Override // com.avito.beduin.v2.interaction.repository.flow.l.a
        @k
        public final l c(@k z zVar, @k m mVar, @k Y41.l<? super com.avito.beduin.v2.engine.field.d, f> lVar, @k Y41.a<f> aVar, @k Y41.l<? super com.avito.beduin.v2.engine.field.d, f> lVar2, @Y61.l Y41.a<f> aVar2) throws BeduinPropertyException {
            com.avito.beduin.v2.repository.client.event.bus.bundle.c cVarA = com.avito.beduin.v2.repository.client.event.bus.bundle.b.a(zVar, mVar);
            return new a(cVarA.f338174a, cVarA.f338175b, lVar, aVar, lVar2, aVar2);
        }
    }

    public a(@k C39630a c39630a, @k Y41.a<f> aVar, @k Y41.l<? super com.avito.beduin.v2.engine.field.d, f> lVar, @k Y41.a<f> aVar2, @k Y41.l<? super com.avito.beduin.v2.engine.field.d, f> lVar2, @Y61.l Y41.a<f> aVar3) {
        super(lVar, aVar2, lVar2, aVar3);
        this.f338176e = c39630a;
        this.f338177f = aVar;
    }
}
