package com.avito.android.travel_payment_methods.items.loan_terms;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.travel_payment_methods.model.LoanTerm;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: LoanTermsView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/travel_payment_methods/items/loan_terms/u;", "LTV0/e;", "_avito_travel-payment-methods_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface u extends TV0.e {

    /* compiled from: LoanTermsView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void E60(@Y61.k LoanTermsItem loanTermsItem, @Y61.k Y41.p<? super String, ? super String, G0> pVar);

    void Na(@Y61.k Y41.l<? super String, G0> lVar);

    void dL(@Y61.l LoanTerm.Progress progress);

    void g1(@Y61.k Y41.l<? super DeepLink, G0> lVar);

    void mp(@Y61.l AttributedText attributedText, @Y61.l AttributedText attributedText2);
}
