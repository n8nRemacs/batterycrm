package com.avito.android.advert.item.ownership_cost.items.results;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem;
import com.avito.android.remote.model.OwnershipCostResponse;
import com.avito.android.util.D6;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: CostTabsViewFactory.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/ownership_cost/items/results/c;", "Lcom/avito/android/advert/item/ownership_cost/items/results/b;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c implements b {
    @Inject
    public c() {
    }

    @Override // com.avito.android.advert.item.ownership_cost.items.results.b
    @Y61.k
    public final LinearLayout a(@Y61.k OwnershipCostResponse.OwnershipCostResults.CostResultTab.CostResultTabRow costResultTabRow, @Y61.k ViewGroup viewGroup, @Y61.k LayoutInflater layoutInflater, boolean z12) {
        LinearLayout linearLayout = (LinearLayout) layoutInflater.inflate(z12 ? R.layout.cost_tab_row_accented : R.layout.cost_tab_row, viewGroup, false);
        View viewFindViewById = linearLayout.findViewById(R.id.value);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem");
        }
        DescriptionParameterItem descriptionParameterItem = (DescriptionParameterItem) viewFindViewById;
        descriptionParameterItem.getLeftTextView().setText(costResultTabRow.getLabel());
        descriptionParameterItem.getRightTextView().setText(costResultTabRow.getValue());
        String subtitle = costResultTabRow.getSubtitle();
        if (subtitle != null && !C43066x.K(subtitle)) {
            View viewFindViewById2 = linearLayout.findViewById(R.id.subtitle);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            TextView textView = (TextView) viewFindViewById2;
            textView.setText(costResultTabRow.getSubtitle());
            D6.H(textView);
        }
        return linearLayout;
    }

    @Override // com.avito.android.advert.item.ownership_cost.items.results.b
    @Y61.k
    public final TextView b(@Y61.k String str, @Y61.k ViewGroup viewGroup, @Y61.k LayoutInflater layoutInflater) {
        TextView textView = (TextView) layoutInflater.inflate(R.layout.cost_tab, viewGroup, false);
        textView.setText(str);
        return textView;
    }
}
