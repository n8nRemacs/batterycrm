package com.google.android.exoplayer2.drm;

import android.media.MediaDrmException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.k;
import j.P;
import j.X;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: DummyExoMediaDrm.java */
@X
/* loaded from: classes6.dex */
public final class i implements k {
    @Override // com.google.android.exoplayer2.drm.k
    public final Map<String, String> a(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.k
    public final void b(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.k
    @P
    public final byte[] c(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.k
    public final void d(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.k
    public final com.google.android.exoplayer2.decoder.c e(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.k
    public final k.b g(byte[] bArr, @P List<DrmInitData.SchemeData> list, int i12, @P HashMap<String, String> map) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.k
    public final k.h h() {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.k
    public final byte[] i() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // com.google.android.exoplayer2.drm.k
    public final boolean j(String str, byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.k
    public final int k() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.drm.k
    public final void release() {
    }

    @Override // com.google.android.exoplayer2.drm.k
    public final void f(byte[] bArr) {
    }

    @Override // com.google.android.exoplayer2.drm.k
    public final void l(@P k.d dVar) {
    }
}
