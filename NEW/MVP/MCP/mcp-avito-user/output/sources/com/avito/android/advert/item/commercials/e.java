package com.avito.android.advert.item.commercials;

import Y61.k;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.util.L0;
import kotlin.Metadata;

/* compiled from: CommercialItemDecorator.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/commercials/e;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f74327b;

    /* renamed from: c, reason: collision with root package name */
    public final int f74328c;

    /* renamed from: d, reason: collision with root package name */
    public final int f74329d;

    /* renamed from: e, reason: collision with root package name */
    public final int f74330e;

    /* renamed from: f, reason: collision with root package name */
    public final int f74331f;

    public e(int i12, @k Resources resources, @k L0 l02) {
        this.f74327b = i12;
        this.f74328c = resources.getDimensionPixelSize(R.dimen.rds_column_offset);
        this.f74329d = resources.getDimensionPixelSize(R.dimen.content_horizontal_padding);
        this.f74330e = resources.getDimensionPixelSize(R.dimen.rds_grid_row_offset) / 2;
        this.f74331f = l02.c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        RecyclerView.C cW2 = recyclerView.W(view);
        boolean z12 = cW2 instanceof com.avito.android.advertising.ui.c;
        int i12 = this.f74330e;
        if (!z12) {
            if (cW2 instanceof com.avito.android.advertising.adapter.items.avito.profile_promo_gallery.a) {
                rect.top = i12;
                rect.bottom = 0;
                rect.left = 0;
                rect.right = 0;
                return;
            }
            return;
        }
        int i13 = this.f74329d;
        rect.left = i13;
        int i14 = this.f74331f;
        float f12 = this.f74327b;
        float f13 = ((i14 * 2) / f12) - i13;
        int i15 = i14 - (i13 * 2);
        rect.right = (int) (f13 - ((((i15 - ((r2 - 1) * r7)) / f12) * 2) + this.f74328c));
        rect.top = i12;
        rect.bottom = 0;
    }
}
