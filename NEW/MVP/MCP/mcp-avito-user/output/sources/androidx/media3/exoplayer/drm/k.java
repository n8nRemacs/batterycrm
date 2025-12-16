package androidx.media3.exoplayer.drm;

import androidx.media3.common.C23097k;
import androidx.media3.common.util.J;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.f;
import j.P;
import java.util.UUID;

/* compiled from: ErrorStateDrmSession.java */
@J
/* loaded from: classes.dex */
public final class k implements DrmSession {

    /* renamed from: a, reason: collision with root package name */
    public final DrmSession.DrmSessionException f49119a;

    public k(DrmSession.DrmSessionException drmSessionException) {
        this.f49119a = drmSessionException;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final boolean a() {
        return false;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final UUID b() {
        return C23097k.f47666a;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    @P
    public final androidx.media3.decoder.c c() {
        return null;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final boolean d(String str) {
        return false;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    @P
    public final DrmSession.DrmSessionException getError() {
        return this.f49119a;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final int getState() {
        return 1;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final void f(@P f.a aVar) {
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final void g(@P f.a aVar) {
    }
}
