package com.avito.android.gig_motivations_list.ui.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MotivationsListBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f160375a;

    public e(u uVar) {
        this.f160375a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((wH.h) this.f160375a.get());
    }
}
