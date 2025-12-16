package com.avito.android.advert.di;

import android.app.Application;
import com.avito.android.advert_core.contactbar.C28263b;
import com.avito.android.advert_core.contactbar.InterfaceC28262a;
import javax.inject.Provider;

/* compiled from: AdvertFragmentModule_ProvideAdvertActionIconFactory$_avito_advert_details_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class A implements dagger.internal.h<InterfaceC28262a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Application> f69070a;

    public A(Provider<Application> provider) {
        this.f69070a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Application application = this.f69070a.get();
        C27710t.f69463a.getClass();
        return new C28263b(application, false, 2, null);
    }
}
