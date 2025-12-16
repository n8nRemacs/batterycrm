package com.avito.android.str_seller_orders_important_to_note.mvi;

import com.avito.android.str_seller_orders_important_to_note.ImportantToNoteOpenParams;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StrSellerImportantToNoteBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f291405a;

    /* renamed from: b, reason: collision with root package name */
    public final u f291406b;

    public g(dagger.internal.l lVar, u uVar) {
        this.f291405a = lVar;
        this.f291406b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f((ImportantToNoteOpenParams) this.f291405a.f393949a, (com.avito.android.str_seller_orders_important_to_note.domain.k) this.f291406b.get());
    }
}
