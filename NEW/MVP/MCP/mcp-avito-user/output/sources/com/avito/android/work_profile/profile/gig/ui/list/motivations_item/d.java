package com.avito.android.work_profile.profile.gig.ui.list.motivations_item;

import Y41.l;
import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.promo_snippet.PromoSnippetList;
import com.avito.android.promo_snippet.PromoSnippetListState;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: GigMotivationsPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/work_profile/profile/gig/ui/list/motivations_item/d;", "LTV0/d;", "Lcom/avito/android/work_profile/profile/gig/ui/list/motivations_item/a;", "Lcom/avito/android/promo_snippet/PromoSnippetListState;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d implements TV0.d<a, PromoSnippetListState> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<DeepLink, G0> f331231b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public d(@k l<? super DeepLink, G0> lVar) {
        this.f331231b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        PromoSnippetList promoSnippetList = ((a) eVar).f331226b;
        promoSnippetList.setOnButtonClickListener(this.f331231b);
        promoSnippetList.setState((PromoSnippetListState) aVar);
    }
}
