package com.avito.android.advert_core.map;

import com.avito.android.U0;
import com.avito.android.avito_map.icon_factory.AvitoMarkerIconFactory;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertMapItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f83754a;

    /* renamed from: b, reason: collision with root package name */
    public final u f83755b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<U0> f83756c;

    public c(u uVar, Provider provider, Provider provider2) {
        this.f83754a = provider;
        this.f83755b = uVar;
        this.f83756c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f83754a.get(), (AvitoMarkerIconFactory) this.f83755b.get(), this.f83756c.get());
    }
}
