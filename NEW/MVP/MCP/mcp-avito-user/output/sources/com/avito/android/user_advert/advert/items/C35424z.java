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

/* compiled from: MyAdvertFeatureTeaserItemDecoration.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/z;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.user_advert.advert.items.z, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35424z extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f310412b;

    /* renamed from: c, reason: collision with root package name */
    public final int f310413c;

    /* renamed from: d, reason: collision with root package name */
    public final int f310414d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Rect f310415e = new Rect();

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Drawable f310416f;

    @Inject
    public C35424z(@InterfaceC35538q @Y61.k Context context, @Y61.k Resources resources, @Y61.k com.avito.konveyor.a aVar) {
        this.f310412b = aVar.Y(com.avito.android.user_advert.advert.items.feature_teaser.a.class);
        this.f310413c = resources.getDimensionPixelOffset(R.dimen.my_advert_feature_teaser_item_top_margin);
        this.f310414d = resources.getDimensionPixelOffset(R.dimen.my_advert_feature_teaser_item_bottom_margin);
        this.f310416f = androidx.core.content.d.getDrawable(context, R.drawable.recycler_view_divider);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        RecyclerView.C cW2 = recyclerView.W(view);
        if (cW2 == null) {
            super.getItemOffsets(rect, view, recyclerView, zVar);
        } else if (cW2.getItemViewType() == this.f310412b) {
            rect.set(0, this.f310413c, 0, this.f310414d);
        } else {
            super.getItemOffsets(rect, view, recyclerView, zVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void onDraw(@Y61.k Canvas canvas, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        int childCount;
        Drawable drawable = this.f310416f;
        if (drawable == null || recyclerView.getChildCount() - 1 < 0) {
            return;
        }
        int i12 = 0;
        while (true) {
            View childAt = recyclerView.getChildAt(i12);
            if (recyclerView.W(childAt).getItemViewType() == this.f310412b) {
                Rect rect = this.f310415e;
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
