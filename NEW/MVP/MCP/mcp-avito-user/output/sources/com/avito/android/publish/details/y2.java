package com.avito.android.publish.details;

import java.util.Set;

/* compiled from: ResultListenerProvider_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class y2 implements dagger.internal.h<x2> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.A f235108a;

    public y2(dagger.internal.A a12) {
        this.f235108a = a12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new x2((Set) this.f235108a.get());
    }
}
