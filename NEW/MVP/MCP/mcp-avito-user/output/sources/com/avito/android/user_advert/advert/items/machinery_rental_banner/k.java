package com.avito.android.user_advert.advert.items.machinery_rental_banner;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MachineryRentalBannerPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final n f309597a;

    /* renamed from: b, reason: collision with root package name */
    public final u f309598b;

    /* renamed from: c, reason: collision with root package name */
    public final u f309599c;

    public k(n nVar, u uVar, u uVar2) {
        this.f309597a = nVar;
        this.f309598b = uVar;
        this.f309599c = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j((m) this.f309597a.get(), (com.avito.android.util.text.a) this.f309598b.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f309599c.get());
    }
}
