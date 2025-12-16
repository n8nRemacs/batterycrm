package com.avito.android.advertising.adapter.items.buzzoola.video;

import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CommercialVideoBigBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f87548a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.player_holder.a> f87549b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f87550c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f87551d;

    public d(dagger.internal.l lVar, u uVar, Provider provider, Provider provider2) {
        this.f87548a = uVar;
        this.f87549b = provider;
        this.f87550c = provider2;
        this.f87551d = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((j) this.f87548a.get(), this.f87549b.get(), this.f87550c.get(), (com.avito.android.advertising.a) this.f87551d.f393949a);
    }
}
