package com.avito.android.comfortable_deal.submitting.success.mvi;

import Yo.t;
import Yo.v;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SubmittingSuccessActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final v f123420a;

    public e(v vVar) {
        this.f123420a = vVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((t) this.f123420a.get());
    }
}
