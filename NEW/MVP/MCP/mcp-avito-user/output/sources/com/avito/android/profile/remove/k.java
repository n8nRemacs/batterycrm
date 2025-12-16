package com.avito.android.profile.remove;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ProfileRemoveMviViewModelFactory_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.profile.remove.mvi.g f223938a;

    public k(com.avito.android.profile.remove.mvi.g gVar) {
        this.f223938a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j((com.avito.android.profile.remove.mvi.f) this.f223938a.get());
    }
}
