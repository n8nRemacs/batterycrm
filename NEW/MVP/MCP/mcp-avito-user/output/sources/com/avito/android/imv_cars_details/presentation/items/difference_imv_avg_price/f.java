package com.avito.android.imv_cars_details.presentation.items.difference_imv_avg_price;

import Y61.k;
import Y61.l;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.remote.imv_cars_details.models.DifferenceImvAvgPriceParams;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DifferenceImvAvgPriceView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/imv_cars_details/presentation/items/difference_imv_avg_price/f;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/imv_cars_details/presentation/items/difference_imv_avg_price/e;", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f extends com.avito.konveyor.adapter.b implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f170066b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f170067c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final LinearLayout f170068d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f170069e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final LinearLayout f170070f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final TextView f170071g;

    /* renamed from: h, reason: collision with root package name */
    public final LayoutInflater f170072h;

    public f(@k View view) {
        super(view);
        this.f170066b = view;
        View viewFindViewById = view.findViewById(R.id.header);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f170067c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.imv_params_card);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f170068d = (LinearLayout) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.imv_params_header);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f170069e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.avg_price_params_card);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f170070f = (LinearLayout) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.avg_price_params_header);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f170071g = (TextView) viewFindViewById5;
        this.f170072h = LayoutInflater.from(view.getContext());
    }

    public final void B80(List<DifferenceImvAvgPriceParams> list, LinearLayout linearLayout) {
        linearLayout.removeViewsInLayout(1, linearLayout.getChildCount() - 1);
        for (DifferenceImvAvgPriceParams differenceImvAvgPriceParams : list) {
            View viewInflate = this.f170072h.inflate(R.layout.difference_imv_avg_price_param_view, (ViewGroup) linearLayout, false);
            g gVar = new g(viewInflate);
            I5.a(gVar.f170075c, differenceImvAvgPriceParams.getText(), false);
            int iJ2 = C35835l0.j(differenceImvAvgPriceParams.getUsage() ? R.attr.ic_checkThin16 : R.attr.ic_close16, viewInflate.getContext());
            ImageView imageView = gVar.f170074b;
            imageView.setImageResource(iJ2);
            imageView.setImageTintList(ColorStateList.valueOf(C35835l0.d(R.attr.black, viewInflate.getContext())));
            linearLayout.addView(viewInflate);
        }
    }

    @Override // com.avito.android.imv_cars_details.presentation.items.difference_imv_avg_price.e
    public final void M20(@l String str, @l List list) {
        LinearLayout linearLayout = this.f170070f;
        if (list == null || str == null) {
            D6.w(linearLayout);
            return;
        }
        I5.a(this.f170071g, str, false);
        B80(list, linearLayout);
        D6.H(linearLayout);
    }

    @Override // com.avito.android.imv_cars_details.presentation.items.difference_imv_avg_price.e
    public final void U1(@l String str) {
        I5.a(this.f170067c, str, false);
    }

    @Override // com.avito.android.imv_cars_details.presentation.items.difference_imv_avg_price.e
    public final void aD(@l String str, @l List list) {
        LinearLayout linearLayout = this.f170068d;
        if (list == null || str == null) {
            D6.w(linearLayout);
            return;
        }
        I5.a(this.f170069e, str, false);
        B80(list, linearLayout);
        D6.H(linearLayout);
    }
}
