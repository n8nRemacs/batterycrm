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
/* loaded from: classes8.dex */
public final class Y implements InterfaceC43160i<Object> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f411298b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f411299c;

    /* compiled from: SafeCollector.common.kt */
    @kotlin.jvm.internal.s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1", f = "Emitters.kt", i = {0, 0, 0, 1}, l = {113, 121}, m = "collect", n = {"this", "$this$onEmpty_u24lambda_u243", "isEmpty", "collector"}, s = {"L$0", "L$1", "L$2", "L$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f411300q;

        /* renamed from: r, reason: collision with root package name */
        public int f411301r;

        /* renamed from: t, reason: collision with root package name */
        public Object f411303t;

        /* renamed from: u, reason: collision with root package name */
        public InterfaceC43172j f411304u;

        /* renamed from: v, reason: collision with root package name */
        public l0.a f411305v;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f411300q = obj;
            this.f411301r |= BeduinInputModel.MIN_TEXT_VERSION;
            return Y.this.collect(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Y(Y41.p pVar, InterfaceC43160i interfaceC43160i) {
        this.f411298b = interfaceC43160i;
        this.f411299c = (SuspendLambda) pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlinx.coroutines.flow.j, kotlinx.coroutines.flow.j<? super java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r6v1, types: [kotlin.coroutines.jvm.internal.ContinuationImpl] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v7, types: [kotlin.coroutines.jvm.internal.ContinuationImpl] */
    /* JADX WARN: Type inference failed for: r7v5, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(@Y61.k kotlinx.coroutines.flow.InterfaceC43172j<? super java.lang.Object> r6, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.Y.a
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.Y$a r0 = (kotlinx.coroutines.flow.Y.a) r0
            int r1 = r0.f411301r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f411301r = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.Y$a r0 = new kotlinx.coroutines.flow.Y$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f411300q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f411301r
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L46
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r6 = r0.f411303t
            kotlinx.coroutines.flow.internal.A r6 = (kotlinx.coroutines.flow.internal.A) r6
            kotlin.C42729a0.b(r7)     // Catch: java.lang.Throwable -> L30
            goto L88
        L30:
            r7 = move-exception
            goto L8c
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            kotlin.jvm.internal.l0$a r6 = r0.f411305v
            kotlinx.coroutines.flow.j r2 = r0.f411304u
            java.lang.Object r4 = r0.f411303t
            kotlinx.coroutines.flow.Y r4 = (kotlinx.coroutines.flow.Y) r4
            kotlin.C42729a0.b(r7)
            goto L69
        L46:
            kotlin.C42729a0.b(r7)
            kotlin.jvm.internal.l0$a r7 = new kotlin.jvm.internal.l0$a
            r7.<init>()
            r7.f406838b = r4
            kotlinx.coroutines.flow.Z r2 = new kotlinx.coroutines.flow.Z
            r2.<init>(r7, r6)
            r0.f411303t = r5
            r0.f411304u = r6
            r0.f411305v = r7
            r0.f411301r = r4
            kotlinx.coroutines.flow.i r4 = r5.f411298b
            java.lang.Object r2 = r4.collect(r2, r0)
            if (r2 != r1) goto L66
            return r1
        L66:
            r4 = r5
            r2 = r6
            r6 = r7
        L69:
            boolean r6 = r6.f406838b
            if (r6 == 0) goto L90
            kotlinx.coroutines.flow.internal.A r6 = new kotlinx.coroutines.flow.internal.A
            kotlin.coroutines.CoroutineContext r7 = r0.getF411447c()
            r6.<init>(r2, r7)
            kotlin.coroutines.jvm.internal.SuspendLambda r7 = r4.f411299c     // Catch: java.lang.Throwable -> L30
            r0.f411303t = r6     // Catch: java.lang.Throwable -> L30
            r2 = 0
            r0.f411304u = r2     // Catch: java.lang.Throwable -> L30
            r0.f411305v = r2     // Catch: java.lang.Throwable -> L30
            r0.f411301r = r3     // Catch: java.lang.Throwable -> L30
            java.lang.Object r7 = r7.invoke(r6, r0)     // Catch: java.lang.Throwable -> L30
            if (r7 != r1) goto L88
            return r1
        L88:
            r6.releaseIntercepted()
            goto L90
        L8c:
            r6.releaseIntercepted()
            throw r7
        L90:
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.Y.collect(kotlinx.coroutines.flow.j, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
