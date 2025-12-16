package com.avito.android.campaigns_sale_search;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.campaigns_sale_search.CampaignsSaleSearchFragment;
import kotlin.Metadata;
import um.b;
import um.g;

/* compiled from: CampaignsSaleSearchFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/campaigns_sale_search/k;", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class k extends RecyclerView.r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ um.g f114558b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CampaignsSaleSearchFragment f114559c;

    public k(um.g gVar, CampaignsSaleSearchFragment campaignsSaleSearchFragment) {
        this.f114558b = gVar;
        this.f114559c = campaignsSaleSearchFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void k(@Y61.k RecyclerView recyclerView, int i12, int i13) {
        RecyclerView.Adapter adapter;
        RecyclerView.m layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null && (adapter = recyclerView.getAdapter()) != null && adapter.getItemCount() - linearLayoutManager.M1() <= 5 && ((g.e) this.f114558b).f440275b) {
            CampaignsSaleSearchFragment.a aVar = CampaignsSaleSearchFragment.f114473A0;
            this.f114559c.v5().accept(b.r.f440249a);
        }
    }
}
