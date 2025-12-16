package com.avito.android.gig_apply.mvi;

/* compiled from: GigSlotViewModel_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class B implements dagger.internal.h<A> {

    /* renamed from: a, reason: collision with root package name */
    public final v f159713a;

    public B(v vVar) {
        this.f159713a = vVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new A((u) this.f159713a.get(), null, 2, null);
    }
}
