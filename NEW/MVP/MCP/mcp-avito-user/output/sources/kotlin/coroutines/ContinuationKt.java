package kotlin.coroutines;

import Y41.l;
import Y41.p;
import Y61.k;
import kotlin.G;
import kotlin.G0;
import kotlin.InterfaceC42733c0;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.internal.f;

/* compiled from: Continuation.kt */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a(\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0087\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a(\u0010\b\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0087\b¢\u0006\u0004\b\b\u0010\t\u001aC\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u000b\u001a\u00020\n2\u001a\b\u0004\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0004\u0012\u00020\u00030\fH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001aC\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0001\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00110\f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a\\\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0001\"\u0004\b\u0000\u0010\u0015\"\u0004\b\u0001\u0010\u0000*#\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0016¢\u0006\u0002\b\u00172\u0006\u0010\u0018\u001a\u00028\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001H\u0007¢\u0006\u0004\b\u0013\u0010\u0019\u001a=\u0010\u001a\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00110\f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001aV\u0010\u001a\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0015\"\u0004\b\u0001\u0010\u0000*#\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0016¢\u0006\u0002\b\u00172\u0006\u0010\u0018\u001a\u00028\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001H\u0007¢\u0006\u0004\b\u001a\u0010\u001c\u001a?\u0010\u001e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u001a\b\u0004\u0010\u001d\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0001\u0012\u0004\u0012\u00020\u00030\fH\u0087H\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u001e\u0010\u001f\"\u001b\u0010$\u001a\u00020\n8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006%"}, d2 = {"T", "Lkotlin/coroutines/Continuation;", "value", "Lkotlin/G0;", "resume", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)V", "", "exception", "resumeWithException", "(Lkotlin/coroutines/Continuation;Ljava/lang/Throwable;)V", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlin/Function1;", "Lkotlin/Z;", "resumeWith", "Continuation", "(Lkotlin/coroutines/CoroutineContext;LY41/l;)Lkotlin/coroutines/Continuation;", "", "completion", "createCoroutine", "(LY41/l;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "R", "Lkotlin/Function2;", "Lkotlin/w;", "receiver", "(LY41/p;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "startCoroutine", "(LY41/l;Lkotlin/coroutines/Continuation;)V", "(LY41/p;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V", "block", "suspendCoroutine", "(LY41/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext$annotations", "()V", "coroutineContext", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ContinuationKt {
    @InterfaceC42733c0
    @f
    private static final <T> Continuation<T> Continuation(final CoroutineContext coroutineContext, final l<? super Z<? extends T>, G0> lVar) {
        return new Continuation<T>() { // from class: kotlin.coroutines.ContinuationKt.Continuation.1
            @Override // kotlin.coroutines.Continuation
            /* renamed from: getContext, reason: from getter */
            public CoroutineContext getF410748d() {
                return coroutineContext;
            }

            @Override // kotlin.coroutines.Continuation
            public void resumeWith(Object result) {
                lVar.invoke(Z.a(result));
            }
        };
    }

    @InterfaceC42733c0
    @k
    public static final <T> Continuation<G0> createCoroutine(@k l<? super Continuation<? super T>, ? extends Object> lVar, @k Continuation<? super T> continuation) {
        return new SafeContinuation(IntrinsicsKt.intercepted(IntrinsicsKt.createCoroutineUnintercepted(lVar, continuation)), IntrinsicsKt.getCOROUTINE_SUSPENDED());
    }

    private static final CoroutineContext getCoroutineContext() {
        throw new G("Implemented as intrinsic");
    }

    @InterfaceC42733c0
    @f
    private static final <T> void resume(Continuation<? super T> continuation, T t12) {
        int i12 = Z.f406624c;
        continuation.resumeWith(t12);
    }

    @InterfaceC42733c0
    @f
    private static final <T> void resumeWithException(Continuation<? super T> continuation, Throwable th2) {
        int i12 = Z.f406624c;
        continuation.resumeWith(new Z.b(th2));
    }

    @InterfaceC42733c0
    public static final <T> void startCoroutine(@k l<? super Continuation<? super T>, ? extends Object> lVar, @k Continuation<? super T> continuation) {
        Continuation continuationIntercepted = IntrinsicsKt.intercepted(IntrinsicsKt.createCoroutineUnintercepted(lVar, continuation));
        int i12 = Z.f406624c;
        continuationIntercepted.resumeWith(G0.f406611a);
    }

    @InterfaceC42733c0
    @f
    private static final <T> Object suspendCoroutine(l<? super Continuation<? super T>, G0> lVar, Continuation<? super T> continuation) throws Throwable {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        lVar.invoke(safeContinuation);
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    @InterfaceC42733c0
    @k
    public static final <R, T> Continuation<G0> createCoroutine(@k p<? super R, ? super Continuation<? super T>, ? extends Object> pVar, R r12, @k Continuation<? super T> continuation) {
        return new SafeContinuation(IntrinsicsKt.intercepted(IntrinsicsKt.createCoroutineUnintercepted(pVar, r12, continuation)), IntrinsicsKt.getCOROUTINE_SUSPENDED());
    }

    @InterfaceC42733c0
    public static final <R, T> void startCoroutine(@k p<? super R, ? super Continuation<? super T>, ? extends Object> pVar, R r12, @k Continuation<? super T> continuation) {
        Continuation continuationIntercepted = IntrinsicsKt.intercepted(IntrinsicsKt.createCoroutineUnintercepted(pVar, r12, continuation));
        int i12 = Z.f406624c;
        continuationIntercepted.resumeWith(G0.f406611a);
    }

    @InterfaceC42733c0
    @f
    public static /* synthetic */ void getCoroutineContext$annotations() {
    }
}
