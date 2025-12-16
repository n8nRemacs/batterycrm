package com.avito.android.user_advert.advert.items;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.user_advert.di.InterfaceC35538q;
import com.avito.android.util.C35835l0;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.s0;

/* compiled from: MyAdvertFooterItemDecorator.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/B;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class B extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Set<Integer> f308952b;

    /* renamed from: c, reason: collision with root package name */
    public final int f308953c;

    /* renamed from: d, reason: collision with root package name */
    public final int f308954d;

    /* renamed from: e, reason: collision with root package name */
    public final int f308955e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Rect f308956f = new Rect();

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ColorDrawable f308957g;

    @Inject
    public B(@InterfaceC35538q @Y61.k Context context, @Y61.k Resources resources, @Y61.k com.avito.konveyor.a aVar) {
        this.f308952b = C42756l.l0(new Integer[]{Integer.valueOf(aVar.Y(com.avito.android.user_advert.advert.items.ttl.b.class)), Integer.valueOf(aVar.Y(com.avito.android.user_advert.advert.items.number.b.class))});
        this.f308953c = resources.getDimensionPixelOffset(R.dimen.my_advert_footer_top_offset);
        this.f308954d = resources.getDimensionPixelOffset(R.dimen.my_advert_footer_between_item_offset);
        this.f308955e = resources.getDimensionPixelOffset(R.dimen.my_advert_footer_bottom_offset);
        this.f308957g = new ColorDrawable(C35835l0.d(R.attr.gray8, context));
    }

    public final boolean c(int i12, RecyclerView recyclerView) {
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        if (i12 < 0 || i12 >= itemCount) {
            return false;
        }
        Set<Integer> set = this.f308952b;
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
        if (this.f308952b.contains(Integer.valueOf(cW2.getItemViewType()))) {
            rect.set(0, c(bindingAdapterPosition + (-1), recyclerView) ? this.f308954d : this.f308953c, 0, c(bindingAdapterPosition + 1, recyclerView) ? 0 : this.f308955e);
        } else {
            super.getItemOffsets(rect, view, recyclerView, zVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void onDraw(@Y61.k Canvas canvas, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        int childCount = recyclerView.getChildCount() - 1;
        if (childCount < 0) {
            return;
        }
        int i12 = 0;
        while (true) {
            View childAt = recyclerView.getChildAt(i12);
            if (this.f308952b.contains(Integer.valueOf(recyclerView.W(childAt).getItemViewType()))) {
                Rect rect = this.f308956f;
                RecyclerView.Y(childAt, rect);
                ColorDrawable colorDrawable = this.f308957g;
                colorDrawable.setBounds(rect);
                colorDrawable.draw(canvas);
            }
            if (i12 == childCount) {
                return;
            } else {
                i12++;
            }
        }
    }
}
