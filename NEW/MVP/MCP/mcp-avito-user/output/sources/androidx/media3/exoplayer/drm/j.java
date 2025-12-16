package androidx.media3.exoplayer.drm;

import android.media.MediaDrmException;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.util.J;
import androidx.media3.exoplayer.drm.l;
import j.P;
import j.X;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: DummyExoMediaDrm.java */
@J
@X
/* loaded from: classes.dex */
public final class j implements l {
    @Override // androidx.media3.exoplayer.drm.l
    public final Map<String, String> a(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.l
    public final void b(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.l
    @P
    public final byte[] c(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.l
    public final void d(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.l
    public final androidx.media3.decoder.c e(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.l
    public final l.b g(byte[] bArr, @P List<DrmInitData.SchemeData> list, int i12, @P HashMap<String, String> map) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.l
    public final l.h h() {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.l
    public final byte[] i() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // androidx.media3.exoplayer.drm.l
    public final boolean j(String str, byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.l
    public final int k() {
        return 1;
    }

    @Override // androidx.media3.exoplayer.drm.l
    public final void release() {
    }

    @Override // androidx.media3.exoplayer.drm.l
    public final void f(byte[] bArr) {
    }

    @Override // androidx.media3.exoplayer.drm.l
    public final void m(@P l.d dVar) {
    }
}
