package com.avito.android.search.filter;

import android.content.Context;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.I1;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.ItemsSearchLink;
import com.avito.android.geo_common.interactor.InterfaceC30715a;
import com.avito.android.location.analytics.FindLocationPage;
import com.avito.android.permissions.InterfaceC33034d;
import com.avito.android.remote.model.Category;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.DistrictsWithRegions;
import com.avito.android.remote.model.Location;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.Radius;
import com.avito.android.remote.model.SearchParam;
import com.avito.android.remote.model.SearchParameters;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.SearchParamsSegmentParser;
import com.avito.android.remote.model.SerpSpaceType;
import com.avito.android.remote.model.category_parameters.AdditionalAreaParameter;
import com.avito.android.remote.model.category_parameters.AdditionalCategoryParameter;
import com.avito.android.remote.model.category_parameters.AdditionalCharParameter;
import com.avito.android.remote.model.category_parameters.AddressesSearchParameter;
import com.avito.android.remote.model.category_parameters.BannerCheckBoxWithImageParameter;
import com.avito.android.remote.model.category_parameters.BeduinParameter;
import com.avito.android.remote.model.category_parameters.BooleanParameter;
import com.avito.android.remote.model.category_parameters.BottomSheetGroupParameter;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.remote.model.category_parameters.DateRangeParameter;
import com.avito.android.remote.model.category_parameters.DistrictParameter;
import com.avito.android.remote.model.category_parameters.EmailParameter;
import com.avito.android.remote.model.category_parameters.GroupParameter;
import com.avito.android.remote.model.category_parameters.GuestsSelectParameter;
import com.avito.android.remote.model.category_parameters.IntParameter;
import com.avito.android.remote.model.category_parameters.KeywordsParameter;
import com.avito.android.remote.model.category_parameters.LocalPriorityParameter;
import com.avito.android.remote.model.category_parameters.LocationParameter;
import com.avito.android.remote.model.category_parameters.MetroParameter;
import com.avito.android.remote.model.category_parameters.MultiselectParameter;
import com.avito.android.remote.model.category_parameters.NumericParameter;
import com.avito.android.remote.model.category_parameters.PhoneParameter;
import com.avito.android.remote.model.category_parameters.PriceParameter;
import com.avito.android.remote.model.category_parameters.QuartersParameter;
import com.avito.android.remote.model.category_parameters.RadiusParameter;
import com.avito.android.remote.model.category_parameters.SectionedMultiselectParameter;
import com.avito.android.remote.model.category_parameters.SelectCategoryParameter;
import com.avito.android.remote.model.category_parameters.SelectDeepLinkParameter;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.SuggestLocationParameter;
import com.avito.android.remote.model.category_parameters.VideoParameter;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.recommendation_cards.RecommendationCardsParameter;
import com.avito.android.remote.model.counter.ChangingParametersForButtons;
import com.avito.android.remote.model.metro_lines.MetroResponseBody;
import com.avito.android.remote.model.search.map.Area;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.avito.android.search.filter.E.f;
import com.avito.android.search.filter.FiltersInteractor;
import com.avito.android.search.filter.di.f;
import com.avito.android.search.filter.di.o;
import com.avito.android.search.filter.location_filter.InteractorState;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Kundle;
import com.avito.android.util.O2;
import com.avito.android.util.P2;
import com.avito.android.util.rx3.C35896f0;
import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import io.reactivex.rxjava3.internal.operators.observable.C41984r1;
import io.reactivex.rxjava3.internal.operators.observable.R1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.text.C43066x;
import lW.InterfaceC43691a;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import shark.AndroidResourceIdNames;

