package com.avito.android.realty_agency.inline_filters;

import android.app.Activity;
import com.avito.android.B2;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RealtyAgencyDialogFactory_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f251608a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<B2> f251609b;

    public e(dagger.internal.l lVar, Provider provider) {
        this.f251608a = lVar;
        this.f251609b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d((Activity) this.f251608a.f393949a, this.f251609b.get());
    }
}
