package com.avito.android.publish.details;

import java.util.Set;

/* compiled from: PublishDetailsItemFactory_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class Z0 implements dagger.internal.h<Y0> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.A f233193a;

    public Z0(dagger.internal.A a12) {
        this.f233193a = a12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new Y0((Set) this.f233193a.get());
    }
}
