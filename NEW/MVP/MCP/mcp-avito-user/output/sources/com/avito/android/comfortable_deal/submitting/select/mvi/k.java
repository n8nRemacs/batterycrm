package com.avito.android.comfortable_deal.submitting.select.mvi;

import Yo.t;
import Yo.v;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SubmittingSelectBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.comfortable_deal.repository.o f123354a;

    /* renamed from: b, reason: collision with root package name */
    public final v f123355b;

    public k(com.avito.android.comfortable_deal.repository.o oVar, v vVar) {
        this.f123354a = oVar;
        this.f123355b = vVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j((com.avito.android.comfortable_deal.repository.n) this.f123354a.get(), (t) this.f123355b.get());
    }
}
