package com.avito.android.mortgage.landing.mvi.builder;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.input.FormatterType;
import com.avito.android.lib.design.input.MaskParameters;
import com.avito.android.mortgage.api.model.Offer;
import com.avito.android.mortgage.api.model.OfferBadge;
import com.avito.android.mortgage.api.model.OffersResult;
import com.avito.android.mortgage.api.model.RateDiscount;
import com.avito.android.mortgage.api.model.landing.items.LabelValueParameter;
import com.avito.android.mortgage.landing.list.items.LandingItem;
import com.avito.android.mortgage.landing.list.items.chips.ChipsItem;
import com.avito.android.mortgage.landing.list.items.expandable_block.ExpandableBlockItem;
import com.avito.android.mortgage.landing.list.items.faq_title.FaqTitleItem;
import com.avito.android.mortgage.landing.list.items.input.InputItem;
import com.avito.android.mortgage.landing.list.items.offers.OffersItem;
import com.avito.android.mortgage.landing.list.items.offers.offer.OfferItem;
import com.avito.android.mortgage.landing.list.items.programs.ProgramsItem;
import com.avito.android.mortgage.landing.list.items.programs.program.ProgramItem;
import com.avito.android.mortgage.landing.list.items.select.SelectItem;
import com.avito.android.mortgage.landing.list.items.subtitle.SubtitleItem;
import com.avito.android.mortgage.landing.list.items.title.TitleItem;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.FontAttribute;
import com.avito.android.remote.model.text.FontParameter;
import com.huawei.hms.framework.common.ExceptionCode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.u0;
import kotlin.text.C43066x;

