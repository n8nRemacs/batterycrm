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

/* compiled from: MyAdvertServiceEducationDecorator.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/Z;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Z extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f308998b;

    /* renamed from: c, reason: collision with root package name */
    public final int f308999c;

    /* renamed from: d, reason: collision with root package name */
    public final int f309000d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Rect f309001e = new Rect();

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Drawable f309002f;

    @Inject
    public Z(@InterfaceC35538q @Y61.k Context context, @Y61.k Resources resources, @Y61.k com.avito.konveyor.a aVar) {
        this.f308998b = resources.getDimensionPixelSize(R.dimen.my_advert_service_education_offset_top);
        this.f308999c = resources.getDimensionPixelSize(R.dimen.my_advert_service_education_offset_bottom);
        this.f309000d = aVar.Y(com.avito.android.advert_core.service_education.a.class);
        this.f309002f = androidx.core.content.d.getDrawable(context, R.drawable.recycler_view_divider);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        RecyclerView.Adapter adapter;
        RecyclerView.C cW2 = recyclerView.W(view);
        if (cW2 == null) {
            super.getItemOffsets(rect, view, recyclerView, zVar);
            return;
        }
        int bindingAdapterPosition = cW2.getBindingAdapterPosition();
        int itemViewType = cW2.getItemViewType();
        int i12 = this.f309000d;
        if (itemViewType != i12) {
            super.getItemOffsets(rect, view, recyclerView, zVar);
            return;
        }
        int i13 = bindingAdapterPosition + 1;
        RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
        rect.set(0, this.f308998b, 0, (i13 < 0 || i13 >= (adapter2 != null ? adapter2.getItemCount() : 0) || (adapter = recyclerView.getAdapter()) == null || adapter.getItemViewType(i13) != i12) ? this.f308999c : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void onDrawOver(@Y61.k Canvas canvas, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        int childCount;
        Drawable drawable = this.f309002f;
        if (drawable == null || recyclerView.getChildCount() - 1 < 0) {
            return;
        }
        int i12 = 0;
        while (true) {
            View childAt = recyclerView.getChildAt(i12);
            if (recyclerView.W(childAt).getItemViewType() == this.f309000d) {
                Rect rect = this.f309001e;
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
