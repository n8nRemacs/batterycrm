package com.avito.android.user_advert.advert.items.short_term_rent.switcher;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ShortTermRentHiddenSwitcherItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f310253a;

    /* renamed from: b, reason: collision with root package name */
    public final u f310254b;

    public b(u uVar, Provider provider) {
        this.f310253a = provider;
        this.f310254b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f310253a.get(), (com.avito.android.util.text.a) this.f310254b.get());
    }
}
