package com.avito.android.extended_profile_widgets.adapter.map;

import com.avito.android.avito_map.icon_factory.AvitoMarkerIconFactory;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MapItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f154551a;

    /* renamed from: b, reason: collision with root package name */
    public final u f154552b;

    public b(u uVar, Provider provider) {
        this.f154551a = provider;
        this.f154552b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f154551a.get(), (AvitoMarkerIconFactory) this.f154552b.get());
    }
}
