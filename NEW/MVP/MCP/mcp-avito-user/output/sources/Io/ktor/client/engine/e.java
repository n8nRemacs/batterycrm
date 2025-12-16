package io.ktor.client.engine;

import com.avito.android.remote.model.AdvertStatus;
import io.ktor.client.request.l0;
import io.ktor.util.InterfaceC41603j0;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.S;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.t1;

/* compiled from: HttpClientEngineBase.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/client/engine/e;", "Lio/ktor/client/engine/a;", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class e implements InterfaceC41434a {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f398900e = AtomicIntegerFieldUpdater.newUpdater(e.class, AdvertStatus.CLOSED);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f398901b;

    @Y61.k
    private volatile /* synthetic */ int closed = 0;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final kotlinx.coroutines.scheduling.b f398902c = C43262l0.f411947c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f398903d = C42727D.c(new a());

    /* compiled from: HttpClientEngineBase.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lkotlin/coroutines/CoroutineContext;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a extends N implements Y41.a<CoroutineContext> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final CoroutineContext invoke() {
            CoroutineContext coroutineContextPlus = CoroutineContext.Element.DefaultImpls.plus((V0) t1.a(null), new io.ktor.util.B(kotlinx.coroutines.N.f410714t2));
            e eVar = e.this;
            return coroutineContextPlus.plus(eVar.f398902c).plus(new S(eVar.f398901b.concat("-context")));
        }
    }

    public e(@Y61.k String str) {
        this.f398901b = str;
    }

    @Override // io.ktor.client.engine.InterfaceC41434a
    @InterfaceC41603j0
    public final void G1(@Y61.k io.ktor.client.a aVar) {
        l0.f399764g.getClass();
        aVar.f398781h.g(l0.f399768k, new d(aVar, this, null));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (f398900e.compareAndSet(this, 0, 1)) {
            CoroutineContext.Element element = getF401596i().get(N0.f410716u2);
            kotlinx.coroutines.C c12 = element instanceof kotlinx.coroutines.C ? (kotlinx.coroutines.C) element : null;
            if (c12 == null) {
                return;
            }
            c12.q3();
        }
    }

    @Override // kotlinx.coroutines.T
    @Y61.k
    /* renamed from: getCoroutineContext */
    public CoroutineContext getF401596i() {
        return (CoroutineContext) this.f398903d.getValue();
    }

    @Override // io.ktor.client.engine.InterfaceC41434a
    @Y61.k
    public Set<h<?>> m4() {
        return B0.f406639b;
    }
}
