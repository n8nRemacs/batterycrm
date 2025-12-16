package com.avito.android.phones_actualization.scenario;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ActualizePhonesScenarioBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class o implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final v f216264a;

    public o(v vVar) {
        this.f216264a = vVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new m((q) this.f216264a.get());
    }
}
