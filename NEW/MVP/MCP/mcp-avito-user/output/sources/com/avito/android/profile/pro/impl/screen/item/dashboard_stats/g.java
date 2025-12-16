package com.avito.android.profile.pro.impl.screen.item.dashboard_stats;

import Y41.l;
import Y61.k;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ProfileProStatsView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/dashboard_stats/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/profile/pro/impl/screen/item/dashboard_stats/f;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f223172b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final RecyclerView f223173c;

    public g(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f223172b = aVar;
        this.f223173c = (RecyclerView) view.findViewById(R.id.rv_dashboard_stats);
    }

    @Override // com.avito.android.profile.pro.impl.screen.item.dashboard_stats.f
    public final void U00(@k ProfileProStatsItem profileProStatsItem, @k l<? super D90.a, G0> lVar) {
        RecyclerView recyclerView = this.f223173c;
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setAdapter(new h(lVar, this.f223172b, profileProStatsItem.f223151c));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
    }
}
