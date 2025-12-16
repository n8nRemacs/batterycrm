package com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.mvi;

import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import java.util.List;

/* compiled from: SleepingPlacesBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final l f245030a;

    /* renamed from: b, reason: collision with root package name */
    public final l f245031b;

    /* renamed from: c, reason: collision with root package name */
    public final l f245032c;

    public d(l lVar, l lVar2, l lVar3) {
        this.f245030a = lVar;
        this.f245031b = lVar2;
        this.f245032c = lVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((String) this.f245030a.f393949a, (Integer) this.f245031b.f393949a, (List) this.f245032c.f393949a);
    }
}
