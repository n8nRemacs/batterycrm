package com.avito.android.autoteka.di.previewsearch;

import com.avito.konveyor.adapter.j;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AutotekaPreviewSearchModule_Companion_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class e implements h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f96510a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f96511b;

    public e(u uVar, Provider provider) {
        this.f96510a = uVar;
        this.f96511b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f96510a.get();
        com.avito.konveyor.a aVar2 = this.f96511b.get();
        b.f96503a.getClass();
        return new j(aVar, aVar2);
    }
}
