package com.avito.android.developments_agency_search.screen.realty_agency_search;

import Aw0.InterfaceC13094a;
import Cd.C13243a;
import Lw.InterfaceC14443a;
import Lw.b;
import Lw.c;
import Zp0.InterfaceC19587b;
import Zp0.InterfaceC19588c;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.C;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22981N;
import androidx.view.InterfaceC22969B;
import androidx.view.InterfaceC22983P;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import cU0.C27106d;
import com.adjust.sdk.network.ErrorCodes;
import com.avito.android.C36135w2;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.avito_map.AvitoMapBounds;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.developments_agency_search.analytics.SearchFiltersSource;
import com.avito.android.developments_agency_search.screen.big_filters.BigFiltersArguments;
import com.avito.android.developments_agency_search.screen.big_filters.BigFiltersFragment;
import com.avito.android.developments_agency_search.screen.help_center.model.HelpCenterArguments;
import com.avito.android.developments_agency_search.screen.location_group.LocationGroupArguments;
import com.avito.android.developments_agency_search.screen.location_group.LocationGroupDialogFragment;
import com.avito.android.developments_agency_search.screen.realty_agency_search.RealtyAgencySearchFragment;
import com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.tab_layout.Tab;
import com.avito.android.developments_agency_search.screen.realty_agency_search.model.DevelopmentSort;
import com.avito.android.developments_agency_search.screen.realty_agency_search.model.LotSort;
import com.avito.android.developments_agency_search.screen.realty_agency_search.model.RealtyAgencySearchArguments;
import com.avito.android.di.C29972i;
import com.avito.android.inline_filters.InterfaceC31062w;
import com.avito.android.inline_filters.dialog.InterfaceC30999b;
import com.avito.android.lib.design.map.state.MapState;
import com.avito.android.lib.design.map.state.a;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.select.Arguments;
import com.avito.android.ui.fragments.TabBaseFragment;
import com.avito.android.util.C35966w1;
import com.avito.android.util.G;
import com.avito.android.util.Kundle;
import com.avito.beduin.v2.engine.component.x;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import id.C41383a;
import java.lang.ref.WeakReference;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import oW.InterfaceC44697a;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import shark.AndroidResourceIdNames;
import z1.AbstractC50339a;

