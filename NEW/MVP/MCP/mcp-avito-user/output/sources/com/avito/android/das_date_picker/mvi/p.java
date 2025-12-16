package com.avito.android.das_date_picker.mvi;

import com.avito.android.util.R0;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DasCalendarInteractorImpl_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<R0> f132454a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f132455b;

    public p(dagger.internal.u uVar, Provider provider) {
        this.f132454a = provider;
        this.f132455b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new o(this.f132454a.get(), (g) this.f132455b.get());
    }
}
