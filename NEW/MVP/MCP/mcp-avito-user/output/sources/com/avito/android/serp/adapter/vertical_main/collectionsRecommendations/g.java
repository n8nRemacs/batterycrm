package com.avito.android.serp.adapter.vertical_main.collectionsRecommendations;

import Oi0.C14700d;
import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.serp.adapter.vertical_main.collectionsRecommendations.item.CollectionsRecommendationItem;
import com.avito.konveyor.adapter.h;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CollectionsRecommendationWidgetView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/collectionsRecommendations/g;", "Lcom/avito/konveyor/adapter/b;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g extends com.avito.konveyor.adapter.b {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h f272712b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C14700d f272713c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f272714d;

    /* renamed from: e, reason: collision with root package name */
    public final Badge f272715e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ArrayList f272716f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final UV0.c<CollectionsRecommendationItem> f272717g;

    public g(@k View view, @k h hVar, @k C14700d c14700d) {
        super(view);
        this.f272712b = hVar;
        this.f272713c = c14700d;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.collections);
        this.f272714d = (TextView) view.findViewById(R.id.title);
        this.f272715e = (Badge) view.findViewById(R.id.badge);
        ArrayList arrayList = new ArrayList();
        this.f272716f = arrayList;
        this.f272717g = new UV0.c<>(arrayList);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        c14700d.setHasStableIds(true);
        recyclerView.setAdapter(c14700d);
        recyclerView.l(new IO.d(0, recyclerView.getResources().getDimensionPixelSize(R.dimen.collections_recommendation_item_side_half_padding), 0, 0, recyclerView.getResources().getDimensionPixelSize(R.dimen.collections_recommendation_item_side_padding), recyclerView.getResources().getDimensionPixelSize(R.dimen.collections_recommendation_item_side_padding), 13, null), -1);
    }
}
