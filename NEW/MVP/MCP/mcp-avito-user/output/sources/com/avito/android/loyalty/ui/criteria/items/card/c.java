package com.avito.android.loyalty.ui.criteria.items.card;

import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CardItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final e f183488a;

    /* renamed from: b, reason: collision with root package name */
    public final l f183489b;

    public c(e eVar, l lVar) {
        this.f183488a = eVar;
        this.f183489b = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f183488a.getClass();
        return new b(new d(), (g) this.f183489b.f393949a);
    }
}
