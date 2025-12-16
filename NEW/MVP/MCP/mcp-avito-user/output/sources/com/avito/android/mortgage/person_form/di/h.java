package com.avito.android.mortgage.person_form.di;

import android.os.Bundle;
import com.avito.konveyor.item_visibility_tracker.d;
import dagger.internal.A;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PersonFormModule_ProvideItemVisibilityTrackerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class h implements dagger.internal.h<com.avito.konveyor.item_visibility_tracker.b> {

    /* renamed from: a, reason: collision with root package name */
    public final l f200557a;

    /* renamed from: b, reason: collision with root package name */
    public final A f200558b;

    public h(l lVar, A a12) {
        this.f200557a = lVar;
        this.f200558b = a12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Bundle bundle = (Bundle) this.f200557a.f393949a;
        Set set = (Set) this.f200558b.get();
        e.f200552a.getClass();
        d.a aVar = new d.a(bundle, false);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            aVar.a((WV0.a) it.next());
        }
        return aVar.b();
    }
}
