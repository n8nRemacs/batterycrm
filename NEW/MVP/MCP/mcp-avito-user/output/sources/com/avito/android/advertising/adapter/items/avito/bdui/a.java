package com.avito.android.advertising.adapter.items.avito.bdui;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import androidx.view.C22977J;
import androidx.view.C22981N;
import androidx.view.C22984Q;
import androidx.view.InterfaceC22983P;
import com.avito.android.R;
import com.avito.android.advertising.ui.AdStyle;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.lib.util.v;
import iT.InterfaceC41342b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ob.InterfaceC44740d;

/* compiled from: AvitoNetworkAvlBDUIBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advertising/adapter/items/avito/bdui/a;", "LTV0/b;", "Lcom/avito/android/advertising/adapter/items/avito/bdui/p;", "Lcom/avito/android/advertising/adapter/items/avito/bdui/AvitoNetworkBDUIBannerItem;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements TV0.b<p, AvitoNetworkBDUIBannerItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final c f87016a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f87017b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Screen f87018c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC44740d f87019d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final androidx.appcompat.app.m f87020e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC41342b f87021f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final g.a<r> f87022g = new g.a<>(R.layout.ad_avito_network_avl_bdui, new C2593a());

    /* compiled from: AvitoNetworkAvlBDUIBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advertising/adapter/items/avito/bdui/r;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advertising/adapter/items/avito/bdui/r;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advertising.adapter.items.avito.bdui.a$a, reason: collision with other inner class name */
    public static final class C2593a extends N implements Y41.p<ViewGroup, View, r> {
        public C2593a() {
            super(2);
        }

        @Override // Y41.p
        public final r invoke(ViewGroup viewGroup, View view) {
            View view2 = view;
            AdStyle adStyle = AdStyle.f88543h;
            a aVar = a.this;
            Screen screen = aVar.f87018c;
            InterfaceC22983P interfaceC22983P = aVar.f87020e;
            C22977J c22977jA = C22984Q.a(interfaceC22983P);
            FV0.a aVar2 = interfaceC22983P instanceof FV0.a ? (FV0.a) interfaceC22983P : null;
            C22977J c22977jA2 = C22981N.a(interfaceC22983P.getLifecycle());
            InterfaceC44740d interfaceC44740d = aVar.f87019d;
            r rVar = new r(view2, adStyle, screen, aVar.f87017b, c22977jA, interfaceC44740d.c(aVar2, interfaceC22983P, c22977jA2), aVar.f87021f.invoke().H4().a(), interfaceC44740d.b());
            v.b(rVar.f87113h, R.dimen.ad_avl_corner_radius);
            return rVar;
        }
    }

    @Inject
    public a(@Y61.k c cVar, @Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k Screen screen, @Y61.k InterfaceC44740d interfaceC44740d, @Y61.k androidx.appcompat.app.m mVar, @Y61.k InterfaceC41342b interfaceC41342b) {
        this.f87016a = cVar;
        this.f87017b = screenPerformanceTracker;
        this.f87018c = screen;
        this.f87019d = interfaceC44740d;
        this.f87020e = mVar;
        this.f87021f = interfaceC41342b;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f87016a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<r> b() {
        return this.f87022g;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof AvitoNetworkBDUIBannerItem;
    }
}
