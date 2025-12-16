package com.avito.android.user_advert.advert.delegate.auto_publish;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AutoPublishChangeStateInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f308525a;

    public d(u uVar) {
        this.f308525a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(dagger.internal.g.b(this.f308525a));
    }
}
