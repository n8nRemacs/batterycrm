package com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.banner;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BannerItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/banner/a;", "LTV0/b;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/banner/f;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/banner/BannerItem;", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a implements TV0.b<f, BannerItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f220880a = new e();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<f> f220881b = new g.a<>(R.layout.position_in_search_stats_item_banner, C6671a.f220882l);

    /* compiled from: BannerItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/banner/f;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/banner/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.banner.a$a, reason: collision with other inner class name */
    public static final class C6671a extends N implements p<ViewGroup, View, f> {

        /* renamed from: l, reason: collision with root package name */
        public static final C6671a f220882l = new C6671a();

        public C6671a() {
            super(2);
        }

        @Override // Y41.p
        public final f invoke(ViewGroup viewGroup, View view) {
            return new f(view);
        }
    }

    @Inject
    public a() {
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f220880a;
    }

    @Override // TV0.b
    @k
    public final g.a<f> b() {
        return this.f220881b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof BannerItem;
    }
}
