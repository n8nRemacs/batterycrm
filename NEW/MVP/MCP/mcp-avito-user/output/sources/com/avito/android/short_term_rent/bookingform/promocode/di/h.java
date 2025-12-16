package com.avito.android.short_term_rent.bookingform.promocode.di;

import com.avito.android.short_term_rent.bookingform.promocode.di.f;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.A;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Iterator;
import java.util.Set;

/* compiled from: BookingFormPromoCodeKonveyorModule_KonveyorModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final A f282110a;

    public h(A a12) {
        this.f282110a = a12;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        Set set = (Set) this.f282110a.get();
        f.a.f282107a.getClass();
        a.C10493a c10493a = new a.C10493a();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            c10493a.b((TV0.b) it.next());
        }
        return c10493a.a();
    }
}
