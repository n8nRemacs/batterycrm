package com.google.android.exoplayer2.drm;

import android.os.Looper;
import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.drm.e;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f344333b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f344334c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f344335d;

    public /* synthetic */ d(int i12, Object obj, Object obj2) {
        this.f344333b = i12;
        this.f344334c = obj;
        this.f344335d = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.android.exoplayer2.drm.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.android.exoplayer2.drm.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.android.exoplayer2.drm.e, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f344333b) {
            case 0:
                e.a aVar = (e.a) this.f344334c;
                this.f344335d.l(aVar.f344336a, aVar.f344337b);
                break;
            case 1:
                e.a aVar2 = (e.a) this.f344334c;
                this.f344335d.g(aVar2.f344336a, aVar2.f344337b);
                break;
            case 2:
                e.a aVar3 = (e.a) this.f344334c;
                this.f344335d.p(aVar3.f344336a, aVar3.f344337b);
                break;
            default:
                DefaultDrmSessionManager.f fVar = (DefaultDrmSessionManager.f) this.f344334c;
                DefaultDrmSessionManager defaultDrmSessionManager = fVar.f344314e;
                if (defaultDrmSessionManager.f344301p != 0 && !fVar.f344313d) {
                    Looper looper = defaultDrmSessionManager.f344305t;
                    looper.getClass();
                    fVar.f344312c = defaultDrmSessionManager.e(looper, fVar.f344311b, (I) this.f344335d, false);
                    defaultDrmSessionManager.f344299n.add(fVar);
                    break;
                }
                break;
        }
    }
}
