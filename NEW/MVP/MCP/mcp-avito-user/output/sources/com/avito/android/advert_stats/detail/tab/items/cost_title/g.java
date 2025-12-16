package com.avito.android.advert_stats.detail.tab.items.cost_title;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.text.j;
import kotlin.Metadata;

/* compiled from: CostTitleView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/items/cost_title/g;", "Lcom/avito/android/advert_stats/detail/tab/items/cost_title/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f86436b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f86437c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f86438d;

    public g(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f86436b = view;
        this.f86437c = aVar;
        this.f86438d = (TextView) view.findViewById(R.id.tv_title_cost);
    }

    @Override // com.avito.android.advert_stats.detail.tab.items.cost_title.f
    public final void iC(@k CostTitleItem costTitleItem) {
        j.c(this.f86438d, costTitleItem.f86428c, this.f86437c);
    }
}
