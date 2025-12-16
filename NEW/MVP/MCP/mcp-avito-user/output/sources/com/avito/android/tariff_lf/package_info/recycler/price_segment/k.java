package com.avito.android.tariff_lf.package_info.recycler.price_segment;

import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TariffPriceSegmentParameterView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf/package_info/recycler/price_segment/k;", "", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final TextView f299275a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f299276b;

    public k(@Y61.k View view) {
        View viewFindViewById = view.findViewById(R.id.text);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f299275a = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.badge);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f299276b = (TextView) viewFindViewById2;
    }
}
