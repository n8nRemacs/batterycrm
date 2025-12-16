package com.avito.android.change_specific.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.r;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ExtendedProfileChangeSpecificModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class i implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f117973a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f117974b;

    public i(dagger.internal.l lVar, dagger.internal.l lVar2) {
        this.f117973a = lVar;
        this.f117974b = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Screen screen = (Screen) this.f117973a.f393949a;
        r rVar = (r) this.f117974b.f393949a;
        d.f117965a.getClass();
        return new C28478k(screen, rVar, null, 4, null);
    }
}
