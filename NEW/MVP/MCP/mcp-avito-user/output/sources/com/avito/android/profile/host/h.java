package com.avito.android.profile.host;

import com.avito.android.profile.host.mvi.j;
import com.avito.android.profile.host.mvi.k;
import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: UserProfileHostViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final k f222356a;

    public h(k kVar) {
        this.f222356a = kVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        j jVar = (j) this.f222356a.get();
        i2.f411430a.getClass();
        return new g(jVar, i2.a.f411433c);
    }
}
