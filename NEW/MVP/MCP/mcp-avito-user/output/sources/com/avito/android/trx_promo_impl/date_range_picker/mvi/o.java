package com.avito.android.trx_promo_impl.date_range_picker.mvi;

import SF0.c;
import com.avito.android.arch.mvi.u;
import com.avito.android.lib.design.chips.state.ItemChipable;
import com.avito.android.lib.design.picker.k;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.trx_promo_impl.date_range_picker.mvi.entity.TrxPromoDateRangePickerInternalAction;
import com.avito.android.trx_promo_public.deeplink.TrxPromoConfigureDateRangePickerLinkContent;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42829l0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: TrxPromoDateRangePickerReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/trx_promo_impl/date_range_picker/mvi/o;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/trx_promo_impl/date_range_picker/mvi/entity/TrxPromoDateRangePickerInternalAction;", "LSF0/c;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class o implements u<TrxPromoDateRangePickerInternalAction, SF0.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.trx_promo_impl.date_range_picker.data.mapper.a f304065b;

    @Inject
    public o(@Y61.k com.avito.android.trx_promo_impl.date_range_picker.data.mapper.a aVar) {
        this.f304065b = aVar;
    }

    public static C42829l0 b(LocalDate localDate) {
        com.avito.android.trx_promo_impl.b.f303905a.getClass();
        if (L.f(localDate, com.avito.android.trx_promo_impl.b.f303906b)) {
            return null;
        }
        int dayOfMonth = localDate.getDayOfMonth();
        com.avito.android.lib.design.picker.k kVar = new com.avito.android.lib.design.picker.k(Integer.valueOf(dayOfMonth), String.valueOf(dayOfMonth));
        Month month = localDate.getMonth();
        com.avito.android.lib.design.picker.k.f180042c.getClass();
        com.avito.android.lib.design.picker.k<?> kVar2 = com.avito.android.lib.design.picker.k.f180044e.get(month.ordinal());
        int year = localDate.getYear();
        return new C42829l0(kVar, kVar2, new com.avito.android.lib.design.picker.k(Integer.valueOf(year), String.valueOf(year)));
    }

    public static List c(LocalDate localDate) {
        com.avito.android.trx_promo_impl.b.f303905a.getClass();
        if (L.f(localDate, com.avito.android.trx_promo_impl.b.f303906b)) {
            return C42784z0.f406748b;
        }
        com.avito.android.lib.design.picker.k.f180042c.getClass();
        return C42745f0.U(new Q(k.a.b(), new com.avito.android.lib.design.picker.m(null, false, 0, 7, null)), new Q(com.avito.android.lib.design.picker.k.f180044e, new com.avito.android.lib.design.picker.m(null, false, 0, 7, null)), new Q(k.a.d(localDate.getYear(), localDate.plusYears(10L).getYear()), new com.avito.android.lib.design.picker.m(null, false, 0, 5, null)));
    }

    @Override // com.avito.android.arch.mvi.u
    public final SF0.c a(TrxPromoDateRangePickerInternalAction trxPromoDateRangePickerInternalAction, SF0.c cVar) {
        LocalDate localDateB;
        LocalDate localDateB2;
        TrxPromoDateRangePickerInternalAction trxPromoDateRangePickerInternalAction2 = trxPromoDateRangePickerInternalAction;
        SF0.c cVar2 = cVar;
        boolean z12 = trxPromoDateRangePickerInternalAction2 instanceof TrxPromoDateRangePickerInternalAction.Content;
        c.b bVar = cVar2.f14863b;
        com.avito.android.trx_promo_impl.date_range_picker.data.mapper.a aVar = this.f304065b;
        if (z12) {
            TrxPromoDateRangePickerInternalAction.Content content = (TrxPromoDateRangePickerInternalAction.Content) trxPromoDateRangePickerInternalAction2;
            TrxPromoConfigureDateRangePickerLinkContent trxPromoConfigureDateRangePickerLinkContent = content.f304039b;
            LocalDate localDateB3 = aVar.b(trxPromoConfigureDateRangePickerLinkContent.getStartDateInfo().getStartDate());
            if (localDateB3 == null) {
                com.avito.android.trx_promo_impl.b.f303905a.getClass();
                localDateB3 = com.avito.android.trx_promo_impl.b.f303906b;
            }
            LocalDate localDateB4 = aVar.b(trxPromoConfigureDateRangePickerLinkContent.getEndDateInfo().getStartDate());
            if (localDateB4 == null) {
                com.avito.android.trx_promo_impl.b.f303905a.getClass();
                localDateB4 = com.avito.android.trx_promo_impl.b.f303906b;
            }
            String str = content.f304040c;
            if ((str == null || (localDateB = aVar.b(str)) == null) && (localDateB = aVar.b(trxPromoConfigureDateRangePickerLinkContent.getStartDateInfo().getSelectedDate())) == null) {
                com.avito.android.trx_promo_impl.b.f303905a.getClass();
                localDateB = com.avito.android.trx_promo_impl.b.f303906b;
            }
            LocalDate localDate = localDateB;
            String str2 = content.f304041d;
            if ((str2 == null || (localDateB2 = aVar.b(str2)) == null) && (localDateB2 = aVar.b(trxPromoConfigureDateRangePickerLinkContent.getEndDateInfo().getSelectedDate())) == null) {
                com.avito.android.trx_promo_impl.b.f303905a.getClass();
                localDateB2 = com.avito.android.trx_promo_impl.b.f303906b;
            }
            LocalDate localDate2 = localDateB2;
            String screenTitle = trxPromoConfigureDateRangePickerLinkContent.getScreenTitle();
            List listU = C42745f0.U(new ItemChipable(1, null, null, null, false, null, aVar.d(localDate, trxPromoConfigureDateRangePickerLinkContent.getStartDateInfo().getTitle(), trxPromoConfigureDateRangePickerLinkContent.getStartDateInfo().getErrorTitle(), trxPromoConfigureDateRangePickerLinkContent.getStartDateInfo().getDateFormat()), false, false, 430, null), new ItemChipable(2, null, null, null, true, null, aVar.d(localDate2, trxPromoConfigureDateRangePickerLinkContent.getEndDateInfo().getTitle(), trxPromoConfigureDateRangePickerLinkContent.getEndDateInfo().getErrorTitle(), trxPromoConfigureDateRangePickerLinkContent.getEndDateInfo().getDateFormat()), false, false, 430, null));
            List listC = c(localDateB3);
            List listC2 = c(localDateB4);
            C42829l0 c42829l0B = b(localDate);
            C42829l0 c42829l0B2 = b(localDate2);
            ButtonAction button = trxPromoConfigureDateRangePickerLinkContent.getButton();
            RF0.h hVar = new RF0.h(button.getTitle(), button.getDeeplink(), button.getStyle(), button.isEnabled());
            bVar.getClass();
            return new SF0.c(new c.b(screenTitle, listU, 2, listC, listC2, c42829l0B, c42829l0B2, hVar), localDate, localDate2, aVar.c(trxPromoConfigureDateRangePickerLinkContent.getStartDateInfo().g()), aVar.c(trxPromoConfigureDateRangePickerLinkContent.getEndDateInfo().g()), trxPromoConfigureDateRangePickerLinkContent.getStartDateInfo().getTitle(), trxPromoConfigureDateRangePickerLinkContent.getStartDateInfo().getErrorTitle(), trxPromoConfigureDateRangePickerLinkContent.getStartDateInfo().getDateFormat(), trxPromoConfigureDateRangePickerLinkContent.getEndDateInfo().getTitle(), trxPromoConfigureDateRangePickerLinkContent.getEndDateInfo().getErrorTitle(), trxPromoConfigureDateRangePickerLinkContent.getEndDateInfo().getDateFormat(), trxPromoConfigureDateRangePickerLinkContent.getErrorMessage());
        }
        int i12 = 1;
        if (trxPromoDateRangePickerInternalAction2 instanceof TrxPromoDateRangePickerInternalAction.ChangeTab) {
            List<com.avito.android.lib.design.chips.h> list = bVar.f14878b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof ItemChipable) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ItemChipable itemChipable = (ItemChipable) it.next();
                arrayList2.add(ItemChipable.a(itemChipable, itemChipable.f178762b == ((TrxPromoDateRangePickerInternalAction.ChangeTab) trxPromoDateRangePickerInternalAction2).f304036b, null, 495));
            }
            return SF0.c.a(cVar2, c.b.a(bVar, arrayList2, ((TrxPromoDateRangePickerInternalAction.ChangeTab) trxPromoDateRangePickerInternalAction2).f304036b, null, null, 249), null, null, 4094);
        }
        if (trxPromoDateRangePickerInternalAction2 instanceof TrxPromoDateRangePickerInternalAction.SetSelectedDateFrom) {
            TrxPromoDateRangePickerInternalAction.SetSelectedDateFrom setSelectedDateFrom = (TrxPromoDateRangePickerInternalAction.SetSelectedDateFrom) trxPromoDateRangePickerInternalAction2;
            LocalDate localDate3 = setSelectedDateFrom.f304044b;
            C42829l0 c42829l0B3 = b(localDate3);
            List<com.avito.android.lib.design.chips.h> list2 = bVar.f14878b;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list2) {
                if (obj2 instanceof ItemChipable) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList(C42745f0.q(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                ItemChipable itemChipableA = (ItemChipable) it2.next();
                if (itemChipableA.f178762b == i12) {
                    itemChipableA = ItemChipable.a(itemChipableA, false, aVar.d(setSelectedDateFrom.f304044b, cVar2.f14868g, cVar2.f14869h, cVar2.f14870i), 447);
                }
                arrayList4.add(itemChipableA);
                i12 = 1;
            }
            return SF0.c.a(cVar2, c.b.a(cVar2.f14863b, arrayList4, 0, c42829l0B3, null, 221), localDate3, null, 4092);
        }
        if (!(trxPromoDateRangePickerInternalAction2 instanceof TrxPromoDateRangePickerInternalAction.SetSelectedDateTo)) {
            return cVar2;
        }
        TrxPromoDateRangePickerInternalAction.SetSelectedDateTo setSelectedDateTo = (TrxPromoDateRangePickerInternalAction.SetSelectedDateTo) trxPromoDateRangePickerInternalAction2;
        LocalDate localDate4 = setSelectedDateTo.f304045b;
        C42829l0 c42829l0B4 = b(localDate4);
        List<com.avito.android.lib.design.chips.h> list3 = bVar.f14878b;
        ArrayList arrayList5 = new ArrayList();
        for (Object obj3 : list3) {
            if (obj3 instanceof ItemChipable) {
                arrayList5.add(obj3);
            }
        }
        ArrayList arrayList6 = new ArrayList(C42745f0.q(arrayList5, 10));
        Iterator it3 = arrayList5.iterator();
        while (it3.hasNext()) {
            ItemChipable itemChipableA2 = (ItemChipable) it3.next();
            if (itemChipableA2.f178762b == 2) {
                itemChipableA2 = ItemChipable.a(itemChipableA2, false, aVar.d(setSelectedDateTo.f304045b, cVar2.f14871j, cVar2.f14872k, cVar2.f14873l), 447);
            }
            arrayList6.add(itemChipableA2);
        }
        return SF0.c.a(cVar2, c.b.a(cVar2.f14863b, arrayList6, 0, null, c42829l0B4, 189), null, localDate4, 4090);
    }
}
