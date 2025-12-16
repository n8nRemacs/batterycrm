package com.avito.android.stories;

import android.app.Application;
import com.avito.android.L;
import com.avito.android.O;

/* compiled from: StoriesIntentFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f285144a;

    /* renamed from: b, reason: collision with root package name */
    public final O f285145b;

    public k(dagger.internal.l lVar, O o12) {
        this.f285144a = lVar;
        this.f285145b = o12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new j((Application) this.f285144a.f393949a, (L) this.f285145b.get());
    }
}
