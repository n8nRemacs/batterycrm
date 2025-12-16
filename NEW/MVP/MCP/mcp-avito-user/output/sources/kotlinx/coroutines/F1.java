package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;

/* compiled from: CoroutineContext.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002R\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/F1;", "T", "Lkotlinx/coroutines/internal/W;", "", "threadLocalIsSet", "Z", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class F1<T> extends kotlinx.coroutines.internal.W<T> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ThreadLocal<kotlin.Q<CoroutineContext, Object>> f410696f;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public F1(@Y61.k Continuation continuation, @Y61.k CoroutineContext coroutineContext) {
        G1 g12 = G1.f410698b;
        super(continuation, coroutineContext.get(g12) == null ? coroutineContext.plus(g12) : coroutineContext);
        this.f410696f = new ThreadLocal<>();
        if (continuation.getF411447c().get(ContinuationInterceptor.INSTANCE) instanceof M) {
            return;
        }
        Object objB = kotlinx.coroutines.internal.g0.b(coroutineContext, null);
        kotlinx.coroutines.internal.g0.a(coroutineContext, objB);
        G0(coroutineContext, objB);
    }

    public final boolean F0() {
        boolean z12 = this.threadLocalIsSet && this.f410696f.get() == null;
        this.f410696f.remove();
        return !z12;
    }

    public final void G0(@Y61.k CoroutineContext coroutineContext, @Y61.l Object obj) {
        this.threadLocalIsSet = true;
        this.f410696f.set(new kotlin.Q<>(coroutineContext, obj));
    }

    @Override // kotlinx.coroutines.internal.W, kotlinx.coroutines.V0
    public final void S(@Y61.l Object obj) {
        if (this.threadLocalIsSet) {
            kotlin.Q<CoroutineContext, Object> q12 = this.f410696f.get();
            if (q12 != null) {
                kotlinx.coroutines.internal.g0.a(q12.f406619b, q12.f406620c);
            }
            this.f410696f.remove();
        }
        Object objA = H.a(obj);
        Continuation<T> continuation = this.f411885e;
        CoroutineContext f401105b = continuation.getF411447c();
        Object objB = kotlinx.coroutines.internal.g0.b(f401105b, null);
        F1<?> f1D = objB != kotlinx.coroutines.internal.g0.f411898a ? K.d(continuation, f401105b, objB) : null;
        try {
            this.f411885e.resumeWith(objA);
            kotlin.G0 g02 = kotlin.G0.f406611a;
        } finally {
            if (f1D == null || f1D.F0()) {
                kotlinx.coroutines.internal.g0.a(f401105b, objB);
            }
        }
    }
}
