package com.avito.android.freemium.screens.rules;

import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: FreemiumRulesViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.freemium.screens.rules.mvi.g f159124a;

    public l(com.avito.android.freemium.screens.rules.mvi.g gVar) {
        this.f159124a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.freemium.screens.rules.mvi.f fVar = (com.avito.android.freemium.screens.rules.mvi.f) this.f159124a.get();
        i2.f411430a.getClass();
        return new k(fVar, i2.a.f411433c);
    }
}
