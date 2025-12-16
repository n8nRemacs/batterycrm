package com.avito.android.rubricator.items.category;

import Y61.k;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.rubricator.Type;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: SerpRubricatorCategoryItemDecorator.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rubricator/items/category/d;", "LUr0/c;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d extends Ur0.c {

    /* renamed from: s, reason: collision with root package name */
    public final int f255784s;

    /* renamed from: t, reason: collision with root package name */
    public final int f255785t;

    /* renamed from: u, reason: collision with root package name */
    public final int f255786u;

    /* renamed from: v, reason: collision with root package name */
    public final int f255787v;

    public d(@k Resources resources, @k com.avito.konveyor.a aVar) {
        super(resources, aVar);
        this.f255784s = resources.getDimensionPixelOffset(R.dimen.serp_rubricator_categories_top_margin_without_filters_item_before);
        this.f255785t = resources.getDimensionPixelOffset(R.dimen.serp_rubricator_categories_top_margin_with_filters_item_before);
        this.f255786u = aVar.Y(com.avito.android.serp.adapter.vertical_main.vertical_filter.item.a.class);
        this.f255787v = y6.b(28);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Ur0.c
    public final void c(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        RecyclerView.Adapter adapter;
        RecyclerView.C cW2 = recyclerView.W(view);
        Integer numValueOf = null;
        if (cW2.getAdapterPosition() > 0 && cW2.getAdapterPosition() < zVar.b() && (adapter = recyclerView.getAdapter()) != null) {
            numValueOf = Integer.valueOf(adapter.getItemViewType(cW2.getAdapterPosition() - 1));
        }
        if (!(cW2 instanceof com.avito.android.rubricator.h) || ((com.avito.android.rubricator.h) cW2).getF255753m() != Type.f255698b) {
            this.f16709q = false;
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == this.f255786u) {
            rect.top = this.f255785t;
        } else {
            rect.top = this.f255784s;
        }
        rect.bottom = this.f255787v;
        this.f16709q = true;
    }
}
