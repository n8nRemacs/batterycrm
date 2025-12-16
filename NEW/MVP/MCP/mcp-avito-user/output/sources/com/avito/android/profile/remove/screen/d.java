package com.avito.android.profile.remove.screen;

import com.avito.android.profile.remove.screen.mvi.g;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ProfileRemoveItemsViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final g f223992a;

    public d(g gVar) {
        this.f223992a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.profile.remove.screen.mvi.f) this.f223992a.get(), null, 2, null);
    }
}
