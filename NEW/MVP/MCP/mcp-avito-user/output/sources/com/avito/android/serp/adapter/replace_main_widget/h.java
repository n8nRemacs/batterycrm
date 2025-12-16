package com.avito.android.serp.adapter.replace_main_widget;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: ReplaceMainWidgetDecorator.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/replace_main_widget/h;", "LUr0/c;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h extends Ur0.c {

    /* renamed from: s, reason: collision with root package name */
    public final int f270688s;

    public h(@Y61.k Resources resources, @Y61.k com.avito.konveyor.a aVar) {
        super(resources, aVar);
        this.f270688s = resources.getDimensionPixelSize(R.dimen.serp_vertical_margin_for_widget_with_background);
    }

    @Override // Ur0.c
    public final void c(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        if (!(recyclerView.W(view) instanceof a)) {
            this.f16709q = false;
            return;
        }
        int i12 = this.f270688s;
        rect.left = i12;
        rect.right = i12;
        rect.bottom = y6.b(34);
        this.f16709q = true;
    }
}
