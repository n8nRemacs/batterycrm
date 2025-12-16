package com.avito.android.loyalty.ui.criteria.items.tab;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TabItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final e f183515a;

    public c(e eVar) {
        this.f183515a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f183515a.get());
    }
}
