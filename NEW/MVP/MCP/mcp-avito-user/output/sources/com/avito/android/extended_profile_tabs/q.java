package com.avito.android.extended_profile_tabs;

import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: ExtendedProfileTabsViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class q implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.extended_profile_tabs.mvi.g f153261a;

    public q(com.avito.android.extended_profile_tabs.mvi.g gVar) {
        this.f153261a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.extended_profile_tabs.mvi.f fVar = (com.avito.android.extended_profile_tabs.mvi.f) this.f153261a.get();
        i2.f411430a.getClass();
        return new p(fVar, i2.a.f411433c);
    }
}
