package com.avito.android.messenger.channels.mvi.header_feature;

import com.avito.android.C30277e1;
import com.avito.android.messenger.channels.mvi.interactor.InterfaceC31763a;
import com.avito.android.messenger.channels.mvi.interactor.InterfaceC31766d;
import com.avito.android.messenger.conversation.mvi.send.InterfaceC32208e;
import com.avito.android.messenger.w0;
import com.avito.android.util.R0;
import hz.InterfaceC41196a;
import javax.inject.Provider;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: ChannelsHeaderBootstrap_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class E implements dagger.internal.h<C> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<w0> f187477a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC47842z> f187478b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.messenger.channels.mvi.di.t f187479c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.blacklist_reasons.y> f187480d;

    /* renamed from: e, reason: collision with root package name */
    public final cZ.d f187481e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC32208e> f187482f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.u f187483g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<C30277e1> f187484h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<R0> f187485i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<InterfaceC41196a> f187486j;

    /* renamed from: k, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.channels.filter.j> f187487k;

    /* renamed from: l, reason: collision with root package name */
    public final Provider<JY.a> f187488l;

    public E(Provider provider, Provider provider2, com.avito.android.messenger.channels.mvi.di.t tVar, Provider provider3, cZ.d dVar, Provider provider4, dagger.internal.u uVar, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9) {
        this.f187477a = provider;
        this.f187478b = provider2;
        this.f187479c = tVar;
        this.f187480d = provider3;
        this.f187481e = dVar;
        this.f187482f = provider4;
        this.f187483g = uVar;
        this.f187484h = provider5;
        this.f187485i = provider6;
        this.f187486j = provider7;
        this.f187487k = provider8;
        this.f187488l = provider9;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C(this.f187477a.get(), this.f187478b.get(), (InterfaceC31766d) this.f187479c.get(), this.f187480d.get(), (cZ.b) this.f187481e.get(), this.f187482f.get(), (InterfaceC31763a) this.f187483g.get(), this.f187484h.get(), this.f187485i.get(), this.f187486j.get(), this.f187487k.get(), this.f187488l.get());
    }
}
