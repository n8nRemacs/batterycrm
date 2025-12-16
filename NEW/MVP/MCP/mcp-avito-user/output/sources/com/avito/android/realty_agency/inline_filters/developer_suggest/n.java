package com.avito.android.realty_agency.inline_filters.developer_suggest;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.inline_filters.dialog.select.SelectFilterView;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DeveloperSuggestSelectFilterViewHolder.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/realty_agency/inline_filters/developer_suggest/n;", "Lcom/avito/android/inline_filters/dialog/select/SelectFilterView;", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class n extends SelectFilterView {

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f251558m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final TextView f251559n;

    public n(@Y61.k View view) {
        super(view, false, null, null);
        View viewFindViewById = view.findViewById(R.id.filter_options_recycler_view);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        this.f251558m = (RecyclerView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.empty_view_hint);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f251559n = (TextView) viewFindViewById2;
    }
}
