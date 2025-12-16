package com.avito.android.advert.item.short_term_rent.str_buttons;

import com.avito.android.advert.item.short_term_rent.str_buttons.c;
import com.avito.android.advert_core.contactbar.InterfaceC28265d;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsShortTermRentStrButtonsPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f80170a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deep_linking.x> f80171b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f80172c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f80173d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC28265d> f80174e;

    public i(dagger.internal.f fVar, dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3) {
        this.f80170a = provider;
        this.f80171b = provider2;
        this.f80172c = lVar;
        this.f80173d = fVar;
        this.f80174e = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f80170a.get(), this.f80171b.get(), (String) this.f80172c.f393949a, (c.a) this.f80173d.get(), this.f80174e.get());
    }
}
