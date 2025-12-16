package com.avito.android.lf_levels;

import com.avito.android.lf_levels.mvi.i;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: LfLevelsViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final i f175371a;

    public e(i iVar) {
        this.f175371a = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.lf_levels.mvi.h hVar = (com.avito.android.lf_levels.mvi.h) this.f175371a.get();
        i2.f411430a.getClass();
        return new d(hVar, i2.a.f411433c);
    }
}
