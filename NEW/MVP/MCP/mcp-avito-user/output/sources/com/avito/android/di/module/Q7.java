package com.avito.android.di.module;

import com.avito.android.remote.model.SerpSpaceType;

/* compiled from: SerpFromSpaceModule_ProvideFromSpaceFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class Q7 implements dagger.internal.h<String> {

    /* renamed from: a, reason: collision with root package name */
    public final P7 f144109a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f144110b;

    public Q7(P7 p72, dagger.internal.l lVar) {
        this.f144109a = p72;
        this.f144110b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        SerpSpaceType serpSpaceType = (SerpSpaceType) this.f144110b.f393949a;
        this.f144109a.getClass();
        return serpSpaceType.getFromSpace();
    }
}
