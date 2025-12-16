package com.avito.android.publish.screen.step.select;

import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: SelectViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.publish.screen.step.select.mvi.l f242188a;

    public m(com.avito.android.publish.screen.step.select.mvi.l lVar) {
        this.f242188a = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.publish.screen.step.select.mvi.k kVar = (com.avito.android.publish.screen.step.select.mvi.k) this.f242188a.get();
        i2.f411430a.getClass();
        return new l(kVar, i2.a.f411433c);
    }
}
