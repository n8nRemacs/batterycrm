package com.avito.android.publish.start_publish;

import com.avito.android.Q1;
import com.avito.android.remote.H0;
import com.avito.android.util.InterfaceC35745a5;
import com.google.gson.Gson;
import hz.InterfaceC41196a;
import javax.inject.Provider;

/* compiled from: StartPublishInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class z implements dagger.internal.h<u> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<H0> f245446a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f245447b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC34126a> f245448c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<Q1> f245449d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC41196a> f245450e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<Gson> f245451f;

    public z(Provider<H0> provider, Provider<InterfaceC35745a5> provider2, Provider<InterfaceC34126a> provider3, Provider<Q1> provider4, Provider<InterfaceC41196a> provider5, Provider<Gson> provider6) {
        this.f245446a = provider;
        this.f245447b = provider2;
        this.f245448c = provider3;
        this.f245449d = provider4;
        this.f245450e = provider5;
        this.f245451f = provider6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new u(dagger.internal.g.a(dagger.internal.w.a(this.f245446a)), this.f245447b.get(), this.f245448c.get(), this.f245449d.get(), this.f245450e.get(), this.f245451f.get());
    }
}
