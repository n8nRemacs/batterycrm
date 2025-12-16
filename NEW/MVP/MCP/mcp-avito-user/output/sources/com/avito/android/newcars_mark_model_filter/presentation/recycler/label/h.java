package com.avito.android.newcars_mark_model_filter.presentation.recycler.label;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: LabelItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/newcars_mark_model_filter/presentation/recycler/label/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/newcars_mark_model_filter/presentation/recycler/label/g;", "_avito_new-cars-mark-model-filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f207390b;

    public h(@k View view) {
        super(view);
        this.f207390b = (TextView) view.findViewById(R.id.brand_model_label);
    }

    @Override // com.avito.android.newcars_mark_model_filter.presentation.recycler.label.g
    public final void setTitle(@l CharSequence charSequence) {
        this.f207390b.setText(charSequence);
    }
}
