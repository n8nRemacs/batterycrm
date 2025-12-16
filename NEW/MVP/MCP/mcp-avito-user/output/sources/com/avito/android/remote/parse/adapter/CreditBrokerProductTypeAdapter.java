package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.credit_broker.AdvertCreditCompositeBroker;
import com.avito.android.remote.model.credit_broker.AdvertCreditCompositeBrokerV2;
import com.avito.android.remote.model.credit_broker.AutoLoansWithoutCalculator;
import com.avito.android.remote.model.credit_broker.CreditBannerProduct;
import com.avito.android.remote.model.credit_broker.CreditBrokerProduct;
import com.avito.android.remote.model.credit_broker.HarabaAutoLoansProduct;
import com.avito.android.remote.model.credit_broker.InstallmentsProduct;
import com.avito.android.remote.model.credit_broker.InstallmentsV2Product;
import com.avito.android.remote.model.credit_broker.InstallmentsV3Product;
import com.avito.android.remote.model.credit_broker.SberAutoLoansProduct;
import com.avito.android.remote.model.credit_broker.TinkoffAutoLoansProduct;
import com.avito.android.remote.model.credit_broker.TinkoffCashLoansProduct;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: CreditBrokerProductTypeAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/CreditBrokerProductTypeAdapter;", "Lcom/avito/android/remote/parse/adapter/RuntimeTypeAdapter;", "Lcom/avito/android/remote/model/credit_broker/CreditBrokerProduct;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CreditBrokerProductTypeAdapter extends RuntimeTypeAdapter<CreditBrokerProduct> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f254170a;

    public CreditBrokerProductTypeAdapter() {
        super(null, "payload", CreditBannerProduct.class, 1, null);
        this.f254170a = P0.j(new kotlin.Q("autobrokerTinkoff", TinkoffAutoLoansProduct.class), new kotlin.Q("cashLoansTinkoff", TinkoffCashLoansProduct.class), new kotlin.Q(AdvertDetailsBlockIdKt.BLOCK_ID_CREDIT_CALCULATOR, InstallmentsProduct.class), new kotlin.Q("installments_v2", InstallmentsV2Product.class), new kotlin.Q("installments_v3", InstallmentsV3Product.class), new kotlin.Q("autobrokerSber", SberAutoLoansProduct.class), new kotlin.Q("autobrokerHaraba", HarabaAutoLoansProduct.class), new kotlin.Q("autoLoans", AutoLoansWithoutCalculator.class), new kotlin.Q("compositeBroker", AdvertCreditCompositeBroker.class), new kotlin.Q("compositeBrokerV2", AdvertCreditCompositeBrokerV2.class));
    }

    @Override // com.avito.android.remote.parse.adapter.RuntimeTypeAdapter, com.google.gson.h
    public final Object deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        return iVar.i().D("type").s().equals("advBanner") ? new CreditBannerProduct() : (CreditBrokerProduct) super.deserialize(iVar, type, gVar);
    }

    @Override // com.avito.android.remote.parse.adapter.RuntimeTypeAdapter
    @Y61.k
    public final Map<String, Class<? extends CreditBrokerProduct>> getMapping() {
        return this.f254170a;
    }
}
