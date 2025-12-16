package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;

/* compiled from: ChannelFlow.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/flow/internal/G;", "T", "Lkotlin/coroutines/Continuation;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class G<T> implements Continuation<T>, CoroutineStackFrame {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Continuation<T> f411446b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final CoroutineContext f411447c;

    /* JADX WARN: Multi-variable type inference failed */
    public G(@Y61.k Continuation<? super T> continuation, @Y61.k CoroutineContext coroutineContext) {
        this.f411446b = continuation;
        this.f411447c = coroutineContext;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Y61.l
    public final CoroutineStackFrame getCallerFrame() {
        Continuation<T> continuation = this.f411446b;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    @Y61.k
    /* renamed from: getContext, reason: from getter */
    public final CoroutineContext getF411447c() {
        return this.f411447c;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Y61.l
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(@Y61.k Object obj) {
        this.f411446b.resumeWith(obj);
    }
}
