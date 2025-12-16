package com.avito.android.advert.item.ownership_cost.dialogs;

import com.avito.android.advert.item.ownership_cost.items.input_form.a;
import com.avito.android.advert.item.ownership_cost.items.m;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: OwnershipCostDialogFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<e> f77891a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.ownership_cost.items.input_form.a> f77892b;

    /* renamed from: c, reason: collision with root package name */
    public final u f77893c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f77894d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f77895e;

    public c(dagger.internal.f fVar, u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f77891a = provider;
        this.f77892b = provider2;
        this.f77893c = uVar;
        this.f77894d = fVar;
        this.f77895e = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f77891a.get(), this.f77892b.get(), (m) this.f77893c.get(), (a.InterfaceC2309a) this.f77894d.get(), this.f77895e.get());
    }
}
