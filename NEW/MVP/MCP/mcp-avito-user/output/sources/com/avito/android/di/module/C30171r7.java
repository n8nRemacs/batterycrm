package com.avito.android.di.module;

/* compiled from: ScreenGraphiteAnalyticsModule_ProvideCommunicationObservableFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.r7, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30171r7 implements dagger.internal.h<io.reactivex.rxjava3.core.z<com.avito.android.fps.a>> {

    /* renamed from: a, reason: collision with root package name */
    public final C30139o7 f144563a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f144564b;

    public C30171r7(C30139o7 c30139o7, dagger.internal.u uVar) {
        this.f144563a = c30139o7;
        this.f144564b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.jakewharton.rxrelay3.c cVar = (com.jakewharton.rxrelay3.c) this.f144564b.get();
        this.f144563a.getClass();
        return cVar;
    }
}
