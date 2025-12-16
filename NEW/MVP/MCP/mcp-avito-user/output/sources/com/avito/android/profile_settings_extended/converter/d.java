package com.avito.android.profile_settings_extended.converter;

import com.avito.android.edit_carousel.w;
import com.avito.android.util.InterfaceC35863o4;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ExtendedProfileSettingsConverterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class d implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.profile_settings_extended.adapter.setting.c> f230030a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.profile_settings_extended.adapter.geo.a> f230031b;

    /* renamed from: c, reason: collision with root package name */
    public final u f230032c;

    /* renamed from: d, reason: collision with root package name */
    public final f f230033d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC35863o4> f230034e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<gD.f> f230035f;

    public d(Provider provider, Provider provider2, u uVar, f fVar, Provider provider3, Provider provider4) {
        this.f230030a = provider;
        this.f230031b = provider2;
        this.f230032c = uVar;
        this.f230033d = fVar;
        this.f230034e = provider3;
        this.f230035f = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f230030a.get(), this.f230031b.get(), (w) this.f230032c.get(), (e) this.f230033d.get(), this.f230034e.get(), this.f230035f.get());
    }
}
