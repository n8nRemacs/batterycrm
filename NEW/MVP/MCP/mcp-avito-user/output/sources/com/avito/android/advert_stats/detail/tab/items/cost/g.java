package com.avito.android.advert_stats.detail.tab.items.cost;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35949t5;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: CostByPeriodView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/items/cost/g;", "Lcom/avito/android/advert_stats/detail/tab/items/cost/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f86400b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f86401c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f86402d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f86403e;

    /* renamed from: f, reason: collision with root package name */
    public final SimpleDraweeView f86404f;

    public g(@k View view) {
        super(view);
        this.f86400b = view;
        this.f86401c = (TextView) view.findViewById(R.id.tv_cost_text_item);
        this.f86402d = (TextView) view.findViewById(R.id.tv_cost_date_item);
        this.f86403e = (TextView) view.findViewById(R.id.tv_cost_item);
        this.f86404f = (SimpleDraweeView) view.findViewById(R.id.sdv_cost_item);
    }

    @Override // com.avito.android.advert_stats.detail.tab.items.cost.f
    public final void Kf(@k CostByPeriodItem costByPeriodItem) {
        UniversalImage universalImage = costByPeriodItem.f86391c;
        SimpleDraweeView simpleDraweeView = this.f86404f;
        Image imageDependsOnThemeOrDefault = universalImage != null ? UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.b(simpleDraweeView.getContext())) : null;
        this.f86401c.setText(costByPeriodItem.f86392d);
        TextView textView = this.f86402d;
        String str = costByPeriodItem.f86393e;
        textView.setText(str);
        TextView textView2 = this.f86403e;
        String str2 = costByPeriodItem.f86394f;
        textView2.setText(str2);
        C35949t5.c(simpleDraweeView, com.avito.android.image_loader.b.b(imageDependsOnThemeOrDefault), null, null, null, 14);
        textView.setVisibility((str == null || C43066x.K(str)) ? 8 : 0);
        textView2.setVisibility((str2 == null || C43066x.K(str2)) ? 8 : 0);
        simpleDraweeView.setVisibility(imageDependsOnThemeOrDefault == null ? 8 : 0);
    }
}
