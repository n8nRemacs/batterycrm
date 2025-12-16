package com.avito.android.competitor_analytics.mvi;

import Yq.InterfaceC18315a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CompetitorAnalyticsOneTimeEventProducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f124562a;

    public k(u uVar) {
        this.f124562a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j((InterfaceC18315a) this.f124562a.get());
    }
}
