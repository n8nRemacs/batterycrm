package com.avito.android.extended_profile_widgets.adapter.map;

import com.avito.android.avito_map.icon_factory.AvitoMarkerIconFactory;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TabsWidgetMapItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f154569a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<AvitoMarkerIconFactory> f154570b;

    public j(Provider<c> provider, Provider<AvitoMarkerIconFactory> provider2) {
        this.f154569a = provider;
        this.f154570b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f154569a.get(), this.f154570b.get());
    }
}
