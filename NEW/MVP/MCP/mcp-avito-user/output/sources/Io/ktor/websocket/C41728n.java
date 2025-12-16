package io.ktor.websocket;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.channels.C43108m;
import kotlinx.coroutines.channels.InterfaceC43125y;
import kotlinx.coroutines.channels.K0;
import kotlinx.coroutines.channels.M0;

/* compiled from: PingPong.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "io.ktor.websocket.PingPongKt$ponger$1", f = "PingPong.kt", i = {0, 1}, l = {119, 32}, m = "invokeSuspend", n = {"$this$consume$iv$iv", "$this$consume$iv$iv"}, s = {"L$1", "L$1"})
/* renamed from: io.ktor.websocket.n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41728n extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public M0 f401581q;

    /* renamed from: r, reason: collision with root package name */
    public K0 f401582r;

    /* renamed from: s, reason: collision with root package name */
    public InterfaceC43125y f401583s;

    /* renamed from: t, reason: collision with root package name */
    public int f401584t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C43108m f401585u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C43108m f401586v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41728n(C43108m c43108m, C43108m c43108m2, Continuation continuation) {
        super(2, continuation);
        this.f401585u = c43108m;
        this.f401586v = c43108m2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C41728n(this.f401585u, this.f401586v, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((C41728n) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0046 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0053 A[Catch: all -> 0x0019, TryCatch #1 {all -> 0x0019, blocks: (B:7:0x0014, B:19:0x0038, B:23:0x004a, B:25:0x0053, B:28:0x0076, B:14:0x0029, B:18:0x0034), top: B:38:0x0008, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0076 A[Catch: all -> 0x0019, TRY_LEAVE, TryCatch #1 {all -> 0x0019, blocks: (B:7:0x0014, B:19:0x0038, B:23:0x004a, B:25:0x0053, B:28:0x0076, B:14:0x0029, B:18:0x0034), top: B:38:0x0008, outer: #0 }] */
    /* JADX WARN: Type inference failed for: r5v4, types: [kotlinx.coroutines.channels.M0] */
    /* JADX WARN: Type inference failed for: r5v5, types: [kotlinx.coroutines.channels.M0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0073 -> B:8:0x0017). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.f401584t
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L2d
            if (r1 == r2) goto L23
            if (r1 != r3) goto L1b
            kotlinx.coroutines.channels.y r1 = r10.f401583s
            kotlinx.coroutines.channels.K0 r4 = r10.f401582r
            kotlinx.coroutines.channels.M0 r5 = r10.f401581q
            kotlin.C42729a0.b(r11)     // Catch: java.lang.Throwable -> L19
        L17:
            r11 = r5
            goto L38
        L19:
            r11 = move-exception
            goto L7c
        L1b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L23:
            kotlinx.coroutines.channels.y r1 = r10.f401583s
            kotlinx.coroutines.channels.K0 r4 = r10.f401582r
            kotlinx.coroutines.channels.M0 r5 = r10.f401581q
            kotlin.C42729a0.b(r11)     // Catch: java.lang.Throwable -> L19
            goto L4a
        L2d:
            kotlin.C42729a0.b(r11)
            kotlinx.coroutines.channels.m r4 = r10.f401585u     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L82
            kotlinx.coroutines.channels.m r11 = r10.f401586v     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L82
            kotlinx.coroutines.channels.y r1 = r4.iterator()     // Catch: java.lang.Throwable -> L19
        L38:
            r10.f401581q = r11     // Catch: java.lang.Throwable -> L19
            r10.f401582r = r4     // Catch: java.lang.Throwable -> L19
            r10.f401583s = r1     // Catch: java.lang.Throwable -> L19
            r10.f401584t = r2     // Catch: java.lang.Throwable -> L19
            java.lang.Object r5 = r1.a(r10)     // Catch: java.lang.Throwable -> L19
            if (r5 != r0) goto L47
            return r0
        L47:
            r9 = r5
            r5 = r11
            r11 = r9
        L4a:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L19
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L19
            r6 = 0
            if (r11 == 0) goto L76
            java.lang.Object r11 = r1.next()     // Catch: java.lang.Throwable -> L19
            io.ktor.websocket.i$d r11 = (io.ktor.websocket.AbstractC41723i.d) r11     // Catch: java.lang.Throwable -> L19
            org.slf4j.a r7 = io.ktor.websocket.C41722h.f401551a     // Catch: java.lang.Throwable -> L19
            java.lang.String r8 = "Received ping message, sending pong message"
            r7.e(r8)     // Catch: java.lang.Throwable -> L19
            io.ktor.websocket.i$e r7 = new io.ktor.websocket.i$e     // Catch: java.lang.Throwable -> L19
            byte[] r11 = r11.f401559c     // Catch: java.lang.Throwable -> L19
            r7.<init>(r11, r6, r3, r6)     // Catch: java.lang.Throwable -> L19
            r10.f401581q = r5     // Catch: java.lang.Throwable -> L19
            r10.f401582r = r4     // Catch: java.lang.Throwable -> L19
            r10.f401583s = r1     // Catch: java.lang.Throwable -> L19
            r10.f401584t = r3     // Catch: java.lang.Throwable -> L19
            java.lang.Object r11 = r5.send(r7, r10)     // Catch: java.lang.Throwable -> L19
            if (r11 != r0) goto L17
            return r0
        L76:
            kotlin.G0 r11 = kotlin.G0.f406611a     // Catch: java.lang.Throwable -> L19
            r4.c(r6)     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L82
            goto L82
        L7c:
            throw r11     // Catch: java.lang.Throwable -> L7d
        L7d:
            r0 = move-exception
            kotlinx.coroutines.channels.D.a(r4, r11)     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L82
            throw r0     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L82
        L82:
            kotlin.G0 r11 = kotlin.G0.f406611a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.C41728n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
