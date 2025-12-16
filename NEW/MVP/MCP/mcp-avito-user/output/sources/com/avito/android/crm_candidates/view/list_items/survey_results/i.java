package com.avito.android.crm_candidates.view.list_items.survey_results;

import com.avito.android.crm_candidates.view.list_items.applications_list.application_item.Property;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: JobCrmResultsPropertyPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/crm_candidates/view/list_items/survey_results/i;", "Lcom/avito/android/crm_candidates/view/list_items/survey_results/h;", "<init>", "()V", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class i implements h {
    @Inject
    public i() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k kVar = (k) eVar;
        Property property = (Property) aVar;
        kVar.setTitle(property.f130026b);
        kVar.m(property.f130027c);
        kVar.b20(property.f130028d);
    }
}
