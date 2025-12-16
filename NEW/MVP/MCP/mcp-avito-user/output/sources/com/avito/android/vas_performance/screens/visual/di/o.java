package com.avito.android.vas_performance.screens.visual.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.vas_performance.screens.visual.VisualVasMviScreen;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VisualVasModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class o implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f321039a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f321040b;

    public o(l lVar, dagger.internal.l lVar2) {
        this.f321039a = lVar;
        this.f321040b = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f321040b.f393949a;
        this.f321039a.getClass();
        VisualVasMviScreen visualVasMviScreen = VisualVasMviScreen.f320983d;
        visualVasMviScreen.getClass();
        return new C28478k(visualVasMviScreen, rVar, VisualVasMviScreen.f320984e);
    }
}
