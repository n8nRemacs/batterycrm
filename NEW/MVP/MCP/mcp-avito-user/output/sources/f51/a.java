package F51;

import Y41.p;
import Y61.k;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.AbstractC43075a;
import kotlinx.coroutines.internal.C43243m;

/* compiled from: Cancellable.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class a {
    public static final void a(@k Continuation continuation, @k AbstractC43075a abstractC43075a) {
        try {
            Continuation continuationIntercepted = IntrinsicsKt.intercepted(continuation);
            int i12 = Z.f406624c;
            C43243m.a(G0.f406611a, continuationIntercepted);
        } catch (Throwable th2) {
            int i13 = Z.f406624c;
            abstractC43075a.resumeWith(new Z.b(th2));
            throw th2;
        }
    }

    public static void b(p pVar, AbstractC43075a abstractC43075a, AbstractC43075a abstractC43075a2) {
        try {
            Continuation continuationIntercepted = IntrinsicsKt.intercepted(IntrinsicsKt.createCoroutineUnintercepted(pVar, abstractC43075a, abstractC43075a2));
            int i12 = Z.f406624c;
            C43243m.a(G0.f406611a, continuationIntercepted);
        } catch (Throwable th2) {
            int i13 = Z.f406624c;
            abstractC43075a2.resumeWith(new Z.b(th2));
            throw th2;
        }
    }
}
