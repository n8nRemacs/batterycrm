package com.avito.android.crm_candidates.view.list_items.survey_results;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.crm_candidates.view.list_items.applications_list.application_item.Property;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: JobCrmResultsPropertyBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/crm_candidates/view/list_items/survey_results/e;", "LTV0/b;", "Lcom/avito/android/crm_candidates/view/list_items/survey_results/k;", "Lcom/avito/android/crm_candidates/view/list_items/applications_list/application_item/Property;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e implements TV0.b<k, Property> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h f130260a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<l> f130261b = new g.a<>(R.layout.job_employers_crm_candidates_enrichment_property, a.f130262l);

    /* compiled from: JobCrmResultsPropertyBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/crm_candidates/view/list_items/survey_results/l;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/crm_candidates/view/list_items/survey_results/l;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, l> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f130262l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final l invoke(ViewGroup viewGroup, View view) {
            return new l(view);
        }
    }

    @Inject
    public e(@Y61.k h hVar) {
        this.f130260a = hVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f130260a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<l> b() {
        return this.f130261b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof Property;
    }
}
