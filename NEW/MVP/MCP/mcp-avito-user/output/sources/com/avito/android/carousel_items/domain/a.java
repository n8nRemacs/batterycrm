package com.avito.android.carousel_items.domain;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.Location;
import com.avito.android.remote.model.inset.ItemsRequestParams;
import com.avito.android.util.P2;
import io.reactivex.rxjava3.core.z;
import kotlin.Metadata;

/* compiled from: CarouselItemsInteractorImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/carousel_items/domain/a;", "", "_avito_carousel-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface a {
    @k
    z<P2<g>> a(@k ItemsRequestParams itemsRequestParams, @l Location location, @l String str, @l Integer num, @k String str2);
}
