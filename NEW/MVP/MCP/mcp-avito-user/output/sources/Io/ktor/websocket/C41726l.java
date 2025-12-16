package io.ktor.websocket;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.channels.C43108m;
import kotlinx.coroutines.channels.M0;

/* compiled from: PingPong.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "io.ktor.websocket.PingPongKt$pinger$1", f = "PingPong.kt", i = {0, 0, 1, 1}, l = {64, 73, 95}, m = "invokeSuspend", n = {"random", "pingIdBytes", "random", "pingIdBytes"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* renamed from: io.ktor.websocket.l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41726l extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public kotlin.random.f f401566q;

    /* renamed from: r, reason: collision with root package name */
    public byte[] f401567r;

    /* renamed from: s, reason: collision with root package name */
    public int f401568s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f401569t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f401570u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Y41.p<CloseReason, Continuation<? super G0>, Object> f401571v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C43108m f401572w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ M0<AbstractC41723i> f401573x;

    /* compiled from: PingPong.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "io.ktor.websocket.PingPongKt$pinger$1$1", f = "PingPong.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.ktor.websocket.l$a */
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f401574q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C43108m f401575r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C43108m c43108m, Continuation continuation) {
            super(2, continuation);
            this.f401575r = c43108m;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f401575r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f401574q;
            if (i12 != 0 && i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            do {
                this.f401574q = 1;
            } while (this.f401575r.M(this) != coroutine_suspended);
            return coroutine_suspended;
        }
    }

    /* compiled from: PingPong.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "io.ktor.websocket.PingPongKt$pinger$1$rc$1", f = "PingPong.kt", i = {}, l = {75, 79}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.ktor.websocket.l$b */
    public static final class b extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f401576q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ M0<AbstractC41723i> f401577r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f401578s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ C43108m f401579t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(M0 m02, String str, C43108m c43108m, Continuation continuation) {
            super(2, continuation);
            this.f401577r = m02;
            this.f401578s = str;
            this.f401579t = c43108m;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new b(this.f401577r, this.f401578s, this.f401579t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0089  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x005d -> B:20:0x0060). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) throws java.lang.Throwable {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r8.f401576q
                java.lang.String r2 = r8.f401578s
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L20
                if (r1 == r4) goto L1c
                if (r1 != r3) goto L14
                kotlin.C42729a0.b(r9)
                goto L60
            L14:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1c:
                kotlin.C42729a0.b(r9)
                goto L55
            L20:
                kotlin.C42729a0.b(r9)
                org.slf4j.a r9 = io.ktor.websocket.C41722h.f401551a
                java.lang.String r1 = "WebSocket Pinger: sending ping frame"
                r9.e(r1)
                io.ktor.websocket.i$d r9 = new io.ktor.websocket.i$d
                java.nio.charset.Charset r1 = kotlin.text.C43047d.f410592e
                java.nio.charset.Charset r5 = kotlin.text.C43047d.f410589b
                boolean r6 = kotlin.jvm.internal.L.f(r1, r5)
                if (r6 == 0) goto L3b
                byte[] r1 = r2.getBytes(r5)
                goto L47
            L3b:
                java.nio.charset.CharsetEncoder r1 = r1.newEncoder()
                int r5 = r2.length()
                byte[] r1 = W31.a.c(r1, r2, r5)
            L47:
                r9.<init>(r1)
                r8.f401576q = r4
                kotlinx.coroutines.channels.M0<io.ktor.websocket.i> r1 = r8.f401577r
                java.lang.Object r9 = r1.send(r9, r8)
                if (r9 != r0) goto L55
                return r0
            L55:
                r8.f401576q = r3
                kotlinx.coroutines.channels.m r9 = r8.f401579t
                java.lang.Object r9 = r9.M(r8)
                if (r9 != r0) goto L60
                return r0
            L60:
                io.ktor.websocket.i$e r9 = (io.ktor.websocket.AbstractC41723i.e) r9
                byte[] r1 = r9.f401559c
                java.nio.charset.Charset r4 = kotlin.text.C43047d.f410592e
                int r5 = r1.length
                java.lang.String r6 = new java.lang.String
                r7 = 0
                r6.<init>(r1, r7, r5, r4)
                boolean r1 = r6.equals(r2)
                if (r1 == 0) goto L89
                org.slf4j.a r0 = io.ktor.websocket.C41722h.f401551a
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "WebSocket Pinger: received valid pong frame "
                r1.<init>(r2)
                r1.append(r9)
                java.lang.String r9 = r1.toString()
                r0.e(r9)
                kotlin.G0 r9 = kotlin.G0.f406611a
                return r9
            L89:
                org.slf4j.a r1 = io.ktor.websocket.C41722h.f401551a
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                java.lang.String r5 = "WebSocket Pinger: received invalid pong frame "
                r4.<init>(r5)
                r4.append(r9)
                java.lang.String r9 = ", continue waiting"
                r4.append(r9)
                java.lang.String r9 = r4.toString()
                r1.e(r9)
                goto L55
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.C41726l.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41726l(long j12, long j13, Y41.p pVar, C43108m c43108m, M0 m02, Continuation continuation) {
        super(2, continuation);
        this.f401569t = j12;
        this.f401570u = j13;
        this.f401571v = pVar;
        this.f401572w = c43108m;
        this.f401573x = m02;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C43108m c43108m = this.f401572w;
        return new C41726l(this.f401569t, this.f401570u, this.f401571v, c43108m, this.f401573x, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((C41726l) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a7 A[Catch: CancellationException | ClosedReceiveChannelException | ClosedSendChannelException -> 0x00ca, CancellationException | ClosedReceiveChannelException | ClosedSendChannelException -> 0x00ca, CancellationException | ClosedReceiveChannelException | ClosedSendChannelException -> 0x00ca, TRY_LEAVE, TryCatch #0 {CancellationException | ClosedReceiveChannelException | ClosedSendChannelException -> 0x00ca, blocks: (B:7:0x0018, B:12:0x0029, B:12:0x0029, B:12:0x0029, B:25:0x00a3, B:25:0x00a3, B:25:0x00a3, B:27:0x00a7, B:27:0x00a7, B:27:0x00a7, B:18:0x005f, B:18:0x005f, B:18:0x005f, B:22:0x0072, B:22:0x0072, B:22:0x0072, B:15:0x0031, B:15:0x0031, B:15:0x0031), top: B:34:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c8  */
    /* JADX WARN: Type inference failed for: r11v8, types: [kotlin.random.f] */
    /* JADX WARN: Type inference failed for: r11v9, types: [kotlin.random.f] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00a0 -> B:25:0x00a3). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r14.f401568s
            kotlinx.coroutines.channels.m r2 = r14.f401572w
            long r3 = r14.f401570u
            long r5 = r14.f401569t
            r7 = 3
            r8 = 2
            r9 = 1
            r10 = 0
            if (r1 == 0) goto L35
            if (r1 == r9) goto L2d
            if (r1 == r8) goto L25
            if (r1 != r7) goto L1d
            kotlin.C42729a0.b(r15)     // Catch: java.lang.Throwable -> Lca
            goto Lca
        L1d:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L25:
            byte[] r1 = r14.f401567r
            kotlin.random.f r11 = r14.f401566q
            kotlin.C42729a0.b(r15)     // Catch: java.lang.Throwable -> Lca java.lang.Throwable -> Lca java.lang.Throwable -> Lca
            goto La3
        L2d:
            byte[] r1 = r14.f401567r
            kotlin.random.f r11 = r14.f401566q
            kotlin.C42729a0.b(r15)     // Catch: java.lang.Throwable -> Lca java.lang.Throwable -> Lca java.lang.Throwable -> Lca
            goto L72
        L35:
            kotlin.C42729a0.b(r15)
            org.slf4j.a r15 = io.ktor.websocket.C41722h.f401551a
            java.lang.String r1 = "Starting WebSocket pinger coroutine with period "
            java.lang.String r11 = " ms and timeout "
            java.lang.StringBuilder r1 = androidx.compose.foundation.H.q(r5, r1, r11)
            r1.append(r3)
            java.lang.String r11 = " ms"
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            r15.e(r1)
            java.util.TimeZone r15 = io.ktor.util.date.a.f400455a
            long r11 = java.lang.System.currentTimeMillis()
            kotlin.random.i r15 = kotlin.random.g.a(r11)
            r1 = 32
            byte[] r1 = new byte[r1]
        L5f:
            io.ktor.websocket.l$a r11 = new io.ktor.websocket.l$a     // Catch: java.lang.Throwable -> Lca java.lang.Throwable -> Lca java.lang.Throwable -> Lca
            r11.<init>(r2, r10)     // Catch: java.lang.Throwable -> Lca java.lang.Throwable -> Lca java.lang.Throwable -> Lca
            r14.f401566q = r15     // Catch: java.lang.Throwable -> Lca java.lang.Throwable -> Lca java.lang.Throwable -> Lca
            r14.f401567r = r1     // Catch: java.lang.Throwable -> Lca java.lang.Throwable -> Lca java.lang.Throwable -> Lca
            r14.f401568s = r9     // Catch: java.lang.Throwable -> Lca java.lang.Throwable -> Lca java.lang.Throwable -> Lca
            java.lang.Object r11 = kotlinx.coroutines.D1.c(r5, r11, r14)     // Catch: java.lang.Throwable -> Lca java.lang.Throwable -> Lca java.lang.Throwable -> Lca
            if (r11 != r0) goto L71
            return r0
        L71:
            r11 = r15
        L72:
            r11.d(r1)     // Catch: java.lang.Throwable -> Lca java.lang.Throwable -> Lca java.lang.Throwable -> Lca
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lca java.lang.Throwable -> Lca java.lang.Throwable -> Lca
            r15.<init>()     // Catch: java.lang.Throwable -> Lca java.lang.Throwable -> Lca java.lang.Throwable -> Lca
            java.lang.String r12 = "[ping "
            r15.append(r12)     // Catch: java.lang.Throwable -> Lca java.lang.Throwable -> Lca java.lang.Throwable -> Lca
            java.lang.String r12 = io.ktor.util.D.c(r1)     // Catch: java.lang.Throwable -> Lca java.lang.Throwable -> Lca java.lang.Throwable -> Lca
            r15.append(r12)     // Catch: java.lang.Throwable -> Lca java.lang.Throwable -> Lca java.lang.Throwable -> Lca
            java.lang.String r12 = " ping]"
            r15.append(r12)     // Catch: java.lang.Throwable -> Lca java.lang.Throwable -> Lca java.lang.Throwable -> Lca
            java.lang.String r15 = r15.toString()     // Catch: java.lang.Throwable -> Lca java.lang.Throwable -> Lca java.lang.Throwable -> Lca
            io.ktor.websocket.l$b r12 = new io.ktor.websocket.l$b     // Catch: java.lang.Throwable -> Lca java.lang.Throwable -> Lca java.lang.Throwable -> Lca
            kotlinx.coroutines.channels.M0<io.ktor.websocket.i> r13 = r14.f401573x     // Catch: java.lang.Throwable -> Lca java.lang.Throwable -> Lca java.lang.Throwable -> Lca
            r12.<init>(r13, r15, r2, r10)     // Catch: java.lang.Throwable -> Lca java.lang.Throwable -> Lca java.lang.Throwable -> Lca
            r14.f401566q = r11     // Catch: java.lang.Throwable -> Lca java.lang.Throwable -> Lca java.lang.Throwable -> Lca
            r14.f401567r = r1     // Catch: java.lang.Throwable -> Lca java.lang.Throwable -> Lca java.lang.Throwable -> Lca
            r14.f401568s = r8     // Catch: java.lang.Throwable -> Lca java.lang.Throwable -> Lca java.lang.Throwable -> Lca
            java.lang.Object r15 = kotlinx.coroutines.D1.c(r3, r12, r14)     // Catch: java.lang.Throwable -> Lca java.lang.Throwable -> Lca java.lang.Throwable -> Lca
            if (r15 != r0) goto La3
            return r0
        La3:
            kotlin.G0 r15 = (kotlin.G0) r15     // Catch: java.lang.Throwable -> Lca java.lang.Throwable -> Lca java.lang.Throwable -> Lca
            if (r15 != 0) goto Lc8
            org.slf4j.a r15 = io.ktor.websocket.C41722h.f401551a     // Catch: java.lang.Throwable -> Lca java.lang.Throwable -> Lca java.lang.Throwable -> Lca
            java.lang.String r1 = "WebSocket pinger has timed out"
            r15.e(r1)     // Catch: java.lang.Throwable -> Lca java.lang.Throwable -> Lca java.lang.Throwable -> Lca
            Y41.p<io.ktor.websocket.CloseReason, kotlin.coroutines.Continuation<? super kotlin.G0>, java.lang.Object> r15 = r14.f401571v     // Catch: java.lang.Throwable -> Lca java.lang.Throwable -> Lca java.lang.Throwable -> Lca
            io.ktor.websocket.CloseReason r1 = new io.ktor.websocket.CloseReason     // Catch: java.lang.Throwable -> Lca java.lang.Throwable -> Lca java.lang.Throwable -> Lca
            io.ktor.websocket.CloseReason$Codes r2 = io.ktor.websocket.CloseReason.Codes.INTERNAL_ERROR     // Catch: java.lang.Throwable -> Lca java.lang.Throwable -> Lca java.lang.Throwable -> Lca
            java.lang.String r3 = "Ping timeout"
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> Lca java.lang.Throwable -> Lca java.lang.Throwable -> Lca
            r14.f401566q = r10     // Catch: java.lang.Throwable -> Lca java.lang.Throwable -> Lca java.lang.Throwable -> Lca
            r14.f401567r = r10     // Catch: java.lang.Throwable -> Lca java.lang.Throwable -> Lca java.lang.Throwable -> Lca
            r14.f401568s = r7     // Catch: java.lang.Throwable -> Lca java.lang.Throwable -> Lca java.lang.Throwable -> Lca
            io.ktor.websocket.b$b r15 = (io.ktor.websocket.C41716b.C11431b) r15     // Catch: java.lang.Throwable -> Lca java.lang.Throwable -> Lca java.lang.Throwable -> Lca
            java.lang.Object r15 = r15.invoke(r1, r14)     // Catch: java.lang.Throwable -> Lca java.lang.Throwable -> Lca java.lang.Throwable -> Lca
            if (r15 != r0) goto Lca
            return r0
        Lc8:
            r15 = r11
            goto L5f
        Lca:
            kotlin.G0 r15 = kotlin.G0.f406611a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.C41726l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
