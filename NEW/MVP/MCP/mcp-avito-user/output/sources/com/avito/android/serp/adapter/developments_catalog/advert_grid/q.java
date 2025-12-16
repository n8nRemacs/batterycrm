package com.avito.android.serp.adapter.developments_catalog.advert_grid;

import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.model.GeoReference;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DevelopmentItemMainGridView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/developments_catalog/advert_grid/q;", "Lcom/avito/android/serp/adapter/developments_catalog/advert_grid/n;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class q extends n {

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f269848l;

    public q(@Y61.k View view, @Y61.k com.avito.android.connection_quality.connectivity.a aVar) {
        super(view, aVar);
        View viewFindViewById = view.findViewById(R.id.metro);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f269848l = (LinearLayout) viewFindViewById;
    }

    @Override // com.avito.android.serp.adapter.developments_catalog.advert_grid.n, com.avito.android.serp.adapter.developments_catalog.advert_grid.m
    public final void B40(@Y61.l GeoReference geoReference) {
        int i12;
        LinearLayout linearLayout = this.f269848l;
        linearLayout.removeAllViews();
        if (geoReference != null) {
            i12 = 0;
            new os0.c(linearLayout, false, 2, null).b(geoReference);
        } else {
            i12 = 8;
        }
        linearLayout.setVisibility(i12);
    }
}
