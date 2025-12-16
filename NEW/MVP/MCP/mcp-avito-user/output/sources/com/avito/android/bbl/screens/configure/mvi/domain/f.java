package com.avito.android.bbl.screens.configure.mvi.domain;

import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import oh.InterfaceC44774a;

/* compiled from: PostBblConfigureSaveUseCaseImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<R0> f99210a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC44774a> f99211b;

    public f(Provider<R0> provider, Provider<InterfaceC44774a> provider2) {
        this.f99210a = provider;
        this.f99211b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f99210a.get(), this.f99211b.get());
    }
}
