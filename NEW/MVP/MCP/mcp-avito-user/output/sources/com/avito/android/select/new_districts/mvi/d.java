package com.avito.android.select.new_districts.mvi;

import com.avito.android.select.new_districts.SelectDistrictParams;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FilterSelectDistrictBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f265799a;

    public d(dagger.internal.l lVar) {
        this.f265799a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((SelectDistrictParams) this.f265799a.f393949a);
    }
}
