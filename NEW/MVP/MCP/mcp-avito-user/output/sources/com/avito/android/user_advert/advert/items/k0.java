package com.avito.android.user_advert.advert.items;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.util.y6;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: VerificationBannerItemDecorator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/k0;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class k0 extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f309562b;

    /* renamed from: c, reason: collision with root package name */
    public final int f309563c;

    @Inject
    public k0(@Y61.k Resources resources, @Y61.k com.avito.konveyor.a aVar) {
        this.f309562b = aVar.Y(com.avito.android.verification.list_items.verification_status.b.class);
        this.f309563c = resources.getDimensionPixelOffset(R.dimen.verification_banner_top_margin);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        RecyclerView.C cW2 = recyclerView.W(view);
        if (cW2 == null) {
            super.getItemOffsets(rect, view, recyclerView, zVar);
        } else {
            if (cW2.getItemViewType() != this.f309562b) {
                super.getItemOffsets(rect, view, recyclerView, zVar);
                return;
            }
            rect.set(y6.b(10), this.f309563c, y6.b(10), 0);
        }
    }
}
