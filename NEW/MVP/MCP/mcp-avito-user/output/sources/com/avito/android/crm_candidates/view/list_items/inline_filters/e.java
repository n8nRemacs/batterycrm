package com.avito.android.crm_candidates.view.list_items.inline_filters;

import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: JobCrmInlineFilterPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_candidates/view/list_items/inline_filters/e;", "Lcom/avito/android/crm_candidates/view/list_items/inline_filters/c;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<JobCrmInlineFilterItem, G0> f130126b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@Y61.k Y41.l<? super JobCrmInlineFilterItem, G0> lVar) {
        this.f130126b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        JobCrmInlineFilterItem jobCrmInlineFilterItem = (JobCrmInlineFilterItem) aVar;
        gVar.setText(jobCrmInlineFilterItem.f130105d);
        gVar.X8();
        gVar.setSelected(jobCrmInlineFilterItem.f130106e);
        gVar.A0(new d(this, jobCrmInlineFilterItem));
    }
}
