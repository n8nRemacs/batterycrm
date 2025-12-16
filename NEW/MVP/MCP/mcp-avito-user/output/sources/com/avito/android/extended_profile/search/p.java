package com.avito.android.extended_profile.search;

import android.content.res.Resources;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ExtendedProfileSearchResourceProviderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f150528a;

    public p(dagger.internal.l lVar) {
        this.f150528a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new o((Resources) this.f150528a.f393949a);
    }
}
