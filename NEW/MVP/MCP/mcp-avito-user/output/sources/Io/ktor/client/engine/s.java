package io.ktor.client.engine;

import io.ktor.client.request.l0;
import io.ktor.util.InterfaceC41603j0;
import java.util.Set;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.Q0;

/* compiled from: HttpClientJvmEngine.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/client/engine/s;", "Lio/ktor/client/engine/a;", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes8.dex */
public abstract class s implements InterfaceC41434a {
    @Override // io.ktor.client.engine.InterfaceC41434a
    @InterfaceC41603j0
    public final void G1(@Y61.k io.ktor.client.a aVar) {
        l0.f399764g.getClass();
        aVar.f398781h.g(l0.f399768k, new d(aVar, this, null));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((kotlinx.coroutines.C) Q0.f(null)).q3();
    }

    @Override // kotlinx.coroutines.T
    @Y61.k
    /* renamed from: getCoroutineContext */
    public final CoroutineContext getF401596i() {
        throw null;
    }

    @Override // io.ktor.client.engine.InterfaceC41434a
    @Y61.k
    public final Set<h<?>> m4() {
        return B0.f406639b;
    }
}
