package com.avito.android.inline_filters.dialog.calendar;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: FiltersCalendarPickerHeaderView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/dialog/calendar/n;", "Lcom/avito/android/inline_filters/dialog/calendar/m;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class n implements m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f171275a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f171276b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f171277c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final View f171278d;

    public n(@Y61.k View view, boolean z12) {
        this.f171275a = view.getContext();
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f171276b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.clear_button);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById2;
        this.f171277c = textView;
        View viewFindViewById3 = view.findViewById(R.id.close_button);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f171278d = viewFindViewById3;
        textView.setVisibility(z12 ? 0 : 8);
        viewFindViewById3.setVisibility(z12 ? 0 : 8);
    }
}
