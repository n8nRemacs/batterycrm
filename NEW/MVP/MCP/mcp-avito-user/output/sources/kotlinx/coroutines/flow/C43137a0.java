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
/* renamed from: kotlinx.coroutines.flow.a0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43137a0 implements InterfaceC43160i<Object> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f411318b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f411319c;

    /* compiled from: SafeCollector.common.kt */
    @kotlin.jvm.internal.s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1", f = "Emitters.kt", i = {0, 0, 0}, l = {115, 119}, m = "collect", n = {"this", "$this$onStart_u24lambda_u241", "safeCollector"}, s = {"L$0", "L$1", "L$2"})
    /* renamed from: kotlinx.coroutines.flow.a0$a */
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f411320q;

        /* renamed from: r, reason: collision with root package name */
        public int f411321r;

        /* renamed from: t, reason: collision with root package name */
        public C43137a0 f411323t;

        /* renamed from: u, reason: collision with root package name */
        public InterfaceC43172j f411324u;

        /* renamed from: v, reason: collision with root package name */
        public kotlinx.coroutines.flow.internal.A f411325v;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f411320q = obj;
            this.f411321r |= BeduinInputModel.MIN_TEXT_VERSION;
            return C43137a0.this.collect(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C43137a0(Y41.p pVar, InterfaceC43160i interfaceC43160i) {
        this.f411318b = (SuspendLambda) pVar;
        this.f411319c = interfaceC43160i;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v2, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(@Y61.k kotlinx.coroutines.flow.InterfaceC43172j<? super java.lang.Object> r7, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.C43137a0.a
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.flow.a0$a r0 = (kotlinx.coroutines.flow.C43137a0.a) r0
            int r1 = r0.f411321r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f411321r = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.a0$a r0 = new kotlinx.coroutines.flow.a0$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f411320q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f411321r
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.C42729a0.b(r8)
            goto L75
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            kotlinx.coroutines.flow.internal.A r7 = r0.f411325v
            kotlinx.coroutines.flow.j r2 = r0.f411324u
            kotlinx.coroutines.flow.a0 r4 = r0.f411323t
            kotlin.C42729a0.b(r8)     // Catch: java.lang.Throwable -> L3e
            goto L60
        L3e:
            r8 = move-exception
            goto L7c
        L40:
            kotlin.C42729a0.b(r8)
            kotlinx.coroutines.flow.internal.A r8 = new kotlinx.coroutines.flow.internal.A
            kotlin.coroutines.CoroutineContext r2 = r0.getF410748d()
            r8.<init>(r7, r2)
            kotlin.coroutines.jvm.internal.SuspendLambda r2 = r6.f411318b     // Catch: java.lang.Throwable -> L78
            r0.f411323t = r6     // Catch: java.lang.Throwable -> L78
            r0.f411324u = r7     // Catch: java.lang.Throwable -> L78
            r0.f411325v = r8     // Catch: java.lang.Throwable -> L78
            r0.f411321r = r4     // Catch: java.lang.Throwable -> L78
            java.lang.Object r2 = r2.invoke(r8, r0)     // Catch: java.lang.Throwable -> L78
            if (r2 != r1) goto L5d
            return r1
        L5d:
            r4 = r6
            r2 = r7
            r7 = r8
        L60:
            r7.releaseIntercepted()
            kotlinx.coroutines.flow.i r7 = r4.f411319c
            r8 = 0
            r0.f411323t = r8
            r0.f411324u = r8
            r0.f411325v = r8
            r0.f411321r = r3
            java.lang.Object r7 = r7.collect(r2, r0)
            if (r7 != r1) goto L75
            return r1
        L75:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        L78:
            r7 = move-exception
            r5 = r8
            r8 = r7
            r7 = r5
        L7c:
            r7.releaseIntercepted()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C43137a0.collect(kotlinx.coroutines.flow.j, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
