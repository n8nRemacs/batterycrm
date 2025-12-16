package com.avito.android.str_seller_orders.strsellerorders.mvi.items.importanto_to_note_group;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ImportantToNoteGroupItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final f f289986a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f289987b;

    public c(f fVar, Provider provider) {
        this.f289986a = fVar;
        this.f289987b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((e) this.f289986a.get(), this.f289987b.get());
    }
}
