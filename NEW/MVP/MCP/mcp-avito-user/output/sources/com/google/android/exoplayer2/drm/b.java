package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f344329b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f344330c;

    public /* synthetic */ b(Object obj, int i12) {
        this.f344329b = i12;
        this.f344330c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f344329b) {
            case 0:
                DefaultDrmSessionManager.f fVar = (DefaultDrmSessionManager.f) this.f344330c;
                if (!fVar.f344313d) {
                    DrmSession drmSession = fVar.f344312c;
                    if (drmSession != null) {
                        drmSession.e(fVar.f344311b);
                    }
                    DefaultDrmSessionManager.this.f344299n.remove(fVar);
                    fVar.f344313d = true;
                    break;
                }
                break;
            default:
                ((DefaultDrmSession) this.f344330c).e(null);
                break;
        }
    }
}
