package com.avito.android.calltracking.item;

import com.avito.android.calltracking.I;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CalltrackingItemPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f113728a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<l41.g<I>> f113729b;

    public k(u uVar, Provider provider) {
        this.f113728a = uVar;
        this.f113729b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j((a) this.f113728a.get(), this.f113729b.get());
    }
}
