package com.avito.android.bundles.di;

import androidx.fragment.app.Fragment;
import androidx.view.P0;

/* compiled from: VasBundlesModule_ProvideViewModelFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class A implements dagger.internal.h<com.avito.android.bundles.viewmodel.i> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f108255a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f108256b;

    public A(dagger.internal.l lVar, dagger.internal.u uVar) {
        this.f108255a = lVar;
        this.f108256b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Fragment fragment = (Fragment) this.f108255a.f393949a;
        P0.c cVar = (P0.c) this.f108256b.get();
        t tVar = t.f108315a;
        return (com.avito.android.bundles.viewmodel.i) new P0(fragment, cVar).a(com.avito.android.bundles.viewmodel.i.class);
    }
}
