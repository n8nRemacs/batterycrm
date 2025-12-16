package com.avito.android.comparison.data;

import Uq.InterfaceC15558a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ComparisonRepositoryImpl_Factory.java */
@e
@y
@x
/* loaded from: classes12.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC15558a> f123838a;

    public c(Provider<InterfaceC15558a> provider) {
        this.f123838a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f123838a.get());
    }
}
