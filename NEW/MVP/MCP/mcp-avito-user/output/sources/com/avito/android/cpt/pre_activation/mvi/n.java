package com.avito.android.cpt.pre_activation.mvi;

import com.avito.android.util.InterfaceC35863o4;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PreActivationReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35863o4> f126753a;

    public n(Provider<InterfaceC35863o4> provider) {
        this.f126753a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new m(this.f126753a.get());
    }
}
