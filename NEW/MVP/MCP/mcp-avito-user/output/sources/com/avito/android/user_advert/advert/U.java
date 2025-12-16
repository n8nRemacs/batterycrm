package com.avito.android.user_advert.advert;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class U implements l41.s {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f308430b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C35392g0 f308431c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f308432d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f308433e;

    public /* synthetic */ U(C35392g0 c35392g0, String str, String str2, int i12) {
        this.f308430b = i12;
        this.f308431c = c35392g0;
        this.f308432d = str;
        this.f308433e = str2;
    }

    @Override // l41.s
    public final Object get() {
        switch (this.f308430b) {
            case 0:
                return this.f308431c.f308930a.get().o(this.f308432d, this.f308433e);
            default:
                return this.f308431c.f308930a.get().c(this.f308432d, this.f308433e);
        }
    }
}
