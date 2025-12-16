package com.avito.android.mortgage.landing.di;

import android.os.Bundle;
import com.avito.konveyor.item_visibility_tracker.d;
import dagger.internal.A;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Iterator;
import java.util.Set;

/* compiled from: LandingModule_ProvideItemVisibilityTrackerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class n implements dagger.internal.h<com.avito.konveyor.item_visibility_tracker.b> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f199617a;

    /* renamed from: b, reason: collision with root package name */
    public final A f199618b;

    public n(dagger.internal.l lVar, A a12) {
        this.f199617a = lVar;
        this.f199618b = a12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Bundle bundle = (Bundle) this.f199617a.f393949a;
        Set set = (Set) this.f199618b.get();
        l.f199613a.getClass();
        d.a aVar = new d.a(bundle, false);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            aVar.a((WV0.a) it.next());
        }
        return aVar.b();
    }
}
