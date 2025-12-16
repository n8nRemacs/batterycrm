package com.avito.android.avl.di;

import Lg.InterfaceC14391b;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AvlSharedModule_ProvideAvlFeedbackHelperFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class o implements dagger.internal.h<InterfaceC14391b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<SK0.b> f98087a;

    public o(Provider<SK0.b> provider) {
        this.f98087a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        SK0.b bVar = this.f98087a.get();
        n.f98086a.getClass();
        return new Ag.d(bVar);
    }
}
