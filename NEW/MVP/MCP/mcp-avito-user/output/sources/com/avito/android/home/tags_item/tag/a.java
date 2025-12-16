package com.avito.android.home.tags_item.tag;

import Y61.k;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SectionTagDecoration.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/home/tags_item/tag/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f162514b;

    /* renamed from: c, reason: collision with root package name */
    public final int f162515c;

    public a(@k Resources resources) {
        this.f162514b = resources.getDimensionPixelOffset(R.dimen.section_tag_edge_offset);
        this.f162515c = resources.getDimensionPixelOffset(R.dimen.section_tag_spacing_offset);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        super.getItemOffsets(rect, view, recyclerView, zVar);
        recyclerView.getClass();
        int iU2 = RecyclerView.U(view);
        Integer numValueOf = Integer.valueOf(iU2);
        if (iU2 == -1) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            RecyclerView.C cW2 = recyclerView.W(view);
            if (adapter == null || !(cW2 instanceof i)) {
                return;
            }
            int i12 = this.f162515c;
            int i13 = this.f162514b;
            rect.left = iIntValue == 0 ? i13 : i12;
            if (iIntValue == adapter.getItemCount() - 1) {
                i12 = i13;
            }
            rect.right = i12;
        }
    }
}
