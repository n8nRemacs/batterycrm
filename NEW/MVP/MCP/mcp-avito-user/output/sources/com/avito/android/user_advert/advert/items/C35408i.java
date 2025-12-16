package com.avito.android.user_advert.advert.items;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.util.y6;
import d70.InterfaceC39525a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MyAdvertBannerItemDecorator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/i;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.user_advert.advert.items.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35408i extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f309483b;

    /* renamed from: c, reason: collision with root package name */
    public final int f309484c = y6.b(10);

    /* renamed from: d, reason: collision with root package name */
    public final int f309485d = y6.b(20);

    @Inject
    public C35408i(@Y61.k com.avito.konveyor.a aVar) {
        this.f309483b = aVar.Y(InterfaceC39525a.class);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        RecyclerView.C cW2 = recyclerView.W(view);
        if (cW2 == null) {
            super.getItemOffsets(rect, view, recyclerView, zVar);
        } else {
            if (cW2.getItemViewType() != this.f309483b) {
                super.getItemOffsets(rect, view, recyclerView, zVar);
                return;
            }
            int i12 = this.f309484c;
            int i13 = this.f309485d;
            rect.set(i12, i13, i12, i13);
        }
    }
}
