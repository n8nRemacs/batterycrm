package com.avito.android.mandatory_verification.presentation.mvi;

import com.avito.android.util.InterfaceC35741a1;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MandatoryVerificationReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final p f184804a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35741a1> f184805b;

    public k(p pVar, Provider provider) {
        this.f184804a = pVar;
        this.f184805b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j((n) this.f184804a.get(), this.f184805b.get());
    }
}
