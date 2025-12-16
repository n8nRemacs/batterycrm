package com.avito.android.publish.objects.slot;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ObjectFillFormSlotManager_Factory.java */
@e
@y
@x
/* loaded from: classes16.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f238099a;

    public d(u uVar) {
        this.f238099a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.publish.slots.y) this.f238099a.get());
    }
}
