package com.avito.android.tariff_cpt.configure.migration.viewmodel;

import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CptMigrationRepositoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<JC0.a> f298078a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f298079b;

    public g(Provider<JC0.a> provider, Provider<InterfaceC35745a5> provider2) {
        this.f298078a = provider;
        this.f298079b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f298078a.get(), this.f298079b.get());
    }
}
