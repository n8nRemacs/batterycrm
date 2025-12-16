package com.avito.android.publish.details;

import com.avito.android.publish.InterfaceC34155z;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.video_upload.InterfaceC34146a;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import yc.C50213a;

/* compiled from: ItemPresentersDelegateImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.publish.details.a0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33676a0 implements dagger.internal.h<E> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f233195a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f233196b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f233197c;

    /* renamed from: d, reason: collision with root package name */
    public final C33774n1 f233198d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.publish.view.i> f233199e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.details.b> f233200f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.publish.details.iac.e> f233201g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<com.avito.android.publish.details.tags.g> f233202h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<com.avito.android.details.a> f233203i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<InterfaceC34155z> f233204j;

    /* renamed from: k, reason: collision with root package name */
    public final Provider<InterfaceC33678b> f233205k;

    /* renamed from: l, reason: collision with root package name */
    public final dagger.internal.u f233206l;

    /* renamed from: m, reason: collision with root package name */
    public final Provider<InterfaceC34146a> f233207m;

    /* renamed from: n, reason: collision with root package name */
    public final Provider<com.avito.android.publish.items.alert_banner.n> f233208n;

    /* renamed from: o, reason: collision with root package name */
    public final dagger.internal.u f233209o;

    /* renamed from: p, reason: collision with root package name */
    public final Provider<com.avito.android.publish.details.auto_description.a> f233210p;

    /* renamed from: q, reason: collision with root package name */
    public final dagger.internal.u f233211q;

    /* renamed from: r, reason: collision with root package name */
    public final com.avito.android.publish.slots.delivery_addresses.e f233212r;

    public C33676a0(dagger.internal.u uVar, dagger.internal.u uVar2, dagger.internal.u uVar3, C33774n1 c33774n1, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, dagger.internal.u uVar4, Provider provider8, Provider provider9, dagger.internal.u uVar5, Provider provider10, dagger.internal.u uVar6, com.avito.android.publish.slots.delivery_addresses.e eVar) {
        this.f233195a = uVar;
        this.f233196b = uVar2;
        this.f233197c = uVar3;
        this.f233198d = c33774n1;
        this.f233199e = provider;
        this.f233200f = provider2;
        this.f233201g = provider3;
        this.f233202h = provider4;
        this.f233203i = provider5;
        this.f233204j = provider6;
        this.f233205k = provider7;
        this.f233206l = uVar4;
        this.f233207m = provider8;
        this.f233208n = provider9;
        this.f233209o = uVar5;
        this.f233210p = provider10;
        this.f233211q = uVar6;
        this.f233212r = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.util.R0 r02 = (com.avito.android.util.R0) this.f233195a.get();
        InterfaceC35745a5 interfaceC35745a5 = (InterfaceC35745a5) this.f233196b.get();
        InterfaceC33535v interfaceC33535v = (InterfaceC33535v) this.f233197c.get();
        C33771m1 c33771m1 = (C33771m1) this.f233198d.get();
        com.avito.android.publish.view.i iVar = this.f233199e.get();
        com.avito.android.details.b bVar = this.f233200f.get();
        com.avito.android.publish.details.iac.e eVar = this.f233201g.get();
        com.avito.android.publish.details.tags.g gVar = this.f233202h.get();
        com.avito.android.details.a aVar = this.f233203i.get();
        InterfaceC34155z interfaceC34155z = this.f233204j.get();
        InterfaceC33678b interfaceC33678b = this.f233205k.get();
        C50213a c50213a = (C50213a) this.f233206l.get();
        InterfaceC34146a interfaceC34146a = this.f233207m.get();
        com.avito.android.publish.items.alert_banner.n nVar = this.f233208n.get();
        com.avito.android.account.E e12 = (com.avito.android.account.E) this.f233209o.get();
        com.avito.android.publish.details.auto_description.a aVar2 = this.f233210p.get();
        com.avito.android.publish.C0 c02 = (com.avito.android.publish.C0) this.f233211q.get();
        this.f233212r.getClass();
        return new E(r02, interfaceC35745a5, interfaceC33535v, c33771m1, iVar, bVar, eVar, gVar, aVar, interfaceC34155z, interfaceC33678b, c50213a, interfaceC34146a, nVar, e12, aVar2, c02, new com.avito.android.publish.slots.delivery_addresses.d());
    }
}
