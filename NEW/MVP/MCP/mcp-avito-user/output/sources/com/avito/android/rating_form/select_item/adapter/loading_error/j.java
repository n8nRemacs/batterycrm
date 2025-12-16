package com.avito.android.rating_form.select_item.adapter.loading_error;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: LoadingErrorItemRedesignBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f248962a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f248963b;

    public j(dagger.internal.l lVar, Provider provider) {
        this.f248962a = provider;
        this.f248963b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f248962a.get(), ((Boolean) this.f248963b.f393949a).booleanValue());
    }
}
