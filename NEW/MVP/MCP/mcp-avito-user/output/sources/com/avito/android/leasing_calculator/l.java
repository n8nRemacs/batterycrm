package com.avito.android.leasing_calculator;

import com.avito.android.util.InterfaceC35745a5;
import com.google.gson.Gson;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import mR.InterfaceC44004a;

/* compiled from: LeasingCalculatorInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC44004a> f175111a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f175112b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.remote.error.f> f175113c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<Gson> f175114d;

    public l(Provider<InterfaceC44004a> provider, Provider<InterfaceC35745a5> provider2, Provider<com.avito.android.remote.error.f> provider3, Provider<Gson> provider4) {
        this.f175111a = provider;
        this.f175112b = provider2;
        this.f175113c = provider3;
        this.f175114d = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k(dagger.internal.g.a(w.a(this.f175111a)), this.f175112b.get(), this.f175113c.get(), this.f175114d.get());
    }
}
