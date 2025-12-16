package io.ktor.client.plugins.websocket;

import io.ktor.util.InterfaceC41603j0;
import io.ktor.websocket.AbstractC41723i;
import io.ktor.websocket.InterfaceC41715a;
import io.ktor.websocket.L;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.K0;
import kotlinx.coroutines.channels.M0;

/* compiled from: ClientSessions.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lio/ktor/client/plugins/websocket/x;", "Lio/ktor/client/plugins/websocket/w;", "Lio/ktor/websocket/a;", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class x implements w, InterfaceC41715a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC41715a f399684b;

    public x(@Y61.k InterfaceC41715a interfaceC41715a) {
        this.f399684b = interfaceC41715a;
    }

    @Override // io.ktor.websocket.Z
    @Y61.l
    public final Object B(@Y61.k AbstractC41723i.b bVar, @Y61.k Continuation continuation) {
        return this.f399684b.B(bVar, continuation);
    }

    @Override // io.ktor.websocket.Z
    @Y61.k
    public final K0<AbstractC41723i> D() {
        return this.f399684b.D();
    }

    @Override // io.ktor.websocket.Z
    @Y61.l
    public final Object G(@Y61.k Continuation<? super G0> continuation) {
        return this.f399684b.G(continuation);
    }

    @Override // io.ktor.websocket.InterfaceC41715a
    @InterfaceC41603j0
    public final void P(@Y61.k List<? extends L<?>> list) {
        this.f399684b.P(list);
    }

    @Override // kotlinx.coroutines.T
    @Y61.k
    /* renamed from: getCoroutineContext */
    public final CoroutineContext getF332438d() {
        return this.f399684b.getF332438d();
    }

    @Override // io.ktor.websocket.Z
    @Y61.k
    public final M0<AbstractC41723i> j() {
        return this.f399684b.j();
    }

    @Override // io.ktor.websocket.Z
    public final long p() {
        return this.f399684b.p();
    }

    @Override // io.ktor.websocket.Z
    public final void y(long j12) {
        this.f399684b.y(j12);
    }
}
