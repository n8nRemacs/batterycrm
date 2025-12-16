package com.avito.android.user_advert.advert.items;

import com.avito.android.user_advert.advert.items.installments_promoblock.a;
import com.avito.android.user_advert.advert.items.safe_deal_services.c;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MyAdvertItemPayloadCreator.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_advert/advert/items/I;", "Lcom/avito/android/recycler/data_aware/a;", "<init>", "()V", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class I implements com.avito.android.recycler.data_aware.a {
    @Inject
    public I() {
    }

    @Override // com.avito.android.recycler.data_aware.a
    @Y61.l
    public final Object a(@Y61.l TV0.a aVar, @Y61.l TV0.a aVar2) {
        Object c35403d;
        if (!kotlin.jvm.internal.L.f(aVar != null ? Long.valueOf(aVar.getId()) : null, aVar2 != null ? Long.valueOf(aVar2.getId()) : null)) {
            return null;
        }
        if ((aVar instanceof com.avito.android.user_advert.advert.items.gallery.c) && (aVar2 instanceof com.avito.android.user_advert.advert.items.gallery.c)) {
            com.avito.android.user_advert.advert.items.gallery.c cVar = (com.avito.android.user_advert.advert.items.gallery.c) aVar2;
            c35403d = new F(cVar.f309412d);
            com.avito.android.user_advert.advert.items.gallery.c cVar2 = (com.avito.android.user_advert.advert.items.gallery.c) aVar;
            if (!kotlin.jvm.internal.L.f(cVar2.f309413e, cVar.f309413e) || !kotlin.jvm.internal.L.f(cVar2.f309414f, cVar.f309414f)) {
                return null;
            }
        } else {
            if ((aVar instanceof OH0.e) && (aVar2 instanceof OH0.e)) {
                OH0.e eVar = (OH0.e) aVar2;
                return new j0(eVar.f12164d, eVar.f12165e);
            }
            if ((aVar instanceof c.b.a) && (aVar2 instanceof c.b.a)) {
                c.b.a aVar3 = (c.b.a) aVar2;
                return new i0(aVar3.f310038f, aVar3.f310037e, aVar3.f310042j, aVar3.f310041i);
            }
            if ((aVar instanceof com.avito.android.user_advert.advert.items.installments_promoblock.a) && (aVar2 instanceof com.avito.android.user_advert.advert.items.installments_promoblock.a)) {
                a.C9491a c9491a = ((com.avito.android.user_advert.advert.items.installments_promoblock.a) aVar2).f309495g;
                return new C35401b(c9491a != null ? c9491a.f309500b : null, c9491a != null ? c9491a.f309504f : false, c9491a != null ? c9491a.f309502d : false);
            }
            if ((aVar instanceof com.avito.android.user_advert.advert.items.auto_publish.a) && (aVar2 instanceof com.avito.android.user_advert.advert.items.auto_publish.a)) {
                com.avito.android.user_advert.advert.items.auto_publish.a aVar4 = (com.avito.android.user_advert.advert.items.auto_publish.a) aVar2;
                return new C35400a(aVar4.f309242h, aVar4.f309241g);
            }
            if ((aVar instanceof com.avito.android.user_advert.advert.items.description.a) && (aVar2 instanceof com.avito.android.user_advert.advert.items.description.a)) {
                com.avito.android.user_advert.advert.items.description.a aVar5 = (com.avito.android.user_advert.advert.items.description.a) aVar2;
                c35403d = new C35412m(aVar5.f309357d);
                if (!kotlin.jvm.internal.L.f(((com.avito.android.user_advert.advert.items.description.a) aVar).f309356c, aVar5.f309356c)) {
                    return null;
                }
            } else {
                if ((aVar instanceof com.avito.android.user_advert.advert.items.realty.verification.a) && (aVar2 instanceof com.avito.android.user_advert.advert.items.realty.verification.a)) {
                    return new h0(((com.avito.android.user_advert.advert.items.realty.verification.a) aVar2).f309952e);
                }
                if ((aVar instanceof com.avito.android.user_advert.advert.items.machinery_rental_banner.e) && (aVar2 instanceof com.avito.android.user_advert.advert.items.machinery_rental_banner.e)) {
                    Boolean boolValueOf = Boolean.valueOf(((com.avito.android.user_advert.advert.items.machinery_rental_banner.e) aVar2).f309585e);
                    Boolean bool = kotlin.jvm.internal.L.f(boolValueOf, Boolean.valueOf(((com.avito.android.user_advert.advert.items.machinery_rental_banner.e) aVar).f309585e)) ? null : boolValueOf;
                    c35403d = new C35402c(bool != null ? bool.booleanValue() : false);
                } else {
                    if (!(aVar instanceof com.avito.android.user_advert.advert.items.multi_urgency.c) || !(aVar2 instanceof com.avito.android.user_advert.advert.items.multi_urgency.c)) {
                        return null;
                    }
                    com.avito.android.user_advert.advert.items.multi_urgency.c cVar3 = (com.avito.android.user_advert.advert.items.multi_urgency.c) aVar2;
                    List<com.avito.android.user_advert.advert.items.multi_urgency.l> list = cVar3.f309645i;
                    com.avito.android.user_advert.advert.items.multi_urgency.c cVar4 = (com.avito.android.user_advert.advert.items.multi_urgency.c) aVar;
                    if (kotlin.jvm.internal.L.f(list, cVar4.f309645i)) {
                        list = null;
                    }
                    List<com.avito.android.user_advert.advert.items.multi_urgency.l> list2 = list;
                    Boolean boolValueOf2 = Boolean.valueOf(cVar3.f309647k);
                    if (kotlin.jvm.internal.L.f(boolValueOf2, Boolean.valueOf(cVar4.f309647k))) {
                        boolValueOf2 = null;
                    }
                    Boolean boolValueOf3 = Boolean.valueOf(cVar3.f309646j);
                    c35403d = new C35403d(list2, boolValueOf2, kotlin.jvm.internal.L.f(boolValueOf3, Boolean.valueOf(cVar4.f309646j)) ? null : boolValueOf3);
                }
            }
        }
        return c35403d;
    }
}
