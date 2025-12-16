package com.avito.android.user_advert.advert;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.user_advert.advert.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C35394h implements l41.s {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f308935b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C35446q f308936c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f308937d;

    public /* synthetic */ C35394h(C35446q c35446q, String str, int i12) {
        this.f308935b = i12;
        this.f308936c = c35446q;
        this.f308937d = str;
    }

    @Override // l41.s
    public final Object get() {
        switch (this.f308935b) {
            case 0:
                return this.f308936c.f310579a.get().a(this.f308937d);
            default:
                return this.f308936c.f310579a.get().b(this.f308937d);
        }
    }
}
