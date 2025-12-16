package com.avito.android.horizontal_list.items.recentSearchItem;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.horizontal_list.HorizontalListWidgetListItem;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: HorizontalListRecentSearchItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/horizontal_list/items/recentSearchItem/a;", "LTV0/b;", "Lcom/avito/android/horizontal_list/items/recentSearchItem/f;", "Lcom/avito/android/horizontal_list/HorizontalListWidgetListItem$RecentSearch;", "_avito_bx-content_widget_horizontal-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a implements TV0.b<f, HorizontalListWidgetListItem.RecentSearch> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f162589a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<f> f162590b = new g.a<>(R.layout.serp_horizontal_list_recent_search_item, C4755a.f162591l);

    /* compiled from: HorizontalListRecentSearchItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/horizontal_list/items/recentSearchItem/f;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/horizontal_list/items/recentSearchItem/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.horizontal_list.items.recentSearchItem.a$a, reason: collision with other inner class name */
    public static final class C4755a extends N implements p<ViewGroup, View, f> {

        /* renamed from: l, reason: collision with root package name */
        public static final C4755a f162591l = new C4755a();

        public C4755a() {
            super(2);
        }

        @Override // Y41.p
        public final f invoke(ViewGroup viewGroup, View view) {
            return new f(view);
        }
    }

    @Inject
    public a(@k c cVar) {
        this.f162589a = cVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f162589a;
    }

    @Override // TV0.b
    @k
    public final g.a<f> b() {
        return this.f162590b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof HorizontalListWidgetListItem.RecentSearch;
    }
}
