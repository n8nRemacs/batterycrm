package com.avito.android.mortgage.landing.analytics;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.mortgage.api.model.Offer;
import com.avito.android.mortgage.api.model.OfferBadge;
import com.avito.android.mortgage.api.model.OffersResult;
import com.avito.android.mortgage.api.model.RateDiscount;
import com.avito.android.mortgage.landing.list.items.LandingItem;
import com.avito.android.mortgage.landing.list.items.ValueItem;
import com.avito.android.mortgage.landing.mvi.entity.LandingState;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: LandingAnalyticsHandler.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/analytics/f;", "Lcom/avito/android/mortgage/landing/analytics/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.mortgage.landing.analytics.f, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32641f implements InterfaceC32638c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f199522a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f199523b = new LinkedHashMap();

    /* compiled from: LandingAnalyticsHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/mortgage/api/model/OfferBadge;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.mortgage.landing.analytics.f$a */
    public static final class a extends N implements Y41.l<OfferBadge, CharSequence> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f199524l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final CharSequence invoke(OfferBadge offerBadge) {
            return offerBadge.getText();
        }
    }

    @Inject
    public C32641f(@Y61.k InterfaceC28373a interfaceC28373a) {
        this.f199522a = interfaceC28373a;
    }

    public static String b(LandingState landingState, String str) {
        LandingItem landingItem = landingState.f200227c.get(str);
        ValueItem valueItem = landingItem instanceof ValueItem ? (ValueItem) landingItem : null;
        if (valueItem != null) {
            return valueItem.s1();
        }
        return null;
    }

    public static boolean c(kotlin.ranges.l lVar, int i12, int i13) {
        int i14;
        int i15 = lVar.f406905b;
        return (i15 == -1 || (i14 = lVar.f406906c) == -1 || i12 == -1 || i13 == -1 || i13 < i15 || i14 < i12) ? false : true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:448:0x082a  */
    @Override // com.avito.android.mortgage.landing.analytics.InterfaceC32638c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(@Y61.k com.avito.android.mortgage.landing.mvi.entity.LandingInternalAction r37, @Y61.k com.avito.android.mortgage.landing.mvi.entity.LandingState r38) {
        /*
            Method dump skipped, instructions count: 2320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.landing.analytics.C32641f.a(com.avito.android.mortgage.landing.mvi.entity.LandingInternalAction, com.avito.android.mortgage.landing.mvi.entity.LandingState):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.landing.analytics.C32641f.d(java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final void e(MZ.g gVar, OffersResult offersResult, String str) {
        InterfaceC28373a interfaceC28373a = this.f199522a;
        if (offersResult == null || offersResult.c().isEmpty()) {
            NZ.c regionId = gVar.getRegionId();
            Integer value = regionId != null ? regionId.getValue() : null;
            NZ.f purposeId = gVar.getPurposeId();
            String value2 = purposeId != null ? purposeId.getValue() : null;
            NZ.a propertyCost = gVar.getPropertyCost();
            Integer value3 = propertyCost != null ? propertyCost.getValue() : null;
            NZ.a landCost = gVar.getLandCost();
            Integer value4 = landCost != null ? landCost.getValue() : null;
            NZ.a houseCost = gVar.getHouseCost();
            Integer value5 = houseCost != null ? houseCost.getValue() : null;
            NZ.a downPayment = gVar.getDownPayment();
            Integer value6 = downPayment != null ? downPayment.getValue() : null;
            NZ.a creditTerm = gVar.getCreditTerm();
            Integer value7 = creditTerm != null ? creditTerm.getValue() : null;
            NZ.h mortgageProgram = gVar.getMortgageProgram();
            String value8 = mortgageProgram != null ? mortgageProgram.getValue() : null;
            NZ.f proofOfIncome = gVar.getProofOfIncome();
            String value9 = proofOfIncome != null ? proofOfIncome.getValue() : null;
            NZ.f borrowerAge = gVar.getBorrowerAge();
            String value10 = borrowerAge != null ? borrowerAge.getValue() : null;
            NZ.f currentExperience = gVar.getCurrentExperience();
            String value11 = currentExperience != null ? currentExperience.getValue() : null;
            NZ.f totalExperience = gVar.getTotalExperience();
            String value12 = totalExperience != null ? totalExperience.getValue() : null;
            NZ.f occupation = gVar.getOccupation();
            String value13 = occupation != null ? occupation.getValue() : null;
            NZ.f businessAge = gVar.getBusinessAge();
            interfaceC28373a.c(new p(value2, value, value3, value6, value7, value4, value5, value8, value9, value10, value11, value12, value13, businessAge != null ? businessAge.getValue() : null, str));
        } else {
            List<Offer> listM0 = C42745f0.M0(offersResult.c());
            ArrayList arrayList = new ArrayList(C42745f0.q(listM0, 10));
            Iterator it = listM0.iterator();
            while (it.hasNext()) {
                arrayList.add(((Offer) it.next()).getBank().getName());
            }
            ArrayList arrayList2 = new ArrayList(C42745f0.q(listM0, 10));
            Iterator it2 = listM0.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((DecimalFormat) C32643h.f199526a.getValue()).format(((Offer) it2.next()).getRate()));
            }
            ArrayList arrayList3 = new ArrayList(C42745f0.q(listM0, 10));
            Iterator it3 = listM0.iterator();
            while (it3.hasNext()) {
                RateDiscount rateDiscount = ((Offer) it3.next()).getRateDiscount();
                String str2 = rateDiscount != null ? ((DecimalFormat) C32643h.f199526a.getValue()).format(rateDiscount.getBaseRate()) : null;
                if (str2 == null) {
                    str2 = "null";
                }
                arrayList3.add(str2);
            }
            ArrayList arrayList4 = new ArrayList(C42745f0.q(listM0, 10));
            Iterator it4 = listM0.iterator();
            while (it4.hasNext()) {
                arrayList4.add(String.valueOf(((Offer) it4.next()).getPayment()));
            }
            ArrayList arrayList5 = new ArrayList(C42745f0.q(listM0, 10));
            for (Offer offer : listM0) {
                StringBuilder sb2 = new StringBuilder("\"");
                List<OfferBadge> listC = offer.c();
                String strO = listC != null ? C42745f0.O(listC, ";", null, null, a.f199524l, 30) : null;
                if (strO == null) {
                    strO = "";
                }
                sb2.append(strO);
                sb2.append('\"');
                arrayList5.add(sb2.toString());
            }
            String string = arrayList5.toString();
            NZ.c regionId2 = gVar.getRegionId();
            Integer value14 = regionId2 != null ? regionId2.getValue() : null;
            NZ.f purposeId2 = gVar.getPurposeId();
            String value15 = purposeId2 != null ? purposeId2.getValue() : null;
            NZ.a propertyCost2 = gVar.getPropertyCost();
            Integer value16 = propertyCost2 != null ? propertyCost2.getValue() : null;
            NZ.a landCost2 = gVar.getLandCost();
            Integer value17 = landCost2 != null ? landCost2.getValue() : null;
            NZ.a houseCost2 = gVar.getHouseCost();
            Integer value18 = houseCost2 != null ? houseCost2.getValue() : null;
            NZ.a downPayment2 = gVar.getDownPayment();
            Integer value19 = downPayment2 != null ? downPayment2.getValue() : null;
            NZ.a creditTerm2 = gVar.getCreditTerm();
            Integer value20 = creditTerm2 != null ? creditTerm2.getValue() : null;
            NZ.h mortgageProgram2 = gVar.getMortgageProgram();
            String value21 = mortgageProgram2 != null ? mortgageProgram2.getValue() : null;
            NZ.f proofOfIncome2 = gVar.getProofOfIncome();
            String value22 = proofOfIncome2 != null ? proofOfIncome2.getValue() : null;
            NZ.f borrowerAge2 = gVar.getBorrowerAge();
            String value23 = borrowerAge2 != null ? borrowerAge2.getValue() : null;
            NZ.f currentExperience2 = gVar.getCurrentExperience();
            String value24 = currentExperience2 != null ? currentExperience2.getValue() : null;
            NZ.f totalExperience2 = gVar.getTotalExperience();
            String value25 = totalExperience2 != null ? totalExperience2.getValue() : null;
            NZ.f occupation2 = gVar.getOccupation();
            String value26 = occupation2 != null ? occupation2.getValue() : null;
            NZ.f businessAge2 = gVar.getBusinessAge();
            interfaceC28373a.c(new t(arrayList, arrayList2, arrayList3, arrayList4, string, value15, value14, value16, value19, value20, value17, value18, value21, value22, value23, value24, value25, value26, businessAge2 != null ? businessAge2.getValue() : null, str));
        }
        NZ.c regionId3 = gVar.getRegionId();
        Integer value27 = regionId3 != null ? regionId3.getValue() : null;
        NZ.f purposeId3 = gVar.getPurposeId();
        String value28 = purposeId3 != null ? purposeId3.getValue() : null;
        NZ.a propertyCost3 = gVar.getPropertyCost();
        Integer value29 = propertyCost3 != null ? propertyCost3.getValue() : null;
        NZ.a landCost3 = gVar.getLandCost();
        Integer value30 = landCost3 != null ? landCost3.getValue() : null;
        NZ.a houseCost3 = gVar.getHouseCost();
        Integer value31 = houseCost3 != null ? houseCost3.getValue() : null;
        NZ.a downPayment3 = gVar.getDownPayment();
        Integer value32 = downPayment3 != null ? downPayment3.getValue() : null;
        NZ.a creditTerm3 = gVar.getCreditTerm();
        interfaceC28373a.c(new L(value28, value27, value29, value32, creditTerm3 != null ? creditTerm3.getValue() : null, value30, value31, str));
    }
}
