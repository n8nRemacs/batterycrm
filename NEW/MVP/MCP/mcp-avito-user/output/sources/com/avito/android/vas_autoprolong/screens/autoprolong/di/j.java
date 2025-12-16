package com.avito.android.vas_autoprolong.screens.autoprolong.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.vas_autoprolong.VasAutoprolongPerfScreen;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AutoprolongModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class j implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f319485a;

    public j(dagger.internal.l lVar) {
        this.f319485a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f319485a.f393949a;
        i.f319484a.getClass();
        return new C28478k(VasAutoprolongPerfScreen.f319455d, rVar, null, 4, null);
    }
}
