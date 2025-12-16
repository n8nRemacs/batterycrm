package com.avito.android.profile.pro.impl.screen.mvi;

import com.avito.android.profile.pro.impl.ProfileTabUserType;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ProfileProBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.profile.pro.impl.interactor.j f223714a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f223715b;

    public h(com.avito.android.profile.pro.impl.interactor.j jVar, dagger.internal.l lVar) {
        this.f223714a = jVar;
        this.f223715b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new g((com.avito.android.profile.pro.impl.interactor.e) this.f223714a.get(), (ProfileTabUserType) this.f223715b.f393949a);
    }
}
