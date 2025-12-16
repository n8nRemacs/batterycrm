package com.avito.android.crm_candidates.view.list_items.applications_list.error_item;

import Y41.l;
import Y61.k;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: JobCrmErrorPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_candidates/view/list_items/applications_list/error_item/f;", "Lcom/avito/android/crm_candidates/view/list_items/applications_list/error_item/d;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<JobCrmErrorItem, G0> f130077b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public f(@k l<? super JobCrmErrorItem, G0> lVar) {
        this.f130077b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        ((h) eVar).Mo(new e(this, (JobCrmErrorItem) aVar));
    }
}
