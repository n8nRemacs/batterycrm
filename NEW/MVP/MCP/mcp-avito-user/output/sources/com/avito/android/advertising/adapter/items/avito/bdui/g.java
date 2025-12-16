package com.avito.android.advertising.adapter.items.avito.bdui;

import TV0.g;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.view.C22977J;
import androidx.view.C22984Q;
import androidx.view.InterfaceC22983P;
import com.avito.android.R;
import com.avito.android.advertising.adapter.items.AdViewType;
import com.avito.android.advertising.ui.AdStyle;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import iT.InterfaceC41342b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ob.InterfaceC44740d;

/* compiled from: AvitoNetworkBDUIBigBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advertising/adapter/items/avito/bdui/g;", "LTV0/b;", "Lcom/avito/android/advertising/adapter/items/avito/bdui/p;", "Lcom/avito/android/advertising/adapter/items/avito/bdui/AvitoNetworkBDUIBannerItem;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g implements TV0.b<p, AvitoNetworkBDUIBannerItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final k f87046a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f87047b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Screen f87048c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC44740d f87049d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Fragment f87050e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC41342b f87051f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advertising.a f87052g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final g.a<r> f87053h = new g.a<>(R.layout.ad_avito_network_bdui, new a());

    /* compiled from: AvitoNetworkBDUIBigBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advertising/adapter/items/avito/bdui/r;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advertising/adapter/items/avito/bdui/r;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<ViewGroup, View, r> {
        public a() {
            super(2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.p
        public final r invoke(ViewGroup viewGroup, View view) throws Resources.NotFoundException {
            View view2 = view;
            AdStyle adStyle = AdStyle.f88539d;
            g gVar = g.this;
            Screen screen = gVar.f87048c;
            Fragment fragment = gVar.f87050e;
            C22977J c22977jA = C22984Q.a(fragment.getViewLifecycleOwner());
            FV0.a aVar = fragment instanceof FV0.a ? (FV0.a) fragment : null;
            InterfaceC22983P viewLifecycleOwner = fragment.getViewLifecycleOwner();
            C22977J c22977jA2 = C22984Q.a(fragment.getViewLifecycleOwner());
            InterfaceC44740d interfaceC44740d = gVar.f87049d;
            r rVar = new r(view2, adStyle, screen, gVar.f87047b, c22977jA, interfaceC44740d.c(aVar, viewLifecycleOwner, c22977jA2), gVar.f87051f.invoke().H4().a(), interfaceC44740d.b());
            boolean f419938a = interfaceC44740d.getF419938a();
            com.avito.android.advertising.a aVar2 = gVar.f87052g;
            rVar.B80(true, (f419938a || aVar2.a()) ? false : true, aVar2.a());
            return rVar;
        }
    }

    @Inject
    public g(@Y61.k k kVar, @Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k Screen screen, @Y61.k InterfaceC44740d interfaceC44740d, @Y61.k Fragment fragment, @Y61.k InterfaceC41342b interfaceC41342b, @Y61.k com.avito.android.advertising.a aVar) {
        this.f87046a = kVar;
        this.f87047b = screenPerformanceTracker;
        this.f87048c = screen;
        this.f87049d = interfaceC44740d;
        this.f87050e = fragment;
        this.f87051f = interfaceC41342b;
        this.f87052g = aVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f87046a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<r> b() {
        return this.f87053h;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        if (aVar instanceof AvitoNetworkBDUIBannerItem) {
            if (!this.f87049d.getF419938a()) {
                AvitoNetworkBDUIBannerItem avitoNetworkBDUIBannerItem = (AvitoNetworkBDUIBannerItem) aVar;
                if (!avitoNetworkBDUIBannerItem.f87011f.isInformative()) {
                    if (avitoNetworkBDUIBannerItem.f87010e == AdViewType.f86910d) {
                    }
                }
            }
            return true;
        }
        return false;
    }
}
