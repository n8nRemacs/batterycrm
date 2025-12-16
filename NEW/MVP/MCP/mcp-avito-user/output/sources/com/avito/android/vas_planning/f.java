package com.avito.android.vas_planning;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: VasPlanningItemDecoration.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_planning/f;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f322357b;

    /* renamed from: c, reason: collision with root package name */
    public final int f322358c;

    /* renamed from: d, reason: collision with root package name */
    public final int f322359d;

    /* renamed from: e, reason: collision with root package name */
    public final int f322360e;

    /* renamed from: f, reason: collision with root package name */
    public final int f322361f;

    /* renamed from: g, reason: collision with root package name */
    public final int f322362g;

    /* renamed from: h, reason: collision with root package name */
    public final int f322363h;

    /* renamed from: i, reason: collision with root package name */
    public final int f322364i;

    public f(@Y61.k Resources resources, @Y61.k com.avito.konveyor.a aVar) {
        this.f322357b = resources.getDimensionPixelOffset(R.dimen.vas_planning_radio_block_top_padding);
        this.f322358c = resources.getDimensionPixelOffset(R.dimen.vas_planning_title_padding);
        this.f322359d = resources.getDimensionPixelOffset(R.dimen.vas_planning_date_time_block_top_padding);
        this.f322360e = resources.getDimensionPixelOffset(R.dimen.vas_planning_date_time_block_between_padding);
        this.f322361f = resources.getDimensionPixelOffset(R.dimen.vas_planning_date_time_block_bottom_padding);
        this.f322362g = aVar.Y(com.avito.android.vas_planning.item.radio.b.class);
        this.f322363h = aVar.Y(com.avito.android.vas_planning.item.title.a.class);
        this.f322364i = aVar.Y(com.avito.android.vas_planning.item.date_time.b.class);
    }

    public static Integer c(int i12, RecyclerView recyclerView) {
        RecyclerView.Adapter adapter;
        if (i12 < 0) {
            return null;
        }
        RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
        if (i12 >= (adapter2 != null ? adapter2.getItemCount() : 0) || (adapter = recyclerView.getAdapter()) == null) {
            return null;
        }
        return Integer.valueOf(adapter.getItemViewType(i12));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        int i12;
        Integer numC;
        super.getItemOffsets(rect, view, recyclerView, zVar);
        RecyclerView.C cW2 = recyclerView.W(view);
        if (cW2 == null) {
            return;
        }
        int bindingAdapterPosition = cW2.getBindingAdapterPosition();
        Integer numValueOf = Integer.valueOf(bindingAdapterPosition);
        if (bindingAdapterPosition < 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : cW2.getOldPosition();
        int itemViewType = cW2.getItemViewType();
        if (itemViewType == this.f322363h) {
            i12 = this.f322358c;
        } else {
            int i13 = this.f322364i;
            if (itemViewType == i13) {
                Integer numC2 = c(iIntValue - 1, recyclerView);
                i12 = (numC2 != null && numC2.intValue() == i13) ? this.f322360e : this.f322359d;
            } else {
                int i14 = this.f322362g;
                i12 = (itemViewType != i14 || ((numC = c(iIntValue + (-1), recyclerView)) != null && numC.intValue() == i14)) ? 0 : this.f322357b;
            }
        }
        int i15 = iIntValue == zVar.b() + (-1) ? this.f322361f : 0;
        rect.top = i12;
        rect.bottom = i15;
    }
}
