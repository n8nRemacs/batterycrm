package com.avito.android.user_advert.advert.items;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import eH0.C40005a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MyAdvertDetailsPromoBlockItemDecorator.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/t;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.user_advert.advert.items.t, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35418t extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f310325b;

    @Inject
    public C35418t(@Y61.k com.avito.konveyor.a aVar) {
        this.f310325b = aVar.Y(com.avito.android.user_advert.advert.items.promo_block_feed.b.class);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) throws Resources.NotFoundException {
        Context context;
        RecyclerView.Adapter adapter;
        RecyclerView.C cW2 = recyclerView.W(view);
        if (cW2 == null) {
            super.getItemOffsets(rect, view, recyclerView, zVar);
            return;
        }
        int itemViewType = cW2.getItemViewType();
        int i12 = this.f310325b;
        if (itemViewType != i12) {
            super.getItemOffsets(rect, view, recyclerView, zVar);
            return;
        }
        int bindingAdapterPosition = cW2.getBindingAdapterPosition();
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.promo_block_content_root);
        if (viewGroup == null || (context = viewGroup.getContext()) == null) {
            context = view.getContext();
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(C35835l0.j(R.attr.promoBlockContentTheme, context), C40005a.i.f395083a);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 0);
        int i13 = bindingAdapterPosition - 1;
        RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
        int dimensionPixelSize2 = (i13 < 0 || i13 >= (adapter2 != null ? adapter2.getItemCount() : 0) || (adapter = recyclerView.getAdapter()) == null || adapter.getItemViewType(i13) != i12) ? 0 : typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0);
        typedArrayObtainStyledAttributes.recycle();
        rect.set(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, 0);
    }
}
