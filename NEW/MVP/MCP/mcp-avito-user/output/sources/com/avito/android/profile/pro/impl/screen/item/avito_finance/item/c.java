package com.avito.android.profile.pro.impl.screen.item.avito_finance.item;

import com.avito.android.profile.pro.impl.screen.item.avito_finance.item.k;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ProfileProAvitoFinanceItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f223003a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f223004b;

    public c(dagger.internal.l lVar, Provider provider) {
        this.f223003a = provider;
        this.f223004b = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f223003a.get(), (k.b) this.f223004b.f393949a);
    }
}
