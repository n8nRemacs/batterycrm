package com.avito.android.advert.item.leadauto;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AutoNewCarsLeadFormItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class m implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f77300a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f77301b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.advert_core.advert.l> f77302c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f77303d;

    public m(u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f77300a = uVar;
        this.f77301b = provider;
        this.f77302c = provider2;
        this.f77303d = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d((com.avito.android.advert.item.leadauto.viewmodel.c) this.f77300a.get(), this.f77301b.get(), this.f77302c.get(), this.f77303d.get());
    }
}
