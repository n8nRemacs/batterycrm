package kotlinx.coroutines.future;

import Y61.l;
import java.util.concurrent.CompletionException;
import java.util.function.BiFunction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.Continuation;

/* compiled from: Future.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0018\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0002R\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/future/b;", "T", "Ljava/util/function/BiFunction;", "", "Lkotlin/G0;", "Lkotlin/coroutines/Continuation;", "cont", "Lkotlin/coroutines/Continuation;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class b<T> implements BiFunction<T, Throwable, G0> {

    @X41.f
    @l
    public volatile Continuation<? super T> cont;

    @Override // java.util.function.BiFunction
    public final G0 apply(Object obj, Throwable th2) {
        Throwable cause;
        Throwable th3 = th2;
        Continuation<? super T> continuation = this.cont;
        if (continuation != null) {
            if (th3 == null) {
                int i12 = Z.f406624c;
                continuation.resumeWith(obj);
            } else {
                CompletionException completionException = th3 instanceof CompletionException ? (CompletionException) th3 : null;
                if (completionException != null && (cause = completionException.getCause()) != null) {
                    th3 = cause;
                }
                int i13 = Z.f406624c;
                continuation.resumeWith(new Z.b(th3));
            }
        }
        return G0.f406611a;
    }
}
