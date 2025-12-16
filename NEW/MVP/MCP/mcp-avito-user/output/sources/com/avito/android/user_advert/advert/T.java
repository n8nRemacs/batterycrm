package com.avito.android.user_advert.advert;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class T implements l41.s {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f308426b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C35392g0 f308427c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f308428d;

    public /* synthetic */ T(C35392g0 c35392g0, String str, int i12) {
        this.f308426b = i12;
        this.f308427c = c35392g0;
        this.f308428d = str;
    }

    @Override // l41.s
    public final Object get() {
        switch (this.f308426b) {
            case 0:
                return this.f308427c.f308930a.get().f(this.f308428d);
            default:
                return this.f308427c.f308930a.get().i(this.f308428d);
        }
    }
}
