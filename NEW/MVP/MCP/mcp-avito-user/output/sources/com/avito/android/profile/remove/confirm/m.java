package com.avito.android.profile.remove.confirm;

import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: ProfileRemoveConfirmViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.profile.remove.confirm.mvi.f f223865a;

    public m(com.avito.android.profile.remove.confirm.mvi.f fVar) {
        this.f223865a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.profile.remove.confirm.mvi.e eVar = (com.avito.android.profile.remove.confirm.mvi.e) this.f223865a.get();
        i2.f411430a.getClass();
        return new l(eVar, i2.a.f411433c);
    }
}
