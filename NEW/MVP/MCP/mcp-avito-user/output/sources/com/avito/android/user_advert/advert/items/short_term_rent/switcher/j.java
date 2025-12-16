package com.avito.android.user_advert.advert.items.short_term_rent.switcher;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ShortTermRentSwitcherItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<k> f310266a;

    /* renamed from: b, reason: collision with root package name */
    public final u f310267b;

    public j(u uVar, Provider provider) {
        this.f310266a = provider;
        this.f310267b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f310266a.get(), (com.avito.android.util.text.a) this.f310267b.get());
    }
}
