package com.yandex.mobile.ads.impl;

import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.mobile.ads.R;

/* renamed from: com.yandex.mobile.ads.impl.do, reason: invalid class name */
/* loaded from: classes8.dex */
public final class Cdo implements n8 {
    @Override // com.yandex.mobile.ads.impl.n50
    public final void a(@j.N se1 se1Var) {
        TextView textViewN = se1Var.n();
        if (textViewN != null) {
            textViewN.setText(R.string.monetization_ads_internal_instream_sponsored_default);
            textViewN.setVisibility(0);
        }
        ImageView imageViewM = se1Var.m();
        if (imageViewM != null) {
            imageViewM.setImageDrawable(androidx.core.content.d.getDrawable(imageViewM.getContext(), R.drawable.monetization_instream_internal_advertiser));
            imageViewM.setVisibility(0);
        }
    }
}
