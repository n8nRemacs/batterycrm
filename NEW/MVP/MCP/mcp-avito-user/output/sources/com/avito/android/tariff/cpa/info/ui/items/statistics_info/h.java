package com.avito.android.tariff.cpa.info.ui.items.statistics_info;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem;
import com.avito.android.util.D6;
import dC0.C39561c;
import kotlin.Metadata;

/* compiled from: StatisticsInfoItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpa/info/ui/items/statistics_info/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/tariff/cpa/info/ui/items/statistics_info/g;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f294936b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final DescriptionParameterItem f294937c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final DescriptionParameterItem f294938d;

    public h(@k View view) {
        super(view);
        this.f294936b = (TextView) view.findViewById(R.id.title);
        this.f294937c = (DescriptionParameterItem) view.findViewById(R.id.actions_view);
        this.f294938d = (DescriptionParameterItem) view.findViewById(R.id.spent_amount_view);
    }

    @Override // com.avito.android.tariff.cpa.info.ui.items.statistics_info.g
    public final void Gn(@l C39561c c39561c) {
        boolean z12 = c39561c != null;
        DescriptionParameterItem descriptionParameterItem = this.f294938d;
        D6.G(descriptionParameterItem, z12);
        if (c39561c != null) {
            descriptionParameterItem.getLeftTextView().setText(c39561c.getTitle());
            descriptionParameterItem.getRightTextView().setText(c39561c.getValue());
        }
    }

    @Override // com.avito.android.tariff.cpa.info.ui.items.statistics_info.g
    public final void bh(@l C39561c c39561c) {
        boolean z12 = c39561c != null;
        DescriptionParameterItem descriptionParameterItem = this.f294937c;
        D6.G(descriptionParameterItem, z12);
        if (c39561c != null) {
            descriptionParameterItem.getLeftTextView().setText(c39561c.getTitle());
            descriptionParameterItem.getRightTextView().setText(c39561c.getValue());
        }
    }

    @Override // com.avito.android.tariff.cpa.info.ui.items.statistics_info.g
    public final void setTitle(@k String str) {
        this.f294936b.setText(str);
    }
}
