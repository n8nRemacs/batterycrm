package com.avito.android.authorization.confirm_3fa;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.ConfirmEmailListScreen;
import com.avito.android.analytics.screens.r;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ConfirmEmailListModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class l implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final h f93592a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f93593b;

    public l(h hVar, dagger.internal.l lVar) {
        this.f93592a = hVar;
        this.f93593b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f93593b.f393949a;
        this.f93592a.getClass();
        return new C28478k(ConfirmEmailListScreen.f90330d, rVar, "selectEmail");
    }
}
