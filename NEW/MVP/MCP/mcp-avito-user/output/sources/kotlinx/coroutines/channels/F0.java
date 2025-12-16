package kotlinx.coroutines.channels;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.InterfaceC42730b;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.CoroutineStart;

/* compiled from: Produce.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class F0 {

    /* compiled from: Produce.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.channels.ProduceKt", f = "Produce.kt", i = {0, 0}, l = {150}, m = "awaitClose", n = {"$this$awaitClose", "block"}, s = {"L$0", "L$1"})
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public I0 f410790q;

        /* renamed from: r, reason: collision with root package name */
        public Y41.a f410791r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f410792s;

        /* renamed from: t, reason: collision with root package name */
        public int f410793t;

        public a() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f410792s = obj;
            this.f410793t |= BeduinInputModel.MIN_TEXT_VERSION;
            return F0.a(null, null, this);
        }
    }

    /* compiled from: Produce.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<Throwable, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.r f410794l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(kotlinx.coroutines.r rVar) {
            super(1);
            this.f410794l = rVar;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Throwable th2) {
            int i12 = kotlin.Z.f406624c;
            kotlin.G0 g02 = kotlin.G0.f406611a;
            this.f410794l.resumeWith(g02);
            return g02;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@Y61.k kotlinx.coroutines.channels.I0<?> r4, @Y61.k Y41.a<kotlin.G0> r5, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.channels.F0.a
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.channels.F0$a r0 = (kotlinx.coroutines.channels.F0.a) r0
            int r1 = r0.f410793t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f410793t = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.F0$a r0 = new kotlinx.coroutines.channels.F0$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f410792s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f410793t
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            Y41.a r4 = r0.f410791r
            r5 = r4
            Y41.a r5 = (Y41.a) r5
            kotlin.C42729a0.b(r6)     // Catch: java.lang.Throwable -> L2e
            goto L74
        L2e:
            r4 = move-exception
            goto L7a
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L38:
            kotlin.C42729a0.b(r6)
            kotlin.coroutines.CoroutineContext r6 = r0.getF411447c()
            kotlinx.coroutines.N0$b r2 = kotlinx.coroutines.N0.f410716u2
            kotlin.coroutines.CoroutineContext$Element r6 = r6.get(r2)
            if (r6 != r4) goto L7e
            r0.f410790q = r4     // Catch: java.lang.Throwable -> L2e
            r6 = r5
            Y41.a r6 = (Y41.a) r6     // Catch: java.lang.Throwable -> L2e
            r0.f410791r = r6     // Catch: java.lang.Throwable -> L2e
            r0.f410793t = r3     // Catch: java.lang.Throwable -> L2e
            kotlinx.coroutines.r r6 = new kotlinx.coroutines.r     // Catch: java.lang.Throwable -> L2e
            kotlin.coroutines.Continuation r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r0)     // Catch: java.lang.Throwable -> L2e
            r6.<init>(r3, r2)     // Catch: java.lang.Throwable -> L2e
            r6.p()     // Catch: java.lang.Throwable -> L2e
            kotlinx.coroutines.channels.F0$b r2 = new kotlinx.coroutines.channels.F0$b     // Catch: java.lang.Throwable -> L2e
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L2e
            r4.g(r2)     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r4 = r6.o()     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()     // Catch: java.lang.Throwable -> L2e
            if (r4 != r6) goto L71
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r0)     // Catch: java.lang.Throwable -> L2e
        L71:
            if (r4 != r1) goto L74
            return r1
        L74:
            r5.invoke()
            kotlin.G0 r4 = kotlin.G0.f406611a
            return r4
        L7a:
            r5.invoke()
            throw r4
        L7e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.F0.a(kotlinx.coroutines.channels.I0, Y41.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Y61.k
    public static final K0 c(@Y61.k kotlinx.coroutines.T t12, @Y61.k CoroutineContext coroutineContext, int i12, @Y61.k BufferOverflow bufferOverflow, @Y61.k CoroutineStart coroutineStart, @InterfaceC42730b @Y61.k Y41.p pVar) {
        H0 h02 = new H0(kotlinx.coroutines.K.c(t12, coroutineContext), A.a(i12, bufferOverflow, null, 4), true, true);
        h02.E0(coroutineStart, h02, pVar);
        return h02;
    }

    public static K0 d(kotlinx.coroutines.T t12, kotlinx.coroutines.M m12, int i12, Y41.p pVar, int i13) {
        CoroutineContext coroutineContext = m12;
        if ((i13 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if ((i13 & 2) != 0) {
            i12 = 0;
        }
        return c(t12, coroutineContext2, i12, BufferOverflow.f410777b, CoroutineStart.f410680b, pVar);
    }
}
