package com.avito.android.inline_filters.dialog.select.adapter;

import android.graphics.drawable.Drawable;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: InlineFiltersDialogMultiselectCandyView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/inline_filters/dialog/select/adapter/s;", "Lcom/avito/android/inline_filters/dialog/select/adapter/m;", "Lcom/avito/android/candy/a;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class s extends com.avito.android.candy.a implements m {
    @Override // com.avito.android.inline_filters.dialog.select.adapter.m
    public final void Kd(boolean z12) {
        this.f114860f.setEnabled(z12);
    }

    @Override // com.avito.android.inline_filters.dialog.select.adapter.m
    public final void a(@Y61.k Y41.a<G0> aVar) {
        this.itemView.setOnClickListener(new com.avito.android.body_condition.h(this, aVar));
    }

    @Override // com.avito.android.inline_filters.dialog.select.adapter.m
    public final void setText(@Y61.k String str) {
        this.f114858d.setText(str);
    }

    @Override // com.avito.android.inline_filters.dialog.select.adapter.m
    public final void MY(@Y61.l String str) {
    }

    @Override // com.avito.android.inline_filters.dialog.select.adapter.m
    public final void ZH(@Y61.k Y41.a<G0> aVar) {
    }

    @Override // com.avito.android.inline_filters.dialog.select.adapter.m
    public final void gE(@Y61.l String str) {
    }

    @Override // com.avito.android.inline_filters.dialog.select.adapter.m
    public final void l(@Y61.l Image image) {
    }

    @Override // com.avito.android.inline_filters.dialog.select.adapter.m
    public final void setIcon(@Y61.l Drawable drawable) {
    }

    @Override // com.avito.android.inline_filters.dialog.select.adapter.m
    public final void rF(@Y61.l Boolean bool, @Y61.l UniversalImage universalImage) {
    }
}
