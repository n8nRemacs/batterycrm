package com.avito.android.developments_agency_search.screen.realty_agency_search.di;

import android.os.Bundle;
import com.avito.konveyor.item_visibility_tracker.d;
import dagger.internal.A;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Iterator;
import java.util.Set;

/* compiled from: SearchResultItemModule_ProvideItemVisibilityTrackerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class v implements dagger.internal.h<com.avito.konveyor.item_visibility_tracker.b> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f138639a;

    /* renamed from: b, reason: collision with root package name */
    public final A f138640b;

    public v(dagger.internal.l lVar, A a12) {
        this.f138639a = lVar;
        this.f138640b = a12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Bundle bundle = (Bundle) this.f138639a.f393949a;
        Set set = (Set) this.f138640b.get();
        t.f138636a.getClass();
        d.a aVar = new d.a(bundle, false);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            aVar.a((WV0.a) it.next());
        }
        return aVar.b();
    }
}
