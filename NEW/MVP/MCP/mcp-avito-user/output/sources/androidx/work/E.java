package androidx.work;

import com.google.common.util.concurrent.D0;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;

/* compiled from: ListenableFuture.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class E {
    public static D0 a(CoroutineContext coroutineContext, Y41.p pVar) {
        CoroutineStart coroutineStart = CoroutineStart.f410680b;
        return androidx.concurrent.futures.b.a(new B(coroutineContext, pVar));
    }
}
