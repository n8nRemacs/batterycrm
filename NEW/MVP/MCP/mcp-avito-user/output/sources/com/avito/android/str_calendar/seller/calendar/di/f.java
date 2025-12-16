package com.avito.android.str_calendar.seller.calendar.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.A;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Iterator;
import java.util.Set;

/* compiled from: StrSellerCalendarModule_ProvideItemBinder$_avito_str_calendar_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f287585a;

    /* renamed from: b, reason: collision with root package name */
    public final A f287586b;

    public f(d dVar, A a12) {
        this.f287585a = dVar;
        this.f287586b = a12;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        Set set = (Set) this.f287586b.get();
        this.f287585a.getClass();
        a.C10493a c10493a = new a.C10493a();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            c10493a.b((TV0.b) it.next());
        }
        return c10493a.a();
    }
}
