package com.avito.android.photo_gallery_carousel.items.common;

import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: SmallGalleryView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery_carousel/items/common/f;", "Lcom/avito/android/photo_gallery_carousel/items/common/c;", "_avito_photo-gallery-carousel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f implements c {
    public f(@k View view, @k ViewGroup viewGroup) {
        int iT2 = D6.t(view, R.dimen.carousel_photo_gallery_between_offset);
        view.setMinimumWidth((((D6.s(viewGroup) - (((iT2 / 2) + D6.t(view, R.dimen.carousel_photo_gallery_horizontal_padding)) * 2)) - iT2) / 2) - y6.b(1));
    }
}
