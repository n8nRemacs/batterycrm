package com.avito.android.user_advert.advert.items.multiaddresses.addresses_list.item;

import Y61.k;
import Y61.l;
import com.avito.android.user_address.CompositeLocationTextView;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: MultiAddressListItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/advert/items/multiaddresses/addresses_list/item/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/user_advert/advert/items/multiaddresses/addresses_list/item/f;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.user_advert.advert.items.multiaddresses.k f309713b;

    public g(@k com.avito.android.user_advert.advert.items.multiaddresses.k kVar) {
        super(kVar);
        this.f309713b = kVar;
        kVar.setPaddingRelative(0, y6.b(12), 0, y6.b(12));
    }

    @Override // com.avito.android.user_advert.advert.items.multiaddresses.addresses_list.item.f
    public final void fm(@k String str, @l String str2, @l String str3) {
        com.avito.android.user_advert.advert.items.multiaddresses.k kVar = this.f309713b;
        kVar.getClass();
        String strConcat = str.concat(", ");
        CompositeLocationTextView compositeLocationTextView = kVar.f309743c;
        compositeLocationTextView.setFirstText(strConcat);
        if (str2 != null) {
            compositeLocationTextView.setSecondText(str2);
        }
        I5.a(kVar.f309744d, str3, false);
    }
}
