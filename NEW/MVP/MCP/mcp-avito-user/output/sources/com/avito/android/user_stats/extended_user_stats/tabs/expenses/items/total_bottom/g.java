package com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.total_bottom;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.strikethrough.StrikethroughTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TotalBottomItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/items/total_bottom/g;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/items/total_bottom/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f317796b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f317797c;

    /* renamed from: d, reason: collision with root package name */
    public final StrikethroughTextView f317798d;

    public g(@k View view) {
        super(view);
        this.f317796b = view;
        this.f317797c = (TextView) view.findViewById(R.id.dtv_expense_total);
        this.f317798d = (StrikethroughTextView) view.findViewById(R.id.stv_expense_and_bonuses);
    }

    @Override // com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.total_bottom.f
    public final void PX(@k TotalBottomItemData totalBottomItemData) {
        this.f317797c.setText(totalBottomItemData.f317789c);
        StrikethroughTextView strikethroughTextView = this.f317798d;
        String str = totalBottomItemData.f317790d;
        strikethroughTextView.setVisibility(str != null ? 0 : 8);
        if (str != null) {
            strikethroughTextView.setText(str);
        }
    }
}
