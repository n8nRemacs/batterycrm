package com.avito.android.user_advert.advert.items.stats_beduin;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import iT.InterfaceC41342b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MyAdvertStatsBeduinItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_advert/advert/items/stats_beduin/b;", "LTV0/b;", "Lcom/avito/android/user_advert/advert/items/stats_beduin/d;", "Lcom/avito/android/user_advert/advert/items/stats_beduin/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements TV0.b<d, com.avito.android.user_advert.advert.items.stats_beduin.a> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.lib.beduin_v2.feature.item.b f310300a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ScreenPerformanceTracker f310301b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ZS.b f310302c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC41342b f310303d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.konveyor.util.b f310304e = com.avito.android.actions_sheet.a.r(com.avito.konveyor.util.c.f338562a);

    /* renamed from: f, reason: collision with root package name */
    @k
    public final g.a<e> f310305f = new g.a<>(R.layout.user_advert_stats_beduin_item, new a());

    /* compiled from: MyAdvertStatsBeduinItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/user_advert/advert/items/stats_beduin/e;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/user_advert/advert/items/stats_beduin/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, e> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final e invoke(ViewGroup viewGroup, View view) {
            View view2 = view;
            b bVar = b.this;
            return new e(view2, bVar.f310301b, bVar.f310300a, bVar.f310302c, bVar.f310303d);
        }
    }

    @Inject
    public b(@k com.avito.android.lib.beduin_v2.feature.item.b bVar, @k ScreenPerformanceTracker screenPerformanceTracker, @k ZS.b bVar2, @k InterfaceC41342b interfaceC41342b) {
        this.f310300a = bVar;
        this.f310301b = screenPerformanceTracker;
        this.f310302c = bVar2;
        this.f310303d = interfaceC41342b;
    }

    @Override // TV0.b
    @k
    public final TV0.d<d, com.avito.android.user_advert.advert.items.stats_beduin.a> a() {
        return this.f310304e;
    }

    @Override // TV0.b
    @k
    public final g.a<e> b() {
        return this.f310305f;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof com.avito.android.user_advert.advert.items.stats_beduin.a;
    }
}
