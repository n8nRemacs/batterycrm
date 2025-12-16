package u6;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PropertiesDialogModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class e implements h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.advert_details_items.flats.properties_for_dialog.b f439795a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.advert.item.modelSpecs.link.b f439796b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.advert.item.modelSpecs.link.restyle.b f439797c;

    public e(com.avito.android.advert_details_items.flats.properties_for_dialog.b bVar, com.avito.android.advert.item.modelSpecs.link.b bVar2, com.avito.android.advert.item.modelSpecs.link.restyle.b bVar3) {
        this.f439795a = bVar;
        this.f439796b = bVar2;
        this.f439797c = bVar3;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.advert_details_items.flats.properties_for_dialog.a aVar = (com.avito.android.advert_details_items.flats.properties_for_dialog.a) this.f439795a.get();
        com.avito.android.advert.item.modelSpecs.link.a aVar2 = (com.avito.android.advert.item.modelSpecs.link.a) this.f439796b.get();
        com.avito.android.advert.item.modelSpecs.link.restyle.a aVar3 = (com.avito.android.advert.item.modelSpecs.link.restyle.a) this.f439797c.get();
        b.f439791a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        c10493a.b(aVar2);
        c10493a.b(aVar3);
        return c10493a.a();
    }
}
