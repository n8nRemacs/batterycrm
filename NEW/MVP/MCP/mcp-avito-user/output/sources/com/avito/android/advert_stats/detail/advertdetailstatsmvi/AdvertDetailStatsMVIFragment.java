package com.avito.android.advert_stats.detail.advertdetailstatsmvi;

import Fc1.G3;
import Ju.InterfaceC14249c;
import SK0.b;
import Xa.C16984a;
import ab.InterfaceC19855a;
import ab.InterfaceC19856b;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.camera2.internal.G;
import androidx.core.os.C22777e;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.view.C23060r0;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import bb.C25618a;
import com.avito.android.K;
import com.avito.android.R;
import com.avito.android.advert_stats.InterfaceC28296a;
import com.avito.android.advert_stats.detail.advertdetailstatsmvi.di.a;
import com.avito.android.advert_stats.detail.advertdetailstatsmvi.h;
import com.avito.android.advert_stats.detail.advertdetailstatsmvi.mvi.entity.AdvertDetailStatsMVIState;
import com.avito.android.advert_stats.detail.advertdetailstatsmvi.mvi.entity.Error;
import com.avito.android.advert_stats.detail.di.r;
import com.avito.android.advert_stats.detail.tab.OneStatsTabItem;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.AdvertDetailStatisticsScreen;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.MyAdvertLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.paid_services.PaidServicesLink;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.SafeViewPager;
import com.avito.android.ui.fragments.TabBaseFragment;
import com.avito.android.util.C35966w1;
import com.avito.android.vas_performance.deeplink.PerformanceVasLink;
import com.google.android.material.tabs.TabLayout;
import eH0.c;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kv.C43501a;
import z1.AbstractC50339a;

/* compiled from: AdvertDetailStatsMVIFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/advert_stats/detail/advertdetailstatsmvi/AdvertDetailStatsMVIFragment;", "Lcom/avito/android/ui/fragments/TabBaseFragment;", "Lcom/avito/android/K;", "Lcom/avito/android/advert_stats/detail/di/r;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AdvertDetailStatsMVIFragment extends TabBaseFragment implements K<r>, InterfaceC28477j.b {

    /* renamed from: D0, reason: collision with root package name */
    @Y61.k
    public static final a f86027D0 = new a(null);

    /* renamed from: A0, reason: collision with root package name */
    @Inject
    public SK0.b f86028A0;

    /* renamed from: B0, reason: collision with root package name */
    public com.avito.android.advert_stats.detail.advertdetailstatsmvi.di.a f86029B0;

    /* renamed from: C0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f86030C0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public h.a f86031t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final O0 f86032u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f86033v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public eH0.c f86034w0;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public com.avito.android.advert_stats.l f86035x0;

    /* renamed from: y0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f86036y0;

    /* renamed from: z0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f86037z0;

    /* compiled from: AdvertDetailStatsMVIFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_stats/detail/advertdetailstatsmvi/AdvertDetailStatsMVIFragment$a;", "", "<init>", "()V", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: AdvertDetailStatsMVIFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.advert_stats.detail.advertdetailstatsmvi.AdvertDetailStatsMVIFragment$a$a, reason: collision with other inner class name */
        public static final class C2566a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ String f86038l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ String f86039m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2566a(String str, String str2) {
                super(1);
                this.f86038l = str;
                this.f86039m = str2;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                Bundle bundle2 = bundle;
                bundle2.putString("item_id", this.f86038l);
                bundle2.putString("item_slug", this.f86039m);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static AdvertDetailStatsMVIFragment a(@Y61.k String str, @Y61.l String str2) {
            AdvertDetailStatsMVIFragment advertDetailStatsMVIFragment = new AdvertDetailStatsMVIFragment();
            C35966w1.a(advertDetailStatsMVIFragment, -1, new C2566a(str, str2));
            return advertDetailStatsMVIFragment;
        }

        public a() {
        }
    }

    /* compiled from: AdvertDetailStatsMVIFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<InterfaceC19856b, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC19856b interfaceC19856b) {
            InterfaceC19856b interfaceC19856b2 = interfaceC19856b;
            AdvertDetailStatsMVIFragment advertDetailStatsMVIFragment = (AdvertDetailStatsMVIFragment) this.receiver;
            a aVar = AdvertDetailStatsMVIFragment.f86027D0;
            advertDetailStatsMVIFragment.getClass();
            if (interfaceC19856b2 instanceof InterfaceC19856b.a) {
                String string = advertDetailStatsMVIFragment.requireArguments().getString("item_id");
                if (string == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                Za.d dVar = Za.d.f20210a;
                InterfaceC19856b.a aVar2 = (InterfaceC19856b.a) interfaceC19856b2;
                ActivityC22955m activityC22955mRequireActivity = advertDetailStatsMVIFragment.requireActivity();
                eH0.c cVar = advertDetailStatsMVIFragment.f86034w0;
                eH0.c cVar2 = cVar != null ? cVar : null;
                com.avito.android.advert_stats.l lVar = advertDetailStatsMVIFragment.f86035x0;
                if (lVar == null) {
                    lVar = null;
                }
                com.avito.android.deeplink_handler.handler.composite.a aVar3 = advertDetailStatsMVIFragment.f86037z0;
                com.avito.android.deeplink_handler.handler.composite.a aVar4 = aVar3 != null ? aVar3 : null;
                InterfaceC28373a interfaceC28373a = advertDetailStatsMVIFragment.f86036y0;
                if (interfaceC28373a == null) {
                    interfaceC28373a = null;
                }
                dVar.getClass();
                DeepLink deepLink = aVar2.f21005a;
                if (deepLink instanceof PaidServicesLink) {
                    if (deepLink instanceof PerformanceVasLink) {
                        interfaceC28373a.c(new Xa.e(string));
                    }
                    Intent flags = c.a.a(cVar2, string, null, false, false, 30).setFlags(603979776);
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("up_intent", flags);
                    G0 g02 = G0.f406611a;
                    b.a.a(aVar4, deepLink, null, bundle, 2);
                } else if (deepLink instanceof MyAdvertLink.Activate) {
                    MyAdvertLink.Activate activate = (MyAdvertLink.Activate) deepLink;
                    Intent flags2 = cVar2.e(activate.f133463c, activate.f133465e).setFlags(603979776);
                    activityC22955mRequireActivity.finish();
                    activityC22955mRequireActivity.startActivity(flags2);
                } else if (deepLink instanceof MyAdvertLink.EditLink) {
                    MyAdvertLink.EditLink editLink = (MyAdvertLink.EditLink) deepLink;
                    if (editLink.f()) {
                        interfaceC28373a.c(new C16984a(editLink.getF133462b()));
                    }
                    Intent intentA = lVar.a(editLink.getF133462b(), null, true);
                    intentA.setFlags(603979776);
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelable("up_intent", intentA);
                    G0 g03 = G0.f406611a;
                    b.a.a(aVar4, deepLink, null, bundle2, 2);
                } else {
                    b.a.a(aVar4, deepLink, null, null, 6);
                }
            } else if (interfaceC19856b2 instanceof InterfaceC19856b.d) {
                Za.d dVar2 = Za.d.f20210a;
                String string2 = advertDetailStatsMVIFragment.requireArguments().getString("item_id");
                if (string2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                eH0.c cVar3 = advertDetailStatsMVIFragment.f86034w0;
                eH0.c cVar4 = cVar3 != null ? cVar3 : null;
                ActivityC22955m activityC22955mRequireActivity2 = advertDetailStatsMVIFragment.requireActivity();
                dVar2.getClass();
                Intent flags3 = c.a.a(cVar4, string2, null, false, false, 30).setFlags(603979776);
                activityC22955mRequireActivity2.finish();
                activityC22955mRequireActivity2.startActivity(flags3);
            } else if (interfaceC19856b2 instanceof InterfaceC19856b.e) {
                SK0.b bVar = advertDetailStatsMVIFragment.f86028A0;
                b.a.a(bVar != null ? bVar : null, new C25618a(), null, null, null, 14);
                SK0.b bVar2 = advertDetailStatsMVIFragment.f86028A0;
                SK0.b bVar3 = bVar2 != null ? bVar2 : null;
                SK0.a aVar5 = new SK0.a();
                aVar5.a("touchpoint", "1-item-stat_pro");
                b.a.a(bVar3, new bb.c(), aVar5, null, null, 12);
            } else if (interfaceC19856b2 instanceof InterfaceC19856b.C1498b) {
                InterfaceC19856b.C1498b c1498b = (InterfaceC19856b.C1498b) interfaceC19856b2;
                Iterator it = c1498b.f21008c.iterator();
                while (it.hasNext()) {
                    advertDetailStatsMVIFragment.getChildFragmentManager().o0(C22777e.b(new Q("requestKeyLastDate", Long.valueOf(c1498b.f21006a))), G.f("AdvertDetailStatsTab", (String) it.next()));
                }
            } else {
                boolean z12 = interfaceC19856b2 instanceof InterfaceC19856b.c;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertDetailStatsMVIFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/advert_stats/detail/advertdetailstatsmvi/mvi/entity/AdvertDetailStatsMVIState;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/advert_stats/detail/advertdetailstatsmvi/mvi/entity/AdvertDetailStatsMVIState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<AdvertDetailStatsMVIState, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.advert_stats.detail.advertdetailstatsmvi.e f86040l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ AdvertDetailStatsMVIFragment f86041m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.avito.android.advert_stats.detail.advertdetailstatsmvi.e eVar, AdvertDetailStatsMVIFragment advertDetailStatsMVIFragment) {
            super(1);
            this.f86040l = eVar;
            this.f86041m = advertDetailStatsMVIFragment;
        }

        @Override // Y41.l
        public final G0 invoke(AdvertDetailStatsMVIState advertDetailStatsMVIState) throws Resources.NotFoundException {
            int iIntValue;
            AdvertDetailStatsMVIState advertDetailStatsMVIState2 = advertDetailStatsMVIState;
            AdvertDetailStatsMVIFragment advertDetailStatsMVIFragment = this.f86041m;
            FragmentManager childFragmentManager = advertDetailStatsMVIFragment.getChildFragmentManager();
            com.avito.android.advert_stats.detail.advertdetailstatsmvi.e eVar = this.f86040l;
            com.avito.android.progress_overlay.l lVar = eVar.f86080e;
            if (advertDetailStatsMVIState2.f86115e) {
                lVar.k(null);
            } else {
                Error error = advertDetailStatsMVIState2.f86116f;
                if (error != null) {
                    lVar.a(error.f86121b);
                } else {
                    if (!lVar.d()) {
                        lVar.j();
                    }
                    List<OneStatsTabItem> list = advertDetailStatsMVIState2.f86117g;
                    TabLayout tabLayout = eVar.f86078c;
                    SafeViewPager safeViewPager = eVar.f86079d;
                    if (list != null) {
                        com.avito.android.lib.deprecated_design.tab.adapter.k<OneStatsTabItem> kVar = eVar.f86081f;
                        if (kVar.getCount() != list.size()) {
                            kVar.E5(list);
                            if (safeViewPager.getAdapter() == null) {
                                safeViewPager.setAdapter(new com.avito.android.advert_stats.detail.tab.d(childFragmentManager, kVar));
                                safeViewPager.setOffscreenPageLimit(kVar.getCount() <= 4 ? kVar.getCount() : 4);
                                safeViewPager.setPagingEnabled(false);
                            }
                            for (OneStatsTabItem oneStatsTabItem : list) {
                                if (oneStatsTabItem.f86189f) {
                                    safeViewPager.c(new com.avito.android.advert_stats.detail.advertdetailstatsmvi.f(list, eVar, oneStatsTabItem.f86188e));
                                    androidx.viewpager.widget.a adapter = safeViewPager.getAdapter();
                                    if (adapter != null) {
                                        adapter.h();
                                    }
                                    ((com.avito.android.lib.deprecated_design.tab.adapter.g) tabLayout.getTag()).d();
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                    }
                    Integer num = advertDetailStatsMVIState2.f86118h;
                    if (num != null && tabLayout.getSelectedTabPosition() != (iIntValue = num.intValue())) {
                        androidx.viewpager.widget.a adapter2 = safeViewPager.getAdapter();
                        if ((adapter2 != null ? adapter2.c() : 0) > iIntValue) {
                            safeViewPager.x(iIntValue, false);
                        }
                    }
                }
            }
            ((com.avito.android.advert_stats.H) advertDetailStatsMVIFragment.requireActivity()).h1(advertDetailStatsMVIState2.f86114d);
            Action action = advertDetailStatsMVIState2.f86112b;
            if (action != null) {
                ((InterfaceC28296a) advertDetailStatsMVIFragment.requireActivity()).b0(action, new com.avito.android.advert_stats.detail.advertdetailstatsmvi.a(advertDetailStatsMVIFragment, action));
            }
            Action action2 = advertDetailStatsMVIState2.f86113c;
            if (action2 != null) {
                ((InterfaceC28296a) advertDetailStatsMVIFragment.requireActivity()).N(action2, new com.avito.android.advert_stats.detail.advertdetailstatsmvi.b(advertDetailStatsMVIFragment, action2));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertDetailStatsMVIFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<InterfaceC19855a, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC19855a interfaceC19855a) {
            ((com.avito.android.advert_stats.detail.advertdetailstatsmvi.h) this.receiver).accept(interfaceC19855a);
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertDetailStatsMVIFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "result", "Lkotlin/G0;", "accept", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T> implements l41.g {
        public e() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC14249c interfaceC14249c = ((C43501a) obj).f413261b;
            if (interfaceC14249c instanceof MyAdvertLink.Edit.Result.a ? true : interfaceC14249c instanceof MyAdvertLink.Edit.Result.Success) {
                a aVar = AdvertDetailStatsMVIFragment.f86027D0;
                AdvertDetailStatsMVIFragment.this.D5().accept(InterfaceC19855a.c.f21000a);
            }
        }
    }

    /* compiled from: AdvertDetailStatsMVIFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lab/a;", "it", "Lkotlin/G0;", "invoke", "(Lab/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<InterfaceC19855a, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC19855a interfaceC19855a) {
            a aVar = AdvertDetailStatsMVIFragment.f86027D0;
            AdvertDetailStatsMVIFragment.this.D5().accept(interfaceC19855a);
            return G0.f406611a;
        }
    }

    /* compiled from: SaveStateViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/B", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<P0.c> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l f86045m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Y41.l lVar) {
            super(0);
            this.f86045m = lVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new Cd.r(AdvertDetailStatsMVIFragment.this, this.f86045m);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/v", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<Fragment> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return AdvertDetailStatsMVIFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/w", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ h f86047l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(h hVar) {
            super(0);
            this.f86047l = hVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f86047l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/x", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f86048l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f86048l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f86048l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/y", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f86049l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f86049l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f86049l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: AdvertDetailStatsMVIFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/r0;", "it", "Lcom/avito/android/advert_stats/detail/advertdetailstatsmvi/h;", "invoke", "(Landroidx/lifecycle/r0;)Lcom/avito/android/advert_stats/detail/advertdetailstatsmvi/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.l<C23060r0, com.avito.android.advert_stats.detail.advertdetailstatsmvi.h> {
        public l() {
            super(1);
        }

        @Override // Y41.l
        public final com.avito.android.advert_stats.detail.advertdetailstatsmvi.h invoke(C23060r0 c23060r0) {
            C23060r0 c23060r02 = c23060r0;
            h.a aVar = AdvertDetailStatsMVIFragment.this.f86031t0;
            if (aVar == null) {
                aVar = null;
            }
            return aVar.a(c23060r02);
        }
    }

    public AdvertDetailStatsMVIFragment() {
        super(0, 1, null);
        g gVar = new g(new l());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new i(new h()));
        this.f86032u0 = new O0(m0.f406844a.b(com.avito.android.advert_stats.detail.advertdetailstatsmvi.h.class), new j(interfaceC42726CB), gVar, new k(interfaceC42726CB));
        this.f86030C0 = new io.reactivex.rxjava3.disposables.c();
    }

    public final com.avito.android.advert_stats.detail.advertdetailstatsmvi.h D5() {
        return (com.avito.android.advert_stats.detail.advertdetailstatsmvi.h) this.f86032u0.getValue();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onActivityResult(int i12, int i13, @Y61.l Intent intent) {
        super.onActivityResult(i12, i13, intent);
        Za.d dVar = Za.d.f20210a;
        String string = requireArguments().getString("item_id");
        if (string == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        eH0.c cVar = this.f86034w0;
        if (cVar == null) {
            cVar = null;
        }
        eH0.c cVar2 = cVar;
        ActivityC22955m activityC22955mRequireActivity = requireActivity();
        dVar.getClass();
        if (i13 == -1 && i12 == 3) {
            Intent flags = c.a.a(cVar2, string, null, false, false, 30).setFlags(603979776);
            activityC22955mRequireActivity.finish();
            activityC22955mRequireActivity.startActivity(flags);
        }
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment, com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        p5(bundle);
        super.onCreate(bundle);
        getChildFragmentManager().p0("requestKeyAdvertDetailStatsMVI", this, new Ae0.c(this, 19));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f86033v0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        View viewInflate = layoutInflater.inflate(R.layout.advert_detail_fragment, viewGroup, false);
        InterfaceC28373a interfaceC28373a = this.f86036y0;
        if (interfaceC28373a == null) {
            interfaceC28373a = null;
        }
        com.avito.android.advert_stats.detail.advertdetailstatsmvi.e eVar = new com.avito.android.advert_stats.detail.advertdetailstatsmvi.e(viewInflate, interfaceC28373a, new d(1, D5(), com.avito.android.advert_stats.detail.advertdetailstatsmvi.h.class, "accept", "accept(Ljava/lang/Object;)V", 0));
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f86033v0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, D5(), new b(1, this, AdvertDetailStatsMVIFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/advert_stats/detail/advertdetailstatsmvi/mvi/entity/AdvertDetailStatsMVIOneTimeEvent;)V", 0), new c(eVar, this));
        return viewInflate;
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (l1() == null || !requireActivity().isChangingConfigurations()) {
            Za.g.f20211a.getClass();
            Za.g.f20212b = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f86030C0.e();
        super.onDestroyView();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        View view = getView();
        if (view != null) {
            view.postDelayed(new G3(this, 25), 400L);
        }
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f86033v0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f86037z0;
        this.f86030C0.b((aVar != null ? aVar : null).d9().t0(new e()));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        a.InterfaceC2567a interfaceC2567aA = com.avito.android.advert_stats.detail.advertdetailstatsmvi.di.d.a();
        String string = requireArguments().getString("item_id");
        if (string == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String string2 = requireArguments().getString("item_slug");
        com.avito.android.analytics.screens.r rVarC = s.c(this);
        C28478k c28478k = new C28478k(AdvertDetailStatisticsScreen.f90276d, s.c(this), null, 4, null);
        Resources resources = getResources();
        com.avito.android.advert_stats.detail.advertdetailstatsmvi.di.c cVar = (com.avito.android.advert_stats.detail.advertdetailstatsmvi.di.c) C29972i.a(C29972i.b(this), com.avito.android.advert_stats.detail.advertdetailstatsmvi.di.c.class);
        com.avito.android.advert_stats.detail.advertdetailstatsmvi.di.a aVarA = interfaceC2567aA.a(this, string, string2, rVarC, c28478k, new f(), resources, cv.c.b(this), cVar);
        this.f86029B0 = aVarA;
        aVarA.O8(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f86033v0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    @Override // com.avito.android.K
    public final InterfaceC29971h r0() {
        com.avito.android.advert_stats.detail.advertdetailstatsmvi.di.a aVar = this.f86029B0;
        if (aVar != null) {
            return aVar;
        }
        return null;
    }
}
