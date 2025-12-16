package com.avito.beduin.v2.repository.client.event.bus.interactions;

import Y61.k;
import cV0.InterfaceC27110a;
import com.avito.beduin.v2.engine.InterfaceC36238a;
import com.avito.beduin.v2.handler.flow.i;
import com.avito.beduin.v2.interaction.repository.flow.C;
import com.avito.beduin.v2.repository.client.event.bus.interactions.a;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.X;

/* compiled from: ClientEventBusRepositoryObserveInteractionHandler.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/repository/client/event/bus/interactions/e;", "Lcom/avito/beduin/v2/handler/flow/i;", "Lcom/avito/beduin/v2/repository/client/event/bus/interactions/a;", "Lcom/avito/beduin/v2/interaction/repository/flow/C;", "client-event-bus_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e extends i<a> implements C {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC27110a f338200c;

    public e(@k InterfaceC27110a interfaceC27110a) {
        super(a.C10478a.f338178b);
        this.f338200c = interfaceC27110a;
    }

    @Override // com.avito.beduin.v2.handler.flow.i
    public final InterfaceC43160i o(InterfaceC36238a interfaceC36238a, dU0.b bVar) {
        a aVar = (a) bVar;
        return new C43152f0(new X(C43175k.d(new d(this, aVar, interfaceC36238a.c(), null)), new b(aVar, this, interfaceC36238a, null)), new c(aVar, this, interfaceC36238a, null));
    }
}
