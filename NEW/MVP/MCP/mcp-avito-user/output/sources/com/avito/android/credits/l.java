package com.avito.android.credits;

import com.avito.android.Y;
import com.avito.android.credits.models.CreditCalculator;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.AdvertPrice;
import com.avito.android.remote.model.credit_broker.CreditBrokerProduct;
import com.avito.android.remote.model.credit_broker.HarabaAutoLoansProduct;
import com.avito.android.remote.model.credit_broker.InstallmentsProduct;
import com.avito.android.remote.model.credit_broker.InstallmentsV2Product;
import com.avito.android.remote.model.credit_broker.SberAutoLoansProduct;
import com.avito.android.remote.model.credit_broker.TinkoffAutoLoansProduct;
import com.avito.android.remote.model.credit_broker.TinkoffCashLoansProduct;
import javax.inject.Inject;
import kotlin.Metadata;
import nd.InterfaceC44378a;

/* compiled from: CreditCalculatorDataConverter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/credits/l;", "Lcom/avito/android/credits/k;", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final x f128875a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y f128876b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC44378a f128877c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final v f128878d = new v(null, 1, 0 == true ? 1 : 0);

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public l(@Y61.k x xVar, @Y61.k Y y12, @Y61.k InterfaceC44378a interfaceC44378a) {
        this.f128875a = xVar;
        this.f128876b = y12;
        this.f128877c = interfaceC44378a;
    }

    @Override // com.avito.android.credits.k
    @Y61.l
    public final CreditCalculator a(@Y61.k AdvertDetails advertDetails) {
        CreditBrokerProduct creditInfo = advertDetails.getCreditInfo();
        if (creditInfo == null) {
            return null;
        }
        AdvertPrice price = advertDetails.getPrice();
        String value = price != null ? price.getValue() : null;
        this.f128878d.getClass();
        Float fB2 = v.b(value);
        int iB2 = fB2 != null ? kotlin.math.b.b(fB2.floatValue()) : 0;
        if (creditInfo instanceof TinkoffAutoLoansProduct) {
            return new com.avito.android.credits.models.f((TinkoffAutoLoansProduct) creditInfo, iB2, this.f128875a, this.f128876b, this.f128877c);
        }
        if (creditInfo instanceof TinkoffCashLoansProduct) {
            return new com.avito.android.credits.models.h((TinkoffCashLoansProduct) creditInfo, iB2, this.f128875a, this.f128876b, this.f128877c);
        }
        if (creditInfo instanceof InstallmentsProduct) {
            return new com.avito.android.credits.models.c((InstallmentsProduct) creditInfo);
        }
        if (creditInfo instanceof InstallmentsV2Product) {
            return new com.avito.android.credits.models.d((InstallmentsV2Product) creditInfo);
        }
        if (creditInfo instanceof SberAutoLoansProduct) {
            return new com.avito.android.credits.models.e((SberAutoLoansProduct) creditInfo, iB2);
        }
        if (creditInfo instanceof HarabaAutoLoansProduct) {
            return new com.avito.android.credits.models.b((HarabaAutoLoansProduct) creditInfo, iB2);
        }
        return null;
    }
}
