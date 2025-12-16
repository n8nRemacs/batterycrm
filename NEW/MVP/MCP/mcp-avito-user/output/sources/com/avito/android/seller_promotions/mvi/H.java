package com.avito.android.seller_promotions.mvi;

import Oq0.b;
import Oq0.c;
import Oq0.g;
import Sq0.C15214a;
import Sq0.c;
import com.avito.android.R;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.cart_snippet_actions.models.api.CartSnippetActionsStepper;
import com.avito.android.cart_snippet_actions.models.ui.Stepper;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.beduin_v2.repository.domain.cart_items.model.CartItemInfo;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.Image;
import com.avito.android.seller_promotions.konveyor.pagination.a;
import com.avito.android.seller_promotions.mvi.entity.SellerPromotionsInternalAction;
import gj.InterfaceC40691b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import wn.C49654a;

/* compiled from: SellerPromotionsReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/seller_promotions/mvi/H;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction;", "LOq0/g;", "a", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class H implements com.avito.android.arch.mvi.u<SellerPromotionsInternalAction, Oq0.g> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40691b f267924b;

    /* compiled from: SellerPromotionsReducer.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/seller_promotions/mvi/H$a;", "", "<init>", "()V", "", "PROMOTION_CONDITION_ID", "Ljava/lang/String;", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public H(@Y61.k InterfaceC40691b interfaceC40691b) {
        this.f267924b = interfaceC40691b;
    }

    @Override // com.avito.android.arch.mvi.u
    public final Oq0.g a(SellerPromotionsInternalAction sellerPromotionsInternalAction, Oq0.g gVar) {
        com.avito.android.seller_promotions.konveyor.snippet.d dVar;
        Stepper stepper;
        boolean zBooleanValue;
        ArrayList arrayListI0;
        SellerPromotionsInternalAction sellerPromotionsInternalAction2 = sellerPromotionsInternalAction;
        Oq0.g gVar2 = gVar;
        if (sellerPromotionsInternalAction2 instanceof SellerPromotionsInternalAction.PromotionsLoading) {
            return Oq0.g.a(gVar2, null, null, ((SellerPromotionsInternalAction.PromotionsLoading) sellerPromotionsInternalAction2).f267977d ? b.a.f12564a : b.c.f12566a, 0L, null, 0, null, null, null, 507);
        }
        if (sellerPromotionsInternalAction2 instanceof SellerPromotionsInternalAction.PromotionsLoaded) {
            Sq0.f fVar = ((SellerPromotionsInternalAction.PromotionsLoaded) sellerPromotionsInternalAction2).f267976b;
            Boolean isLastItems = fVar.getIsLastItems();
            zBooleanValue = isLastItems != null ? isLastItems.booleanValue() : false;
            List listSingletonList = Collections.singletonList(new com.avito.android.seller_promotions.konveyor.attributed_text.c("promotion-condition", null, fVar.getPromotionCondition(), 2, null));
            List<Sq0.c> listE = fVar.e();
            ArrayList arrayList = new ArrayList(C42745f0.q(listE, 10));
            Iterator<T> it = listE.iterator();
            while (it.hasNext()) {
                arrayList.add(b((Sq0.c) it.next(), fVar.getDiscountPercents()));
            }
            if (!zBooleanValue) {
                com.avito.android.seller_promotions.konveyor.pagination.a.f267806e.getClass();
                arrayList = C42745f0.i0(com.avito.android.seller_promotions.konveyor.pagination.a.f267807f, arrayList);
            }
            return Oq0.g.a(gVar2, null, com.avito.android.printable_text.b.f(fVar.getTitle()), b.C0809b.f12565a, fVar.getItemsOffset(), new c.b(zBooleanValue), fVar.getDiscountPercents(), null, null, C42745f0.h0(arrayList, listSingletonList), 129);
        }
        boolean z12 = sellerPromotionsInternalAction2 instanceof SellerPromotionsInternalAction.PageLoading;
        List<com.avito.android.seller_promotions.konveyor.c> list = gVar2.f12624j;
        if (z12) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (!(((com.avito.android.seller_promotions.konveyor.c) obj) instanceof com.avito.android.seller_promotions.konveyor.pagination.a)) {
                    arrayList2.add(obj);
                }
            }
            com.avito.android.seller_promotions.konveyor.pagination.a.f267806e.getClass();
            return Oq0.g.a(gVar2, null, null, null, 0L, c.C0810c.f12569a, 0, null, null, C42745f0.i0(com.avito.android.seller_promotions.konveyor.pagination.a.f267807f, arrayList2), 239);
        }
        if (sellerPromotionsInternalAction2 instanceof SellerPromotionsInternalAction.PageLoaded) {
            Sq0.g gVar3 = ((SellerPromotionsInternalAction.PageLoaded) sellerPromotionsInternalAction2).f267972b;
            List<Sq0.c> listA = gVar3.a();
            ArrayList arrayList3 = new ArrayList(C42745f0.q(listA, 10));
            Iterator<T> it2 = listA.iterator();
            while (it2.hasNext()) {
                arrayList3.add(b((Sq0.c) it2.next(), gVar2.f12621g));
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : list) {
                if (!(((com.avito.android.seller_promotions.konveyor.c) obj2) instanceof com.avito.android.seller_promotions.konveyor.pagination.a)) {
                    arrayList4.add(obj2);
                }
            }
            ArrayList arrayListH0 = C42745f0.h0(arrayList3, arrayList4);
            Boolean isLastItems2 = gVar3.getIsLastItems();
            zBooleanValue = isLastItems2 != null ? isLastItems2.booleanValue() : false;
            long itemsOffset = gVar3.getItemsOffset();
            c.b bVar = new c.b(zBooleanValue);
            if (zBooleanValue) {
                arrayListI0 = arrayListH0;
            } else {
                com.avito.android.seller_promotions.konveyor.pagination.a.f267806e.getClass();
                arrayListI0 = C42745f0.i0(com.avito.android.seller_promotions.konveyor.pagination.a.f267807f, arrayListH0);
            }
            return Oq0.g.a(gVar2, null, null, null, itemsOffset, bVar, 0, null, null, arrayListI0, 231);
        }
        if (sellerPromotionsInternalAction2 instanceof SellerPromotionsInternalAction.PageLoadingError) {
            String strI = com.avito.android.error.z.i(((SellerPromotionsInternalAction.PageLoadingError) sellerPromotionsInternalAction2).f267974b);
            PrintableText printableTextF = strI != null ? com.avito.android.printable_text.b.f(strI) : com.avito.android.printable_text.b.c(R.string.seller_promotions_failed_to_load_page_message, new Serializable[0]);
            ArrayList arrayList5 = new ArrayList();
            for (Object obj3 : list) {
                if (!(((com.avito.android.seller_promotions.konveyor.c) obj3) instanceof com.avito.android.seller_promotions.konveyor.pagination.a)) {
                    arrayList5.add(obj3);
                }
            }
            return Oq0.g.a(gVar2, null, null, null, 0L, c.a.f12567a, 0, null, null, C42745f0.i0(new com.avito.android.seller_promotions.konveyor.pagination.a(null, null, new a.b.C8010a(printableTextF, com.avito.android.printable_text.b.c(R.string.seller_promotions_refresh, new Serializable[0])), 3, null), arrayList5), 239);
        }
        if (sellerPromotionsInternalAction2 instanceof SellerPromotionsInternalAction.HandleApiError) {
            return Oq0.g.a(gVar2, null, null, b.C0809b.f12565a, 0L, null, 0, new g.b(com.avito.android.printable_text.b.f(com.avito.android.error.z.k(((SellerPromotionsInternalAction.HandleApiError) sellerPromotionsInternalAction2).f267961b)), null, com.avito.android.printable_text.b.c(R.string.seller_promotions_refresh, new Serializable[0]), 2, null), null, null, 443);
        }
        if (sellerPromotionsInternalAction2 instanceof SellerPromotionsInternalAction.InternalError) {
            return Oq0.g.a(gVar2, null, null, b.C0809b.f12565a, 0L, null, 0, new g.b(com.avito.android.printable_text.b.f(com.avito.android.error.z.l(((SellerPromotionsInternalAction.InternalError) sellerPromotionsInternalAction2).f267964b)), null, null, 6, null), null, null, 443);
        }
        if (sellerPromotionsInternalAction2 instanceof SellerPromotionsInternalAction.UpdateCartIconState) {
            return Oq0.g.a(gVar2, null, null, null, 0L, null, 0, null, ((SellerPromotionsInternalAction.UpdateCartIconState) sellerPromotionsInternalAction2).f267983b, null, 383);
        }
        if (sellerPromotionsInternalAction2 instanceof SellerPromotionsInternalAction.RevertItemsStocks) {
            List<com.avito.android.seller_promotions.konveyor.c> list2 = list;
            ArrayList arrayList6 = new ArrayList(C42745f0.q(list2, 10));
            for (com.avito.conveyor_item.a aVarA : list2) {
                if (aVarA instanceof com.avito.android.seller_promotions.konveyor.snippet.d) {
                    Integer num = (Integer) ((SellerPromotionsInternalAction.RevertItemsStocks) sellerPromotionsInternalAction2).f267978b.get(((com.avito.android.seller_promotions.konveyor.snippet.d) aVarA).f267834b);
                    if (num != null) {
                        int iIntValue = num.intValue();
                        com.avito.android.seller_promotions.konveyor.snippet.d dVar2 = (com.avito.android.seller_promotions.konveyor.snippet.d) aVarA;
                        Stepper stepper2 = dVar2.f267840h;
                        aVarA = com.avito.android.seller_promotions.konveyor.snippet.d.a(dVar2, null, stepper2 != null ? Stepper.a(stepper2, iIntValue, null, 30) : null, false, 1983);
                    } else {
                        aVarA = (com.avito.android.seller_promotions.konveyor.snippet.d) aVarA;
                    }
                }
                arrayList6.add(aVarA);
            }
            return Oq0.g.a(gVar2, null, null, null, 0L, null, 0, null, null, arrayList6, 255);
        }
        if (sellerPromotionsInternalAction2 instanceof SellerPromotionsInternalAction.UpdateItemsStocks) {
            List<com.avito.android.seller_promotions.konveyor.c> list3 = list;
            ArrayList arrayList7 = new ArrayList(C42745f0.q(list3, 10));
            for (com.avito.conveyor_item.a aVarA2 : list3) {
                if (aVarA2 instanceof com.avito.android.seller_promotions.konveyor.snippet.d) {
                    com.avito.android.seller_promotions.konveyor.snippet.d dVar3 = (com.avito.android.seller_promotions.konveyor.snippet.d) aVarA2;
                    aVarA2 = com.avito.android.seller_promotions.konveyor.snippet.d.a(dVar3, null, com.avito.android.cart_snippet_actions.utils.i.a(dVar3.f267840h, (CartItemInfo) ((SellerPromotionsInternalAction.UpdateItemsStocks) sellerPromotionsInternalAction2).f267985b.get(((com.avito.android.seller_promotions.konveyor.snippet.d) aVarA2).f267834b)), false, 1983);
                }
                arrayList7.add(aVarA2);
            }
            return Oq0.g.a(gVar2, null, null, null, 0L, null, 0, null, null, arrayList7, 255);
        }
        if (sellerPromotionsInternalAction2 instanceof SellerPromotionsInternalAction.ChangeItemQuantity) {
            List<com.avito.android.seller_promotions.konveyor.c> list4 = list;
            ArrayList arrayList8 = new ArrayList(C42745f0.q(list4, 10));
            for (com.avito.conveyor_item.a aVarA3 : list4) {
                SellerPromotionsInternalAction.ChangeItemQuantity changeItemQuantity = (SellerPromotionsInternalAction.ChangeItemQuantity) sellerPromotionsInternalAction2;
                if (L.f(aVarA3.getF270098b(), changeItemQuantity.f267958b) && (aVarA3 instanceof com.avito.android.seller_promotions.konveyor.snippet.d) && (stepper = (dVar = (com.avito.android.seller_promotions.konveyor.snippet.d) aVarA3).f267840h) != null) {
                    int i12 = stepper.f116272c;
                    int i13 = changeItemQuantity.f267959c;
                    aVarA3 = com.avito.android.seller_promotions.konveyor.snippet.d.a(dVar, null, Stepper.a(stepper, i13, C49654a.a(i13, i12), 22), false, 1983);
                }
                arrayList8.add(aVarA3);
            }
            return Oq0.g.a(gVar2, null, null, null, 0L, null, 0, null, null, arrayList8, 255);
        }
        if (sellerPromotionsInternalAction2 instanceof SellerPromotionsInternalAction.SetItemsFavorite) {
            SellerPromotionsInternalAction.SetItemsFavorite setItemsFavorite = (SellerPromotionsInternalAction.SetItemsFavorite) sellerPromotionsInternalAction2;
            Set setP0 = C42745f0.P0(setItemsFavorite.f267979b);
            List<com.avito.android.seller_promotions.konveyor.c> list5 = list;
            ArrayList arrayList9 = new ArrayList(C42745f0.q(list5, 10));
            for (com.avito.conveyor_item.a aVarA4 : list5) {
                if ((aVarA4 instanceof com.avito.android.seller_promotions.konveyor.snippet.d) && setP0.contains(((com.avito.android.seller_promotions.konveyor.snippet.d) aVarA4).f267834b)) {
                    aVarA4 = com.avito.android.seller_promotions.konveyor.snippet.d.a((com.avito.android.seller_promotions.konveyor.snippet.d) aVarA4, null, null, setItemsFavorite.f267980c, 1919);
                }
                arrayList9.add(aVarA4);
            }
            return Oq0.g.a(gVar2, null, null, null, 0L, null, 0, null, null, arrayList9, 255);
        }
        if (sellerPromotionsInternalAction2 instanceof SellerPromotionsInternalAction.UpdatePromotionCondition) {
            List<com.avito.android.seller_promotions.konveyor.c> list6 = list;
            ArrayList arrayList10 = new ArrayList(C42745f0.q(list6, 10));
            for (com.avito.conveyor_item.a cVar : list6) {
                if ((cVar instanceof com.avito.android.seller_promotions.konveyor.attributed_text.c) && L.f(((com.avito.android.seller_promotions.konveyor.attributed_text.c) cVar).f267765b, "promotion-condition")) {
                    cVar = new com.avito.android.seller_promotions.konveyor.attributed_text.c("promotion-condition", null, ((SellerPromotionsInternalAction.UpdatePromotionCondition) sellerPromotionsInternalAction2).f267986b, 2, null);
                }
                arrayList10.add(cVar);
            }
            return Oq0.g.a(gVar2, null, null, null, 0L, null, 0, null, null, arrayList10, 255);
        }
        if (!(sellerPromotionsInternalAction2 instanceof SellerPromotionsInternalAction.UpdateDiscountPercents)) {
            return sellerPromotionsInternalAction2 instanceof SellerPromotionsInternalAction.SetXHash ? Oq0.g.a(gVar2, ((SellerPromotionsInternalAction.SetXHash) sellerPromotionsInternalAction2).f267981b, null, null, 0L, null, 0, null, null, null, 510) : gVar2;
        }
        SellerPromotionsInternalAction.UpdateDiscountPercents updateDiscountPercents = (SellerPromotionsInternalAction.UpdateDiscountPercents) sellerPromotionsInternalAction2;
        List<com.avito.android.seller_promotions.konveyor.c> list7 = list;
        ArrayList arrayList11 = new ArrayList(C42745f0.q(list7, 10));
        Iterator<T> it3 = list7.iterator();
        while (true) {
            boolean zHasNext = it3.hasNext();
            int i14 = updateDiscountPercents.f267984b;
            if (!zHasNext) {
                return Oq0.g.a(gVar2, null, null, null, 0L, null, i14, null, null, arrayList11, 223);
            }
            com.avito.conveyor_item.a aVarA5 = (com.avito.android.seller_promotions.konveyor.c) it3.next();
            if (aVarA5 instanceof com.avito.android.seller_promotions.konveyor.snippet.d) {
                com.avito.android.seller_promotions.konveyor.snippet.d dVar4 = (com.avito.android.seller_promotions.konveyor.snippet.d) aVarA5;
                C15214a c15214aA = C15214a.a(i14);
                if (c15214aA.f15166a <= 0) {
                    c15214aA = null;
                }
                aVarA5 = com.avito.android.seller_promotions.konveyor.snippet.d.a(dVar4, c15214aA, null, false, 2015);
            }
            arrayList11.add(aVarA5);
        }
    }

    public final com.avito.android.seller_promotions.konveyor.c b(Sq0.c cVar, int i12) {
        Stepper stepper;
        boolean z12 = cVar instanceof c.a;
        InterfaceC40691b interfaceC40691b = this.f267924b;
        if (z12) {
            c.a aVar = (c.a) cVar;
            String id2 = aVar.getId();
            if (id2 == null) {
                id2 = "main";
            }
            String str = id2;
            return new com.avito.android.seller_promotions.konveyor.beduin.c(str, null, com.avito.android.beduin_shared.model.utils.b.a(interfaceC40691b, str, aVar.a()), 2, null);
        }
        if (!(cVar instanceof c.b)) {
            throw new NoWhenBranchMatchedException();
        }
        c.b bVar = (c.b) cVar;
        CartSnippetActionsStepper stepper2 = bVar.getStepper();
        if (stepper2 != null) {
            Integer maxValue = stepper2.getMaxValue();
            stepper = new Stepper(stepper2.getValue(), maxValue != null ? maxValue.intValue() : Integer.MAX_VALUE, null, null, false, 28, null);
        } else {
            stepper = null;
        }
        String id3 = bVar.getId();
        Image image = bVar.getImage();
        String title = bVar.getTitle();
        double price = bVar.getPrice();
        C15214a c15214aA = C15214a.a(i12);
        C15214a c15214a = c15214aA.f15166a > 0 ? c15214aA : null;
        boolean isFavorite = bVar.getIsFavorite();
        DeepLink onTapDeepLink = bVar.getOnTapDeepLink();
        List<BeduinModel> listA = bVar.a();
        String id4 = bVar.getId();
        List<BeduinModel> listA2 = bVar.a();
        if (listA2 == null) {
            listA2 = C42784z0.f406748b;
        }
        return new com.avito.android.seller_promotions.konveyor.snippet.d(id3, null, image, title, price, c15214a, stepper, isFavorite, onTapDeepLink, listA, com.avito.android.beduin_shared.model.utils.b.a(interfaceC40691b, id4, listA2), 2, null);
    }
}
