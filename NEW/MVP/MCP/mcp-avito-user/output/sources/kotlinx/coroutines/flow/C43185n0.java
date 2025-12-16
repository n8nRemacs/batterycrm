package kotlinx.coroutines.flow;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Limit.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/flow/n0;", "Lkotlinx/coroutines/flow/j;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 176)
/* renamed from: kotlinx.coroutines.flow.n0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43185n0 implements InterfaceC43172j<Object> {

    /* compiled from: Limit.kt */
    @kotlin.jvm.internal.s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 176)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1", f = "Limit.kt", i = {0}, l = {127}, m = "emit", n = {"this"}, s = {"L$0"})
    /* renamed from: kotlinx.coroutines.flow.n0$a */
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public C43185n0 f411638q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f411639r;

        /* renamed from: t, reason: collision with root package name */
        public int f411641t;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f411639r = obj;
            this.f411641t |= BeduinInputModel.MIN_TEXT_VERSION;
            return C43185n0.this.emit(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r4, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r5) {
        /*
            r3 = this;
            boolean r4 = r5 instanceof kotlinx.coroutines.flow.C43185n0.a
            if (r4 == 0) goto L13
            r4 = r5
            kotlinx.coroutines.flow.n0$a r4 = (kotlinx.coroutines.flow.C43185n0.a) r4
            int r0 = r4.f411641t
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.f411641t = r0
            goto L18
        L13:
            kotlinx.coroutines.flow.n0$a r4 = new kotlinx.coroutines.flow.n0$a
            r4.<init>(r5)
        L18:
            java.lang.Object r5 = r4.f411639r
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r4.f411641t
            r1 = 1
            if (r0 == 0) goto L42
            if (r0 != r1) goto L3a
            kotlinx.coroutines.flow.n0 r4 = r4.f411638q
            kotlin.C42729a0.b(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L34
            kotlin.G0 r4 = kotlin.G0.f406611a
            return r4
        L34:
            kotlinx.coroutines.flow.internal.AbortFlowException r5 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r5.<init>(r4)
            throw r5
        L3a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L42:
            kotlin.C42729a0.b(r5)
            r4.f411638q = r3
            r4.f411641t = r1
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C43185n0.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
