package com.avito.android.developments_agency_search.screen.deal_cabinet.di;

import android.os.Bundle;
import com.avito.konveyor.item_visibility_tracker.d;
import dagger.internal.A;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Iterator;
import java.util.Set;

/* compiled from: DealCabinetModule_ProvideItemVisibilityTrackerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class h implements dagger.internal.h<com.avito.konveyor.item_visibility_tracker.b> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f136981a;

    /* renamed from: b, reason: collision with root package name */
    public final A f136982b;

    public h(dagger.internal.l lVar, A a12) {
        this.f136981a = lVar;
        this.f136982b = a12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Bundle bundle = (Bundle) this.f136981a.f393949a;
        Set set = (Set) this.f136982b.get();
        d.f136975a.getClass();
        d.a aVar = new d.a(bundle, false);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            aVar.a((WV0.a) it.next());
        }
        return aVar.b();
    }
}
