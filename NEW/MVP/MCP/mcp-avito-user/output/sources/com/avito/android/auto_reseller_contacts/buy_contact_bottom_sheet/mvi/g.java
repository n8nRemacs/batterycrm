package com.avito.android.auto_reseller_contacts.buy_contact_bottom_sheet.mvi;

import Se.C15176c;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BuyContactsFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final b f95724a;

    /* renamed from: b, reason: collision with root package name */
    public final d f95725b;

    /* renamed from: c, reason: collision with root package name */
    public final k f95726c;

    /* renamed from: d, reason: collision with root package name */
    public final i f95727d;

    public g(b bVar, d dVar, k kVar, i iVar) {
        this.f95724a = bVar;
        this.f95725b = dVar;
        this.f95726c = kVar;
        this.f95727d = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f95724a.getClass();
        a aVar = new a();
        c cVar = (c) this.f95725b.get();
        this.f95726c.getClass();
        j jVar = new j();
        this.f95727d.getClass();
        h hVar = new h();
        C15176c.f15098f.getClass();
        return new f("BuyContacts", C15176c.f15099g, new e(cVar, aVar, jVar, hVar));
    }
}
