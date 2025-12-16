package U4;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: GarageCompatibilityModule_Companion_ProvidesBrandCompatibilityItemsBinder$_avito_advert_details_implFactory.java */
@e
@y
@x
/* loaded from: classes10.dex */
public final class b implements h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.advert.item.compatibility.v3.item.brand_compatibility.b f16159a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.advert.item.compatibility.v3.item.show_all_brands.b f16160b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.advert.item.compatibility.v3.item.brand_compatibility_long.b f16161c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.advert.item.compatibility.v3.item.show_all_brands_long.b f16162d;

    public b(com.avito.android.advert.item.compatibility.v3.item.brand_compatibility.b bVar, com.avito.android.advert.item.compatibility.v3.item.show_all_brands.b bVar2, com.avito.android.advert.item.compatibility.v3.item.brand_compatibility_long.b bVar3, com.avito.android.advert.item.compatibility.v3.item.show_all_brands_long.b bVar4) {
        this.f16159a = bVar;
        this.f16160b = bVar2;
        this.f16161c = bVar3;
        this.f16162d = bVar4;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.advert.item.compatibility.v3.item.brand_compatibility.a aVar = (com.avito.android.advert.item.compatibility.v3.item.brand_compatibility.a) this.f16159a.get();
        com.avito.android.advert.item.compatibility.v3.item.show_all_brands.a aVar2 = (com.avito.android.advert.item.compatibility.v3.item.show_all_brands.a) this.f16160b.get();
        com.avito.android.advert.item.compatibility.v3.item.brand_compatibility_long.a aVar3 = (com.avito.android.advert.item.compatibility.v3.item.brand_compatibility_long.a) this.f16161c.get();
        com.avito.android.advert.item.compatibility.v3.item.show_all_brands_long.a aVar4 = (com.avito.android.advert.item.compatibility.v3.item.show_all_brands_long.a) this.f16162d.get();
        a.f16157a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        c10493a.b(aVar2);
        c10493a.b(aVar3);
        c10493a.b(aVar4);
        return c10493a.a();
    }
}
