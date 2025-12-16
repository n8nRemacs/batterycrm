package com.avito.android.vas_performance.screens.visual_v2.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.vas_performance.screens.visual_v2.VisualVasV2Screen;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VisualVasV2Module_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class l implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final k f321208a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f321209b;

    public l(k kVar, dagger.internal.l lVar) {
        this.f321208a = kVar;
        this.f321209b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f321209b.f393949a;
        this.f321208a.getClass();
        return new C28478k(VisualVasV2Screen.f321178d, rVar, null, 4, null);
    }
}
