package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlinx.coroutines.internal.C43242l;
import kotlinx.coroutines.internal.C43243m;

/* compiled from: JobSupport.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/v;", "Lkotlinx/coroutines/O0;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.X
/* renamed from: kotlinx.coroutines.v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43306v extends O0 {

    /* renamed from: f, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final r<?> f412298f;

    public C43306v(@Y61.k r<?> rVar) {
        this.f412298f = rVar;
    }

    @Override // kotlinx.coroutines.H0
    public final void a(@Y61.l Throwable th2) {
        V0 v02 = this.f410722e;
        if (v02 == null) {
            v02 = null;
        }
        r<?> rVar = this.f412298f;
        Throwable thN = rVar.n(v02);
        if (rVar.w()) {
            C43242l c43242l = (C43242l) rVar.f411959e;
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C43242l.f411913i;
                Object obj = atomicReferenceFieldUpdater.get(c43242l);
                kotlinx.coroutines.internal.a0 a0Var = C43243m.f411919b;
                if (!kotlin.jvm.internal.L.f(obj, a0Var)) {
                    if (!(obj instanceof Throwable)) {
                        while (!atomicReferenceFieldUpdater.compareAndSet(c43242l, obj, null)) {
                            if (atomicReferenceFieldUpdater.get(c43242l) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    return;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(c43242l, a0Var, thN)) {
                    if (atomicReferenceFieldUpdater.get(c43242l) != a0Var) {
                        break;
                    }
                }
                return;
            }
        }
        rVar.f(thN);
        if (rVar.w()) {
            return;
        }
        rVar.l();
    }
}
