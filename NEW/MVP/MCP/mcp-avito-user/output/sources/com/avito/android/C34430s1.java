package com.avito.android;

import android.content.Context;
import com.avito.android.di.module.C30102l3;

/* compiled from: MessengerWorkFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.s1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C34430s1 implements dagger.internal.h<C34163r1> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f256023a;

    public C34430s1(C30102l3 c30102l3) {
        this.f256023a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C34163r1((Context) this.f256023a.get());
    }
}
