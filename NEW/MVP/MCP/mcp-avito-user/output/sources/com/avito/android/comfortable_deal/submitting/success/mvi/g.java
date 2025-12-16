package com.avito.android.comfortable_deal.submitting.success.mvi;

import com.avito.android.comfortable_deal.repository.o;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SubmittingSuccessBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final o f123424a;

    public g(o oVar) {
        this.f123424a = oVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f((com.avito.android.comfortable_deal.repository.n) this.f123424a.get());
    }
}
