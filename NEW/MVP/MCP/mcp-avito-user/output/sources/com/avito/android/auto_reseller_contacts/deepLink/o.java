package com.avito.android.auto_reseller_contacts.deepLink;

import Ue.C15512a;
import Ve.InterfaceC15669a;
import bv.C25719a;
import bv.C25721c;
import com.avito.android.analytics.H;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.remote.t1;
import com.avito.android.util.C35833k6;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import xl0.InterfaceC49964a;

/* compiled from: RequestMessageLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class o implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC49964a> f95758a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC15669a> f95759b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f95760c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f95761d;

    /* renamed from: e, reason: collision with root package name */
    public final C25721c f95762e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f95763f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.f f95764g;

    /* renamed from: h, reason: collision with root package name */
    public final dagger.internal.f f95765h;

    /* renamed from: i, reason: collision with root package name */
    public final dagger.internal.u f95766i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<H> f95767j;

    /* renamed from: k, reason: collision with root package name */
    public final C35833k6 f95768k;

    public o(Provider provider, Provider provider2, dv.b bVar, dv.b bVar2, C25721c c25721c, Provider provider3, dagger.internal.f fVar, dagger.internal.f fVar2, dagger.internal.u uVar, Provider provider4, C35833k6 c35833k6) {
        this.f95758a = provider;
        this.f95759b = provider2;
        this.f95760c = bVar;
        this.f95761d = bVar2;
        this.f95762e = c25721c;
        this.f95763f = provider3;
        this.f95764g = fVar;
        this.f95765h = fVar2;
        this.f95766i = uVar;
        this.f95767j = provider4;
        this.f95768k = c35833k6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new m(dagger.internal.g.b(this.f95758a), dagger.internal.g.b(this.f95759b), (a.g) this.f95760c.get(), (a.i) this.f95761d.get(), (C25719a) this.f95762e.get(), this.f95763f.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f95764g.get(), (com.avito.android.deep_linking.x) this.f95765h.get(), (C15512a) this.f95766i.get(), this.f95767j.get(), (t1) this.f95768k.get());
    }
}
