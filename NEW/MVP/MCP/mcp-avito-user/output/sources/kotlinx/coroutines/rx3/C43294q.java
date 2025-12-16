package kotlinx.coroutines.rx3;

import java.util.concurrent.CancellationException;
import kotlin.C42833p;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import s41.C47998a;

/* compiled from: RxCancellable.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-rx3"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.rx3.q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43294q {
    public static final void a(@Y61.k CoroutineContext coroutineContext, @Y61.k Throwable th2) {
        if (th2 instanceof CancellationException) {
            return;
        }
        try {
            C47998a.b(th2);
        } catch (Throwable th3) {
            C42833p.a(th2, th3);
            kotlinx.coroutines.P.a(coroutineContext, th2);
        }
    }
}
