package com.yandex.mobile.ads.exo.drm;

import com.yandex.mobile.ads.exo.drm.c;
import com.yandex.mobile.ads.exo.drm.f;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class q implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f382932b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f382933c;

    public /* synthetic */ q(Object obj, int i12) {
        this.f382932b = i12;
        this.f382933c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f382932b) {
            case 0:
                ((c.e) this.f382933c).a();
                break;
            default:
                ((b) this.f382933c).a((f.a) null);
                break;
        }
    }
}
