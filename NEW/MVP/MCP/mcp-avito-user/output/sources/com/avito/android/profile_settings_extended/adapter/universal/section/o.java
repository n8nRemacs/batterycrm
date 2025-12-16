package com.avito.android.profile_settings_extended.adapter.universal.section;

import Za0.InterfaceC19524a;
import com.avito.android.util.R0;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UniversalWidgetSectionsOrderInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC19524a> f229963a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f229964b;

    public o(Provider<InterfaceC19524a> provider, Provider<R0> provider2) {
        this.f229963a = provider;
        this.f229964b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new n(this.f229964b.get(), dagger.internal.g.a(w.a(this.f229963a)));
    }
}
