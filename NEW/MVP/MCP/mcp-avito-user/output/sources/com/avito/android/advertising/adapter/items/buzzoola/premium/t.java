package com.avito.android.advertising.adapter.items.buzzoola.premium;

import dagger.internal.A;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;

/* compiled from: CommercialStateSaverImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class t implements dagger.internal.h<s> {

    /* renamed from: a, reason: collision with root package name */
    public final A f87448a;

    public t(A a12) {
        this.f87448a = a12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new s((Set) this.f87448a.get());
    }
}
