package com.yandex.mobile.ads.impl;

import com.adjust.sdk.Constants;

/* renamed from: com.yandex.mobile.ads.impl.l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C39341l {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f387338a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, Constants.MINIMAL_ERROR_STATUS_CODE, Constants.MINIMAL_ERROR_STATUS_CODE, 2048};

    /* renamed from: com.yandex.mobile.ads.impl.l$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f387339a;

        /* renamed from: b, reason: collision with root package name */
        public final int f387340b;

        /* renamed from: c, reason: collision with root package name */
        public final int f387341c;

        public /* synthetic */ a(int i12, int i13, int i14, int i15) {
            this(i13, i14, i15);
        }

        private a(int i12, int i13, int i14) {
            this.f387339a = i12;
            this.f387340b = i13;
            this.f387341c = i14;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.yandex.mobile.ads.impl.C39341l.a a(com.yandex.mobile.ads.impl.or0 r10) {
        /*
            r0 = 16
            int r1 = r10.b(r0)
            int r0 = r10.b(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r10.b(r0)
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
            r1 = 2
            int r2 = r10.b(r1)
            r4 = 0
            r5 = 3
            if (r2 != r5) goto L3d
            r6 = r4
        L2b:
            int r7 = r10.b(r1)
            int r7 = r7 + r6
            boolean r6 = r10.f()
            if (r6 != 0) goto L38
            int r2 = r2 + r7
            goto L3d
        L38:
            int r7 = r7 + 1
            int r6 = r7 << 2
            goto L2b
        L3d:
            r6 = 10
            int r6 = r10.b(r6)
            boolean r7 = r10.f()
            if (r7 == 0) goto L52
            int r7 = r10.b(r5)
            if (r7 <= 0) goto L52
            r10.d(r1)
        L52:
            boolean r7 = r10.f()
            r8 = 44100(0xac44, float:6.1797E-41)
            r9 = 48000(0xbb80, float:6.7262E-41)
            if (r7 == 0) goto L60
            r7 = r9
            goto L61
        L60:
            r7 = r8
        L61:
            int r10 = r10.b(r3)
            if (r7 != r8) goto L70
            r8 = 13
            if (r10 != r8) goto L70
            int[] r1 = com.yandex.mobile.ads.impl.C39341l.f387338a
            r4 = r1[r10]
            goto L9c
        L70:
            if (r7 != r9) goto L9c
            int[] r8 = com.yandex.mobile.ads.impl.C39341l.f387338a
            r9 = 14
            if (r10 >= r9) goto L9c
            r4 = r8[r10]
            int r6 = r6 % 5
            r8 = 8
            r9 = 1
            if (r6 == r9) goto L96
            r9 = 11
            if (r6 == r1) goto L91
            if (r6 == r5) goto L96
            if (r6 == r3) goto L8a
            goto L9c
        L8a:
            if (r10 == r5) goto L9a
            if (r10 == r8) goto L9a
            if (r10 != r9) goto L9c
            goto L9a
        L91:
            if (r10 == r8) goto L9a
            if (r10 != r9) goto L9c
            goto L9a
        L96:
            if (r10 == r5) goto L9a
            if (r10 != r8) goto L9c
        L9a:
            int r4 = r4 + 1
        L9c:
            com.yandex.mobile.ads.impl.l$a r10 = new com.yandex.mobile.ads.impl.l$a
            r10.<init>(r2, r7, r0, r4)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C39341l.a(com.yandex.mobile.ads.impl.or0):com.yandex.mobile.ads.impl.l$a");
    }

    public static void a(int i12, pr0 pr0Var) {
        pr0Var.c(7);
        byte[] bArrC = pr0Var.c();
        bArrC[0] = -84;
        bArrC[1] = 64;
        bArrC[2] = -1;
        bArrC[3] = -1;
        bArrC[4] = (byte) ((i12 >> 16) & 255);
        bArrC[5] = (byte) ((i12 >> 8) & 255);
        bArrC[6] = (byte) (i12 & 255);
    }
}
