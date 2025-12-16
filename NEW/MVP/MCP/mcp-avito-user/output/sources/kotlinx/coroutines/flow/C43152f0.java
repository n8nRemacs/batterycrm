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
/* renamed from: kotlinx.coroutines.flow.f0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43152f0 implements InterfaceC43160i<Object> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f411382b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f411383c;

    /* compiled from: SafeCollector.common.kt */
    @kotlin.jvm.internal.s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1", f = "Errors.kt", i = {0, 0}, l = {112, 113}, m = "collect", n = {"this", "$this$catch_u24lambda_u240"}, s = {"L$0", "L$1"})
    /* renamed from: kotlinx.coroutines.flow.f0$a */
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f411384q;

        /* renamed from: r, reason: collision with root package name */
        public int f411385r;

        /* renamed from: t, reason: collision with root package name */
        public C43152f0 f411387t;

        /* renamed from: u, reason: collision with root package name */
        public InterfaceC43172j f411388u;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f411384q = obj;
            this.f411385r |= BeduinInputModel.MIN_TEXT_VERSION;
            return C43152f0.this.collect(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C43152f0(InterfaceC43160i interfaceC43160i, Y41.q qVar) {
        this.f411382b = interfaceC43160i;
        this.f411383c = (SuspendLambda) qVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v3, types: [Y41.q, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(@Y61.k kotlinx.coroutines.flow.InterfaceC43172j<? super java.lang.Object> r6, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.C43152f0.a
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.f0$a r0 = (kotlinx.coroutines.flow.C43152f0.a) r0
            int r1 = r0.f411385r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f411385r = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.f0$a r0 = new kotlinx.coroutines.flow.f0$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f411384q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f411385r
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.C42729a0.b(r7)
            goto L63
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            kotlinx.coroutines.flow.j r6 = r0.f411388u
            kotlinx.coroutines.flow.f0 r2 = r0.f411387t
            kotlin.C42729a0.b(r7)
            goto L4f
        L3c:
            kotlin.C42729a0.b(r7)
            r0.f411387t = r5
            r0.f411388u = r6
            r0.f411385r = r4
            kotlinx.coroutines.flow.i r7 = r5.f411382b
            java.lang.Object r7 = kotlinx.coroutines.flow.C43175k.g(r7, r6, r0)
            if (r7 != r1) goto L4e
            return r1
        L4e:
            r2 = r5
        L4f:
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            if (r7 == 0) goto L63
            kotlin.coroutines.jvm.internal.SuspendLambda r2 = r2.f411383c
            r4 = 0
            r0.f411387t = r4
            r0.f411388u = r4
            r0.f411385r = r3
            java.lang.Object r6 = r2.invoke(r6, r7, r0)
            if (r6 != r1) goto L63
            return r1
        L63:
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C43152f0.collect(kotlinx.coroutines.flow.j, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
