package com.avito.android.profile_settings_extended.adapter.phones;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ExtendedSettingsPhonesPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f229714a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<E> f229715b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f229716c;

    public j(dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f229714a = lVar;
        this.f229715b = provider;
        this.f229716c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((Y41.l) this.f229714a.f393949a, this.f229715b.get(), this.f229716c.get());
    }
}
