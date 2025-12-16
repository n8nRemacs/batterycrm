package com.avito.android.authorization.select_social.adapter;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SocialItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final u f94485a;

    public h(u uVar) {
        this.f94485a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new g((com.jakewharton.rxrelay3.c) this.f94485a.get());
    }
}
