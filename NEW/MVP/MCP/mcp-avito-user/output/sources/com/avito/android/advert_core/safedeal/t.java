package com.avito.android.advert_core.safedeal;

import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MyAdvertSafedealServicesViewModelFactory_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class t implements dagger.internal.h<s> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f84251a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f84252b;

    /* renamed from: c, reason: collision with root package name */
    public final c f84253c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f84254d;

    public t(Provider provider, Provider provider2, c cVar, dagger.internal.u uVar) {
        this.f84251a = provider;
        this.f84252b = provider2;
        this.f84253c = cVar;
        this.f84254d = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new s(this.f84251a.get(), this.f84252b.get(), (b) this.f84253c.get(), (com.jakewharton.rxrelay3.d) this.f84254d.get());
    }
}
