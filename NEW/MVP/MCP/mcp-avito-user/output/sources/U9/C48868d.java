package u9;

import com.avito.android.advert_core.discount.item.group_title.f;
import com.avito.android.advert_core.discount.item.group_title.g;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdvertDiscountDetailsModule_ProvideItemBinderFactory.java */
@e
@y
@x
/* renamed from: u9.d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C48868d implements h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.advert_core.discount.item.title.c f439820a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.advert_core.discount.item.subtitle.c f439821b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.advert_core.discount.item.discount.c f439822c;

    /* renamed from: d, reason: collision with root package name */
    public final g f439823d;

    /* renamed from: e, reason: collision with root package name */
    public final com.avito.android.advert_core.discount.item.dotted_discount.c f439824e;

    /* renamed from: f, reason: collision with root package name */
    public final com.avito.android.advert_core.discount.item.divider.c f439825f;

    /* renamed from: g, reason: collision with root package name */
    public final com.avito.android.advert_core.discount.item.information.c f439826g;

    /* renamed from: h, reason: collision with root package name */
    public final com.avito.android.advert_core.discount.item.contact.c f439827h;

    public C48868d(com.avito.android.advert_core.discount.item.title.c cVar, com.avito.android.advert_core.discount.item.subtitle.c cVar2, com.avito.android.advert_core.discount.item.discount.c cVar3, g gVar, com.avito.android.advert_core.discount.item.dotted_discount.c cVar4, com.avito.android.advert_core.discount.item.divider.c cVar5, com.avito.android.advert_core.discount.item.information.c cVar6, com.avito.android.advert_core.discount.item.contact.c cVar7) {
        this.f439820a = cVar;
        this.f439821b = cVar2;
        this.f439822c = cVar3;
        this.f439823d = gVar;
        this.f439824e = cVar4;
        this.f439825f = cVar5;
        this.f439826g = cVar6;
        this.f439827h = cVar7;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.advert_core.discount.item.title.b bVar = (com.avito.android.advert_core.discount.item.title.b) this.f439820a.get();
        com.avito.android.advert_core.discount.item.subtitle.b bVar2 = (com.avito.android.advert_core.discount.item.subtitle.b) this.f439821b.get();
        com.avito.android.advert_core.discount.item.discount.b bVar3 = (com.avito.android.advert_core.discount.item.discount.b) this.f439822c.get();
        f fVar = (f) this.f439823d.get();
        com.avito.android.advert_core.discount.item.dotted_discount.b bVar4 = (com.avito.android.advert_core.discount.item.dotted_discount.b) this.f439824e.get();
        com.avito.android.advert_core.discount.item.divider.b bVar5 = (com.avito.android.advert_core.discount.item.divider.b) this.f439825f.get();
        com.avito.android.advert_core.discount.item.information.b bVar6 = (com.avito.android.advert_core.discount.item.information.b) this.f439826g.get();
        com.avito.android.advert_core.discount.item.contact.b bVar7 = (com.avito.android.advert_core.discount.item.contact.b) this.f439827h.get();
        int i12 = C48865a.f439816a;
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(bVar);
        c10493a.b(bVar2);
        c10493a.b(bVar3);
        c10493a.b(fVar);
        c10493a.b(bVar4);
        c10493a.b(bVar5);
        c10493a.b(bVar6);
        c10493a.b(bVar7);
        return c10493a.a();
    }
}
