package io.ktor.util;

import kotlin.Metadata;

/* compiled from: Deflater.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-utils"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final byte[] f400416a = new byte[7];

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(io.ktor.utils.io.InterfaceC41649d1 r7, java.util.zip.Deflater r8, java.nio.ByteBuffer r9, Y41.a r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            boolean r0 = r11 instanceof io.ktor.util.L
            if (r0 == 0) goto L13
            r0 = r11
            io.ktor.util.L r0 = (io.ktor.util.L) r0
            int r1 = r0.f400407v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f400407v = r1
            goto L18
        L13:
            io.ktor.util.L r0 = new io.ktor.util.L
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f400406u
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f400407v
            r3 = 1
            if (r2 == 0) goto L41
            if (r2 != r3) goto L39
            Y41.a r7 = r0.f400405t
            Y41.a r7 = (Y41.a) r7
            java.nio.ByteBuffer r8 = r0.f400404s
            java.util.zip.Deflater r9 = r0.f400403r
            io.ktor.utils.io.d1 r10 = r0.f400402q
            kotlin.C42729a0.b(r11)
            r5 = r10
            r10 = r7
            r7 = r5
            r6 = r9
            r9 = r8
            r8 = r6
            goto L44
        L39:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L41:
            kotlin.C42729a0.b(r11)
        L44:
            java.lang.Object r11 = r10.invoke()
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L8d
            r9.clear()
            boolean r11 = r9.hasRemaining()
            if (r11 == 0) goto L76
            byte[] r11 = r9.array()
            int r2 = r9.arrayOffset()
            int r4 = r9.position()
            int r4 = r4 + r2
            int r2 = r9.remaining()
            int r11 = r8.deflate(r11, r4, r2)
            int r2 = r9.position()
            int r2 = r2 + r11
            r9.position(r2)
        L76:
            r9.flip()
            r0.f400402q = r7
            r0.f400403r = r8
            r0.f400404s = r9
            r11 = r10
            Y41.a r11 = (Y41.a) r11
            r0.f400405t = r11
            r0.f400407v = r3
            java.lang.Object r11 = r7.k(r9, r0)
            if (r11 != r1) goto L44
            return r1
        L8d:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.Q.a(io.ktor.utils.io.d1, java.util.zip.Deflater, java.nio.ByteBuffer, Y41.a, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
