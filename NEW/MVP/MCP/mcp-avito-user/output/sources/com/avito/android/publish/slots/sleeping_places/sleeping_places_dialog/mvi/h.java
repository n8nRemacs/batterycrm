package com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SleepingPlacesReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final u f245040a;

    public h(u uVar) {
        this.f245040a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((i) this.f245040a.get());
    }
}