/* compiled from: RealtyAgencySearchFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/RealtyAgencySearchFragment;", "Lcom/avito/android/ui/fragments/TabBaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "Lcom/avito/android/select/p;", "<init>", "()V", "a", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RealtyAgencySearchFragment extends TabBaseFragment implements InterfaceC28477j.b, com.avito.android.select.p {

    /* renamed from: V0, reason: collision with root package name */
    @Y61.k
    public static final a f138222V0 = new a(null);

    /* renamed from: A0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.item_visibility_tracker.b f138223A0;

    /* renamed from: B0, reason: collision with root package name */
    @Inject
    public InterfaceC31062w f138224B0;

    /* renamed from: C0, reason: collision with root package name */
    @Inject
    public Zp0.d f138225C0;

    /* renamed from: D0, reason: collision with root package name */
    @Inject
    public com.avito.android.util.text.a f138226D0;

    /* renamed from: E0, reason: collision with root package name */
    @Inject
    public com.avito.android.onboarding_manager.a f138227E0;

    /* renamed from: F0, reason: collision with root package name */
    @Inject
    public InterfaceC30999b f138228F0;

    /* renamed from: G0, reason: collision with root package name */
    @Inject
    public com.avito.android.realty_agency.inline_filters.a f138229G0;

    /* renamed from: H0, reason: collision with root package name */
    @Inject
    public com.avito.android.developments_agency_search.screen.realty_agency_search.a f138230H0;

    /* renamed from: I0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f138231I0;

    /* renamed from: J0, reason: collision with root package name */
    @Inject
    public com.avito.android.developments_agency_search.adapter.error_layout.d f138232J0;

    /* renamed from: K0, reason: collision with root package name */
    @Inject
    public com.avito.android.developments_agency_search.adapter.commission_promo_banner.d f138233K0;

    /* renamed from: L0, reason: collision with root package name */
    @Inject
    public com.avito.android.permissions.q f138234L0;

    /* renamed from: M0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f138235M0;

    /* renamed from: N0, reason: collision with root package name */
    public com.avito.android.developments_agency_search.screen.realty_agency_search.view_holder.j f138236N0;

    /* renamed from: O0, reason: collision with root package name */
    public com.avito.android.realty_agency.inline_filters.m f138237O0;

    /* renamed from: P0, reason: collision with root package name */
    @Inject
    public Screen f138238P0;

    /* renamed from: Q0, reason: collision with root package name */
    @Inject
    public com.avito.android.lib.beduin_v2.feature.item.b f138239Q0;

    /* renamed from: R0, reason: collision with root package name */
    @Inject
    public InterfaceC13094a f138240R0;

    /* renamed from: S0, reason: collision with root package name */
    @Inject
    public com.avito.android.onboarding_manager.f f138241S0;

    /* renamed from: T0, reason: collision with root package name */
    @Inject
    public C36135w2 f138242T0;

    /* renamed from: U0, reason: collision with root package name */
    @Inject
    public com.avito.android.developments_agency_search.features.a f138243U0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public com.avito.android.developments_agency_search.screen.realty_agency_search.q f138244t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final O0 f138245u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f138246v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f138247w0;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f138248x0;

    /* renamed from: y0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f138249y0;

    /* renamed from: z0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f138250z0;

    /* compiled from: RealtyAgencySearchFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/RealtyAgencySearchFragment$a;", "", "<init>", "()V", "", "BIG_FILTERS_DIALOG_SCREEN_TAG", "Ljava/lang/String;", "BIG_FILTERS_SCREEN_RESULT_REQUEST_KEY", "BIG_FILTERS_SCREEN_RESULT_SEARCH_PARAMS_BUNDLE_ID", "ITEM_VISIBILITY_TRACKER_STATE_KEY", "KEY_INLINE_FILTERS_STATE", "LOCATION_GROUP_DIALOG_SCREEN_TAG", "LOCATION_GROUP_SCREEN_RESULT_REQUEST_KEY", "LOCATION_GROUP_SCREEN_RESULT_SEARCH_PARAMS_BUNDLE_ID", "REALTY_AGENCY_SEARCH_FRAGMENT_ARGS", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: RealtyAgencySearchFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.developments_agency_search.screen.realty_agency_search.RealtyAgencySearchFragment$a$a, reason: collision with other inner class name */
        public static final class C4170a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ RealtyAgencySearchArguments f138251l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4170a(RealtyAgencySearchArguments realtyAgencySearchArguments) {
                super(1);
                this.f138251l = realtyAgencySearchArguments;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("realty_agency_search_fragment_args", this.f138251l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @X41.n
        @Y61.k
        public static RealtyAgencySearchFragment a(@Y61.k RealtyAgencySearchArguments realtyAgencySearchArguments) {
            RealtyAgencySearchFragment realtyAgencySearchFragment = new RealtyAgencySearchFragment();
            C35966w1.a(realtyAgencySearchFragment, -1, new C4170a(realtyAgencySearchArguments));
            return realtyAgencySearchFragment;
        }

        public a() {
        }
    }

    /* compiled from: RealtyAgencySearchFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/model/RealtyAgencySearchArguments;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<RealtyAgencySearchArguments> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final RealtyAgencySearchArguments invoke() {
            Bundle bundleRequireArguments = RealtyAgencySearchFragment.this.requireArguments();
            Parcelable parcelable = Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("realty_agency_search_fragment_args", RealtyAgencySearchArguments.class) : bundleRequireArguments.getParcelable("realty_agency_search_fragment_args");
            if (parcelable != null) {
                return (RealtyAgencySearchArguments) parcelable;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    /* compiled from: RealtyAgencySearchFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<Lw.b, G0> {
        public final void f(@Y61.k Lw.b bVar) {
            RealtyAgencySearchFragment realtyAgencySearchFragment = (RealtyAgencySearchFragment) this.receiver;
            a aVar = RealtyAgencySearchFragment.f138222V0;
            realtyAgencySearchFragment.getClass();
            if (L.f(bVar, b.i.f10227a)) {
                com.avito.android.developments_agency_search.screen.realty_agency_search.view_holder.j jVar = realtyAgencySearchFragment.f138236N0;
                RecyclerView.m layoutManager = (jVar != null ? jVar : null).f139034i.getLayoutManager();
                if (layoutManager != null) {
                    layoutManager.l1(0);
                    return;
                }
                return;
            }
            if (L.f(bVar, b.h.f10226a)) {
                InterfaceC42726C interfaceC42726C = realtyAgencySearchFragment.f138235M0;
                if (((RealtyAgencySearchArguments) interfaceC42726C.getValue()).f138667e || ((RealtyAgencySearchArguments) interfaceC42726C.getValue()).f138666d) {
                    com.avito.android.realty_agency.inline_filters.m mVar = realtyAgencySearchFragment.f138237O0;
                    if (mVar == null) {
                        mVar = null;
                    }
                    mVar.f251725b.z1(realtyAgencySearchFragment.D5().getState().getValue().f10238b, null);
                    return;
                }
                return;
            }
            if (L.f(bVar, b.a.f10217a)) {
                ActivityC22955m activityC22955mL1 = realtyAgencySearchFragment.l1();
                if (activityC22955mL1 != null) {
                    activityC22955mL1.onBackPressed();
                    return;
                }
                return;
            }
            if (L.f(bVar, b.k.f10230a)) {
                Context contextRequireContext = realtyAgencySearchFragment.requireContext();
                com.avito.android.developments_agency_search.screen.realty_agency_search.a aVar2 = realtyAgencySearchFragment.f138230H0;
                com.avito.android.lib.util.g.a(new com.avito.android.developments_agency_search.screen.single_selector_dialog.b(contextRequireContext, (aVar2 != null ? aVar2 : null).e(DevelopmentSort.f138658e, realtyAgencySearchFragment.D5().getState().getValue().f10242f.f10250a), realtyAgencySearchFragment.requireContext().getString(R.string.das_search_sorting_dialog_title), new com.avito.android.developments_agency_search.screen.realty_agency_search.e(realtyAgencySearchFragment), true, true, new com.avito.android.developments_agency_search.screen.realty_agency_search.f(realtyAgencySearchFragment)));
                return;
            }
            if (L.f(bVar, b.n.f10235a)) {
                Context contextRequireContext2 = realtyAgencySearchFragment.requireContext();
                com.avito.android.developments_agency_search.screen.realty_agency_search.a aVar3 = realtyAgencySearchFragment.f138230H0;
                com.avito.android.lib.util.g.a(new com.avito.android.developments_agency_search.screen.single_selector_dialog.b(contextRequireContext2, (aVar3 != null ? aVar3 : null).g(LotSort.f138663f, realtyAgencySearchFragment.D5().getState().getValue().f10242f.f10251b), realtyAgencySearchFragment.requireContext().getString(R.string.das_search_sorting_dialog_title), new com.avito.android.developments_agency_search.screen.realty_agency_search.g(realtyAgencySearchFragment), true, true, new com.avito.android.developments_agency_search.screen.realty_agency_search.h(realtyAgencySearchFragment)));
                return;
            }
            if (bVar instanceof b.j) {
                b.j jVar2 = (b.j) bVar;
                com.avito.android.lib.util.g.a(new com.avito.android.developments_agency_search.screen.realty_agency_search.dialog.b(realtyAgencySearchFragment.requireContext(), null, jVar2.f10229b, new com.avito.android.developments_agency_search.screen.realty_agency_search.i(realtyAgencySearchFragment, jVar2), 2, null));
                return;
            }
            if (bVar instanceof b.m) {
                b.m mVar2 = (b.m) bVar;
                com.avito.android.lib.util.g.a(new com.avito.android.developments_agency_search.screen.realty_agency_search.dialog.b(realtyAgencySearchFragment.requireContext(), null, mVar2.f10234c, new com.avito.android.developments_agency_search.screen.realty_agency_search.j(realtyAgencySearchFragment, mVar2), 2, null));
                return;
            }
            if (bVar instanceof b.l) {
                Context contextRequireContext3 = realtyAgencySearchFragment.requireContext();
                HelpCenterArguments helpCenterArguments = new HelpCenterArguments("prof_search", ((b.l) bVar).f10231a);
                com.avito.android.deeplink_handler.handler.composite.a aVar4 = realtyAgencySearchFragment.f138231I0;
                com.avito.android.lib.util.g.a(new com.avito.android.developments_agency_search.screen.help_center.a(contextRequireContext3, helpCenterArguments, aVar4 != null ? aVar4 : null));
                return;
            }
            if (bVar instanceof b.c) {
                com.avito.android.deeplink_handler.handler.composite.a aVar5 = realtyAgencySearchFragment.f138231I0;
                if (aVar5 == null) {
                    aVar5 = null;
                }
                b.a.a(aVar5, ((b.c) bVar).f10220a, null, null, 6);
                return;
            }
            if (bVar instanceof b.o) {
                com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                PrintableText printableTextF = com.avito.android.printable_text.b.f(((b.o) bVar).f10236a);
                f.c.f125255c.getClass();
                com.avito.android.component.toast.c.c(cVar, realtyAgencySearchFragment, printableTextF, null, null, f.c.a.b(), 0, null, ErrorCodes.SSL_HANDSHAKE_EXCEPTION);
                return;
            }
            if (bVar instanceof b.f) {
                Lw.c value = realtyAgencySearchFragment.D5().getState().getValue();
                BigFiltersFragment.a aVar6 = BigFiltersFragment.f136550r0;
                SearchParams searchParams = ((b.f) bVar).f10224a;
                SearchParams searchParamsCopy = searchParams.copy(((-1234173943) & 1) != 0 ? searchParams.categoryId : null, ((-1234173943) & 2) != 0 ? searchParams.geoCoords : null, ((-1234173943) & 4) != 0 ? searchParams.locationId : null, ((-1234173943) & 8) != 0 ? searchParams.suggestLocationId : null, ((-1234173943) & 16) != 0 ? searchParams.metroIds : null, ((-1234173943) & 32) != 0 ? searchParams.directionId : null, ((-1234173943) & 64) != 0 ? searchParams.districtId : null, ((-1234173943) & 128) != 0 ? searchParams.params : null, ((-1234173943) & 256) != 0 ? searchParams.priceMax : null, ((-1234173943) & 512) != 0 ? searchParams.priceMin : null, ((-1234173943) & 1024) != 0 ? searchParams.query : null, ((-1234173943) & 2048) != 0 ? searchParams.title : null, ((-1234173943) & 4096) != 0 ? searchParams.owner : null, ((-1234173943) & 8192) != 0 ? searchParams.sort : null, ((-1234173943) & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? searchParams.withImagesOnly : null, ((-1234173943) & 32768) != 0 ? searchParams.searchRadius : null, ((-1234173943) & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? searchParams.radius : null, ((-1234173943) & 131072) != 0 ? searchParams.footWalkingMetro : null, ((-1234173943) & 262144) != 0 ? searchParams.withDeliveryOnly : null, ((-1234173943) & 524288) != 0 ? searchParams.localPriority : null, ((-1234173943) & 1048576) != 0 ? searchParams.earlyAccess : null, ((-1234173943) & 2097152) != 0 ? searchParams.moreExpensive : null, ((-1234173943) & 4194304) != 0 ? searchParams.widgetCategory : null, ((-1234173943) & 8388608) != 0 ? searchParams.expanded : null, ((-1234173943) & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? searchParams.sellerId : null, ((-1234173943) & 33554432) != 0 ? searchParams.cv2Vacancy : null, ((-1234173943) & 67108864) != 0 ? searchParams.displayType : null, ((-1234173943) & 134217728) != 0 ? searchParams.shopId : null, ((-1234173943) & 268435456) != 0 ? searchParams.forcedLocationForRecommendation : null, ((-1234173943) & 536870912) != 0 ? searchParams.area : null, ((-1234173943) & 1073741824) != 0 ? searchParams.source : null, ((-1234173943) & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? searchParams.clarifyIconType : null, (0 & 1) != 0 ? searchParams.drawId : null);
                Tab tab = value.f10248l;
                c.a aVar7 = value.f10242f;
                BigFiltersArguments bigFiltersArguments = new BigFiltersArguments(searchParamsCopy, "big-filters-screen-result-key", "searchParams", tab, aVar7.f10250a, aVar7.f10251b, aVar7.f10252c, value.f10249m);
                aVar6.getClass();
                com.avito.android.lib.util.g.b(BigFiltersFragment.a.a(bigFiltersArguments), realtyAgencySearchFragment.requireContext(), realtyAgencySearchFragment.getChildFragmentManager(), "FiltersDialogScreen");
                return;
            }
            if (bVar instanceof b.g) {
                Lw.c value2 = realtyAgencySearchFragment.D5().getState().getValue();
                LocationGroupDialogFragment.a aVar8 = LocationGroupDialogFragment.f138049q0;
                SearchParams searchParams2 = ((b.g) bVar).f10225a;
                SearchParams searchParamsCopy2 = searchParams2.copy(((-1234173943) & 1) != 0 ? searchParams2.categoryId : null, ((-1234173943) & 2) != 0 ? searchParams2.geoCoords : null, ((-1234173943) & 4) != 0 ? searchParams2.locationId : null, ((-1234173943) & 8) != 0 ? searchParams2.suggestLocationId : null, ((-1234173943) & 16) != 0 ? searchParams2.metroIds : null, ((-1234173943) & 32) != 0 ? searchParams2.directionId : null, ((-1234173943) & 64) != 0 ? searchParams2.districtId : null, ((-1234173943) & 128) != 0 ? searchParams2.params : null, ((-1234173943) & 256) != 0 ? searchParams2.priceMax : null, ((-1234173943) & 512) != 0 ? searchParams2.priceMin : null, ((-1234173943) & 1024) != 0 ? searchParams2.query : null, ((-1234173943) & 2048) != 0 ? searchParams2.title : null, ((-1234173943) & 4096) != 0 ? searchParams2.owner : null, ((-1234173943) & 8192) != 0 ? searchParams2.sort : null, ((-1234173943) & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? searchParams2.withImagesOnly : null, ((-1234173943) & 32768) != 0 ? searchParams2.searchRadius : null, ((-1234173943) & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? searchParams2.radius : null, ((-1234173943) & 131072) != 0 ? searchParams2.footWalkingMetro : null, ((-1234173943) & 262144) != 0 ? searchParams2.withDeliveryOnly : null, ((-1234173943) & 524288) != 0 ? searchParams2.localPriority : null, ((-1234173943) & 1048576) != 0 ? searchParams2.earlyAccess : null, ((-1234173943) & 2097152) != 0 ? searchParams2.moreExpensive : null, ((-1234173943) & 4194304) != 0 ? searchParams2.widgetCategory : null, ((-1234173943) & 8388608) != 0 ? searchParams2.expanded : null, ((-1234173943) & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? searchParams2.sellerId : null, ((-1234173943) & 33554432) != 0 ? searchParams2.cv2Vacancy : null, ((-1234173943) & 67108864) != 0 ? searchParams2.displayType : null, ((-1234173943) & 134217728) != 0 ? searchParams2.shopId : null, ((-1234173943) & 268435456) != 0 ? searchParams2.forcedLocationForRecommendation : null, ((-1234173943) & 536870912) != 0 ? searchParams2.area : null, ((-1234173943) & 1073741824) != 0 ? searchParams2.source : null, ((-1234173943) & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? searchParams2.clarifyIconType : null, (0 & 1) != 0 ? searchParams2.drawId : null);
                Tab tab2 = value2.f10248l;
                c.a aVar9 = value2.f10242f;
                LocationGroupArguments locationGroupArguments = new LocationGroupArguments(searchParamsCopy2, "RealtyAgencySearch.location_group_screen_result_key", "RealtyAgencySearch.search_params_bundle_id", tab2, aVar9.f10250a, aVar9.f10251b, aVar9.f10252c, value2.f10249m, SearchFiltersSource.f136326c, "prof_search");
                aVar8.getClass();
                com.avito.android.lib.util.g.b(LocationGroupDialogFragment.a.a(locationGroupArguments), realtyAgencySearchFragment.requireContext(), realtyAgencySearchFragment.getChildFragmentManager(), "RealtyAgencySearch.LocationGroupDialogScreen");
                return;
            }
            if (bVar instanceof b.InterfaceC0647b.a) {
                com.avito.android.developments_agency_search.screen.realty_agency_search.view_holder.j jVar3 = realtyAgencySearchFragment.f138236N0;
                (jVar3 != null ? jVar3 : null).f139035j.b(4);
                return;
            }
            if (bVar instanceof b.InterfaceC0647b.C0648b) {
                com.avito.android.developments_agency_search.screen.realty_agency_search.view_holder.j jVar4 = realtyAgencySearchFragment.f138236N0;
                (jVar4 != null ? jVar4 : null).f139035j.b(6);
                return;
            }
            if (bVar instanceof b.e) {
                com.avito.android.developments_agency_search.screen.realty_agency_search.view_holder.j jVar5 = realtyAgencySearchFragment.f138236N0;
                if (jVar5 == null) {
                    jVar5 = null;
                }
                com.avito.android.developments_agency_search.screen.realty_agency_search.view_holder.h hVar = jVar5.f139032g;
                MapState mapStateA = MapState.a(hVar.f139022b, null, new a.b(((b.e) bVar).f10222a, false, Float.valueOf(r1.f10223b), 2, null), 8183);
                hVar.f139022b = mapStateA;
                hVar.f139023c.setState(mapStateA);
                return;
            }
            if (bVar instanceof b.d) {
                com.avito.android.developments_agency_search.screen.realty_agency_search.view_holder.j jVar6 = realtyAgencySearchFragment.f138236N0;
                if (jVar6 == null) {
                    jVar6 = null;
                }
                AvitoMapBounds avitoMapBounds = ((b.d) bVar).f10221a;
                com.avito.android.developments_agency_search.screen.realty_agency_search.view_holder.h hVar2 = jVar6.f139032g;
                MapState mapStateA2 = MapState.a(hVar2.f139022b, null, new a.C5283a(avitoMapBounds, false), 8183);
                hVar2.f139022b = mapStateA2;
                hVar2.f139023c.setState(mapStateA2);
            }
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(Lw.b bVar) {
            f(bVar);
            return G0.f406611a;
        }
    }

    /* compiled from: RealtyAgencySearchFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<Lw.c, G0> {
        @Override // Y41.l
        public final G0 invoke(Lw.c cVar) {
            Lw.c cVar2 = cVar;
            RealtyAgencySearchFragment realtyAgencySearchFragment = (RealtyAgencySearchFragment) this.receiver;
            com.avito.android.realty_agency.inline_filters.m mVar = realtyAgencySearchFragment.f138237O0;
            if (mVar == null) {
                mVar = null;
            }
            c.d dVar = cVar2.f10240d;
            mVar.a(dVar.f10257b, dVar.f10259d, dVar.f10260e, dVar.f10258c);
            com.avito.android.developments_agency_search.screen.realty_agency_search.view_holder.j jVar = realtyAgencySearchFragment.f138236N0;
            if (jVar == null) {
                jVar = null;
            }
            com.avito.android.developments_agency_search.screen.realty_agency_search.view_holder.h hVar = jVar.f139032g;
            MapState mapState = hVar.f139022b;
            boolean z12 = mapState.f179618d instanceof a.c;
            c.h hVar2 = cVar2.f10247k;
            if (z12) {
                MapState mapStateA = MapState.a(mapState, hVar2.f10274a, null, 8190);
                hVar.f139022b = mapStateA;
                hVar.f139023c.setState(mapStateA);
            }
            jVar.a(hVar2.f10275b);
            BottomSheetBehavior<View> bottomSheetBehavior = jVar.f139036k;
            List<com.avito.conveyor_item.a> list = hVar2.f10277d;
            if (list != null) {
                jVar.f139031f.c(new UV0.c(list));
                jVar.f139030e.notifyDataSetChanged();
                bottomSheetBehavior.b(4);
            } else {
                com.avito.android.lib.util.b.a(bottomSheetBehavior);
            }
            UV0.c cVar3 = new UV0.c(hVar2.f10276c);
            jVar.f139028c.c(cVar3);
            jVar.f139029d.c(cVar3);
            jVar.f139034i.post(new com.avito.android.app.coldstart.d(jVar, 20));
            return G0.f406611a;
        }
    }

    /* compiled from: RealtyAgencySearchFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "<anonymous>", "(V)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.developments_agency_search.screen.realty_agency_search.RealtyAgencySearchFragment$onViewCreated$10", f = "RealtyAgencySearchFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Y41.p<G0, Continuation<? super G0>, Object> {
        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return RealtyAgencySearchFragment.this.new e(continuation);
        }

        @Override // Y41.p
        public final Object invoke(G0 g02, Continuation<? super G0> continuation) {
            return ((e) create(g02, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            a aVar = RealtyAgencySearchFragment.f138222V0;
            RealtyAgencySearchFragment.this.D5().accept(InterfaceC14443a.j.f10205a);
            return G0.f406611a;
        }
    }

    /* compiled from: RealtyAgencySearchFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LLw/a;", "action", "Lkotlin/G0;", "invoke", "(LLw/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<InterfaceC14443a, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC14443a interfaceC14443a) {
            a aVar = RealtyAgencySearchFragment.f138222V0;
            RealtyAgencySearchFragment.this.D5().accept(interfaceC14443a);
            return G0.f406611a;
        }
    }

    /* compiled from: RealtyAgencySearchFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/remote/model/SearchParams;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class g extends N implements Y41.a<SearchParams> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final SearchParams invoke() {
            a aVar = RealtyAgencySearchFragment.f138222V0;
            return RealtyAgencySearchFragment.this.D5().getState().getValue().f10238b;
        }
    }

    /* compiled from: RealtyAgencySearchFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<G0> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = RealtyAgencySearchFragment.f138222V0;
            RealtyAgencySearchFragment.this.D5().accept(InterfaceC14443a.i.f10204a);
            return G0.f406611a;
        }
    }

    /* compiled from: RealtyAgencySearchFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<G0> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = RealtyAgencySearchFragment.f138222V0;
            RealtyAgencySearchFragment.this.D5().accept(InterfaceC14443a.l.f10207a);
            return G0.f406611a;
        }
    }

    /* compiled from: RealtyAgencySearchFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isLoaded", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.l<Boolean, G0> {
        public j() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            a aVar = RealtyAgencySearchFragment.f138222V0;
            RealtyAgencySearchFragment.this.D5().accept(new InterfaceC14443a.m(zBooleanValue));
            return G0.f406611a;
        }
    }

    /* compiled from: RealtyAgencySearchFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/SearchParams;", "searchParams", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/model/SearchParams;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.l<SearchParams, G0> {
        public k() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(SearchParams searchParams) {
            a aVar = RealtyAgencySearchFragment.f138222V0;
            RealtyAgencySearchFragment.this.D5().accept(new InterfaceC14443a.q(searchParams));
            return G0.f406611a;
        }
    }

    /* compiled from: RealtyAgencySearchFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "id", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.l<String, G0> {
        public l() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            boolean zEquals = str.equals("map_development_tooltip-error_layout_item");
            RealtyAgencySearchFragment realtyAgencySearchFragment = RealtyAgencySearchFragment.this;
            if (zEquals) {
                a aVar = RealtyAgencySearchFragment.f138222V0;
                realtyAgencySearchFragment.D5().accept(InterfaceC14443a.d.C0643d.f10187a);
            } else {
                a aVar2 = RealtyAgencySearchFragment.f138222V0;
                realtyAgencySearchFragment.D5().accept(InterfaceC14443a.t.f10215a);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: RealtyAgencySearchFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "conditionUrl", "Lkotlin/G0;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.developments_agency_search.screen.realty_agency_search.RealtyAgencySearchFragment$onViewCreated$9", f = "RealtyAgencySearchFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class m extends SuspendLambda implements Y41.p<String, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f138261q;

        public m(Continuation<? super m> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            m mVar = RealtyAgencySearchFragment.this.new m(continuation);
            mVar.f138261q = obj;
            return mVar;
        }

        @Override // Y41.p
        public final Object invoke(String str, Continuation<? super G0> continuation) {
            return ((m) create(str, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            String str = (String) this.f138261q;
            a aVar = RealtyAgencySearchFragment.f138222V0;
            RealtyAgencySearchFragment.this.D5().accept(new InterfaceC14443a.r(str));
            return G0.f406611a;
        }
    }

    /* compiled from: RealtyAgencySearchFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LLw/a;", "action", "Lkotlin/G0;", "invoke", "(LLw/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements Y41.l<InterfaceC14443a, G0> {
        public n() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC14443a interfaceC14443a) {
            a aVar = RealtyAgencySearchFragment.f138222V0;
            RealtyAgencySearchFragment.this.D5().accept(interfaceC14443a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class o extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f138264l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(Y41.a aVar) {
            super(0);
            this.f138264l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f138264l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class p extends N implements Y41.a<Fragment> {
        public p() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return RealtyAgencySearchFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class q extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ p f138266l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(p pVar) {
            super(0);
            this.f138266l = pVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f138266l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class r extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f138267l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f138267l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f138267l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class s extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f138268l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f138268l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f138268l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: RealtyAgencySearchFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/p;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/developments_agency_search/screen/realty_agency_search/p;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class t extends N implements Y41.a<com.avito.android.developments_agency_search.screen.realty_agency_search.p> {
        public t() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.developments_agency_search.screen.realty_agency_search.p invoke() {
            com.avito.android.developments_agency_search.screen.realty_agency_search.q qVar = RealtyAgencySearchFragment.this.f138244t0;
            if (qVar == null) {
                qVar = null;
            }
            return (com.avito.android.developments_agency_search.screen.realty_agency_search.p) qVar.get();
        }
    }

    public RealtyAgencySearchFragment() {
        super(0, 1, null);
        o oVar = new o(new t());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new q(new p()));
        this.f138245u0 = new O0(m0.f406844a.b(com.avito.android.developments_agency_search.screen.realty_agency_search.p.class), new r(interfaceC42726CB), oVar, new s(interfaceC42726CB));
        this.f138235M0 = C42727D.c(new b());
    }

    public final com.avito.android.developments_agency_search.screen.realty_agency_search.p D5() {
        return (com.avito.android.developments_agency_search.screen.realty_agency_search.p) this.f138245u0.getValue();
    }

    @Override // com.avito.android.select.p
    @Y61.k
    public final InterfaceC19588c<? super InterfaceC19587b> E4(@Y61.k Arguments arguments) {
        Zp0.d dVar = this.f138225C0;
        if (dVar == null) {
            dVar = null;
        }
        return dVar.a(arguments);
    }

    @Override // com.avito.android.select.p
    public final void j(@Y61.k String str, @Y61.l String str2, @Y61.k List list) {
        InterfaceC31062w interfaceC31062w = this.f138224B0;
        if (interfaceC31062w == null) {
            interfaceC31062w = null;
        }
        interfaceC31062w.q(list);
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment, com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        WeakReference<Activity> weakReference;
        super.onCreate(bundle);
        final int i12 = 0;
        getChildFragmentManager().p0("big-filters-screen-result-key", this, new C(this) { // from class: com.avito.android.developments_agency_search.screen.realty_agency_search.d

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ RealtyAgencySearchFragment f138473c;

            {
                this.f138473c = this;
            }

            @Override // androidx.fragment.app.C
            public final void k(Bundle bundle2, String str) {
                RealtyAgencySearchFragment realtyAgencySearchFragment = this.f138473c;
                switch (i12) {
                    case 0:
                        RealtyAgencySearchFragment.a aVar = RealtyAgencySearchFragment.f138222V0;
                        SearchParams searchParams = (SearchParams) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle2.getParcelable("searchParams", SearchParams.class) : bundle2.getParcelable("searchParams"));
                        if (searchParams != null) {
                            com.avito.android.realty_agency.inline_filters.m mVar = realtyAgencySearchFragment.f138237O0;
                            if (mVar == null) {
                                mVar = null;
                            }
                            mVar.f251725b.z1(searchParams, null);
                            realtyAgencySearchFragment.D5().accept(new InterfaceC14443a.q(searchParams));
                            break;
                        }
                        break;
                    default:
                        RealtyAgencySearchFragment.a aVar2 = RealtyAgencySearchFragment.f138222V0;
                        SearchParams searchParams2 = (SearchParams) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle2.getParcelable("RealtyAgencySearch.search_params_bundle_id", SearchParams.class) : bundle2.getParcelable("RealtyAgencySearch.search_params_bundle_id"));
                        if (searchParams2 != null) {
                            com.avito.android.realty_agency.inline_filters.m mVar2 = realtyAgencySearchFragment.f138237O0;
                            if (mVar2 == null) {
                                mVar2 = null;
                            }
                            mVar2.f251725b.z1(searchParams2, null);
                            realtyAgencySearchFragment.D5().accept(new InterfaceC14443a.q(searchParams2));
                            break;
                        }
                        break;
                }
            }
        });
        final int i13 = 1;
        getChildFragmentManager().p0("RealtyAgencySearch.location_group_screen_result_key", this, new C(this) { // from class: com.avito.android.developments_agency_search.screen.realty_agency_search.d

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ RealtyAgencySearchFragment f138473c;

            {
                this.f138473c = this;
            }

            @Override // androidx.fragment.app.C
            public final void k(Bundle bundle2, String str) {
                RealtyAgencySearchFragment realtyAgencySearchFragment = this.f138473c;
                switch (i13) {
                    case 0:
                        RealtyAgencySearchFragment.a aVar = RealtyAgencySearchFragment.f138222V0;
                        SearchParams searchParams = (SearchParams) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle2.getParcelable("searchParams", SearchParams.class) : bundle2.getParcelable("searchParams"));
                        if (searchParams != null) {
                            com.avito.android.realty_agency.inline_filters.m mVar = realtyAgencySearchFragment.f138237O0;
                            if (mVar == null) {
                                mVar = null;
                            }
                            mVar.f251725b.z1(searchParams, null);
                            realtyAgencySearchFragment.D5().accept(new InterfaceC14443a.q(searchParams));
                            break;
                        }
                        break;
                    default:
                        RealtyAgencySearchFragment.a aVar2 = RealtyAgencySearchFragment.f138222V0;
                        SearchParams searchParams2 = (SearchParams) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle2.getParcelable("RealtyAgencySearch.search_params_bundle_id", SearchParams.class) : bundle2.getParcelable("RealtyAgencySearch.search_params_bundle_id"));
                        if (searchParams2 != null) {
                            com.avito.android.realty_agency.inline_filters.m mVar2 = realtyAgencySearchFragment.f138237O0;
                            if (mVar2 == null) {
                                mVar2 = null;
                            }
                            mVar2.f251725b.z1(searchParams2, null);
                            realtyAgencySearchFragment.D5().accept(new InterfaceC14443a.q(searchParams2));
                            break;
                        }
                        break;
                }
            }
        });
        com.avito.android.developments_agency_search.screen.realty_agency_search.p pVarD5 = D5();
        ActivityC22955m activityC22955mRequireActivity = requireActivity();
        C41383a c41383a = pVarD5.f138992N;
        if (activityC22955mRequireActivity == null) {
            weakReference = null;
        } else {
            c41383a.getClass();
            weakReference = new WeakReference<>(activityC22955mRequireActivity);
        }
        c41383a.f398594a = weakReference;
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f138246v0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f138246v0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, D5(), new c(1, this, RealtyAgencySearchFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchOneTimeEvent;)V", 0), new d(1, this, RealtyAgencySearchFragment.class, "render", "render(Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchState;)V", 0));
        return layoutInflater.inflate(R.layout.fragment_realty_agency_search, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        D5().f138992N.f398594a = null;
        super.onDestroy();
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        InterfaceC31062w interfaceC31062w = this.f138224B0;
        if (interfaceC31062w == null) {
            interfaceC31062w = null;
        }
        G.c(bundle, "inline_filters_state", interfaceC31062w.d0());
        com.avito.konveyor.item_visibility_tracker.b bVar = this.f138223A0;
        bundle.putBundle("item_visibility_tracker_state", (bVar != null ? bVar : null).d0());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        com.avito.android.permissions.q qVar = this.f138234L0;
        if (qVar == null) {
            qVar = null;
        }
        qVar.g(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        com.avito.android.permissions.q qVar = this.f138234L0;
        if (qVar == null) {
            qVar = null;
        }
        qVar.a();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        FragmentManager parentFragmentManager = getParentFragmentManager();
        String str = ((RealtyAgencySearchArguments) this.f138235M0.getValue()).f138665c;
        f fVar = new f();
        com.avito.konveyor.adapter.j jVar = this.f138247w0;
        com.avito.konveyor.adapter.j jVar2 = jVar != null ? jVar : null;
        com.avito.konveyor.adapter.a aVar = this.f138248x0;
        com.avito.konveyor.adapter.a aVar2 = aVar != null ? aVar : null;
        com.avito.konveyor.item_visibility_tracker.b bVar = this.f138223A0;
        com.avito.konveyor.item_visibility_tracker.b bVar2 = bVar != null ? bVar : null;
        com.avito.konveyor.adapter.j jVar3 = this.f138249y0;
        com.avito.konveyor.adapter.j jVar4 = jVar3 != null ? jVar3 : null;
        com.avito.konveyor.adapter.a aVar3 = this.f138250z0;
        com.avito.konveyor.adapter.a aVar4 = aVar3 != null ? aVar3 : null;
        com.avito.android.developments_agency_search.features.a aVar5 = this.f138243U0;
        if (aVar5 == null) {
            aVar5 = null;
        }
        aVar5.getClass();
        kotlin.reflect.n<Object> nVar = com.avito.android.developments_agency_search.features.a.f136535e[3];
        com.avito.android.developments_agency_search.screen.realty_agency_search.view_holder.j jVar5 = new com.avito.android.developments_agency_search.screen.realty_agency_search.view_holder.j(view, parentFragmentManager, str, fVar, jVar2, aVar2, bVar2, jVar4, aVar4, ((Boolean) aVar5.f136538d.a().invoke()).booleanValue());
        Lw.c value = D5().getState().getValue();
        AvitoMapBounds avitoMapBounds = value.f10246j.f10269e;
        if (avitoMapBounds != null) {
            com.avito.android.developments_agency_search.screen.realty_agency_search.view_holder.h hVar = jVar5.f139032g;
            MapState mapStateA = MapState.a(hVar.f139022b, null, new a.C5283a(avitoMapBounds, false), 8183);
            hVar.f139022b = mapStateA;
            hVar.f139023c.setState(mapStateA);
        }
        jVar5.a(value.f10247k.f10275b);
        this.f138236N0 = jVar5;
        FragmentManager parentFragmentManager2 = getParentFragmentManager();
        InterfaceC22983P viewLifecycleOwner = getViewLifecycleOwner();
        com.avito.android.util.text.a aVar6 = this.f138226D0;
        com.avito.android.util.text.a aVar7 = aVar6 != null ? aVar6 : null;
        com.avito.android.onboarding_manager.a aVar8 = this.f138227E0;
        com.avito.android.onboarding_manager.a aVar9 = aVar8 != null ? aVar8 : null;
        com.avito.android.onboarding_manager.f fVar2 = this.f138241S0;
        com.avito.android.onboarding_manager.f fVar3 = fVar2 != null ? fVar2 : null;
        com.avito.android.lib.beduin_v2.feature.item.b bVar3 = this.f138239Q0;
        com.avito.android.lib.beduin_v2.feature.item.b bVar4 = bVar3 != null ? bVar3 : null;
        Screen screen = this.f138238P0;
        Screen screen2 = screen != null ? screen : null;
        ScreenPerformanceTracker screenPerformanceTracker = this.f138246v0;
        ScreenPerformanceTracker screenPerformanceTracker2 = screenPerformanceTracker != null ? screenPerformanceTracker : null;
        InterfaceC13094a interfaceC13094a = this.f138240R0;
        InterfaceC13094a interfaceC13094a2 = interfaceC13094a != null ? interfaceC13094a : null;
        x xVar = D5().f138993O.f398526b;
        C27106d c27106d = D5().f138993O.f398527c;
        InterfaceC30999b interfaceC30999b = this.f138228F0;
        InterfaceC30999b interfaceC30999b2 = interfaceC30999b != null ? interfaceC30999b : null;
        com.avito.android.realty_agency.inline_filters.a aVar10 = this.f138229G0;
        com.avito.android.realty_agency.inline_filters.a aVar11 = aVar10 != null ? aVar10 : null;
        C36135w2 c36135w2 = this.f138242T0;
        C36135w2 c36135w22 = c36135w2 != null ? c36135w2 : null;
        InterfaceC31062w interfaceC31062w = this.f138224B0;
        com.avito.android.realty_agency.inline_filters.m mVar = new com.avito.android.realty_agency.inline_filters.m(view, this, parentFragmentManager2, viewLifecycleOwner, aVar7, aVar9, fVar3, bVar4, screen2, screenPerformanceTracker2, interfaceC13094a2, xVar, c27106d, interfaceC30999b2, aVar11, c36135w22, interfaceC31062w != null ? interfaceC31062w : null, new g(), new h(), new i(), new j(), new k());
        this.f138237O0 = mVar;
        InterfaceC31062w interfaceC31062w2 = this.f138224B0;
        if (interfaceC31062w2 == null) {
            interfaceC31062w2 = null;
        }
        interfaceC31062w2.w1(mVar, mVar, null, null, null);
        com.avito.android.developments_agency_search.adapter.error_layout.d dVar = this.f138232J0;
        if (dVar == null) {
            dVar = null;
        }
        dVar.e4(new l());
        com.avito.android.developments_agency_search.adapter.commission_promo_banner.d dVar2 = this.f138233K0;
        if (dVar2 == null) {
            dVar2 = null;
        }
        C43175k.K(new C43197r1(new m(null), dVar2.getF136254f()), C22981N.a(getLifecycle()));
        com.avito.android.developments_agency_search.adapter.commission_promo_banner.d dVar3 = this.f138233K0;
        if (dVar3 == null) {
            dVar3 = null;
        }
        C43175k.K(new C43197r1(new e(null), dVar3.getF136252d()), C22981N.a(getLifecycle()));
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f138246v0;
        if (screenPerformanceTracker3 == null) {
            screenPerformanceTracker3 = null;
        }
        screenPerformanceTracker3.d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        RealtyAgencySearchScreen realtyAgencySearchScreen = RealtyAgencySearchScreen.f138270d;
        C28478k c28478k = new C28478k(realtyAgencySearchScreen, com.avito.android.analytics.screens.s.c(this), null, 4, null);
        Kundle kundleA = bundle != null ? G.a(bundle, "inline_filters_state") : null;
        com.avito.android.developments_agency_search.screen.realty_agency_search.di.a.a().a(l1(), c28478k, (RealtyAgencySearchArguments) this.f138235M0.getValue(), (com.avito.android.developments_agency_search.screen.realty_agency_search.di.o) C29972i.a(C29972i.b(this), com.avito.android.developments_agency_search.screen.realty_agency_search.di.o.class), (InterfaceC44697a) C29972i.a(C29972i.b(this), InterfaceC44697a.class), cv.c.b(this), kundleA, new n(), realtyAgencySearchScreen, bundle != null ? bundle.getBundle("item_visibility_tracker_state") : null, (com.avito.android.deeplink_handler.view.impl.k) f5()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f138246v0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).a(fA2.b());
    }

    @Override // com.avito.android.select.p
    public final void q(@Y61.k String str) {
    }

    @Override // com.avito.android.select.p
    public final void s3(@Y61.k String str) {
    }
}
