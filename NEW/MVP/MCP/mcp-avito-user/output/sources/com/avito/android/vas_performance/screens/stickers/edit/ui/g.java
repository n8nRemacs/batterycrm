package com.avito.android.vas_performance.screens.stickers.edit.ui;

import com.avito.android.vas_performance.screens.stickers.edit.mvi.i;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: StickersEditViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class g implements h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final i f320946a;

    public g(i iVar) {
        this.f320946a = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.vas_performance.screens.stickers.edit.mvi.h hVar = (com.avito.android.vas_performance.screens.stickers.edit.mvi.h) this.f320946a.get();
        i2.f411430a.getClass();
        return new f(hVar, i2.a.f411433c);
    }
}
