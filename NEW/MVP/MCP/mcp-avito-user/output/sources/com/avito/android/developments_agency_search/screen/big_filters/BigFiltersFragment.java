package com.avito.android.developments_agency_search.screen.big_filters;

import Cd.C13243a;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.core.os.C22777e;
import androidx.fragment.app.Fragment;
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
import com.avito.android.developments_agency_search.analytics.SearchFiltersSource;
import com.avito.android.developments_agency_search.screen.location_group.LocationGroupArguments;
import com.avito.android.developments_agency_search.screen.location_group.LocationGroupDialogFragment;
import com.avito.android.di.C29972i;
import com.avito.android.inline_filters.dialog.select.adapter.InlineItemType;
import com.avito.android.inline_filters.dialog.select.r;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.realty_agency.inline_filters_public.generated.api.api_2_nd_trx_developments_suggest_post.DevelopmentSuggestV1Suggest;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.remote.model.search.WidgetType;
import com.avito.android.search.filter.InterfaceC34581l;
import com.avito.android.search.filter.adapter.h;
import com.avito.android.search.filter.converter.ParameterElement;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35966w1;
import com.avito.android.util.D6;
import com.avito.android.util.P2;
import com.avito.android.util.y6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
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
import okhttp3.internal.ws.WebSocketProtocol;
import shark.AndroidResourceIdNames;
import vw.C49387a;
import ww.C49692c;
import ww.InterfaceC49690a;
import ww.InterfaceC49691b;
import ww.d;
import z1.AbstractC50339a;

