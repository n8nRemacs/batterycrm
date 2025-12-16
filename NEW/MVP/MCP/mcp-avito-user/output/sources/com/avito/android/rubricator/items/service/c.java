package com.avito.android.rubricator.items.service;

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

/* compiled from: SerpRubricatorServiceItemDecorator.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rubricator/items/service/c;", "LUr0/c;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c extends Ur0.c {

    /* renamed from: s, reason: collision with root package name */
    public final int f255815s;

    /* renamed from: t, reason: collision with root package name */
    public final int f255816t;

    /* renamed from: u, reason: collision with root package name */
    public final int f255817u;

    /* renamed from: v, reason: collision with root package name */
    public final int f255818v;

    /* renamed from: w, reason: collision with root package name */
    public final int f255819w;

    /* renamed from: x, reason: collision with root package name */
    public final int f255820x;

    public c(@k Resources resources, @k com.avito.konveyor.a aVar) throws Resources.NotFoundException {
        super(resources, aVar);
        this.f255815s = resources.getDimensionPixelOffset(R.dimen.serp_rubricator_services_top_margin_without_filters_item_before);
        this.f255816t = resources.getDimensionPixelOffset(R.dimen.serp_rubricator_services_top_margin_with_filters_item_before);
        resources.getDimensionPixelSize(R.dimen.serp_vm_horizontal_padding);
        this.f255817u = resources.getDimensionPixelSize(R.dimen.serp_horizontal_padding);
        this.f255818v = resources.getDimensionPixelOffset(R.dimen.serp_rubricator_services_bottom_padding);
        this.f255819w = y6.b(8);
        this.f255820x = aVar.Y(com.avito.android.serp.adapter.vertical_main.vertical_filter.item.a.class);
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
        if (!(cW2 instanceof com.avito.android.rubricator.h) || ((com.avito.android.rubricator.h) cW2).getF255753m() != Type.f255699c) {
            this.f16709q = false;
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == this.f255820x) {
            rect.top = this.f255816t;
        } else {
            rect.top = this.f255815s;
        }
        int i12 = -this.f255817u;
        rect.left = i12;
        int i13 = this.f255819w;
        rect.top = i13;
        rect.right = i12;
        rect.bottom = i13 + this.f255818v;
        this.f16709q = true;
    }
}
