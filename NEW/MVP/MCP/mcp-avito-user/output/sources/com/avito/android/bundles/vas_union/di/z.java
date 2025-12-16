package com.avito.android.bundles.vas_union.di;

import androidx.fragment.app.Fragment;
import androidx.view.P0;

/* compiled from: VasUnionModule_ProvideViewModelFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class z implements dagger.internal.h<com.avito.android.bundles.vas_union.viewmodel.a> {

    /* renamed from: a, reason: collision with root package name */
    public final q f108554a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f108555b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f108556c;

    public z(q qVar, dagger.internal.l lVar, dagger.internal.u uVar) {
        this.f108554a = qVar;
        this.f108555b = lVar;
        this.f108556c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Fragment fragment = (Fragment) this.f108555b.f393949a;
        P0.c cVar = (P0.c) this.f108556c.get();
        this.f108554a.getClass();
        return (com.avito.android.bundles.vas_union.viewmodel.a) new P0(fragment, cVar).a(com.avito.android.bundles.vas_union.viewmodel.a.class);
    }
}
