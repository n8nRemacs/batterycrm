package com.avito.android.short_term_rent.bookingform.promocode.promocodeitem;

import com.avito.android.short_term_rent.bookingform.promocode.promocodeitem.e;
import ew0.InterfaceC40169c;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: PromoCodeItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/promocode/promocodeitem/j;", "LTV0/f;", "Lcom/avito/android/short_term_rent/bookingform/promocode/promocodeitem/l;", "Lcom/avito/android/short_term_rent/bookingform/promocode/promocodeitem/PromoCodeItem;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j implements TV0.f<l, PromoCodeItem> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC40169c, G0> f282208b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public j(@Y61.k Y41.l<? super InterfaceC40169c, G0> lVar) {
        this.f282208b = lVar;
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((l) eVar, (PromoCodeItem) aVar);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        l lVar = (l) eVar;
        PromoCodeItem promoCodeItem = (PromoCodeItem) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof List) {
                obj = obj2;
            }
        }
        List<e> list2 = (List) (obj instanceof List ? obj : null);
        if (list2 == null) {
            list2 = C42784z0.f406748b;
        }
        if (list2.isEmpty()) {
            k(lVar, promoCodeItem);
        }
        lVar.a(new i(this, promoCodeItem));
        for (e eVar2 : list2) {
            if (eVar2 instanceof e.b) {
                lVar.i(((e.b) eVar2).f282199a);
            } else if (eVar2 instanceof e.c) {
                lVar.BV(((e.c) eVar2).f282200a);
            } else if (eVar2 instanceof e.C8422e) {
                lVar.y(((e.C8422e) eVar2).f282202a);
            } else if (eVar2 instanceof e.a) {
                lVar.setEnabled(promoCodeItem.f282192h);
            } else if (eVar2 instanceof e.d) {
                lVar.eo(((e.d) eVar2).f282201a);
            }
        }
    }

    public final void k(@Y61.k l lVar, @Y61.k PromoCodeItem promoCodeItem) {
        lVar.i(promoCodeItem.f282188d);
        lVar.BV(promoCodeItem.f282189e);
        lVar.y(promoCodeItem.f282190f);
        lVar.eo(promoCodeItem.f282191g);
        lVar.setEnabled(promoCodeItem.f282192h);
        lVar.a(new h(this, promoCodeItem));
    }
}
