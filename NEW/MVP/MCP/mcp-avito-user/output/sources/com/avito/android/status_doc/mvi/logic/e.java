package com.avito.android.status_doc.mvi.logic;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: GigStatusDocBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f284945a;

    public e(u uVar) {
        this.f284945a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((com.avito.android.status_doc.mvi.interactor.a) this.f284945a.get());
    }
}
