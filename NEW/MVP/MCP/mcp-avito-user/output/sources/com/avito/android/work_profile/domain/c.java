package com.avito.android.work_profile.domain;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: GetAppliesListInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f330637a;

    public c(u uVar) {
        this.f330637a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((j) this.f330637a.get());
    }
}
