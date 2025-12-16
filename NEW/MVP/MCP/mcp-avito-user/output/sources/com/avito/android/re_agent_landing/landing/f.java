package com.avito.android.re_agent_landing.landing;

import com.avito.android.re_agent_landing.landing.mvi.g;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: ReAgentProfileCreateLandingViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final g f250621a;

    public f(g gVar) {
        this.f250621a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.re_agent_landing.landing.mvi.f fVar = (com.avito.android.re_agent_landing.landing.mvi.f) this.f250621a.get();
        i2.f411430a.getClass();
        return new e(fVar, i2.a.f411433c);
    }
}
