package com.avito.android.tariff_lf_constructor.configure.level;

import com.avito.android.tariff_lf_constructor.configure.level.mvi.i;
import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: ConstructorConfigureLevelViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final i f299826a;

    public h(i iVar) {
        this.f299826a = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.tariff_lf_constructor.configure.level.mvi.h hVar = (com.avito.android.tariff_lf_constructor.configure.level.mvi.h) this.f299826a.get();
        i2.f411430a.getClass();
        return new g(hVar, i2.a.f411433c);
    }
}
