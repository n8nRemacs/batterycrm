package com.avito.android.calendar_select.presentation.view.konveyor.items.month;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: MonthItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/calendar_select/presentation/view/konveyor/items/month/f;", "Lcom/avito/android/calendar_select/presentation/view/konveyor/items/month/e;", "Lcom/avito/konveyor/adapter/b;", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f extends com.avito.konveyor.adapter.b implements e {

    /* renamed from: b, reason: collision with root package name */
    public final TextView f113539b;

    public f(@k View view) {
        super(view);
        this.f113539b = (TextView) view.findViewById(R.id.text_view);
    }

    @Override // com.avito.android.calendar_select.presentation.view.konveyor.items.month.e
    public final void setText(@k String str) {
        this.f113539b.setText(str);
    }
}
