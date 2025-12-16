package com.avito.android.vas_performance.screens.competitive.ui;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: CompetitiveVasV2ViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class g implements h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.vas_performance.screens.competitive.mvi.h f320572a;

    public g(com.avito.android.vas_performance.screens.competitive.mvi.h hVar) {
        this.f320572a = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.vas_performance.screens.competitive.mvi.g gVar = (com.avito.android.vas_performance.screens.competitive.mvi.g) this.f320572a.get();
        i2.f411430a.getClass();
        return new f(gVar, i2.a.f411433c);
    }
}
