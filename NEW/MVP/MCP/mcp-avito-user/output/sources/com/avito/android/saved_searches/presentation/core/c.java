package com.avito.android.saved_searches.presentation.core;

import Do0.InterfaceC13425a;
import com.avito.android.libs.saved_searches.domain.SavedSearchParams;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SavedSearchAnalyticsHolderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f258400a;

    /* renamed from: b, reason: collision with root package name */
    public final l f258401b;

    public c(l lVar, u uVar) {
        this.f258400a = uVar;
        this.f258401b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b((InterfaceC13425a) this.f258400a.get(), (SavedSearchParams) this.f258401b.f393949a);
    }
}
