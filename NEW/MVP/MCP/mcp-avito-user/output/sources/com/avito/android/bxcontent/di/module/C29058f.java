package com.avito.android.bxcontent.di.module;

import com.avito.android.bxcontent.C29090i;
import com.avito.android.remote.model.PresentationType;

/* compiled from: BxContentCombinationFeatureManagerModule_ProvideFeatureManagerConfigFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.bxcontent.di.module.f, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29058f implements dagger.internal.h<C29090i> {

    /* renamed from: a, reason: collision with root package name */
    public final C29057e f110994a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f110995b;

    public C29058f(C29057e c29057e, dagger.internal.l lVar) {
        this.f110994a = c29057e;
        this.f110995b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        PresentationType presentationType = (PresentationType) this.f110995b.f393949a;
        this.f110994a.getClass();
        return new C29090i(presentationType.isMain() || presentationType.isSerp(), presentationType.isMap());
    }
}
