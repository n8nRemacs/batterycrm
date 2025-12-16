package com.avito.android.authorization.complete_registration.mvi;

import Yd.InterfaceC18254a;
import com.avito.android.P;
import com.avito.android.account.InterfaceC27663a;
import com.avito.android.credman.o;
import com.avito.android.remote.InterfaceC34258d;
import dagger.internal.x;
import dagger.internal.y;
import fg0.InterfaceC40419c;
import javax.inject.Provider;

/* compiled from: CompleteRegistrationInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34258d> f93521a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC27663a> f93522b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC40419c> f93523c;

    /* renamed from: d, reason: collision with root package name */
    public final Yd.c f93524d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<P> f93525e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<o> f93526f;

    public i(Provider provider, Provider provider2, Provider provider3, Yd.c cVar, Provider provider4, Provider provider5) {
        this.f93521a = provider;
        this.f93522b = provider2;
        this.f93523c = provider3;
        this.f93524d = cVar;
        this.f93525e = provider4;
        this.f93526f = provider5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f93521a.get(), this.f93522b.get(), this.f93523c.get(), (InterfaceC18254a) this.f93524d.get(), this.f93525e.get(), this.f93526f.get());
    }
}
