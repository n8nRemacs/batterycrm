package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.util.F;

/* compiled from: FlacFrameReader.java */
/* loaded from: classes6.dex */
public final class o {

    /* compiled from: FlacFrameReader.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public long f344909a;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(com.google.android.exoplayer2.util.F r20, com.google.android.exoplayer2.extractor.r r21, int r22, com.google.android.exoplayer2.extractor.o.a r23) {
        /*
            Method dump skipped, instructions count: 197
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.o.a(com.google.android.exoplayer2.util.F, com.google.android.exoplayer2.extractor.r, int, com.google.android.exoplayer2.extractor.o$a):boolean");
    }

    public static int b(int i12, F f12) {
        switch (i12) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i12 - 2);
            case 6:
                return f12.r() + 1;
            case 7:
                return f12.w() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i12 - 8);
            default:
                return -1;
        }
    }
}
