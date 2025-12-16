package com.avito.android.user_adverts.tab_screens.di;

import Zx.C19616a;
import bW.InterfaceC25571b;
import com.avito.android.user_adverts.tab_screens.di.a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import wJ0.InterfaceC49523d;
import xJ0.InterfaceC49849a;
import xJ0.InterfaceC49850b;

/* compiled from: UserAdvertsListItemsModule_ProvideUserAdvertItemProvider$_avito_user_adverts_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class j implements dagger.internal.h<InterfaceC49849a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC49850b> f315907a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.user_adverts_views_pub.a> f315908b;

    /* renamed from: c, reason: collision with root package name */
    public final u f315909c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC25571b> f315910d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<C19616a> f315911e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f315912f;

    public j(u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f315907a = provider;
        this.f315908b = provider2;
        this.f315909c = uVar;
        this.f315910d = provider3;
        this.f315911e = provider4;
        this.f315912f = provider5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC49850b interfaceC49850b = (InterfaceC49850b) ((a.c.q) this.f315907a).get();
        com.avito.android.user_adverts_views_pub.a aVar = this.f315908b.get();
        InterfaceC49523d interfaceC49523d = (InterfaceC49523d) this.f315909c.get();
        InterfaceC25571b interfaceC25571bY4 = ((a.c.g) this.f315910d).f315879a.Y4();
        C19616a c19616a = (C19616a) ((a.c.e) this.f315911e).get();
        com.avito.android.util.text.a aVarE = ((a.c.b) this.f315912f).f315874a.e();
        d.f315895a.getClass();
        return interfaceC49850b.a(aVar, interfaceC49523d, interfaceC25571bY4, c19616a, new InterfaceC49850b.InterfaceC12859b.a(aVarE, com.avito.android.user_adverts_views_util.position.h.b()));
    }
}
