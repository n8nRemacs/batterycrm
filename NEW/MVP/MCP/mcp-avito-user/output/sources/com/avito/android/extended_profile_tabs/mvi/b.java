package com.avito.android.extended_profile_tabs.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ExtendedProfileTabsActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f153220a;

    public b(u uVar) {
        this.f153220a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.extended_profile_tabs.i) this.f153220a.get());
    }
}
