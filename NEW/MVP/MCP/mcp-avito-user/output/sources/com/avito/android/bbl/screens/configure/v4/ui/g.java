package com.avito.android.bbl.screens.configure.v4.ui;

import com.avito.android.bbl.screens.configure.v4.mvi.i;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: BblConfigureV4ViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class g implements h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final i f99616a;

    public g(i iVar) {
        this.f99616a = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.bbl.screens.configure.v4.mvi.h hVar = (com.avito.android.bbl.screens.configure.v4.mvi.h) this.f99616a.get();
        i2.f411430a.getClass();
        return new f(hVar, i2.a.f411433c);
    }
}
