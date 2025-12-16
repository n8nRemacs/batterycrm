package com.avito.android.edit_carousel;

import kotlinx.coroutines.flow.i2;

/* compiled from: EditCarouselMviViewModel_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.edit_carousel.mvi.i f146416a;

    public j(com.avito.android.edit_carousel.mvi.i iVar) {
        this.f146416a = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.edit_carousel.mvi.h hVar = (com.avito.android.edit_carousel.mvi.h) this.f146416a.get();
        i2.f411430a.getClass();
        return new i(hVar, i2.a.f411433c);
    }
}
