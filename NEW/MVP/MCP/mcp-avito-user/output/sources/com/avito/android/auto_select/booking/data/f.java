package com.avito.android.auto_select.booking.data;

import Ye.InterfaceC18256a;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AutoSelectRepositoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC18256a> f95822a;

    public f(Provider<InterfaceC18256a> provider) {
        this.f95822a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(g.a(w.a(this.f95822a)));
    }
}
