package kotlinx.coroutines.flow;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Limit.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1", f = "Limit.kt", i = {0}, l = {149}, m = "invokeSuspend", n = {"collector$iv"}, s = {"L$0"})
/* renamed from: kotlinx.coroutines.flow.x0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43214x0 extends SuspendLambda implements Y41.p<InterfaceC43172j<Object>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f411819q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f411820r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i<Object> f411821s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f411822t;

    /* compiled from: Limit.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/n0", "Lkotlinx/coroutines/flow/j;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlinx.coroutines.flow.x0$a */
    public static final class a implements InterfaceC43172j<Object> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SuspendLambda f411823b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f411824c;

        /* compiled from: Limit.kt */
        @kotlin.jvm.internal.s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1", f = "Limit.kt", i = {0}, l = {139}, m = "emit", n = {"this"}, s = {"L$0"})
        /* renamed from: kotlinx.coroutines.flow.x0$a$a, reason: collision with other inner class name */
        public static final class C11733a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public a f411825q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ Object f411826r;

            /* renamed from: s, reason: collision with root package name */
            public int f411827s;

            public C11733a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f411826r = obj;
                this.f411827s |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.q qVar, InterfaceC43172j interfaceC43172j) {
            this.f411823b = (SuspendLambda) qVar;
            this.f411824c = interfaceC43172j;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r6v2, types: [Y41.q, kotlin.coroutines.jvm.internal.SuspendLambda] */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.C43214x0.a.C11733a
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.x0$a$a r0 = (kotlinx.coroutines.flow.C43214x0.a.C11733a) r0
                int r1 = r0.f411827s
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f411827s = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.x0$a$a r0 = new kotlinx.coroutines.flow.x0$a$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f411826r
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f411827s
                r3 = 1
                if (r2 == 0) goto L33
                if (r2 != r3) goto L2b
                kotlinx.coroutines.flow.x0$a r5 = r0.f411825q
                kotlin.C42729a0.b(r6)
                goto L46
            L2b:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L33:
                kotlin.C42729a0.b(r6)
                r0.f411825q = r4
                r0.f411827s = r3
                kotlin.coroutines.jvm.internal.SuspendLambda r6 = r4.f411823b
                kotlinx.coroutines.flow.j r2 = r4.f411824c
                java.lang.Object r6 = r6.invoke(r2, r5, r0)
                if (r6 != r1) goto L45
                return r1
            L45:
                r5 = r4
            L46:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L51
                kotlin.G0 r5 = kotlin.G0.f406611a
                return r5
            L51:
                kotlinx.coroutines.flow.internal.AbortFlowException r6 = new kotlinx.coroutines.flow.internal.AbortFlowException
                r6.<init>(r5)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C43214x0.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C43214x0(InterfaceC43160i<Object> interfaceC43160i, Y41.q<? super InterfaceC43172j<Object>, Object, ? super Continuation<? super Boolean>, ? extends Object> qVar, Continuation<? super C43214x0> continuation) {
        super(2, continuation);
        this.f411821s = interfaceC43160i;
        this.f411822t = (SuspendLambda) qVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Y41.q, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C43214x0 c43214x0 = new C43214x0(this.f411821s, this.f411822t, continuation);
        c43214x0.f411820r = obj;
        return c43214x0;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<Object> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
        return ((C43214x0) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
    /* JADX WARN: Type inference failed for: r4v0, types: [Y41.q, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.f411819q
            r2 = 1
            if (r1 == 0) goto L1d
            if (r1 != r2) goto L15
            java.lang.Object r0 = r5.f411820r
            kotlinx.coroutines.flow.x0$a r0 = (kotlinx.coroutines.flow.C43214x0.a) r0
            kotlin.C42729a0.b(r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L13
            goto L3e
        L13:
            r6 = move-exception
            goto L3a
        L15:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1d:
            kotlin.C42729a0.b(r6)
            java.lang.Object r6 = r5.f411820r
            kotlinx.coroutines.flow.j r6 = (kotlinx.coroutines.flow.InterfaceC43172j) r6
            kotlinx.coroutines.flow.i<java.lang.Object> r1 = r5.f411821s
            kotlinx.coroutines.flow.x0$a r3 = new kotlinx.coroutines.flow.x0$a
            kotlin.coroutines.jvm.internal.SuspendLambda r4 = r5.f411822t
            r3.<init>(r4, r6)
            r5.f411820r = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L38
            r5.f411819q = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L38
            java.lang.Object r6 = r1.collect(r3, r5)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L38
            if (r6 != r0) goto L3e
            return r0
        L38:
            r6 = move-exception
            r0 = r3
        L3a:
            java.lang.Object r1 = r6.f411440b
            if (r1 != r0) goto L41
        L3e:
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        L41:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C43214x0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
