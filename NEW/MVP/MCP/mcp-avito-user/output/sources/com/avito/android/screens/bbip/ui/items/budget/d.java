package com.avito.android.screens.bbip.ui.items.budget;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BudgetItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<e> f260317a;

    public d(Provider<e> provider) {
        this.f260317a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f260317a.get());
    }
}
