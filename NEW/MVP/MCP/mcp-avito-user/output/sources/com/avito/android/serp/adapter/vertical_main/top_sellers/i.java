package com.avito.android.serp.adapter.vertical_main.top_sellers;

import Oi0.C14700d;
import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.serp.adapter.vertical_main.top_sellers.top_sellers_list.TopSellerItem;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.m;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: TopSellersWidgetView.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/top_sellers/i;", "Lcom/avito/konveyor/adapter/b;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i extends com.avito.konveyor.adapter.b {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.h f273254b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C14700d f273255c;

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f273256d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f273257e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ArrayList f273258f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final UV0.c<TopSellerItem> f273259g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final com.avito.android.lib.util.recycler_wrap_height_calculator.c f273260h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public m f273261i;

    public i(@k View view, @k com.avito.konveyor.adapter.h hVar, @k C14700d c14700d) {
        super(view);
        this.f273254b = hVar;
        this.f273255c = c14700d;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.top_sellers_list);
        this.f273256d = recyclerView;
        this.f273257e = (TextView) view.findViewById(R.id.top_sellers_title);
        ArrayList arrayList = new ArrayList();
        this.f273258f = arrayList;
        this.f273259g = new UV0.c<>(arrayList);
        this.f273260h = new com.avito.android.lib.util.recycler_wrap_height_calculator.c();
        view.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setHasFixedSize(true);
        c14700d.setHasStableIds(true);
        recyclerView.setAdapter(c14700d);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        m mVar = this.f273261i;
        if (mVar != null) {
            DisposableHelper.a(mVar);
        }
    }
}
