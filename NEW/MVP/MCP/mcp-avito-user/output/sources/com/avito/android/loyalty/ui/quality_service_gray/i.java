package com.avito.android.loyalty.ui.quality_service_gray;

import com.avito.android.loyalty.ui.quality_service_gray.mvi.j;
import com.avito.android.loyalty.ui.quality_service_gray.mvi.k;
import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: QualityServiceGrayViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final k f184068a;

    public i(k kVar) {
        this.f184068a = kVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        j jVar = (j) this.f184068a.get();
        i2.f411430a.getClass();
        return new h(jVar, i2.a.f411433c);
    }
}
