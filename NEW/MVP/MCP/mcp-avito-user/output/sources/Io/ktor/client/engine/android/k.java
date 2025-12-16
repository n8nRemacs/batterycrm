package io.ktor.client.engine.android;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AndroidURLConnectionUtils.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-client-android"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class k {
    /* JADX WARN: Removed duplicated region for block: B:31:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@Y61.k java.net.HttpURLConnection r4, @Y61.k io.ktor.client.request.e0 r5, @Y61.k Y41.l r6, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof io.ktor.client.engine.android.j
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.client.engine.android.j r0 = (io.ktor.client.engine.android.j) r0
            int r1 = r0.f398885t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f398885t = r1
            goto L18
        L13:
            io.ktor.client.engine.android.j r0 = new io.ktor.client.engine.android.j
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f398884s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f398885t
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Throwable r4 = r0.f398883r
            io.ktor.client.request.e0 r5 = r0.f398882q
            kotlin.C42729a0.b(r7)
            goto L4d
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.C42729a0.b(r7)
            io.ktor.client.engine.android.c r6 = (io.ktor.client.engine.android.c) r6     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r4 = r6.invoke(r4)     // Catch: java.lang.Throwable -> L3f
            return r4
        L3f:
            r4 = move-exception
            r0.f398882q = r5
            r0.f398883r = r4
            r0.f398885t = r3
            java.lang.Object r6 = kotlinx.coroutines.J1.a(r0)
            if (r6 != r1) goto L4d
            return r1
        L4d:
            boolean r6 = r4 instanceof java.net.SocketTimeoutException
            if (r6 != 0) goto L68
            boolean r6 = r4 instanceof java.net.ConnectException
            r7 = 0
            if (r6 == 0) goto L67
            java.lang.String r6 = r4.getMessage()
            if (r6 == 0) goto L63
            java.lang.String r0 = "timed out"
            boolean r6 = kotlin.text.C43066x.q(r6, r0, r7)
            goto L64
        L63:
            r6 = r7
        L64:
            if (r6 == 0) goto L67
            goto L68
        L67:
            r3 = r7
        L68:
            if (r3 == 0) goto L6e
            io.ktor.client.network.sockets.ConnectTimeoutException r4 = io.ktor.client.plugins.k0.a(r5, r4)
        L6e:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.android.k.a(java.net.HttpURLConnection, io.ktor.client.request.e0, Y41.l, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
