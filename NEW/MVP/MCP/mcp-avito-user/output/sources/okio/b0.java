package okio;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.s0;

/* compiled from: SegmentedByteString.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lokio/b0;", "Lokio/o;", "Ljava/lang/Object;", "writeReplace", "()Ljava/lang/Object;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class b0 extends C44805o {

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final transient byte[][] f420063g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final transient int[] f420064h;

    public b0(@Y61.k byte[][] bArr, @Y61.k int[] iArr) {
        super(C44805o.f420140f.data);
        this.f420063g = bArr;
        this.f420064h = iArr;
    }

    private final Object writeReplace() {
        return v();
    }

    @Override // okio.C44805o
    @Y61.k
    public final String a() {
        return v().a();
    }

    @Override // okio.C44805o
    @Y61.k
    public final C44805o c(@Y61.k String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.f420063g;
        int length = bArr.length;
        int i12 = 0;
        int i13 = 0;
        while (i12 < length) {
            int[] iArr = this.f420064h;
            int i14 = iArr[length + i12];
            int i15 = iArr[i12];
            messageDigest.update(bArr[i12], i14, i15 - i13);
            i12++;
            i13 = i15;
        }
        return new C44805o(messageDigest.digest());
    }

    @Override // okio.C44805o
    public final int d() {
        return this.f420064h[this.f420063g.length - 1];
    }

    @Override // okio.C44805o
    @Y61.k
    public final String e() {
        return v().e();
    }

    @Override // okio.C44805o
    public final boolean equals(@Y61.l Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C44805o) {
            C44805o c44805o = (C44805o) obj;
            if (c44805o.d() == d() && n(0, c44805o, d())) {
                return true;
            }
        }
        return false;
    }

    @Override // okio.C44805o
    public final int f(int i12, @Y61.k byte[] bArr) {
        return v().f(i12, bArr);
    }

    @Override // okio.C44805o
    public final int hashCode() {
        int i12 = this.f420142c;
        if (i12 != 0) {
            return i12;
        }
        byte[][] bArr = this.f420063g;
        int length = bArr.length;
        int i13 = 0;
        int i14 = 1;
        int i15 = 0;
        while (i13 < length) {
            int[] iArr = this.f420064h;
            int i16 = iArr[length + i13];
            int i17 = iArr[i13];
            byte[] bArr2 = bArr[i13];
            int i18 = (i17 - i15) + i16;
            while (i16 < i18) {
                i14 = (i14 * 31) + bArr2[i16];
                i16++;
            }
            i13++;
            i15 = i17;
        }
        this.f420142c = i14;
        return i14;
    }

    @Override // okio.C44805o
    @Y61.k
    /* renamed from: i */
    public final byte[] getData() {
        return s();
    }

    @Override // okio.C44805o
    public final byte k(int i12) {
        byte[][] bArr = this.f420063g;
        int length = bArr.length - 1;
        int[] iArr = this.f420064h;
        C44799i.b(iArr[length], i12, 1L);
        int iA2 = okio.internal.k.a(this, i12);
        return bArr[iA2][(i12 - (iA2 == 0 ? 0 : iArr[iA2 - 1])) + iArr[bArr.length + iA2]];
    }

    @Override // okio.C44805o
    public final int l(int i12, @Y61.k byte[] bArr) {
        return v().l(i12, bArr);
    }

    @Override // okio.C44805o
    public final boolean m(int i12, int i13, int i14, @Y61.k byte[] bArr) {
        if (i12 < 0 || i12 > d() - i14 || i13 < 0 || i13 > bArr.length - i14) {
            return false;
        }
        int i15 = i14 + i12;
        int iA2 = okio.internal.k.a(this, i12);
        while (i12 < i15) {
            int[] iArr = this.f420064h;
            int i16 = iA2 == 0 ? 0 : iArr[iA2 - 1];
            int i17 = iArr[iA2] - i16;
            byte[][] bArr2 = this.f420063g;
            int i18 = iArr[bArr2.length + iA2];
            int iMin = Math.min(i15, i17 + i16) - i12;
            if (!C44799i.a(bArr2[iA2], (i12 - i16) + i18, bArr, i13, iMin)) {
                return false;
            }
            i13 += iMin;
            i12 += iMin;
            iA2++;
        }
        return true;
    }

    @Override // okio.C44805o
    public final boolean n(int i12, @Y61.k C44805o c44805o, int i13) {
        if (i12 < 0 || i12 > d() - i13) {
            return false;
        }
        int i14 = i13 + i12;
        int iA2 = okio.internal.k.a(this, i12);
        int i15 = 0;
        while (i12 < i14) {
            int[] iArr = this.f420064h;
            int i16 = iA2 == 0 ? 0 : iArr[iA2 - 1];
            int i17 = iArr[iA2] - i16;
            byte[][] bArr = this.f420063g;
            int i18 = iArr[bArr.length + iA2];
            int iMin = Math.min(i14, i17 + i16) - i12;
            if (!c44805o.m(i15, (i12 - i16) + i18, iMin, bArr[iA2])) {
                return false;
            }
            i15 += iMin;
            i12 += iMin;
            iA2++;
        }
        return true;
    }

    @Override // okio.C44805o
    @Y61.k
    public final String o(@Y61.k Charset charset) {
        return v().o(charset);
    }

    @Override // okio.C44805o
    @Y61.k
    public final C44805o p(int i12, int i13) {
        if (i13 == C44799i.f420069b) {
            i13 = d();
        }
        if (i12 < 0) {
            throw new IllegalArgumentException(androidx.camera.camera2.internal.G.e(i12, "beginIndex=", " < 0").toString());
        }
        if (i13 > d()) {
            StringBuilder sbJ = androidx.camera.camera2.internal.G.j(i13, "endIndex=", " > length(");
            sbJ.append(d());
            sbJ.append(')');
            throw new IllegalArgumentException(sbJ.toString().toString());
        }
        int i14 = i13 - i12;
        if (i14 < 0) {
            throw new IllegalArgumentException(androidx.compose.foundation.H.j(i13, i12, "endIndex=", " < beginIndex=").toString());
        }
        if (i12 == 0 && i13 == d()) {
            return this;
        }
        if (i12 == i13) {
            return C44805o.f420140f;
        }
        int iA2 = okio.internal.k.a(this, i12);
        int iA3 = okio.internal.k.a(this, i13 - 1);
        byte[][] bArr = this.f420063g;
        byte[][] bArr2 = (byte[][]) C42756l.w(iA2, iA3 + 1, bArr);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.f420064h;
        if (iA2 <= iA3) {
            int i15 = iA2;
            int i16 = 0;
            while (true) {
                iArr[i16] = Math.min(iArr2[i15] - i12, i14);
                int i17 = i16 + 1;
                iArr[i16 + bArr2.length] = iArr2[bArr.length + i15];
                if (i15 == iA3) {
                    break;
                }
                i15++;
                i16 = i17;
            }
        }
        int i18 = iA2 != 0 ? iArr2[iA2 - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i12 - i18) + iArr[length];
        return new b0(bArr2, iArr);
    }

    @Override // okio.C44805o
    @Y61.k
    public final C44805o r() {
        return v().r();
    }

    @Override // okio.C44805o
    @Y61.k
    public final byte[] s() {
        byte[] bArr = new byte[d()];
        byte[][] bArr2 = this.f420063g;
        int length = bArr2.length;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < length) {
            int[] iArr = this.f420064h;
            int i15 = iArr[length + i12];
            int i16 = iArr[i12];
            int i17 = i16 - i13;
            C42756l.l(bArr2[i12], i14, bArr, i15, i15 + i17);
            i14 += i17;
            i12++;
            i13 = i16;
        }
        return bArr;
    }

    @Override // okio.C44805o
    @Y61.k
    public final String toString() {
        return v().toString();
    }

    @Override // okio.C44805o
    public final void u(int i12, @Y61.k C44802l c44802l) {
        int iA2 = okio.internal.k.a(this, 0);
        int i13 = 0;
        while (i13 < i12) {
            int[] iArr = this.f420064h;
            int i14 = iA2 == 0 ? 0 : iArr[iA2 - 1];
            int i15 = iArr[iA2] - i14;
            byte[][] bArr = this.f420063g;
            int i16 = iArr[bArr.length + iA2];
            int iMin = Math.min(i12, i15 + i14) - i13;
            int i17 = (i13 - i14) + i16;
            Z z12 = new Z(bArr[iA2], i17, i17 + iMin, true, false);
            Z z13 = c44802l.f420124b;
            if (z13 == null) {
                z12.f420056g = z12;
                z12.f420055f = z12;
                c44802l.f420124b = z12;
            } else {
                z13.f420056g.b(z12);
            }
            i13 += iMin;
            iA2++;
        }
        c44802l.f420125c += i12;
    }

    public final C44805o v() {
        return new C44805o(s());
    }
}
