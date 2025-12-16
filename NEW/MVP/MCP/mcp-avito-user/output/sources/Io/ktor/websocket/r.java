package io.ktor.websocket;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: RawWebSocketCommon.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "io.ktor.websocket.RawWebSocketCommon$writerJob$1", f = "RawWebSocketCommon.kt", i = {1}, l = {58, 60}, m = "invokeSuspend", n = {"message"}, s = {"L$0"})
/* loaded from: classes8.dex */
final class r extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public AbstractC41723i f401609q;

    /* renamed from: r, reason: collision with root package name */
    public int f401610r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C41730p f401611s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C41730p c41730p, Continuation<? super r> continuation) {
        super(2, continuation);
        this.f401611s = c41730p;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new r(this.f401611s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((r) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040 A[Catch: all -> 0x001d, ChannelWriteException -> 0x001f, TryCatch #3 {ChannelWriteException -> 0x001f, all -> 0x001d, blocks: (B:7:0x0019, B:27:0x0054, B:18:0x0031, B:21:0x003c, B:23:0x0040, B:31:0x0069, B:33:0x006d, B:34:0x0073, B:35:0x0089, B:29:0x005b, B:15:0x002a), top: B:53:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005b A[Catch: all -> 0x001d, ChannelWriteException -> 0x001f, TRY_LEAVE, TryCatch #3 {ChannelWriteException -> 0x001f, all -> 0x001d, blocks: (B:7:0x0019, B:27:0x0054, B:18:0x0031, B:21:0x003c, B:23:0x0040, B:31:0x0069, B:33:0x006d, B:34:0x0073, B:35:0x0089, B:29:0x005b, B:15:0x002a), top: B:53:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0069 A[Catch: all -> 0x001d, ChannelWriteException -> 0x001f, TRY_ENTER, TryCatch #3 {ChannelWriteException -> 0x001f, all -> 0x001d, blocks: (B:7:0x0019, B:27:0x0054, B:18:0x0031, B:21:0x003c, B:23:0x0040, B:31:0x0069, B:33:0x006d, B:34:0x0073, B:35:0x0089, B:29:0x005b, B:15:0x002a), top: B:53:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a4 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0053 -> B:27:0x0054). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x006d -> B:18:0x0031). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r11.f401610r
            io.ktor.websocket.p r2 = r11.f401611s
            r3 = 0
            r4 = 2
            r5 = 1
            java.lang.String r6 = "WebSocket closed."
            io.ktor.utils.io.d1 r7 = r2.f401590c
            kotlinx.coroutines.channels.m r8 = r2.f401594g
            if (r1 == 0) goto L2e
            if (r1 == r5) goto L2a
            if (r1 != r4) goto L22
            io.ktor.websocket.i r1 = r11.f401609q
            kotlin.C42729a0.b(r12)     // Catch: java.lang.Throwable -> L1d io.ktor.util.cio.ChannelWriteException -> L1f
            goto L54
        L1d:
            r12 = move-exception
            goto L8a
        L1f:
            r12 = move-exception
            goto L90
        L22:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L2a:
            kotlin.C42729a0.b(r12)     // Catch: java.lang.Throwable -> L1d io.ktor.util.cio.ChannelWriteException -> L1f
            goto L3c
        L2e:
            kotlin.C42729a0.b(r12)
        L31:
            r11.f401609q = r3     // Catch: java.lang.Throwable -> L1d io.ktor.util.cio.ChannelWriteException -> L1f
            r11.f401610r = r5     // Catch: java.lang.Throwable -> L1d io.ktor.util.cio.ChannelWriteException -> L1f
            java.lang.Object r12 = r8.M(r11)     // Catch: java.lang.Throwable -> L1d io.ktor.util.cio.ChannelWriteException -> L1f
            if (r12 != r0) goto L3c
            return r0
        L3c:
            boolean r1 = r12 instanceof io.ktor.websocket.AbstractC41723i     // Catch: java.lang.Throwable -> L1d io.ktor.util.cio.ChannelWriteException -> L1f
            if (r1 == 0) goto L69
            r1 = r12
            io.ktor.websocket.i r1 = (io.ktor.websocket.AbstractC41723i) r1     // Catch: java.lang.Throwable -> L1d io.ktor.util.cio.ChannelWriteException -> L1f
            boolean r9 = r2.f401592e     // Catch: java.lang.Throwable -> L1d io.ktor.util.cio.ChannelWriteException -> L1f
            r10 = r12
            io.ktor.websocket.i r10 = (io.ktor.websocket.AbstractC41723i) r10     // Catch: java.lang.Throwable -> L1d io.ktor.util.cio.ChannelWriteException -> L1f
            r11.f401609q = r10     // Catch: java.lang.Throwable -> L1d io.ktor.util.cio.ChannelWriteException -> L1f
            r11.f401610r = r4     // Catch: java.lang.Throwable -> L1d io.ktor.util.cio.ChannelWriteException -> L1f
            java.lang.Object r1 = io.ktor.websocket.C41735v.c(r7, r1, r9, r11)     // Catch: java.lang.Throwable -> L1d io.ktor.util.cio.ChannelWriteException -> L1f
            if (r1 != r0) goto L53
            return r0
        L53:
            r1 = r12
        L54:
            r7.flush()     // Catch: java.lang.Throwable -> L1d io.ktor.util.cio.ChannelWriteException -> L1f
            boolean r12 = r1 instanceof io.ktor.websocket.AbstractC41723i.b     // Catch: java.lang.Throwable -> L1d io.ktor.util.cio.ChannelWriteException -> L1f
            if (r12 == 0) goto L31
            r8.h(r3)     // Catch: java.lang.Throwable -> L1d io.ktor.util.cio.ChannelWriteException -> L1f
        L5e:
            java.util.concurrent.CancellationException r12 = kotlinx.coroutines.C43311x0.a(r6, r3)
            r8.h(r12)
            r7.h(r3)
            goto L9a
        L69:
            boolean r1 = r12 instanceof io.ktor.websocket.C41730p.a     // Catch: java.lang.Throwable -> L1d io.ktor.util.cio.ChannelWriteException -> L1f
            if (r1 == 0) goto L73
            io.ktor.websocket.p$a r12 = (io.ktor.websocket.C41730p.a) r12     // Catch: java.lang.Throwable -> L1d io.ktor.util.cio.ChannelWriteException -> L1f
            r12.a()     // Catch: java.lang.Throwable -> L1d io.ktor.util.cio.ChannelWriteException -> L1f
            goto L31
        L73:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L1d io.ktor.util.cio.ChannelWriteException -> L1f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1d io.ktor.util.cio.ChannelWriteException -> L1f
            r1.<init>()     // Catch: java.lang.Throwable -> L1d io.ktor.util.cio.ChannelWriteException -> L1f
            java.lang.String r2 = "unknown message "
            r1.append(r2)     // Catch: java.lang.Throwable -> L1d io.ktor.util.cio.ChannelWriteException -> L1f
            r1.append(r12)     // Catch: java.lang.Throwable -> L1d io.ktor.util.cio.ChannelWriteException -> L1f
            java.lang.String r12 = r1.toString()     // Catch: java.lang.Throwable -> L1d io.ktor.util.cio.ChannelWriteException -> L1f
            r0.<init>(r12)     // Catch: java.lang.Throwable -> L1d io.ktor.util.cio.ChannelWriteException -> L1f
            throw r0     // Catch: java.lang.Throwable -> L1d io.ktor.util.cio.ChannelWriteException -> L1f
        L8a:
            r8.h(r12)     // Catch: java.lang.Throwable -> L8e
            goto L5e
        L8e:
            r12 = move-exception
            goto Lb1
        L90:
            java.lang.String r0 = "Failed to write to WebSocket."
            java.util.concurrent.CancellationException r12 = kotlinx.coroutines.C43311x0.a(r0, r12)     // Catch: java.lang.Throwable -> L8e
            r8.h(r12)     // Catch: java.lang.Throwable -> L8e
            goto L5e
        L9a:
            java.lang.Object r12 = r8.H()
            java.lang.Object r12 = kotlinx.coroutines.channels.B.c(r12)
            if (r12 != 0) goto La7
            kotlin.G0 r12 = kotlin.G0.f406611a
            return r12
        La7:
            boolean r0 = r12 instanceof io.ktor.websocket.C41730p.a
            if (r0 == 0) goto L9a
            io.ktor.websocket.p$a r12 = (io.ktor.websocket.C41730p.a) r12
            r12.a()
            goto L9a
        Lb1:
            java.util.concurrent.CancellationException r0 = kotlinx.coroutines.C43311x0.a(r6, r3)
            r8.h(r0)
            r7.h(r3)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.r.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
