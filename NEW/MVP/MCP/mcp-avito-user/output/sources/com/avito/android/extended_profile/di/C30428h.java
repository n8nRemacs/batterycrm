package com.avito.android.extended_profile.di;

import android.app.Activity;
import com.avito.android.R;
import com.avito.android.lib.deprecated_design.tab.adapter.BaseTabItem;
import javax.inject.Provider;

/* compiled from: ExtendedProfileAdvertTabsModule_ProvideTabsLayout$_avito_extended_profile_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.extended_profile.di.h, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30428h implements dagger.internal.h<com.avito.android.lib.deprecated_design.tab.adapter.c<BaseTabItem>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.lib.deprecated_design.tab.adapter.j<BaseTabItem>> f149936a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f149937b;

    public C30428h(dagger.internal.l lVar, Provider provider) {
        this.f149936a = provider;
        this.f149937b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.lib.deprecated_design.tab.adapter.j<BaseTabItem> jVar = this.f149936a.get();
        Activity activity = (Activity) this.f149937b.f393949a;
        int i12 = C30425e.f149931a;
        return new com.avito.android.lib.deprecated_design.tab.adapter.c(jVar, activity, R.layout.tns_tab_item, null, 8, null);
    }
}
