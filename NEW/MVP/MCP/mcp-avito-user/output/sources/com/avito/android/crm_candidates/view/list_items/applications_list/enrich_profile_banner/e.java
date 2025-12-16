package com.avito.android.crm_candidates.view.list_items.applications_list.enrich_profile_banner;

import Y41.l;
import Y61.k;
import com.avito.android.image_loader.n;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35949t5;
import com.avito.android.util.I5;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: JobCrmBannerPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_candidates/view/list_items/applications_list/enrich_profile_banner/e;", "Lcom/avito/android/crm_candidates/view/list_items/applications_list/enrich_profile_banner/c;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<JobCrmBannerItem, G0> f130061b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super JobCrmBannerItem, G0> lVar) {
        this.f130061b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        JobCrmBannerItem jobCrmBannerItem = (JobCrmBannerItem) aVar;
        TU.a aVarA = TU.a.a(gVar.f130068f, jobCrmBannerItem.f130050c, 0, 6);
        Banner banner = gVar.f130064b;
        banner.setState(aVarA);
        I5.a(gVar.f130065c, jobCrmBannerItem.f130051d, false);
        Button button = gVar.f130066d;
        com.avito.android.lib.design.button.b.a(button, jobCrmBannerItem.f130052e, false);
        C35949t5.c(gVar.f130067e, n.a(UniversalImageKt.getImageDependsOnTheme(jobCrmBannerItem.f130054g, com.avito.android.lib.util.darkTheme.c.b(banner.getContext()))), null, null, null, 14);
        button.setOnClickListener(new com.avito.android.component.user_hat.items.k(13, new d(this, jobCrmBannerItem)));
    }
}
