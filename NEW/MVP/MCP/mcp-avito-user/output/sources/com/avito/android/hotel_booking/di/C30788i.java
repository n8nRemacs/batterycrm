package com.avito.android.hotel_booking.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import java.util.Iterator;
import java.util.Set;

/* compiled from: EnterDataModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.hotel_booking.di.i, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30788i implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final C30786g f163446a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.A f163447b;

    public C30788i(C30786g c30786g, dagger.internal.A a12) {
        this.f163446a = c30786g;
        this.f163447b = a12;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        Set set = (Set) this.f163447b.get();
        this.f163446a.getClass();
        a.C10493a c10493a = new a.C10493a();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            c10493a.b((TV0.b) it.next());
        }
        return c10493a.a();
    }
}
