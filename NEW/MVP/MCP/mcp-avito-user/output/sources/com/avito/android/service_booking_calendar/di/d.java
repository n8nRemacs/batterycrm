package com.avito.android.service_booking_calendar.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.A;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Iterator;
import java.util.Set;

/* compiled from: CalendarViewModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class d implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f275483a;

    /* renamed from: b, reason: collision with root package name */
    public final A f275484b;

    /* renamed from: c, reason: collision with root package name */
    public final A f275485c;

    public d(dagger.internal.l lVar, A a12, A a13) {
        this.f275483a = lVar;
        this.f275484b = a12;
        this.f275485c = a13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        boolean zBooleanValue = ((Boolean) this.f275483a.f393949a).booleanValue();
        h31.e eVarB = dagger.internal.g.b(this.f275484b);
        h31.e eVarA = dagger.internal.g.a(w.a(this.f275485c));
        c.f275482a.getClass();
        a.C10493a c10493a = new a.C10493a();
        Iterator it = (zBooleanValue ? (Set) eVarA.get() : (Set) eVarB.get()).iterator();
        while (it.hasNext()) {
            c10493a.b((TV0.b) it.next());
        }
        return c10493a.a();
    }
}
