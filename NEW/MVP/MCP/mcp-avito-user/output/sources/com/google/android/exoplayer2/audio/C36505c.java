package com.google.android.exoplayer2.audio;

import com.adjust.sdk.Constants;
import com.google.android.exoplayer2.util.F;

/* compiled from: Ac4Util.java */
/* renamed from: com.google.android.exoplayer2.audio.c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36505c {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f343965a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, Constants.MINIMAL_ERROR_STATUS_CODE, Constants.MINIMAL_ERROR_STATUS_CODE, 2048};

    /* compiled from: Ac4Util.java */
    /* renamed from: com.google.android.exoplayer2.audio.c$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f343966a;

        /* renamed from: b, reason: collision with root package name */
        public final int f343967b;

        /* renamed from: c, reason: collision with root package name */
        public final int f343968c;

        /* renamed from: d, reason: collision with root package name */
        public final int f343969d;

        public b(int i12, int i13, int i14, int i15, int i16, a aVar) {
            this.f343967b = i13;
            this.f343966a = i14;
            this.f343968c = i15;
            this.f343969d = i16;
        }
    }

    public static void a(int i12, F f12) {
        f12.y(7);
        byte[] bArr = f12.f348070a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i12 >> 16) & 255);
        bArr[5] = (byte) ((i12 >> 8) & 255);
        bArr[6] = (byte) (i12 & 255);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.exoplayer2.audio.C36505c.b b(com.google.android.exoplayer2.util.E r11) {
        /*
            r0 = 16
            int r1 = r11.g(r0)
            int r0 = r11.g(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r11.g(r0)
            r2 = 7
            goto L19
        L18:
            r2 = r3
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r8 = r0
            r0 = 2
            int r1 = r11.g(r0)
            r2 = 0
            r4 = 3
            if (r1 != r4) goto L38
            r5 = r2
        L2c:
            int r6 = r11.g(r0)
            int r6 = r6 + r5
            boolean r5 = r11.f()
            if (r5 != 0) goto L3a
            int r1 = r1 + r6
        L38:
            r5 = r1
            goto L3f
        L3a:
            int r6 = r6 + 1
            int r5 = r6 << 2
            goto L2c
        L3f:
            r1 = 10
            int r1 = r11.g(r1)
            boolean r6 = r11.f()
            if (r6 == 0) goto L54
            int r6 = r11.g(r4)
            if (r6 <= 0) goto L54
            r11.m(r0)
        L54:
            boolean r6 = r11.f()
            r7 = 44100(0xac44, float:6.1797E-41)
            r9 = 48000(0xbb80, float:6.7262E-41)
            if (r6 == 0) goto L62
            r10 = r9
            goto L63
        L62:
            r10 = r7
        L63:
            int r11 = r11.g(r3)
            int[] r6 = com.google.android.exoplayer2.audio.C36505c.f343965a
            if (r10 != r7) goto L73
            r7 = 13
            if (r11 != r7) goto L73
            r11 = r6[r11]
            r9 = r11
            goto L9f
        L73:
            if (r10 != r9) goto L93
            r7 = 14
            if (r11 >= r7) goto L93
            r2 = r6[r11]
            int r1 = r1 % 5
            r6 = 8
            r7 = 1
            if (r1 == r7) goto L9a
            r7 = 11
            if (r1 == r0) goto L95
            if (r1 == r4) goto L9a
            if (r1 == r3) goto L8b
            goto L93
        L8b:
            if (r11 == r4) goto L91
            if (r11 == r6) goto L91
            if (r11 != r7) goto L93
        L91:
            int r2 = r2 + 1
        L93:
            r9 = r2
            goto L9f
        L95:
            if (r11 == r6) goto L91
            if (r11 != r7) goto L93
            goto L91
        L9a:
            if (r11 == r4) goto L91
            if (r11 != r6) goto L93
            goto L91
        L9f:
            com.google.android.exoplayer2.audio.c$b r11 = new com.google.android.exoplayer2.audio.c$b
            r6 = 2
            r0 = 0
            r4 = r11
            r7 = r10
            r10 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.C36505c.b(com.google.android.exoplayer2.util.E):com.google.android.exoplayer2.audio.c$b");
    }
}
