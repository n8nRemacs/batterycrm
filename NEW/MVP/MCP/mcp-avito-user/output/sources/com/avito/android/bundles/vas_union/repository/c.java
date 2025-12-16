package com.avito.android.bundles.vas_union.repository;

import Ck.InterfaceC13314a;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VasUnionRepositoryImpl_Factory.java */
@e
@y
@x
/* loaded from: classes11.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC13314a> f108697a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f108698b;

    public c(Provider<InterfaceC13314a> provider, Provider<InterfaceC35745a5> provider2) {
        this.f108697a = provider;
        this.f108698b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f108697a.get(), this.f108698b.get());
    }
}
