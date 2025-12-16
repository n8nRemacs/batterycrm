package com.avito.android.vas_autoprolong.screens.autoprolong.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AutoprolongActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f319534a;

    public d(u uVar) {
        this.f319534a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.vas_autoprolong.screens.autoprolong.domain.a) this.f319534a.get());
    }
}
