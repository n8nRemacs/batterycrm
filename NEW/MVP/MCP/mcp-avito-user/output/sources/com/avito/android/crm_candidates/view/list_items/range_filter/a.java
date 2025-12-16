package com.avito.android.crm_candidates.view.list_items.range_filter;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.crm_candidates.features.full_filters.entity.FilterItem;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.T;

/* compiled from: RangeFilterBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/crm_candidates/view/list_items/range_filter/a;", "LTV0/b;", "Lcom/avito/android/crm_candidates/view/list_items/range_filter/i;", "Lcom/avito/android/crm_candidates/features/full_filters/entity/FilterItem;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a implements TV0.b<i, FilterItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f130185a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final T f130186b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g.a<j> f130187c = new g.a<>(R.layout.job_crm_candidates_range_filter_item, new C3865a());

    /* compiled from: RangeFilterBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/crm_candidates/view/list_items/range_filter/j;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/crm_candidates/view/list_items/range_filter/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.crm_candidates.view.list_items.range_filter.a$a, reason: collision with other inner class name */
    public static final class C3865a extends N implements p<ViewGroup, View, j> {
        public C3865a() {
            super(2);
        }

        @Override // Y41.p
        public final j invoke(ViewGroup viewGroup, View view) {
            return new j(view, a.this.f130186b);
        }
    }

    @Inject
    public a(@k e eVar, @k T t12) {
        this.f130185a = eVar;
        this.f130186b = t12;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f130185a;
    }

    @Override // TV0.b
    @k
    public final g.a<j> b() {
        return this.f130187c;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return (aVar instanceof FilterItem) && b.f130189a.contains(((FilterItem) aVar).f129565c);
    }
}
