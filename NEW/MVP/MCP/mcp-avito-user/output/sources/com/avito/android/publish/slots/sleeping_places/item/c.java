package com.avito.android.publish.slots.sleeping_places.item;

import com.avito.android.Q1;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SleepingPlacesSlotItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<e> f244883a;

    /* renamed from: b, reason: collision with root package name */
    public final u f244884b;

    public c(u uVar, Provider provider) {
        this.f244883a = provider;
        this.f244884b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f244883a.get(), (Q1) this.f244884b.get());
    }
}
