package androidx.media3.extractor;

import androidx.media3.common.ParserException;
import androidx.media3.common.util.C23116g;
import androidx.media3.container.b;
import j.P;
import java.util.Collections;
import java.util.List;

/* compiled from: HevcConfig.java */
@androidx.media3.common.util.J
/* loaded from: classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public final List<byte[]> f50346a;

    /* renamed from: b, reason: collision with root package name */
    public final int f50347b;

    /* renamed from: c, reason: collision with root package name */
    public final int f50348c;

    /* renamed from: d, reason: collision with root package name */
    public final int f50349d;

    /* renamed from: e, reason: collision with root package name */
    public final int f50350e;

    /* renamed from: f, reason: collision with root package name */
    public final float f50351f;

    /* renamed from: g, reason: collision with root package name */
    @P
    public final String f50352g;

    public A(List list, int i12, int i13, int i14, int i15, float f12, @P String str) {
        this.f50346a = list;
        this.f50347b = i12;
        this.f50348c = i13;
        this.f50349d = i14;
        this.f50350e = i15;
        this.f50351f = f12;
        this.f50352g = str;
    }

    public static A a(androidx.media3.common.util.z zVar) throws ParserException {
        int i12;
        int i13;
        try {
            zVar.G(21);
            int iU2 = zVar.u() & 3;
            int iU3 = zVar.u();
            int i14 = zVar.f47963b;
            int i15 = 0;
            int i16 = 0;
            for (int i17 = 0; i17 < iU3; i17++) {
                zVar.G(1);
                int iZ2 = zVar.z();
                for (int i18 = 0; i18 < iZ2; i18++) {
                    int iZ3 = zVar.z();
                    i16 += iZ3 + 4;
                    zVar.G(iZ3);
                }
            }
            zVar.F(i14);
            byte[] bArr = new byte[i16];
            int i19 = -1;
            int i22 = -1;
            int i23 = -1;
            float f12 = 1.0f;
            String strA = null;
            int i24 = 0;
            int i25 = 0;
            while (i24 < iU3) {
                int iU4 = zVar.u() & 63;
                int iZ4 = zVar.z();
                int i26 = i15;
                while (i26 < iZ4) {
                    int iZ5 = zVar.z();
                    int i27 = iU3;
                    System.arraycopy(androidx.media3.container.b.f48118a, i15, bArr, i25, 4);
                    int i28 = i25 + 4;
                    System.arraycopy(zVar.f47962a, zVar.f47963b, bArr, i28, iZ5);
                    if (iU4 == 33 && i26 == 0) {
                        b.a aVarC = androidx.media3.container.b.c(i28, i28 + iZ5, bArr);
                        int i29 = aVarC.f48131j;
                        i22 = aVarC.f48132k;
                        i23 = aVarC.f48133l;
                        f12 = aVarC.f48130i;
                        i12 = iU4;
                        i13 = iZ4;
                        i19 = i29;
                        strA = C23116g.a(aVarC.f48122a, aVarC.f48123b, aVarC.f48124c, aVarC.f48125d, aVarC.f48126e, aVarC.f48127f);
                    } else {
                        i12 = iU4;
                        i13 = iZ4;
                    }
                    i25 = i28 + iZ5;
                    zVar.G(iZ5);
                    i26++;
                    iU3 = i27;
                    iU4 = i12;
                    iZ4 = i13;
                    i15 = 0;
                }
                i24++;
                i15 = 0;
            }
            return new A(i16 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), iU2 + 1, i19, i22, i23, f12, strA);
        } catch (ArrayIndexOutOfBoundsException e12) {
            throw ParserException.a("Error parsing HEVC config", e12);
        }
    }
}
