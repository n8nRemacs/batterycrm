package com.avito.android.extended_profile_widgets.adapter.premium_banner.adapter.banner;

import Y61.k;
import Y61.l;
import android.content.Context;
import com.avito.android.R;
import com.avito.android.remote.model.Size;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.s0;

/* compiled from: PremiumBannerSizeUtils.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_extended-profile-widgets_public"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i {
    @k
    public static final Q<Integer, Integer> a(@k Context context, @l Size size) {
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.extended_profile_premium_banner_horizontal_margin);
        float width = size != null ? size.getWidth() / size.getHeight() : 2.0f;
        int i12 = C35835l0.g(context).x - (dimensionPixelOffset * 2);
        return new Q<>(Integer.valueOf(i12), Integer.valueOf((int) (i12 / width)));
    }
}
