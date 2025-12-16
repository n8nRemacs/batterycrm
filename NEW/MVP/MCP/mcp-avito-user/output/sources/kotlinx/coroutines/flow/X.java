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
/* loaded from: classes8.dex */
public final class X implements InterfaceC43160i<Object> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f411290b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f411291c;

    /* compiled from: SafeCollector.common.kt */
    @kotlin.jvm.internal.s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1", f = "Emitters.kt", i = {0, 0, 1, 2}, l = {113, 120, 127}, m = "collect", n = {"this", "$this$onCompletion_u24lambda_u242", "e", "sc"}, s = {"L$0", "L$1", "L$0", "L$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f411292q;

        /* renamed from: r, reason: collision with root package name */
        public int f411293r;

        /* renamed from: t, reason: collision with root package name */
        public Object f411295t;

        /* renamed from: u, reason: collision with root package name */
        public InterfaceC43172j f411296u;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f411292q = obj;
            this.f411293r |= BeduinInputModel.MIN_TEXT_VERSION;
            return X.this.collect(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X(InterfaceC43160i interfaceC43160i, Y41.q qVar) {
        this.f411290b = interfaceC43160i;
        this.f411291c = (SuspendLambda) qVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v4, types: [Y41.q, kotlin.coroutines.jvm.internal.SuspendLambda] */
    /* JADX WARN: Type inference failed for: r9v6, types: [Y41.q, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(@Y61.k kotlinx.coroutines.flow.InterfaceC43172j<? super java.lang.Object> r9, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof kotlinx.coroutines.flow.X.a
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.flow.X$a r0 = (kotlinx.coroutines.flow.X.a) r0
            int r1 = r0.f411293r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f411293r = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.X$a r0 = new kotlinx.coroutines.flow.X$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f411292q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f411293r
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L52
            if (r2 == r5) goto L46
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r9 = r0.f411295t
            kotlinx.coroutines.flow.internal.A r9 = (kotlinx.coroutines.flow.internal.A) r9
            kotlin.C42729a0.b(r10)     // Catch: java.lang.Throwable -> L34
            goto L7e
        L34:
            r10 = move-exception
            goto L88
        L36:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3e:
            java.lang.Object r9 = r0.f411295t
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            kotlin.C42729a0.b(r10)
            goto La2
        L46:
            kotlinx.coroutines.flow.j r9 = r0.f411296u
            java.lang.Object r2 = r0.f411295t
            kotlinx.coroutines.flow.X r2 = (kotlinx.coroutines.flow.X) r2
            kotlin.C42729a0.b(r10)     // Catch: java.lang.Throwable -> L50
            goto L65
        L50:
            r9 = move-exception
            goto L8e
        L52:
            kotlin.C42729a0.b(r10)
            kotlinx.coroutines.flow.i r10 = r8.f411290b     // Catch: java.lang.Throwable -> L8c
            r0.f411295t = r8     // Catch: java.lang.Throwable -> L8c
            r0.f411296u = r9     // Catch: java.lang.Throwable -> L8c
            r0.f411293r = r5     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r10 = r10.collect(r9, r0)     // Catch: java.lang.Throwable -> L8c
            if (r10 != r1) goto L64
            return r1
        L64:
            r2 = r8
        L65:
            kotlinx.coroutines.flow.internal.A r10 = new kotlinx.coroutines.flow.internal.A
            kotlin.coroutines.CoroutineContext r4 = r0.getF410748d()
            r10.<init>(r9, r4)
            kotlin.coroutines.jvm.internal.SuspendLambda r9 = r2.f411291c     // Catch: java.lang.Throwable -> L84
            r0.f411295t = r10     // Catch: java.lang.Throwable -> L84
            r0.f411296u = r6     // Catch: java.lang.Throwable -> L84
            r0.f411293r = r3     // Catch: java.lang.Throwable -> L84
            java.lang.Object r9 = r9.invoke(r10, r6, r0)     // Catch: java.lang.Throwable -> L84
            if (r9 != r1) goto L7d
            return r1
        L7d:
            r9 = r10
        L7e:
            r9.releaseIntercepted()
            kotlin.G0 r9 = kotlin.G0.f406611a
            return r9
        L84:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L88:
            r9.releaseIntercepted()
            throw r10
        L8c:
            r9 = move-exception
            r2 = r8
        L8e:
            kotlinx.coroutines.flow.u2 r10 = new kotlinx.coroutines.flow.u2
            r10.<init>(r9)
            kotlin.coroutines.jvm.internal.SuspendLambda r2 = r2.f411291c
            r0.f411295t = r9
            r0.f411296u = r6
            r0.f411293r = r4
            java.lang.Object r10 = kotlinx.coroutines.flow.C43149e0.a(r10, r2, r9, r0)
            if (r10 != r1) goto La2
            return r1
        La2:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.X.collect(kotlinx.coroutines.flow.j, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
