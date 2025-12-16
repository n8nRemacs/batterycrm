package com.yandex.mobile.ads.exo.drm;

import android.media.MediaDrmException;
import com.yandex.mobile.ads.exo.drm.DrmInitData;
import com.yandex.mobile.ads.exo.drm.m;
import com.yandex.mobile.ads.impl.tm;
import j.P;
import j.X;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@X
/* loaded from: classes8.dex */
public final class k implements m {
    @Override // com.yandex.mobile.ads.exo.drm.m
    public final void a(@P m.b bVar) {
    }

    @Override // com.yandex.mobile.ads.exo.drm.m
    public final int b() {
        return 1;
    }

    @Override // com.yandex.mobile.ads.exo.drm.m
    public final byte[] c() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // com.yandex.mobile.ads.exo.drm.m
    public final tm d(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.exo.drm.m
    public final m.a a(byte[] bArr, @P List<DrmInitData.SchemeData> list, int i12, @P HashMap<String, String> map) {
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.exo.drm.m
    public final void b(byte[] bArr) {
    }

    @Override // com.yandex.mobile.ads.exo.drm.m
    public final void c(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.exo.drm.m
    public final m.d a() {
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.exo.drm.m
    @P
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.exo.drm.m
    public final Map<String, String> a(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.exo.drm.m
    public final boolean a(String str, byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.exo.drm.m
    public final void a(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.exo.drm.m
    public final void release() {
    }
}
