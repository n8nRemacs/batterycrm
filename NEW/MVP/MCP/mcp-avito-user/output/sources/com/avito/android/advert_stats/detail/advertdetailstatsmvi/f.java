package com.avito.android.advert_stats.detail.advertdetailstatsmvi;

import androidx.viewpager.widget.ViewPager;
import com.avito.android.advert_stats.detail.tab.OneStatsTabItem;
import java.util.List;
import kotlin.Metadata;

/* compiled from: AdvertDetailStatsMVIView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_stats/detail/advertdetailstatsmvi/f;", "Landroidx/viewpager/widget/ViewPager$l;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f extends ViewPager.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List<OneStatsTabItem> f86083b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f86084c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f86085d;

    public f(List<OneStatsTabItem> list, e eVar, String str) {
        this.f86083b = list;
        this.f86084c = eVar;
        this.f86085d = str;
    }

    @Override // androidx.viewpager.widget.ViewPager.l, androidx.viewpager.widget.ViewPager.i
    public final void b(int i12) {
        String str = this.f86083b.get(i12).f86191h;
        e eVar = this.f86084c;
        eVar.f86076a.c(new Xa.b(str, this.f86085d));
    }
}
