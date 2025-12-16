package com.avito.android.serp.adapter.vertical_main.featured.header;

import Y61.k;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: FeaturedHeaderDecorator.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/featured/header/d;", "LUr0/c;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d extends Ur0.c {

    /* renamed from: s, reason: collision with root package name */
    public final int f272865s;

    /* renamed from: t, reason: collision with root package name */
    public final int f272866t;

    /* renamed from: u, reason: collision with root package name */
    public final int f272867u;

    public d(@k Resources resources, @k com.avito.konveyor.a aVar) throws Resources.NotFoundException {
        super(resources, aVar);
        this.f272865s = resources.getDimensionPixelSize(R.dimen.serp_vertical_featured_header_bottom_margin);
        this.f272866t = resources.getDimensionPixelSize(R.dimen.serp_vertical_margin_for_widget_default);
        resources.getDimensionPixelSize(R.dimen.serp_featured_header_vertical_main_side_padding);
        this.f272867u = resources.getDimensionPixelSize(R.dimen.serp_featured_header_default_side_padding);
    }

    @Override // Ur0.c
    public final void c(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        if (!(recyclerView.W(view) instanceof h)) {
            this.f16709q = false;
            return;
        }
        rect.top = this.f272866t;
        rect.bottom = this.f272865s;
        int i12 = this.f272867u;
        rect.left = i12;
        rect.right = i12;
        this.f16709q = true;
    }
}
