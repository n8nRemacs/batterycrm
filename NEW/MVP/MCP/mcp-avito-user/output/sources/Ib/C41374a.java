package ib;

import Y61.k;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.advert_stats.item.C28328g;
import kotlin.Metadata;

/* compiled from: BarDecoration.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lib/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ib.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C41374a extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f398568b;

    /* renamed from: c, reason: collision with root package name */
    public final int f398569c;

    public C41374a(@k Resources resources) throws Resources.NotFoundException {
        this.f398568b = resources.getDimensionPixelSize(R.dimen.gap_between_bars_small);
        this.f398569c = resources.getDimensionPixelSize(R.dimen.card_view_padding) + resources.getDimensionPixelSize(R.dimen.shadow_padding);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        RecyclerView.C cW2 = recyclerView.W(view);
        boolean z12 = cW2 instanceof C28328g;
        int i12 = this.f398568b;
        if (!z12 || !((C28328g) cW2).f86759h) {
            rect.left = i12;
            rect.right = i12;
        } else {
            int i13 = this.f398569c;
            rect.left = i12 - i13;
            rect.right = i12 - i13;
        }
    }
}
