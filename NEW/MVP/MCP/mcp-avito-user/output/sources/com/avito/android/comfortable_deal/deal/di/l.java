package com.avito.android.comfortable_deal.deal.di;

import android.os.Bundle;
import com.avito.konveyor.item_visibility_tracker.d;
import dagger.internal.A;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Iterator;
import java.util.Set;

/* compiled from: DealListModule_Companion_ProvideItemVisibilityTrackerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class l implements dagger.internal.h<com.avito.konveyor.item_visibility_tracker.b> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f121064a;

    /* renamed from: b, reason: collision with root package name */
    public final A f121065b;

    public l(dagger.internal.l lVar, A a12) {
        this.f121064a = lVar;
        this.f121065b = a12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Bundle bundle = (Bundle) this.f121064a.f393949a;
        Set set = (Set) this.f121065b.get();
        k.f121062a.getClass();
        d.a aVar = new d.a(bundle, false);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            aVar.a((WV0.a) it.next());
        }
        return aVar.b();
    }
}
