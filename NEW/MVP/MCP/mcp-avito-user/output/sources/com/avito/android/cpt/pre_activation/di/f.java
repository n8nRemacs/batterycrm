package com.avito.android.cpt.pre_activation.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.cpt.PreActivationScreen;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PreActivationModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f126711a;

    public f(l lVar) {
        this.f126711a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f126711a.f393949a;
        e.f126710a.getClass();
        return new C28478k(PreActivationScreen.f126194d, rVar, null, 4, null);
    }
}
