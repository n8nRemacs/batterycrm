package kotlin.coroutines.intrinsics;

import Y41.l;
import Y41.p;
import Y41.q;
import Y61.k;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42733c0;
import kotlin.Metadata;
import kotlin.X;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;
import kotlin.internal.f;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.v0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: IntrinsicsJvm.kt */
@s0
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u001a@\u0010\u0005\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0087\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a?\u0010\u0007\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0001¢\u0006\u0004\b\u0007\u0010\u0006\u001aY\u0010\u0005\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u0000*#\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t¢\u0006\u0002\b\n2\u0006\u0010\u000b\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u0087\b¢\u0006\u0004\b\u0005\u0010\f\u001aX\u0010\u0007\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u0000*#\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t¢\u0006\u0002\b\n2\u0006\u0010\u000b\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u0001¢\u0006\u0004\b\u0007\u0010\f\u001am\u0010\u0005\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\r\"\u0004\b\u0002\u0010\u0000*)\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000e¢\u0006\u0002\b\n2\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00020\u0002H\u0081\b¢\u0006\u0004\b\u0005\u0010\u0010\u001al\u0010\u0007\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\r\"\u0004\b\u0002\u0010\u0000*)\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000e¢\u0006\u0002\b\n2\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00020\u0002H\u0001¢\u0006\u0004\b\u0007\u0010\u0010\u001aC\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0002\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a\\\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0002\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u0000*#\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t¢\u0006\u0002\b\n2\u0006\u0010\u000b\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u0007¢\u0006\u0004\b\u0012\u0010\u0014\u001a%\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001aH\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u0002\"\u0004\b\u0000\u0010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u001c\b\u0004\u0010\u0017\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001H\u0083\b¢\u0006\u0004\b\u0018\u0010\u0019\u001a)\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¢\u0006\u0004\b\u001b\u0010\u0016¨\u0006\u001d"}, d2 = {"T", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "completion", "startCoroutineUninterceptedOrReturn", "(LY41/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "wrapWithContinuationImpl", "R", "Lkotlin/Function2;", "Lkotlin/w;", "receiver", "(LY41/p;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "P", "Lkotlin/Function3;", "param", "(LY41/q;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/G0;", "createCoroutineUnintercepted", "(LY41/l;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "(LY41/p;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "intercepted", "(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "block", "createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt", "(Lkotlin/coroutines/Continuation;LY41/l;)Lkotlin/coroutines/Continuation;", "createCoroutineFromSuspendFunction", "createSimpleCoroutineForSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt", "createSimpleCoroutineForSuspendFunction", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/coroutines/intrinsics/IntrinsicsKt")
/* loaded from: classes8.dex */
public class IntrinsicsKt__IntrinsicsJvmKt {
    @InterfaceC42733c0
    private static final <T> Continuation<G0> createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt(final Continuation<? super T> continuation, final l<? super Continuation<? super T>, ? extends Object> lVar) {
        final CoroutineContext f411960f = continuation.getF411960f();
        return f411960f == EmptyCoroutineContext.INSTANCE ? new RestrictedContinuationImpl(continuation) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1
            private int label;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public Object invokeSuspend(Object result) {
                int i12 = this.label;
                if (i12 == 0) {
                    this.label = 1;
                    C42729a0.b(result);
                    return lVar.invoke(this);
                }
                if (i12 != 1) {
                    throw new IllegalStateException("This coroutine had already completed");
                }
                this.label = 2;
                C42729a0.b(result);
                return result;
            }
        } : new ContinuationImpl(continuation, f411960f) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2
            private int label;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public Object invokeSuspend(Object result) {
                int i12 = this.label;
                if (i12 == 0) {
                    this.label = 1;
                    C42729a0.b(result);
                    return lVar.invoke(this);
                }
                if (i12 != 1) {
                    throw new IllegalStateException("This coroutine had already completed");
                }
                this.label = 2;
                C42729a0.b(result);
                return result;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC42733c0
    @k
    public static <T> Continuation<G0> createCoroutineUnintercepted(@k final l<? super Continuation<? super T>, ? extends Object> lVar, @k Continuation<? super T> continuation) {
        final Continuation<?> continuationProbeCoroutineCreated = DebugProbesKt.probeCoroutineCreated(continuation);
        if (lVar instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) lVar).create(continuationProbeCoroutineCreated);
        }
        final CoroutineContext f411960f = continuationProbeCoroutineCreated.getF411960f();
        return f411960f == EmptyCoroutineContext.INSTANCE ? new RestrictedContinuationImpl(continuationProbeCoroutineCreated) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$1
            private int label;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public Object invokeSuspend(Object result) {
                int i12 = this.label;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("This coroutine had already completed");
                    }
                    this.label = 2;
                    C42729a0.b(result);
                    return result;
                }
                this.label = 1;
                C42729a0.b(result);
                l lVar2 = lVar;
                v0.e(1, lVar2);
                return lVar2.invoke(this);
            }
        } : new ContinuationImpl(continuationProbeCoroutineCreated, f411960f) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$2
            private int label;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public Object invokeSuspend(Object result) {
                int i12 = this.label;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("This coroutine had already completed");
                    }
                    this.label = 2;
                    C42729a0.b(result);
                    return result;
                }
                this.label = 1;
                C42729a0.b(result);
                l lVar2 = lVar;
                v0.e(1, lVar2);
                return lVar2.invoke(this);
            }
        };
    }

    private static final <T> Continuation<T> createSimpleCoroutineForSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt(final Continuation<? super T> continuation) {
        final CoroutineContext f411960f = continuation.getF411960f();
        return f411960f == EmptyCoroutineContext.INSTANCE ? new RestrictedContinuationImpl(continuation) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public Object invokeSuspend(Object result) {
                C42729a0.b(result);
                return result;
            }
        } : new ContinuationImpl(continuation, f411960f) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$2
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public Object invokeSuspend(Object result) {
                C42729a0.b(result);
                return result;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC42733c0
    @k
    public static <T> Continuation<T> intercepted(@k Continuation<? super T> continuation) {
        Continuation<T> continuation2;
        ContinuationImpl continuationImpl = continuation instanceof ContinuationImpl ? (ContinuationImpl) continuation : null;
        return (continuationImpl == null || (continuation2 = (Continuation<T>) continuationImpl.intercepted()) == null) ? continuation : continuation2;
    }

    @InterfaceC42733c0
    @f
    private static final <T> Object startCoroutineUninterceptedOrReturn(l<? super Continuation<? super T>, ? extends Object> lVar, Continuation<? super T> continuation) {
        if (!(lVar instanceof BaseContinuationImpl)) {
            return wrapWithContinuationImpl(lVar, continuation);
        }
        v0.e(1, lVar);
        return lVar.invoke(continuation);
    }

    @Y61.l
    @X
    public static final <T> Object wrapWithContinuationImpl(@k l<? super Continuation<? super T>, ? extends Object> lVar, @k Continuation<? super T> continuation) {
        Continuation continuationCreateSimpleCoroutineForSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt = createSimpleCoroutineForSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt(DebugProbesKt.probeCoroutineCreated(continuation));
        v0.e(1, lVar);
        return lVar.invoke(continuationCreateSimpleCoroutineForSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC42733c0
    @f
    private static final <R, T> Object startCoroutineUninterceptedOrReturn(p<? super R, ? super Continuation<? super T>, ? extends Object> pVar, R r12, Continuation<? super T> continuation) {
        if (!(pVar instanceof BaseContinuationImpl)) {
            return wrapWithContinuationImpl(pVar, r12, continuation);
        }
        v0.e(2, pVar);
        return pVar.invoke(r12, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Y61.l
    @X
    public static <R, T> Object wrapWithContinuationImpl(@k p<? super R, ? super Continuation<? super T>, ? extends Object> pVar, R r12, @k Continuation<? super T> continuation) {
        Continuation continuationCreateSimpleCoroutineForSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt = createSimpleCoroutineForSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt(DebugProbesKt.probeCoroutineCreated(continuation));
        v0.e(2, pVar);
        return pVar.invoke(r12, continuationCreateSimpleCoroutineForSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @f
    private static final <R, P, T> Object startCoroutineUninterceptedOrReturn(q<? super R, ? super P, ? super Continuation<? super T>, ? extends Object> qVar, R r12, P p12, Continuation<? super T> continuation) {
        if (!(qVar instanceof BaseContinuationImpl)) {
            return wrapWithContinuationImpl(qVar, r12, p12, continuation);
        }
        v0.e(3, qVar);
        return qVar.invoke(r12, p12, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Y61.l
    @X
    public static <R, P, T> Object wrapWithContinuationImpl(@k q<? super R, ? super P, ? super Continuation<? super T>, ? extends Object> qVar, R r12, P p12, @k Continuation<? super T> continuation) {
        Continuation continuationCreateSimpleCoroutineForSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt = createSimpleCoroutineForSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt(DebugProbesKt.probeCoroutineCreated(continuation));
        v0.e(3, qVar);
        return qVar.invoke(r12, p12, continuationCreateSimpleCoroutineForSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC42733c0
    @k
    public static <R, T> Continuation<G0> createCoroutineUnintercepted(@k final p<? super R, ? super Continuation<? super T>, ? extends Object> pVar, final R r12, @k Continuation<? super T> continuation) {
        final Continuation<?> continuationProbeCoroutineCreated = DebugProbesKt.probeCoroutineCreated(continuation);
        if (pVar instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) pVar).create(r12, continuationProbeCoroutineCreated);
        }
        final CoroutineContext f411960f = continuationProbeCoroutineCreated.getF411960f();
        if (f411960f == EmptyCoroutineContext.INSTANCE) {
            return new RestrictedContinuationImpl(continuationProbeCoroutineCreated) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$3
                private int label;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public Object invokeSuspend(Object result) {
                    int i12 = this.label;
                    if (i12 != 0) {
                        if (i12 != 1) {
                            throw new IllegalStateException("This coroutine had already completed");
                        }
                        this.label = 2;
                        C42729a0.b(result);
                        return result;
                    }
                    this.label = 1;
                    C42729a0.b(result);
                    p pVar2 = pVar;
                    v0.e(2, pVar2);
                    return pVar2.invoke(r12, this);
                }
            };
        }
        return new ContinuationImpl(continuationProbeCoroutineCreated, f411960f) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$4
            private int label;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public Object invokeSuspend(Object result) {
                int i12 = this.label;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("This coroutine had already completed");
                    }
                    this.label = 2;
                    C42729a0.b(result);
                    return result;
                }
                this.label = 1;
                C42729a0.b(result);
                p pVar2 = pVar;
                v0.e(2, pVar2);
                return pVar2.invoke(r12, this);
            }
        };
    }
}
