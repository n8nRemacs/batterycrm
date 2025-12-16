package com.avito.android.mortgage.landing.analytics;

import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: LandingAnalyticsEvents.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_mortgage_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.mortgage.landing.analytics.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32637b {
    public static final Q<String, Object> a(String str, String str2) {
        Integer numY0;
        Integer numY02;
        Integer numY03;
        Integer numY04;
        Integer numY05;
        switch (str.hashCode()) {
            case -1617835944:
                if (str.equals("landCost") && (numY0 = C43066x.y0(str2)) != null) {
                    return new Q<>("mortgage_land_cost", Integer.valueOf(numY0.intValue()));
                }
                return null;
            case -1412352295:
                if (str.equals("purposeId")) {
                    return new Q<>("mortgage_goal", str2);
                }
                return null;
            case -1008208159:
                if (!str.equals("bankSalaryId")) {
                    return null;
                }
                return new Q<>("mortgage_bank", str2);
            case -926069180:
                if (!str.equals("bankPayrollId")) {
                    return null;
                }
                return new Q<>("mortgage_bank", str2);
            case -865005758:
                if (str.equals("propertyCost") && (numY02 = C43066x.y0(str2)) != null) {
                    return new Q<>("mortgage_cost", Integer.valueOf(numY02.intValue()));
                }
                return null;
            case -690339025:
                if (str.equals("regionId")) {
                    return new Q<>("mortgage_region", str2);
                }
                return null;
            case -669807868:
                if (str.equals("downPayment") && (numY03 = C43066x.y0(str2)) != null) {
                    return new Q<>("mortgage_init_payment", Integer.valueOf(numY03.intValue()));
                }
                return null;
            case -564314363:
                if (str.equals("creditTerm") && (numY04 = C43066x.y0(str2)) != null) {
                    return new Q<>("mortgage_loan_term", Integer.valueOf(numY04.intValue()));
                }
                return null;
            case -428291122:
                if (str.equals("totalExperience")) {
                    return new Q<>("mortgage_overall_exp", str2);
                }
                return null;
            case -105166908:
                if (str.equals("proofOfIncome")) {
                    return new Q<>("mortgage_income_proof", str2);
                }
                return null;
            case 356477350:
                if (str.equals("landingBorrowerAge")) {
                    return new Q<>("mortgage_age", str2);
                }
                return null;
            case 859058115:
                if (!str.equals("currentExperience")) {
                    return null;
                }
                return new Q<>("mortgage_last_exp", str2);
            case 1033198349:
                if (str.equals("houseCost") && (numY05 = C43066x.y0(str2)) != null) {
                    return new Q<>("mortgage_house_cost", Integer.valueOf(numY05.intValue()));
                }
                return null;
            case 1225206047:
                if (str.equals("businessAge")) {
                    return new Q<>("mortgage_business_age", str2);
                }
                return null;
            case 1272526947:
                if (!str.equals("selfEmployedExperience")) {
                    return null;
                }
                return new Q<>("mortgage_last_exp", str2);
            case 1615358283:
                if (str.equals("occupation")) {
                    return new Q<>("mortgage_employment_type", str2);
                }
                return null;
            default:
                return null;
        }
    }
}
