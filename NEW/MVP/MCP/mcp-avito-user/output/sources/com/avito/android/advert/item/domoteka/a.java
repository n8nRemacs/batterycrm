package com.avito.android.advert.item.domoteka;

import Y61.k;
import com.avito.android.remote.DomotekaTeaserResponse;
import com.avito.android.util.Kundle;
import com.avito.android.util.P2;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41982q1;
import kotlin.Metadata;

/* compiled from: DomotekaTeaserInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/domoteka/a;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface a {
    @k
    C41982q1 a(@k String str);

    @k
    z<P2<DomotekaTeaserResponse>> b(@k String str);

    @k
    Kundle d0();
}
