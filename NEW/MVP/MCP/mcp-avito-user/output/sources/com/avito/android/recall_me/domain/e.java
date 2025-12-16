package com.avito.android.recall_me.domain;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RecallMeAnalyticsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f251835a;

    public e(dagger.internal.f fVar) {
        this.f251835a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((InterfaceC28373a) this.f251835a.get());
    }
}
