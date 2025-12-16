package com.avito.android.authorization.auth;

import android.content.res.Resources;

/* compiled from: AuthNotificationLinkBuilderImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.authorization.auth.w, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28643w implements dagger.internal.h<C28642v> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f93063a;

    public C28643w(dagger.internal.l lVar) {
        this.f93063a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C28642v((Resources) this.f93063a.f393949a);
    }
}
