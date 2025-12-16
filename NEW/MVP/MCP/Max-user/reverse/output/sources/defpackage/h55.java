package defpackage;

import android.os.Looper;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;

/* loaded from: classes.dex */
public final class h55 implements k55 {
    @Override // defpackage.k55
    public final z45 a(d55 d55Var, hf6 hf6Var) {
        if (hf6Var.r == null) {
            return null;
        }
        return new jh5(new DrmSession$DrmSessionException(6001, new UnsupportedDrmException()));
    }

    @Override // defpackage.k55
    public final void c(Looper looper, n4c n4cVar) {
    }

    @Override // defpackage.k55
    public final int d(hf6 hf6Var) {
        return hf6Var.r != null ? 1 : 0;
    }
}
