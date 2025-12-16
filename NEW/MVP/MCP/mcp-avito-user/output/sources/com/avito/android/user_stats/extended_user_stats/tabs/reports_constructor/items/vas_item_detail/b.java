package com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.vas_item_detail;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VasItemDetailBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f318150a;

    /* renamed from: b, reason: collision with root package name */
    public final u f318151b;

    public b(u uVar, u uVar2) {
        this.f318150a = uVar;
        this.f318151b = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f318150a.get(), (com.avito.android.util.text.a) this.f318151b.get());
    }
}
