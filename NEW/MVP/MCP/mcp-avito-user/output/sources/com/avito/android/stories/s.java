package com.avito.android.stories;

import android.content.res.Resources;

/* compiled from: StoriesResourceProvider_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class s implements dagger.internal.h<r> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f285297a;

    public s(dagger.internal.l lVar) {
        this.f285297a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new r((Resources) this.f285297a.f393949a);
    }
}
