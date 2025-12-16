package com.avito.android.user_advert.advert;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.user_advert.advert.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C35397i implements l41.s {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f308945b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C35446q f308946c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f308947d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f308948e;

    public /* synthetic */ C35397i(C35446q c35446q, String str, String str2, int i12) {
        this.f308945b = i12;
        this.f308946c = c35446q;
        this.f308947d = str;
        this.f308948e = str2;
    }

    @Override // l41.s
    public final Object get() {
        switch (this.f308945b) {
            case 0:
                return this.f308946c.f310579a.get().g(this.f308947d, this.f308948e);
            default:
                return this.f308946c.f310579a.get().e(this.f308947d, this.f308948e);
        }
    }
}
