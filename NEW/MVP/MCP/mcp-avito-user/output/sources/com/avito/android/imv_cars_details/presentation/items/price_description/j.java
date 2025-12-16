package com.avito.android.imv_cars_details.presentation.items.price_description;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PriceDescriptionDetailItemView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/imv_cars_details/presentation/items/price_description/j;", "", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f170211a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f170212b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ImageView f170213c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f170214d;

    public j(@Y61.k View view) {
        this.f170211a = view;
        View viewFindViewById = view.findViewById(R.id.text);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f170212b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.icon);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f170213c = (ImageView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.mark);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f170214d = (TextView) viewFindViewById3;
    }
}
