package com.avito.android.tariff.cpx.levels;

import com.avito.android.tariff.cpx.levels.mvi.l;
import com.avito.android.tariff.cpx.levels.mvi.m;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: CpxLevelsViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final m f297100a;

    public f(m mVar) {
        this.f297100a = mVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        l lVar = (l) this.f297100a.get();
        i2.f411430a.getClass();
        return new e(lVar, i2.a.f411433c);
    }
}
