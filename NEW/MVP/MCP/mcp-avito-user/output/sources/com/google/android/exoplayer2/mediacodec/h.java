package com.google.android.exoplayer2.mediacodec;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;

/* compiled from: BatchBuffer.java */
/* loaded from: classes6.dex */
final class h extends DecoderInputBuffer {

    /* renamed from: i, reason: collision with root package name */
    public long f345592i;

    /* renamed from: j, reason: collision with root package name */
    public int f345593j;

    /* renamed from: k, reason: collision with root package name */
    public int f345594k;

    public h() {
        super(2);
        this.f345594k = 32;
    }

    @Override // com.google.android.exoplayer2.decoder.DecoderInputBuffer
    public final void h() {
        super.h();
        this.f345593j = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        if ((r0.remaining() + r3.position()) > 3072000) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l(com.google.android.exoplayer2.decoder.DecoderInputBuffer r6) {
        /*
            r5 = this;
            r0 = 1073741824(0x40000000, float:2.0)
            boolean r0 = r6.f(r0)
            r1 = 1
            r0 = r0 ^ r1
            com.google.android.exoplayer2.util.C36585a.b(r0)
            r0 = 268435456(0x10000000, float:2.524355E-29)
            boolean r0 = r6.f(r0)
            r0 = r0 ^ r1
            com.google.android.exoplayer2.util.C36585a.b(r0)
            r0 = 4
            boolean r0 = r6.f(r0)
            r0 = r0 ^ r1
            com.google.android.exoplayer2.util.C36585a.b(r0)
            int r0 = r5.f345593j
            r2 = 0
            if (r0 <= 0) goto L25
            r3 = r1
            goto L26
        L25:
            r3 = r2
        L26:
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != 0) goto L2b
            goto L52
        L2b:
            int r3 = r5.f345594k
            if (r0 < r3) goto L30
            goto L51
        L30:
            boolean r0 = r6.f(r4)
            boolean r3 = r5.f(r4)
            if (r0 == r3) goto L3b
            goto L51
        L3b:
            java.nio.ByteBuffer r0 = r6.f344205d
            if (r0 == 0) goto L52
            java.nio.ByteBuffer r3 = r5.f344205d
            if (r3 == 0) goto L52
            int r3 = r3.position()
            int r0 = r0.remaining()
            int r0 = r0 + r3
            r3 = 3072000(0x2ee000, float:4.304789E-39)
            if (r0 <= r3) goto L52
        L51:
            return r2
        L52:
            int r0 = r5.f345593j
            int r2 = r0 + 1
            r5.f345593j = r2
            if (r0 != 0) goto L66
            long r2 = r6.f344207f
            r5.f344207f = r2
            boolean r0 = r6.f(r1)
            if (r0 == 0) goto L66
            r5.f344210b = r1
        L66:
            boolean r0 = r6.f(r4)
            if (r0 == 0) goto L6e
            r5.f344210b = r4
        L6e:
            java.nio.ByteBuffer r0 = r6.f344205d
            if (r0 == 0) goto L7e
            int r2 = r0.remaining()
            r5.j(r2)
            java.nio.ByteBuffer r2 = r5.f344205d
            r2.put(r0)
        L7e:
            long r2 = r6.f344207f
            r5.f345592i = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.h.l(com.google.android.exoplayer2.decoder.DecoderInputBuffer):boolean");
    }
}
