package com.avito.android.str_seller_orders_important_to_note.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.A;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Iterator;
import java.util.Set;

/* compiled from: StrSellerImportantToNoteModule_ProvideItemBinder$_avito_str_seller_orders_important_to_note_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f291292a;

    /* renamed from: b, reason: collision with root package name */
    public final A f291293b;

    public f(d dVar, A a12) {
        this.f291292a = dVar;
        this.f291293b = a12;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        Set set = (Set) this.f291293b.get();
        this.f291292a.getClass();
        a.C10493a c10493a = new a.C10493a();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            c10493a.b((TV0.b) it.next());
        }
        return c10493a.a();
    }
}
