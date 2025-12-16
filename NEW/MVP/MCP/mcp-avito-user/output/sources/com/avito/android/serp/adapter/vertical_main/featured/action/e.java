package com.avito.android.serp.adapter.vertical_main.featured.action;

import Ur0.c;
import Y61.k;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: FeaturedActionDecorator.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/featured/action/e;", "LUr0/c;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e extends Ur0.c {

    /* renamed from: s, reason: collision with root package name */
    public final int f272820s;

    /* renamed from: t, reason: collision with root package name */
    public final int f272821t;

    /* renamed from: u, reason: collision with root package name */
    public final int f272822u;

    public e(@k Resources resources, @k com.avito.konveyor.a aVar) throws Resources.NotFoundException {
        super(resources, aVar);
        resources.getDimensionPixelSize(R.dimen.serp_vm_horizontal_padding);
        this.f272820s = resources.getDimensionPixelSize(R.dimen.serp_horizontal_padding);
        this.f272821t = resources.getDimensionPixelSize(R.dimen.serp_vertical_featured_action_top_margin);
        this.f272822u = resources.getDimensionPixelSize(R.dimen.serp_vertical_margin_for_widget_with_button);
    }

    @Override // Ur0.c
    public final void c(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        if (recyclerView.W(view) instanceof i) {
            int i12 = -this.f272820s;
            rect.left = i12;
            rect.right = i12;
            rect.top = this.f272821t;
            rect.bottom = this.f272822u;
            this.f16709q = true;
        } else {
            this.f16709q = false;
        }
        e(c.a.C1153a.f16711a);
    }
}
