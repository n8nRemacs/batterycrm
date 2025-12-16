package com.avito.android.messenger.conversation.mvi.context;

import com.avito.android.C30277e1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.conversation.mvi.context.d0;
import com.avito.android.messenger.conversation.mvi.in_app_calls.ChannelIacInteractor;
import com.avito.android.messenger.conversation.mvi.send.InterfaceC32208e;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35945t1;
import javax.inject.Provider;

/* compiled from: ChannelContextPresenterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class b0 implements dagger.internal.h<W> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f190281a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f190282b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC31987a> f190283c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC32208e> f190284d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ChannelIacInteractor> f190285e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.u f190286f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f190287g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<com.avito.android.deep_linking.x> f190288h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.conversation.analytics.b> f190289i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.f> f190290j;

    /* renamed from: k, reason: collision with root package name */
    public final Provider<com.avito.android.analytics.statsd.F> f190291k;

    /* renamed from: l, reason: collision with root package name */
    public final Provider<JY.a> f190292l;

    /* renamed from: m, reason: collision with root package name */
    public final Provider<C30277e1> f190293m;

    public b0(dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, dagger.internal.u uVar, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11) {
        this.f190281a = lVar;
        this.f190282b = provider;
        this.f190283c = provider2;
        this.f190284d = provider3;
        this.f190285e = provider4;
        this.f190286f = uVar;
        this.f190287g = provider5;
        this.f190288h = provider6;
        this.f190289i = provider7;
        this.f190290j = provider8;
        this.f190291k = provider9;
        this.f190292l = provider10;
        this.f190293m = provider11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new W((d0.c) this.f190281a.f393949a, this.f190282b.get(), this.f190283c.get(), this.f190284d.get(), this.f190285e.get(), (InterfaceC35945t1) this.f190286f.get(), this.f190287g.get(), this.f190288h.get(), this.f190289i.get(), this.f190290j.get(), this.f190291k.get(), this.f190292l.get(), this.f190293m.get());
    }
}
