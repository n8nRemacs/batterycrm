package com.avito.android.social.esia;

import com.avito.android.social.esia.mvi.k;
import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: EsiaViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final k f284391a;

    public j(k kVar) {
        this.f284391a = kVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.social.esia.mvi.j jVar = (com.avito.android.social.esia.mvi.j) this.f284391a.get();
        i2.f411430a.getClass();
        return new i(jVar, i2.a.f411433c);
    }
}
