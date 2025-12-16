package com.avito.android.loyalty.ui.items.collapse;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CollapseItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final g f183672a;

    public c(g gVar) {
        this.f183672a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((f) this.f183672a.get());
    }
}
