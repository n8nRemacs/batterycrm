package com.avito.android.mall.deeplink;

import com.avito.android.L;
import com.avito.android.O;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MallIntentFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final O f184263a;

    public f(O o12) {
        this.f184263a = o12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((L) this.f184263a.get());
    }
}
