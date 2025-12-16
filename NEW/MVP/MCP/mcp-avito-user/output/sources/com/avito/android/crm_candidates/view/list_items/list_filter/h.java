package com.avito.android.crm_candidates.view.list_items.list_filter;

import Y41.l;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: JobCrmListFilterPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_candidates/view/list_items/list_filter/h;", "Lcom/avito/android/crm_candidates/view/list_items/list_filter/f;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h implements f {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final l<JobCrmListFilterItem, G0> f130153b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public h(@Y61.k l<? super JobCrmListFilterItem, G0> lVar) {
        this.f130153b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        j jVar = (j) eVar;
        JobCrmListFilterItem jobCrmListFilterItem = (JobCrmListFilterItem) aVar;
        jVar.setTitle(jobCrmListFilterItem.f130136b);
        jVar.h(jobCrmListFilterItem.f130137c);
        jVar.o7(jobCrmListFilterItem.f130138d);
        jVar.MX(jobCrmListFilterItem.f130141g);
        jVar.Md(jobCrmListFilterItem.f130139e, jobCrmListFilterItem.f130140f);
        jVar.A0(new g(this, jobCrmListFilterItem));
    }
}
