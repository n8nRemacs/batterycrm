package io.ktor.websocket;

import io.ktor.utils.io.InterfaceC41649d1;
import io.ktor.utils.io.W0;
import io.ktor.websocket.AbstractC41723i;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.P0;
import kotlinx.coroutines.channels.C43108m;
import kotlinx.coroutines.channels.K0;
import kotlinx.coroutines.channels.M0;

/* compiled from: RawWebSocketJvm.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/websocket/z;", "Lio/ktor/websocket/Z;", "ktor-websockets"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: io.ktor.websocket.z, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41739z implements Z {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f401640g;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C43108m f401641b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final CoroutineContext f401642c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C41737x f401643d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final c0 f401644e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final V f401645f;

    static {
        kotlin.jvm.internal.Y y12 = new kotlin.jvm.internal.Y(C41739z.class, "maxFrameSize", "getMaxFrameSize()J", 0);
        n0 n0Var = m0.f406844a;
        f401640g = new kotlin.reflect.n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(C41739z.class, "masking", "getMasking()Z", 0, n0Var)};
    }

    public C41739z() {
        throw null;
    }

    public C41739z(W0 w02, InterfaceC41649d1 interfaceC41649d1, long j12, boolean z12, CoroutineContext coroutineContext, io.ktor.utils.io.pool.h hVar, int i12, C42822w c42822w) {
        long j13 = (i12 & 4) != 0 ? 2147483647L : j12;
        z12 = (i12 & 8) != 0 ? false : z12;
        io.ktor.utils.io.pool.h hVar2 = (i12 & 32) != 0 ? io.ktor.util.cio.b.f400431a : hVar;
        P0 p02 = new P0((N0) coroutineContext.get(N0.f410716u2));
        this.f401641b = kotlinx.coroutines.channels.A.a(0, null, null, 6);
        CoroutineContext coroutineContextPlus = coroutineContext.plus(p02).plus(new kotlinx.coroutines.S("raw-ws"));
        this.f401642c = coroutineContextPlus;
        kotlin.properties.c cVar = kotlin.properties.c.f406879a;
        this.f401643d = new C41737x(Long.valueOf(j13), this);
        new C41738y(Boolean.valueOf(z12), this);
        this.f401644e = new c0(interfaceC41649d1, coroutineContextPlus, z12, hVar2);
        this.f401645f = new V(w02, coroutineContextPlus, j13, hVar2);
        C43259k.d(this, null, null, new C41736w(this, null), 3);
        p02.q3();
    }

    @Override // io.ktor.websocket.Z
    @Y61.l
    public final Object B(@Y61.k AbstractC41723i.b bVar, @Y61.k Continuation continuation) {
        Object objSend = j().send(bVar, continuation);
        return objSend == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSend : G0.f406611a;
    }

    @Override // io.ktor.websocket.Z
    @Y61.k
    public final K0<AbstractC41723i> D() {
        return this.f401641b;
    }

    @Override // io.ktor.websocket.Z
    @Y61.l
    public final Object G(@Y61.k Continuation<? super G0> continuation) {
        Object objG = this.f401644e.G(continuation);
        return objG == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objG : G0.f406611a;
    }

    @Override // kotlinx.coroutines.T
    @Y61.k
    /* renamed from: getCoroutineContext, reason: from getter */
    public final CoroutineContext getF401642c() {
        return this.f401642c;
    }

    @Override // io.ktor.websocket.Z
    @Y61.k
    public final M0<AbstractC41723i> j() {
        return this.f401644e.f401498f;
    }

    @Override // io.ktor.websocket.Z
    public final long p() {
        return this.f401643d.getValue(this, f401640g[0]).longValue();
    }

    @Override // io.ktor.websocket.Z
    public final void y(long j12) {
        this.f401643d.setValue(this, f401640g[0], Long.valueOf(j12));
    }
}
