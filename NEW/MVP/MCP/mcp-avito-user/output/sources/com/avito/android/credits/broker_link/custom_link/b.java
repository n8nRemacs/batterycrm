package com.avito.android.credits.broker_link.custom_link;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CreditBrokerCustomLinkBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final e f128585a;

    public b(e eVar) {
        this.f128585a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((d) this.f128585a.get());
    }
}
