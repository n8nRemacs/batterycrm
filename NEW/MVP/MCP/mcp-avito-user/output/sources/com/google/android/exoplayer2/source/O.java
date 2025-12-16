package com.google.android.exoplayer2.source;

import java.util.Arrays;
import java.util.Random;

/* compiled from: ShuffleOrder.java */
/* loaded from: classes6.dex */
public interface O {

    /* compiled from: ShuffleOrder.java */
    public static class a implements O {

        /* renamed from: a, reason: collision with root package name */
        public final Random f346083a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f346084b;

        /* renamed from: c, reason: collision with root package name */
        public final int[] f346085c;

        public a() {
            this(new Random());
        }

        @Override // com.google.android.exoplayer2.source.O
        public final int a(int i12) {
            int i13 = this.f346085c[i12] - 1;
            if (i13 >= 0) {
                return this.f346084b[i13];
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.source.O
        public final int b() {
            int[] iArr = this.f346084b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.source.O
        public final O c() {
            return new a(new Random(this.f346083a.nextLong()));
        }

        @Override // com.google.android.exoplayer2.source.O
        public final int d(int i12) {
            int i13 = this.f346085c[i12] + 1;
            int[] iArr = this.f346084b;
            if (i13 < iArr.length) {
                return iArr[i13];
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.source.O
        public final int e() {
            int[] iArr = this.f346084b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.source.O
        public final O f(int i12) {
            Random random;
            int[] iArr;
            int[] iArr2 = new int[i12];
            int[] iArr3 = new int[i12];
            int i13 = 0;
            while (true) {
                random = this.f346083a;
                iArr = this.f346084b;
                if (i13 >= i12) {
                    break;
                }
                iArr2[i13] = random.nextInt(iArr.length + 1);
                int i14 = i13 + 1;
                int iNextInt = random.nextInt(i14);
                iArr3[i13] = iArr3[iNextInt];
                iArr3[iNextInt] = i13;
                i13 = i14;
            }
            Arrays.sort(iArr2);
            int[] iArr4 = new int[iArr.length + i12];
            int i15 = 0;
            int i16 = 0;
            for (int i17 = 0; i17 < iArr.length + i12; i17++) {
                if (i15 >= i12 || i16 != iArr2[i15]) {
                    int i18 = i16 + 1;
                    int i19 = iArr[i16];
                    iArr4[i17] = i19;
                    if (i19 >= 0) {
                        iArr4[i17] = i19 + i12;
                    }
                    i16 = i18;
                } else {
                    iArr4[i17] = iArr3[i15];
                    i15++;
                }
            }
            return new a(iArr4, new Random(random.nextLong()));
        }

        @Override // com.google.android.exoplayer2.source.O
        public final O g(int i12) {
            int[] iArr = this.f346084b;
            int[] iArr2 = new int[iArr.length - i12];
            int i13 = 0;
            for (int i14 = 0; i14 < iArr.length; i14++) {
                int i15 = iArr[i14];
                if (i15 < 0 || i15 >= i12) {
                    int i16 = i14 - i13;
                    if (i15 >= 0) {
                        i15 -= i12;
                    }
                    iArr2[i16] = i15;
                } else {
                    i13++;
                }
            }
            return new a(iArr2, new Random(this.f346083a.nextLong()));
        }

        @Override // com.google.android.exoplayer2.source.O
        public final int getLength() {
            return this.f346084b.length;
        }

        public a(int[] iArr, Random random) {
            this.f346084b = iArr;
            this.f346083a = random;
            this.f346085c = new int[iArr.length];
            for (int i12 = 0; i12 < iArr.length; i12++) {
                this.f346085c[iArr[i12]] = i12;
            }
        }

        public a(Random random) {
            this(new int[0], random);
        }
    }

    /* compiled from: ShuffleOrder.java */
    public static final class b implements O {

        /* renamed from: a, reason: collision with root package name */
        public final int f346086a;

        public b(int i12) {
            this.f346086a = i12;
        }

        @Override // com.google.android.exoplayer2.source.O
        public final int a(int i12) {
            int i13 = i12 - 1;
            if (i13 >= 0) {
                return i13;
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.source.O
        public final int b() {
            int i12 = this.f346086a;
            if (i12 > 0) {
                return i12 - 1;
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.source.O
        public final O c() {
            return new b(0);
        }

        @Override // com.google.android.exoplayer2.source.O
        public final int d(int i12) {
            int i13 = i12 + 1;
            if (i13 < this.f346086a) {
                return i13;
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.source.O
        public final int e() {
            return this.f346086a > 0 ? 0 : -1;
        }

        @Override // com.google.android.exoplayer2.source.O
        public final O f(int i12) {
            return new b(this.f346086a + i12);
        }

        @Override // com.google.android.exoplayer2.source.O
        public final O g(int i12) {
            return new b(this.f346086a - i12);
        }

        @Override // com.google.android.exoplayer2.source.O
        public final int getLength() {
            return this.f346086a;
        }
    }

    int a(int i12);

    int b();

    O c();

    int d(int i12);

    int e();

    O f(int i12);

    O g(int i12);

    int getLength();
}
