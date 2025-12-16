package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlinx.coroutines.AbstractC43075a;

/* compiled from: Scopes.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/internal/W;", "T", "Lkotlinx/coroutines/a;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public class W<T> extends AbstractC43075a<T> implements CoroutineStackFrame {

    /* renamed from: e, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final Continuation<T> f411885e;

    public W(@Y61.k Continuation continuation, @Y61.k CoroutineContext coroutineContext) {
        super(coroutineContext, true, true);
        this.f411885e = continuation;
    }

    @Override // kotlinx.coroutines.V0
    public void K(@Y61.l Object obj) {
        C43243m.a(kotlinx.coroutines.H.a(obj), IntrinsicsKt.intercepted(this.f411885e));
    }

    @Override // kotlinx.coroutines.V0
    public void S(@Y61.l Object obj) {
        this.f411885e.resumeWith(kotlinx.coroutines.H.a(obj));
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Y61.l
    public final CoroutineStackFrame getCallerFrame() {
        Continuation<T> continuation = this.f411885e;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Y61.l
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlinx.coroutines.V0
    public final boolean o0() {
        return true;
    }
}
