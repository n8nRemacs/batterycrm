package com.avito.android.serp.adapter.brandspace_widget;

import Ur0.c;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: BrandspaceWidgetItemDecorator.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/brandspace_widget/h;", "LUr0/c;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h extends Ur0.c {

    /* renamed from: s, reason: collision with root package name */
    public final int f269051s;

    /* renamed from: t, reason: collision with root package name */
    public final int f269052t;

    public h(@Y61.k Resources resources, @Y61.k com.avito.konveyor.a aVar) {
        super(resources, aVar);
        this.f269051s = resources.getDimensionPixelSize(R.dimen.serp_vertical_margin_for_widget_with_background);
        this.f269052t = y6.b(10);
    }

    @Override // Ur0.c
    public final void c(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        if (recyclerView.W(view) instanceof q) {
            int i12 = this.f269052t;
            rect.left = i12;
            int i13 = this.f269051s;
            rect.top = i13;
            rect.right = i12;
            rect.bottom = i13;
            this.f16709q = true;
        } else {
            this.f16709q = false;
        }
        e(c.a.C1153a.f16711a);
    }
}
