package com.avito.android.work_profile.profile.gig.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: GigViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final h f331150a;

    public n(h hVar) {
        this.f331150a = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new m((g) this.f331150a.get(), null, 2, null);
    }
}
