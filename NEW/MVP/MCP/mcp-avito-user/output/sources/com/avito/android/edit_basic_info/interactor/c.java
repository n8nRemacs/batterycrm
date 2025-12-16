package com.avito.android.edit_basic_info.interactor;

import Za0.InterfaceC19524a;
import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EditBasicInfoInteractorImpl_Factory.java */
@e
@y
@x
/* loaded from: classes13.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC19524a> f146097a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f146098b;

    public c(Provider<InterfaceC19524a> provider, Provider<R0> provider2) {
        this.f146097a = provider;
        this.f146098b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f146098b.get(), g.a(w.a(this.f146097a)));
    }
}
