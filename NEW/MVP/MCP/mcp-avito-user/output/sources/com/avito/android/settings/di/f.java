package com.avito.android.settings.di;

import com.avito.android.settings.di.a;
import com.avito.android.util.C;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SettingsModule_ProvideAppVersionName$_avito_settings_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements dagger.internal.h<String> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C> f280878a;

    public f(Provider<C> provider) {
        this.f280878a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C c12 = (C) ((a.c.e) this.f280878a).get();
        d.f280876a.getClass();
        String strB = c12.getF125493m();
        t.d(strB);
        return strB;
    }
}
