package com.avito.android.di.module;

import javax.inject.Provider;

/* compiled from: ScreenGraphiteAnalyticsModule_ProvideCommunicationConsumerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.p7, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30150p7 implements dagger.internal.h<l41.g<com.avito.android.fps.a>> {

    /* renamed from: a, reason: collision with root package name */
    public final C30139o7 f144527a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.jakewharton.rxrelay3.c<com.avito.android.fps.a>> f144528b;

    public C30150p7(C30139o7 c30139o7, Provider<com.jakewharton.rxrelay3.c<com.avito.android.fps.a>> provider) {
        this.f144527a = c30139o7;
        this.f144528b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.jakewharton.rxrelay3.c<com.avito.android.fps.a> cVar = this.f144528b.get();
        this.f144527a.getClass();
        return cVar;
    }
}
