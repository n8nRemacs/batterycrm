package com.avito.android.search.filter.adapter.group_clearance;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.search.filter.adapter.select.n;
import com.avito.android.search.filter.converter.ParameterElement;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: GroupClearanceItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/search/filter/adapter/group_clearance/a;", "LTV0/b;", "Lcom/avito/android/search/filter/adapter/select/l;", "Lcom/avito/android/search/filter/converter/ParameterElement$k;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements TV0.b<com.avito.android.search.filter.adapter.select.l, ParameterElement.k> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final g f262318a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> f262319b = new g.a<>(R.layout.filters_select_filter, C7842a.f262320l);

    /* compiled from: GroupClearanceItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/search/filter/adapter/select/n;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/search/filter/adapter/select/n;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.search.filter.adapter.group_clearance.a$a, reason: collision with other inner class name */
    public static final class C7842a extends N implements p<ViewGroup, View, n> {

        /* renamed from: l, reason: collision with root package name */
        public static final C7842a f262320l = new C7842a();

        public C7842a() {
            super(2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.p
        public final n invoke(ViewGroup viewGroup, View view) {
            return new n(view, null, 2, 0 == true ? 1 : 0);
        }
    }

    @Inject
    public a(@Y61.k g gVar) {
        this.f262318a = gVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f262318a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f262319b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof ParameterElement.k;
    }
}
