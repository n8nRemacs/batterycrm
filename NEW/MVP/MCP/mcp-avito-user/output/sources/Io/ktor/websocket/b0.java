package io.ktor.websocket;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: WebSocketSession.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-websockets"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class b0 {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@Y61.k io.ktor.websocket.Z r5, @Y61.k io.ktor.websocket.CloseReason r6, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            boolean r0 = r7 instanceof io.ktor.websocket.a0
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.websocket.a0 r0 = (io.ktor.websocket.a0) r0
            int r1 = r0.f401472s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f401472s = r1
            goto L18
        L13:
            io.ktor.websocket.a0 r0 = new io.ktor.websocket.a0
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f401471r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f401472s
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.C42729a0.b(r7)     // Catch: java.lang.Throwable -> L59
            goto L59
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            io.ktor.websocket.Z r5 = r0.f401470q
            kotlin.C42729a0.b(r7)     // Catch: java.lang.Throwable -> L59
            goto L4d
        L3a:
            kotlin.C42729a0.b(r7)
            io.ktor.websocket.i$b r7 = new io.ktor.websocket.i$b     // Catch: java.lang.Throwable -> L59
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L59
            r0.f401470q = r5     // Catch: java.lang.Throwable -> L59
            r0.f401472s = r4     // Catch: java.lang.Throwable -> L59
            java.lang.Object r6 = r5.B(r7, r0)     // Catch: java.lang.Throwable -> L59
            if (r6 != r1) goto L4d
            return r1
        L4d:
            r6 = 0
            r0.f401470q = r6     // Catch: java.lang.Throwable -> L59
            r0.f401472s = r3     // Catch: java.lang.Throwable -> L59
            java.lang.Object r5 = r5.G(r0)     // Catch: java.lang.Throwable -> L59
            if (r5 != r1) goto L59
            return r1
        L59:
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.b0.a(io.ktor.websocket.Z, io.ktor.websocket.CloseReason, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
