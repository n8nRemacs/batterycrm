package com.avito.android.serp.adapter.carousel_show_more;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.inset.AdditionalItem;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.carousel_image.CarouselImageItem;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: CarouselAdditionalItemConverter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/carousel_show_more/b;", "Lcom/avito/android/serp/adapter/carousel_show_more/a;", "<init>", "()V", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.serp.adapter.carousel_show_more.a
    @k
    public final PersistableSerpItem a(@k AdditionalItem additionalItem, @k SerpDisplayType serpDisplayType) {
        if (additionalItem instanceof AdditionalItem.ShowMore) {
            return new CarouselShowMoreItem(0, null, (AdditionalItem.ShowMore) additionalItem, serpDisplayType, 3, null);
        }
        if (!(additionalItem instanceof AdditionalItem.Image)) {
            throw new NoWhenBranchMatchedException();
        }
        return new CarouselImageItem(0, null, (AdditionalItem.Image) additionalItem, serpDisplayType, 3, null);
    }
}
