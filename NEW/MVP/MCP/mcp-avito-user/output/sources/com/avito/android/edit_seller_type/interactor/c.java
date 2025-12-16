package com.avito.android.edit_seller_type.interactor;

import Za0.InterfaceC19524a;
import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import wy.C49703c;
import wy.InterfaceC49701a;

/* compiled from: EditSellerTypeInteractorImpl_Factory.java */
@e
@y
@x
/* loaded from: classes13.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final C49703c f146758a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f146759b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC19524a> f146760c;

    public c(C49703c c49703c, Provider provider, Provider provider2) {
        this.f146758a = c49703c;
        this.f146759b = provider;
        this.f146760c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((InterfaceC49701a) this.f146758a.get(), this.f146759b.get(), g.a(w.a(this.f146760c)));
    }
}
