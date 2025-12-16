package com.avito.android.safety.sessions.info;

import android.content.res.Resources;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SessionsInfoDescriptionBuilderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f257954a;

    public d(dagger.internal.l lVar) {
        this.f257954a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((Resources) this.f257954a.f393949a);
    }
}
