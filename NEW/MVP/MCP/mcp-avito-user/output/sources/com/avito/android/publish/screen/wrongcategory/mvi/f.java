package com.avito.android.publish.screen.wrongcategory.mvi;

import com.avito.android.remote.model.adverts.AdvertProactiveModerationResult;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: WrongCategoryBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f242603a;

    public f(dagger.internal.l lVar) {
        this.f242603a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e((AdvertProactiveModerationResult.WrongCategorySuggest) this.f242603a.f393949a);
    }
}
