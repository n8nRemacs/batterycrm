package com.avito.android.screens.bbip_private.ui.items.budget_widget;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BbipPrivateBudgetWidgetItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f260773a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f260774b;

    public d(u uVar, Provider provider) {
        this.f260773a = uVar;
        this.f260774b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((e) this.f260773a.get(), this.f260774b.get());
    }
}
