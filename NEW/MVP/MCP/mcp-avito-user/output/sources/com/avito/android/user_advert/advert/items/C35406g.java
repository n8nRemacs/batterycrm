package com.avito.android.user_advert.advert.items;

import android.content.Context;
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

/* compiled from: MyAdvertAnonNumberItemDecorator.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/g;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.user_advert.advert.items.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35406g extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f309405b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Rect f309406c = new Rect();

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Drawable f309407d;

    @Inject
    public C35406g(@Y61.k com.avito.konveyor.a aVar, @InterfaceC35538q @Y61.k Context context) {
        this.f309405b = aVar.Y(com.avito.android.user_advert.advert.items.anon_number.b.class);
        this.f309407d = androidx.core.content.d.getDrawable(context, R.drawable.recycler_view_divider);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void onDraw(@Y61.k Canvas canvas, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        int childCount;
        Drawable drawable = this.f309407d;
        if (drawable == null || recyclerView.getChildCount() - 1 < 0) {
            return;
        }
        int i12 = 0;
        while (true) {
            View childAt = recyclerView.getChildAt(i12);
            if (recyclerView.W(childAt).getItemViewType() == this.f309405b) {
                Rect rect = this.f309406c;
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
