package com.avito.android.user_advert.advert.items;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.user_advert.di.InterfaceC35538q;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.s0;

/* compiled from: MyAdvertGroupsItemDecorator.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/G;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class G extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Set<Integer> f308961b;

    /* renamed from: c, reason: collision with root package name */
    public final int f308962c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Rect f308963d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Drawable f308964e;

    @Inject
    public G(@InterfaceC35538q @Y61.k Context context, @Y61.k Resources resources, @Y61.k com.avito.konveyor.a aVar) {
        this.f308961b = C42756l.l0(new Integer[]{Integer.valueOf(aVar.Y(com.avito.android.user_advert.advert.items.group.title.a.class)), Integer.valueOf(aVar.Y(com.avito.android.user_advert.advert.items.group.parameter.title.a.class)), Integer.valueOf(aVar.Y(com.avito.android.user_advert.advert.items.group.parameter.subtitle.a.class)), Integer.valueOf(aVar.Y(com.avito.android.user_advert.advert.items.group.parameter.description.a.class))});
        this.f308962c = resources.getDimensionPixelOffset(R.dimen.my_avert_group_block_bottom_offset);
        this.f308964e = androidx.core.content.d.getDrawable(context, R.drawable.recycler_view_divider);
    }

    public final boolean c(int i12, RecyclerView recyclerView) {
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        if (i12 < 0 || i12 >= itemCount) {
            return false;
        }
        Set<Integer> set = this.f308961b;
        RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
        return C42745f0.r(set, adapter2 != null ? Integer.valueOf(adapter2.getItemViewType(i12)) : null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        RecyclerView.C cW2 = recyclerView.W(view);
        if (cW2 == null) {
            super.getItemOffsets(rect, view, recyclerView, zVar);
            return;
        }
        int bindingAdapterPosition = cW2.getBindingAdapterPosition();
        if (!this.f308961b.contains(Integer.valueOf(cW2.getItemViewType())) || c(bindingAdapterPosition + 1, recyclerView)) {
            super.getItemOffsets(rect, view, recyclerView, zVar);
        } else {
            rect.set(0, 0, 0, this.f308962c);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void onDraw(@Y61.k Canvas canvas, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        int childCount;
        Drawable drawable = this.f308964e;
        if (drawable == null || recyclerView.getChildCount() - 1 < 0) {
            return;
        }
        int i12 = 0;
        while (true) {
            View childAt = recyclerView.getChildAt(i12);
            RecyclerView.C cW2 = recyclerView.W(childAt);
            int bindingAdapterPosition = cW2.getBindingAdapterPosition();
            if (this.f308961b.contains(Integer.valueOf(cW2.getItemViewType())) && !c(bindingAdapterPosition - 1, recyclerView)) {
                Rect rect = this.f308963d;
                RecyclerView.Y(childAt, rect);
                drawable.setBounds(0, rect.top, rect.width(), drawable.getIntrinsicHeight() + rect.top);
                drawable.draw(canvas);
            }
            if (i12 == childCount) {
                return;
            } else {
                i12++;
            }
        }
    }
}
