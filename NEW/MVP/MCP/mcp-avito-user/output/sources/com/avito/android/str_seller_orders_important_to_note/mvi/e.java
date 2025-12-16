package com.avito.android.str_seller_orders_important_to_note.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.str_seller_orders_important_to_note.ImportantToNoteOpenParams;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrSellerImportantToNoteActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f291389a;

    /* renamed from: b, reason: collision with root package name */
    public final u f291390b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f291391c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.deep_linking.x> f291392d;

    public e(dagger.internal.l lVar, u uVar, Provider provider, Provider provider2) {
        this.f291389a = lVar;
        this.f291390b = uVar;
        this.f291391c = provider;
        this.f291392d = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((ImportantToNoteOpenParams) this.f291389a.f393949a, (com.avito.android.str_seller_orders_important_to_note.domain.k) this.f291390b.get(), this.f291391c.get(), this.f291392d.get());
    }
}
