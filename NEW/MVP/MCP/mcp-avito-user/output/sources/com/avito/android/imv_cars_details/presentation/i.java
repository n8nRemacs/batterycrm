package com.avito.android.imv_cars_details.presentation;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.progress_overlay.l;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: ImvCarsDetailsView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/imv_cars_details/presentation/i;", "", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final TextView f170041a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.j f170042b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f170043c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final l f170044d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f170045e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public List<? extends com.avito.conveyor_item.a> f170046f;

    public i(@Y61.k View view, @Y61.k TextView textView, @Y61.k com.avito.konveyor.adapter.j jVar, @Y61.k com.avito.konveyor.adapter.a aVar) {
        this.f170041a = textView;
        this.f170042b = jVar;
        this.f170043c = aVar;
        this.f170044d = new l((ViewGroup) view, 0, null, 0, 0, 30, null);
        View viewFindViewById = view.findViewById(R.id.imv_cars_details_list);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f170045e = recyclerView;
        this.f170046f = C42784z0.f406748b;
        recyclerView.setAdapter(jVar);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
    }
}
