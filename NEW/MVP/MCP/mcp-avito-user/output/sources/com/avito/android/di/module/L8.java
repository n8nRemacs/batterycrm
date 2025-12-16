package com.avito.android.di.module;

import Ix0.C14172b;
import Ix0.InterfaceC14171a;

/* compiled from: SerpItemConverterModule_ProvideStoriesWidgetConverterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class L8 implements dagger.internal.h<InterfaceC14171a> {

    /* renamed from: a, reason: collision with root package name */
    public final C30194t8 f144049a;

    public L8(C30194t8 c30194t8) {
        this.f144049a = c30194t8;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        boolean zBooleanValue = ((Boolean) this.f144049a.get()).booleanValue();
        C29986a8.f144230a.getClass();
        return new C14172b(zBooleanValue);
    }
}
