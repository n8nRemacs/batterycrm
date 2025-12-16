package com.avito.android.str_seller_orders_important_to_note.di;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StrSellerImportantToNoteModule_ProvideAdapterPresenter$_avito_str_seller_orders_important_to_note_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f291290a;

    /* renamed from: b, reason: collision with root package name */
    public final u f291291b;

    public e(d dVar, u uVar) {
        this.f291290a = dVar;
        this.f291291b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f291291b.get();
        this.f291290a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
