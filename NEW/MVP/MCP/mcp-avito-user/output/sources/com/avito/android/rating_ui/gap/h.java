package com.avito.android.rating_ui.gap;

import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.util.D6;
import kotlin.Metadata;

/* compiled from: RatingGapItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating_ui/gap/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/rating_ui/gap/g;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f250011b;

    public h(@k View view) {
        super(view);
        this.f250011b = view;
    }

    @Override // com.avito.android.rating_ui.gap.g
    public final void N(int i12) {
        View view = this.f250011b;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = D6.j(view, i12);
        view.setLayoutParams(layoutParams);
    }
}
