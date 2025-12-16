package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.common.InitializationListener;
import com.yandex.mobile.ads.impl.ea;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class J implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f383232b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f383233c;

    public /* synthetic */ J(Object obj, int i12) {
        this.f383232b = i12;
        this.f383233c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f383232b) {
            case 0:
                ((fc) this.f383233c).d();
                break;
            case 1:
                g71.b((g71) this.f383233c);
                break;
            case 2:
                ((as0) this.f383233c).c();
                break;
            case 3:
                ((InitializationListener) this.f383233c).onInitializationCompleted();
                break;
            case 4:
                ea.b((ea.a) this.f383233c);
                break;
            case 5:
                ((fo) this.f383233c).f();
                break;
            case 6:
                ((i61) this.f383233c).c();
                break;
            case 7:
                ((ih1) this.f383233c).b();
                break;
            default:
                pq0.c((pq0) this.f383233c);
                break;
        }
    }
}
