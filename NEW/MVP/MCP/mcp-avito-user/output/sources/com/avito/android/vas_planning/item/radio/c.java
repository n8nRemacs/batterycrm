package com.avito.android.vas_planning.item.radio;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VasPlanningRadioBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f322395a;

    public c(u uVar) {
        this.f322395a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f322395a.get());
    }
}
