package com.avito.android.inline_filters.dialog.calendar.konveyor.items.month;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: FiltersCalendarMonthItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/inline_filters/dialog/calendar/konveyor/items/month/g;", "Lcom/avito/android/inline_filters/dialog/calendar/konveyor/items/month/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    public final TextView f171253b;

    public g(@k View view) {
        super(view);
        this.f171253b = (TextView) view.findViewById(R.id.text_view);
    }

    @Override // com.avito.android.inline_filters.dialog.calendar.konveyor.items.month.f
    public final void setText(@k String str) {
        this.f171253b.setText(str);
    }
}
