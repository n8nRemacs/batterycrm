package com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.total;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TotalBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f317776a;

    /* renamed from: b, reason: collision with root package name */
    public final u f317777b;

    public b(u uVar, u uVar2) {
        this.f317776a = uVar;
        this.f317777b = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f317776a.get(), (com.avito.android.util.text.a) this.f317777b.get());
    }
}
