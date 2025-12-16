package com.avito.android.tariff_lf_constructor.configure.size.di;

import androidx.fragment.app.Fragment;
import androidx.view.P0;
import com.avito.android.tariff_lf_constructor.configure.size.viewmodel.E;
import com.avito.android.tariff_lf_constructor.configure.size.viewmodel.i;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ConstructorConfigureSizeModule_ProvideViewModelFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final l f300274a;

    /* renamed from: b, reason: collision with root package name */
    public final u f300275b;

    public g(l lVar, u uVar) {
        this.f300274a = lVar;
        this.f300275b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Fragment fragment = (Fragment) this.f300274a.f393949a;
        P0.c cVar = (P0.c) this.f300275b.get();
        b bVar = b.f300268a;
        return (i) new P0(fragment, cVar).a(E.class);
    }
}
