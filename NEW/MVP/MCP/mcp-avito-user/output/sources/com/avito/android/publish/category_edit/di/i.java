package com.avito.android.publish.category_edit.di;

import Jd0.C14188a;
import Jf0.InterfaceC14192a;
import com.avito.android.publish.category_edit.di.j;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.CategoryParametersConverter;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import yc.C50213a;

/* compiled from: CategoryEditModule_ProvideWizardInteractor$_avito_publish_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class i implements dagger.internal.h<com.avito.android.publish.category_edit.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC14192a> f232357a;

    /* renamed from: b, reason: collision with root package name */
    public final l f232358b;

    /* renamed from: c, reason: collision with root package name */
    public final l f232359c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<C50213a> f232360d;

    public i(l lVar, l lVar2, Provider provider, Provider provider2) {
        this.f232357a = provider;
        this.f232358b = lVar;
        this.f232359c = lVar2;
        this.f232360d = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC14192a interfaceC14192a = (InterfaceC14192a) ((j.c.d) this.f232357a).get();
        String str = (String) this.f232358b.f393949a;
        Navigation navigation2 = (Navigation) this.f232359c.f393949a;
        C50213a c50213a = (C50213a) ((j.c.b) this.f232360d).get();
        c.f232350a.getClass();
        return new com.avito.android.publish.category_edit.b(new C14188a(interfaceC14192a, 3), str, navigation2, new CategoryParametersConverter(null, null, null, 7, null), c50213a);
    }
}
