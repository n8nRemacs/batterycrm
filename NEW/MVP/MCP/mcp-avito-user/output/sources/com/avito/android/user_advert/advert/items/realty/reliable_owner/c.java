package com.avito.android.user_advert.advert.items.realty.reliable_owner;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ReliableOwnerItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f309934a;

    /* renamed from: b, reason: collision with root package name */
    public final u f309935b;

    /* renamed from: c, reason: collision with root package name */
    public final u f309936c;

    public c(u uVar, u uVar2, Provider provider) {
        this.f309934a = provider;
        this.f309935b = uVar;
        this.f309936c = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f309934a.get(), (com.avito.android.util.text.a) this.f309935b.get(), (com.avito.android.serp.adapter.vertical_main.c) this.f309936c.get());
    }
}
