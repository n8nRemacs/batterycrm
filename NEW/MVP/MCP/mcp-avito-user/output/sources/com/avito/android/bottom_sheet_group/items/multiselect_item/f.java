package com.avito.android.bottom_sheet_group.items.multiselect_item;

import com.avito.android.bottom_sheet_group.di.m;
import com.avito.android.bottom_sheet_group.s;
import com.avito.android.bottom_sheet_group.t;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BottomSheetMultiselectItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.h> f107375a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f107376b;

    /* renamed from: c, reason: collision with root package name */
    public final t f107377c;

    /* renamed from: d, reason: collision with root package name */
    public final m f107378d;

    public f(Provider provider, Provider provider2, t tVar, m mVar) {
        this.f107375a = provider;
        this.f107376b = provider2;
        this.f107377c = tVar;
        this.f107378d = mVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f107375a.get(), this.f107376b.get(), (s) this.f107377c.get(), (l41.g) this.f107378d.get());
    }
}
