package com.avito.android.credits;

import android.content.res.Resources;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: CreditInfoResourcesProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/credits/y;", "Lcom/avito/android/credits/x;", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class y implements x {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Resources f129078a;

    @Inject
    public y(@Y61.k Resources resources) {
        this.f129078a = resources;
    }

    @Override // com.avito.android.credits.x
    @Y61.k
    public final String a(int i12) {
        Character chP;
        Character chP2;
        Character chP3;
        Resources resources = this.f129078a;
        if (i12 == 11 || i12 == 12 || i12 == 13 || i12 == 14) {
            return resources.getString(R.string.credits_years_more, String.valueOf(i12));
        }
        Character chP4 = C43066x.P(String.valueOf(i12));
        if (chP4 != null && chP4.charValue() == '1') {
            return resources.getString(R.string.credits_year, String.valueOf(i12));
        }
        Character chP5 = C43066x.P(String.valueOf(i12));
        return ((chP5 != null && chP5.charValue() == '2') || ((chP = C43066x.P(String.valueOf(i12))) != null && chP.charValue() == '2') || (((chP2 = C43066x.P(String.valueOf(i12))) != null && chP2.charValue() == '3') || ((chP3 = C43066x.P(String.valueOf(i12))) != null && chP3.charValue() == '4'))) ? resources.getString(R.string.credits_years, String.valueOf(i12)) : resources.getString(R.string.credits_years_more, String.valueOf(i12));
    }

    @Override // com.avito.android.credits.x
    @Y61.k
    public final String b(@Y61.k String str) {
        return this.f129078a.getString(R.string.credits_value_top_limit, str);
    }

    @Override // com.avito.android.credits.x
    @Y61.k
    public final String c(@Y61.k String str) {
        return this.f129078a.getString(R.string.advert_details_credit_monthly_payment_format, str);
    }

    @Override // com.avito.android.credits.x
    @Y61.k
    public final String d(@Y61.k String str) {
        return this.f129078a.getString(R.string.advert_details_credit_currency_format, str);
    }

    @Override // com.avito.android.credits.x
    @Y61.k
    public final String e(@Y61.k String str) {
        return this.f129078a.getString(R.string.credits_value_bottom_limit, str);
    }
}
