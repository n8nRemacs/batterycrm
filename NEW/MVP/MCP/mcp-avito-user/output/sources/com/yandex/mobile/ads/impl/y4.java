package com.yandex.mobile.ads.impl;

import android.content.res.Resources;
import android.widget.TextView;
import com.yandex.mobile.ads.R;
import java.util.Arrays;

/* loaded from: classes8.dex */
public final class y4 implements n50 {

    /* renamed from: c, reason: collision with root package name */
    private static final int f391918c = R.string.monetization_ads_internal_instream_ad_position;

    /* renamed from: a, reason: collision with root package name */
    private final int f391919a;

    /* renamed from: b, reason: collision with root package name */
    private final int f391920b;

    public y4(int i12, int i13) {
        this.f391919a = i12;
        this.f391920b = i13;
    }

    @Override // com.yandex.mobile.ads.impl.n50
    public final void a(@Y61.k se1 se1Var) throws Resources.NotFoundException {
        TextView textViewB = se1Var.b();
        if (textViewB != null) {
            String string = textViewB.getContext().getResources().getString(f391918c);
            kotlin.jvm.internal.u0 u0Var = kotlin.jvm.internal.u0.f406856a;
            textViewB.setText(String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(this.f391919a), Integer.valueOf(this.f391920b)}, 2)));
        }
    }
}
