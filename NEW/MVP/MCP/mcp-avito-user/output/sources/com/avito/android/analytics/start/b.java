package com.avito.android.analytics.start;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ApplicationWarmStartTimeAnalytics_Factory.java */
@e
@y
@x
/* loaded from: classes11.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f91025a;

    public b(f fVar) {
        this.f91025a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((InterfaceC28373a) this.f91025a.get());
    }
}
