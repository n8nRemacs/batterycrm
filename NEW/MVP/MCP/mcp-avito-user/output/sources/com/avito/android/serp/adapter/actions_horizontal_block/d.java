package com.avito.android.serp.adapter.actions_horizontal_block;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.serp.adapter.advert_xl.A;
import com.avito.android.serp.adapter.advert_xl.C34684d;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: ActionsHorizontalBlockItemDecorator.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/actions_horizontal_block/d;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f268666b;

    /* renamed from: c, reason: collision with root package name */
    public final int f268667c = y6.b(4);

    /* renamed from: d, reason: collision with root package name */
    public final int f268668d = y6.b(8);

    /* renamed from: e, reason: collision with root package name */
    public final int f268669e;

    /* renamed from: f, reason: collision with root package name */
    public final int f268670f;

    /* renamed from: g, reason: collision with root package name */
    public final int f268671g;

    /* renamed from: h, reason: collision with root package name */
    public final int f268672h;

    public d(@Y61.k Resources resources, @Y61.k com.avito.konveyor.a aVar) {
        this.f268666b = resources.getDimensionPixelSize(R.dimen.serp_horizontal_padding);
        this.f268669e = aVar.Y(com.avito.android.constructor_advert.ui.serp.constructor.blueprint.a.class);
        this.f268670f = aVar.Y(C34684d.class);
        this.f268671g = aVar.Y(A.class);
        this.f268672h = aVar.Y(com.avito.android.serp.adapter.developments_catalog.filters.tab_group.a.class);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        super.getItemOffsets(rect, view, recyclerView, zVar);
        RecyclerView.C cW2 = recyclerView.W(view);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null) {
            return;
        }
        int bindingAdapterPosition = cW2.getBindingAdapterPosition();
        if (cW2 instanceof r) {
            int i12 = this.f268666b;
            rect.left = -i12;
            rect.right = -i12;
            int i13 = bindingAdapterPosition + 1;
            if (adapter.getItemCount() > i13) {
                int itemViewType = adapter.getItemViewType(i13);
                if (itemViewType == this.f268669e || itemViewType == this.f268670f || itemViewType == this.f268671g) {
                    rect.bottom = this.f268667c;
                }
                if (itemViewType == this.f268672h) {
                    rect.bottom = this.f268668d;
                }
            }
        }
    }
}
