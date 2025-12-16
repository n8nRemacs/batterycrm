package com.avito.android.crm_candidates.view.list_items.applications_list.application_item;

import Y41.l;
import Y61.k;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: JobCrmApplicationPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_candidates/view/list_items/applications_list/application_item/e;", "Lcom/avito/android/crm_candidates/view/list_items/applications_list/application_item/c;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<JobCrmApplicationItem, G0> f130039b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super JobCrmApplicationItem, G0> lVar) {
        this.f130039b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        String str;
        h hVar = (h) eVar;
        JobCrmApplicationItem jobCrmApplicationItem = (JobCrmApplicationItem) aVar;
        hVar.l80(jobCrmApplicationItem.f130004b);
        hVar.j7(C42745f0.O(jobCrmApplicationItem.f130005c, "・", null, null, null, 62));
        Vacancy vacancy = jobCrmApplicationItem.f130015m;
        if (vacancy == null || (str = vacancy.f130030b) == null || C43066x.K(str)) {
            str = null;
        }
        String str2 = jobCrmApplicationItem.f130007e;
        if (C43066x.K(str2)) {
            str2 = null;
        }
        String str3 = jobCrmApplicationItem.f130006d;
        hVar.v7(C42745f0.O(C42756l.B(new String[]{str, str2, C43066x.K(str3) ? null : str3}), "・", null, null, null, 62));
        hVar.Y20(jobCrmApplicationItem.f130010h.size());
        hVar.t0(jobCrmApplicationItem.f130009g);
        hVar.AO(!jobCrmApplicationItem.f130008f);
        hVar.O20(new d(this, jobCrmApplicationItem));
    }
}
