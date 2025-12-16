package androidx.media3.extractor.ts;

import androidx.media3.common.util.J;

/* compiled from: TsUtil.java */
@J
/* loaded from: classes.dex */
public final class E {
    public static long a(androidx.media3.common.util.z zVar, int i12, int i13) {
        zVar.F(i12);
        if (zVar.a() < 5) {
            return -9223372036854775807L;
        }
        int iG2 = zVar.g();
        if ((8388608 & iG2) != 0 || ((2096896 & iG2) >> 8) != i13 || (iG2 & 32) == 0 || zVar.u() < 7 || zVar.a() < 7 || (zVar.u() & 16) != 16) {
            return -9223372036854775807L;
        }
        zVar.e(0, 6, new byte[6]);
        return ((r0[0] & 255) << 25) | ((r0[1] & 255) << 17) | ((r0[2] & 255) << 9) | ((r0[3] & 255) << 1) | ((r0[4] & 255) >> 7);
    }
}
