package com.avito.android.serp.adapter.sale;

import Ur0.c;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: SaleHeaderItemDecorator.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/sale/g;", "LUr0/c;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g extends Ur0.c {

    /* renamed from: s, reason: collision with root package name */
    public final int f271496s;

    /* renamed from: t, reason: collision with root package name */
    public final int f271497t;

    /* renamed from: u, reason: collision with root package name */
    public final int f271498u;

    /* renamed from: v, reason: collision with root package name */
    public final int f271499v;

    public g(@Y61.k Resources resources, @Y61.k com.avito.konveyor.a aVar) throws Resources.NotFoundException {
        super(resources, aVar);
        resources.getDimensionPixelSize(R.dimen.serp_vm_horizontal_padding);
        this.f271496s = resources.getDimensionPixelSize(R.dimen.serp_horizontal_padding);
        this.f271497t = resources.getDimensionPixelSize(R.dimen.serp_vertical_margin_for_widget_with_background);
        this.f271498u = resources.getDimensionPixelSize(R.dimen.redesign_toolbar_search_view_height);
        this.f271499v = resources.getDimensionPixelSize(R.dimen.serp_sale_item_padding_overlap);
    }

    @Override // Ur0.c
    public final void c(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        if (recyclerView.W(view) instanceof l) {
            int paddingTop = recyclerView.getPaddingTop() - this.f271498u;
            int i12 = -this.f271496s;
            rect.left = i12;
            rect.right = i12;
            rect.top = (-paddingTop) - this.f271499v;
            rect.bottom = this.f271497t;
            this.f16709q = true;
        } else {
            this.f16709q = false;
        }
        e(c.a.C1153a.f16711a);
    }
}
