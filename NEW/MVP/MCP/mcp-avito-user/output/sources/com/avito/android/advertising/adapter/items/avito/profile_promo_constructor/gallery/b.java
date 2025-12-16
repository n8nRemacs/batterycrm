package com.avito.android.advertising.adapter.items.avito.profile_promo_constructor.gallery;

import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.lib.util.v;
import kotlin.Metadata;

/* compiled from: ProfilePromoConstructorGalleryItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_advertising_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b {
    public static final void a(@k View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = view.getResources().getDimensionPixelSize(R.dimen.ad_profile_promo_gallery_item_width);
        layoutParams.height = view.getResources().getDimensionPixelSize(R.dimen.ad_profile_promo_gallery_item_height);
        v.b(view, R.dimen.ad_profile_promo_gallery_item_corner_radius);
    }
}
