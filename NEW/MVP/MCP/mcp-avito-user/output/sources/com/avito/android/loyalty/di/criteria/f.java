package com.avito.android.loyalty.di.criteria;

import android.app.Activity;
import com.avito.android.lib.deprecated_design.tab.CommonTab;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CriteriaModule_Companion_ProvideTabAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class f implements dagger.internal.h<com.avito.android.lib.deprecated_design.tab.adapter.c<CommonTab>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.lib.deprecated_design.tab.adapter.j<CommonTab>> f183038a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f183039b;

    public f(dagger.internal.l lVar, Provider provider) {
        this.f183038a = provider;
        this.f183039b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.lib.deprecated_design.tab.adapter.j<CommonTab> jVar = this.f183038a.get();
        Activity activity = (Activity) this.f183039b.f393949a;
        d.f183033a.getClass();
        return new com.avito.android.lib.deprecated_design.tab.adapter.c(jVar, activity, 0, c.f183032b, 4, null);
    }
}
