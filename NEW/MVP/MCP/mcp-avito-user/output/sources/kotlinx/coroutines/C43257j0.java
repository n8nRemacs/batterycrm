package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.C43242l;

/* compiled from: DispatchedTask.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.j0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43257j0 {
    public static final boolean a(int i12) {
        return i12 == 1 || i12 == 2;
    }

    public static final void b(@Y61.k r rVar, @Y61.k Continuation continuation, boolean z12) {
        Object objE;
        Object obj = r.f411957h.get(rVar);
        Throwable thD = rVar.d(obj);
        if (thD != null) {
            int i12 = kotlin.Z.f406624c;
            objE = new Z.b(thD);
        } else {
            int i13 = kotlin.Z.f406624c;
            objE = rVar.e(obj);
        }
        if (!z12) {
            continuation.resumeWith(objE);
            return;
        }
        C43242l c43242l = (C43242l) continuation;
        Continuation<T> continuation2 = c43242l.f411915f;
        CoroutineContext coroutineContext = continuation2.getF411447c();
        Object objB = kotlinx.coroutines.internal.g0.b(coroutineContext, c43242l.f411917h);
        F1<?> f1D = objB != kotlinx.coroutines.internal.g0.f411898a ? K.d(continuation2, coroutineContext, objB) : null;
        try {
            continuation2.resumeWith(objE);
            kotlin.G0 g02 = kotlin.G0.f406611a;
        } finally {
            if (f1D == null || f1D.F0()) {
                kotlinx.coroutines.internal.g0.a(coroutineContext, objB);
            }
        }
    }
}
