package com.avito.android.select.bottom_sheet.blueprints.chips;

import android.content.Context;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CheckableChipsItemPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Context> f265076a;

    /* renamed from: b, reason: collision with root package name */
    public final l f265077b;

    public f(l lVar, Provider provider) {
        this.f265076a = provider;
        this.f265077b = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f265076a.get(), (Y41.l) this.f265077b.f393949a);
    }
}
