package defpackage;

import android.os.Looper;
import com.google.android.exoplayer2.drm.DrmSession$DrmSessionException;
import com.google.android.exoplayer2.drm.UnsupportedDrmException;

/* loaded from: classes.dex */
public final class g55 implements j55 {
    @Override // defpackage.j55
    public final mc5 a(lk6 lk6Var, gf6 gf6Var) {
        if (gf6Var.y0 == null) {
            return null;
        }
        return new mc5(13, new DrmSession$DrmSessionException(new UnsupportedDrmException(), 6001));
    }

    @Override // defpackage.j55
    public final int b(gf6 gf6Var) {
        return gf6Var.y0 != null ? 1 : 0;
    }

    @Override // defpackage.j55
    public final void c(Looper looper, m4c m4cVar) {
    }
}
