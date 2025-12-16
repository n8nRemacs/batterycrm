package YM;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ImvCarsDetailsNeighborsModule_ProvideItemBinderFactory.java */
@e
@y
@x
/* loaded from: classes14.dex */
public final class c implements h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.imv_cars_details.presentation.items.imv_cars_detail_neighbor_item.b f19449a;

    public c(com.avito.android.imv_cars_details.presentation.items.imv_cars_detail_neighbor_item.b bVar) {
        this.f19449a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.imv_cars_details.presentation.items.imv_cars_detail_neighbor_item.a aVar = (com.avito.android.imv_cars_details.presentation.items.imv_cars_detail_neighbor_item.a) this.f19449a.get();
        a.f19447a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        return c10493a.a();
    }
}
