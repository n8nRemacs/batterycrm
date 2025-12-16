package com.avito.android.advert.item.amenities.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.A;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Iterator;
import java.util.Set;

/* compiled from: AmenitiesBottomSheetModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class e implements h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final c f72748a;

    /* renamed from: b, reason: collision with root package name */
    public final A f72749b;

    public e(c cVar, A a12) {
        this.f72748a = cVar;
        this.f72749b = a12;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        Set set = (Set) this.f72749b.get();
        this.f72748a.getClass();
        a.C10493a c10493a = new a.C10493a();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            c10493a.b((TV0.b) it.next());
        }
        return c10493a.a();
    }
}
