package com.avito.android.serp.adapter.vertical_main.usp_banner_widget;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: UspBannersWidgetDecorator.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/usp_banner_widget/f;", "LUr0/c;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f extends Ur0.c {

    /* renamed from: s, reason: collision with root package name */
    public final int f273349s;

    /* renamed from: t, reason: collision with root package name */
    public final int f273350t;

    public f(@Y61.k Resources resources, @Y61.k com.avito.konveyor.a aVar) {
        super(resources, aVar);
        this.f273349s = resources.getDimensionPixelSize(R.dimen.usp_banner_item_vertical_margin);
        this.f273350t = resources.getDimensionPixelSize(R.dimen.usp_banner_item_vertical_margin);
    }

    @Override // Ur0.c
    public final void c(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        if (!(recyclerView.W(view) instanceof l)) {
            this.f16709q = false;
            return;
        }
        rect.top = this.f273350t;
        rect.bottom = this.f273349s;
        this.f16709q = true;
    }
}
