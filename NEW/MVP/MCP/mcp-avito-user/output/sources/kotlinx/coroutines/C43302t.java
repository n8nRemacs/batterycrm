package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.C43242l;
import kotlinx.coroutines.internal.C43243m;

/* compiled from: CancellableContinuation.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43302t {
    @I0
    public static final void a(@Y61.k r rVar, @Y61.k InterfaceC43268o0 interfaceC43268o0) {
        rVar.s(new C43270p0(interfaceC43268o0));
    }

    @Y61.k
    public static final <T> r<T> b(@Y61.k Continuation<? super T> continuation) {
        r<T> rVar;
        r<T> rVar2;
        if (!(continuation instanceof C43242l)) {
            return new r<>(1, continuation);
        }
        C43242l c43242l = (C43242l) continuation;
        c43242l.getClass();
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C43242l.f411913i;
            Object obj = atomicReferenceFieldUpdater.get(c43242l);
            kotlinx.coroutines.internal.a0 a0Var = C43243m.f411919b;
            rVar = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(c43242l, a0Var);
                rVar2 = null;
                break;
            }
            if (obj instanceof r) {
                while (!atomicReferenceFieldUpdater.compareAndSet(c43242l, obj, a0Var)) {
                    if (atomicReferenceFieldUpdater.get(c43242l) != obj) {
                        break;
                    }
                }
                rVar2 = (r) obj;
                break loop0;
            }
            if (obj != a0Var && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (rVar2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = r.f411957h;
            Object obj2 = atomicReferenceFieldUpdater2.get(rVar2);
            if (!(obj2 instanceof D) || ((D) obj2).f410689d == null) {
                r.f411956g.set(rVar2, 536870911);
                atomicReferenceFieldUpdater2.set(rVar2, C43127d.f411043b);
                rVar = rVar2;
            } else {
                rVar2.l();
            }
            if (rVar != null) {
                return rVar;
            }
        }
        return new r<>(2, continuation);
    }
}
