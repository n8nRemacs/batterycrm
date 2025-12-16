package Xg;

import Xg.C17004a;
import Y61.k;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: GenericGFPoly.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LXg/b;", "", "_avito_barcode-encoder_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Xg.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C17005b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C17004a f19013a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final int[] f19014b;

    public C17005b(@k C17004a c17004a, @k int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f19013a = c17004a;
        int length = iArr.length;
        int i12 = 1;
        if (length <= 1 || iArr[0] != 0) {
            this.f19014b = iArr;
            return;
        }
        while (i12 < length && iArr[i12] == 0) {
            i12++;
        }
        if (i12 == length) {
            this.f19014b = new int[]{0};
            return;
        }
        int i13 = length - i12;
        int[] iArr2 = new int[i13];
        this.f19014b = iArr2;
        System.arraycopy(iArr, i12, iArr2, 0, i13);
    }

    public final C17005b a(C17005b c17005b) {
        C17004a c17004a = c17005b.f19013a;
        C17004a c17004a2 = this.f19013a;
        if (!L.f(c17004a2, c17004a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (c()) {
            return c17005b;
        }
        if (c17005b.c()) {
            return this;
        }
        int[] iArr = this.f19014b;
        int length = iArr.length;
        int[] iArr2 = c17005b.f19014b;
        if (length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length2 = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length2);
        int length3 = iArr.length;
        for (int i12 = length2; i12 < length3; i12++) {
            C17004a.C1345a c1345a = C17004a.f19008d;
            int i13 = iArr2[i12 - length2];
            int i14 = iArr[i12];
            c1345a.getClass();
            iArr3[i12] = i13 ^ i14;
        }
        return new C17005b(c17004a2, iArr3);
    }

    public final int b() {
        return this.f19014b.length - 1;
    }

    public final boolean c() {
        return this.f19014b[0] == 0;
    }

    @k
    public final C17005b d(int i12, int i13) {
        if (i12 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        C17004a c17004a = this.f19013a;
        if (i13 == 0) {
            return c17004a.f19012c;
        }
        int[] iArr = this.f19014b;
        int length = iArr.length;
        int[] iArr2 = new int[i12 + length];
        for (int i14 = 0; i14 < length; i14++) {
            iArr2[i14] = c17004a.a(iArr[i14], i13);
        }
        return new C17005b(c17004a, iArr2);
    }

    @k
    public final String toString() {
        if (c()) {
            return "0";
        }
        StringBuilder sb2 = new StringBuilder(b() * 8);
        for (int iB2 = b(); -1 < iB2; iB2--) {
            int[] iArr = this.f19014b;
            int i12 = iArr[(iArr.length - 1) - iB2];
            if (i12 != 0) {
                if (i12 < 0) {
                    if (iB2 == b()) {
                        sb2.append("-");
                    } else {
                        sb2.append(" - ");
                    }
                    i12 = -i12;
                } else if (sb2.length() > 0) {
                    sb2.append(" + ");
                }
                if (iB2 == 0 || i12 != 1) {
                    C17004a c17004a = this.f19013a;
                    if (i12 == 0) {
                        c17004a.getClass();
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                    int i13 = c17004a.f19011b[i12];
                    if (i13 == 0) {
                        sb2.append('1');
                    } else if (i13 != 1) {
                        sb2.append("a^");
                        sb2.append(i13);
                    } else {
                        sb2.append('a');
                    }
                }
                if (iB2 != 0) {
                    if (iB2 == 1) {
                        sb2.append('x');
                    } else {
                        sb2.append("x^");
                        sb2.append(iB2);
                    }
                }
            }
        }
        return sb2.toString();
    }
}
