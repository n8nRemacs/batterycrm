package com.avito.android.das_date_picker.items.month;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;

/* compiled from: DasCalendarMonthItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/das_date_picker/items/month/g;", "Lcom/avito/android/das_date_picker/items/month/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_das-date-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    public final TextView f132348b;

    public g(@k View view) {
        super(view);
        this.f132348b = (TextView) view.findViewById(R.id.text_view);
    }

    @Override // com.avito.android.das_date_picker.items.month.f
    public final void y(@k PrintableText printableText) {
        TextView textView = this.f132348b;
        textView.setText(printableText.k0(textView.getContext()));
    }
}
