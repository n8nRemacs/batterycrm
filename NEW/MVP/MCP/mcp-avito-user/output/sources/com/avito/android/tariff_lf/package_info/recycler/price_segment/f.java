package com.avito.android.tariff_lf.package_info.recycler.price_segment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.I5;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: TariffPriceSegmentItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_lf/package_info/recycler/price_segment/f;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/tariff_lf/package_info/recycler/price_segment/e;", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f extends com.avito.konveyor.adapter.b implements e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f299271b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f299272c;

    public f(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.segment_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f299271b = (TextView) viewFindViewById;
        this.f299272c = (ViewGroup) view;
    }

    @Override // com.avito.android.tariff_lf.package_info.recycler.price_segment.e
    public final void b(@Y61.k String str) {
        I5.a(this.f299271b, str, false);
    }

    @Override // com.avito.android.tariff_lf.package_info.recycler.price_segment.e
    public final void iY(@Y61.l List<a> list) {
        ViewGroup viewGroup = this.f299272c;
        if (viewGroup.getChildCount() > 1) {
            viewGroup.removeViews(1, viewGroup.getChildCount() - 1);
        }
        if (list == null) {
            return;
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.itemView.getContext());
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            a aVar = (a) obj;
            View viewInflate = layoutInflaterFrom.inflate(R.layout.tariff_price_segment_parameter, viewGroup, false);
            k kVar = new k(viewInflate);
            I5.a(kVar.f299275a, aVar.f299263a, false);
            I5.a(kVar.f299276b, aVar.f299264b, false);
            if (i12 == list.size() - 1) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewInflate.getLayoutParams();
                marginLayoutParams.bottomMargin = 0;
                viewInflate.setLayoutParams(marginLayoutParams);
            }
            viewGroup.addView(viewInflate, i13);
            i12 = i13;
        }
    }
}
