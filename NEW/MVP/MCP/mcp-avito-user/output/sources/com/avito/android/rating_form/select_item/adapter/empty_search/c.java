package com.avito.android.rating_form.select_item.adapter.empty_search;

import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: EmptySearchItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f248937a;

    /* renamed from: b, reason: collision with root package name */
    public final l f248938b;

    public c(l lVar, u uVar) {
        this.f248937a = uVar;
        this.f248938b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f248937a.get(), ((Boolean) this.f248938b.f393949a).booleanValue());
    }
}
