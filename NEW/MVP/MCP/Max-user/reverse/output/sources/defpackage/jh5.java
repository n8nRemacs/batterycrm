package defpackage;

import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import java.util.UUID;

/* loaded from: classes.dex */
public final class jh5 implements z45 {
    public final DrmSession$DrmSessionException a;

    public jh5(DrmSession$DrmSessionException drmSession$DrmSessionException) {
        this.a = drmSession$DrmSessionException;
    }

    @Override // defpackage.z45
    public final UUID a() {
        return cy0.a;
    }

    @Override // defpackage.z45
    public final boolean b() {
        return false;
    }

    @Override // defpackage.z45
    public final void c(d55 d55Var) {
    }

    @Override // defpackage.z45
    public final void d(d55 d55Var) {
    }

    @Override // defpackage.z45
    public final boolean e(String str) {
        return false;
    }

    @Override // defpackage.z45
    public final DrmSession$DrmSessionException f() {
        return this.a;
    }

    @Override // defpackage.z45
    public final xa4 g() {
        return null;
    }

    @Override // defpackage.z45
    public final int getState() {
        return 1;
    }
}
