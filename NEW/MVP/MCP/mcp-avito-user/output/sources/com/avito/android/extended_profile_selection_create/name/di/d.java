package com.avito.android.extended_profile_selection_create.name.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.r;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ExtendedProfileSetSelectionNameModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class d implements h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f151866a;

    /* renamed from: b, reason: collision with root package name */
    public final l f151867b;

    public d(l lVar, l lVar2) {
        this.f151866a = lVar;
        this.f151867b = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Screen screen = (Screen) this.f151866a.f393949a;
        r rVar = (r) this.f151867b.f393949a;
        c.f151865a.getClass();
        return new C28478k(screen, rVar, null, 4, null);
    }
}
