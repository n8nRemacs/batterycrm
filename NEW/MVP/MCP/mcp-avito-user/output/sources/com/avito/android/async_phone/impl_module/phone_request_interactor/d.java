package com.avito.android.async_phone.impl_module.phone_request_interactor;

import Id.InterfaceC14060a;
import com.avito.android.analytics.H;
import com.avito.android.permissions.w;
import com.avito.android.remote.InterfaceC34241a;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import lD.C43617a;
import lD.C43619c;

/* compiled from: AsyncPhoneInteractorImpl_Factory.java */
@e
@y
@x
/* loaded from: classes11.dex */
public final class d implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34241a> f92142a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f92143b;

    /* renamed from: c, reason: collision with root package name */
    public final C43619c f92144c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC14060a> f92145d;

    /* renamed from: e, reason: collision with root package name */
    public final w f92146e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<H> f92147f;

    /* renamed from: g, reason: collision with root package name */
    public final u f92148g;

    public d(Provider provider, Provider provider2, C43619c c43619c, Provider provider3, w wVar, Provider provider4, u uVar) {
        this.f92142a = provider;
        this.f92143b = provider2;
        this.f92144c = c43619c;
        this.f92145d = provider3;
        this.f92146e = wVar;
        this.f92147f = provider4;
        this.f92148g = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(g.b(this.f92142a), this.f92143b.get(), (C43617a) this.f92144c.get(), this.f92145d.get(), (com.avito.android.permissions.u) this.f92146e.get(), this.f92147f.get(), (YL.a) this.f92148g.get());
    }
}
