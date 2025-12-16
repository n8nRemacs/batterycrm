package com.avito.android.developments_agency_search.adapter.horizontal_list;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: HorizontalListItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/adapter/horizontal_list/c;", "LTV0/b;", "Lcom/avito/android/developments_agency_search/adapter/horizontal_list/i;", "Lcom/avito/android/developments_agency_search/adapter/horizontal_list/a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c implements TV0.b<i, com.avito.android.developments_agency_search.adapter.horizontal_list.a> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final e f136298a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<j> f136299b;

    /* compiled from: HorizontalListItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/developments_agency_search/adapter/horizontal_list/j;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/developments_agency_search/adapter/horizontal_list/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, j> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.konveyor.a f136300l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.avito.konveyor.a aVar) {
            super(2);
            this.f136300l = aVar;
        }

        @Override // Y41.p
        public final j invoke(ViewGroup viewGroup, View view) {
            return new j(view, this.f136300l);
        }
    }

    @Inject
    public c(@Y61.k e eVar, @b @Y61.k com.avito.konveyor.a aVar) {
        this.f136298a = eVar;
        this.f136299b = new g.a<>(R.layout.item_horizontal_list, new a(aVar));
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f136298a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<j> b() {
        return this.f136299b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof com.avito.android.developments_agency_search.adapter.horizontal_list.a;
    }
}
