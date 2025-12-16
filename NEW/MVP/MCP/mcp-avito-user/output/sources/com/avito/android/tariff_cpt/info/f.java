package com.avito.android.tariff_cpt.info;

import com.avito.android.tariff_cpt.info.mvi.k;
import com.avito.android.tariff_cpt.info.mvi.l;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: CptInfoV2ViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final l f298222a;

    public f(l lVar) {
        this.f298222a = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        k kVar = (k) this.f298222a.get();
        i2.f411430a.getClass();
        return new e(kVar, i2.a.f411433c);
    }
}
