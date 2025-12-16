package com.avito.android.profile_settings.di;

import Eb0.C13470a;
import androidx.fragment.app.Fragment;
import com.avito.android.profile_settings.ProfileSettingsMviFragment;
import com.avito.android.profile_settings.TabItem;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ProfileSettingsModule_ProvidePagerAdapterProviderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class g implements dagger.internal.h<C13470a> {

    /* renamed from: a, reason: collision with root package name */
    public final l f228428a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.lib.deprecated_design.tab.adapter.j<TabItem>> f228429b;

    /* renamed from: c, reason: collision with root package name */
    public final l f228430c;

    public g(l lVar, l lVar2, Provider provider) {
        this.f228428a = lVar;
        this.f228429b = provider;
        this.f228430c = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Fragment fragment = (Fragment) this.f228428a.f393949a;
        com.avito.android.lib.deprecated_design.tab.adapter.j<TabItem> jVar = this.f228429b.get();
        ProfileSettingsMviFragment.Args args = (ProfileSettingsMviFragment.Args) this.f228430c.f393949a;
        c cVar = c.f228422a;
        return new C13470a(fragment, jVar, args);
    }
}
