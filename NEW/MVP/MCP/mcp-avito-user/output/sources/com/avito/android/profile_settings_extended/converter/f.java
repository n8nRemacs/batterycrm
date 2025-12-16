package com.avito.android.profile_settings_extended.converter;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ExtendedProfileUniversalWidgetConverter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.extended_profile_universal_widget_edit.f> f230038a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<gD.f> f230039b;

    public f(Provider<com.avito.android.extended_profile_universal_widget_edit.f> provider, Provider<gD.f> provider2) {
        this.f230038a = provider;
        this.f230039b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f230038a.get(), this.f230039b.get());
    }
}
