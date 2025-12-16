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

/* compiled from: MyAdvertContactsItemDecorator.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/k;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.user_advert.advert.items.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35410k extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f309558b;

    /* renamed from: c, reason: collision with root package name */
    public final int f309559c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Rect f309560d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Drawable f309561e;

    @Inject
    public C35410k(@InterfaceC35538q @Y61.k Context context, @Y61.k Resources resources, @Y61.k com.avito.konveyor.a aVar) throws Resources.NotFoundException {
        this.f309558b = aVar.Y(com.avito.android.user_advert.advert.items.contact.b.class);
        this.f309559c = resources.getDimensionPixelOffset(R.dimen.advert_contacts_left_margin) + resources.getDimensionPixelOffset(R.dimen.content_horizontal_padding);
        this.f309561e = androidx.core.content.d.getDrawable(context, R.drawable.recycler_view_divider);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void onDraw(@Y61.k Canvas canvas, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        int childCount;
        RecyclerView.Adapter adapter;
        Drawable drawable = this.f309561e;
        if (drawable == null || recyclerView.getChildCount() - 1 < 0) {
            return;
        }
        int i12 = 0;
        while (true) {
            View childAt = recyclerView.getChildAt(i12);
            RecyclerView.C cW2 = recyclerView.W(childAt);
            int bindingAdapterPosition = cW2.getBindingAdapterPosition();
            int itemViewType = cW2.getItemViewType();
            int i13 = this.f309558b;
            if (itemViewType == i13) {
                Rect rect = this.f309560d;
                RecyclerView.Y(childAt, rect);
                int i14 = bindingAdapterPosition - 1;
                RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
                drawable.setBounds((i14 < 0 || i14 >= (adapter2 != null ? adapter2.getItemCount() : 0) || (adapter = recyclerView.getAdapter()) == null || adapter.getItemViewType(i14) != i13) ? 0 : this.f309559c, rect.top, rect.width(), drawable.getIntrinsicHeight() + rect.top);
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
