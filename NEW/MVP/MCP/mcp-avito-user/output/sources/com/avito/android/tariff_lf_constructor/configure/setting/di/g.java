package com.avito.android.tariff_lf_constructor.configure.setting.di;

import androidx.fragment.app.Fragment;
import androidx.view.P0;
import com.avito.android.tariff_lf_constructor.configure.setting.viewmodel.j;
import com.avito.android.tariff_lf_constructor.configure.setting.viewmodel.m;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ConstructorSettingModule_ProvideViewModelFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final l f300049a;

    /* renamed from: b, reason: collision with root package name */
    public final u f300050b;

    public g(l lVar, u uVar) {
        this.f300049a = lVar;
        this.f300050b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Fragment fragment = (Fragment) this.f300049a.f393949a;
        P0.c cVar = (P0.c) this.f300050b.get();
        b bVar = b.f300043a;
        return (j) new P0(fragment, cVar).a(m.class);
    }
}
