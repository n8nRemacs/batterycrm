package com.avito.android.tariff_lf.edit_info.ui;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EditInfoPaddingDecoration_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f299076a;

    public f(Provider<com.avito.konveyor.a> provider) {
        this.f299076a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f299076a.get());
    }
}
