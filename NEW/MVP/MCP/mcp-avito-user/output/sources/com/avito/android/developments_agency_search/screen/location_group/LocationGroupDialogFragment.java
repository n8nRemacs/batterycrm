package com.avito.android.developments_agency_search.screen.location_group;

import Cd.C13243a;
import Iw.C14165c;
import Iw.InterfaceC14163a;
import Iw.InterfaceC14164b;
import Iw.d;
import Y41.p;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.core.os.C22777e;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22981N;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.di.C29972i;
import com.avito.android.remote.model.District;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.metro_lines.MetroResponseBody;
import com.avito.android.search.filter.InterfaceC34581l;
import com.avito.android.search.filter.converter.ParameterElement;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35966w1;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.rx3.y;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import shark.AndroidResourceIdNames;
import z1.AbstractC50339a;

/* compiled from: LocationGroupDialogFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/location_group/LocationGroupDialogFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class LocationGroupDialogFragment extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: q0, reason: collision with root package name */
    @Y61.k
    public static final a f138049q0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public com.avito.android.developments_agency_search.screen.location_group.k f138050h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final O0 f138051i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f138052j0;

    /* renamed from: k0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f138053k0;

    /* renamed from: l0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f138054l0;

    /* renamed from: m0, reason: collision with root package name */
    @Inject
    public InterfaceC34581l f138055m0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.developments_agency_search.screen.location_group.a f138056n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f138057o0;

    /* renamed from: p0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.developments_agency_search.screen.location_group.i f138058p0;

    /* compiled from: LocationGroupDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/location_group/LocationGroupDialogFragment$a;", "", "<init>", "()V", "", "LOCATION_GROUP_DIALOG_ARGS", "Ljava/lang/String;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: LocationGroupDialogFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.developments_agency_search.screen.location_group.LocationGroupDialogFragment$a$a, reason: collision with other inner class name */
        public static final class C4163a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ LocationGroupArguments f138059l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4163a(LocationGroupArguments locationGroupArguments) {
                super(1);
                this.f138059l = locationGroupArguments;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("location_group_dialog_args", this.f138059l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static LocationGroupDialogFragment a(@Y61.k LocationGroupArguments locationGroupArguments) {
            LocationGroupDialogFragment locationGroupDialogFragment = new LocationGroupDialogFragment();
            C35966w1.a(locationGroupDialogFragment, -1, new C4163a(locationGroupArguments));
            return locationGroupDialogFragment;
        }

        public a() {
        }
    }

    /* compiled from: LocationGroupDialogFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/developments_agency_search/screen/location_group/LocationGroupArguments;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<LocationGroupArguments> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final LocationGroupArguments invoke() {
            Bundle bundleRequireArguments = LocationGroupDialogFragment.this.requireArguments();
            return (LocationGroupArguments) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("location_group_dialog_args", LocationGroupArguments.class) : bundleRequireArguments.getParcelable("location_group_dialog_args"));
        }
    }

    /* compiled from: LocationGroupDialogFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<InterfaceC14164b, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC14164b interfaceC14164b) {
            InterfaceC14164b interfaceC14164b2 = interfaceC14164b;
            LocationGroupDialogFragment locationGroupDialogFragment = (LocationGroupDialogFragment) this.receiver;
            a aVar = LocationGroupDialogFragment.f138049q0;
            locationGroupDialogFragment.getClass();
            if (interfaceC14164b2 instanceof InterfaceC14164b.C0494b) {
                InterfaceC42726C interfaceC42726C = locationGroupDialogFragment.f138057o0;
                String str = ((LocationGroupArguments) interfaceC42726C.getValue()).f138040c;
                locationGroupDialogFragment.getParentFragmentManager().o0(C22777e.b(new Q(((LocationGroupArguments) interfaceC42726C.getValue()).f138041d, ((InterfaceC14164b.C0494b) interfaceC14164b2).f8619a)), str);
            } else if (interfaceC14164b2 instanceof InterfaceC14164b.a) {
                locationGroupDialogFragment.dismiss();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LocationGroupDialogFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<C14165c, G0> {
        @Override // Y41.l
        public final G0 invoke(C14165c c14165c) {
            LocationGroupDialogFragment locationGroupDialogFragment = (LocationGroupDialogFragment) this.receiver;
            a aVar = LocationGroupDialogFragment.f138049q0;
            locationGroupDialogFragment.getClass();
            Iw.d dVar = c14165c.f8626f;
            if (dVar instanceof d.b) {
                com.avito.android.developments_agency_search.screen.location_group.i iVar = locationGroupDialogFragment.f138058p0;
                if (iVar != null) {
                    iVar.f138122d.k(null);
                }
            } else if (dVar instanceof d.c) {
                com.avito.android.developments_agency_search.screen.location_group.i iVar2 = locationGroupDialogFragment.f138058p0;
                if (iVar2 != null) {
                    iVar2.f138122d.a("");
                }
            } else if (dVar instanceof d.a) {
                com.avito.android.developments_agency_search.screen.location_group.i iVar3 = locationGroupDialogFragment.f138058p0;
                if (iVar3 != null) {
                    iVar3.f138122d.j();
                    iVar3.f138119a.c(new UV0.c(((d.a) dVar).f8627a));
                    RecyclerView.Adapter adapter = iVar3.f138121c.getAdapter();
                    if (adapter != null) {
                        adapter.notifyDataSetChanged();
                    }
                }
                locationGroupDialogFragment.f5().accept(InterfaceC14163a.j.f8617a);
            }
            ((com.avito.android.lib.design.bottom_sheet.d) locationGroupDialogFragment.getDialog()).w(dVar.a());
            return G0.f406611a;
        }
    }

    /* compiled from: LocationGroupDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LIw/a;", "action", "Lkotlin/G0;", "invoke", "(LIw/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<InterfaceC14163a, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC14163a interfaceC14163a) {
            a aVar = LocationGroupDialogFragment.f138049q0;
            LocationGroupDialogFragment.this.f5().accept(interfaceC14163a);
            return G0.f406611a;
        }
    }

    /* compiled from: LocationGroupDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<G0> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = LocationGroupDialogFragment.f138049q0;
            LocationGroupDialogFragment.this.f5().accept(InterfaceC14163a.h.f8615a);
            return G0.f406611a;
        }
    }

    /* compiled from: LocationGroupDialogFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class g extends C42801a implements p<ParameterElement, Continuation<? super G0>, Object>, SuspendFunction {
        @Y61.l
        public final Object a(@Y61.k ParameterElement parameterElement) {
            MetroResponseBody metroResponseBody;
            String locationId;
            LocationGroupDialogFragment locationGroupDialogFragment = (LocationGroupDialogFragment) this.receiver;
            a aVar = LocationGroupDialogFragment.f138049q0;
            locationGroupDialogFragment.getClass();
            if ((parameterElement instanceof ParameterElement.v) && L.f(parameterElement.f262689b, SearchParamsConverterKt.LOCATION_ID)) {
                com.avito.android.developments_agency_search.screen.location_group.a aVar2 = locationGroupDialogFragment.f138056n0;
                com.avito.android.realty_agency.inline_filters.location_suggest.a aVarB = (aVar2 != null ? aVar2 : null).b(locationGroupDialogFragment.requireContext(), (ParameterElement.v) parameterElement, locationGroupDialogFragment.f5().getState().getValue().f8622b.getLocationId(), new com.avito.android.developments_agency_search.screen.location_group.d(locationGroupDialogFragment));
                com.avito.android.lib.util.g.a(aVarB);
                aVarB.s();
            } else {
                boolean z12 = parameterElement instanceof ParameterElement.s;
                if (z12 && L.f(parameterElement.f262689b, SearchParamsConverterKt.DISTRICT_ID)) {
                    com.avito.android.developments_agency_search.screen.location_group.a aVar3 = locationGroupDialogFragment.f138056n0;
                    com.avito.android.developments_agency_search.screen.location_group.a aVar4 = aVar3 != null ? aVar3 : null;
                    Context contextRequireContext = locationGroupDialogFragment.requireContext();
                    ParameterElement.s sVar = (ParameterElement.s) parameterElement;
                    String locationId2 = locationGroupDialogFragment.f5().getState().getValue().f8622b.getLocationId();
                    List<District> list = locationGroupDialogFragment.f5().getState().getValue().f8623c;
                    if (list == null) {
                        list = C42784z0.f406748b;
                    }
                    List<District> list2 = list;
                    List<String> districtId = locationGroupDialogFragment.f5().getState().getValue().f8622b.getDistrictId();
                    if (districtId == null) {
                        districtId = C42784z0.f406748b;
                    }
                    aVar4.a(contextRequireContext, sVar, locationId2, list2, districtId, new com.avito.android.developments_agency_search.screen.location_group.e(locationGroupDialogFragment)).d();
                } else if (z12 && L.f(parameterElement.f262689b, SearchParamsConverterKt.METRO_ID) && (metroResponseBody = locationGroupDialogFragment.f5().getState().getValue().f8624d) != null && (locationId = locationGroupDialogFragment.f5().getState().getValue().f8622b.getLocationId()) != null) {
                    com.avito.android.developments_agency_search.screen.location_group.a aVar5 = locationGroupDialogFragment.f138056n0;
                    com.avito.android.developments_agency_search.screen.location_group.a aVar6 = aVar5 != null ? aVar5 : null;
                    Context contextRequireContext2 = locationGroupDialogFragment.requireContext();
                    FragmentManager parentFragmentManager = locationGroupDialogFragment.getParentFragmentManager();
                    ParameterElement.s sVar2 = (ParameterElement.s) parameterElement;
                    SearchParams searchParams = locationGroupDialogFragment.f5().getState().getValue().f8622b;
                    SearchParams searchParamsCopy = searchParams.copy(((-1234173943) & 1) != 0 ? searchParams.categoryId : null, ((-1234173943) & 2) != 0 ? searchParams.geoCoords : null, ((-1234173943) & 4) != 0 ? searchParams.locationId : null, ((-1234173943) & 8) != 0 ? searchParams.suggestLocationId : null, ((-1234173943) & 16) != 0 ? searchParams.metroIds : null, ((-1234173943) & 32) != 0 ? searchParams.directionId : null, ((-1234173943) & 64) != 0 ? searchParams.districtId : null, ((-1234173943) & 128) != 0 ? searchParams.params : null, ((-1234173943) & 256) != 0 ? searchParams.priceMax : null, ((-1234173943) & 512) != 0 ? searchParams.priceMin : null, ((-1234173943) & 1024) != 0 ? searchParams.query : null, ((-1234173943) & 2048) != 0 ? searchParams.title : null, ((-1234173943) & 4096) != 0 ? searchParams.owner : null, ((-1234173943) & 8192) != 0 ? searchParams.sort : null, ((-1234173943) & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? searchParams.withImagesOnly : null, ((-1234173943) & 32768) != 0 ? searchParams.searchRadius : null, ((-1234173943) & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? searchParams.radius : null, ((-1234173943) & 131072) != 0 ? searchParams.footWalkingMetro : null, ((-1234173943) & 262144) != 0 ? searchParams.withDeliveryOnly : null, ((-1234173943) & 524288) != 0 ? searchParams.localPriority : null, ((-1234173943) & 1048576) != 0 ? searchParams.earlyAccess : null, ((-1234173943) & 2097152) != 0 ? searchParams.moreExpensive : null, ((-1234173943) & 4194304) != 0 ? searchParams.widgetCategory : null, ((-1234173943) & 8388608) != 0 ? searchParams.expanded : null, ((-1234173943) & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? searchParams.sellerId : null, ((-1234173943) & 33554432) != 0 ? searchParams.cv2Vacancy : null, ((-1234173943) & 67108864) != 0 ? searchParams.displayType : null, ((-1234173943) & 134217728) != 0 ? searchParams.shopId : null, ((-1234173943) & 268435456) != 0 ? searchParams.forcedLocationForRecommendation : null, ((-1234173943) & 536870912) != 0 ? searchParams.area : null, ((-1234173943) & 1073741824) != 0 ? searchParams.source : null, ((-1234173943) & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? searchParams.clarifyIconType : null, (0 & 1) != 0 ? searchParams.drawId : null);
                    List<String> metroIds = locationGroupDialogFragment.f5().getState().getValue().f8622b.getMetroIds();
                    if (metroIds == null) {
                        metroIds = C42784z0.f406748b;
                    }
                    aVar6.c(contextRequireContext2, parentFragmentManager, sVar2, searchParamsCopy, locationId, metroResponseBody, metroIds, new com.avito.android.developments_agency_search.screen.location_group.f(locationGroupDialogFragment)).d();
                }
            }
            return G0.f406611a;
        }

        @Override // Y41.p
        public final /* bridge */ /* synthetic */ Object invoke(ParameterElement parameterElement, Continuation<? super G0> continuation) {
            return a(parameterElement);
        }
    }

    /* compiled from: LocationGroupDialogFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class h extends C42801a implements p<ParameterElement, Continuation<? super G0>, Object>, SuspendFunction {
        @Override // Y41.p
        public final Object invoke(ParameterElement parameterElement, Continuation<? super G0> continuation) {
            ParameterElement parameterElement2 = parameterElement;
            LocationGroupDialogFragment locationGroupDialogFragment = (LocationGroupDialogFragment) this.receiver;
            a aVar = LocationGroupDialogFragment.f138049q0;
            locationGroupDialogFragment.getClass();
            boolean z12 = parameterElement2 instanceof ParameterElement.s;
            if (z12 && L.f(parameterElement2.f262689b, SearchParamsConverterKt.DISTRICT_ID)) {
                locationGroupDialogFragment.f5().accept(InterfaceC14163a.b.f8609a);
            } else if (z12 && L.f(parameterElement2.f262689b, SearchParamsConverterKt.METRO_ID)) {
                locationGroupDialogFragment.f5().accept(InterfaceC14163a.e.f8612a);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f138063l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Y41.a aVar) {
            super(0);
            this.f138063l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f138063l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<Fragment> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return LocationGroupDialogFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ j f138065l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(j jVar) {
            super(0);
            this.f138065l = jVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f138065l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f138066l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f138066l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f138066l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f138067l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f138067l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f138067l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: LocationGroupDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/location_group/j;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/developments_agency_search/screen/location_group/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements Y41.a<com.avito.android.developments_agency_search.screen.location_group.j> {
        public n() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.developments_agency_search.screen.location_group.j invoke() {
            com.avito.android.developments_agency_search.screen.location_group.k kVar = LocationGroupDialogFragment.this.f138050h0;
            if (kVar == null) {
                kVar = null;
            }
            return (com.avito.android.developments_agency_search.screen.location_group.j) kVar.get();
        }
    }

    public LocationGroupDialogFragment() {
        super(0, 1, null);
        i iVar = new i(new n());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new k(new j()));
        this.f138051i0 = new O0(m0.f406844a.b(com.avito.android.developments_agency_search.screen.location_group.j.class), new l(interfaceC42726CB), iVar, new m(interfaceC42726CB));
        this.f138057o0 = C42727D.c(new b());
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.developments_agency_search.screen.location_group.di.a.a().a((LocationGroupArguments) this.f138057o0.getValue(), (com.avito.android.developments_agency_search.screen.location_group.di.c) C29972i.a(C29972i.b(this), com.avito.android.developments_agency_search.screen.location_group.di.c.class), new C28478k(LocationGroupScreen.f138069d, s.b(this), null, 4, null), getResources()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f138052j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final com.avito.android.developments_agency_search.screen.location_group.j f5() {
        return (com.avito.android.developments_agency_search.screen.location_group.j) this.f138051i0.getValue();
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(requireContext(), 0, 2, null);
        dVar.L(getString(R.string.das_filter_location_group_title), getString(R.string.das_filter_location_group_action_title), true, true);
        return dVar;
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment, androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f138052j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f138052j0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, f5(), new c(1, this, LocationGroupDialogFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/developments_agency_search/screen/location_group/mvi/entity/LocationGroupOneTimeEvent;)V", 0), new d(1, this, LocationGroupDialogFragment.class, "render", "render(Lcom/avito/android/developments_agency_search/screen/location_group/mvi/entity/LocationGroupState;)V", 0));
        return layoutInflater.inflate(R.layout.fragment_location_group, viewGroup, false);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@Y61.k DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        f5().accept(InterfaceC14163a.i.f8616a);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        com.avito.konveyor.adapter.j jVar = this.f138053k0;
        if (jVar == null) {
            jVar = null;
        }
        com.avito.konveyor.adapter.a aVar = this.f138054l0;
        if (aVar == null) {
            aVar = null;
        }
        this.f138058p0 = new com.avito.android.developments_agency_search.screen.location_group.i(new e(), view, aVar, jVar);
        com.avito.android.lib.design.bottom_sheet.d dVar = (com.avito.android.lib.design.bottom_sheet.d) getDialog();
        com.avito.android.lib.design.bottom_sheet.d.I(dVar, true);
        dVar.K(true);
        dVar.J(true);
        dVar.x(true);
        dVar.P(new f());
        InterfaceC34581l interfaceC34581l = this.f138055m0;
        if (interfaceC34581l == null) {
            interfaceC34581l = null;
        }
        C43175k.K(new C43197r1(new g(2, this, LocationGroupDialogFragment.class, "onParameterClicked", "onParameterClicked(Lcom/avito/android/search/filter/converter/ParameterElement;)V", 4), y.a(interfaceC34581l.getF263726t())), C22981N.a(getLifecycle()));
        InterfaceC34581l interfaceC34581l2 = this.f138055m0;
        if (interfaceC34581l2 == null) {
            interfaceC34581l2 = null;
        }
        C43175k.K(new C43197r1(new h(2, this, LocationGroupDialogFragment.class, "onParameterCleared", "onParameterCleared(Lcom/avito/android/search/filter/converter/ParameterElement;)V", 4), y.a(interfaceC34581l2.getF263725s())), C22981N.a(getLifecycle()));
        ScreenPerformanceTracker screenPerformanceTracker = this.f138052j0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }
}
