package com.avito.android.service_order_map.serviceordermap.suggests;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: ServiceOrderMapSuggestionsAdapter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_order_map/serviceordermap/suggests/a;", "Landroidx/recyclerview/widget/RecyclerView$C;", "_avito_service-order-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a extends RecyclerView.C {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f278818b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f278819c;

    public a(@k View view) {
        super(view);
        this.f278818b = (TextView) view.findViewById(R.id.text_view);
        this.f278819c = (TextView) view.findViewById(R.id.subtext_view);
    }
}
