package androidx.media3.exoplayer.source;

import java.util.Arrays;
import java.util.Random;

/* compiled from: ShuffleOrder.java */
@androidx.media3.common.util.J
/* loaded from: classes.dex */
public interface S {

    /* compiled from: ShuffleOrder.java */
    public static class a implements S {

        /* renamed from: a, reason: collision with root package name */
        public final Random f49646a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f49647b;

        /* renamed from: c, reason: collision with root package name */
        public final int[] f49648c;

        public a() {
            this(new Random());
        }

        @Override // androidx.media3.exoplayer.source.S
        public final int a(int i12) {
            int i13 = this.f49648c[i12] - 1;
            if (i13 >= 0) {
                return this.f49647b[i13];
            }
            return -1;
        }

        @Override // androidx.media3.exoplayer.source.S
        public final int b() {
            int[] iArr = this.f49647b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // androidx.media3.exoplayer.source.S
        public final S c() {
            return new a(new Random(this.f49646a.nextLong()));
        }

        @Override // androidx.media3.exoplayer.source.S
        public final int d(int i12) {
            int i13 = this.f49648c[i12] + 1;
            int[] iArr = this.f49647b;
            if (i13 < iArr.length) {
                return iArr[i13];
            }
            return -1;
        }

        @Override // androidx.media3.exoplayer.source.S
        public final int e() {
            int[] iArr = this.f49647b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // androidx.media3.exoplayer.source.S
        public final S f(int i12, int i13) {
            int i14 = i13 - i12;
            int[] iArr = this.f49647b;
            int[] iArr2 = new int[iArr.length - i14];
            int i15 = 0;
            for (int i16 = 0; i16 < iArr.length; i16++) {
                int i17 = iArr[i16];
                if (i17 < i12 || i17 >= i13) {
                    int i18 = i16 - i15;
                    if (i17 >= i12) {
                        i17 -= i14;
                    }
                    iArr2[i18] = i17;
                } else {
                    i15++;
                }
            }
            return new a(iArr2, new Random(this.f49646a.nextLong()));
        }

        @Override // androidx.media3.exoplayer.source.S
        public final S g(int i12, int i13) {
            int[] iArr;
            Random random;
            int[] iArr2 = new int[i13];
            int[] iArr3 = new int[i13];
            int i14 = 0;
            while (true) {
                iArr = this.f49647b;
                random = this.f49646a;
                if (i14 >= i13) {
                    break;
                }
                iArr2[i14] = random.nextInt(iArr.length + 1);
                int i15 = i14 + 1;
                int iNextInt = random.nextInt(i15);
                iArr3[i14] = iArr3[iNextInt];
                iArr3[iNextInt] = i14 + i12;
                i14 = i15;
            }
            Arrays.sort(iArr2);
            int[] iArr4 = new int[iArr.length + i13];
            int i16 = 0;
            int i17 = 0;
            for (int i18 = 0; i18 < iArr.length + i13; i18++) {
                if (i16 >= i13 || i17 != iArr2[i16]) {
                    int i19 = i17 + 1;
                    int i22 = iArr[i17];
                    iArr4[i18] = i22;
                    if (i22 >= i12) {
                        iArr4[i18] = i22 + i13;
                    }
                    i17 = i19;
                } else {
                    iArr4[i18] = iArr3[i16];
                    i16++;
                }
            }
            return new a(iArr4, new Random(random.nextLong()));
        }

        @Override // androidx.media3.exoplayer.source.S
        public final int getLength() {
            return this.f49647b.length;
        }

        public a(int[] iArr, Random random) {
            this.f49647b = iArr;
            this.f49646a = random;
            this.f49648c = new int[iArr.length];
            for (int i12 = 0; i12 < iArr.length; i12++) {
                this.f49648c[iArr[i12]] = i12;
            }
        }

        public a(Random random) {
            this(new int[0], random);
        }
    }

    /* compiled from: ShuffleOrder.java */
    public static final class b implements S {

        /* renamed from: a, reason: collision with root package name */
        public final int f49649a;

        public b(int i12) {
            this.f49649a = i12;
        }

        @Override // androidx.media3.exoplayer.source.S
        public final int a(int i12) {
            int i13 = i12 - 1;
            if (i13 >= 0) {
                return i13;
            }
            return -1;
        }

        @Override // androidx.media3.exoplayer.source.S
        public final int b() {
            int i12 = this.f49649a;
            if (i12 > 0) {
                return i12 - 1;
            }
            return -1;
        }

        @Override // androidx.media3.exoplayer.source.S
        public final S c() {
            return new b(0);
        }

        @Override // androidx.media3.exoplayer.source.S
        public final int d(int i12) {
            int i13 = i12 + 1;
            if (i13 < this.f49649a) {
                return i13;
            }
            return -1;
        }

        @Override // androidx.media3.exoplayer.source.S
        public final int e() {
            return this.f49649a > 0 ? 0 : -1;
        }

        @Override // androidx.media3.exoplayer.source.S
        public final S f(int i12, int i13) {
            return new b((this.f49649a - i13) + i12);
        }

        @Override // androidx.media3.exoplayer.source.S
        public final S g(int i12, int i13) {
            return new b(this.f49649a + i13);
        }

        @Override // androidx.media3.exoplayer.source.S
        public final int getLength() {
            return this.f49649a;
        }
    }

    int a(int i12);

    int b();

    S c();

    int d(int i12);

    int e();

    S f(int i12, int i13);

    S g(int i12, int i13);

    int getLength();
}
