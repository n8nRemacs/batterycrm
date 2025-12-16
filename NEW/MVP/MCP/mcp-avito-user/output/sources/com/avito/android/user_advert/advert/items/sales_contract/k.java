package com.avito.android.user_advert.advert.items.sales_contract;

import android.content.res.Resources;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SalesContractResourceProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/sales_contract/k;", "Lcom/avito/android/user_advert/advert/items/sales_contract/j;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Resources f310117a;

    @Inject
    public k(@Y61.k Resources resources) {
        this.f310117a = resources;
    }

    @Override // com.avito.android.user_advert.advert.items.sales_contract.j
    @Y61.k
    public final String a() {
        return this.f310117a.getString(R.string.sales_contract_title);
    }

    @Override // com.avito.android.user_advert.advert.items.sales_contract.j
    @Y61.k
    public final String b() {
        return this.f310117a.getString(R.string.sales_contract_link_text);
    }
}
