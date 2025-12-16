package com.avito.android.profile_settings_extended.adapter.geo;

import com.avito.android.profile_settings_extended.P;
import com.avito.android.util.InterfaceC35863o4;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ExtendedSettingsGeoConverterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f229461a;

    /* renamed from: b, reason: collision with root package name */
    public final u f229462b;

    public d(u uVar, u uVar2) {
        this.f229461a = uVar;
        this.f229462b = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((P) this.f229461a.get(), (InterfaceC35863o4) this.f229462b.get());
    }
}
