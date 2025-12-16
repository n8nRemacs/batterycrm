package T9;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdvertServiceEducationItem_ProvideItemBinderFactory.java */
@e
@y
@x
/* loaded from: classes10.dex */
public final class d implements h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.advert_core.service_education.d f15437a;

    public d(com.avito.android.advert_core.service_education.d dVar) {
        this.f15437a = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.advert_core.service_education.c cVar = (com.avito.android.advert_core.service_education.c) this.f15437a.get();
        b.f15435a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(cVar);
        return c10493a.a();
    }
}
