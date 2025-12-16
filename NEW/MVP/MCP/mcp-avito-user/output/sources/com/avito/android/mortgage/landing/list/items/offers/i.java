package com.avito.android.mortgage.landing.list.items.offers;

import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.landing.list.items.offers.offer.OfferItem;
import com.avito.android.mortgage.landing.list.items.offers.payload.a;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import u00.InterfaceC48753a;
import w00.InterfaceC49409a;

/* compiled from: OffersPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/offers/i;", "LTV0/f;", "Lcom/avito/android/mortgage/landing/list/items/offers/k;", "Lcom/avito/android/mortgage/landing/list/items/offers/OffersItem;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class i implements TV0.f<k, OffersItem> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC49409a, G0> f199820b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.l<Boolean, G0> f199821c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC48753a f199822d;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public i(@Y61.k Y41.l<? super InterfaceC49409a, G0> lVar, @Y61.k Y41.l<? super Boolean, G0> lVar2, @Y61.k InterfaceC48753a interfaceC48753a) {
        this.f199820b = lVar;
        this.f199821c = lVar2;
        this.f199822d = interfaceC48753a;
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((k) eVar, (OffersItem) aVar);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        k kVar = (k) eVar;
        OffersItem offersItem = (OffersItem) aVar;
        G0 g02 = null;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof List) {
                obj = obj2;
            }
        }
        if (!(obj instanceof List)) {
            obj = null;
        }
        List<com.avito.android.mortgage.landing.list.items.offers.payload.a> list2 = (List) obj;
        if (list2 != null) {
            for (com.avito.android.mortgage.landing.list.items.offers.payload.a aVar2 : list2) {
                if (aVar2 instanceof a.c) {
                    kVar.It(((a.c) aVar2).f199874a);
                } else if (aVar2 instanceof a.C5907a) {
                    kVar.I40(((a.C5907a) aVar2).f199872a);
                } else if (aVar2 instanceof a.d) {
                    a.d dVar = (a.d) aVar2;
                    if (dVar.f199875a) {
                        kVar.XK();
                    } else if (dVar.f199876b) {
                        kVar.AP();
                    } else {
                        kVar.NO();
                    }
                } else if (aVar2 instanceof a.b) {
                    kVar.nj(((a.b) aVar2).f199873a);
                }
            }
            g02 = G0.f406611a;
        }
        if (g02 == null) {
            k(kVar, offersItem);
        }
    }

    public final void k(@Y61.k k kVar, @Y61.k OffersItem offersItem) {
        kVar.Tc(offersItem.f199794c);
        kVar.Rw(offersItem.f199795d);
        kVar.nj(offersItem.f199799h);
        kVar.I40(offersItem.f199798g);
        List<OfferItem> list = offersItem.f199796e;
        if (list != null) {
            kVar.It(list);
        }
        if (offersItem.f199797f) {
            kVar.XK();
        } else if (offersItem.isEmpty()) {
            kVar.AP();
        } else {
            kVar.NO();
        }
        kVar.U10(new e(this));
        kVar.M40(new f(this));
        kVar.KY(new g(this));
        kVar.Na(this.f199821c);
        kVar.e3(this.f199822d.a(offersItem.f199793b));
        kVar.FM(new h(kVar, this, offersItem));
    }
}
