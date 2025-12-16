package com.avito.android.credits.installments;

import Y61.k;
import com.avito.android.V;
import com.avito.android.component.advert_contact_bar.ContactBar;
import com.avito.android.remote.model.credit_broker.CreditBrokerProduct;
import com.avito.android.remote.model.credit_broker.LoanTerms;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.List;
import kotlin.Metadata;

/* compiled from: InstallmentsStickyBlockManager.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/credits/installments/d;", "", "_avito_credits_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface d {
    @k
    /* renamed from: a */
    C41981q0 getF128871d();

    void b(@k a aVar);

    @k
    List<ContactBar.InfoStickyBlock> c(@k CreditBrokerProduct creditBrokerProduct);

    void d(@k V v12);

    void e(@k LoanTerms.Term term);

    @k
    /* renamed from: f */
    C41981q0 getF128873f();
}
