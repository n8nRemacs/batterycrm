package com.avito.android.fees_methods.screen.fees_by_package.ui;

import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: FeesByPackageViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.fees_methods.screen.fees_by_package.mvi.g f158166a;

    public j(com.avito.android.fees_methods.screen.fees_by_package.mvi.g gVar) {
        this.f158166a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.fees_methods.screen.fees_by_package.mvi.f fVar = (com.avito.android.fees_methods.screen.fees_by_package.mvi.f) this.f158166a.get();
        i2.f411430a.getClass();
        return new i(fVar, i2.a.f411433c);
    }
}
