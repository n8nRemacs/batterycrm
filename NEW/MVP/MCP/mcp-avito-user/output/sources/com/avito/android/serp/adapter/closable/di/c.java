package com.avito.android.serp.adapter.closable.di;

import com.avito.android.serp.adapter.closable.d;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ClosedItemModule_ProvideViewedAdvertsPresenterFactory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class c implements h<com.avito.android.serp.adapter.closable.c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.closable.a> f269427a;

    /* renamed from: b, reason: collision with root package name */
    public final u f269428b;

    public c(u uVar, Provider provider) {
        this.f269427a = provider;
        this.f269428b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.serp.adapter.closable.a aVar = this.f269427a.get();
        InterfaceC35745a5 interfaceC35745a5 = (InterfaceC35745a5) this.f269428b.get();
        int i12 = a.f269425a;
        return new d(aVar, interfaceC35745a5);
    }
}
