package com.avito.android.crm_candidates.view.list_items.list_filter;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: JobCrmListFilterBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/crm_candidates/view/list_items/list_filter/a;", "LTV0/b;", "Lcom/avito/android/crm_candidates/view/list_items/list_filter/j;", "Lcom/avito/android/crm_candidates/view/list_items/list_filter/JobCrmListFilterItem;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a implements TV0.b<j, JobCrmListFilterItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final f f130145a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<k> f130146b = new g.a<>(R.layout.job_crm_list_filter_item, C3863a.f130147l);

    /* compiled from: JobCrmListFilterBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/crm_candidates/view/list_items/list_filter/k;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/crm_candidates/view/list_items/list_filter/k;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.crm_candidates.view.list_items.list_filter.a$a, reason: collision with other inner class name */
    public static final class C3863a extends N implements p<ViewGroup, View, k> {

        /* renamed from: l, reason: collision with root package name */
        public static final C3863a f130147l = new C3863a();

        public C3863a() {
            super(2);
        }

        @Override // Y41.p
        public final k invoke(ViewGroup viewGroup, View view) {
            return new k(view);
        }
    }

    @Inject
    public a(@Y61.k f fVar) {
        this.f130145a = fVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f130145a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<k> b() {
        return this.f130146b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof JobCrmListFilterItem;
    }
}
