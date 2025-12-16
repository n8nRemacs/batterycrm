package com.avito.android.search.filter;

import com.avito.android.remote.model.CategoryIds;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.search_ux_feedback.SearchFeedbackCampaign;
import kotlin.Metadata;

/* compiled from: FiltersPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "invoke", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class X0 extends kotlin.jvm.internal.N implements Y41.l<kotlin.G0, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C34574h0 f261913l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X0(C34574h0 c34574h0) {
        super(1);
        this.f261913l = c34574h0;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(kotlin.G0 g02) {
        C34574h0 c34574h0 = this.f261913l;
        SearchParams searchParamsF = c34574h0.f263329a.f();
        String categoryId = searchParamsF.getCategoryId();
        boolean zF2 = kotlin.jvm.internal.L.f(categoryId, CategoryIds.AUTO.WATER.getId());
        Rp0.b bVar = c34574h0.f263351s;
        if (zF2) {
            bVar.a(SearchFeedbackCampaign.h.f264407b);
        } else if (kotlin.jvm.internal.L.f(categoryId, CategoryIds.AUTO.MOTO.getId())) {
            bVar.a(SearchFeedbackCampaign.c.f264405b);
        }
        bVar.a(new SearchFeedbackCampaign.a(categoryId, null));
        c34574h0.f263352t.a(searchParamsF);
        return kotlin.G0.f406611a;
    }
}
