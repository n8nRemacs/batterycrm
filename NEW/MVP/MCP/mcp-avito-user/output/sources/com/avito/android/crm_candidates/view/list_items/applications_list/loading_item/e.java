package com.avito.android.crm_candidates.view.list_items.applications_list.loading_item;

import Y41.l;
import Y61.k;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: JobCrmLoadingPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_candidates/view/list_items/applications_list/loading_item/e;", "Lcom/avito/android/crm_candidates/view/list_items/applications_list/loading_item/d;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<JobCrmLoadingItem, G0> f130088b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super JobCrmLoadingItem, G0> lVar) {
        this.f130088b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        JobCrmLoadingItem jobCrmLoadingItem = (JobCrmLoadingItem) aVar;
        if (jobCrmLoadingItem.f130082c) {
            return;
        }
        this.f130088b.invoke(jobCrmLoadingItem);
    }
}
