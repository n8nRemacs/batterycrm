package com.avito.android.serp.adapter.vertical_main.mini_search_widget;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: MiniSearchWidgetItemDecorator.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/mini_search_widget/i;", "LUr0/c;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i extends Ur0.c {

    /* renamed from: s, reason: collision with root package name */
    public final int f273059s;

    /* renamed from: t, reason: collision with root package name */
    public final int f273060t;

    public i(@Y61.k Resources resources, @Y61.k com.avito.konveyor.a aVar) {
        super(resources, aVar);
        this.f273059s = resources.getDimensionPixelOffset(R.dimen.mini_search_widget_top_offset);
        this.f273060t = resources.getDimensionPixelOffset(R.dimen.mini_search_widget_bottom_offset);
    }

    @Override // Ur0.c
    public final void c(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        if (!(recyclerView.W(view) instanceof o)) {
            this.f16709q = false;
            return;
        }
        rect.top = this.f273059s;
        rect.bottom = this.f273060t;
        this.f16709q = true;
    }
}
