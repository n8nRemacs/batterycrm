package com.avito.android.advert_core.feature_teasers.common.dialog;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsFeatureTeaserDialogFactory.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/feature_teasers/common/dialog/k;", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class k extends RecyclerView.r {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f83642b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LinearLayoutManager f83643c;

    public k(com.avito.android.lib.design.bottom_sheet.d dVar, LinearLayoutManager linearLayoutManager) {
        this.f83643c = linearLayoutManager;
        this.f83642b = dVar.findViewById(R.id.advert_details_features_dialog_header_background);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void k(@Y61.k RecyclerView recyclerView, int i12, int i13) {
        int iK1 = this.f83643c.K1();
        View view = this.f83642b;
        if (iK1 > 0) {
            view.setAlpha(1.0f);
        } else {
            View childAt = recyclerView.getChildAt(0);
            view.setAlpha((childAt.getHeight() - childAt.getBottom()) / childAt.getHeight());
        }
    }
}
