package com.avito.android.mortgage.person_form.analytics;

import kotlin.Metadata;

/* compiled from: PersonFormAnalyticsEvents.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_mortgage_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b {
    @Y61.k
    public static final String a(@Y61.k String str) {
        return str.equals("personalData") ? "personal_data" : str.equals("workAndIncome") ? "job_income" : str;
    }
}
