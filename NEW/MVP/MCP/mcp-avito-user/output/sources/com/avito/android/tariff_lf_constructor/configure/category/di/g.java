package com.avito.android.tariff_lf_constructor.configure.category.di;

import androidx.fragment.app.Fragment;
import androidx.view.P0;
import com.avito.android.tariff_lf_constructor.configure.category.viewmodel.i;
import com.avito.android.tariff_lf_constructor.configure.category.viewmodel.v;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ConstructorConfigureCategoryModule_ProvideViewModelFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final l f299364a;

    /* renamed from: b, reason: collision with root package name */
    public final u f299365b;

    public g(l lVar, u uVar) {
        this.f299364a = lVar;
        this.f299365b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Fragment fragment = (Fragment) this.f299364a.f393949a;
        P0.c cVar = (P0.c) this.f299365b.get();
        b bVar = b.f299358a;
        return (i) new P0(fragment, cVar).a(v.class);
    }
}