/* compiled from: BigFiltersFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/big_filters/BigFiltersFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BigFiltersFragment extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public static final a f136550r0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public com.avito.android.developments_agency_search.screen.big_filters.p f136551h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final O0 f136552i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f136553j0;

    /* renamed from: k0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f136554k0;

    /* renamed from: l0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f136555l0;

    /* renamed from: m0, reason: collision with root package name */
    @Inject
    public InterfaceC34581l f136556m0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.search.filter.adapter.location_group.d f136557n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public C49387a f136558o0;

    /* renamed from: p0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f136559p0;

    /* renamed from: q0, reason: collision with root package name */
    public com.avito.android.developments_agency_search.screen.big_filters.m f136560q0;

    /* compiled from: BigFiltersFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/big_filters/BigFiltersFragment$a;", "", "<init>", "()V", "", "BIG_FILTERS_FRAGMENT_ARGS", "Ljava/lang/String;", "LOCATION_GROUP_SCREEN_RESULT_REQUEST_KEY", "LOCATION_GROUP_SCREEN_RESULT_SEARCH_PARAMS_BUNDLE_ID", "LOCATION_GROUP_SCREEN_TAG", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: BigFiltersFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.developments_agency_search.screen.big_filters.BigFiltersFragment$a$a, reason: collision with other inner class name */
        public static final class C4120a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ BigFiltersArguments f136561l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4120a(BigFiltersArguments bigFiltersArguments) {
                super(1);
                this.f136561l = bigFiltersArguments;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("big_filters_fragment_args", this.f136561l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static BigFiltersFragment a(@Y61.k BigFiltersArguments bigFiltersArguments) {
            BigFiltersFragment bigFiltersFragment = new BigFiltersFragment();
            C35966w1.a(bigFiltersFragment, -1, new C4120a(bigFiltersArguments));
            return bigFiltersFragment;
        }

        public a() {
        }
    }

    /* compiled from: BigFiltersFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/developments_agency_search/screen/big_filters/BigFiltersArguments;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<BigFiltersArguments> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final BigFiltersArguments invoke() {
            Bundle bundleRequireArguments = BigFiltersFragment.this.requireArguments();
            return (BigFiltersArguments) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("big_filters_fragment_args", BigFiltersArguments.class) : bundleRequireArguments.getParcelable("big_filters_fragment_args"));
        }
    }

    /* compiled from: BigFiltersFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<InterfaceC49691b, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC49691b interfaceC49691b) {
            InterfaceC49691b interfaceC49691b2 = interfaceC49691b;
            BigFiltersFragment bigFiltersFragment = (BigFiltersFragment) this.receiver;
            a aVar = BigFiltersFragment.f136550r0;
            bigFiltersFragment.getClass();
            if (interfaceC49691b2 instanceof InterfaceC49691b.d) {
                LocationGroupDialogFragment.a aVar2 = LocationGroupDialogFragment.f138049q0;
                SearchParams searchParams = ((InterfaceC49691b.d) interfaceC49691b2).f441872a;
                LocationGroupArguments locationGroupArguments = new LocationGroupArguments(searchParams.copy(((-1234173943) & 1) != 0 ? searchParams.categoryId : null, ((-1234173943) & 2) != 0 ? searchParams.geoCoords : null, ((-1234173943) & 4) != 0 ? searchParams.locationId : null, ((-1234173943) & 8) != 0 ? searchParams.suggestLocationId : null, ((-1234173943) & 16) != 0 ? searchParams.metroIds : null, ((-1234173943) & 32) != 0 ? searchParams.directionId : null, ((-1234173943) & 64) != 0 ? searchParams.districtId : null, ((-1234173943) & 128) != 0 ? searchParams.params : null, ((-1234173943) & 256) != 0 ? searchParams.priceMax : null, ((-1234173943) & 512) != 0 ? searchParams.priceMin : null, ((-1234173943) & 1024) != 0 ? searchParams.query : null, ((-1234173943) & 2048) != 0 ? searchParams.title : null, ((-1234173943) & 4096) != 0 ? searchParams.owner : null, ((-1234173943) & 8192) != 0 ? searchParams.sort : null, ((-1234173943) & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? searchParams.withImagesOnly : null, ((-1234173943) & 32768) != 0 ? searchParams.searchRadius : null, ((-1234173943) & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? searchParams.radius : null, ((-1234173943) & 131072) != 0 ? searchParams.footWalkingMetro : null, ((-1234173943) & 262144) != 0 ? searchParams.withDeliveryOnly : null, ((-1234173943) & 524288) != 0 ? searchParams.localPriority : null, ((-1234173943) & 1048576) != 0 ? searchParams.earlyAccess : null, ((-1234173943) & 2097152) != 0 ? searchParams.moreExpensive : null, ((-1234173943) & 4194304) != 0 ? searchParams.widgetCategory : null, ((-1234173943) & 8388608) != 0 ? searchParams.expanded : null, ((-1234173943) & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? searchParams.sellerId : null, ((-1234173943) & 33554432) != 0 ? searchParams.cv2Vacancy : null, ((-1234173943) & 67108864) != 0 ? searchParams.displayType : null, ((-1234173943) & 134217728) != 0 ? searchParams.shopId : null, ((-1234173943) & 268435456) != 0 ? searchParams.forcedLocationForRecommendation : null, ((-1234173943) & 536870912) != 0 ? searchParams.area : null, ((-1234173943) & 1073741824) != 0 ? searchParams.source : null, ((-1234173943) & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? searchParams.clarifyIconType : null, (0 & 1) != 0 ? searchParams.drawId : null), "location_group_screen_result_key", "search_params_bundle_id", bigFiltersFragment.f5().f136545e, bigFiltersFragment.f5().f136546f, bigFiltersFragment.f5().f136547g, bigFiltersFragment.f5().f136548h, bigFiltersFragment.f5().f136549i, SearchFiltersSource.f136327d, "prof_search");
                aVar2.getClass();
                com.avito.android.lib.util.g.b(LocationGroupDialogFragment.a.a(locationGroupArguments), bigFiltersFragment.requireContext(), bigFiltersFragment.getChildFragmentManager(), "LocationGroupDialogScreen");
            } else if (interfaceC49691b2 instanceof InterfaceC49691b.e) {
                com.avito.android.developments_agency_search.screen.big_filters.m mVar = bigFiltersFragment.f136560q0;
                if (mVar == null) {
                    mVar = null;
                }
                D6.G(mVar.f136672f, ((InterfaceC49691b.e) interfaceC49691b2).f441873a);
            } else if (interfaceC49691b2 instanceof InterfaceC49691b.C12837b) {
                bigFiltersFragment.g5().accept(InterfaceC49690a.h.f441865a);
            } else if (interfaceC49691b2 instanceof InterfaceC49691b.c) {
                String str = bigFiltersFragment.f5().f136543c;
                bigFiltersFragment.getParentFragmentManager().o0(C22777e.b(new Q(bigFiltersFragment.f5().f136544d, ((InterfaceC49691b.c) interfaceC49691b2).f441871a)), str);
            } else if (interfaceC49691b2 instanceof InterfaceC49691b.a) {
                bigFiltersFragment.dismiss();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: BigFiltersFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<C49692c, G0> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.l
        public final G0 invoke(C49692c c49692c) {
            String strA;
            C49692c c49692c2 = c49692c;
            BigFiltersFragment bigFiltersFragment = (BigFiltersFragment) this.receiver;
            a aVar = BigFiltersFragment.f136550r0;
            bigFiltersFragment.getClass();
            ww.d dVar = c49692c2.f441882h;
            if (dVar instanceof d.b) {
                com.avito.android.developments_agency_search.screen.big_filters.m mVar = bigFiltersFragment.f136560q0;
                if (mVar == null) {
                    mVar = null;
                }
                mVar.f136673g.k(null);
            } else if (dVar instanceof d.c) {
                com.avito.android.developments_agency_search.screen.big_filters.m mVar2 = bigFiltersFragment.f136560q0;
                if (mVar2 == null) {
                    mVar2 = null;
                }
                mVar2.f136673g.a("");
            } else if (dVar instanceof d.a) {
                com.avito.android.developments_agency_search.screen.big_filters.m mVar3 = bigFiltersFragment.f136560q0;
                if (mVar3 == null) {
                    mVar3 = null;
                }
                mVar3.f136673g.j();
                List<com.avito.conveyor_item.a> list = ((d.a) dVar).f441883a;
                mVar3.f136667a.c(new UV0.c(list));
                com.avito.android.search.filter.adapter.h hVar = mVar3.f136670d;
                RecyclerView recyclerView = mVar3.f136669c;
                if (hVar != null) {
                    recyclerView.r0(hVar);
                }
                com.avito.android.developments_agency_search.screen.big_filters.i iVar = new com.avito.android.developments_agency_search.screen.big_filters.i(y6.b(16));
                h.a aVar2 = new h.a(iVar);
                aVar2.f262348b = list;
                com.avito.android.search.filter.adapter.h hVar2 = new com.avito.android.search.filter.adapter.h(list, iVar, aVar2.f262349c, null);
                mVar3.f136670d = hVar2;
                recyclerView.l(hVar2, -1);
                RecyclerView.Adapter adapter = recyclerView.getAdapter();
                if (adapter != null) {
                    adapter.notifyDataSetChanged();
                }
                bigFiltersFragment.g5().accept(InterfaceC49690a.j.f441867a);
            }
            ((com.avito.android.lib.design.bottom_sheet.d) bigFiltersFragment.getDialog()).w(dVar.a());
            com.avito.android.developments_agency_search.screen.big_filters.m mVar4 = bigFiltersFragment.f136560q0;
            if (mVar4 == null) {
                mVar4 = null;
            }
            P2<Integer> p22 = c49692c2.f441881g;
            boolean z12 = p22 instanceof P2.c;
            if (p22 instanceof P2.b) {
                C49387a c49387a = bigFiltersFragment.f136558o0;
                strA = (c49387a != null ? c49387a : null).a(((Number) ((P2.b) p22).f318720a).intValue());
            } else {
                strA = "";
            }
            UU.a aVarA = UU.a.a(mVar4.f136671e, strA, false, z12, false, null, 1014);
            mVar4.f136671e = aVarA;
            mVar4.f136672f.setState(aVarA);
            return G0.f406611a;
        }
    }

    /* compiled from: BigFiltersFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lww/a;", "action", "Lkotlin/G0;", "invoke", "(Lww/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<InterfaceC49690a, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC49690a interfaceC49690a) {
            a aVar = BigFiltersFragment.f136550r0;
            BigFiltersFragment.this.g5().accept(interfaceC49690a);
            return G0.f406611a;
        }
    }

    /* compiled from: BigFiltersFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/conveyor_item/a;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/conveyor_item/a;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.developments_agency_search.screen.big_filters.BigFiltersFragment$onViewCreated$2", f = "BigFiltersFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Y41.p<com.avito.conveyor_item.a, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f136564q;

        public f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            f fVar = BigFiltersFragment.this.new f(continuation);
            fVar.f136564q = obj;
            return fVar;
        }

        @Override // Y41.p
        public final Object invoke(com.avito.conveyor_item.a aVar, Continuation<? super G0> continuation) {
            return ((f) create(aVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            com.avito.conveyor_item.a aVar = (com.avito.conveyor_item.a) this.f136564q;
            a aVar2 = BigFiltersFragment.f136550r0;
            BigFiltersFragment.this.g5().accept(new InterfaceC49690a.f(aVar));
            return G0.f406611a;
        }
    }

    /* compiled from: BigFiltersFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<G0> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = BigFiltersFragment.f136550r0;
            BigFiltersFragment.this.g5().accept(InterfaceC49690a.i.f441866a);
            return G0.f406611a;
        }
    }

    /* compiled from: BigFiltersFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class h extends C42801a implements Y41.p<ParameterElement, Continuation<? super G0>, Object>, SuspendFunction {
        @Override // Y41.p
        public final Object invoke(ParameterElement parameterElement, Continuation<? super G0> continuation) {
            ParameterElement parameterElement2 = parameterElement;
            BigFiltersFragment bigFiltersFragment = (BigFiltersFragment) this.receiver;
            a aVar = BigFiltersFragment.f136550r0;
            bigFiltersFragment.getClass();
            boolean z12 = parameterElement2 instanceof ParameterElement.v.b;
            if (z12 && L.f(parameterElement2.f262689b, "developerDevelopments")) {
                bigFiltersFragment.g5().accept(new InterfaceC49690a.d(new InlineFilterValue.InlineFilterDeveloperDevelopmentValue(null, null, null)));
            } else if (z12 && com.avito.android.developments_agency_search.screen.big_filters.k.b(parameterElement2.f262689b).equals("110684")) {
                bigFiltersFragment.g5().accept(new InterfaceC49690a.e(new InlineFilterValue.InlineFilterNumericRangeValue(null, null)));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: BigFiltersFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class i extends C42801a implements Y41.p<ParameterElement, Continuation<? super G0>, Object>, SuspendFunction {
        @Y61.l
        public final Object a(@Y61.k ParameterElement parameterElement) {
            Object next;
            Integer num;
            Integer num2;
            Long developerId;
            BigFiltersFragment bigFiltersFragment = (BigFiltersFragment) this.receiver;
            a aVar = BigFiltersFragment.f136550r0;
            bigFiltersFragment.getClass();
            boolean z12 = parameterElement instanceof ParameterElement.v.b;
            if (z12 && L.f(parameterElement.f262689b, "developerDevelopments")) {
                Boolean bool = Boolean.FALSE;
                String str = parameterElement.f262689b;
                String str2 = ((ParameterElement.v.b) parameterElement).f262840c;
                Filter filter = new Filter(null, str, null, null, str2, null, str2, bool, null, null, null, null, null, null, null, false, 59432, null);
                Context contextRequireContext = bigFiltersFragment.requireContext();
                String title = filter.getTitle();
                if (title == null) {
                    title = "";
                }
                String str3 = title;
                InlineFilterValue.InlineFilterDeveloperDevelopmentValue inlineFilterDeveloperDevelopmentValue = bigFiltersFragment.g5().getState().getValue().f441879e;
                String name = inlineFilterDeveloperDevelopmentValue.getName();
                com.avito.android.realty_agency.inline_filters.developer_suggest.d dVar = new com.avito.android.realty_agency.inline_filters.developer_suggest.d(contextRequireContext, str3, bigFiltersFragment.g5().getState().getValue().f441877c.getLocationId(), (name == null || ((developerId = inlineFilterDeveloperDevelopmentValue.getDeveloperId()) == null && (developerId = inlineFilterDeveloperDevelopmentValue.getDevelopmentId()) == null)) ? null : new DevelopmentSuggestV1Suggest(developerId.longValue(), name, inlineFilterDeveloperDevelopmentValue.getDeveloperId() != null ? DevelopmentSuggestV1Suggest.Type.Developer : DevelopmentSuggestV1Suggest.Type.Development), new com.avito.android.developments_agency_search.screen.big_filters.a(bigFiltersFragment), com.avito.android.developments_agency_search.screen.big_filters.b.f136576l);
                com.avito.android.lib.util.g.a(dVar);
                dVar.s();
            } else if (z12 && com.avito.android.developments_agency_search.screen.big_filters.k.b(parameterElement.f262689b).equals("110684")) {
                ParameterElement.v.b bVar = (ParameterElement.v.b) parameterElement;
                List<Cp0.e> list = bVar.f262862t;
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((Cp0.e) next).f2700e) {
                        break;
                    }
                }
                Cp0.e eVar = (Cp0.e) next;
                InlineFilterValue.InlineFilterNumericRangeValue inlineFilterNumericRangeValue = new InlineFilterValue.InlineFilterNumericRangeValue((eVar == null || (num2 = eVar.f2709n) == null) ? null : Long.valueOf(num2.intValue()), (eVar == null || (num = eVar.f2710o) == null) ? null : Long.valueOf(num.intValue()));
                ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
                for (Cp0.e eVar2 : list) {
                    arrayList.add(new Filter.InnerOptions.Options(eVar2.f2697b, eVar2.f2698c, null, null, null, null, null, null, eVar2.f2710o, eVar2.f2709n, 240, null));
                }
                Filter.InnerOptions innerOptions = new Filter.InnerOptions(null, null, arrayList, null);
                Filter.Widget widget = new Filter.Widget(WidgetType.Quarters, null, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT, null);
                List listSingletonList = Collections.singletonList(innerOptions);
                Boolean bool2 = Boolean.FALSE;
                String str4 = parameterElement.f262689b;
                String str5 = bVar.f262840c;
                Filter filter2 = new Filter(null, str4, widget, null, str5, null, str5, bool2, inlineFilterNumericRangeValue, listSingletonList, null, null, null, null, null, false, 59432, null);
                ArrayList arrayList2 = new ArrayList(C42745f0.q(list, 10));
                for (Cp0.e eVar3 : list) {
                    String str6 = eVar3.f2697b;
                    arrayList2.add(new com.avito.android.inline_filters.dialog.select.adapter.i(str6, str6, eVar3.f2698c, eVar3.f2700e, InlineItemType.f172063j, null, false, null, null, null, null, null, null, null, null, null, null, null, 262112, null));
                }
                new r(AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, bigFiltersFragment.requireContext(), Integer.valueOf(R.style.Theme_DesignSystem_Re23)), filter2, arrayList2, null, new com.avito.android.developments_agency_search.screen.big_filters.c(bigFiltersFragment), com.avito.android.developments_agency_search.screen.big_filters.d.f136584l, R.style.Re23_BottomSheet_Default, true, true).d();
            }
            return G0.f406611a;
        }

        @Override // Y41.p
        public final /* bridge */ /* synthetic */ Object invoke(ParameterElement parameterElement, Continuation<? super G0> continuation) {
            return a(parameterElement);
        }
    }

    /* compiled from: BigFiltersFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/search/filter/converter/ParameterElement$q;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/search/filter/converter/ParameterElement$q;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.developments_agency_search.screen.big_filters.BigFiltersFragment$onViewCreated$6", f = "BigFiltersFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Y41.p<ParameterElement.q, Continuation<? super G0>, Object> {
        public j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return BigFiltersFragment.this.new j(continuation);
        }

        @Override // Y41.p
        public final Object invoke(ParameterElement.q qVar, Continuation<? super G0> continuation) {
            return ((j) create(qVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            a aVar = BigFiltersFragment.f136550r0;
            BigFiltersFragment.this.g5().accept(InterfaceC49690a.c.f441860a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f136568l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Y41.a aVar) {
            super(0);
            this.f136568l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f136568l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<Fragment> {
        public l() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return BigFiltersFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l f136570l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(l lVar) {
            super(0);
            this.f136570l = lVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f136570l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f136571l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f136571l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f136571l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class o extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f136572l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f136572l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f136572l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: BigFiltersFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/big_filters/o;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/developments_agency_search/screen/big_filters/o;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class p extends N implements Y41.a<com.avito.android.developments_agency_search.screen.big_filters.o> {
        public p() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.developments_agency_search.screen.big_filters.o invoke() {
            com.avito.android.developments_agency_search.screen.big_filters.p pVar = BigFiltersFragment.this.f136551h0;
            if (pVar == null) {
                pVar = null;
            }
            return (com.avito.android.developments_agency_search.screen.big_filters.o) pVar.get();
        }
    }

    public BigFiltersFragment() {
        super(0, 1, null);
        k kVar = new k(new p());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new m(new l()));
        this.f136552i0 = new O0(m0.f406844a.b(com.avito.android.developments_agency_search.screen.big_filters.o.class), new n(interfaceC42726CB), kVar, new o(interfaceC42726CB));
        this.f136559p0 = C42727D.c(new b());
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.developments_agency_search.screen.big_filters.di.m.a().a(f5(), (com.avito.android.developments_agency_search.screen.big_filters.di.b) C29972i.a(C29972i.b(this), com.avito.android.developments_agency_search.screen.big_filters.di.b.class), cv.c.b(this), new C28478k(BigFiltersScreen.f136574d, s.b(this), null, 4, null), getResources()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f136553j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final BigFiltersArguments f5() {
        return (BigFiltersArguments) this.f136559p0.getValue();
    }

    public final com.avito.android.developments_agency_search.screen.big_filters.o g5() {
        return (com.avito.android.developments_agency_search.screen.big_filters.o) this.f136552i0.getValue();
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        getChildFragmentManager().p0("location_group_screen_result_key", this, new com.avito.android.beduin.ui.screen.fragment.bottom_sheet.c(this, 12));
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(requireContext(), 0, 2, null);
        dVar.L(getString(R.string.das_filter_screen_title), getString(R.string.das_filter_screen_action_title), true, true);
        return dVar;
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment, androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f136553j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f136553j0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, g5(), new c(1, this, BigFiltersFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersOneTimeEvent;)V", 0), new d(1, this, BigFiltersFragment.class, "render", "render(Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersState;)V", 0));
        return layoutInflater.inflate(R.layout.fragment_big_filters, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        com.avito.konveyor.adapter.j jVar = this.f136554k0;
        if (jVar == null) {
            jVar = null;
        }
        com.avito.konveyor.adapter.a aVar = this.f136555l0;
        if (aVar == null) {
            aVar = null;
        }
        this.f136560q0 = new com.avito.android.developments_agency_search.screen.big_filters.m(new e(), view, aVar, jVar);
        InterfaceC34581l interfaceC34581l = this.f136556m0;
        if (interfaceC34581l == null) {
            interfaceC34581l = null;
        }
        C43175k.K(new C43197r1(new f(null), C43175k.c(y.a(interfaceC34581l.getF263724r()), 0, 3)), C22981N.a(getLifecycle()));
        com.avito.android.lib.design.bottom_sheet.d dVar = (com.avito.android.lib.design.bottom_sheet.d) getDialog();
        com.avito.android.lib.design.bottom_sheet.d.I(dVar, true);
        dVar.K(true);
        dVar.J(true);
        dVar.x(true);
        dVar.P(new g());
        InterfaceC34581l interfaceC34581l2 = this.f136556m0;
        if (interfaceC34581l2 == null) {
            interfaceC34581l2 = null;
        }
        C43175k.K(new C43197r1(new h(2, this, BigFiltersFragment.class, "onParameterCleared", "onParameterCleared(Lcom/avito/android/search/filter/converter/ParameterElement;)V", 4), y.a(interfaceC34581l2.getF263725s())), C22981N.a(getLifecycle()));
        InterfaceC34581l interfaceC34581l3 = this.f136556m0;
        if (interfaceC34581l3 == null) {
            interfaceC34581l3 = null;
        }
        C43175k.K(new C43197r1(new i(2, this, BigFiltersFragment.class, "onParameterClicked", "onParameterClicked(Lcom/avito/android/search/filter/converter/ParameterElement;)V", 4), y.a(interfaceC34581l3.getF263726t())), C22981N.a(getLifecycle()));
        com.avito.android.search.filter.adapter.location_group.d dVar2 = this.f136557n0;
        if (dVar2 == null) {
            dVar2 = null;
        }
        C43175k.K(new C43197r1(new j(null), y.a(dVar2.l2())), C22981N.a(getLifecycle()));
        ScreenPerformanceTracker screenPerformanceTracker = this.f136553j0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }
}
