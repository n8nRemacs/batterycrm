package kotlin.random;

import Y61.k;
import androidx.appcompat.app.r;
import androidx.camera.camera2.internal.G;
import java.io.Serializable;
import kotlin.InterfaceC42733c0;
import kotlin.Metadata;
import kotlin.internal.m;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: Random.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lkotlin/random/f;", "", "<init>", "()V", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42733c0
/* loaded from: classes8.dex */
public abstract class f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f406882b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final f f406883c = m.f406763a.b();

    /* compiled from: Random.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lkotlin/random/f$a;", "Lkotlin/random/f;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "<init>", "()V", "", "writeReplace", "()Ljava/lang/Object;", "defaultRandom", "Lkotlin/random/f;", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends f implements Serializable {

        /* compiled from: Random.kt */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lkotlin/random/f$a$a;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "<init>", "()V", "", "readResolve", "()Ljava/lang/Object;", "", "serialVersionUID", "J", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: kotlin.random.f$a$a, reason: collision with other inner class name */
        public static final class C11638a implements Serializable {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final C11638a f406884b = new C11638a();
            private static final long serialVersionUID = 0;

            private final Object readResolve() {
                return f.f406882b;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        private final Object writeReplace() {
            return C11638a.f406884b;
        }

        @Override // kotlin.random.f
        public final int a(int i12) {
            return f.f406883c.a(i12);
        }

        @Override // kotlin.random.f
        public final boolean b() {
            return f.f406883c.b();
        }

        @Override // kotlin.random.f
        @k
        public final byte[] c(int i12, @k byte[] bArr) {
            return f.f406883c.c(i12, bArr);
        }

        @Override // kotlin.random.f
        @k
        public final byte[] d(@k byte[] bArr) {
            return f.f406883c.d(bArr);
        }

        @Override // kotlin.random.f
        public final double e() {
            return f.f406883c.e();
        }

        @Override // kotlin.random.f
        public final double f(double d12, double d13) {
            return f.f406883c.f(d12, d13);
        }

        @Override // kotlin.random.f
        public final double g() {
            return f.f406883c.g();
        }

        @Override // kotlin.random.f
        public final float h() {
            return f.f406883c.h();
        }

        @Override // kotlin.random.f
        public final int i() {
            return f.f406883c.i();
        }

        @Override // kotlin.random.f
        public final int k(int i12) {
            return f.f406883c.k(i12);
        }

        @Override // kotlin.random.f
        public final int l(int i12, int i13) {
            return f.f406883c.l(i12, i13);
        }

        @Override // kotlin.random.f
        public final long m() {
            return f.f406883c.m();
        }

        @Override // kotlin.random.f
        public final long n(long j12) {
            return f.f406883c.n(j12);
        }

        @Override // kotlin.random.f
        public final long o(long j12, long j13) {
            return f.f406883c.o(j12, j13);
        }

        public a() {
        }
    }

    public abstract int a(int i12);

    public boolean b() {
        return a(1) != 0;
    }

    @k
    public byte[] c(int i12, @k byte[] bArr) {
        if (bArr.length < 0 || i12 < 0 || i12 > bArr.length) {
            throw new IllegalArgumentException(r.t(G.j(i12, "fromIndex (0) or toIndex (", ") are out of range: 0.."), bArr.length, '.').toString());
        }
        if (i12 < 0) {
            throw new IllegalArgumentException(G.e(i12, "fromIndex (0) must be not greater than toIndex (", ").").toString());
        }
        int i13 = i12 / 4;
        int i14 = 0;
        for (int i15 = 0; i15 < i13; i15++) {
            int i16 = i();
            bArr[i14] = (byte) i16;
            bArr[i14 + 1] = (byte) (i16 >>> 8);
            bArr[i14 + 2] = (byte) (i16 >>> 16);
            bArr[i14 + 3] = (byte) (i16 >>> 24);
            i14 += 4;
        }
        int i17 = i12 - i14;
        int iA2 = a(i17 * 8);
        for (int i18 = 0; i18 < i17; i18++) {
            bArr[i14 + i18] = (byte) (iA2 >>> (i18 * 8));
        }
        return bArr;
    }

    @k
    public byte[] d(@k byte[] bArr) {
        return c(bArr.length, bArr);
    }

    public double e() {
        return ((a(26) << 27) + a(27)) / 9.007199254740992E15d;
    }

    public double f(double d12, double d13) {
        double dE2;
        if (d13 <= d12) {
            throw new IllegalArgumentException(g.b(Double.valueOf(d12), Double.valueOf(d13)).toString());
        }
        double d14 = d13 - d12;
        if (!Double.isInfinite(d14) || Double.isInfinite(d12) || Double.isNaN(d12) || Double.isInfinite(d13) || Double.isNaN(d13)) {
            dE2 = d12 + (e() * d14);
        } else {
            double d15 = 2;
            double dE3 = ((d13 / d15) - (d12 / d15)) * e();
            dE2 = d12 + dE3 + dE3;
        }
        return dE2 >= d13 ? Math.nextAfter(d13, Double.NEGATIVE_INFINITY) : dE2;
    }

    public double g() {
        return f(0.0d, 100.0d);
    }

    public float h() {
        return a(24) / 1.6777216E7f;
    }

    public int i() {
        return a(32);
    }

    public int k(int i12) {
        return l(0, i12);
    }

    public int l(int i12, int i13) {
        int i14;
        int i15;
        int iA2;
        if (i13 <= i12) {
            throw new IllegalArgumentException(g.b(Integer.valueOf(i12), Integer.valueOf(i13)).toString());
        }
        int i16 = i13 - i12;
        if (i16 > 0 || i16 == Integer.MIN_VALUE) {
            if (((-i16) & i16) == i16) {
                iA2 = a(31 - Integer.numberOfLeadingZeros(i16));
            } else {
                do {
                    i14 = i() >>> 1;
                    i15 = i14 % i16;
                } while ((i16 - 1) + (i14 - i15) < 0);
                iA2 = i15;
            }
            return i12 + iA2;
        }
        while (true) {
            int i17 = i();
            if (i12 <= i17 && i17 < i13) {
                return i17;
            }
        }
    }

    public long m() {
        return (i() << 32) + i();
    }

    public long n(long j12) {
        return o(0L, j12);
    }

    public long o(long j12, long j13) {
        long jM2;
        long j14;
        long jA2;
        int i12;
        if (j13 <= j12) {
            throw new IllegalArgumentException(g.b(Long.valueOf(j12), Long.valueOf(j13)).toString());
        }
        long j15 = j13 - j12;
        if (j15 > 0) {
            if (((-j15) & j15) == j15) {
                int i13 = (int) j15;
                int i14 = (int) (j15 >>> 32);
                if (i13 != 0) {
                    i12 = a(31 - Integer.numberOfLeadingZeros(i13));
                } else if (i14 == 1) {
                    i12 = i();
                } else {
                    jA2 = (a(31 - Integer.numberOfLeadingZeros(i14)) << 32) + (i() & 4294967295L);
                }
                jA2 = i12 & 4294967295L;
            } else {
                do {
                    jM2 = m() >>> 1;
                    j14 = jM2 % j15;
                } while ((j15 - 1) + (jM2 - j14) < 0);
                jA2 = j14;
            }
            return j12 + jA2;
        }
        while (true) {
            long jM3 = m();
            if (j12 <= jM3 && jM3 < j13) {
                return jM3;
            }
        }
    }
}
