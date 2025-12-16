package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;

/* loaded from: classes.dex */
public abstract class yzi {
    public static long a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        long j = z12 ? 1L : 0L;
        if (z) {
            j |= 2;
        }
        if (z2) {
            j |= 4;
        }
        if (z3) {
            j |= 8;
        }
        if (z4) {
            j |= 16;
        }
        if (z5) {
            j |= 32;
        }
        if (z6) {
            j |= 64;
        }
        if (z7) {
            j |= 128;
        }
        if (z8) {
            j |= 256;
        }
        if (z9) {
            j |= 512;
        }
        if (z10) {
            j |= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        }
        return z11 ? PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH | j : j;
    }

    public static final long b(vgb vgbVar, g2h g2hVar) {
        long j = 0;
        if (g2hVar instanceof cn3) {
            int iF = vgbVar.f();
            Integer numValueOf = Integer.valueOf(iF);
            if (iF <= 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                cn3 cn3Var = (cn3) g2hVar;
                int iMin = Math.min(numValueOf.intValue(), cn3Var.a.size());
                for (int i = 0; i < iMin; i++) {
                    j += ((bn3) cn3Var.a.get(i)).d;
                }
            }
        }
        return j;
    }
}
