package com.avito.android.crm_candidates.view.list_items.applications_list.application_item;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: JobCrmApplicationBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/crm_candidates/view/list_items/applications_list/application_item/a;", "LTV0/b;", "Lcom/avito/android/crm_candidates/view/list_items/applications_list/application_item/h;", "Lcom/avito/android/crm_candidates/view/list_items/applications_list/application_item/JobCrmApplicationItem;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a implements TV0.b<h, JobCrmApplicationItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f130033a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<i> f130034b = new g.a<>(R.layout.job_employers_crm_candidates_response_item, C3857a.f130035l);

    /* compiled from: JobCrmApplicationBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/crm_candidates/view/list_items/applications_list/application_item/i;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/crm_candidates/view/list_items/applications_list/application_item/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.crm_candidates.view.list_items.applications_list.application_item.a$a, reason: collision with other inner class name */
    public static final class C3857a extends N implements p<ViewGroup, View, i> {

        /* renamed from: l, reason: collision with root package name */
        public static final C3857a f130035l = new C3857a();

        public C3857a() {
            super(2);
        }

        @Override // Y41.p
        public final i invoke(ViewGroup viewGroup, View view) {
            return new i(view);
        }
    }

    @Inject
    public a(@k c cVar) {
        this.f130033a = cVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f130033a;
    }

    @Override // TV0.b
    @k
    public final g.a<i> b() {
        return this.f130034b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof JobCrmApplicationItem;
    }
}
