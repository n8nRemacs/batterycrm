package com.avito.android.imv_cars_details.presentation.items.difference_imv_avg_price;

import Y61.k;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DifferenceParamView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/imv_cars_details/presentation/items/difference_imv_avg_price/g;", "", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f170073a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ImageView f170074b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f170075c;

    public g(@k View view) {
        this.f170073a = view;
        View viewFindViewById = view.findViewById(R.id.param_icon);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f170074b = (ImageView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.param_text);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f170075c = (TextView) viewFindViewById2;
    }
}
