package com.avito.android.serp.adapter.vertical_main.sellers_carousel.with_reviews;

import Oi0.C14700d;
import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.serp.adapter.vertical_main.sellers_carousel.sellers_list.SellerItem;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: SellersCarouselWithReviewsWidgetView.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/sellers_carousel/with_reviews/e;", "Lcom/avito/konveyor/adapter/b;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e extends com.avito.konveyor.adapter.b {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.a f273206b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C14700d f273207c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f273208d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ArrayList f273209e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final UV0.c<SellerItem> f273210f;

    public e(@k View view, @k com.avito.konveyor.adapter.a aVar, @k C14700d c14700d) {
        super(view);
        this.f273206b = aVar;
        this.f273207c = c14700d;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.sellers_carousel_list);
        this.f273208d = (TextView) view.findViewById(R.id.sellers_carousel_title);
        ArrayList arrayList = new ArrayList();
        this.f273209e = arrayList;
        this.f273210f = new UV0.c<>(arrayList);
        view.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(c14700d);
    }
}