/* compiled from: FiltersInteractor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/search/filter/E;", "Lcom/avito/android/search/filter/FiltersInteractor;", "a", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class E implements FiltersInteractor {

    /* renamed from: A, reason: collision with root package name */
    @Y61.l
    public Location f261752A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.l
    public ParametersTreeWithAdditional f261753B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.l
    public Coordinates f261754C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.l
    public ChangingParametersForButtons f261755D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.l
    public Boolean f261756E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.l
    public FiltersOverrideParams f261757F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.b<a> f261758G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f261759H;

    /* renamed from: I, reason: collision with root package name */
    @Y61.l
    public SearchParams f261760I;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.b<P2<ParametersTreeWithAdditional>> f261761J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.observable.L f261762K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final BK0.a<DeepLink> f261763L;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.categories.a f261764a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.geo_common.interactor.B f261765b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30715a f261766c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.geo_common.interactor.g f261767d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final h31.e<com.avito.android.remote.V0> f261768e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34547b f261769f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C1 f261770g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public SearchParams f261771h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public Area f261772i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final String f261773j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final PresentationType f261774k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final SearchParamsConverter f261775l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final w1 f261776m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.error.f f261777n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f261778o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final I1 f261779p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33034d f261780q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.location.find.l f261781r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43691a f261782s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final FiltersMode f261783t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.l
    public String f261784u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34565e f261785v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.search.filter.analytics.c f261786w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.preloading.j<com.avito.android.search.filter.preloading.c, kotlin.Q<List<Category>, P2<SearchParameters>>> f261787x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.search.filter.interactor.d f261788y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.l
    public LocationInfo f261789z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FiltersInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/E$a;", "", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f261790b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f261791c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ a[] f261792d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f261793e;

        static {
            a aVar = new a("SHOW_LOADER", 0);
            f261790b = aVar;
            a aVar2 = new a("START_UPDATE", 1);
            f261791c = aVar2;
            a[] aVarArr = {aVar, aVar2};
            f261792d = aVarArr;
            f261793e = kotlin.enums.c.a(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f261792d.clone();
        }
    }

    /* compiled from: FiltersInteractor.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/search/filter/E$a;", "kotlin.jvm.PlatformType", "it", "Lio/reactivex/rxjava3/core/E;", "Lcom/avito/android/util/P2;", "Lcom/avito/android/remote/model/counter/ChangingParametersForButtons;", "apply", "(Lcom/avito/android/search/filter/E$a;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T, R> implements l41.o {
        public e() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            if (((a) obj) == a.f261790b) {
                return io.reactivex.rxjava3.core.z.c0(P2.c.f318721a);
            }
            E e12 = E.this;
            e12.getClass();
            return io.reactivex.rxjava3.core.z.W(new CallableC34606y(e12, 0)).T(new N(e12), Integer.MAX_VALUE).d0(new O(e12)).I(new P(e12)).m0(new Q(e12)).x0(e12.f261778o.a());
        }
    }

    /* compiled from: FiltersInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/Location;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/Location;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f<T> implements l41.g {
        public f() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            E.this.f261752A = (Location) obj;
        }
    }

    @Inject
    public E(@Y61.k com.avito.android.categories.a aVar, @Y61.k com.avito.android.geo_common.interactor.B b12, @Y61.k InterfaceC30715a interfaceC30715a, @Y61.k com.avito.android.geo_common.interactor.g gVar, @Y61.k h31.e eVar, @Y61.k InterfaceC34547b interfaceC34547b, @Y61.k C1 c12, @Y61.l SearchParams searchParams, @Y61.l Area area, @o.f @Y61.l String str, @Y61.l @o.g PresentationType presentationType, @f.g @Y61.k SearchParamsConverter searchParamsConverter, @Y61.k w1 w1Var, @Y61.k com.avito.android.remote.error.f fVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k I1 i12, @o.b @Y61.l Kundle kundle, @Y61.k InterfaceC33034d interfaceC33034d, @Y61.k com.avito.android.location.find.l lVar, @Y61.k InterfaceC43691a interfaceC43691a, @Y61.k FiltersMode filtersMode, @o.j @Y61.l String str2, @Y61.k InterfaceC34565e interfaceC34565e, @Y61.k com.avito.android.search.filter.analytics.c cVar, @Y61.k com.avito.android.preloading.j jVar, @Y61.k com.avito.android.search.filter.interactor.d dVar) {
        this.f261764a = aVar;
        this.f261765b = b12;
        this.f261766c = interfaceC30715a;
        this.f261767d = gVar;
        this.f261768e = eVar;
        this.f261769f = interfaceC34547b;
        this.f261770g = c12;
        this.f261771h = searchParams;
        this.f261772i = area;
        this.f261773j = str;
        this.f261774k = presentationType;
        this.f261775l = searchParamsConverter;
        this.f261776m = w1Var;
        this.f261777n = fVar;
        this.f261778o = interfaceC35745a5;
        this.f261779p = i12;
        this.f261780q = interfaceC33034d;
        this.f261781r = lVar;
        this.f261782s = interfaceC43691a;
        this.f261783t = filtersMode;
        this.f261784u = str2;
        this.f261785v = interfaceC34565e;
        this.f261786w = cVar;
        this.f261787x = jVar;
        this.f261788y = dVar;
        this.f261789z = kundle != null ? (LocationInfo) kundle.d("location_info") : null;
        this.f261752A = kundle != null ? (Location) kundle.d("top_location") : null;
        this.f261753B = kundle != null ? (ParametersTreeWithAdditional) kundle.d("parameters_tree") : null;
        this.f261754C = kundle != null ? (Coordinates) kundle.d(ServiceTransportationWidget.LocationField.COORDINATES) : null;
        this.f261755D = kundle != null ? (ChangingParametersForButtons) kundle.d("last_counter_and_map_button") : null;
        this.f261756E = kundle != null ? kundle.a("last_updates_form") : null;
        this.f261757F = kundle != null ? (FiltersOverrideParams) kundle.d("last_override_params") : null;
        this.f261758G = new com.jakewharton.rxrelay3.b<>();
        this.f261759H = new io.reactivex.rxjava3.disposables.c();
        this.f261760I = kundle != null ? (SearchParams) kundle.d("reset_search_params") : null;
        com.jakewharton.rxrelay3.b<P2<ParametersTreeWithAdditional>> bVar = new com.jakewharton.rxrelay3.b<>();
        this.f261761J = bVar;
        this.f261763L = new BK0.a<>();
        io.reactivex.rxjava3.internal.operators.observable.L lB2 = bVar.B(C.f261749a);
        this.f261762K = lB2;
        lB2.t0(new D(this));
    }

    public static final void A(E e12, P2 p22) {
        e12.f261761J.accept(p22);
    }

    public static final io.reactivex.rxjava3.internal.operators.observable.P B(final Location location, final E e12) {
        io.reactivex.rxjava3.core.E eC02;
        final int i12 = 2;
        final int i13 = 1;
        final int i14 = 0;
        e12.getClass();
        if (location.getHasMetro()) {
            eC02 = new io.reactivex.rxjava3.internal.operators.observable.F(new l41.s(e12) { // from class: com.avito.android.search.filter.B

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ E f261746c;

                {
                    this.f261746c = e12;
                }

                @Override // l41.s
                public final Object get() {
                    switch (i14) {
                        case 0:
                            return this.f261746c.f261767d.m(location.getId());
                        case 1:
                            return this.f261746c.f261766c.a(location.getId());
                        default:
                            return this.f261746c.f261766c.i(location.getId());
                    }
                }
            });
        } else {
            C42784z0 c42784z0 = C42784z0.f406748b;
            eC02 = io.reactivex.rxjava3.core.z.c0(new MetroResponseBody(c42784z0, c42784z0));
        }
        io.reactivex.rxjava3.core.E f12 = location.getHasDistricts() ? new io.reactivex.rxjava3.internal.operators.observable.F(new l41.s(e12) { // from class: com.avito.android.search.filter.B

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ E f261746c;

            {
                this.f261746c = e12;
            }

            @Override // l41.s
            public final Object get() {
                switch (i13) {
                    case 0:
                        return this.f261746c.f261767d.m(location.getId());
                    case 1:
                        return this.f261746c.f261766c.a(location.getId());
                    default:
                        return this.f261746c.f261766c.i(location.getId());
                }
            }
        }) : io.reactivex.rxjava3.core.z.c0(DistrictsWithRegions.INSTANCE.getEMPTY());
        io.reactivex.rxjava3.core.E f13 = location.getHasDirections() ? new io.reactivex.rxjava3.internal.operators.observable.F(new l41.s(e12) { // from class: com.avito.android.search.filter.B

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ E f261746c;

            {
                this.f261746c = e12;
            }

            @Override // l41.s
            public final Object get() {
                switch (i12) {
                    case 0:
                        return this.f261746c.f261767d.m(location.getId());
                    case 1:
                        return this.f261746c.f261766c.a(location.getId());
                    default:
                        return this.f261746c.f261766c.i(location.getId());
                }
            }
        }) : io.reactivex.rxjava3.core.z.c0(C42784z0.f406748b);
        io.reactivex.rxjava3.core.z<Location> zVarF = e12.F();
        l41.o oVarO = io.reactivex.rxjava3.internal.functions.a.o(new Y(location, e12));
        int i15 = AbstractC41777j.f401972b;
        io.reactivex.rxjava3.internal.functions.b.a(i15, "bufferSize");
        return new R1(new io.reactivex.rxjava3.core.E[]{zVarF, eC02, f12, f13}, null, oVarO, i15).J(io.reactivex.rxjava3.internal.functions.a.f401993c, new Z(e12));
    }

    public static /* synthetic */ io.reactivex.rxjava3.internal.operators.observable.O J(E e12, Boolean bool, FiltersOverrideParams filtersOverrideParams, int i12) {
        if ((i12 & 4) != 0) {
            filtersOverrideParams = null;
        }
        return e12.I(bool, null, filtersOverrideParams);
    }

    public final String C() {
        Map<String, SearchParam<?>> params;
        SearchParam<?> searchParam;
        String value;
        ParametersTreeWithAdditional parametersTreeWithAdditional = this.f261753B;
        AdditionalCategoryParameter additionalCategoryParameterA = parametersTreeWithAdditional != null ? parametersTreeWithAdditional.a("itemListId") : null;
        AdditionalCharParameter additionalCharParameter = additionalCategoryParameterA instanceof AdditionalCharParameter ? (AdditionalCharParameter) additionalCategoryParameterA : null;
        if (additionalCharParameter != null && (value = additionalCharParameter.getValue()) != null) {
            return value;
        }
        SearchParams searchParams = this.f261771h;
        Object value2 = (searchParams == null || (params = searchParams.getParams()) == null || (searchParam = params.get("166812")) == null) ? null : searchParam.getValue();
        if (value2 instanceof String) {
            return (String) value2;
        }
        return null;
    }

    public final String D() {
        String value;
        ParametersTreeWithAdditional parametersTreeWithAdditional = this.f261753B;
        AdditionalCategoryParameter additionalCategoryParameterA = parametersTreeWithAdditional != null ? parametersTreeWithAdditional.a(SearchParamsConverterKt.SELLER_ID) : null;
        AdditionalCharParameter additionalCharParameter = additionalCategoryParameterA instanceof AdditionalCharParameter ? (AdditionalCharParameter) additionalCategoryParameterA : null;
        if (additionalCharParameter != null && (value = additionalCharParameter.getValue()) != null) {
            return value;
        }
        SearchParams searchParams = this.f261771h;
        if (searchParams != null) {
            return searchParams.getSellerId();
        }
        return null;
    }

    public final String E() {
        String value;
        ParametersTreeWithAdditional parametersTreeWithAdditional = this.f261753B;
        AdditionalCategoryParameter additionalCategoryParameterA = parametersTreeWithAdditional != null ? parametersTreeWithAdditional.a(SearchParamsConverterKt.SHOP_ID) : null;
        AdditionalCharParameter additionalCharParameter = additionalCategoryParameterA instanceof AdditionalCharParameter ? (AdditionalCharParameter) additionalCategoryParameterA : null;
        if (additionalCharParameter != null && (value = additionalCharParameter.getValue()) != null) {
            return value;
        }
        SearchParams searchParams = this.f261771h;
        if (searchParams != null) {
            return searchParams.getShopId();
        }
        return null;
    }

    public final io.reactivex.rxjava3.core.z<Location> F() {
        I1 i12 = this.f261779p;
        i12.getClass();
        kotlin.reflect.n<Object> nVar = I1.f67278k0[12];
        if (((Boolean) i12.f67326m.a().invoke()).booleanValue()) {
            return this.f261765b.e();
        }
        Location location = this.f261752A;
        return location != null ? io.reactivex.rxjava3.core.z.c0(location) : new io.reactivex.rxjava3.internal.operators.observable.F(new l41.s() { // from class: com.avito.android.search.filter.z
            @Override // l41.s
            public final Object get() {
                E e12 = this.f263817b;
                return e12.f261765b.f().K(e12.new f());
            }
        });
    }

    public final ArrayList G(List list, List list2) {
        ArrayList arrayList;
        Iterator it = list.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            }
            if (((ParameterSlot) it.next()) instanceof SelectCategoryParameter) {
                break;
            }
            i12++;
        }
        if (i12 != -1) {
            arrayList = new ArrayList(list);
            SelectCategoryParameter selectCategoryParameter = (SelectCategoryParameter) list.get(i12);
            arrayList.addAll(i12 + 1, this.f261769f.a(list2, selectCategoryParameter.getValue(), selectCategoryParameter.getDisplaying(), O2.a(selectCategoryParameter.getValues()) ? selectCategoryParameter.getValues() : null));
        } else {
            List<ParameterSlot> list3 = list;
            arrayList = new ArrayList(C42745f0.q(list3, 10));
            for (ParameterSlot groupParameter : list3) {
                if (groupParameter instanceof GroupParameter) {
                    String id2 = groupParameter.getId();
                    GroupParameter groupParameter2 = (GroupParameter) groupParameter;
                    String title = groupParameter2.getTitle();
                    List<ParameterSlot> parameters = groupParameter2.getParameters();
                    if (parameters == null) {
                        parameters = C42784z0.f406748b;
                    }
                    groupParameter = new GroupParameter(id2, title, G(parameters, list2), groupParameter2.getVisible(), groupParameter2.getPhantom(), groupParameter2.getRichTitle(), groupParameter2.getDescription(), groupParameter2.getIsNew(), groupParameter2.getPayload(), null, 512, null);
                }
                arrayList.add(groupParameter);
            }
        }
        return arrayList;
    }

    public final String H() {
        String value;
        ParametersTreeWithAdditional parametersTreeWithAdditional = this.f261753B;
        AdditionalCategoryParameter additionalCategoryParameterA = parametersTreeWithAdditional != null ? parametersTreeWithAdditional.a(SearchParamsConverterKt.EXPANDED) : null;
        AdditionalCharParameter additionalCharParameter = additionalCategoryParameterA instanceof AdditionalCharParameter ? (AdditionalCharParameter) additionalCategoryParameterA : null;
        if (additionalCharParameter != null && (value = additionalCharParameter.getValue()) != null) {
            return value;
        }
        SearchParams searchParams = this.f261771h;
        if (searchParams != null) {
            return searchParams.getExpanded();
        }
        return null;
    }

    public final io.reactivex.rxjava3.internal.operators.observable.O I(Boolean bool, SearchParams searchParams, FiltersOverrideParams filtersOverrideParams) {
        Coordinates coordinates;
        io.reactivex.rxjava3.core.z zVarX0;
        Radius value;
        this.f261756E = bool;
        this.f261757F = filtersOverrideParams;
        ParametersTreeWithAdditional parametersTreeWithAdditional = this.f261753B;
        if (kotlin.jvm.internal.L.f(bool, Boolean.TRUE) || parametersTreeWithAdditional == null || parametersTreeWithAdditional.isEmpty() || searchParams != null) {
            Area area = this.f261772i;
            if (parametersTreeWithAdditional != null) {
                RadiusParameter radiusParameter = (RadiusParameter) parametersTreeWithAdditional.getFirstParameterOfType(RadiusParameter.class);
                coordinates = (radiusParameter == null || (value = radiusParameter.getValue()) == null) ? null : value.getCoordinates();
            } else {
                coordinates = null;
            }
            ParametersTreeWithAdditional parametersTreeWithAdditional2 = this.f261753B;
            AdditionalCategoryParameter additionalCategoryParameterA = parametersTreeWithAdditional2 != null ? parametersTreeWithAdditional2.a(SearchParamsConverterKt.DRAW_ID) : null;
            AdditionalCharParameter additionalCharParameter = additionalCategoryParameterA instanceof AdditionalCharParameter ? (AdditionalCharParameter) additionalCategoryParameterA : null;
            zVarX0 = new io.reactivex.rxjava3.internal.operators.observable.C(new com.avito.android.preloading.e(this.f261787x, new com.avito.android.search.filter.preloading.c(searchParams, area, filtersOverrideParams, coordinates, additionalCharParameter != null ? additionalCharParameter.getValue() : null, this.f261784u, parametersTreeWithAdditional, this.f261771h))).y0(new U(this)).m0(new V(this)).x0(this.f261778o.a());
        } else {
            zVarX0 = io.reactivex.rxjava3.core.z.c0(new P2.b(parametersTreeWithAdditional));
        }
        return zVarX0.K(new W(filtersOverrideParams, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> void K(com.avito.android.remote.model.category_parameters.base.EditableParameter<T> r5, T r6, java.lang.String r7) {
        /*
            r4 = this;
            java.lang.Object r0 = r5.getValue()
            r5.setOldValue(r0)
            r5.setValue(r6)
            r5.setSelectedParameterTitle(r7)
            java.lang.String r5 = r5.getId()
            int r0 = r5.hashCode()
            r1 = -1313322582(0xffffffffb1b849aa, float:-5.3634794E-9)
            java.lang.String r2 = "parameter_id_categories"
            java.lang.String r3 = "parameter_id_subcategories"
            if (r0 == r1) goto L5a
            r1 = 3536286(0x35f59e, float:4.955392E-39)
            if (r0 == r1) goto L32
            r6 = 1902960142(0x716cde0e, float:1.17291056E30)
            if (r0 == r6) goto L2a
            goto Lbe
        L2a:
            boolean r5 = r5.equals(r3)
            if (r5 != 0) goto L62
            goto Lbe
        L32:
            java.lang.String r7 = "sort"
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L3c
            goto Lbe
        L3c:
            java.lang.String r5 = "distance"
            boolean r5 = kotlin.jvm.internal.L.f(r6, r5)
            if (r5 == 0) goto Lbe
            com.avito.android.location.analytics.FindLocationPage r5 = com.avito.android.location.analytics.FindLocationPage.f181725c
            lW.a r5 = r4.f261782s
            java.lang.String r6 = "distance_sort"
            r5.e(r6)
            com.avito.android.permissions.d r5 = r4.f261780q
            io.reactivex.rxjava3.internal.observers.y r5 = r5.g()
            io.reactivex.rxjava3.disposables.c r6 = r4.f261759H
            r6.b(r5)
            goto Lbe
        L5a:
            boolean r5 = r5.equals(r2)
            if (r5 != 0) goto L62
            goto Lbe
        L62:
            com.avito.android.search.filter.ParametersTreeWithAdditional r5 = r4.f261753B
            r6 = 0
            if (r5 == 0) goto L70
            java.lang.Class<com.avito.android.remote.model.category_parameters.SelectCategoryParameter> r0 = com.avito.android.remote.model.category_parameters.SelectCategoryParameter.class
            com.avito.android.remote.model.category_parameters.base.ParameterSlot r5 = r5.getFirstParameterOfType(r0)
            com.avito.android.remote.model.category_parameters.SelectCategoryParameter r5 = (com.avito.android.remote.model.category_parameters.SelectCategoryParameter) r5
            goto L71
        L70:
            r5 = r6
        L71:
            if (r5 == 0) goto Lbe
            com.avito.android.search.filter.ParametersTreeWithAdditional r0 = r4.f261753B
            if (r0 == 0) goto L7c
            com.avito.android.remote.model.category_parameters.base.ParameterSlot r0 = r0.findParameter(r3)
            goto L7d
        L7c:
            r0 = r6
        L7d:
            boolean r1 = r0 instanceof com.avito.android.remote.model.category_parameters.base.EditableParameter
            if (r1 == 0) goto L8f
            com.avito.android.remote.model.category_parameters.base.EditableParameter r0 = (com.avito.android.remote.model.category_parameters.base.EditableParameter) r0
            java.lang.Object r0 = r0.getValue()
            boolean r1 = r0 instanceof java.lang.String
            if (r1 != 0) goto L8c
            r0 = r6
        L8c:
            java.lang.String r0 = (java.lang.String) r0
            goto L90
        L8f:
            r0 = r6
        L90:
            if (r0 != 0) goto Laf
            com.avito.android.search.filter.ParametersTreeWithAdditional r0 = r4.f261753B
            if (r0 == 0) goto L9b
            com.avito.android.remote.model.category_parameters.base.ParameterSlot r0 = r0.findParameter(r2)
            goto L9c
        L9b:
            r0 = r6
        L9c:
            boolean r1 = r0 instanceof com.avito.android.remote.model.category_parameters.base.EditableParameter
            if (r1 == 0) goto Lae
            com.avito.android.remote.model.category_parameters.base.EditableParameter r0 = (com.avito.android.remote.model.category_parameters.base.EditableParameter) r0
            java.lang.Object r0 = r0.getValue()
            boolean r1 = r0 instanceof java.lang.String
            if (r1 != 0) goto Lab
            r0 = r6
        Lab:
            java.lang.String r0 = (java.lang.String) r0
            goto Laf
        Lae:
            r0 = r6
        Laf:
            if (r0 != 0) goto Lb2
            goto Lb8
        Lb2:
            com.avito.android.categories.a r6 = r4.f261764a
            com.avito.android.remote.model.Category r6 = r6.b(r0)
        Lb8:
            r5.setValue(r6)
            r5.setSelectedParameterTitle(r7)
        Lbe:
            com.avito.android.search.filter.E$a r5 = com.avito.android.search.filter.E.a.f261790b
            com.jakewharton.rxrelay3.b<com.avito.android.search.filter.E$a> r6 = r4.f261758G
            r6.accept(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.search.filter.E.K(com.avito.android.remote.model.category_parameters.base.EditableParameter, java.lang.Object, java.lang.String):void");
    }

    @Override // com.avito.android.search.filter.FiltersInteractor
    public final void S() {
        this.f261782s.f(null, "PERMISSION DENIED");
        this.f261759H.b(this.f261780q.h());
    }

    @Override // com.avito.android.search.filter.FiltersInteractor
    public final void a(@Y61.k Context context) {
        this.f261781r.a(context);
    }

    @Override // com.avito.android.search.filter.FiltersInteractor
    public final void b() {
        this.f261782s.g();
    }

    @Override // com.avito.android.search.filter.FiltersInteractor
    public final void c(@Y61.k Context context) {
        this.f261781r.c(context);
    }

    @Override // com.avito.android.search.filter.FiltersInteractor
    public final void d(@Y61.l String str) {
        if (str != null) {
            this.f261782s.f(null, str);
        }
    }

    @Override // com.avito.android.search.filter.FiltersInteractor
    @Y61.k
    public final Kundle d0() {
        Kundle kundle = new Kundle();
        kundle.j(this.f261789z, "location_info");
        kundle.j(this.f261752A, "top_location");
        kundle.j(this.f261753B, "parameters_tree");
        kundle.j(this.f261754C, ServiceTransportationWidget.LocationField.COORDINATES);
        kundle.h(this.f261756E, "last_updates_form");
        kundle.j(this.f261757F, "last_override_params");
        kundle.j(this.f261755D, "last_counter_and_map_button");
        kundle.j(this.f261760I, "reset_search_params");
        return kundle;
    }

    @Override // com.avito.android.search.filter.FiltersInteractor
    public final void e(@Y61.k ActivityC22955m activityC22955m) {
        io.reactivex.rxjava3.core.z zVarB = this.f261781r.b(activityC22955m, (4 & 2) == 0, (4 & 4) == 0);
        K k12 = new K(this);
        L l12 = new L(this);
        zVarB.getClass();
        this.f261759H.b(zVarB.v0(k12, l12, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.search.filter.FiltersInteractor
    @Y61.k
    public final SearchParams f() {
        SearchParams searchParamsA;
        String str;
        String str2;
        Coordinates coordinates;
        RadiusParameter radiusParameter;
        Radius value;
        String value2;
        ParametersTreeWithAdditional parametersTreeWithAdditional = this.f261753B;
        Coordinates coordinates2 = null;
        if (parametersTreeWithAdditional != null) {
            AdditionalCategoryParameter additionalCategoryParameterA = parametersTreeWithAdditional.a(SearchParamsConverterKt.DRAW_ID);
            String value3 = (additionalCategoryParameterA == null || !(additionalCategoryParameterA instanceof AdditionalCharParameter)) ? null : ((AdditionalCharParameter) additionalCategoryParameterA).getValue();
            AdditionalCategoryParameter additionalCategoryParameterA2 = parametersTreeWithAdditional.a(SearchParamsConverterKt.SELLER_ID);
            AdditionalCharParameter additionalCharParameter = additionalCategoryParameterA2 instanceof AdditionalCharParameter ? (AdditionalCharParameter) additionalCategoryParameterA2 : null;
            if (additionalCharParameter == null || (value2 = additionalCharParameter.getValue()) == null) {
                value2 = null;
            }
            str2 = value3;
            str = value2;
            searchParamsA = this.f261776m.a(parametersTreeWithAdditional);
        } else {
            SearchParams searchParams = this.f261771h;
            if (searchParams == null) {
                searchParams = new SearchParams(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 1, null);
            }
            searchParamsA = searchParams;
            str = null;
            str2 = null;
        }
        SearchParams searchParams2 = this.f261771h;
        String query = searchParams2 != null ? searchParams2.getQuery() : null;
        ParametersTreeWithAdditional parametersTreeWithAdditional2 = this.f261753B;
        Coordinates coordinates3 = (parametersTreeWithAdditional2 == null || (radiusParameter = (RadiusParameter) parametersTreeWithAdditional2.getFirstParameterOfType(RadiusParameter.class)) == null || (value = radiusParameter.getValue()) == null) ? null : value.getCoordinates();
        if (this.f261754C == null) {
            this.f261754C = searchParamsA.getGeoCoords();
            if (kotlin.jvm.internal.L.f(searchParamsA.getSort(), "distance") && coordinates3 == null) {
                FindLocationPage findLocationPage = FindLocationPage.f181725c;
                this.f261782s.e("distance_sort");
                this.f261759H.b(this.f261780q.g());
            }
        }
        if (!kotlin.jvm.internal.L.f(searchParamsA.getSort(), "distance") || coordinates3 != null) {
            if (coordinates3 != null) {
                coordinates = coordinates3;
            }
            return searchParamsA.copy(((-1234173943) & 1) != 0 ? searchParamsA.categoryId : null, ((-1234173943) & 2) != 0 ? searchParamsA.geoCoords : coordinates, ((-1234173943) & 4) != 0 ? searchParamsA.locationId : null, ((-1234173943) & 8) != 0 ? searchParamsA.suggestLocationId : null, ((-1234173943) & 16) != 0 ? searchParamsA.metroIds : null, ((-1234173943) & 32) != 0 ? searchParamsA.directionId : null, ((-1234173943) & 64) != 0 ? searchParamsA.districtId : null, ((-1234173943) & 128) != 0 ? searchParamsA.params : null, ((-1234173943) & 256) != 0 ? searchParamsA.priceMax : null, ((-1234173943) & 512) != 0 ? searchParamsA.priceMin : null, ((-1234173943) & 1024) != 0 ? searchParamsA.query : query, ((-1234173943) & 2048) != 0 ? searchParamsA.title : null, ((-1234173943) & 4096) != 0 ? searchParamsA.owner : null, ((-1234173943) & 8192) != 0 ? searchParamsA.sort : null, ((-1234173943) & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? searchParamsA.withImagesOnly : null, ((-1234173943) & 32768) != 0 ? searchParamsA.searchRadius : null, ((-1234173943) & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? searchParamsA.radius : null, ((-1234173943) & 131072) != 0 ? searchParamsA.footWalkingMetro : null, ((-1234173943) & 262144) != 0 ? searchParamsA.withDeliveryOnly : null, ((-1234173943) & 524288) != 0 ? searchParamsA.localPriority : null, ((-1234173943) & 1048576) != 0 ? searchParamsA.earlyAccess : null, ((-1234173943) & 2097152) != 0 ? searchParamsA.moreExpensive : null, ((-1234173943) & 4194304) != 0 ? searchParamsA.widgetCategory : null, ((-1234173943) & 8388608) != 0 ? searchParamsA.expanded : null, ((-1234173943) & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? searchParamsA.sellerId : str, ((-1234173943) & 33554432) != 0 ? searchParamsA.cv2Vacancy : null, ((-1234173943) & 67108864) != 0 ? searchParamsA.displayType : null, ((-1234173943) & 134217728) != 0 ? searchParamsA.shopId : null, ((-1234173943) & 268435456) != 0 ? searchParamsA.forcedLocationForRecommendation : null, ((-1234173943) & 536870912) != 0 ? searchParamsA.area : this.f261772i, ((-1234173943) & 1073741824) != 0 ? searchParamsA.source : null, ((-1234173943) & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? searchParamsA.clarifyIconType : null, (0 & 1) != 0 ? searchParamsA.drawId : str2);
        }
        coordinates2 = this.f261754C;
        coordinates = coordinates2;
        return searchParamsA.copy(((-1234173943) & 1) != 0 ? searchParamsA.categoryId : null, ((-1234173943) & 2) != 0 ? searchParamsA.geoCoords : coordinates, ((-1234173943) & 4) != 0 ? searchParamsA.locationId : null, ((-1234173943) & 8) != 0 ? searchParamsA.suggestLocationId : null, ((-1234173943) & 16) != 0 ? searchParamsA.metroIds : null, ((-1234173943) & 32) != 0 ? searchParamsA.directionId : null, ((-1234173943) & 64) != 0 ? searchParamsA.districtId : null, ((-1234173943) & 128) != 0 ? searchParamsA.params : null, ((-1234173943) & 256) != 0 ? searchParamsA.priceMax : null, ((-1234173943) & 512) != 0 ? searchParamsA.priceMin : null, ((-1234173943) & 1024) != 0 ? searchParamsA.query : query, ((-1234173943) & 2048) != 0 ? searchParamsA.title : null, ((-1234173943) & 4096) != 0 ? searchParamsA.owner : null, ((-1234173943) & 8192) != 0 ? searchParamsA.sort : null, ((-1234173943) & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? searchParamsA.withImagesOnly : null, ((-1234173943) & 32768) != 0 ? searchParamsA.searchRadius : null, ((-1234173943) & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? searchParamsA.radius : null, ((-1234173943) & 131072) != 0 ? searchParamsA.footWalkingMetro : null, ((-1234173943) & 262144) != 0 ? searchParamsA.withDeliveryOnly : null, ((-1234173943) & 524288) != 0 ? searchParamsA.localPriority : null, ((-1234173943) & 1048576) != 0 ? searchParamsA.earlyAccess : null, ((-1234173943) & 2097152) != 0 ? searchParamsA.moreExpensive : null, ((-1234173943) & 4194304) != 0 ? searchParamsA.widgetCategory : null, ((-1234173943) & 8388608) != 0 ? searchParamsA.expanded : null, ((-1234173943) & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? searchParamsA.sellerId : str, ((-1234173943) & 33554432) != 0 ? searchParamsA.cv2Vacancy : null, ((-1234173943) & 67108864) != 0 ? searchParamsA.displayType : null, ((-1234173943) & 134217728) != 0 ? searchParamsA.shopId : null, ((-1234173943) & 268435456) != 0 ? searchParamsA.forcedLocationForRecommendation : null, ((-1234173943) & 536870912) != 0 ? searchParamsA.area : this.f261772i, ((-1234173943) & 1073741824) != 0 ? searchParamsA.source : null, ((-1234173943) & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? searchParamsA.clarifyIconType : null, (0 & 1) != 0 ? searchParamsA.drawId : str2);
    }

    @Override // com.avito.android.search.filter.FiltersInteractor
    @Y61.k
    public final C41981q0 g() {
        BK0.a<DeepLink> aVar = this.f261763L;
        aVar.getClass();
        return new C41981q0(aVar);
    }

    @Override // com.avito.android.search.filter.FiltersInteractor
    @Y61.k
    /* renamed from: getMode, reason: from getter */
    public final FiltersMode getF261783t() {
        return this.f261783t;
    }

    @Override // com.avito.android.search.filter.FiltersInteractor
    @Y61.k
    public final SearchParams h(@Y61.k SearchParams searchParams, @Y61.k SearchParams searchParams2, @Y61.l List<String> list) {
        return this.f261785v.a(searchParams, searchParams2, list);
    }

    @Override // com.avito.android.search.filter.FiltersInteractor
    public final void i(@Y61.k ArrayList arrayList, @Y61.l DeepLink deepLink) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            FiltersInteractor.ParameterValue parameterValue = (FiltersInteractor.ParameterValue) it.next();
            ParametersTreeWithAdditional parametersTreeWithAdditional = this.f261753B;
            ParameterSlot parameterSlotFindParameter = parametersTreeWithAdditional != null ? parametersTreeWithAdditional.findParameter(parameterValue.f261856b) : null;
            if (parameterSlotFindParameter instanceof BeduinParameter) {
                K((EditableParameter) parameterSlotFindParameter, parameterValue.f261857c, "");
            } else if (parameterSlotFindParameter instanceof CharParameter) {
                K((EditableParameter) parameterSlotFindParameter, parameterValue.f261857c, "");
            } else if (parameterSlotFindParameter instanceof SelectParameter) {
                K((EditableParameter) parameterSlotFindParameter, parameterValue.f261857c, "");
            } else if (parameterSlotFindParameter instanceof EmailParameter) {
                K((EditableParameter) parameterSlotFindParameter, parameterValue.f261857c, "");
            } else if (parameterSlotFindParameter instanceof PhoneParameter) {
                K((EditableParameter) parameterSlotFindParameter, parameterValue.f261857c, "");
            } else if (parameterSlotFindParameter instanceof SelectDeepLinkParameter) {
                K((EditableParameter) parameterSlotFindParameter, parameterValue.f261857c, "");
            } else if (parameterSlotFindParameter instanceof PriceParameter) {
                K((EditableParameter) parameterSlotFindParameter, parameterValue.f261857c, "");
            } else if (parameterSlotFindParameter instanceof DateRangeParameter.FormattedDateParameter) {
                K((EditableParameter) parameterSlotFindParameter, parameterValue.f261857c, "");
            } else if (parameterSlotFindParameter instanceof VideoParameter) {
                K((EditableParameter) parameterSlotFindParameter, parameterValue.f261857c, "");
            }
        }
        this.f261759H.b(J(this, Boolean.TRUE, new FiltersOverrideParams(arrayList, deepLink), 2).t0(new l41.g() { // from class: com.avito.android.search.filter.F
            @Override // l41.g
            public final void accept(Object obj) {
                E.A(this.f261802b, (P2) obj);
            }
        }));
    }

    @Override // com.avito.android.search.filter.FiltersInteractor
    public final void j() {
        this.f261772i = null;
        ParametersTreeWithAdditional parametersTreeWithAdditional = this.f261753B;
        AdditionalCategoryParameter additionalCategoryParameterA = parametersTreeWithAdditional != null ? parametersTreeWithAdditional.a(SearchParams.Companion.Params.SEARCH_AREA_PARAM) : null;
        AdditionalAreaParameter additionalAreaParameter = additionalCategoryParameterA instanceof AdditionalAreaParameter ? (AdditionalAreaParameter) additionalCategoryParameterA : null;
        if (additionalAreaParameter != null) {
            additionalAreaParameter.setValue(null);
        }
    }

    @Override // com.avito.android.search.filter.FiltersInteractor
    public final void k(@Y61.l String str, @Y61.k LinkedHashMap linkedHashMap, @Y61.k List list, @Y61.k BottomSheetGroupParameter bottomSheetGroupParameter) {
        List<BottomSheetGroupParameter.OutsideCheckbox> outsideCheckboxes;
        BottomSheetGroupParameter.OutsideCheckbox outsideCheckbox;
        String paramId;
        Cp0.e eVar;
        String str2;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            Cp0.e eVar2 = (Cp0.e) C42745f0.K(i12, list);
            if (eVar2 != null) {
                boolean z12 = eVar2.f2700e;
                BottomSheetGroupParameter.Payload payload = bottomSheetGroupParameter.getPayload();
                if (payload != null && (outsideCheckboxes = payload.getOutsideCheckboxes()) != null && (outsideCheckbox = (BottomSheetGroupParameter.OutsideCheckbox) C42745f0.K(i12, outsideCheckboxes)) != null && (paramId = outsideCheckbox.getParamId()) != null && (eVar = (Cp0.e) C42745f0.K(i12, list)) != null && (str2 = eVar.f2697b) != null) {
                    arrayList.add(new com.avito.android.bottom_sheet_group.y(z12, paramId, str2));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.avito.android.bottom_sheet_group.y yVar = (com.avito.android.bottom_sheet_group.y) it.next();
            boolean z13 = yVar.f107423a;
            String str3 = yVar.f107424b;
            String str4 = yVar.f107425c;
            if (z13) {
                Set set = (Set) linkedHashMap.get(str3);
                LinkedHashSet linkedHashSetO0 = set != null ? C42745f0.O0(set) : new LinkedHashSet();
                linkedHashSetO0.add(str4);
                linkedHashMap.put(str3, linkedHashSetO0);
            } else {
                Set set2 = (Set) linkedHashMap.get(str3);
                LinkedHashSet linkedHashSetO02 = set2 != null ? C42745f0.O0(set2) : null;
                if (linkedHashSetO02 != null) {
                    linkedHashSetO02.remove(str4);
                }
                if (linkedHashSetO02 != null) {
                    linkedHashMap.put(str3, linkedHashSetO02);
                }
            }
        }
        u(str, bottomSheetGroupParameter.getId(), kotlin.collections.P0.q(linkedHashMap));
    }

    @Override // com.avito.android.search.filter.FiltersInteractor
    public final void l() {
        ParametersTreeWithAdditional parametersTreeWithAdditional = this.f261753B;
        AdditionalCategoryParameter additionalCategoryParameterA = parametersTreeWithAdditional != null ? parametersTreeWithAdditional.a(SearchParamsConverterKt.DRAW_ID) : null;
        AdditionalCharParameter additionalCharParameter = additionalCategoryParameterA instanceof AdditionalCharParameter ? (AdditionalCharParameter) additionalCategoryParameterA : null;
        if (additionalCharParameter != null) {
            additionalCharParameter.setValue(null);
        }
    }

    @Override // com.avito.android.search.filter.FiltersInteractor
    @Y61.k
    public final InteractorState m() {
        return new InteractorState(this.f261789z, this.f261752A, this.f261753B, this.f261754C, this.f261755D, this.f261756E, this.f261757F);
    }

    @Override // com.avito.android.search.filter.FiltersInteractor
    public final void n(@Y61.l ParametersTreeWithAdditional parametersTreeWithAdditional) {
        if (parametersTreeWithAdditional != null) {
            this.f261753B = parametersTreeWithAdditional;
        }
    }

    @Override // com.avito.android.search.filter.FiltersInteractor
    public final void o() {
        this.f261759H.b(J(this, Boolean.TRUE, null, 6).t0(new l41.g() { // from class: com.avito.android.search.filter.E.g
            @Override // l41.g
            public final void accept(Object obj) {
                E.A(E.this, (P2) obj);
            }
        }));
    }

    @Override // com.avito.android.search.filter.FiltersInteractor
    @Y61.k
    public final io.reactivex.rxjava3.core.z<P2<ChangingParametersForButtons>> p(boolean z12) {
        int i12 = 1;
        io.reactivex.rxjava3.core.z zVarQ0 = this.f261758G;
        if (z12) {
            zVarQ0 = zVarQ0.q0(1L);
        }
        io.reactivex.rxjava3.core.z zVarT = zVarQ0.T(new e(), Integer.MAX_VALUE);
        C41984r1 c41984r1 = new C41984r1(C35896f0.d(io.reactivex.rxjava3.core.z.W(new CallableC34606y(this, i12))).d0(new M(this)), io.reactivex.rxjava3.core.z.c0(P2.c.f318721a));
        zVarT.getClass();
        return io.reactivex.rxjava3.core.z.q(c41984r1, zVarT);
    }

    @Override // com.avito.android.search.filter.FiltersInteractor
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.observable.L q(@Y61.l SearchParams searchParams) {
        this.f261759H.b(I(this.f261756E, searchParams, this.f261757F).t0(new l41.g() { // from class: com.avito.android.search.filter.X
            @Override // l41.g
            public final void accept(Object obj) {
                E.A(this.f261912b, (P2) obj);
            }
        }));
        return this.f261762K;
    }

    @Override // com.avito.android.search.filter.FiltersInteractor
    public final <T> void r(@Y61.k EditableParameter<T> editableParameter, @Y61.l T t12, boolean z12, boolean z13, @Y61.k String str, boolean z14) {
        List listFindParametersOfType;
        boolean z15 = editableParameter instanceof LocationParameter;
        if ((z15 && this.f261772i != null) || (editableParameter instanceof LocalPriorityParameter)) {
            j();
        } else if (!z13 && kotlin.jvm.internal.L.f(editableParameter.getValue(), t12)) {
            return;
        }
        K(editableParameter, t12, str);
        ParametersTreeWithAdditional parametersTreeWithAdditional = this.f261753B;
        if (parametersTreeWithAdditional != null && (listFindParametersOfType = parametersTreeWithAdditional.findParametersOfType(RecommendationCardsParameter.class)) != null) {
            Iterator it = listFindParametersOfType.iterator();
            while (it.hasNext()) {
                this.f261788y.a(editableParameter, (RecommendationCardsParameter) it.next());
            }
        }
        if (!z13 && !(editableParameter instanceof SelectParameter) && !(editableParameter instanceof MultiselectParameter) && !(editableParameter instanceof SectionedMultiselectParameter) && !z15 && !(editableParameter instanceof RadiusParameter) && !(editableParameter instanceof BooleanParameter) && !(editableParameter instanceof DateRangeParameter.FormattedDateParameter) && !(editableParameter instanceof MetroParameter) && !(editableParameter instanceof DistrictParameter) && !(editableParameter instanceof AddressesSearchParameter) && !(editableParameter instanceof QuartersParameter) && !(editableParameter instanceof BeduinParameter) && !(editableParameter instanceof KeywordsParameter) && !(editableParameter instanceof GuestsSelectParameter) && !(editableParameter instanceof BannerCheckBoxWithImageParameter) && !(editableParameter instanceof LocalPriorityParameter) && !(editableParameter instanceof SuggestLocationParameter)) {
            this.f261758G.accept(a.f261791c);
        } else {
            Boolean updatesForm = editableParameter.getUpdatesForm();
            this.f261759H.b(J(this, Boolean.valueOf(((updatesForm != null ? updatesForm.booleanValue() : false) && !z12) || z14), null, 6).t0(new l41.g() { // from class: com.avito.android.search.filter.E.c
                @Override // l41.g
                public final void accept(Object obj) {
                    E.A(E.this, (P2) obj);
                }
            }));
        }
    }

    @Override // com.avito.android.search.filter.FiltersInteractor
    @Y61.l
    /* renamed from: s, reason: from getter */
    public final LocationInfo getF261789z() {
        return this.f261789z;
    }

    @Override // com.avito.android.search.filter.FiltersInteractor
    public final void t(@Y61.k KeywordsParameter keywordsParameter) {
        ParameterSlot parameterSlotFindParameter;
        ParametersTreeWithAdditional parametersTreeWithAdditional = this.f261753B;
        if (parametersTreeWithAdditional == null || (parameterSlotFindParameter = parametersTreeWithAdditional.findParameter(keywordsParameter.getId())) == null || !(parameterSlotFindParameter instanceof KeywordsParameter)) {
            return;
        }
        ((KeywordsParameter) parameterSlotFindParameter).setText(keywordsParameter.getText());
    }

    @Override // com.avito.android.search.filter.FiltersInteractor
    public final void u(@Y61.l String str, @Y61.k String str2, @Y61.l Map<String, ? extends Set<String>> map) {
        List<MultiselectParameter> parameters;
        ParametersTreeWithAdditional parametersTreeWithAdditional = this.f261753B;
        ParameterSlot parameterSlotFindParameter = parametersTreeWithAdditional != null ? parametersTreeWithAdditional.findParameter(str2) : null;
        BottomSheetGroupParameter bottomSheetGroupParameter = parameterSlotFindParameter instanceof BottomSheetGroupParameter ? (BottomSheetGroupParameter) parameterSlotFindParameter : null;
        if (bottomSheetGroupParameter != null && (parameters = bottomSheetGroupParameter.getParameters()) != null) {
            for (MultiselectParameter multiselectParameter : parameters) {
                if (map == null || !map.containsKey(multiselectParameter.getId())) {
                    K(multiselectParameter, null, "");
                } else {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    List<MultiselectParameter.Value> values = multiselectParameter.getValues();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Object obj : values) {
                        String parentId = ((MultiselectParameter.Value) obj).getParentId();
                        if (parentId == null) {
                            parentId = multiselectParameter.getId();
                        }
                        Object objR = linkedHashMap.get(parentId);
                        if (objR == null) {
                            objR = androidx.compose.ui.graphics.colorspace.e.r(linkedHashMap, parentId);
                        }
                        ((List) objR).add(obj);
                    }
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        String str3 = (String) entry.getKey();
                        List list = (List) entry.getValue();
                        Set<String> set = map.get(str3);
                        if (set == null) {
                            set = kotlin.collections.B0.f406639b;
                        }
                        Set<String> set2 = set;
                        C42745f0.h(set2, linkedHashSet);
                        if (str != null) {
                            String title = multiselectParameter.getTitle();
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : list) {
                                if (set.contains(((MultiselectParameter.Value) obj2).getId())) {
                                    arrayList.add(obj2);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(((MultiselectParameter.Value) it.next()).getF119974b());
                            }
                            List<String> listM0 = C42745f0.M0(set2);
                            String type = multiselectParameter.getType();
                            MultiselectParameter.Displaying displaying = multiselectParameter.getDisplaying();
                            this.f261786w.k(str, title, str3, arrayList2, listM0, type, displaying != null ? displaying.getType() : null);
                        }
                    }
                    K(multiselectParameter, C42745f0.M0(linkedHashSet), "");
                }
            }
        }
        this.f261759H.b(J(this, Boolean.FALSE, null, 6).t0(new l41.g() { // from class: com.avito.android.search.filter.E.b
            @Override // l41.g
            public final void accept(Object obj3) {
                E.A(E.this, (P2) obj3);
            }
        }));
    }

    @Override // com.avito.android.search.filter.FiltersInteractor
    @Y61.k
    public final ItemsSearchLink v(@Y61.k PresentationType presentationType) {
        LocationParameter locationParameter;
        Location value;
        SearchParams searchParamsF = f();
        searchParamsF.setExpanded(H());
        searchParamsF.setSellerId(D());
        searchParamsF.setShopId(E());
        ParametersTreeWithAdditional parametersTreeWithAdditional = this.f261753B;
        String id2 = (parametersTreeWithAdditional == null || (locationParameter = (LocationParameter) parametersTreeWithAdditional.getFirstParameterOfType(LocationParameter.class)) == null || (value = locationParameter.getValue()) == null) ? null : value.getId();
        SearchParams searchParams = this.f261771h;
        searchParamsF.setForcedLocationForRecommendation(!kotlin.jvm.internal.L.f(id2, searchParams != null ? searchParams.getLocationId() : null) ? Boolean.TRUE : null);
        return new ItemsSearchLink(searchParamsF, this.f261784u, presentationType.isMap() ? this.f261772i : null, null, presentationType.isFullMap() ? this.f261773j : null, null, "filters", null, null, false, presentationType, null, false, SerpSpaceType.INSTANCE.fromSearchParamsSegment(SearchParamsSegmentParser.INSTANCE.fromParam(searchParamsF)), false, null, false, null, 252800, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.search.filter.FiltersInteractor
    public final <T> void w(@Y61.k Map<String, ? extends T> map) {
        Iterator<Map.Entry<String, ? extends T>> it = map.entrySet().iterator();
        boolean zBooleanValue = false;
        while (true) {
            if (!it.hasNext()) {
                this.f261759H.b(J(this, Boolean.valueOf(zBooleanValue), null, 6).t0(new l41.g() { // from class: com.avito.android.search.filter.E.d
                    @Override // l41.g
                    public final void accept(Object obj) {
                        E.A(E.this, (P2) obj);
                    }
                }));
                return;
            }
            Map.Entry<String, ? extends T> next = it.next();
            String key = next.getKey();
            Object obj = (T) next.getValue();
            ParametersTreeWithAdditional parametersTreeWithAdditional = this.f261753B;
            ParameterSlot parameterSlotFindParameter = parametersTreeWithAdditional != null ? parametersTreeWithAdditional.findParameter(key) : null;
            if (parameterSlotFindParameter instanceof PriceParameter) {
                EditableParameter editableParameter = (EditableParameter) parameterSlotFindParameter;
                Boolean updatesForm = editableParameter.getUpdatesForm();
                zBooleanValue = updatesForm != null ? updatesForm.booleanValue() : false;
                K(editableParameter, obj instanceof String ? (String) obj : null, "");
            } else if (parameterSlotFindParameter instanceof IntParameter) {
                EditableParameter editableParameter2 = (EditableParameter) parameterSlotFindParameter;
                Boolean updatesForm2 = editableParameter2.getUpdatesForm();
                zBooleanValue = updatesForm2 != null ? updatesForm2.booleanValue() : false;
                String str = obj instanceof String ? (String) obj : null;
                K(editableParameter2, str != null ? C43066x.z0(str) : null, "");
            } else if (parameterSlotFindParameter instanceof NumericParameter) {
                EditableParameter editableParameter3 = (EditableParameter) parameterSlotFindParameter;
                Boolean updatesForm3 = editableParameter3.getUpdatesForm();
                zBooleanValue = updatesForm3 != null ? updatesForm3.booleanValue() : false;
                String str2 = obj instanceof String ? (String) obj : null;
                K(editableParameter3, str2 != null ? C43066x.w0(str2) : null, "");
            }
        }
    }

    @Override // com.avito.android.search.filter.FiltersInteractor
    public final void x(@Y61.k String str) {
        SearchParams searchParams = this.f261760I;
        if (searchParams != null) {
            j();
            this.f261771h = searchParams.copy(((-1234173943) & 1) != 0 ? searchParams.categoryId : null, ((-1234173943) & 2) != 0 ? searchParams.geoCoords : null, ((-1234173943) & 4) != 0 ? searchParams.locationId : str, ((-1234173943) & 8) != 0 ? searchParams.suggestLocationId : null, ((-1234173943) & 16) != 0 ? searchParams.metroIds : null, ((-1234173943) & 32) != 0 ? searchParams.directionId : null, ((-1234173943) & 64) != 0 ? searchParams.districtId : null, ((-1234173943) & 128) != 0 ? searchParams.params : null, ((-1234173943) & 256) != 0 ? searchParams.priceMax : null, ((-1234173943) & 512) != 0 ? searchParams.priceMin : null, ((-1234173943) & 1024) != 0 ? searchParams.query : null, ((-1234173943) & 2048) != 0 ? searchParams.title : null, ((-1234173943) & 4096) != 0 ? searchParams.owner : null, ((-1234173943) & 8192) != 0 ? searchParams.sort : null, ((-1234173943) & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? searchParams.withImagesOnly : null, ((-1234173943) & 32768) != 0 ? searchParams.searchRadius : null, ((-1234173943) & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? searchParams.radius : null, ((-1234173943) & 131072) != 0 ? searchParams.footWalkingMetro : null, ((-1234173943) & 262144) != 0 ? searchParams.withDeliveryOnly : null, ((-1234173943) & 524288) != 0 ? searchParams.localPriority : null, ((-1234173943) & 1048576) != 0 ? searchParams.earlyAccess : null, ((-1234173943) & 2097152) != 0 ? searchParams.moreExpensive : null, ((-1234173943) & 4194304) != 0 ? searchParams.widgetCategory : null, ((-1234173943) & 8388608) != 0 ? searchParams.expanded : null, ((-1234173943) & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? searchParams.sellerId : null, ((-1234173943) & 33554432) != 0 ? searchParams.cv2Vacancy : null, ((-1234173943) & 67108864) != 0 ? searchParams.displayType : null, ((-1234173943) & 134217728) != 0 ? searchParams.shopId : null, ((-1234173943) & 268435456) != 0 ? searchParams.forcedLocationForRecommendation : null, ((-1234173943) & 536870912) != 0 ? searchParams.area : null, ((-1234173943) & 1073741824) != 0 ? searchParams.source : null, ((-1234173943) & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? searchParams.clarifyIconType : null, (0 & 1) != 0 ? searchParams.drawId : null);
            this.f261753B = null;
            this.f261759H.b(J(this, Boolean.TRUE, null, 6).t0(new l41.g() { // from class: com.avito.android.search.filter.b0
                @Override // l41.g
                public final void accept(Object obj) {
                    E.A(this.f262658b, (P2) obj);
                }
            }));
        }
    }

    @Override // com.avito.android.search.filter.FiltersInteractor
    @Y61.l
    public final MetroResponseBody y() {
        LocationInfo locationInfo = this.f261789z;
        if (locationInfo != null) {
            return locationInfo.f261878e;
        }
        return null;
    }

    @Override // com.avito.android.search.filter.FiltersInteractor
    @Y61.l
    public final Boolean z() {
        LocationInfo locationInfo = this.f261789z;
        if (locationInfo != null) {
            return Boolean.valueOf(locationInfo.f261881h);
        }
        return null;
    }
}
