package ib;

import Y61.k;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.advert_stats.item.title.f;
import com.avito.android.advert_stats.item.u;
import kotlin.Metadata;

/* compiled from: StatisticsDecoration.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lib/d;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Resources f398576b;

    /* renamed from: c, reason: collision with root package name */
    public final int f398577c;

    /* renamed from: d, reason: collision with root package name */
    public final int f398578d;

    public d(@k Resources resources) {
        this.f398576b = resources;
        this.f398577c = resources.getDimensionPixelSize(R.dimen.recycler_side_margin);
        this.f398578d = resources.getDimensionPixelSize(R.dimen.details_item_margin);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        int dimensionPixelSize;
        Object objW = recyclerView.W(view);
        int iU2 = RecyclerView.U(view);
        boolean z12 = objW instanceof f;
        int i12 = this.f398577c;
        int i13 = this.f398578d;
        if (z12) {
            dimensionPixelSize = i13;
        } else if (objW instanceof u) {
            dimensionPixelSize = i12;
        } else if (objW instanceof com.avito.android.advert_stats.item.period.f) {
            Resources resources = this.f398576b;
            dimensionPixelSize = iU2 == 0 ? resources.getDimensionPixelSize(R.dimen.period_to_top_padding) : resources.getDimensionPixelSize(R.dimen.period_to_title_margin);
        } else {
            dimensionPixelSize = 0;
        }
        rect.top = dimensionPixelSize;
        if (!(objW instanceof com.avito.android.advert_stats.item.details.f)) {
            i13 = 0;
        } else if (((com.avito.android.advert_stats.item.details.f) objW).getF86748d()) {
            i13 = i12;
        }
        rect.bottom = i13;
        rect.left = objW instanceof u ? 0 : i12;
        if (objW instanceof u) {
            i12 = 0;
        }
        rect.right = i12;
    }
}
