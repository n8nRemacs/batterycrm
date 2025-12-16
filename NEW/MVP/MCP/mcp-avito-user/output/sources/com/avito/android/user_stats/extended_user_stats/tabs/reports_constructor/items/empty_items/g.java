package com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.empty_items;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: EmptyItemsView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/items/empty_items/g;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/items/empty_items/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f318006b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f318007c;

    public g(@k View view) {
        super(view);
        this.f318006b = view;
        this.f318007c = (TextView) view.findViewById(R.id.tv_user_stats_empty);
    }

    @Override // com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.empty_items.f
    public final void BH(@k EmptyItemsData emptyItemsData) {
        this.f318007c.setText(emptyItemsData.f317999c);
    }
}
