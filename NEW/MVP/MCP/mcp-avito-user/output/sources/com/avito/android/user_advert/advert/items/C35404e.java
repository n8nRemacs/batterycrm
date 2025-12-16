package com.avito.android.user_advert.advert.items;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MyAdvertAddressItemDecorator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/e;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.user_advert.advert.items.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35404e extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f309369b;

    /* renamed from: c, reason: collision with root package name */
    public final int f309370c;

    @Inject
    public C35404e(@Y61.k Resources resources, @Y61.k com.avito.konveyor.a aVar) {
        this.f309369b = resources.getDimensionPixelOffset(R.dimen.my_advert_address_item_vertical_margin);
        this.f309370c = aVar.Y(com.avito.android.user_advert.advert.items.address.b.class);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        RecyclerView.C cW2 = recyclerView.W(view);
        if (cW2 == null) {
            super.getItemOffsets(rect, view, recyclerView, zVar);
        } else if (cW2.getItemViewType() != this.f309370c) {
            super.getItemOffsets(rect, view, recyclerView, zVar);
        } else {
            int i12 = this.f309369b;
            rect.set(0, i12, 0, i12);
        }
    }
}
