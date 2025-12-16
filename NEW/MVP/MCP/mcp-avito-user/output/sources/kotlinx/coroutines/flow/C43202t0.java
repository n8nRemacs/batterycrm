package kotlinx.coroutines.flow;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SafeCollector.common.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/D", "Lkotlinx/coroutines/flow/i;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.flow.t0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43202t0 implements InterfaceC43160i<Object> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f411755b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f411756c;

    /* compiled from: SafeCollector.common.kt */
    @kotlin.jvm.internal.s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1", f = "Limit.kt", i = {0}, l = {115}, m = "collect", n = {"ownershipMarker"}, s = {"L$0"})
    /* renamed from: kotlinx.coroutines.flow.t0$a */
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f411757q;

        /* renamed from: r, reason: collision with root package name */
        public int f411758r;

        /* renamed from: t, reason: collision with root package name */
        public Object f411760t;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f411757q = obj;
            this.f411758r |= BeduinInputModel.MIN_TEXT_VERSION;
            return C43202t0.this.collect(null, this);
        }
    }

    public C43202t0(InterfaceC43160i interfaceC43160i, int i12) {
        this.f411755b = interfaceC43160i;
        this.f411756c = i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(@Y61.k kotlinx.coroutines.flow.InterfaceC43172j<? super java.lang.Object> r9, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof kotlinx.coroutines.flow.C43202t0.a
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.flow.t0$a r0 = (kotlinx.coroutines.flow.C43202t0.a) r0
            int r1 = r0.f411758r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f411758r = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.t0$a r0 = new kotlinx.coroutines.flow.t0$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f411757q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f411758r
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r9 = r0.f411760t
            kotlin.C42729a0.b(r10)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2b
            goto L5e
        L2b:
            r10 = move-exception
            goto L5a
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            kotlin.C42729a0.b(r10)
            java.lang.Object r10 = new java.lang.Object
            r10.<init>()
            kotlin.jvm.internal.l0$f r2 = new kotlin.jvm.internal.l0$f
            r2.<init>()
            kotlinx.coroutines.flow.i r4 = r8.f411755b     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
            kotlinx.coroutines.flow.u0 r5 = new kotlinx.coroutines.flow.u0     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
            int r6 = r8.f411756c     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
            r5.<init>(r2, r6, r9, r10)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
            r0.f411760t = r10     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
            r0.f411758r = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
            java.lang.Object r9 = r4.collect(r5, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
            if (r9 != r1) goto L5e
            return r1
        L56:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L5a:
            java.lang.Object r0 = r10.f411440b
            if (r0 != r9) goto L61
        L5e:
            kotlin.G0 r9 = kotlin.G0.f406611a
            return r9
        L61:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C43202t0.collect(kotlinx.coroutines.flow.j, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
