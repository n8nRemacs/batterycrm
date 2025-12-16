package com.avito.android.di.module;

/* compiled from: SerpItemConverterModule_ProvideBxActiveOrdersWidgetConverterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.h8, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30063h8 implements dagger.internal.h<I3.a> {

    /* renamed from: a, reason: collision with root package name */
    public final C30194t8 f144329a;

    public C30063h8(C30194t8 c30194t8) {
        this.f144329a = c30194t8;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        boolean zBooleanValue = ((Boolean) this.f144329a.get()).booleanValue();
        C29986a8 c29986a8 = C29986a8.f144230a;
        return new I3.b(zBooleanValue);
    }
}
