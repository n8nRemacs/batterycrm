package com.avito.android.change_specific.adapter;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SpecificBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f117904a;

    public l(dagger.internal.u uVar) {
        this.f117904a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k((o) this.f117904a.get());
    }
}
