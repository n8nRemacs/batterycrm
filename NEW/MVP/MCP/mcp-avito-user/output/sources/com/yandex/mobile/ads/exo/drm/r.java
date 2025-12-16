package com.yandex.mobile.ads.exo.drm;

import com.yandex.mobile.ads.exo.drm.c;
import com.yandex.mobile.ads.exo.drm.f;
import com.yandex.mobile.ads.impl.vw;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class r implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f382934b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f382935c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f382936d;

    public /* synthetic */ r(int i12, Object obj, Object obj2) {
        this.f382934b = i12;
        this.f382935c = obj;
        this.f382936d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f382934b) {
            case 0:
                ((f.a) this.f382935c).a((f) this.f382936d);
                break;
            case 1:
                ((f.a) this.f382935c).b((f) this.f382936d);
                break;
            case 2:
                ((f.a) this.f382935c).c((f) this.f382936d);
                break;
            case 3:
                ((f.a) this.f382935c).d((f) this.f382936d);
                break;
            default:
                ((c.e) this.f382935c).b((vw) this.f382936d);
                break;
        }
    }
}
