package z9;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: EquipmentsDialogItemModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class d implements h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.advert_core.equipments.redesign.bottom_sheet.item.title.b f443877a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.advert_core.equipments.redesign.bottom_sheet.item.text.b f443878b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.advert_core.equipments.redesign.bottom_sheet.item.gap.b f443879c;

    public d(com.avito.android.advert_core.equipments.redesign.bottom_sheet.item.title.b bVar, com.avito.android.advert_core.equipments.redesign.bottom_sheet.item.text.b bVar2, com.avito.android.advert_core.equipments.redesign.bottom_sheet.item.gap.b bVar3) {
        this.f443877a = bVar;
        this.f443878b = bVar2;
        this.f443879c = bVar3;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.advert_core.equipments.redesign.bottom_sheet.item.title.a aVar = (com.avito.android.advert_core.equipments.redesign.bottom_sheet.item.title.a) this.f443877a.get();
        com.avito.android.advert_core.equipments.redesign.bottom_sheet.item.text.a aVar2 = (com.avito.android.advert_core.equipments.redesign.bottom_sheet.item.text.a) this.f443878b.get();
        com.avito.android.advert_core.equipments.redesign.bottom_sheet.item.gap.a aVar3 = (com.avito.android.advert_core.equipments.redesign.bottom_sheet.item.gap.a) this.f443879c.get();
        C50404c.f443876a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        c10493a.b(aVar2);
        c10493a.b(aVar3);
        return c10493a.a();
    }
}
