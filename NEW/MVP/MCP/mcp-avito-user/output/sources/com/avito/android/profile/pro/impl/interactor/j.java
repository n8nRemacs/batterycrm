package com.avito.android.profile.pro.impl.interactor;

import cK.InterfaceC27058a;
import com.avito.android.profile.pro.impl.converters.C33351f;
import com.avito.android.profile.pro.impl.converters.InterfaceC33349d;
import com.avito.android.profile.pro.impl.generated.api.ProfileProApi;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ProfileProInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class j implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<ProfileProApi> f222727a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.activeOrders.a> f222728b;

    /* renamed from: c, reason: collision with root package name */
    public final C33351f f222729c;

    /* renamed from: d, reason: collision with root package name */
    public final d f222730d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC27058a> f222731e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.calltracking_core.f> f222732f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<R0> f222733g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<InterfaceC35863o4> f222734h;

    public j(Provider provider, Provider provider2, C33351f c33351f, d dVar, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.f222727a = provider;
        this.f222728b = provider2;
        this.f222729c = c33351f;
        this.f222730d = dVar;
        this.f222731e = provider3;
        this.f222732f = provider4;
        this.f222733g = provider5;
        this.f222734h = provider6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(dagger.internal.g.b(this.f222727a), this.f222728b.get(), (InterfaceC33349d) this.f222729c.get(), (b) this.f222730d.get(), this.f222731e.get(), this.f222732f.get(), this.f222733g.get(), this.f222734h.get());
    }
}
