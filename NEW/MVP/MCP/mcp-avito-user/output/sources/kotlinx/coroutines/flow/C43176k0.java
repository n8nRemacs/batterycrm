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
/* renamed from: kotlinx.coroutines.flow.k0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43176k0 implements InterfaceC43160i<Object> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f411586b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f411587c;

    /* compiled from: SafeCollector.common.kt */
    @kotlin.jvm.internal.s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1", f = "Errors.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {116, 118}, m = "collect", n = {"this", "$this$retryWhen_u24lambda_u242", "attempt", "shallRetry", "this", "$this$retryWhen_u24lambda_u242", "cause", "attempt"}, s = {"L$0", "L$1", "J$0", "I$0", "L$0", "L$1", "L$2", "J$0"})
    /* renamed from: kotlinx.coroutines.flow.k0$a */
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f411588q;

        /* renamed from: r, reason: collision with root package name */
        public int f411589r;

        /* renamed from: t, reason: collision with root package name */
        public C43176k0 f411591t;

        /* renamed from: u, reason: collision with root package name */
        public InterfaceC43172j f411592u;

        /* renamed from: v, reason: collision with root package name */
        public Throwable f411593v;

        /* renamed from: w, reason: collision with root package name */
        public long f411594w;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f411588q = obj;
            this.f411589r |= BeduinInputModel.MIN_TEXT_VERSION;
            return C43176k0.this.collect(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C43176k0(InterfaceC43160i interfaceC43160i, Y41.r rVar) {
        this.f411586b = interfaceC43160i;
        this.f411587c = (SuspendLambda) rVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v4, types: [Y41.r, kotlin.coroutines.jvm.internal.SuspendLambda] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007e -> B:27:0x0081). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0090 -> B:30:0x008d). Please report as a decompilation issue!!! */
    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(@Y61.k kotlinx.coroutines.flow.InterfaceC43172j<? super java.lang.Object> r10, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof kotlinx.coroutines.flow.C43176k0.a
            if (r0 == 0) goto L13
            r0 = r11
            kotlinx.coroutines.flow.k0$a r0 = (kotlinx.coroutines.flow.C43176k0.a) r0
            int r1 = r0.f411589r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f411589r = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.k0$a r0 = new kotlinx.coroutines.flow.k0$a
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f411588q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f411589r
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            long r5 = r0.f411594w
            java.lang.Throwable r10 = r0.f411593v
            kotlinx.coroutines.flow.j r2 = r0.f411592u
            kotlinx.coroutines.flow.k0 r7 = r0.f411591t
            kotlin.C42729a0.b(r11)
            goto L81
        L34:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3c:
            long r5 = r0.f411594w
            kotlinx.coroutines.flow.j r10 = r0.f411592u
            kotlinx.coroutines.flow.k0 r2 = r0.f411591t
            kotlin.C42729a0.b(r11)
            r7 = r2
        L46:
            r2 = r10
            goto L65
        L48:
            kotlin.C42729a0.b(r11)
            r5 = 0
            r11 = r9
        L4e:
            kotlinx.coroutines.flow.i r2 = r11.f411586b
            r0.f411591t = r11
            r0.f411592u = r10
            r7 = 0
            r0.f411593v = r7
            r0.f411594w = r5
            r0.f411589r = r4
            java.lang.Object r2 = kotlinx.coroutines.flow.C43175k.g(r2, r10, r0)
            if (r2 != r1) goto L62
            return r1
        L62:
            r7 = r11
            r11 = r2
            goto L46
        L65:
            r10 = r11
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            if (r10 == 0) goto L90
            kotlin.coroutines.jvm.internal.SuspendLambda r11 = r7.f411587c
            java.lang.Long r8 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r5)
            r0.f411591t = r7
            r0.f411592u = r2
            r0.f411593v = r10
            r0.f411594w = r5
            r0.f411589r = r3
            java.lang.Object r11 = r11.invoke(r2, r10, r8, r0)
            if (r11 != r1) goto L81
            return r1
        L81:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L8f
            r10 = 1
            long r5 = r5 + r10
            r10 = r4
        L8d:
            r11 = r7
            goto L92
        L8f:
            throw r10
        L90:
            r10 = 0
            goto L8d
        L92:
            if (r10 != 0) goto L97
            kotlin.G0 r10 = kotlin.G0.f406611a
            return r10
        L97:
            r10 = r2
            goto L4e
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C43176k0.collect(kotlinx.coroutines.flow.j, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
