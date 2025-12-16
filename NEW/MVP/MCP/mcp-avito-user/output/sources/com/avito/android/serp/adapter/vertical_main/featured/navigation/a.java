package com.avito.android.serp.adapter.vertical_main.featured.navigation;

import Ur0.c;
import Y61.k;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.serp.adapter.vertical_main.featured.navigation.tabs.h;
import kotlin.Metadata;

/* compiled from: FeaturedTabsDecorator.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/featured/navigation/a;", "LUr0/c;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a extends c {

    /* renamed from: s, reason: collision with root package name */
    public final int f272897s;

    /* renamed from: t, reason: collision with root package name */
    public final int f272898t;

    /* renamed from: u, reason: collision with root package name */
    public final int f272899u;

    /* renamed from: v, reason: collision with root package name */
    public final int f272900v;

    public a(@k Resources resources, @k com.avito.konveyor.a aVar) {
        super(resources, aVar);
        this.f272897s = resources.getDimensionPixelSize(R.dimen.serp_vertical_featured_tabs_top_margin);
        this.f272898t = resources.getDimensionPixelSize(R.dimen.serp_vertical_featured_tabs_bottom_margin);
        this.f272899u = resources.getDimensionPixelSize(R.dimen.serp_vertical_featured_chips_bottom_margin);
        this.f272900v = resources.getDimensionPixelSize(R.dimen.serp_vertical_featured_chips_horizontal_margin);
    }

    @Override // Ur0.c
    public final void c(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        RecyclerView.C cW2 = recyclerView.W(view);
        if (cW2 instanceof h) {
            rect.top = this.f272897s;
            rect.bottom = this.f272898t;
            this.f16709q = true;
        } else {
            if (!(cW2 instanceof com.avito.android.serp.adapter.vertical_main.featured.navigation.chips.h)) {
                this.f16709q = false;
                return;
            }
            rect.bottom = this.f272899u;
            int i12 = this.f272900v;
            rect.left = i12;
            rect.right = i12;
            this.f16709q = true;
        }
    }
}
