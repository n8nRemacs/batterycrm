package com.avito.android.advertising.adapter.items.buzzoola.video;

import Db.InterfaceC13381a;
import androidx.view.InterfaceC22983P;
import com.avito.android.util.Kundle;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import ob.InterfaceC44739c;

/* compiled from: CommercialVideoPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class n implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC44739c> f87588a;

    /* renamed from: b, reason: collision with root package name */
    public final u f87589b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f87590c;

    /* renamed from: d, reason: collision with root package name */
    public final u f87591d;

    /* renamed from: e, reason: collision with root package name */
    public final u f87592e;

    /* renamed from: f, reason: collision with root package name */
    public final u f87593f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.advertising.loaders.j> f87594g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<g> f87595h;

    /* renamed from: i, reason: collision with root package name */
    public final u f87596i;

    /* renamed from: j, reason: collision with root package name */
    public final u f87597j;

    /* renamed from: k, reason: collision with root package name */
    public final u f87598k;

    /* renamed from: l, reason: collision with root package name */
    public final dagger.internal.l f87599l;

    public n(Provider provider, u uVar, dagger.internal.l lVar, u uVar2, u uVar3, u uVar4, Provider provider2, Provider provider3, u uVar5, u uVar6, u uVar7, dagger.internal.l lVar2) {
        this.f87588a = provider;
        this.f87589b = uVar;
        this.f87590c = lVar;
        this.f87591d = uVar2;
        this.f87592e = uVar3;
        this.f87593f = uVar4;
        this.f87594g = provider2;
        this.f87595h = provider3;
        this.f87596i = uVar5;
        this.f87597j = uVar6;
        this.f87598k = uVar7;
        this.f87599l = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new l(dagger.internal.g.b(this.f87588a), (com.avito.android.advertising.loaders.event_service.c) this.f87589b.get(), (Kundle) this.f87590c.f393949a, (com.avito.android.deeplink_handler.handler.composite.a) this.f87591d.get(), (com.avito.android.advertising.ui.i) this.f87592e.get(), (com.avito.android.video_snippets.g) this.f87593f.get(), this.f87594g.get(), this.f87595h.get(), (com.avito.android.advertising.loaders.event_service.c) this.f87596i.get(), (InterfaceC13381a) this.f87597j.get(), dagger.internal.g.b(this.f87598k), (InterfaceC22983P) this.f87599l.f393949a);
    }
}
