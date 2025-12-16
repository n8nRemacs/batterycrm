package com.avito.android.theme_settings.di;

import com.avito.android.serp.adapter.Y0;
import com.avito.android.serp.adapter.Z0;
import com.avito.android.serp.adapter.h1;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ThemeSettingsModule_ProvideSpanProvider$_avito_settings_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class i implements dagger.internal.h<Y0> {

    /* renamed from: a, reason: collision with root package name */
    public final u f301333a;

    public i(u uVar) {
        this.f301333a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h1 h1Var = (h1) this.f301333a.get();
        int i12 = d.f301328a;
        Z0 z02 = new Z0(2, h1Var);
        z02.f268509c = new e();
        return z02;
    }
}
