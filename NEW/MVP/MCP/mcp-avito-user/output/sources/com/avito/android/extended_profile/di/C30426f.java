package com.avito.android.extended_profile.di;

import androidx.fragment.app.FragmentManager;
import com.avito.android.lib.deprecated_design.tab.TabPagerAdapter;
import com.avito.android.lib.deprecated_design.tab.adapter.BaseTabItem;
import java.util.Set;
import javax.inject.Provider;

/* compiled from: ExtendedProfileAdvertTabsModule_ProvideTabPagerAdapterProviderFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.extended_profile.di.f, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30426f implements dagger.internal.h<TabPagerAdapter> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f149932a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.lib.deprecated_design.tab.adapter.j<BaseTabItem>> f149933b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.A f149934c;

    public C30426f(dagger.internal.l lVar, Provider provider, dagger.internal.A a12) {
        this.f149932a = lVar;
        this.f149933b = provider;
        this.f149934c = a12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        FragmentManager fragmentManager = (FragmentManager) this.f149932a.f393949a;
        com.avito.android.lib.deprecated_design.tab.adapter.j<BaseTabItem> jVar = this.f149933b.get();
        Set set = (Set) this.f149934c.get();
        int i12 = C30425e.f149931a;
        return new TabPagerAdapter(fragmentManager, jVar, set, TabPagerAdapter.Behaviour.f178131d);
    }
}
