package com.yandex.mobile.ads.banner;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f382539b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f382540c;

    public /* synthetic */ m(Object obj, int i12) {
        this.f382539b = i12;
        this.f382540c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f382539b) {
            case 0:
                ((e) this.f382540c).c();
                break;
            case 1:
                ((e) this.f382540c).b();
                break;
            case 2:
                ((e) this.f382540c).a();
                break;
            default:
                ((k) this.f382540c).t();
                break;
        }
    }
}
