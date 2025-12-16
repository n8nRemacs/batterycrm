package androidx.media3.exoplayer.drm;

import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f49100b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f49101c;

    public /* synthetic */ b(Object obj, int i12) {
        this.f49100b = i12;
        this.f49101c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f49100b) {
            case 0:
                DefaultDrmSessionManager.f fVar = (DefaultDrmSessionManager.f) this.f49101c;
                if (!fVar.f49093d) {
                    DrmSession drmSession = fVar.f49092c;
                    if (drmSession != null) {
                        drmSession.f(fVar.f49091b);
                    }
                    DefaultDrmSessionManager.this.f49070n.remove(fVar);
                    fVar.f49093d = true;
                    break;
                }
                break;
            default:
                ((DefaultDrmSession) this.f49101c).f(null);
                break;
        }
    }
}
