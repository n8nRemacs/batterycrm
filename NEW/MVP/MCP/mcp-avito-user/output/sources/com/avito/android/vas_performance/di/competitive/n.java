package com.avito.android.vas_performance.di.competitive;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CompetitiveVasListModule_ProvideHeaderItemPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class n implements dagger.internal.h<com.avito.android.vas_performance.ui.items.header.c> {

    /* renamed from: a, reason: collision with root package name */
    public final l f319956a;

    public n(l lVar) {
        this.f319956a = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f319956a.getClass();
        return new com.avito.android.vas_performance.ui.items.header.c();
    }
}
