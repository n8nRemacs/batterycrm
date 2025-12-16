package com.avito.android.send_esia_data_screen.domain;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import nG.InterfaceC44249a;

/* compiled from: SendEsiaDataInteractor_Factory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deep_linking.x> f268256a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC44249a> f268257b;

    public b(Provider<com.avito.android.deep_linking.x> provider, Provider<InterfaceC44249a> provider2) {
        this.f268256a = provider;
        this.f268257b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f268256a.get(), this.f268257b.get());
    }
}
