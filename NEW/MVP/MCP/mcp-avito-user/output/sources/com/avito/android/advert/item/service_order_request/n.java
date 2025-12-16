package com.avito.android.advert.item.service_order_request;

import com.avito.android.advert.item.W0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AdvertDetails;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import kotlin.Metadata;
import kv.C43501a;

/* compiled from: ServiceOrderRequestPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/service_order_request/n;", "", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface n {

    /* compiled from: ServiceOrderRequestPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/service_order_request/n$a;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        void s(@Y61.k DeepLink deepLink);
    }

    @Y61.k
    C41981q0 D();

    void N(@Y61.l W0 w02);

    void a(@Y61.k DeepLink deepLink, @Y61.k String str);

    void b(@Y61.k DeepLink deepLink);

    @Y61.k
    C41981q0 c();

    void e0();

    void i();

    void p(@Y61.l AdvertDetails advertDetails);

    void w(@Y61.k z<C43501a> zVar);
}
