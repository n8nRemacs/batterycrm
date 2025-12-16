package com.avito.android.serp.adapter.vertical_main.vertical_filter;

import Ur0.c;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: VerticalFilterItemDecorator.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/vertical_filter/s;", "LUr0/c;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class s extends Ur0.c {

    /* renamed from: s, reason: collision with root package name */
    public final int f273572s;

    /* renamed from: t, reason: collision with root package name */
    public final int f273573t;

    public s(@Y61.k Resources resources, @Y61.k com.avito.konveyor.a aVar) throws Resources.NotFoundException {
        super(resources, aVar);
        resources.getDimensionPixelSize(R.dimen.serp_vm_horizontal_padding);
        this.f273572s = resources.getDimensionPixelSize(R.dimen.serp_horizontal_padding);
        this.f273573t = resources.getDimensionPixelSize(R.dimen.serp_vertical_margin_for_widget_with_background);
    }

    @Override // Ur0.c
    public final void c(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        int iU2 = RecyclerView.U(view);
        int i12 = this.f273573t;
        int iB2 = iU2 == 0 ? y6.b(4) : i12;
        if (recyclerView.W(view) instanceof com.avito.android.serp.adapter.vertical_main.vertical_filter.item.f) {
            int i13 = -this.f273572s;
            rect.left = i13;
            rect.right = i13;
            rect.top = iB2;
            rect.bottom = i12;
            this.f16709q = true;
        } else {
            this.f16709q = false;
        }
        e(c.a.C1153a.f16711a);
    }
}
