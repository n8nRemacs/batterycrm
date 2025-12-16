package kotlinx.coroutines.flow;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: SafeCollector.common.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/D", "Lkotlinx/coroutines/flow/i;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.flow.v0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43208v0 implements InterfaceC43160i<Object> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f411797b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f411798c;

    /* compiled from: SafeCollector.common.kt */
    @kotlin.jvm.internal.s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1", f = "Limit.kt", i = {0}, l = {123}, m = "collect", n = {"collector$iv"}, s = {"L$0"})
    /* renamed from: kotlinx.coroutines.flow.v0$a */
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f411799q;

        /* renamed from: r, reason: collision with root package name */
        public int f411800r;

        /* renamed from: t, reason: collision with root package name */
        public C43211w0 f411802t;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f411799q = obj;
            this.f411800r |= BeduinInputModel.MIN_TEXT_VERSION;
            return C43208v0.this.collect(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C43208v0(Y41.p pVar, InterfaceC43160i interfaceC43160i) {
        this.f411797b = interfaceC43160i;
        this.f411798c = (SuspendLambda) pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v0, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(@Y61.k kotlinx.coroutines.flow.InterfaceC43172j<? super java.lang.Object> r6, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.C43208v0.a
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.v0$a r0 = (kotlinx.coroutines.flow.C43208v0.a) r0
            int r1 = r0.f411800r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f411800r = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.v0$a r0 = new kotlinx.coroutines.flow.v0$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f411799q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f411800r
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            kotlinx.coroutines.flow.w0 r6 = r0.f411802t
            kotlin.C42729a0.b(r7)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2b
            goto L52
        L2b:
            r7 = move-exception
            goto L4e
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.C42729a0.b(r7)
            kotlinx.coroutines.flow.i r7 = r5.f411797b
            kotlinx.coroutines.flow.w0 r2 = new kotlinx.coroutines.flow.w0
            kotlin.coroutines.jvm.internal.SuspendLambda r4 = r5.f411798c
            r2.<init>(r4, r6)
            r0.f411802t = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4c
            r0.f411800r = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4c
            java.lang.Object r6 = r7.collect(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4c
            if (r6 != r1) goto L52
            return r1
        L4c:
            r7 = move-exception
            r6 = r2
        L4e:
            java.lang.Object r0 = r7.f411440b
            if (r0 != r6) goto L55
        L52:
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        L55:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C43208v0.collect(kotlinx.coroutines.flow.j, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
