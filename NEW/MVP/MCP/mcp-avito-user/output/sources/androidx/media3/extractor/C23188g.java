package androidx.media3.extractor;

/* compiled from: CeaUtil.java */
@androidx.media3.common.util.J
/* renamed from: androidx.media3.extractor.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23188g {
    public static void a(long j12, androidx.media3.common.util.z zVar, J[] jArr) {
        int i12;
        while (true) {
            if (zVar.a() <= 1) {
                return;
            }
            int i13 = 0;
            while (true) {
                if (zVar.a() == 0) {
                    i12 = -1;
                    break;
                }
                int iU2 = zVar.u();
                i13 += iU2;
                if (iU2 != 255) {
                    i12 = i13;
                    break;
                }
            }
            int i14 = 0;
            while (true) {
                if (zVar.a() == 0) {
                    i14 = -1;
                    break;
                }
                int iU3 = zVar.u();
                i14 += iU3;
                if (iU3 != 255) {
                    break;
                }
            }
            int i15 = zVar.f47963b + i14;
            if (i14 == -1 || i14 > zVar.a()) {
                androidx.media3.common.util.s.g();
                i15 = zVar.f47964c;
            } else if (i12 == 4 && i14 >= 8) {
                int iU4 = zVar.u();
                int iZ2 = zVar.z();
                int iG2 = iZ2 == 49 ? zVar.g() : 0;
                int iU5 = zVar.u();
                if (iZ2 == 47) {
                    zVar.G(1);
                }
                boolean z12 = iU4 == 181 && (iZ2 == 49 || iZ2 == 47) && iU5 == 3;
                if (iZ2 == 49) {
                    z12 &= iG2 == 1195456820;
                }
                if (z12) {
                    b(j12, zVar, jArr);
                }
            }
            zVar.F(i15);
        }
    }

    public static void b(long j12, androidx.media3.common.util.z zVar, J[] jArr) {
        int iU2 = zVar.u();
        if ((iU2 & 64) != 0) {
            zVar.G(1);
            int i12 = (iU2 & 31) * 3;
            int i13 = zVar.f47963b;
            for (J j13 : jArr) {
                zVar.F(i13);
                j13.e(i12, zVar);
                if (j12 != -9223372036854775807L) {
                    j13.f(j12, 1, i12, 0, null);
                }
            }
        }
    }
}
