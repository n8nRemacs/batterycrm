package com.yandex.mobile.ads.impl;

import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.mobile.ads.R;

/* loaded from: classes8.dex */
public final class z51 implements n8 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final a61 f392190a;

    public z51(@j.N a61 a61Var) {
        this.f392190a = a61Var;
    }

    @Override // com.yandex.mobile.ads.impl.n50
    public final void a(@j.N se1 se1Var) {
        TextView textViewN = se1Var.n();
        if (textViewN != null) {
            textViewN.setText(R.string.monetization_ads_internal_instream_sponsored_social);
            textViewN.setVisibility(0);
            textViewN.setOnClickListener(new y51(this.f392190a));
        }
        ImageView imageViewM = se1Var.m();
        if (imageViewM != null) {
            imageViewM.setImageDrawable(androidx.core.content.d.getDrawable(imageViewM.getContext(), R.drawable.monetization_instream_internal_advertiser_social));
            imageViewM.setVisibility(0);
            imageViewM.setOnClickListener(new y51(this.f392190a));
        }
    }
}
