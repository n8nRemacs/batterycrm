package ib;

import Y61.k;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.advert_stats.item.details.f;
import kotlin.Metadata;

/* compiled from: LastItemDecoration.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lib/b;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ib.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C41375b extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f398570b;

    /* renamed from: c, reason: collision with root package name */
    public final int f398571c;

    /* renamed from: d, reason: collision with root package name */
    public int f398572d;

    /* renamed from: e, reason: collision with root package name */
    public int f398573e = -1;

    public C41375b(@k Resources resources, int i12) {
        this.f398570b = i12;
        this.f398571c = i12 - (resources.getDimensionPixelSize(R.dimen.button_top_margin) / 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        int i12;
        recyclerView.getClass();
        int height = 0;
        boolean z12 = RecyclerView.U(view) == zVar.b() - 1;
        boolean z13 = recyclerView.W(view) instanceof f;
        if (z12 && z13) {
            RecyclerView.m layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null) {
                RecyclerView.Adapter adapter = recyclerView.getAdapter();
                int itemCount = adapter != null ? adapter.getItemCount() : 0;
                if (itemCount == recyclerView.getChildCount() || (i12 = this.f398572d) <= 0) {
                    int childCount = recyclerView.getChildCount();
                    int iK02 = 0;
                    while (height < childCount) {
                        iK02 += layoutManager.k0(recyclerView.getChildAt(height));
                        height++;
                    }
                    height = recyclerView.getHeight() - iK02;
                    if (this.f398572d == 0) {
                        this.f398572d = itemCount;
                        this.f398573e = height;
                    }
                } else {
                    height = itemCount > i12 ? -1 : this.f398573e;
                }
            }
            if (height < this.f398571c) {
                rect.bottom = this.f398570b;
            }
        }
    }
}
