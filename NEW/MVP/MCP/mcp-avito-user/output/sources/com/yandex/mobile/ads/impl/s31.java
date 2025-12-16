package com.yandex.mobile.ads.impl;

import java.util.Arrays;
import java.util.Random;

/* loaded from: classes8.dex */
public interface s31 {

    public static class a implements s31 {

        /* renamed from: a, reason: collision with root package name */
        private final Random f389765a;

        /* renamed from: b, reason: collision with root package name */
        private final int[] f389766b;

        /* renamed from: c, reason: collision with root package name */
        private final int[] f389767c;

        public a() {
            this(new Random());
        }

        @Override // com.yandex.mobile.ads.impl.s31
        public final int a() {
            return this.f389766b.length;
        }

        @Override // com.yandex.mobile.ads.impl.s31
        public final int b() {
            int[] iArr = this.f389766b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // com.yandex.mobile.ads.impl.s31
        public final int c() {
            int[] iArr = this.f389766b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // com.yandex.mobile.ads.impl.s31
        public final int d(int i12) {
            int i13 = this.f389767c[i12] - 1;
            if (i13 >= 0) {
                return this.f389766b[i13];
            }
            return -1;
        }

        private a(Random random) {
            this(a(random), random);
        }

        @Override // com.yandex.mobile.ads.impl.s31
        public final int a(int i12) {
            int i13 = this.f389767c[i12] + 1;
            int[] iArr = this.f389766b;
            if (i13 < iArr.length) {
                return iArr[i13];
            }
            return -1;
        }

        @Override // com.yandex.mobile.ads.impl.s31
        public final a b(int i12) {
            int[] iArr = new int[i12];
            int[] iArr2 = new int[i12];
            int i13 = 0;
            int i14 = 0;
            while (i14 < i12) {
                iArr[i14] = this.f389765a.nextInt(this.f389766b.length + 1);
                int i15 = i14 + 1;
                int iNextInt = this.f389765a.nextInt(i15);
                iArr2[i14] = iArr2[iNextInt];
                iArr2[iNextInt] = i14;
                i14 = i15;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.f389766b.length + i12];
            int i16 = 0;
            int i17 = 0;
            while (true) {
                int[] iArr4 = this.f389766b;
                if (i13 >= iArr4.length + i12) {
                    return new a(iArr3, new Random(this.f389765a.nextLong()));
                }
                if (i16 >= i12 || i17 != iArr[i16]) {
                    int i18 = i17 + 1;
                    int i19 = iArr4[i17];
                    iArr3[i13] = i19;
                    if (i19 >= 0) {
                        iArr3[i13] = i19 + i12;
                    }
                    i17 = i18;
                } else {
                    iArr3[i13] = iArr2[i16];
                    i16++;
                }
                i13++;
            }
        }

        @Override // com.yandex.mobile.ads.impl.s31
        public final a c(int i12) {
            int[] iArr = new int[this.f389766b.length - i12];
            int i13 = 0;
            int i14 = 0;
            while (true) {
                int[] iArr2 = this.f389766b;
                if (i13 >= iArr2.length) {
                    return new a(iArr, new Random(this.f389765a.nextLong()));
                }
                int i15 = iArr2[i13];
                if (i15 < 0 || i15 >= i12) {
                    int i16 = i13 - i14;
                    if (i15 >= 0) {
                        i15 -= i12;
                    }
                    iArr[i16] = i15;
                } else {
                    i14++;
                }
                i13++;
            }
        }

        private a(int[] iArr, Random random) {
            this.f389766b = iArr;
            this.f389765a = random;
            this.f389767c = new int[iArr.length];
            for (int i12 = 0; i12 < iArr.length; i12++) {
                this.f389767c[iArr[i12]] = i12;
            }
        }

        @Override // com.yandex.mobile.ads.impl.s31
        public final a d() {
            return new a(new int[0], new Random(this.f389765a.nextLong()));
        }

        private static int[] a(Random random) {
            return new int[0];
        }
    }

    int a();

    int a(int i12);

    int b();

    a b(int i12);

    int c();

    a c(int i12);

    int d(int i12);

    a d();
}
