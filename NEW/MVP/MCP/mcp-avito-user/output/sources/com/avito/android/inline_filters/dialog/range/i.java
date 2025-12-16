package com.avito.android.inline_filters.dialog.range;

import Y61.k;
import android.widget.TextView;
import com.avito.android.util.AbstractC35956u5;
import kotlin.Metadata;

/* compiled from: RangeFilterView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/dialog/range/i;", "Lcom/avito/android/util/u5;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class i extends AbstractC35956u5 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RangeFilterView f171981b;

    public i(RangeFilterView rangeFilterView) {
        this.f171981b = rangeFilterView;
    }

    @Override // com.avito.android.util.AbstractC35956u5, android.text.TextWatcher
    public final void onTextChanged(@k CharSequence charSequence, int i12, int i13, int i14) {
        RangeFilterView rangeFilterView = this.f171981b;
        if (rangeFilterView.f171955e) {
            return;
        }
        Long lK2 = RangeFilterView.k(rangeFilterView.f171962l);
        TextView textView = rangeFilterView.f171958h;
        if (lK2 == null && RangeFilterView.k(rangeFilterView.f171961k) == null) {
            textView.setClickable(false);
            textView.setTextColor(rangeFilterView.f171960j);
        } else {
            textView.setClickable(true);
            textView.setTextColor(rangeFilterView.f171959i);
        }
    }
}
