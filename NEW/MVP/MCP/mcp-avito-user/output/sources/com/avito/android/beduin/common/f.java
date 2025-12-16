package com.avito.android.beduin.common;

import cj.InterfaceC27204b;
import com.avito.android.AbstractC35201t;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import di.C39730b;
import gj.InterfaceC40691b;
import javax.inject.Provider;

/* compiled from: BeduinExecuteRequestHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class f implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC27204b> f103309a;

    /* renamed from: b, reason: collision with root package name */
    public final C39730b f103310b;

    /* renamed from: c, reason: collision with root package name */
    public final i f103311c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.remote.error.f> f103312d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f103313e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f103314f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<AbstractC35201t> f103315g;

    public f(Provider provider, C39730b c39730b, i iVar, Provider provider2, Provider provider3, dagger.internal.l lVar, Provider provider4) {
        this.f103309a = provider;
        this.f103310b = c39730b;
        this.f103311c = iVar;
        this.f103312d = provider2;
        this.f103313e = provider3;
        this.f103314f = lVar;
        this.f103315g = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f103309a.get(), (lj.c) this.f103310b.get(), (g) this.f103311c.get(), this.f103312d.get(), this.f103313e.get(), (InterfaceC40691b) this.f103314f.f393949a, this.f103315g.get());
    }
}
