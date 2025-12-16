package kotlinx.coroutines.future;

import Y41.p;
import java.util.concurrent.CompletionException;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.P;

/* compiled from: Future.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u00032\u000e\u0010\u0004\u001a\n \u0002*\u0004\u0018\u0001H\u0003H\u00032\u000e\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "T", "value", "exception", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Throwable;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class e extends N implements p<Object, Throwable, Object> {
    @Override // Y41.p
    public final Object invoke(Object obj, Throwable th2) {
        Throwable th3 = th2;
        try {
            if (th3 == null) {
                throw null;
            }
            CompletionException completionException = th3 instanceof CompletionException ? (CompletionException) th3 : null;
            if (completionException == null) {
                throw null;
            }
            completionException.getCause();
            throw null;
        } catch (Throwable th4) {
            P.a(EmptyCoroutineContext.INSTANCE, th4);
            return G0.f406611a;
        }
    }
}
