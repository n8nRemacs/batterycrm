package com.avito.android.suggest_institutes_bottom_sheet.di;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SuggestInstitutesModule_ProvideItemPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class j implements dagger.internal.h<com.avito.android.suggest_institutes_bottom_sheet.blueprints.f> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f292015a;

    public j(dagger.internal.l lVar) {
        this.f292015a = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Y41.l lVar = (Y41.l) this.f292015a.f393949a;
        int i12 = e.f292008a;
        return new com.avito.android.suggest_institutes_bottom_sheet.blueprints.f(lVar);
    }
}
