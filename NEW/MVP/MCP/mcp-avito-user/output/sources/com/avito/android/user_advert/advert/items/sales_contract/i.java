package com.avito.android.user_advert.advert.items.sales_contract;

import android.view.View;
import com.avito.android.lib.design.list_item.ListItem;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SalesContractItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/advert/items/sales_contract/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/user_advert/advert/items/sales_contract/h;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f310115c = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ListItem f310116b;

    public i(@Y61.k View view) {
        super(view);
        this.f310116b = (ListItem) view;
    }

    @Override // com.avito.android.user_advert.advert.items.sales_contract.h
    public final void DF(@Y61.k Y41.a<G0> aVar) {
        this.f310116b.setLinkClickedListener(new com.avito.android.travel_guest_profile.items.profile_header.h(29, aVar));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f310116b.setLinkClickedListener(null);
    }

    @Override // com.avito.android.user_advert.advert.items.sales_contract.h
    public final void mw(@Y61.l String str) {
        this.f310116b.setLink(str);
    }

    @Override // com.avito.android.user_advert.advert.items.sales_contract.h
    public final void setIcon(int i12) {
        ListItem.k(this.f310116b, i12, 0, 2);
    }

    @Override // com.avito.android.user_advert.advert.items.sales_contract.h
    public final void setTitle(@Y61.k String str) {
        this.f310116b.setTitle(str);
    }
}
