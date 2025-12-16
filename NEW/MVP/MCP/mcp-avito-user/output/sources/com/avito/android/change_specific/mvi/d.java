package com.avito.android.change_specific.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ExtendedProfileChangeSpecificBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f118017a;

    public d(u uVar) {
        this.f118017a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.change_specific.j) this.f118017a.get());
    }
}
