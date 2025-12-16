package com.avito.android.horizontal_list.items.defaultItem;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: HorizontalListDefaultItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/horizontal_list/items/defaultItem/f;", "LTV0/e;", "Lcom/avito/konveyor/adapter/b;", "_avito_bx-content_widget_horizontal-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f extends com.avito.konveyor.adapter.b implements TV0.e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f162586b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f162587c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f162588d;

    public f(@k View view) {
        super(view);
        this.f162586b = view;
        this.f162587c = (TextView) view.findViewById(R.id.title_text_view);
        this.f162588d = (TextView) view.findViewById(R.id.description_text_view);
    }
}
