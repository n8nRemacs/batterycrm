package com.avito.android.avl.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.avl.view.AvlScreen;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AvlPlayerModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class k implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f98083a;

    public k(dagger.internal.l lVar) {
        this.f98083a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.analytics.screens.r rVar = (com.avito.android.analytics.screens.r) this.f98083a.f393949a;
        f.f98077a.getClass();
        return new C28478k(AvlScreen.f98332d, rVar, null, 4, null);
    }
}
