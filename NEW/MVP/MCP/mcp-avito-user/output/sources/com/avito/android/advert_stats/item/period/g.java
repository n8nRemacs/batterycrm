package com.avito.android.advert_stats.item.period;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.D6;
import kotlin.Metadata;

/* compiled from: PeriodItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_stats/item/period/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert_stats/item/period/f;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f86788b;

    public g(@k View view) {
        super(view);
        this.f86788b = (TextView) view.findViewById(R.id.date);
    }

    @Override // com.avito.android.advert_stats.item.period.f
    public final void setHidden(boolean z12) {
        TextView textView = this.f86788b;
        if (z12) {
            D6.g(textView);
        } else {
            D6.H(textView);
        }
    }

    @Override // com.avito.android.advert_stats.item.period.f
    public final void wZ(@k String str) {
        this.f86788b.setText(str);
    }
}