/* compiled from: LandingDataBuilder.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/landing/mvi/builder/c;", "Lcom/avito/android/mortgage/landing/mvi/builder/b;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c implements b {
    @Inject
    public c() {
    }

    public static Map A(int i12, Map map) {
        Integer num;
        Integer num2;
        Integer num3;
        Object obj = map.get("downPayment");
        InputItem inputItem = obj instanceof InputItem ? (InputItem) obj : null;
        if (inputItem == null) {
            return map;
        }
        Object obj2 = map.get("propertyCost");
        InputItem inputItem2 = obj2 instanceof InputItem ? (InputItem) obj2 : null;
        int iIntValue = 0;
        int iIntValue2 = (inputItem2 == null || (num3 = inputItem2.f199731d) == null) ? 0 : num3.intValue();
        Object obj3 = map.get("landCost");
        InputItem inputItem3 = obj3 instanceof InputItem ? (InputItem) obj3 : null;
        int iIntValue3 = (inputItem3 == null || (num2 = inputItem3.f199731d) == null) ? 0 : num2.intValue();
        Object obj4 = map.get("houseCost");
        InputItem inputItem4 = obj4 instanceof InputItem ? (InputItem) obj4 : null;
        if (inputItem4 != null && (num = inputItem4.f199731d) != null) {
            iIntValue = num.intValue();
        }
        double d12 = i12;
        InputItem inputItemA = InputItem.a(inputItem, Integer.valueOf((int) Math.ceil((d12 / 100.0d) * (iIntValue2 + iIntValue3 + iIntValue))), null, d12, 3835);
        Object obj5 = map.get("downPayment");
        if (((LandingItem) (obj5 instanceof LandingItem ? obj5 : null)) == null) {
            return map;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put("downPayment", inputItemA);
        return linkedHashMap;
    }

    public static InputItem B(InputItem inputItem, Integer num) {
        return L.f(inputItem.f199729b, "creditTerm") ? InputItem.a(inputItem, num, n(num), 0.0d, 4083) : InputItem.a(inputItem, num, null, 0.0d, 4091);
    }

    public static LandingItem l(LandingItem landingItem) {
        if (L.f(landingItem.getF200017b(), "downPayment") || !(landingItem instanceof InputItem)) {
            return landingItem;
        }
        InputItem inputItem = (InputItem) landingItem;
        LabelValueParameter labelValueParameter = inputItem.f199733f;
        double value = labelValueParameter.getValue();
        LabelValueParameter labelValueParameter2 = inputItem.f199734g;
        int iU2 = u(inputItem.f199731d, value, labelValueParameter2.getValue());
        String f200017b = landingItem.getF200017b();
        int iHashCode = f200017b.hashCode();
        return InputItem.a(B(inputItem, Integer.valueOf(iU2)), null, null, (iHashCode == -1617835944 ? !f200017b.equals("landCost") : iHashCode == -865005758 ? !f200017b.equals("propertyCost") : !(iHashCode == 1033198349 && f200017b.equals("houseCost"))) ? iU2 : o(iU2, q(labelValueParameter.getValue(), labelValueParameter2.getValue())), 3839);
    }

    public static OffersItem m(OffersResult offersResult) {
        Boolean showMkbBanner;
        boolean zBooleanValue = false;
        List<Offer> listC = offersResult != null ? offersResult.c() : null;
        if (listC == null) {
            listC = C42784z0.f406748b;
        }
        List<Offer> list = listC;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (Offer offer : list) {
            String id2 = offer.getBank().getId();
            String icon = offer.getBank().getIcon();
            String name = offer.getBank().getName();
            int payment = offer.getPayment();
            u0 u0Var = u0.f406856a;
            String strReplace = String.format(Locale.getDefault(), "%,d", Arrays.copyOf(new Object[]{Integer.valueOf(payment)}, 1)).replace(',', ' ');
            String strA = com.avito.android.mortgage.landing.utils.a.a(offer.getRate());
            RateDiscount rateDiscount = offer.getRateDiscount();
            String strA2 = rateDiscount != null ? com.avito.android.mortgage.landing.utils.a.a(rateDiscount.getBaseRate()) : null;
            AttributedText attributedText = strA2 == null ? new AttributedText(r.r(strReplace, " ₽/мес. · ", strA), C42784z0.f406748b, 1) : new AttributedText(strReplace.concat(" ₽/мес. · {{rate}} {{rateWithoutDiscount}}"), C42745f0.U(new FontAttribute("rate", strA, Collections.singletonList(new FontParameter.ColorParameter(null, null, "green800"))), new FontAttribute("rateWithoutDiscount", strA2, C42745f0.U(FontParameter.StrikethroughParameter.INSTANCE, new FontParameter.TextStyleParameter(null, "s10")))), 1);
            List<OfferBadge> listC2 = offer.c();
            if (listC2 == null) {
                listC2 = C42784z0.f406748b;
            }
            arrayList.add(new OfferItem(id2, attributedText, false, icon, name, listC2));
        }
        if (offersResult != null && (showMkbBanner = offersResult.getShowMkbBanner()) != null) {
            zBooleanValue = showMkbBanner.booleanValue();
        }
        return new OffersItem("banksPreferred", R.string.landing_banks_offers, R.string.landing_chance_mortgage, arrayList, false, zBooleanValue, false, false, 192, null);
    }

    public static FormatterType n(Integer num) {
        String str;
        Character chP;
        String string = num != null ? num.toString() : null;
        if (string == null || (chP = C43066x.P(string)) == null) {
            str = "";
        } else {
            char cCharValue = chP.charValue();
            String str2 = "лет";
            if (!C42756l.l0(new String[]{"11", "12", "13", "14"}).contains(string)) {
                if (cCharValue == '1') {
                    str2 = "год";
                } else if ('2' <= cCharValue && cCharValue < '5') {
                    str2 = "года";
                }
            }
            str = str2;
        }
        return new FormatterType(2000, 2, new MaskParameters(null, false, str, null, false, "##", false, null, (char) 0, 0, null, 2011, null));
    }

    public static double o(int i12, List list) {
        Object next;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            j jVar = (j) next;
            int i13 = jVar.f200100c;
            if (i12 <= jVar.f200101d && i13 <= i12) {
                break;
            }
        }
        j jVar2 = (j) next;
        if (jVar2 == null) {
            return 0.0d;
        }
        int i14 = jVar2.f200101d;
        int i15 = jVar2.f200100c;
        double d12 = (i12 - i15) / (i14 - i15);
        double d13 = jVar2.f200099b;
        double d14 = jVar2.f200098a;
        return ((d13 - d14) * d12) + d14;
    }

    public static ChipsItem p(int i12, String str, NZ.f fVar) {
        Object next;
        List<NZ.e> listA = fVar.a();
        ArrayList arrayList = new ArrayList(C42745f0.q(listA, 10));
        for (NZ.e eVar : listA) {
            arrayList.add(new ChipsItem.Chip(eVar.getLabel(), eVar.getValue()));
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (L.f(((ChipsItem.Chip) next).f199674c, fVar.getValue())) {
                break;
            }
        }
        return new ChipsItem(str, i12, arrayList, (ChipsItem.Chip) next, false, 16, null);
    }

    public static List q(int i12, int i13) {
        return C42745f0.U(new j(0.0d, 0.25d, i12, ExceptionCode.CRASH_EXCEPTION), new j(0.25d, 0.5d, ExceptionCode.CRASH_EXCEPTION, 15000000), new j(0.5d, 0.75d, 15000000, 30000000), new j(0.75d, 0.875d, 30000000, 50000000), new j(0.875d, 1.0d, 50000000, i13));
    }

    public static SelectItem r(int i12, String str, NZ.f fVar) {
        Object next;
        List<NZ.e> listA = fVar.a();
        ArrayList arrayList = new ArrayList(C42745f0.q(listA, 10));
        for (NZ.e eVar : listA) {
            arrayList.add(new SelectItem.Option(eVar.getValue(), eVar.getLabel()));
        }
        Integer numValueOf = Integer.valueOf(R.string.select_string);
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (L.f(((SelectItem.Option) next).f199958b, fVar.getValue())) {
                break;
            }
        }
        return new SelectItem(str, i12, numValueOf, arrayList, (SelectItem.Option) next, false, 32, null);
    }

    public static InputItem s(int i12, String str, NZ.a aVar) {
        ArrayList arrayList;
        int iU2 = u(aVar.getValue(), aVar.getMinValue().getValue(), aVar.getMaxValue().getValue());
        List listQ = q(aVar.getMinValue().getValue(), aVar.getMaxValue().getValue());
        FormatterType.f179288e.getClass();
        FormatterType formatterType = FormatterType.f179291h;
        LabelValueParameter minValue = aVar.getMinValue();
        LabelValueParameter maxValue = aVar.getMaxValue();
        double dO2 = o(iU2, listQ);
        List<LabelValueParameter> listC = aVar.c();
        if (listC != null) {
            List<LabelValueParameter> list = listC;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list, 10));
            for (LabelValueParameter labelValueParameter : list) {
                arrayList2.add(new InputItem.Chip(labelValueParameter.getValue(), labelValueParameter.getLabel()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return new InputItem(str, i12, Integer.valueOf(iU2), formatterType, minValue, maxValue, 0.0d, 1.0d, dO2, arrayList, false, false, 3072, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0101 A[LOOP:2: B:29:0x00fb->B:31:0x0101, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void t(java.util.LinkedHashMap r25, MZ.g r26) {
        /*
            Method dump skipped, instructions count: 969
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.landing.mvi.builder.c.t(java.util.LinkedHashMap, MZ.g):void");
    }

    public static int u(Integer num, double d12, double d13) {
        return (num == null || ((double) num.intValue()) < d12) ? (int) Math.ceil(d12) : ((double) num.intValue()) > d13 ? (int) d13 : num.intValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Q v(String str, NZ.a aVar) {
        String str2;
        InputItem inputItem;
        String str3 = str;
        InputItem inputItemS = null;
        inputItemS = null;
        ArrayList arrayList = null;
        inputItemS = null;
        ArrayList arrayList2 = null;
        inputItemS = null;
        inputItemS = null;
        inputItemS = null;
        if (aVar == null) {
            return new Q(str3, null);
        }
        switch (str.hashCode()) {
            case -1617835944:
                str2 = str3;
                if (str2.equals("landCost")) {
                    inputItemS = s(R.string.landing_land_cost, str2, aVar);
                    break;
                }
                break;
            case -865005758:
                str2 = str;
                if (str2.equals("propertyCost")) {
                    inputItemS = s(R.string.landing_property_cost, str2, aVar);
                    break;
                }
                break;
            case -669807868:
                str3 = str;
                if (str3.equals("downPayment")) {
                    Integer value = aVar.getValue();
                    FormatterType.f179288e.getClass();
                    FormatterType formatterType = FormatterType.f179291h;
                    LabelValueParameter minValue = aVar.getMinValue();
                    LabelValueParameter maxValue = aVar.getMaxValue();
                    double value2 = aVar.getMinValue().getValue();
                    double value3 = aVar.getMinValue().getValue();
                    double value4 = aVar.getMaxValue().getValue();
                    List<LabelValueParameter> listC = aVar.c();
                    if (listC != null) {
                        List<LabelValueParameter> list = listC;
                        arrayList2 = new ArrayList(C42745f0.q(list, 10));
                        for (LabelValueParameter labelValueParameter : list) {
                            arrayList2.add(new InputItem.Chip(labelValueParameter.getValue(), labelValueParameter.getLabel()));
                        }
                    }
                    inputItem = new InputItem(str, R.string.landing_down_payment, value, formatterType, minValue, maxValue, value3, value4, value2, arrayList2, true, false, 2048, null);
                    str2 = str;
                    inputItemS = inputItem;
                    break;
                }
                str2 = str3;
                break;
            case -564314363:
                if (str3.equals("creditTerm")) {
                    int iU2 = u(aVar.getValue(), aVar.getMinValue().getValue(), aVar.getMaxValue().getValue());
                    FormatterType formatterTypeN = n(Integer.valueOf(iU2));
                    LabelValueParameter minValue2 = aVar.getMinValue();
                    LabelValueParameter maxValue2 = aVar.getMaxValue();
                    double d12 = iU2;
                    double value5 = aVar.getMinValue().getValue();
                    double value6 = aVar.getMaxValue().getValue();
                    List<LabelValueParameter> listC2 = aVar.c();
                    if (listC2 != null) {
                        List<LabelValueParameter> list2 = listC2;
                        arrayList = new ArrayList(C42745f0.q(list2, 10));
                        for (LabelValueParameter labelValueParameter2 : list2) {
                            arrayList.add(new InputItem.Chip(labelValueParameter2.getValue(), labelValueParameter2.getLabel()));
                        }
                    }
                    inputItem = new InputItem(str, R.string.landing_credit_term, Integer.valueOf(iU2), formatterTypeN, minValue2, maxValue2, value5, value6, d12, arrayList, false, false, 3072, null);
                    str2 = str;
                    inputItemS = inputItem;
                    break;
                }
                str2 = str3;
                break;
            case 1033198349:
                if (str3.equals("houseCost")) {
                    inputItemS = s(R.string.landing_house_cost, str3, aVar);
                }
                str2 = str3;
                break;
            default:
                str2 = str3;
                break;
        }
        return new Q(str2, inputItemS);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    public static Q w(String str, NZ.f fVar) {
        Object objP = null;
        if (fVar == null) {
            return new Q(str, null);
        }
        switch (str.hashCode()) {
            case -1412352295:
                if (str.equals("purposeId")) {
                    objP = p(R.string.landing_purpose, str, fVar);
                    break;
                }
                break;
            case -1008208159:
                if (str.equals("bankSalaryId")) {
                    objP = r(R.string.landing_salary_bank, str, fVar);
                    break;
                }
                break;
            case -926069180:
                if (str.equals("bankPayrollId")) {
                    objP = r(R.string.landing_payment_bank, str, fVar);
                    break;
                }
                break;
            case -690339025:
                if (str.equals("regionId")) {
                    objP = r(R.string.landing_region, str, fVar);
                    break;
                }
                break;
            case -428291122:
                if (str.equals("totalExperience")) {
                    objP = p(R.string.landing_total_experience, str, fVar);
                    break;
                }
                break;
            case -105166908:
                if (str.equals("proofOfIncome")) {
                    objP = p(R.string.landing_proof_of_income, str, fVar);
                    break;
                }
                break;
            case 356477350:
                if (str.equals("landingBorrowerAge")) {
                    objP = p(R.string.landing_borrower_age, str, fVar);
                    break;
                }
                break;
            case 859058115:
                if (str.equals("currentExperience")) {
                    objP = p(R.string.landing_current_experience, str, fVar);
                    break;
                }
                break;
            case 1225206047:
                if (str.equals("businessAge")) {
                    objP = p(R.string.landing_business_age, str, fVar);
                    break;
                }
                break;
            case 1272526947:
                if (str.equals("selfEmployedExperience")) {
                    objP = p(R.string.landing_self_employed_experience, str, fVar);
                    break;
                }
                break;
            case 1615358283:
                if (str.equals("occupation")) {
                    objP = p(R.string.landing_occupation, str, fVar);
                    break;
                }
                break;
        }
        return new Q(str, objP);
    }

    public static void x(LinkedHashMap linkedHashMap) {
        Integer num;
        Integer num2;
        Integer num3;
        Object obj = linkedHashMap.get("downPayment");
        InputItem inputItem = obj instanceof InputItem ? (InputItem) obj : null;
        if (inputItem == null) {
            return;
        }
        Object obj2 = linkedHashMap.get("propertyCost");
        InputItem inputItem2 = obj2 instanceof InputItem ? (InputItem) obj2 : null;
        int iIntValue = 0;
        int iIntValue2 = (inputItem2 == null || (num3 = inputItem2.f199731d) == null) ? 0 : num3.intValue();
        Object obj3 = linkedHashMap.get("landCost");
        InputItem inputItem3 = obj3 instanceof InputItem ? (InputItem) obj3 : null;
        int iIntValue3 = (inputItem3 == null || (num2 = inputItem3.f199731d) == null) ? 0 : num2.intValue();
        Object obj4 = linkedHashMap.get("houseCost");
        InputItem inputItem4 = obj4 instanceof InputItem ? (InputItem) obj4 : null;
        if (inputItem4 != null && (num = inputItem4.f199731d) != null) {
            iIntValue = num.intValue();
        }
        double d12 = iIntValue2 + iIntValue3 + iIntValue;
        LabelValueParameter labelValueParameter = inputItem.f199733f;
        double value = (labelValueParameter.getValue() / 100.0d) * d12;
        LabelValueParameter labelValueParameter2 = inputItem.f199734g;
        double value2 = (labelValueParameter2.getValue() / 100.0d) * d12;
        int iU2 = u(inputItem.f199731d, value, value2);
        linkedHashMap.put("downPayment", InputItem.a(inputItem, Integer.valueOf(iU2), null, o(iU2, Collections.singletonList(new j(labelValueParameter.getValue(), labelValueParameter2.getValue(), (int) Math.ceil(value), (int) value2))), 3835));
    }

    public static void y(LinkedHashMap linkedHashMap, Q q12) {
        LandingItem landingItem = (LandingItem) q12.f406620c;
        Object obj = q12.f406619b;
        if (landingItem != null) {
            linkedHashMap.put(obj, landingItem);
        } else {
            linkedHashMap.remove(obj);
        }
    }

    public static Map z(int i12, Map map) {
        Object obj = map.get("creditTerm");
        InputItem inputItem = obj instanceof InputItem ? (InputItem) obj : null;
        if (inputItem == null) {
            return map;
        }
        InputItem inputItemA = InputItem.a(inputItem, Integer.valueOf(i12), null, i12, 3835);
        Object obj2 = map.get("creditTerm");
        if (((LandingItem) (obj2 instanceof LandingItem ? obj2 : null)) == null) {
            return map;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put("creditTerm", inputItemA);
        return linkedHashMap;
    }

    @Override // com.avito.android.mortgage.landing.mvi.builder.b
    @k
    public final Map a(@k String str, @k String str2, @k Map map) {
        if (map.get(str) instanceof InputItem) {
            Object obj = map.get(str);
            InputItem inputItem = (InputItem) (obj instanceof InputItem ? obj : null);
            if (inputItem == null) {
                return map;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            linkedHashMap.put(str, B(inputItem, C43066x.y0(C43066x.A0(str2).toString())));
            return linkedHashMap;
        }
        Object obj2 = map.get(str);
        if (!(obj2 instanceof LandingItem)) {
            obj2 = null;
        }
        com.avito.conveyor_item.a aVarA = (LandingItem) obj2;
        if (aVarA == null) {
            return map;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(map);
        if (aVarA instanceof SelectItem) {
            SelectItem selectItem = (SelectItem) aVarA;
            Iterator<T> it = selectItem.f199955e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (L.f(((SelectItem.Option) next).f199958b, str2)) {
                    obj = next;
                    break;
                }
            }
            aVarA = SelectItem.a(selectItem, (SelectItem.Option) obj, 47);
        } else if (aVarA instanceof ChipsItem) {
            ChipsItem chipsItem = (ChipsItem) aVarA;
            Iterator<T> it2 = chipsItem.f199670d.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (L.f(((ChipsItem.Chip) next2).f199674c, str2)) {
                    obj = next2;
                    break;
                }
            }
            aVarA = ChipsItem.a(chipsItem, (ChipsItem.Chip) obj, 23);
        }
        linkedHashMap2.put(str, aVarA);
        return linkedHashMap2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.mortgage.landing.mvi.builder.b
    @k
    public final Map<String, LandingItem> b(@k Map<String, ? extends LandingItem> map, @k String str, float f12) {
        int iCeil;
        if (str.equals("downPayment")) {
            return A(kotlin.math.b.b(f12), map);
        }
        if (str.equals("creditTerm")) {
            return z(kotlin.math.b.b(f12), map);
        }
        Object obj = map.get(str);
        Object obj2 = null;
        if (!(obj instanceof InputItem)) {
            obj = null;
        }
        InputItem inputItem = (InputItem) obj;
        if (inputItem == null) {
            return map;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        double d12 = f12;
        Iterator it = q(inputItem.f199733f.getValue(), inputItem.f199734g.getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            j jVar = (j) next;
            if (d12 >= jVar.f200098a && d12 <= jVar.f200099b) {
                obj2 = next;
                break;
            }
        }
        j jVar2 = (j) obj2;
        if (jVar2 == null) {
            iCeil = 0;
        } else {
            double d13 = jVar2.f200099b;
            double d14 = jVar2.f200098a;
            int i12 = jVar2.f200101d;
            iCeil = ((int) Math.ceil(((d12 - d14) / (d13 - d14)) * (i12 - r12))) + jVar2.f200100c;
        }
        linkedHashMap.put(str, l(B(inputItem, Integer.valueOf(iCeil))));
        return linkedHashMap;
    }

    @Override // com.avito.android.mortgage.landing.mvi.builder.b
    @k
    public final Map c(int i12, @k String str, @k Map map) {
        if (str.equals("downPayment")) {
            return A(i12, map);
        }
        if (str.equals("creditTerm")) {
            return z(i12, map);
        }
        Object obj = map.get(str);
        if (!(obj instanceof InputItem)) {
            obj = null;
        }
        InputItem inputItem = (InputItem) obj;
        if (inputItem == null) {
            return map;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(str, l(B(inputItem, Integer.valueOf(i12))));
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.mortgage.landing.mvi.builder.b
    @k
    public final Map<String, LandingItem> d(@k Map<String, ? extends LandingItem> map, boolean z12) {
        Object obj = map.get("banksPreferred");
        if (!(obj instanceof OffersItem)) {
            obj = null;
        }
        OffersItem offersItem = (OffersItem) obj;
        if (offersItem == null) {
            return map;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put("banksPreferred", OffersItem.a(offersItem, null, z12, 191));
        return linkedHashMap;
    }

    @Override // com.avito.android.mortgage.landing.mvi.builder.b
    @k
    public final Map e(@k String str, @k Map map) {
        Object obj = map.get("mortgageProgram");
        if (!(obj instanceof ProgramsItem)) {
            obj = null;
        }
        ProgramsItem programsItem = (ProgramsItem) obj;
        if (programsItem == null) {
            return map;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        ArrayList<ProgramItem> arrayList = programsItem.f199881e;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        for (ProgramItem programItem : arrayList) {
            arrayList2.add(ProgramItem.a(programItem, L.f(programItem.f199931l, str), 6143));
        }
        linkedHashMap.put("mortgageProgram", ProgramsItem.a(programsItem, arrayList2));
        return linkedHashMap;
    }

    @Override // com.avito.android.mortgage.landing.mvi.builder.b
    @k
    public final Map f(@k Map map) {
        Object obj = map.get("banksPreferred");
        if (!(obj instanceof OffersItem)) {
            obj = null;
        }
        OffersItem offersItem = (OffersItem) obj;
        if (offersItem == null) {
            return map;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put("banksPreferred", OffersItem.a(offersItem, null, false, 239));
        return linkedHashMap;
    }

    @Override // com.avito.android.mortgage.landing.mvi.builder.b
    @k
    public final LinkedHashMap g(@k Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(P0.f(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), l((LandingItem) entry.getValue()));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        x(linkedHashMap2);
        return linkedHashMap2;
    }

    @Override // com.avito.android.mortgage.landing.mvi.builder.b
    @k
    public final LinkedHashMap h(@k Map map, @l OffersResult offersResult) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        OffersItem offersItemM = m(offersResult);
        Object obj = linkedHashMap.get("banksPreferred");
        ArrayList arrayList = null;
        OffersItem offersItem = obj instanceof OffersItem ? (OffersItem) obj : null;
        List<OfferItem> list = offersItem != null ? offersItem.f199796e : null;
        if (list == null) {
            list = C42784z0.f406748b;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (((OfferItem) obj2).f199847c) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((OfferItem) it.next()).f199846b);
        }
        Set setP0 = C42745f0.P0(arrayList3);
        List<OfferItem> list2 = offersItemM.f199796e;
        if (list2 != null) {
            List<OfferItem> list3 = list2;
            arrayList = new ArrayList(C42745f0.q(list3, 10));
            for (OfferItem offerItemA : list3) {
                if (setP0.contains(offerItemA.f199846b)) {
                    offerItemA = OfferItem.a(offerItemA, true);
                }
                arrayList.add(offerItemA);
            }
        }
        OffersItem offersItemA = OffersItem.a(offersItemM, arrayList, false, 247);
        linkedHashMap.put(offersItemA.f199793b, offersItemA);
        return linkedHashMap;
    }

    @Override // com.avito.android.mortgage.landing.mvi.builder.b
    @k
    public final LinkedHashMap i(@k Map map, @k MZ.g gVar) {
        if (!map.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            t(linkedHashMap, gVar);
            return linkedHashMap;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        TitleItem titleItem = new TitleItem("titleId", R.string.landing_second_title, R.attr.textH25, false, 8, null);
        y(linkedHashMap2, new Q(titleItem.f200017b, titleItem));
        SubtitleItem subtitleItem = new SubtitleItem("subtitleId", R.string.landing_second_subtitle, false, 4, null);
        y(linkedHashMap2, new Q(subtitleItem.f200008b, subtitleItem));
        TitleItem titleItem2 = new TitleItem("employmentTitle", R.string.landing_employment_title, R.attr.textH30, false, 8, null);
        y(linkedHashMap2, new Q(titleItem2.f200017b, titleItem2));
        OffersItem offersItemM = m(null);
        y(linkedHashMap2, new Q(offersItemM.f199793b, offersItemM));
        t(linkedHashMap2, gVar);
        return linkedHashMap2;
    }

    @Override // com.avito.android.mortgage.landing.mvi.builder.b
    @k
    public final Map j(@k String str, @k Map map, boolean z12) {
        Object obj = map.get("banksPreferred");
        ArrayList arrayList = null;
        if (!(obj instanceof OffersItem)) {
            obj = null;
        }
        OffersItem offersItem = (OffersItem) obj;
        if (offersItem == null) {
            return map;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        List<OfferItem> list = offersItem.f199796e;
        if (list != null) {
            List<OfferItem> list2 = list;
            arrayList = new ArrayList(C42745f0.q(list2, 10));
            for (OfferItem offerItemA : list2) {
                if (L.f(offerItemA.f199846b, str)) {
                    offerItemA = OfferItem.a(offerItemA, z12);
                }
                arrayList.add(offerItemA);
            }
        }
        linkedHashMap.put("banksPreferred", OffersItem.a(offersItem, arrayList, false, 247));
        return linkedHashMap;
    }

    @Override // com.avito.android.mortgage.landing.mvi.builder.b
    @k
    public final Map k(@k String str, @k Map map) {
        Object obj = map.get("faqTitle");
        if (!(obj instanceof FaqTitleItem)) {
            obj = null;
        }
        FaqTitleItem faqTitleItem = (FaqTitleItem) obj;
        if (faqTitleItem == null) {
            return map;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        List<ExpandableBlockItem> list = faqTitleItem.f199721d;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (ExpandableBlockItem expandableBlockItemA : list) {
            if (L.f(expandableBlockItemA.f199693b, str)) {
                expandableBlockItemA = ExpandableBlockItem.a(expandableBlockItemA, !expandableBlockItemA.f199696e, 55);
            }
            arrayList.add(expandableBlockItemA);
        }
        linkedHashMap.put("faqTitle", FaqTitleItem.a(faqTitleItem, arrayList, 11));
        return linkedHashMap;
    }
}
