package com.avito.android.str_seller_orders_important_to_note.di;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrSellerImportantToNoteModule_ProvideListRecyclerAdapter$_avito_str_seller_orders_important_to_note_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final d f291294a;

    /* renamed from: b, reason: collision with root package name */
    public final u f291295b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f291296c;

    public g(d dVar, u uVar, Provider provider) {
        this.f291294a = dVar;
        this.f291295b = uVar;
        this.f291296c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f291295b.get();
        com.avito.konveyor.a aVar2 = this.f291296c.get();
        this.f291294a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
    }
}
