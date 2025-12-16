package com.avito.android.messenger.deeplink;

import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.messenger.di.I1;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35863o4;
import javax.inject.Provider;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: CreateChannelDeeplinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class N implements dagger.internal.h<C> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.messenger.H f195369a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f195370b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f195371c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f195372d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ru.avito.messenger.A> f195373e;

    /* renamed from: f, reason: collision with root package name */
    public final I1 f195374f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC35863o4> f195375g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f195376h;

    /* renamed from: i, reason: collision with root package name */
    public final C25721c f195377i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<com.avito.android.progress_info_toast_bar.interactor.a> f195378j;

    public N(com.avito.android.messenger.H h12, dv.b bVar, dv.b bVar2, dagger.internal.f fVar, Provider provider, I1 i12, Provider provider2, Provider provider3, C25721c c25721c, Provider provider4) {
        this.f195369a = h12;
        this.f195370b = bVar;
        this.f195371c = bVar2;
        this.f195372d = fVar;
        this.f195373e = provider;
        this.f195374f = i12;
        this.f195375g = provider2;
        this.f195376h = provider3;
        this.f195377i = c25721c;
        this.f195378j = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C((com.avito.android.messenger.F) this.f195369a.get(), (a.b) this.f195370b.get(), (a.InterfaceC4053a) this.f195371c.get(), (InterfaceC47842z) this.f195372d.get(), this.f195373e.get(), (ru.avito.messenger.F0) this.f195374f.get(), this.f195375g.get(), this.f195376h.get(), (C25719a) this.f195377i.get(), this.f195378j.get());
    }
}
