package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Interruptible.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/T;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "kotlinx.coroutines.InterruptibleKt$runInterruptible$2", f = "Interruptible.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class J0 extends SuspendLambda implements Y41.p<T, Continuation<Object>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f410702q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.N f410703r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public J0(Y41.a<Object> aVar, Continuation<? super J0> continuation) {
        super(2, continuation);
        this.f410703r = (kotlin.jvm.internal.N) aVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        J0 j02 = new J0(this.f410703r, continuation);
        j02.f410702q = obj;
        return j02;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<Object> continuation) {
        return ((J0) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        return r0.invoke();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
    
        r8.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        throw r12;
     */
    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            kotlin.C42729a0.b(r12)
            java.lang.Object r12 = r11.f410702q
            kotlinx.coroutines.T r12 = (kotlinx.coroutines.T) r12
            kotlin.coroutines.CoroutineContext r12 = r12.getF115043e()
            kotlin.jvm.internal.N r0 = r11.f410703r
            kotlinx.coroutines.A1 r8 = new kotlinx.coroutines.A1     // Catch: java.lang.InterruptedException -> L5d
            kotlinx.coroutines.N0 r12 = kotlinx.coroutines.Q0.f(r12)     // Catch: java.lang.InterruptedException -> L5d
            r8.<init>(r12)     // Catch: java.lang.InterruptedException -> L5d
            boolean r1 = r12 instanceof kotlinx.coroutines.V0     // Catch: java.lang.InterruptedException -> L5d
            r9 = 1
            if (r1 == 0) goto L25
            kotlinx.coroutines.V0 r12 = (kotlinx.coroutines.V0) r12     // Catch: java.lang.InterruptedException -> L5d
            kotlinx.coroutines.o0 r12 = r12.n0(r9, r9, r8)     // Catch: java.lang.InterruptedException -> L5d
            goto L38
        L25:
            kotlinx.coroutines.S0 r10 = new kotlinx.coroutines.S0     // Catch: java.lang.InterruptedException -> L5d
            java.lang.String r6 = "invoke(Ljava/lang/Throwable;)V"
            java.lang.Class<kotlinx.coroutines.H0> r4 = kotlinx.coroutines.H0.class
            java.lang.String r5 = "invoke"
            r7 = 0
            r2 = 1
            r1 = r10
            r3 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.InterruptedException -> L5d
            kotlinx.coroutines.o0 r12 = r12.Q(r9, r9, r10)     // Catch: java.lang.InterruptedException -> L5d
        L38:
            r8.f410674d = r12     // Catch: java.lang.InterruptedException -> L5d
        L3a:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r12 = kotlinx.coroutines.A1.f410671e     // Catch: java.lang.InterruptedException -> L5d
            int r1 = r12.get(r8)     // Catch: java.lang.InterruptedException -> L5d
            if (r1 == 0) goto L4e
            r12 = 2
            if (r1 == r12) goto L55
            r12 = 3
            if (r1 != r12) goto L49
            goto L55
        L49:
            kotlinx.coroutines.A1.c(r1)     // Catch: java.lang.InterruptedException -> L5d
            r12 = 0
            throw r12     // Catch: java.lang.InterruptedException -> L5d
        L4e:
            r2 = 0
            boolean r12 = r12.compareAndSet(r8, r1, r2)     // Catch: java.lang.InterruptedException -> L5d
            if (r12 == 0) goto L3a
        L55:
            java.lang.Object r12 = r0.invoke()     // Catch: java.lang.Throwable -> L5f
            r8.b()     // Catch: java.lang.InterruptedException -> L5d
            return r12
        L5d:
            r12 = move-exception
            goto L64
        L5f:
            r12 = move-exception
            r8.b()     // Catch: java.lang.InterruptedException -> L5d
            throw r12     // Catch: java.lang.InterruptedException -> L5d
        L64:
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            java.lang.String r1 = "Blocking call was interrupted due to parent cancellation"
            r0.<init>(r1)
            java.lang.Throwable r12 = r0.initCause(r12)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.J0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
