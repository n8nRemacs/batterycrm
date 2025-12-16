package kotlinx.coroutines.flow;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;

/* compiled from: SafeCollector.common.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/D", "Lkotlinx/coroutines/flow/i;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.flow.s1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43200s1 implements InterfaceC43160i<Object> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f411738b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f411739c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f411740d;

    /* compiled from: SafeCollector.common.kt */
    @kotlin.jvm.internal.s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1", f = "Transform.kt", i = {0, 0, 0}, l = {113, 114}, m = "collect", n = {"this", "$this$runningFold_u24lambda_u249", "accumulator"}, s = {"L$0", "L$1", "L$2"})
    /* renamed from: kotlinx.coroutines.flow.s1$a */
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f411741q;

        /* renamed from: r, reason: collision with root package name */
        public int f411742r;

        /* renamed from: t, reason: collision with root package name */
        public C43200s1 f411744t;

        /* renamed from: u, reason: collision with root package name */
        public InterfaceC43172j f411745u;

        /* renamed from: v, reason: collision with root package name */
        public l0.h f411746v;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f411741q = obj;
            this.f411742r |= BeduinInputModel.MIN_TEXT_VERSION;
            return C43200s1.this.collect(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C43200s1(Object obj, InterfaceC43160i interfaceC43160i, Y41.q qVar) {
        this.f411738b = obj;
        this.f411739c = interfaceC43160i;
        this.f411740d = (SuspendLambda) qVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [Y41.q, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(@Y61.k kotlinx.coroutines.flow.InterfaceC43172j<? super java.lang.Object> r7, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.C43200s1.a
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.flow.s1$a r0 = (kotlinx.coroutines.flow.C43200s1.a) r0
            int r1 = r0.f411742r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f411742r = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.s1$a r0 = new kotlinx.coroutines.flow.s1$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f411741q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f411742r
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.C42729a0.b(r8)
            goto L71
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            kotlin.jvm.internal.l0$h r7 = r0.f411746v
            kotlinx.coroutines.flow.j r2 = r0.f411745u
            kotlinx.coroutines.flow.s1 r4 = r0.f411744t
            kotlin.C42729a0.b(r8)
            goto L58
        L3e:
            kotlin.jvm.internal.l0$h r8 = androidx.compose.foundation.H.t(r8)
            java.lang.Object r2 = r6.f411738b
            r8.f406842b = r2
            r0.f411744t = r6
            r0.f411745u = r7
            r0.f411746v = r8
            r0.f411742r = r4
            java.lang.Object r2 = r7.emit(r2, r0)
            if (r2 != r1) goto L55
            return r1
        L55:
            r4 = r6
            r2 = r7
            r7 = r8
        L58:
            kotlinx.coroutines.flow.i r8 = r4.f411739c
            kotlinx.coroutines.flow.t1 r5 = new kotlinx.coroutines.flow.t1
            kotlin.coroutines.jvm.internal.SuspendLambda r4 = r4.f411740d
            r5.<init>(r7, r4, r2)
            r7 = 0
            r0.f411744t = r7
            r0.f411745u = r7
            r0.f411746v = r7
            r0.f411742r = r3
            java.lang.Object r7 = r8.collect(r5, r0)
            if (r7 != r1) goto L71
            return r1
        L71:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C43200s1.collect(kotlinx.coroutines.flow.j, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
