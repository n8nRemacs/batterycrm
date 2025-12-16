package com.avito.android.advert_stats.detail.tab.items.funnel;

import Y41.l;
import Y61.k;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.advert_stats.remote.model.detail_stats.FunnelItem;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import eb.InterfaceC40078a;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: FunnelItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/items/funnel/g;", "Lcom/avito/android/advert_stats/detail/tab/items/funnel/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f86448c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f86449b;

    public g(@k View view) {
        super(view);
        this.f86449b = view;
    }

    @Override // com.avito.android.advert_stats.detail.tab.items.funnel.f
    public final void Tq(@k List<FunnelItem> list, @k com.jakewharton.rxrelay3.c<G0> cVar, @k l<? super InterfaceC40078a, G0> lVar) {
        int i12;
        View view = this.f86449b;
        View viewFindViewById = view.findViewById(R.id.funnel_item_1);
        View viewFindViewById2 = view.findViewById(R.id.funnel_item_2);
        View viewFindViewById3 = view.findViewById(R.id.funnel_item_3);
        viewFindViewById.setVisibility(4);
        viewFindViewById2.setVisibility(4);
        viewFindViewById3.setVisibility(4);
        int i13 = 0;
        int i14 = 0;
        for (Object obj : list) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                C42745f0.H0();
                throw null;
            }
            FunnelItem funnelItem = (FunnelItem) obj;
            View view2 = i14 != 0 ? i14 != 1 ? viewFindViewById3 : viewFindViewById2 : viewFindViewById;
            view2.setVisibility(i13);
            TextView textView = (TextView) view2.findViewById(R.id.tv_stats_funnel_value);
            ImageView imageView = (ImageView) view2.findViewById(R.id.tv_stats_funnel_dots);
            TextView textView2 = (TextView) view2.findViewById(R.id.tv_stats_funnel_description);
            textView.setText(funnelItem.getValue());
            textView2.setText(funnelItem.getDescription());
            if (funnelItem.getHasDialog()) {
                view2.setOnClickListener(new com.avito.android.advert_stats.detail.tab.items.button.g(cVar, lVar, 1));
                i12 = 0;
            } else {
                i12 = 4;
            }
            imageView.setVisibility(i12);
            if (funnelItem.getColor() != null) {
                int iA2 = C48063a.f437606a.a(view.getContext(), funnelItem.getColor());
                textView.setTextColor(iA2);
                textView2.setTextColor(iA2);
                GradientDrawable gradientDrawable = (GradientDrawable) imageView.getDrawable();
                int i16 = D6.i(1, view.getContext());
                float fI2 = D6.i(2, view.getContext());
                gradientDrawable.setStroke(i16, iA2, fI2, fI2);
            } else {
                int iD2 = C35835l0.d(R.attr.black, view.getContext());
                GradientDrawable gradientDrawable2 = (GradientDrawable) imageView.getDrawable();
                int i17 = D6.i(1, view.getContext());
                float fI3 = D6.i(2, view.getContext());
                gradientDrawable2.setStroke(i17, iD2, fI3, fI3);
            }
            i14 = i15;
            i13 = 0;
        }
    }
}
