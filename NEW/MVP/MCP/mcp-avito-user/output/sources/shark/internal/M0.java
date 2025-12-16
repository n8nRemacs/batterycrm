package shark.internal;

import java.util.Arrays;
import jc1.C42359b;
import jc1.InterfaceC42358a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: UnsortedByteEntries.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lshark/internal/M0;", "", "a", "shark-graph"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class M0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f438392a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f438393b;

    /* renamed from: c, reason: collision with root package name */
    public final a f438394c;

    /* renamed from: d, reason: collision with root package name */
    public int f438395d;

    /* renamed from: e, reason: collision with root package name */
    public int f438396e;

    /* renamed from: f, reason: collision with root package name */
    public int f438397f;

    /* renamed from: g, reason: collision with root package name */
    public final int f438398g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f438399h;

    /* renamed from: i, reason: collision with root package name */
    public final int f438400i;

    /* renamed from: j, reason: collision with root package name */
    public final double f438401j;

    /* compiled from: UnsortedByteEntries.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/internal/M0$a;", "", "shark-graph"}, k = 1, mv = {1, 4, 1})
    public final class a {
        public a() {
        }

        public final void a(long j12) {
            M0 m02 = M0.this;
            if (!m02.f438399h) {
                b((int) j12);
                return;
            }
            int i12 = m02.f438395d;
            m02.f438395d = i12 + 8;
            int i13 = m02.f438392a;
            if (i12 < 0 || i12 > i13 - 8) {
                StringBuilder sbJ = androidx.camera.camera2.internal.G.j(i12, "Index ", " should be between 0 and ");
                sbJ.append(i13 - 8);
                throw new IllegalArgumentException(sbJ.toString().toString());
            }
            int iB2 = androidx.compose.foundation.H.b(m02.f438396e, 1, i13, i12);
            byte[] bArr = m02.f438393b;
            if (bArr == null) {
                kotlin.jvm.internal.L.k();
                throw null;
            }
            bArr[iB2] = (byte) ((j12 >>> 56) & 255);
            bArr[iB2 + 1] = (byte) ((j12 >>> 48) & 255);
            bArr[iB2 + 2] = (byte) ((j12 >>> 40) & 255);
            bArr[iB2 + 3] = (byte) ((j12 >>> 32) & 255);
            bArr[iB2 + 4] = (byte) ((j12 >>> 24) & 255);
            bArr[iB2 + 5] = (byte) ((j12 >>> 16) & 255);
            bArr[iB2 + 6] = (byte) ((j12 >>> 8) & 255);
            bArr[iB2 + 7] = (byte) (j12 & 255);
        }

        public final void b(int i12) {
            M0 m02 = M0.this;
            int i13 = m02.f438395d;
            m02.f438395d = i13 + 4;
            if (!(i13 >= 0 && i13 <= m02.f438392a + (-4))) {
                StringBuilder sbJ = androidx.camera.camera2.internal.G.j(i13, "Index ", " should be between 0 and ");
                sbJ.append(m02.f438392a - 4);
                throw new IllegalArgumentException(sbJ.toString().toString());
            }
            int i14 = ((m02.f438396e - 1) * m02.f438392a) + i13;
            byte[] bArr = m02.f438393b;
            if (bArr == null) {
                kotlin.jvm.internal.L.k();
                throw null;
            }
            bArr[i14] = (byte) ((i12 >>> 24) & 255);
            bArr[i14 + 1] = (byte) ((i12 >>> 16) & 255);
            bArr[i14 + 2] = (byte) ((i12 >>> 8) & 255);
            bArr[i14 + 3] = (byte) (i12 & 255);
        }

        public final void c(int i12, long j12) {
            M0 m02 = M0.this;
            int i13 = m02.f438395d;
            m02.f438395d = i13 + i12;
            if (!(i13 >= 0 && i13 <= m02.f438392a - i12)) {
                StringBuilder sbJ = androidx.camera.camera2.internal.G.j(i13, "Index ", " should be between 0 and ");
                sbJ.append(m02.f438392a - i12);
                throw new IllegalArgumentException(sbJ.toString().toString());
            }
            int i14 = ((m02.f438396e - 1) * m02.f438392a) + i13;
            byte[] bArr = m02.f438393b;
            if (bArr == null) {
                kotlin.jvm.internal.L.k();
                throw null;
            }
            int i15 = (i12 - 1) * 8;
            while (i15 >= 8) {
                bArr[i14] = (byte) (255 & (j12 >>> i15));
                i15 -= 8;
                i14++;
            }
            bArr[i14] = (byte) (j12 & 255);
        }
    }

    /* compiled from: UnsortedByteEntries.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0001H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "entrySize", "o1Array", "", "o1Index", "o2Array", "o2Index", "compare"}, k = 3, mv = {1, 4, 1})
    public static final class b implements InterfaceC42358a {
        public b() {
        }

        @Override // jc1.InterfaceC42358a
        public final int a(@Y61.k byte[] bArr, int i12, @Y61.k byte[] bArr2, int i13, int i14) {
            M0 m02 = M0.this;
            return m02.f438399h ? (M0.b(m02, bArr, i13 * i12) > M0.b(m02, bArr2, i14 * i12) ? 1 : (M0.b(m02, bArr, i13 * i12) == M0.b(m02, bArr2, i14 * i12) ? 0 : -1)) : kotlin.jvm.internal.L.g(M0.a(m02, bArr, i13 * i12), M0.a(m02, bArr2, i14 * i12));
        }
    }

    public M0(int i12, boolean z12, int i13, double d12, int i14, C42822w c42822w) {
        i13 = (i14 & 4) != 0 ? 4 : i13;
        d12 = (i14 & 8) != 0 ? 2.0d : d12;
        this.f438398g = i12;
        this.f438399h = z12;
        this.f438400i = i13;
        this.f438401j = d12;
        this.f438392a = i12 + (z12 ? 8 : 4);
        this.f438394c = new a();
    }

    public static final int a(M0 m02, byte[] bArr, int i12) {
        m02.getClass();
        int i13 = i12 + 2;
        return ((bArr[i12 + 1] & 255) << 16) | ((bArr[i12] & 255) << 24) | ((bArr[i13] & 255) << 8) | (bArr[i12 + 3] & 255);
    }

    public static final long b(M0 m02, byte[] bArr, int i12) {
        m02.getClass();
        return (bArr[i12 + 7] & 255) | ((bArr[i12] & 255) << 56) | ((bArr[i12 + 1] & 255) << 48) | ((bArr[i12 + 2] & 255) << 40) | ((bArr[i12 + 3] & 255) << 32) | ((bArr[i12 + 4] & 255) << 24) | ((bArr[i12 + 5] & 255) << 16) | ((bArr[i12 + 6] & 255) << 8);
    }

    @Y61.k
    public final a c(long j12) {
        byte[] bArr = this.f438393b;
        int i12 = this.f438392a;
        if (bArr == null) {
            int i13 = this.f438400i;
            this.f438397f = i13;
            this.f438393b = new byte[i13 * i12];
        } else {
            int i14 = this.f438397f;
            int i15 = this.f438396e;
            if (i14 == i15) {
                int i16 = (int) (i14 * this.f438401j);
                byte[] bArr2 = new byte[i16 * i12];
                System.arraycopy(bArr, 0, bArr2, 0, i15 * i12);
                this.f438393b = bArr2;
                this.f438397f = i16;
            }
        }
        this.f438396e++;
        this.f438395d = 0;
        a aVar = this.f438394c;
        aVar.a(j12);
        return aVar;
    }

    @Y61.k
    public final H0 d() {
        int i12;
        C42359b c42359b;
        byte[] bArr;
        int[] iArr;
        byte[] bArr2;
        int i13 = this.f438396e;
        int i14 = this.f438398g;
        boolean z12 = this.f438399h;
        if (i13 == 0) {
            return new H0(i14, new byte[0], z12);
        }
        byte[] bArr3 = this.f438393b;
        if (bArr3 == null) {
            kotlin.jvm.internal.L.k();
            throw null;
        }
        C42359b.a aVar = C42359b.f405740i;
        b bVar = new b();
        aVar.getClass();
        int length = bArr3.length;
        int i15 = this.f438392a;
        int i16 = length / i15;
        if (i13 > i16) {
            throw new ArrayIndexOutOfBoundsException(androidx.compose.foundation.H.j(i13, i16, "start < 0 || end > len. start=0, end=", ", len="));
        }
        if (i13 < 0) {
            throw new IllegalArgumentException(AK.c.g(i13, "start > end: 0 > "));
        }
        if (i13 < 2) {
            bArr2 = bArr3;
        } else {
            int i17 = 0;
            if (i13 < 32) {
                C42359b.a.c(bArr3, 0, i13, C42359b.a.d(bArr3, 0, i13, i15, bVar), i15, bVar);
                bArr2 = bArr3;
            } else {
                C42359b c42359b2 = new C42359b(bArr3, bVar, i15, null);
                int i18 = i13;
                int i19 = 0;
                while (i18 >= 32) {
                    i19 |= i18 & 1;
                    i18 >>= 1;
                }
                int i22 = i18 + i19;
                int i23 = i13;
                while (true) {
                    int iD2 = C42359b.a.d(bArr3, i17, i13, i15, bVar);
                    if (iD2 < i22) {
                        int i24 = i23 <= i22 ? i23 : i22;
                        i12 = i23;
                        c42359b = c42359b2;
                        bArr = bArr3;
                        C42359b.a.c(bArr3, i17, i17 + i24, i17 + iD2, i15, bVar);
                        iD2 = i24;
                    } else {
                        i12 = i23;
                        c42359b = c42359b2;
                        bArr = bArr3;
                    }
                    int i25 = c42359b.f405743c;
                    c42359b.f405744d[i25] = i17;
                    iArr = c42359b.f405745e;
                    iArr[i25] = iD2;
                    int i26 = 1;
                    c42359b.f405743c = i25 + 1;
                    while (true) {
                        int i27 = c42359b.f405743c;
                        if (i27 <= i26) {
                            break;
                        }
                        int i28 = i27 - 2;
                        if ((i28 >= i26 && iArr[i27 - 3] <= iArr[i28] + iArr[i27 - 1]) || (i28 >= 2 && iArr[i27 - 4] <= iArr[i28] + iArr[i27 - 3])) {
                            int i29 = i27 - 3;
                            if (iArr[i29] < iArr[i27 - 1]) {
                                i28 = i29;
                            }
                        } else if (iArr[i28] > iArr[i27 - 1]) {
                            break;
                        }
                        c42359b.b(i28);
                        i26 = 1;
                    }
                    i17 += iD2;
                    int i32 = i12 - iD2;
                    if (i32 == 0) {
                        break;
                    }
                    c42359b2 = c42359b;
                    i23 = i32;
                    bArr3 = bArr;
                }
                while (true) {
                    int i33 = c42359b.f405743c;
                    if (i33 <= 1) {
                        break;
                    }
                    int i34 = i33 - 2;
                    if (i34 > 0) {
                        int i35 = i33 - 3;
                        if (iArr[i35] < iArr[i33 - 1]) {
                            i34 = i35;
                        }
                    }
                    c42359b.b(i34);
                }
                bArr2 = bArr;
            }
        }
        int length2 = bArr2.length;
        int i36 = this.f438396e * this.f438392a;
        byte[] bArrCopyOf = length2 > i36 ? Arrays.copyOf(bArr2, i36) : bArr2;
        this.f438393b = null;
        this.f438396e = 0;
        return new H0(i14, bArrCopyOf, z12);
    }
}
