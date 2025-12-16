package com.avito.android.profile_settings_extended.adapter.carousel;

import Wb0.C15741c;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ExtendedSettingsCarouselItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f229317a;

    /* renamed from: b, reason: collision with root package name */
    public final u f229318b;

    /* renamed from: c, reason: collision with root package name */
    public final C15741c f229319c;

    public b(Provider provider, u uVar, C15741c c15741c) {
        this.f229317a = provider;
        this.f229318b = uVar;
        this.f229319c = c15741c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f229317a.get(), (com.avito.konveyor.a) this.f229318b.get(), (com.avito.konveyor.adapter.h) this.f229319c.get());
    }
}
