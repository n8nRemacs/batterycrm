package com.avito.android.credits;

import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.credit_broker.LoanTerms;
import kotlin.Metadata;

/* compiled from: CreditCalculatorListener.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/credits/p;", "", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface p {

    /* compiled from: CreditCalculatorListener.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void K7(int i12);

    void b4(@Y61.k DeepLink deepLink);

    void f5(@Y61.l DeepLink deepLink);

    void j9(@Y61.k Uri uri);

    void lc();

    void q8();

    void s2(@Y61.k LoanTerms.Term term);

    void s7();

    void yd(boolean z12);

    void z2(int i12);
}
