package com.avito.android.vas_discount.business;

import Y61.k;
import Y61.l;
import com.avito.android.util.P2;
import com.avito.android.vas_discount.remote.model.DiscountResponse;
import io.reactivex.rxjava3.core.z;
import kotlin.Metadata;

/* compiled from: DiscountRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_discount/business/a;", "", "_avito_vas-discount_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface a {
    @k
    z<P2<DiscountResponse>> a(@l String str);
}
