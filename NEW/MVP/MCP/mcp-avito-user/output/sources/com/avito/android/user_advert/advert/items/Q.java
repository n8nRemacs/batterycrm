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
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MyAdvertRedesignedEquipmentItemDecorator.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/Q;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Q extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f308981b;

    /* renamed from: c, reason: collision with root package name */
    public final int f308982c;

    /* renamed from: d, reason: collision with root package name */
    public final int f308983d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Rect f308984e = new Rect();

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Drawable f308985f;

    @Inject
    public Q(@InterfaceC35538q @Y61.k Context context, @Y61.k Resources resources, @Y61.k com.avito.konveyor.a aVar) {
        this.f308981b = aVar.Y(com.avito.android.advert_core.equipments.redesign.a.class);
        this.f308982c = resources.getDimensionPixelOffset(R.dimen.my_advert_equipment_item_top_offset);
        this.f308983d = resources.getDimensionPixelOffset(R.dimen.my_advert_redesigned_equipment_item_bottom_offset);
        this.f308985f = androidx.core.content.d.getDrawable(context, R.drawable.recycler_view_divider);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        RecyclerView.C cW2 = recyclerView.W(view);
        if (cW2 == null) {
            super.getItemOffsets(rect, view, recyclerView, zVar);
        } else if (cW2.getItemViewType() == this.f308981b) {
            rect.set(0, this.f308982c, 0, this.f308983d);
        } else {
            super.getItemOffsets(rect, view, recyclerView, zVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void onDraw(@Y61.k Canvas canvas, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        int childCount;
        Drawable drawable = this.f308985f;
        if (drawable == null || recyclerView.getChildCount() - 1 < 0) {
            return;
        }
        int i12 = 0;
        while (true) {
            View childAt = recyclerView.getChildAt(i12);
            if (recyclerView.W(childAt).getItemViewType() == this.f308981b) {
                Rect rect = this.f308984e;
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
