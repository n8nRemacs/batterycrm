package com.avito.android.publish.screen.wrongcategory.mvi;

import com.avito.android.remote.model.adverts.AdvertProactiveModerationResult;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: WrongCategoryActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f242592a;

    public d(dagger.internal.l lVar) {
        this.f242592a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((AdvertProactiveModerationResult.WrongCategorySuggest) this.f242592a.f393949a);
    }
}
