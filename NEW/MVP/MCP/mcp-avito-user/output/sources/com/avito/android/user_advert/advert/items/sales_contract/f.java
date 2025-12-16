package com.avito.android.user_advert.advert.items.sales_contract;

import com.avito.android.R;
import com.avito.android.user_advert.advert.MyAdvertDetailsActivity;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SalesContractItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/sales_contract/f;", "Lcom/avito/android/user_advert/advert/items/sales_contract/d;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final j f310112b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public MyAdvertDetailsActivity f310113c;

    @Inject
    public f(@Y61.k j jVar) {
        this.f310112b = jVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        a aVar2 = (a) aVar;
        String strA = aVar2.f310102d;
        j jVar = this.f310112b;
        if (strA == null) {
            strA = jVar.a();
        }
        hVar.setTitle(strA);
        String strB = aVar2.f310103e;
        if (strB == null) {
            strB = jVar.b();
        }
        hVar.mw(strB);
        hVar.DF(new e(this, aVar2));
        jVar.getClass();
        hVar.setIcon(R.drawable.ic_sales_contract_save);
    }

    @Override // com.avito.android.user_advert.advert.items.sales_contract.d
    public final void c0() {
        this.f310113c = null;
    }

    @Override // com.avito.android.user_advert.advert.items.sales_contract.d
    public final void w5(@Y61.k MyAdvertDetailsActivity myAdvertDetailsActivity) {
        this.f310113c = myAdvertDetailsActivity;
    }
}
