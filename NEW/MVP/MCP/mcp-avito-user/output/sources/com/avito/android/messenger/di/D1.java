package com.avito.android.messenger.di;

import com.avito.android.C30277e1;
import com.avito.android.C30713g1;

/* compiled from: MessengerModule_ProvideTextToChunkConverterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class D1 implements dagger.internal.h<com.avito.android.messenger.q0> {

    /* renamed from: a, reason: collision with root package name */
    public final U0 f195618a;

    /* renamed from: b, reason: collision with root package name */
    public final C30713g1 f195619b;

    public D1(U0 u02, C30713g1 c30713g1) {
        this.f195618a = u02;
        this.f195619b = c30713g1;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C30277e1 c30277e1 = (C30277e1) this.f195619b.get();
        this.f195618a.getClass();
        kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[39];
        return ((Boolean) c30277e1.f144971M.a().invoke()).booleanValue() ? new com.avito.android.messenger.s0() : new com.avito.android.messenger.u0();
    }
}
