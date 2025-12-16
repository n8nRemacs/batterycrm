package com.avito.android.publish.infomodel_request;

import Zd0.InterfaceC19543a;
import Zd0.InterfaceC19545c;
import com.avito.android.analytics.screens.tracker.Z;
import com.avito.android.publish.C0;
import com.avito.android.publish.PublishParametersInteractor;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.details.InterfaceC33685d0;
import com.avito.android.publish.di.U;
import com.avito.android.util.InterfaceC35745a5;
import com.google.gson.Gson;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import yc.C50213a;

/* compiled from: InfomodelRequestViewModelFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class q implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<PublishParametersInteractor> f236185a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC33685d0> f236186b;

    /* renamed from: c, reason: collision with root package name */
    public final U f236187c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f236188d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC33535v> f236189e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC19543a> f236190f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<C50213a> f236191g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<InterfaceC19545c> f236192h;

    /* renamed from: i, reason: collision with root package name */
    public final u f236193i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<C0> f236194j;

    public q(Provider provider, Provider provider2, U u12, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, u uVar, Provider provider8) {
        this.f236185a = provider;
        this.f236186b = provider2;
        this.f236187c = u12;
        this.f236188d = provider3;
        this.f236189e = provider4;
        this.f236190f = provider5;
        this.f236191g = provider6;
        this.f236192h = provider7;
        this.f236193i = uVar;
        this.f236194j = provider8;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        PublishParametersInteractor publishParametersInteractor = this.f236185a.get();
        InterfaceC33685d0 interfaceC33685d0 = this.f236186b.get();
        Gson gson = (Gson) this.f236187c.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f236188d.get();
        InterfaceC33535v interfaceC33535v = this.f236189e.get();
        return new p(this.f236190f.get(), this.f236192h.get(), (Z) this.f236193i.get(), publishParametersInteractor, this.f236194j.get(), interfaceC33535v, interfaceC33685d0, interfaceC35745a5, gson, this.f236191g.get());
    }
}
