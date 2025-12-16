package com.avito.android.comfortable_deal.end_deal.mvi.builder;

import Op.C14722a;
import Op.h;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.comfortable_deal.end_deal.model.EndDealField;
import com.avito.android.remote.model.text.AttributedText;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: EndDealFormBuilder.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/end_deal/mvi/builder/b;", "Lcom/avito/android/comfortable_deal/end_deal/mvi/builder/a;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.comfortable_deal.end_deal.mvi.builder.a
    @k
    public final LinkedHashMap a(@k String str, @k String str2, @k Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        Object obj = linkedHashMap.get(str);
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.comfortable_deal.end_deal.model.EndDealField.Comment");
        }
        EndDealField.Comment comment = (EndDealField.Comment) obj;
        linkedHashMap.put(str, new EndDealField.Comment(str2, comment.f122269c, comment.f122270d));
        return linkedHashMap;
    }

    @Override // com.avito.android.comfortable_deal.end_deal.mvi.builder.a
    @k
    public final LinkedHashMap b(@k C14722a c14722a) {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        h layout = c14722a.getLayout();
        AttributedText title = layout.getDealDate().getTitle();
        EndDealField.ChipDateInput.f122247g.getClass();
        List listSingletonList = Collections.singletonList(new EndDealField.ChipDateInput.Chip("calendar_chip", null, EndDealField.ChipDateInput.b.a(null), false, 10, null));
        ArrayList arrayList = new ArrayList(3);
        for (int i12 = 0; i12 < 3; i12++) {
            LocalDate localDateMinusDays = LocalDate.now().minusDays(i12);
            String strG = AK.c.g(i12, "calendar_chip_");
            EndDealField.ChipDateInput.f122247g.getClass();
            int dayOfMonth = LocalDate.now().getDayOfMonth() - localDateMinusDays.getDayOfMonth();
            if (dayOfMonth == 0) {
                str = "Сегодня · " + localDateMinusDays.format(EndDealField.ChipDateInput.f122248h.getValue());
            } else if (dayOfMonth != 1) {
                str = "Позавчера · " + localDateMinusDays.format(EndDealField.ChipDateInput.f122248h.getValue());
            } else {
                str = "Вчера · " + localDateMinusDays.format(EndDealField.ChipDateInput.f122248h.getValue());
            }
            arrayList.add(new EndDealField.ChipDateInput.Chip(strG, localDateMinusDays, str, false, 8, null));
        }
        linkedHashMap.put("dealDate", new EndDealField.ChipDateInput(null, title, C42745f0.h0(arrayList, listSingletonList), false, false, 25, null));
        linkedHashMap.put("objectPriceByContract", new EndDealField.RoubleInput(null, layout.getContractPrice().getPlaceholder(), layout.getContractPrice().getTitle(), null, null, false, 57, null));
        linkedHashMap.put("agentCommission", new EndDealField.RoubleInput(null, layout.getRewardAmount().getPlaceholder(), layout.getRewardAmount().getTitle(), null, 1000, false, 33, null));
        boolean multiselect = layout.getPaymentMethod().getMultiselect();
        AttributedText title2 = layout.getPaymentMethod().getTitle();
        List<Op.e> listA = layout.getPaymentMethod().a();
        ArrayList arrayList2 = new ArrayList(C42745f0.q(listA, 10));
        for (Op.e eVar : listA) {
            arrayList2.add(new EndDealField.ChipGroup.Chip(eVar.getDisableOtherChips(), eVar.getId(), eVar.getTitle(), false, false, 24, null));
        }
        linkedHashMap.put("paymentMethod", new EndDealField.ChipGroup(arrayList2, multiselect, title2));
        boolean multiselect2 = layout.getDealFeatures().getMultiselect();
        AttributedText title3 = layout.getDealFeatures().getTitle();
        List<Op.e> listA2 = layout.getDealFeatures().a();
        ArrayList arrayList3 = new ArrayList(C42745f0.q(listA2, 10));
        for (Op.e eVar2 : listA2) {
            arrayList3.add(new EndDealField.ChipGroup.Chip(eVar2.getDisableOtherChips(), eVar2.getId(), eVar2.getTitle(), false, false, 24, null));
        }
        linkedHashMap.put("dealFeatures", new EndDealField.ChipGroup(arrayList3, multiselect2, title3));
        boolean multiselect3 = layout.getUsedPartnerServices().getMultiselect();
        AttributedText title4 = layout.getUsedPartnerServices().getTitle();
        List<Op.e> listA3 = layout.getUsedPartnerServices().a();
        ArrayList arrayList4 = new ArrayList(C42745f0.q(listA3, 10));
        for (Op.e eVar3 : listA3) {
            arrayList4.add(new EndDealField.ChipGroup.Chip(eVar3.getDisableOtherChips(), eVar3.getId(), eVar3.getTitle(), false, false, 24, null));
        }
        linkedHashMap.put("usedPartnerServices", new EndDealField.ChipGroup(arrayList4, multiselect3, title4));
        Op.f comment = layout.getComment();
        if (comment != null) {
            linkedHashMap.put("comment", new EndDealField.Comment(null, comment.getPlaceholder(), comment.getTitle(), 1, null));
        }
        return linkedHashMap;
    }

    @Override // com.avito.android.comfortable_deal.end_deal.mvi.builder.a
    @k
    public final LinkedHashMap c(@k Map map, @k LocalDate localDate) {
        EndDealField.ChipDateInput.Chip chipA;
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        Object obj = linkedHashMap.get("dealDate");
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.comfortable_deal.end_deal.model.EndDealField.ChipDateInput");
        }
        EndDealField.ChipDateInput chipDateInput = (EndDealField.ChipDateInput) obj;
        List<EndDealField.ChipDateInput.Chip> list = chipDateInput.f122251d;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((EndDealField.ChipDateInput.Chip) obj2).f122257e) {
                arrayList.add(obj2);
            }
        }
        if (arrayList.size() == list.size()) {
            List<EndDealField.ChipDateInput.Chip> list2 = list;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(EndDealField.ChipDateInput.Chip.a((EndDealField.ChipDateInput.Chip) it.next(), null, null, false, 7));
            }
            list = arrayList2;
        }
        List<EndDealField.ChipDateInput.Chip> list3 = list;
        ArrayList arrayList3 = new ArrayList(C42745f0.q(list3, 10));
        for (EndDealField.ChipDateInput.Chip chip : list3) {
            if (L.f(chip.f122254b, "calendar_chip")) {
                EndDealField.ChipDateInput.f122247g.getClass();
                chipA = EndDealField.ChipDateInput.Chip.a(chip, localDate, EndDealField.ChipDateInput.b.a(localDate), true, 1);
            } else {
                chipA = EndDealField.ChipDateInput.Chip.a(chip, null, null, false, 7);
            }
            arrayList3.add(chipA);
        }
        linkedHashMap.put("dealDate", EndDealField.ChipDateInput.a(chipDateInput, localDate, arrayList3, false, 10));
        return linkedHashMap;
    }

    @Override // com.avito.android.comfortable_deal.end_deal.mvi.builder.a
    @k
    public final LinkedHashMap d(@k String str, @k String str2, @k Map map) {
        ArrayList<EndDealField.ChipGroup.Chip> arrayList;
        EndDealField.ChipGroup.Chip chip;
        EndDealField.ChipGroup.Chip chipA;
        EndDealField.ChipGroup.Chip chip2;
        EndDealField.ChipGroup.Chip chipA2;
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        Object obj = linkedHashMap.get(str);
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.comfortable_deal.end_deal.model.EndDealField.ChipGroup");
        }
        EndDealField.ChipGroup chipGroup = (EndDealField.ChipGroup) obj;
        List<EndDealField.ChipGroup.Chip> list = chipGroup.f122261d;
        EndDealField.ChipGroup.Chip chip3 = null;
        boolean z12 = chipGroup.f122259b;
        if (z12) {
            List<EndDealField.ChipGroup.Chip> list2 = list;
            arrayList = new ArrayList(C42745f0.q(list2, 10));
            for (EndDealField.ChipGroup.Chip chip4 : list2) {
                if (L.f(chip4.f122263c, str2)) {
                    chipA2 = EndDealField.ChipGroup.Chip.a(chip4, !chip4.f122265e, true, 7);
                    chip2 = chipA2;
                } else {
                    EndDealField.ChipGroup.Chip chipA3 = EndDealField.ChipGroup.Chip.a(chip4, false, true, 15);
                    chip2 = chip3;
                    chipA2 = chipA3;
                }
                arrayList.add(chipA2);
                chip3 = chip2;
            }
        } else {
            List<EndDealField.ChipGroup.Chip> list3 = list;
            arrayList = new ArrayList(C42745f0.q(list3, 10));
            for (EndDealField.ChipGroup.Chip chip5 : list3) {
                if (L.f(chip5.f122263c, str2)) {
                    chipA = EndDealField.ChipGroup.Chip.a(chip5, !chip5.f122265e, true, 7);
                    chip = chipA;
                } else {
                    EndDealField.ChipGroup.Chip chipA4 = EndDealField.ChipGroup.Chip.a(chip5, false, true, 7);
                    chip = chip3;
                    chipA = chipA4;
                }
                arrayList.add(chipA);
                chip3 = chip;
            }
        }
        if (chip3 != null && chip3.f122262b && chip3.f122265e) {
            ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
            for (EndDealField.ChipGroup.Chip chip6 : arrayList) {
                arrayList2.add(EndDealField.ChipGroup.Chip.a(chip6, chip3.equals(chip6), chip3.equals(chip6), 7));
            }
            arrayList = arrayList2;
        }
        linkedHashMap.put(str, new EndDealField.ChipGroup(arrayList, z12, chipGroup.f122260c));
        return linkedHashMap;
    }

    @Override // com.avito.android.comfortable_deal.end_deal.mvi.builder.a
    @k
    public final LinkedHashMap e(@k String str, @k String str2, @k Map map) {
        EndDealField.ChipDateInput.b bVar;
        EndDealField.ChipDateInput.Chip chip;
        EndDealField.ChipDateInput.Chip chipA;
        String strA;
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        Object obj = linkedHashMap.get(str);
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.comfortable_deal.end_deal.model.EndDealField.ChipDateInput");
        }
        EndDealField.ChipDateInput chipDateInput = (EndDealField.ChipDateInput) obj;
        List<EndDealField.ChipDateInput.Chip> list = chipDateInput.f122251d;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((EndDealField.ChipDateInput.Chip) obj2).f122257e) {
                arrayList.add(obj2);
            }
        }
        if (arrayList.size() == list.size()) {
            List<EndDealField.ChipDateInput.Chip> list2 = list;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(EndDealField.ChipDateInput.Chip.a((EndDealField.ChipDateInput.Chip) it.next(), null, null, false, 7));
            }
            list = arrayList2;
        }
        List<EndDealField.ChipDateInput.Chip> list3 = list;
        ArrayList arrayList3 = new ArrayList(C42745f0.q(list3, 10));
        Iterator<T> it2 = list3.iterator();
        EndDealField.ChipDateInput.Chip chip2 = null;
        while (true) {
            boolean zHasNext = it2.hasNext();
            bVar = EndDealField.ChipDateInput.f122247g;
            if (!zHasNext) {
                break;
            }
            EndDealField.ChipDateInput.Chip chip3 = (EndDealField.ChipDateInput.Chip) it2.next();
            if (L.f(chip3.f122254b, str2)) {
                boolean z12 = !chip3.f122257e;
                if (L.f(chip3.f122254b, "calendar_chip")) {
                    bVar.getClass();
                    strA = EndDealField.ChipDateInput.b.a(chip3.f122255c);
                } else {
                    strA = chip3.f122256d;
                }
                chipA = EndDealField.ChipDateInput.Chip.a(chip3, null, strA, z12, 3);
                chip = chipA;
            } else {
                EndDealField.ChipDateInput.Chip chipA2 = EndDealField.ChipDateInput.Chip.a(chip3, null, null, false, 7);
                chip = chip2;
                chipA = chipA2;
            }
            arrayList3.add(chipA);
            chip2 = chip;
        }
        ArrayList arrayList4 = new ArrayList(C42745f0.q(arrayList3, 10));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            EndDealField.ChipDateInput.Chip chipA3 = (EndDealField.ChipDateInput.Chip) it3.next();
            if (!L.f(chip2 != null ? chip2.f122254b : null, "calendar_chip") && L.f(chipA3.f122254b, "calendar_chip")) {
                bVar.getClass();
                chipA3 = EndDealField.ChipDateInput.Chip.a(chipA3, null, EndDealField.ChipDateInput.b.a(null), false, 9);
            }
            arrayList4.add(chipA3);
        }
        if (chip2 == null || !chip2.f122257e) {
            chip2 = null;
        }
        linkedHashMap.put(str, EndDealField.ChipDateInput.a(chipDateInput, chip2 != null ? chip2.f122255c : null, arrayList4, false, 10));
        return linkedHashMap;
    }

    @Override // com.avito.android.comfortable_deal.end_deal.mvi.builder.a
    @k
    public final LinkedHashMap f(@k String str, @k String str2, @k Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        Object obj = linkedHashMap.get(str);
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.comfortable_deal.end_deal.model.EndDealField.RoubleInput");
        }
        linkedHashMap.put(str, EndDealField.RoubleInput.a((EndDealField.RoubleInput) obj, str2, null, 54));
        return linkedHashMap;
    }
}
