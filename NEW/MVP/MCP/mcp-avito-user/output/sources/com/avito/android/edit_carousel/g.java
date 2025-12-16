package com.avito.android.edit_carousel;

import com.avito.android.remote.D0;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.R0;
import com.google.gson.Gson;
import javax.inject.Provider;

/* compiled from: EditCarouselInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<D0> f146410a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Gson> f146411b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35863o4> f146412c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f146413d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f146414e;

    public g(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f146410a = provider;
        this.f146411b = provider2;
        this.f146412c = provider3;
        this.f146413d = uVar;
        this.f146414e = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(dagger.internal.g.b(this.f146410a), dagger.internal.g.b(this.f146411b), this.f146412c.get(), (w) this.f146413d.get(), this.f146414e.get());
    }
}
