package kotlin;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;

/* compiled from: DeepRecursive.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/l;", "T", "R", "Lkotlin/j;", "Lkotlin/coroutines/Continuation;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C42828l<T, R> extends AbstractC42799j<T, R> implements Continuation<R> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public Y41.q<? super AbstractC42799j<?, ?>, Object, ? super Continuation<Object>, ? extends Object> f406867b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public G0 f406868c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Continuation<Object> f406869d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public Object f406870e;

    public C42828l() {
        throw null;
    }

    @Override // kotlin.AbstractC42799j
    @Y61.l
    public final Object a(G0 g02, @Y61.k Continuation continuation) {
        this.f406869d = continuation;
        this.f406868c = g02;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (coroutine_suspended == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return coroutine_suspended;
    }

    @Override // kotlin.coroutines.Continuation
    @Y61.k
    /* renamed from: getContext */
    public final CoroutineContext getF411960f() {
        return EmptyCoroutineContext.INSTANCE;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(@Y61.k Object obj) {
        this.f406869d = null;
        this.f406870e = obj;
    }
}
