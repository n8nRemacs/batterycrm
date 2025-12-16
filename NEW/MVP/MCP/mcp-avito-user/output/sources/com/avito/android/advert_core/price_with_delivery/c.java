package com.avito.android.advert_core.price_with_delivery;

import Y61.k;
import Y61.l;
import com.avito.android.component.advert_contact_bar.ContactBar;
import com.avito.android.remote.delivery_suggests.DeliverySuggests;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: PriceWithDeliveryStickyBlockManager.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/price_with_delivery/c;", "", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface c {
    @l
    String a();

    void b(@l String str);

    void c(boolean z12);

    @k
    C41981q0 d();

    @k
    List<ContactBar.InfoStickyBlock> e(@k Map<String, DeliverySuggests.SelectionSettings.DeliveryOption> map);

    void f(@k Map<String, DeliverySuggests.SelectionSettings.DeliveryOption> map);
}
