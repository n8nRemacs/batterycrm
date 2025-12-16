package com.avito.android.user_adverts.tab_screens.advert_list.empty_search;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.di.B;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: UserAdvertsEmptySearchItemBlueprint.kt */
@B
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/advert_list/empty_search/b;", "LTV0/b;", "Lcom/avito/android/user_adverts/tab_screens/advert_list/empty_search/f;", "Lcom/avito/android/user_adverts/tab_screens/advert_list/empty_search/a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements TV0.b<f, com.avito.android.user_adverts.tab_screens.advert_list.empty_search.a> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f314737a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<com.avito.konveyor.adapter.b> f314738b = new g.a<>(R.layout.user_adverts_empty_search_item_view_re23, a.f314739l);

    /* compiled from: UserAdvertsEmptySearchItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/user_adverts/tab_screens/advert_list/empty_search/f;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/user_adverts/tab_screens/advert_list/empty_search/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, f> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f314739l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final f invoke(ViewGroup viewGroup, View view) {
            View view2 = view;
            f fVar = new f(view2);
            view2.setVisibility(0);
            return fVar;
        }
    }

    @Inject
    public b(@k d dVar) {
        this.f314737a = dVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f314737a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f314738b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof com.avito.android.user_adverts.tab_screens.advert_list.empty_search.a;
    }
}
