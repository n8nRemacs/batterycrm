package com.avito.android.bundles.ui.recycler;

import Y61.k;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.bundles.ui.recycler.item.banner.g;
import com.avito.android.bundles.ui.recycler.item.skip_button.h;
import kotlin.Metadata;

/* compiled from: PaddingDecoration.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bundles/ui/recycler/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_vas-bundles_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Resources f108357b;

    public a(@k Resources resources) {
        this.f108357b = resources;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        RecyclerView.C cW2 = recyclerView.W(view);
        boolean z12 = cW2 instanceof g;
        Resources resources = this.f108357b;
        rect.top = z12 ? resources.getDimensionPixelOffset(R.dimen.margin_large) : cW2 instanceof h ? resources.getDimensionPixelSize(R.dimen.vas_bundle_skip_button_item_top_margin) : 0;
        rect.left = recyclerView.W(view) instanceof com.avito.android.bundles.ui.recycler.item.bundle.h ? 0 : resources.getDimensionPixelSize(R.dimen.margin_large);
        rect.right = recyclerView.W(view) instanceof com.avito.android.bundles.ui.recycler.item.bundle.h ? 0 : resources.getDimensionPixelSize(R.dimen.margin_large);
        RecyclerView.C cW3 = recyclerView.W(view);
        rect.bottom = cW3 instanceof g ? 0 : cW3 instanceof com.avito.android.bundles.vas_union.item.header.c ? resources.getDimensionPixelOffset(R.dimen.margin_large) : cW3 instanceof com.avito.android.bundles.ui.recycler.item.bundle.h ? resources.getDimensionPixelSize(R.dimen.margin_huge) : cW3 instanceof h ? resources.getDimensionPixelSize(R.dimen.margin_large) : resources.getDimensionPixelOffset(R.dimen.margin_small);
    }
}
