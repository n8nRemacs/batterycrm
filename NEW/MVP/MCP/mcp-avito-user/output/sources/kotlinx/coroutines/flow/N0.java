package kotlinx.coroutines.flow;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;

/* compiled from: Limit.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/n0", "Lkotlinx/coroutines/flow/j;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class N0 implements InterfaceC43172j<Object> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f411176b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l0.h f411177c;

    /* compiled from: Limit.kt */
    @kotlin.jvm.internal.s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2", f = "Reduce.kt", i = {0, 0}, l = {139}, m = "emit", n = {"this", "it"}, s = {"L$0", "L$1"})
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public N0 f411178q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f411179r;

        /* renamed from: s, reason: collision with root package name */
        public int f411180s;

        /* renamed from: u, reason: collision with root package name */
        public Object f411182u;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f411179r = obj;
            this.f411180s |= BeduinInputModel.MIN_TEXT_VERSION;
            return N0.this.emit(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public N0(Y41.p pVar, l0.h hVar) {
        this.f411176b = (SuspendLambda) pVar;
        this.f411177c = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v2, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.N0.a
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.N0$a r0 = (kotlinx.coroutines.flow.N0.a) r0
            int r1 = r0.f411180s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f411180s = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.N0$a r0 = new kotlinx.coroutines.flow.N0$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f411179r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f411180s
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f411182u
            kotlinx.coroutines.flow.N0 r0 = r0.f411178q
            kotlin.C42729a0.b(r6)
            goto L48
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.C42729a0.b(r6)
            r0.f411178q = r4
            r0.f411182u = r5
            r0.f411180s = r3
            kotlin.coroutines.jvm.internal.SuspendLambda r6 = r4.f411176b
            java.lang.Object r6 = r6.invoke(r5, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            r0 = r4
        L48:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L53
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        L53:
            kotlin.jvm.internal.l0$h r6 = r0.f411177c
            r6.f406842b = r5
            kotlinx.coroutines.flow.internal.AbortFlowException r5 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.N0.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
