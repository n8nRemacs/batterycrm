package com.avito.android.inline_filters.dialog.select.adapter;

import android.graphics.drawable.Drawable;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalCheckedImage;
import com.avito.android.remote.model.UniversalImage;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: InlineFiltersDialogItemView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/dialog/select/adapter/m;", "LTV0/e;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface m extends TV0.e {

    /* compiled from: InlineFiltersDialogItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void Kd(boolean z12);

    void MY(@Y61.l String str);

    void UV(@Y61.l UniversalCheckedImage universalCheckedImage, @Y61.l String str);

    void ZH(@Y61.k Y41.a<G0> aVar);

    void a(@Y61.k Y41.a<G0> aVar);

    void gE(@Y61.l String str);

    void l(@Y61.l Image image);

    void rF(@Y61.l Boolean bool, @Y61.l UniversalImage universalImage);

    void setChecked(boolean z12);

    void setIcon(@Y61.l Drawable drawable);

    void setText(@Y61.k String str);
}
