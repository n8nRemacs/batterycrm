package com.avito.android.freemium.screens.contact_history;

import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: FreemiumContactHistoryViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.freemium.screens.contact_history.mvi.g f158983a;

    public k(com.avito.android.freemium.screens.contact_history.mvi.g gVar) {
        this.f158983a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.freemium.screens.contact_history.mvi.f fVar = (com.avito.android.freemium.screens.contact_history.mvi.f) this.f158983a.get();
        i2.f411430a.getClass();
        return new j(fVar, i2.a.f411433c);
    }
}
