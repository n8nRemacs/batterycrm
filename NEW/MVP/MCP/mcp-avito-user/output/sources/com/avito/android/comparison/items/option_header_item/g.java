package com.avito.android.comparison.items.option_header_item;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.I5;
import kotlin.Metadata;

/* compiled from: OptionHeaderView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comparison/items/option_header_item/g;", "Lcom/avito/android/comparison/items/option_header_item/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f124045b;

    public g(@k View view) {
        super(view);
        this.f124045b = (TextView) view.findViewById(R.id.option_header);
    }

    @Override // com.avito.android.comparison.items.option_header_item.f
    public final void setText(@k String str) {
        I5.a(this.f124045b, str, false);
    }
}
