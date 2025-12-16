package com.avito.android.verification.di.form_builder;

import com.avito.konveyor.adapter.j;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FormBuilderItemsModule_ProvideAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class e implements h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f323689a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f323690b;

    public e(u uVar, Provider provider) {
        this.f323689a = uVar;
        this.f323690b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f323689a.get();
        com.avito.konveyor.a aVar2 = this.f323690b.get();
        d.f323688a.getClass();
        return new j(aVar, aVar2);
    }
}
