package com.avito.android.advert.item.beduin.v2;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.advert.item.beduin.v2.g;
import com.avito.android.util.L0;
import com.avito.android.util.q6;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsBeduinItemDecorator.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/beduin/v2/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f73277b;

    /* renamed from: c, reason: collision with root package name */
    public final int f73278c = y6.b(16);

    /* renamed from: d, reason: collision with root package name */
    public final int f73279d;

    /* renamed from: e, reason: collision with root package name */
    public final int f73280e;

    /* renamed from: f, reason: collision with root package name */
    public final int f73281f;

    /* renamed from: g, reason: collision with root package name */
    public final int f73282g;

    public a(int i12, @Y61.k Resources resources, @Y61.k L0 l02) {
        this.f73277b = i12;
        this.f73279d = resources.getDimensionPixelSize(R.dimen.rds_column_offset);
        this.f73280e = resources.getDimensionPixelSize(R.dimen.content_horizontal_padding);
        this.f73281f = resources.getDimensionPixelSize(R.dimen.rds_grid_row_offset) / 2;
        this.f73282g = l02.c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        View view2;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        Object tag = (viewGroup == null || (view2 = (View) C42745f0.F(new q6(viewGroup))) == null) ? null : view2.getTag();
        g.b bVar = tag instanceof g.b ? (g.b) tag : null;
        if (bVar == null || !(bVar.f73353b instanceof com.avito.android.advertising.ui.c)) {
            return;
        }
        int i12 = this.f73280e;
        int i13 = i12 - this.f73278c;
        rect.left = i13;
        int i14 = this.f73282g - (i12 * 2);
        int i15 = this.f73277b;
        int i16 = this.f73279d;
        rect.right = (i13 + i14) - ((((i14 - ((i15 - 1) * i16)) / i15) * 2) + i16);
        rect.top = this.f73281f;
        rect.bottom = 0;
    }
}
