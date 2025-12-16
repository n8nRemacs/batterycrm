package com.avito.android.theme_settings.di;

import androidx.fragment.app.Fragment;
import androidx.view.P0;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ThemeSettingsModule_ProvideViewModelFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class j implements dagger.internal.h<com.avito.android.theme_settings.viewmodel.e> {

    /* renamed from: a, reason: collision with root package name */
    public final l f301334a;

    /* renamed from: b, reason: collision with root package name */
    public final u f301335b;

    public j(l lVar, u uVar) {
        this.f301334a = lVar;
        this.f301335b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Fragment fragment = (Fragment) this.f301334a.f393949a;
        P0.c cVar = (P0.c) this.f301335b.get();
        int i12 = d.f301328a;
        return (com.avito.android.theme_settings.viewmodel.e) new P0(fragment, cVar).a(com.avito.android.theme_settings.viewmodel.h.class);
    }
}
