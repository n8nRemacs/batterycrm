package com.avito.android.profile.pro.impl.screen.mvi;

import cK.InterfaceC27058a;
import com.avito.android.account.E;
import com.avito.android.account.InterfaceC27663a;
import dagger.internal.x;
import dagger.internal.y;
import hz.InterfaceC41196a;
import javax.inject.Provider;
import t90.InterfaceC48524a;

/* compiled from: ProfileProActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class f implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.profile.pro.impl.interactor.j f223701a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<E> f223702b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC27663a> f223703c;

    /* renamed from: d, reason: collision with root package name */
    public final t90.c f223704d;

    /* renamed from: e, reason: collision with root package name */
    public final t90.f f223705e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC41196a> f223706f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<E90.a> f223707g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<InterfaceC27058a> f223708h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<com.avito.android.calltracking_core.f> f223709i;

    public f(com.avito.android.profile.pro.impl.interactor.j jVar, Provider provider, Provider provider2, t90.c cVar, t90.f fVar, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.f223701a = jVar;
        this.f223702b = provider;
        this.f223703c = provider2;
        this.f223704d = cVar;
        this.f223705e = fVar;
        this.f223706f = provider3;
        this.f223707g = provider4;
        this.f223708h = provider5;
        this.f223709i = provider6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.profile.pro.impl.interactor.e) this.f223701a.get(), this.f223702b.get(), this.f223703c.get(), (InterfaceC48524a) this.f223704d.get(), (t90.d) this.f223705e.get(), this.f223706f.get(), this.f223707g.get(), this.f223708h.get(), this.f223709i.get());
    }
}
