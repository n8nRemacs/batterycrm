package com.avito.android.advert.advert_details_style;

import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.util.D6;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AbuseButtons.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_advert-details_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a {
    public static final void a(View view) {
        D6.D(view, R.drawable.bg_btn_flat_rds_warmgray4_redesign);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = view.getResources().getDimensionPixelSize(R.dimen.advert_details_min_button_height);
        view.setLayoutParams(layoutParams);
    }
}
