package com.avito.android.beduin.common.container.time_line;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TimeLineExtractionStrategy_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class g implements h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f103250a;

    public g(dagger.internal.f fVar) {
        this.f103250a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(dagger.internal.g.b(this.f103250a));
    }
}
