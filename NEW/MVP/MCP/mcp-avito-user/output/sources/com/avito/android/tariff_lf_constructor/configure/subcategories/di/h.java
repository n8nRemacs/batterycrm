package com.avito.android.tariff_lf_constructor.configure.subcategories.di;

import androidx.fragment.app.Fragment;
import androidx.view.P0;
import com.avito.android.tariff_lf_constructor.configure.subcategories.viewmodel.r;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ConfigureSubCategoriesModule_ProvideViewModelFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<com.avito.android.tariff_lf_constructor.configure.subcategories.viewmodel.h> {

    /* renamed from: a, reason: collision with root package name */
    public final l f300448a;

    /* renamed from: b, reason: collision with root package name */
    public final u f300449b;

    public h(l lVar, u uVar) {
        this.f300448a = lVar;
        this.f300449b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Fragment fragment = (Fragment) this.f300448a.f393949a;
        P0.c cVar = (P0.c) this.f300449b.get();
        b bVar = b.f300441a;
        return (com.avito.android.tariff_lf_constructor.configure.subcategories.viewmodel.h) new P0(fragment, cVar).a(r.class);
    }
}
