package com.avito.android.advert.deeplinks.delivery;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.P2;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C;
import kotlin.Metadata;

/* compiled from: RequestDeliveryInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/deeplinks/delivery/o;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface o {
    @Y61.k
    z<P2<DeepLink>> a(@Y61.k String str, @Y61.l String str2);

    @Y61.k
    C b(@Y61.k String str, @Y61.l String str2);
}
