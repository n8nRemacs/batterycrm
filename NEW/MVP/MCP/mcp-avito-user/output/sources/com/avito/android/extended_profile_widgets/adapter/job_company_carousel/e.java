package com.avito.android.extended_profile_widgets.adapter.job_company_carousel;

import Y41.l;
import Y61.k;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.avito.android.di.B;
import com.avito.android.lib.design.page_indicator_re23.PageIndicatorRe23;
import com.avito.android.serp.adapter.AdvertItem;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: JobCompanyCarouselPresenter.kt */
@B
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/job_company_carousel/e;", "LTV0/d;", "Lcom/avito/android/extended_profile_widgets/adapter/job_company_carousel/g;", "Lcom/avito/android/extended_profile_widgets/adapter/job_company_carousel/JobCompanyCarouselItem;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e implements TV0.d<g, JobCompanyCarouselItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<oB.k, G0> f154500b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super oB.k, G0> lVar) {
        this.f154500b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        JobCompanyCarouselItem jobCompanyCarouselItem = (JobCompanyCarouselItem) aVar;
        I5.a(gVar.f154506f, jobCompanyCarouselItem.f154487d, false);
        List<AdvertItem> list = jobCompanyCarouselItem.f154488e;
        if (list == null) {
            return;
        }
        gVar.f154510j = new d(this, jobCompanyCarouselItem);
        gVar.f154502b.c(new UV0.c(list));
        gVar.f154503c.notifyDataSetChanged();
        LinearLayoutManager linearLayoutManager = gVar.f154507g;
        int i13 = gVar.f154508h - gVar.f154509i;
        int i14 = jobCompanyCarouselItem.f154489f;
        linearLayoutManager.b2(i14, i13);
        boolean z12 = list.size() > 1;
        PageIndicatorRe23 pageIndicatorRe23 = gVar.f154505e;
        D6.G(pageIndicatorRe23, z12);
        if (!z12) {
            com.avito.android.lib.design.page_indicator_re23.b.c(pageIndicatorRe23);
        } else {
            com.avito.android.lib.design.page_indicator_re23.b.a(pageIndicatorRe23, gVar.f154504d);
            pageIndicatorRe23.e(i14, pageIndicatorRe23.getState$_design_modules_components().f179932b);
        }
    }
}
