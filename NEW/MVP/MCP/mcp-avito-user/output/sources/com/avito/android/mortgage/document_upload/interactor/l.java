package com.avito.android.mortgage.document_upload.interactor;

import com.avito.android.util.R0;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: NavigationInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<IZ.a> f199372a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f199373b;

    public l(Provider<IZ.a> provider, Provider<R0> provider2) {
        this.f199372a = provider;
        this.f199373b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k(this.f199373b.get(), dagger.internal.g.a(w.a(this.f199372a)));
    }
}
