package com.avito.android.advert.item.gallery;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.Image;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: AdvertGalleryImagesTrimmer.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/gallery/a;", "", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a {
    @Inject
    public a() {
    }

    @l
    public static List a(@k AdvertDetails advertDetails) {
        List<Image> images = advertDetails.getImages();
        if (images == null || images.isEmpty()) {
            return null;
        }
        List<Image> images2 = advertDetails.getImages();
        ArrayList arrayList = images2 != null ? new ArrayList(images2) : null;
        if (advertDetails.isGigItem() && arrayList != null && arrayList.size() == 1) {
            return null;
        }
        if (!advertDetails.isGigItem()) {
            return arrayList;
        }
        if (arrayList != null) {
            return C42745f0.w(arrayList, 1);
        }
        return null;
    }
}
