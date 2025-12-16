package com.avito.android.bundles.repository;

import Ck.InterfaceC13314a;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VasBundlesRepositoryImpl_Factory.java */
@e
@y
@x
/* loaded from: classes11.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC13314a> f108333a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f108334b;

    public c(Provider<InterfaceC13314a> provider, Provider<InterfaceC35745a5> provider2) {
        this.f108333a = provider;
        this.f108334b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f108333a.get(), this.f108334b.get());
    }
}
