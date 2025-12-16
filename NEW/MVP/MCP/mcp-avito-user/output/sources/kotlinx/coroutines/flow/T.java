package kotlinx.coroutines.flow;

import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.TimeoutCancellationException;

/* compiled from: Delay.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lkotlinx/coroutines/T;", "Lkotlinx/coroutines/flow/j;", "downStream", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1", f = "Delay.kt", i = {0, 0}, l = {416}, m = "invokeSuspend", n = {"downStream", "values"}, s = {"L$0", "L$1"})
/* loaded from: classes8.dex */
final class T extends SuspendLambda implements Y41.q<kotlinx.coroutines.T, InterfaceC43172j<Object>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public long f411260q;

    /* renamed from: r, reason: collision with root package name */
    public int f411261r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f411262s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f411263t;

    /* compiled from: Delay.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lkotlinx/coroutines/channels/B;", "value", "", "<anonymous>", "(Lkotlinx/coroutines/channels/B;)Z"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1", f = "Delay.kt", i = {0}, l = {395}, m = "invokeSuspend", n = {"$this$onSuccess_u2dWpGqRn0$iv"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.channels.B<Object>, Continuation<? super Boolean>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f411264q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f411265r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<Object> f411266s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC43172j<Object> interfaceC43172j, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f411266s = interfaceC43172j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f411266s, continuation);
            aVar.f411265r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.channels.B<Object> b12, Continuation<? super Boolean> continuation) {
            return ((a) create(kotlinx.coroutines.channels.B.a(b12.f410774a), continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r4) throws java.lang.Throwable {
            /*
                r3 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r3.f411264q
                r2 = 1
                if (r1 == 0) goto L19
                if (r1 != r2) goto L11
                java.lang.Object r0 = r3.f411265r
                kotlin.C42729a0.b(r4)
                goto L34
            L11:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L19:
                kotlin.C42729a0.b(r4)
                java.lang.Object r4 = r3.f411265r
                kotlinx.coroutines.channels.B r4 = (kotlinx.coroutines.channels.B) r4
                java.lang.Object r4 = r4.f410774a
                boolean r1 = r4 instanceof kotlinx.coroutines.channels.B.c
                if (r1 != 0) goto L35
                r3.f411265r = r4
                r3.f411264q = r2
                kotlinx.coroutines.flow.j<java.lang.Object> r1 = r3.f411266s
                java.lang.Object r1 = r1.emit(r4, r3)
                if (r1 != r0) goto L33
                return r0
            L33:
                r0 = r4
            L34:
                r4 = r0
            L35:
                boolean r0 = r4 instanceof kotlinx.coroutines.channels.B.a
                if (r0 == 0) goto L47
                java.lang.Throwable r4 = kotlinx.coroutines.channels.B.b(r4)
                if (r4 != 0) goto L46
                r4 = 0
                java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r4)
                return r4
            L46:
                throw r4
            L47:
                java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r2)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.T.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: Delay.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0001\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\u008a@"}, d2 = {"<anonymous>", "", "T"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$2", f = "Delay.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.l<Continuation<?>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ long f411267q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j12, Continuation<? super b> continuation) {
            super(1, continuation);
            this.f411267q = j12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.k Continuation<?> continuation) {
            return new b(this.f411267q, continuation);
        }

        @Override // Y41.l
        public final Object invoke(Continuation<?> continuation) {
            ((b) create(continuation)).invokeSuspend(kotlin.G0.f406611a);
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            throw new TimeoutCancellationException("Timed out waiting for " + ((Object) kotlin.time.e.m(this.f411267q)), null);
        }
    }

    public T() {
        throw null;
    }

    @Override // Y41.q
    public final Object invoke(kotlinx.coroutines.T t12, InterfaceC43172j<Object> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f411261r;
        if (i12 == 0) {
            C42729a0.b(obj);
            kotlin.time.e.f410651c.getClass();
            throw null;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        long j12 = this.f411260q;
        kotlinx.coroutines.channels.K0 k02 = (kotlinx.coroutines.channels.K0) this.f411263t;
        InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f411262s;
        C42729a0.b(obj);
        while (((Boolean) obj).booleanValue()) {
            kotlinx.coroutines.selects.o oVar = new kotlinx.coroutines.selects.o(getF411447c());
            oVar.j(k02.E(), new a(interfaceC43172j, null));
            kotlinx.coroutines.selects.d.a(oVar, C43131e0.e(j12), new b(j12, null));
            this.f411262s = interfaceC43172j;
            this.f411263t = k02;
            this.f411260q = j12;
            this.f411261r = 1;
            obj = oVar.g(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return kotlin.G0.f406611a;
    }
}
