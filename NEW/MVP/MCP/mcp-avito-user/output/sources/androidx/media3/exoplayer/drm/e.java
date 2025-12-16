package androidx.media3.exoplayer.drm;

import android.os.Looper;
import androidx.media3.common.C23108t;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;
import androidx.media3.exoplayer.drm.f;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f49109b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f49110c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f49111d;

    public /* synthetic */ e(int i12, Object obj, Object obj2) {
        this.f49109b = i12;
        this.f49110c = obj;
        this.f49111d = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.media3.exoplayer.drm.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.media3.exoplayer.drm.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.media3.exoplayer.drm.f, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f49109b) {
            case 0:
                f.a aVar = (f.a) this.f49110c;
                this.f49111d.l(aVar.f49112a, aVar.f49113b);
                break;
            case 1:
                f.a aVar2 = (f.a) this.f49110c;
                this.f49111d.o(aVar2.f49112a, aVar2.f49113b);
                break;
            case 2:
                f.a aVar3 = (f.a) this.f49110c;
                this.f49111d.f(aVar3.f49112a, aVar3.f49113b);
                break;
            default:
                DefaultDrmSessionManager.f fVar = (DefaultDrmSessionManager.f) this.f49110c;
                DefaultDrmSessionManager defaultDrmSessionManager = fVar.f49094e;
                if (defaultDrmSessionManager.f49072p != 0 && !fVar.f49093d) {
                    Looper looper = defaultDrmSessionManager.f49076t;
                    looper.getClass();
                    fVar.f49092c = defaultDrmSessionManager.e(looper, fVar.f49091b, (C23108t) this.f49111d, false);
                    defaultDrmSessionManager.f49070n.add(fVar);
                    break;
                }
                break;
        }
    }
}
