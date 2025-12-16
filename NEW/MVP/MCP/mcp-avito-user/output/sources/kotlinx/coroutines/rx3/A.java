package kotlinx.coroutines.rx3;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: RxConvert.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "kotlinx.coroutines.rx3.RxConvertKt$asObservable$1$job$1", f = "RxConvert.kt", i = {0}, l = {110}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
/* loaded from: classes8.dex */
final class A extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f412037q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f412038r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i<Object> f412039s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ io.reactivex.rxjava3.core.B<Object> f412040t;

    /* compiled from: RxConvert.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ io.reactivex.rxjava3.core.B<T> f412041b;

        public a(io.reactivex.rxjava3.core.B<T> b12) {
            this.f412041b = b12;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        public final Object emit(@Y61.k T t12, @Y61.k Continuation<? super G0> continuation) {
            this.f412041b.onNext(t12);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(InterfaceC43160i<Object> interfaceC43160i, io.reactivex.rxjava3.core.B<Object> b12, Continuation<? super A> continuation) {
        super(2, continuation);
        this.f412039s = interfaceC43160i;
        this.f412040t = b12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        A a12 = new A(this.f412039s, this.f412040t, continuation);
        a12.f412038r = obj;
        return a12;
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((A) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f412037q
            io.reactivex.rxjava3.core.B<java.lang.Object> r2 = r6.f412040t
            r3 = 1
            if (r1 == 0) goto L1f
            if (r1 != r3) goto L17
            java.lang.Object r0 = r6.f412038r
            kotlinx.coroutines.T r0 = (kotlinx.coroutines.T) r0
            kotlin.C42729a0.b(r7)     // Catch: java.lang.Throwable -> L15
            goto L39
        L15:
            r7 = move-exception
            goto L41
        L17:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1f:
            kotlin.C42729a0.b(r7)
            java.lang.Object r7 = r6.f412038r
            kotlinx.coroutines.T r7 = (kotlinx.coroutines.T) r7
            kotlinx.coroutines.flow.i<java.lang.Object> r1 = r6.f412039s     // Catch: java.lang.Throwable -> L3d
            kotlinx.coroutines.rx3.A$a r4 = new kotlinx.coroutines.rx3.A$a     // Catch: java.lang.Throwable -> L3d
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L3d
            r6.f412038r = r7     // Catch: java.lang.Throwable -> L3d
            r6.f412037q = r3     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r1 = r1.collect(r4, r6)     // Catch: java.lang.Throwable -> L3d
            if (r1 != r0) goto L38
            return r0
        L38:
            r0 = r7
        L39:
            r2.e()     // Catch: java.lang.Throwable -> L15
            goto L56
        L3d:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        L41:
            boolean r1 = r7 instanceof java.util.concurrent.CancellationException
            if (r1 != 0) goto L53
            boolean r1 = r2.g(r7)
            if (r1 != 0) goto L56
            kotlin.coroutines.CoroutineContext r0 = r0.getF398924i()
            kotlinx.coroutines.rx3.C43294q.a(r0, r7)
            goto L56
        L53:
            r2.e()
        L56:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.rx3.A.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
