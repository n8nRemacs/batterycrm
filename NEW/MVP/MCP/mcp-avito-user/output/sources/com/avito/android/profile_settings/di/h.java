package com.avito.android.profile_settings.di;

import androidx.fragment.app.Fragment;
import com.avito.android.R;
import com.avito.android.profile_settings.TabItem;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ProfileSettingsModule_ProvideTabAdapter$_avito_profile_management_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class h implements dagger.internal.h<com.avito.android.lib.deprecated_design.tab.adapter.c<TabItem>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.lib.deprecated_design.tab.adapter.j<TabItem>> f228431a;

    /* renamed from: b, reason: collision with root package name */
    public final l f228432b;

    public h(l lVar, Provider provider) {
        this.f228431a = provider;
        this.f228432b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.lib.deprecated_design.tab.adapter.j<TabItem> jVar = this.f228431a.get();
        Fragment fragment = (Fragment) this.f228432b.f393949a;
        c cVar = c.f228422a;
        return new com.avito.android.lib.deprecated_design.tab.adapter.c(jVar, fragment.requireContext(), R.layout.tns_tab_item, null, 8, null);
    }
}
