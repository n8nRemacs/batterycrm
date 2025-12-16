package com.avito.android.serp.adapter.filters_tabs_chips;

import Y61.k;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: FiltersTabsChipsWidgetDecorator.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/filters_tabs_chips/h;", "LUr0/c;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h extends Ur0.c {

    /* renamed from: s, reason: collision with root package name */
    public final int f269974s;

    /* renamed from: t, reason: collision with root package name */
    public final int f269975t;

    public h(@k Resources resources, @k com.avito.konveyor.a aVar) {
        super(resources, aVar);
        this.f269974s = y6.b(22);
        this.f269975t = y6.b(6);
    }

    @Override // Ur0.c
    public final void c(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        if (!(recyclerView.W(view) instanceof f)) {
            this.f16709q = false;
            return;
        }
        rect.top = this.f269975t;
        rect.bottom = this.f269974s;
        this.f16709q = true;
    }
}
