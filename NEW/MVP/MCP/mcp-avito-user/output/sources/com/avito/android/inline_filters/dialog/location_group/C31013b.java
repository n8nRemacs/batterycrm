package com.avito.android.inline_filters.dialog.location_group;

import Zp0.InterfaceC19587b;
import Zp0.InterfaceC19588c;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.avito.android.B2;
import com.avito.android.R;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.deep_linking.links.ItemsSearchLink;
import com.avito.android.inline_filters.InterfaceC30995b;
import com.avito.android.inline_filters.InterfaceC31046f;
import com.avito.android.inline_filters.W;
import com.avito.android.inline_filters.dialog.AbstractC30998a;
import com.avito.android.inline_filters.dialog.InlineFilterDialogOpener;
import com.avito.android.inline_filters.dialog.InterfaceC30999b;
import com.avito.android.inline_filters.dialog.calendar.DialogInterfaceOnCancelListenerC31002b;
import com.avito.android.inline_filters.dialog.location_group.adapter.GroupFilterItem;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.counter.ChangingParametersForButtons;
import com.avito.android.remote.model.counter.CounterButton;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.remote.model.search.InlineFilters;
import com.avito.android.remote.model.search.WidgetType;
import com.avito.android.remote.model.search.map.Area;
import com.avito.android.select.Arguments;
import com.avito.android.util.C35755b0;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.internal.operators.observable.C41962k;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import io.reactivex.rxjava3.internal.operators.observable.X0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import shark.AndroidResourceIdNames;

/* compiled from: LocationGroupFilterDialog.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"Lcom/avito/android/inline_filters/dialog/location_group/b;", "Lcom/avito/android/select/p;", "Lcom/avito/android/inline_filters/dialog/a;", "Lcom/avito/android/inline_filters/dialog/location_group/D;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.inline_filters.dialog.location_group.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C31013b extends AbstractC30998a<D> implements com.avito.android.select.p {

    /* renamed from: A, reason: collision with root package name */
    @Y61.l
    public C41962k f171778A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.l
    public SearchParams f171779B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f171780C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.l
    public ItemsSearchLink f171781D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.l
    public final ItemsSearchLink f171782E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.l
    public Filter f171783F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.l
    public LinkedHashMap f171784G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.l
    public LocationGroupFilterData f171785H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f171786I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f171787J;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Fragment f171788d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Filter f171789e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Map<String, String> f171790f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final InterfaceC30995b f171791g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final W f171792h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final InterfaceC31046f f171793i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final com.avito.android.location.r f171794j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final CN.f f171795k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final PresentationType f171796l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final String f171797m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final InlineFilterDialogOpener.Source f171798n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public final Y41.l<LocationGroupFilterData, G0> f171799o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public final Filter f171800p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public final Filter f171801q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final B2 f171802r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f171803s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f171804t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.l
    public final String f171805u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.l
    public final com.avito.android.util.text.a f171806v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    @SuppressLint({"InflateParams"})
    public final View f171807w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.inline_filters.dialog.j f171808x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.l
    public C41962k f171809y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.l
    public C41962k f171810z;

    /* compiled from: LocationGroupFilterDialog.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.inline_filters.dialog.location_group.b$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f171811a;

        static {
            int[] iArr = new int[WidgetType.values().length];
            try {
                iArr[WidgetType.Location.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WidgetType.SuggestLocation.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WidgetType.Metro.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WidgetType.District.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WidgetType.Direction.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[WidgetType.SearchRadius.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[WidgetType.Addresses.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[WidgetType.Radius.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[WidgetType.Boolean.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[WidgetType.Select.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            f171811a = iArr;
        }
    }

    /* compiled from: LocationGroupFilterDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/search/InlineFilters;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/search/InlineFilters;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.inline_filters.dialog.location_group.b$b, reason: collision with other inner class name */
    public static final class C5079b<T> implements l41.g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ D f171813c;

        public C5079b(D d12) {
            this.f171813c = d12;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            C31013b.e(C31013b.this, this.f171813c, (InlineFilters) obj);
        }
    }

    /* compiled from: LocationGroupFilterDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.inline_filters.dialog.location_group.b$c */
    public static final class c<T> implements l41.g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.f((Throwable) obj);
            C31013b.this.c();
        }
    }

    /* compiled from: LocationGroupFilterDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/counter/ChangingParametersForButtons;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/counter/ChangingParametersForButtons;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.inline_filters.dialog.location_group.b$d */
    public static final class d<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ D f171815b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C31013b f171816c;

        public d(C31013b c31013b, D d12) {
            this.f171815b = d12;
            this.f171816c = c31013b;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            String string;
            CounterButton counterButton = ((ChangingParametersForButtons) obj).getCounterButton();
            if (counterButton == null || (string = counterButton.getTitle()) == null) {
                string = this.f171816c.f171807w.getContext().getString(R.string.apply_inline_filter);
            }
            this.f171815b.n(string);
        }
    }

    /* compiled from: LocationGroupFilterDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.inline_filters.dialog.location_group.b$e */
    public static final class e<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ D f171817b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C31013b f171818c;

        public e(C31013b c31013b, D d12) {
            this.f171817b = d12;
            this.f171818c = c31013b;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            this.f171817b.n(this.f171818c.f171807w.getContext().getString(R.string.apply_inline_filter));
            V2.f318762a.f((Throwable) obj);
        }
    }

    public C31013b() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31013b(Fragment fragment, FragmentManager fragmentManager, Context context, Filter filter, Map map, InterfaceC30999b interfaceC30999b, InterfaceC30995b interfaceC30995b, W w12, InterfaceC31046f interfaceC31046f, com.avito.android.location.r rVar, CN.f fVar, PresentationType presentationType, String str, InlineFilterDialogOpener.Source source, Y41.l lVar, SearchParams searchParams, Parcelable parcelable, Y41.p pVar, Y41.a aVar, Filter filter2, Filter filter3, B2 b22, boolean z12, boolean z13, String str2, int i12, com.avito.android.util.text.a aVar2, int i13, C42822w c42822w) {
        Filter filter4;
        View viewInflate;
        Object next;
        super(context, i12);
        Filter filter5 = (i13 & 524288) != 0 ? null : filter2;
        Filter filter6 = (i13 & 1048576) != 0 ? null : filter3;
        boolean z14 = (i13 & 4194304) != 0 ? false : z12;
        boolean z15 = (i13 & 8388608) != 0 ? false : z13;
        String str3 = (i13 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : str2;
        com.avito.android.util.text.a aVar3 = (i13 & 67108864) != 0 ? null : aVar2;
        this.f171788d = fragment;
        this.f171789e = filter;
        this.f171790f = map;
        this.f171791g = interfaceC30995b;
        this.f171792h = w12;
        this.f171793i = interfaceC31046f;
        this.f171794j = rVar;
        this.f171795k = fVar;
        this.f171796l = presentationType;
        this.f171797m = str;
        this.f171798n = source;
        this.f171799o = lVar;
        this.f171800p = filter5;
        this.f171801q = filter6;
        this.f171802r = b22;
        this.f171803s = z14;
        this.f171804t = z15;
        this.f171805u = str3;
        this.f171806v = aVar3;
        this.f171807w = LayoutInflater.from(context).inflate(R.layout.inline_filters_dialog_location, (ViewGroup) null);
        this.f171808x = new com.avito.android.inline_filters.dialog.j(fragment, fragmentManager, interfaceC30999b, null, null, 16, null);
        this.f171779B = searchParams;
        this.f171780C = new io.reactivex.rxjava3.disposables.c();
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            int i14 = Build.VERSION.SDK_INT;
            this.f171781D = (ItemsSearchLink) (i14 >= 34 ? (Parcelable) bundle.getParcelable("currentDeeplink", ItemsSearchLink.class) : bundle.getParcelable("currentDeeplink"));
            this.f171782E = (ItemsSearchLink) (i14 >= 34 ? (Parcelable) bundle.getParcelable("currentDeeplink", ItemsSearchLink.class) : bundle.getParcelable("currentDeeplink"));
            this.f171783F = (Filter) (i14 >= 34 ? (Parcelable) bundle.getParcelable("currentInlineFilter", Filter.class) : bundle.getParcelable("currentInlineFilter"));
            Bundle bundle2 = bundle.getBundle("currentSubmitParams");
            HashMap mapG = bundle2 != null ? com.avito.android.util.G.g(bundle2) : null;
            this.f171784G = mapG != null ? C35755b0.c(mapG) : null;
            this.f171785H = (LocationGroupFilterData) (i14 >= 34 ? (Parcelable) bundle.getParcelable("geoData", LocationGroupFilterData.class) : bundle.getParcelable("geoData"));
            this.f171786I = bundle.getBoolean("locationChanged");
            this.f171787J = bundle.getBoolean("resetAreaOnChange");
        } else {
            this.f171782E = null;
        }
        List<Filter> filters = filter.getFilters();
        if (filters != null) {
            Iterator<T> it = filters.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Filter.Widget widget = ((Filter) next).getWidget();
                if ((widget != null ? widget.getType() : null) == WidgetType.SuggestLocation) {
                    break;
                }
            }
            filter4 = (Filter) next;
        } else {
            filter4 = null;
        }
        InlineFilterValue value = filter4 != null ? filter4.getValue() : null;
        if (value instanceof InlineFilterValue.InlineFilterSuggestLocationValue) {
            SearchParams searchParams2 = this.f171779B;
            this.f171779B = searchParams2 != null ? searchParams2.copy(((-1234173943) & 1) != 0 ? searchParams2.categoryId : null, ((-1234173943) & 2) != 0 ? searchParams2.geoCoords : null, ((-1234173943) & 4) != 0 ? searchParams2.locationId : null, ((-1234173943) & 8) != 0 ? searchParams2.suggestLocationId : ((InlineFilterValue.InlineFilterSuggestLocationValue) value).getSuggestLocationId(), ((-1234173943) & 16) != 0 ? searchParams2.metroIds : null, ((-1234173943) & 32) != 0 ? searchParams2.directionId : null, ((-1234173943) & 64) != 0 ? searchParams2.districtId : null, ((-1234173943) & 128) != 0 ? searchParams2.params : null, ((-1234173943) & 256) != 0 ? searchParams2.priceMax : null, ((-1234173943) & 512) != 0 ? searchParams2.priceMin : null, ((-1234173943) & 1024) != 0 ? searchParams2.query : null, ((-1234173943) & 2048) != 0 ? searchParams2.title : null, ((-1234173943) & 4096) != 0 ? searchParams2.owner : null, ((-1234173943) & 8192) != 0 ? searchParams2.sort : null, ((-1234173943) & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? searchParams2.withImagesOnly : null, ((-1234173943) & 32768) != 0 ? searchParams2.searchRadius : null, ((-1234173943) & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? searchParams2.radius : null, ((-1234173943) & 131072) != 0 ? searchParams2.footWalkingMetro : null, ((-1234173943) & 262144) != 0 ? searchParams2.withDeliveryOnly : null, ((-1234173943) & 524288) != 0 ? searchParams2.localPriority : null, ((-1234173943) & 1048576) != 0 ? searchParams2.earlyAccess : null, ((-1234173943) & 2097152) != 0 ? searchParams2.moreExpensive : null, ((-1234173943) & 4194304) != 0 ? searchParams2.widgetCategory : null, ((-1234173943) & 8388608) != 0 ? searchParams2.expanded : null, ((-1234173943) & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? searchParams2.sellerId : null, ((-1234173943) & 33554432) != 0 ? searchParams2.cv2Vacancy : null, ((-1234173943) & 67108864) != 0 ? searchParams2.displayType : null, ((-1234173943) & 134217728) != 0 ? searchParams2.shopId : null, ((-1234173943) & 268435456) != 0 ? searchParams2.forcedLocationForRecommendation : null, ((-1234173943) & 536870912) != 0 ? searchParams2.area : null, ((-1234173943) & 1073741824) != 0 ? searchParams2.source : null, ((-1234173943) & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? searchParams2.clarifyIconType : null, (0 & 1) != 0 ? searchParams2.drawId : null) : null;
        }
        Filter filter7 = this.f171783F;
        filter7 = filter7 == null ? this.f171789e : filter7;
        if (h(filter7, WidgetType.LocalPriority)) {
            this.f171803s = true;
            this.f171804t = true;
            viewInflate = LayoutInflater.from(context).inflate(R.layout.inline_filters_dialog_location_full_screen, (ViewGroup) null);
        } else {
            this.f171803s = false;
            this.f171804t = false;
            viewInflate = LayoutInflater.from(context).inflate(R.layout.inline_filters_dialog_location, (ViewGroup) null);
        }
        this.f171807w = viewInflate;
        this.f171147c = this.f171788d != null ? new H(viewInflate, this.f171806v) : null;
        List<GroupFilterItem> listA = C.a(filter7);
        B b12 = new B(aVar, this);
        com.avito.android.lib.design.bottom_sheet.d dVar = this.f171146b;
        dVar.G(viewInflate, false);
        dVar.T();
        dVar.setCanceledOnTouchOutside(true);
        dVar.setOnCancelListener(new DialogInterfaceOnCancelListenerC31002b(2, b12));
        dVar.R(new C31020i(b12));
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 7);
        com.avito.android.lib.design.bottom_sheet.d.I(dVar, true);
        dVar.K(this.f171803s);
        dVar.J(this.f171804t);
        D d12 = (D) this.f171147c;
        String title = filter7.getTitle();
        d12.setTitle(title == null ? "" : title);
        d12.m(this.f171805u);
        d12.Qd(b12);
        d12.Sd(new C31021j(this));
        d12.Td(viewInflate.getContext().getString(R.string.reset_inline_filter));
        d12.Ud(true);
        d12.b(listA);
        d12.getF171686o().u0(new w(this), x.f171845b);
        d12.getF171687p().u0(new y(this), z.f171847b);
        d12.h(new A(this, b12, pVar));
        k();
        d12.l(8);
        i(searchParams, filter7);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(com.avito.android.inline_filters.dialog.location_group.C31013b r25, com.avito.android.inline_filters.dialog.location_group.D r26, com.avito.android.remote.model.search.InlineFilters r27) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.inline_filters.dialog.location_group.C31013b.e(com.avito.android.inline_filters.dialog.location_group.b, com.avito.android.inline_filters.dialog.location_group.D, com.avito.android.remote.model.search.InlineFilters):void");
    }

    public static final void f(C31013b c31013b, GroupFilterItem groupFilterItem, InlineFilterDialogOpener.Source source) {
        SearchParams searchParams;
        String str;
        String str2;
        String categoryId;
        SearchParams searchParams2;
        Filter filter = groupFilterItem.f171704c;
        C42784z0 c42784z0 = C42784z0.f406748b;
        ItemsSearchLink itemsSearchLink = c31013b.f171781D;
        if (itemsSearchLink == null || (searchParams = itemsSearchLink.f133403b) == null) {
            searchParams = c31013b.f171779B;
        }
        SearchParams searchParams3 = searchParams;
        B2 b22 = c31013b.f171802r;
        b22.getClass();
        kotlin.reflect.n<Object> nVar = B2.f67184X[4];
        if (((Boolean) b22.f67212f.a().invoke()).booleanValue()) {
            ItemsSearchLink itemsSearchLink2 = c31013b.f171781D;
            if (itemsSearchLink2 == null || (searchParams2 = itemsSearchLink2.f133403b) == null || (categoryId = searchParams2.getCategoryId()) == null) {
                SearchParams searchParams4 = c31013b.f171779B;
                if (searchParams4 != null) {
                    categoryId = searchParams4.getCategoryId();
                }
                str = null;
            }
            str = categoryId;
        } else {
            str = null;
        }
        ItemsSearchLink itemsSearchLink3 = c31013b.f171781D;
        if (itemsSearchLink3 == null || (str2 = itemsSearchLink3.f133404c) == null) {
            str2 = c31013b.f171797m;
        }
        String str3 = str2;
        C31014c c31014c = new C31014c(c31013b);
        C31015d c31015d = new C31015d(c31013b);
        c31013b.f171808x.RA(filter, c42784z0, null, searchParams3, ((-13570176) & 16) != 0 ? null : c31013b.f171791g, ((-13570176) & 32) != 0 ? null : c31013b.f171792h, ((-13570176) & 64) != 0 ? null : c31013b.f171793i, ((-13570176) & 128) != 0 ? null : null, ((-13570176) & 256) != 0 ? null : null, ((-13570176) & 512) != 0 ? null : null, ((-13570176) & 1024) != 0 ? null : null, ((-13570176) & 2048) != 0 ? null : null, c31014c, ((-13570176) & 8192) != 0 ? null : null, ((-13570176) & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? com.avito.android.inline_filters.dialog.g.f171554l : null, (32768 & (-13570176)) != 0 ? com.avito.android.inline_filters.dialog.h.f171644l : null, c31015d, (131072 & (-13570176)) != 0 ? new com.avito.android.inline_filters.dialog.i(c31015d) : new C31016e(c31013b), (262144 & (-13570176)) != 0 ? null : new C31017f(c31013b), (524288 & (-13570176)) != 0 ? null : source, (1048576 & (-13570176)) != 0 ? null : null, (4194304 & (-13570176)) != 0 ? null : str, str3, (16777216 & (-13570176)) != 0 ? null : null, (33554432 & (-13570176)) != 0 ? null : null, (67108864 & (-13570176)) != 0 ? null : null, (134217728 & (-13570176)) != 0 ? null : null, (268435456 & (-13570176)) != 0 ? null : null, (536870912 & (-13570176)) != 0 ? null : null, (1073741824 & (-13570176)) != 0 ? null : null, ((-13570176) & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? null : null);
    }

    public static boolean h(Filter filter, WidgetType widgetType) {
        List<Filter> filters = filter.getFilters();
        Object obj = null;
        if (filters != null) {
            Iterator<T> it = filters.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Filter.Widget widget = ((Filter) next).getWidget();
                if ((widget != null ? widget.getType() : null) == widgetType) {
                    obj = next;
                    break;
                }
            }
            obj = (Filter) obj;
        }
        return obj != null;
    }

    @Override // com.avito.android.select.p
    @Y61.l
    public final InterfaceC19588c<? super InterfaceC19587b> E4(@Y61.k Arguments arguments) {
        return null;
    }

    @Override // com.avito.android.inline_filters.dialog.AbstractC30998a
    public final void a() {
        this.f171146b.R(null);
        c();
        this.f171780C.e();
    }

    @Override // com.avito.android.inline_filters.dialog.AbstractC30998a
    @Y61.k
    public final Parcelable b() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("currentDeeplink", this.f171781D);
        bundle.putParcelable("currentInlineFilter", this.f171783F);
        com.avito.android.util.G.d(bundle, "currentSubmitParams", this.f171784G);
        bundle.putParcelable("geoData", this.f171785H);
        bundle.putBoolean("locationChanged", this.f171786I);
        bundle.putBoolean("resetAreaOnChange", this.f171787J);
        return bundle;
    }

    public final void g(Filter filter, InlineFilterValue inlineFilterValue, SearchParams searchParams, PresentationType presentationType, String str) {
        SearchParams searchParamsCopy;
        InterfaceC30995b interfaceC30995b = this.f171791g;
        if (interfaceC30995b == null) {
            return;
        }
        com.avito.android.inline_filters.dialog.E e12 = this.f171147c;
        D d12 = e12 instanceof D ? (D) e12 : null;
        if (d12 == null) {
            return;
        }
        D d13 = d12;
        d13.r(filter.copy((65279 & 1) != 0 ? filter.attrId : null, (65279 & 2) != 0 ? filter.id : null, (65279 & 4) != 0 ? filter.widget : null, (65279 & 8) != 0 ? filter.payload : null, (65279 & 16) != 0 ? filter.title : null, (65279 & 32) != 0 ? filter.searchHint : null, (65279 & 64) != 0 ? filter.displayTitle : null, (65279 & 128) != 0 ? filter.isHighlighted : null, (65279 & 256) != 0 ? filter.value : inlineFilterValue, (65279 & 512) != 0 ? filter.options : null, (65279 & 1024) != 0 ? filter.selectedOptions : null, (65279 & 2048) != 0 ? filter.filters : null, (65279 & 4096) != 0 ? filter.changedParamType : null, (65279 & 8192) != 0 ? filter.hasSuggest : null, (65279 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? filter.richTitle : null, (65279 & 32768) != 0 ? filter.resetAreaOnChange : false), true);
        d13.v(true);
        io.reactivex.rxjava3.disposables.c cVar = this.f171780C;
        cVar.e();
        this.f171787J = filter.getResetAreaOnChange();
        if (kotlin.jvm.internal.L.f(filter.getId(), SearchParamsConverterKt.LOCATION_ID)) {
            SearchParams searchParams2 = this.f171779B;
            this.f171779B = searchParams2 != null ? searchParams2.copy(((-1234173943) & 1) != 0 ? searchParams2.categoryId : null, ((-1234173943) & 2) != 0 ? searchParams2.geoCoords : null, ((-1234173943) & 4) != 0 ? searchParams2.locationId : null, ((-1234173943) & 8) != 0 ? searchParams2.suggestLocationId : null, ((-1234173943) & 16) != 0 ? searchParams2.metroIds : null, ((-1234173943) & 32) != 0 ? searchParams2.directionId : null, ((-1234173943) & 64) != 0 ? searchParams2.districtId : null, ((-1234173943) & 128) != 0 ? searchParams2.params : null, ((-1234173943) & 256) != 0 ? searchParams2.priceMax : null, ((-1234173943) & 512) != 0 ? searchParams2.priceMin : null, ((-1234173943) & 1024) != 0 ? searchParams2.query : null, ((-1234173943) & 2048) != 0 ? searchParams2.title : null, ((-1234173943) & 4096) != 0 ? searchParams2.owner : null, ((-1234173943) & 8192) != 0 ? searchParams2.sort : null, ((-1234173943) & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? searchParams2.withImagesOnly : null, ((-1234173943) & 32768) != 0 ? searchParams2.searchRadius : null, ((-1234173943) & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? searchParams2.radius : null, ((-1234173943) & 131072) != 0 ? searchParams2.footWalkingMetro : null, ((-1234173943) & 262144) != 0 ? searchParams2.withDeliveryOnly : null, ((-1234173943) & 524288) != 0 ? searchParams2.localPriority : null, ((-1234173943) & 1048576) != 0 ? searchParams2.earlyAccess : null, ((-1234173943) & 2097152) != 0 ? searchParams2.moreExpensive : null, ((-1234173943) & 4194304) != 0 ? searchParams2.widgetCategory : null, ((-1234173943) & 8388608) != 0 ? searchParams2.expanded : null, ((-1234173943) & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? searchParams2.sellerId : null, ((-1234173943) & 33554432) != 0 ? searchParams2.cv2Vacancy : null, ((-1234173943) & 67108864) != 0 ? searchParams2.displayType : null, ((-1234173943) & 134217728) != 0 ? searchParams2.shopId : null, ((-1234173943) & 268435456) != 0 ? searchParams2.forcedLocationForRecommendation : null, ((-1234173943) & 536870912) != 0 ? searchParams2.area : null, ((-1234173943) & 1073741824) != 0 ? searchParams2.source : null, ((-1234173943) & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? searchParams2.clarifyIconType : null, (0 & 1) != 0 ? searchParams2.drawId : null) : null;
        }
        if (filter.getResetAreaOnChange()) {
            SearchParams searchParams3 = this.f171779B;
            this.f171779B = searchParams3 != null ? searchParams3.copy(((-1234173943) & 1) != 0 ? searchParams3.categoryId : null, ((-1234173943) & 2) != 0 ? searchParams3.geoCoords : null, ((-1234173943) & 4) != 0 ? searchParams3.locationId : null, ((-1234173943) & 8) != 0 ? searchParams3.suggestLocationId : null, ((-1234173943) & 16) != 0 ? searchParams3.metroIds : null, ((-1234173943) & 32) != 0 ? searchParams3.directionId : null, ((-1234173943) & 64) != 0 ? searchParams3.districtId : null, ((-1234173943) & 128) != 0 ? searchParams3.params : null, ((-1234173943) & 256) != 0 ? searchParams3.priceMax : null, ((-1234173943) & 512) != 0 ? searchParams3.priceMin : null, ((-1234173943) & 1024) != 0 ? searchParams3.query : null, ((-1234173943) & 2048) != 0 ? searchParams3.title : null, ((-1234173943) & 4096) != 0 ? searchParams3.owner : null, ((-1234173943) & 8192) != 0 ? searchParams3.sort : null, ((-1234173943) & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? searchParams3.withImagesOnly : null, ((-1234173943) & 32768) != 0 ? searchParams3.searchRadius : null, ((-1234173943) & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? searchParams3.radius : null, ((-1234173943) & 131072) != 0 ? searchParams3.footWalkingMetro : null, ((-1234173943) & 262144) != 0 ? searchParams3.withDeliveryOnly : null, ((-1234173943) & 524288) != 0 ? searchParams3.localPriority : null, ((-1234173943) & 1048576) != 0 ? searchParams3.earlyAccess : null, ((-1234173943) & 2097152) != 0 ? searchParams3.moreExpensive : null, ((-1234173943) & 4194304) != 0 ? searchParams3.widgetCategory : null, ((-1234173943) & 8388608) != 0 ? searchParams3.expanded : null, ((-1234173943) & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? searchParams3.sellerId : null, ((-1234173943) & 33554432) != 0 ? searchParams3.cv2Vacancy : null, ((-1234173943) & 67108864) != 0 ? searchParams3.displayType : null, ((-1234173943) & 134217728) != 0 ? searchParams3.shopId : null, ((-1234173943) & 268435456) != 0 ? searchParams3.forcedLocationForRecommendation : null, ((-1234173943) & 536870912) != 0 ? searchParams3.area : null, ((-1234173943) & 1073741824) != 0 ? searchParams3.source : null, ((-1234173943) & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? searchParams3.clarifyIconType : null, (0 & 1) != 0 ? searchParams3.drawId : null) : null;
        }
        if (kotlin.jvm.internal.L.f(filter.getId(), "localPriority") && (inlineFilterValue instanceof InlineFilterValue.InlineFilterLocalPriorityValue)) {
            SearchParams searchParams4 = this.f171779B;
            this.f171779B = searchParams4 != null ? searchParams4.copy(((-1234173943) & 1) != 0 ? searchParams4.categoryId : null, ((-1234173943) & 2) != 0 ? searchParams4.geoCoords : null, ((-1234173943) & 4) != 0 ? searchParams4.locationId : null, ((-1234173943) & 8) != 0 ? searchParams4.suggestLocationId : null, ((-1234173943) & 16) != 0 ? searchParams4.metroIds : null, ((-1234173943) & 32) != 0 ? searchParams4.directionId : null, ((-1234173943) & 64) != 0 ? searchParams4.districtId : null, ((-1234173943) & 128) != 0 ? searchParams4.params : null, ((-1234173943) & 256) != 0 ? searchParams4.priceMax : null, ((-1234173943) & 512) != 0 ? searchParams4.priceMin : null, ((-1234173943) & 1024) != 0 ? searchParams4.query : null, ((-1234173943) & 2048) != 0 ? searchParams4.title : null, ((-1234173943) & 4096) != 0 ? searchParams4.owner : null, ((-1234173943) & 8192) != 0 ? searchParams4.sort : null, ((-1234173943) & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? searchParams4.withImagesOnly : null, ((-1234173943) & 32768) != 0 ? searchParams4.searchRadius : null, ((-1234173943) & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? searchParams4.radius : null, ((-1234173943) & 131072) != 0 ? searchParams4.footWalkingMetro : null, ((-1234173943) & 262144) != 0 ? searchParams4.withDeliveryOnly : null, ((-1234173943) & 524288) != 0 ? searchParams4.localPriority : ((InlineFilterValue.InlineFilterLocalPriorityValue) inlineFilterValue).getPriority(), ((-1234173943) & 1048576) != 0 ? searchParams4.earlyAccess : null, ((-1234173943) & 2097152) != 0 ? searchParams4.moreExpensive : null, ((-1234173943) & 4194304) != 0 ? searchParams4.widgetCategory : null, ((-1234173943) & 8388608) != 0 ? searchParams4.expanded : null, ((-1234173943) & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? searchParams4.sellerId : null, ((-1234173943) & 33554432) != 0 ? searchParams4.cv2Vacancy : null, ((-1234173943) & 67108864) != 0 ? searchParams4.displayType : null, ((-1234173943) & 134217728) != 0 ? searchParams4.shopId : null, ((-1234173943) & 268435456) != 0 ? searchParams4.forcedLocationForRecommendation : null, ((-1234173943) & 536870912) != 0 ? searchParams4.area : null, ((-1234173943) & 1073741824) != 0 ? searchParams4.source : null, ((-1234173943) & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? searchParams4.clarifyIconType : null, (0 & 1) != 0 ? searchParams4.drawId : null) : null;
        }
        if (searchParams != null) {
            SearchParams searchParams5 = this.f171779B;
            Area area = searchParams5 != null ? searchParams5.getArea() : null;
            SearchParams searchParams6 = this.f171779B;
            String drawId = searchParams6 != null ? searchParams6.getDrawId() : null;
            SearchParams searchParams7 = this.f171779B;
            Boolean localPriority = searchParams7 != null ? searchParams7.getLocalPriority() : null;
            SearchParams searchParams8 = this.f171779B;
            searchParamsCopy = searchParams.copy(((-1234173943) & 1) != 0 ? searchParams.categoryId : null, ((-1234173943) & 2) != 0 ? searchParams.geoCoords : null, ((-1234173943) & 4) != 0 ? searchParams.locationId : null, ((-1234173943) & 8) != 0 ? searchParams.suggestLocationId : searchParams8 != null ? searchParams8.getSuggestLocationId() : null, ((-1234173943) & 16) != 0 ? searchParams.metroIds : null, ((-1234173943) & 32) != 0 ? searchParams.directionId : null, ((-1234173943) & 64) != 0 ? searchParams.districtId : null, ((-1234173943) & 128) != 0 ? searchParams.params : null, ((-1234173943) & 256) != 0 ? searchParams.priceMax : null, ((-1234173943) & 512) != 0 ? searchParams.priceMin : null, ((-1234173943) & 1024) != 0 ? searchParams.query : null, ((-1234173943) & 2048) != 0 ? searchParams.title : null, ((-1234173943) & 4096) != 0 ? searchParams.owner : null, ((-1234173943) & 8192) != 0 ? searchParams.sort : null, ((-1234173943) & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? searchParams.withImagesOnly : null, ((-1234173943) & 32768) != 0 ? searchParams.searchRadius : null, ((-1234173943) & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? searchParams.radius : null, ((-1234173943) & 131072) != 0 ? searchParams.footWalkingMetro : null, ((-1234173943) & 262144) != 0 ? searchParams.withDeliveryOnly : null, ((-1234173943) & 524288) != 0 ? searchParams.localPriority : localPriority, ((-1234173943) & 1048576) != 0 ? searchParams.earlyAccess : null, ((-1234173943) & 2097152) != 0 ? searchParams.moreExpensive : null, ((-1234173943) & 4194304) != 0 ? searchParams.widgetCategory : null, ((-1234173943) & 8388608) != 0 ? searchParams.expanded : null, ((-1234173943) & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? searchParams.sellerId : null, ((-1234173943) & 33554432) != 0 ? searchParams.cv2Vacancy : null, ((-1234173943) & 67108864) != 0 ? searchParams.displayType : null, ((-1234173943) & 134217728) != 0 ? searchParams.shopId : null, ((-1234173943) & 268435456) != 0 ? searchParams.forcedLocationForRecommendation : null, ((-1234173943) & 536870912) != 0 ? searchParams.area : area, ((-1234173943) & 1073741824) != 0 ? searchParams.source : null, ((-1234173943) & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? searchParams.clarifyIconType : null, (0 & 1) != 0 ? searchParams.drawId : drawId);
        } else {
            searchParamsCopy = null;
        }
        Map map = this.f171784G;
        if (map == null) {
            map = this.f171790f;
        }
        io.reactivex.rxjava3.core.z zVarC = interfaceC30995b.c(filter, inlineFilterValue, searchParamsCopy, presentationType, map, str);
        C5079b c5079b = new C5079b(d13);
        c cVar2 = new c();
        zVarC.getClass();
        cVar.b(zVarC.v0(c5079b, cVar2, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    public final void i(SearchParams searchParams, Filter filter) {
        String locationId;
        C41962k c41962kM0;
        C41962k c41962kM02;
        if (searchParams == null || (locationId = searchParams.getLocationId()) == null) {
            return;
        }
        boolean zH2 = h(filter, WidgetType.Metro);
        W w12 = this.f171792h;
        C41962k c41962kM03 = null;
        if (!zH2 || w12 == null) {
            c41962kM0 = null;
        } else {
            I0 i0H = w12.h(locationId);
            io.reactivex.rxjava3.internal.functions.b.a(1, "bufferSize");
            c41962kM0 = X0.Q0(i0H).M0();
        }
        this.f171809y = c41962kM0;
        if (!h(filter, WidgetType.Direction) || w12 == null) {
            c41962kM02 = null;
        } else {
            I0 i0I = w12.i(locationId);
            io.reactivex.rxjava3.internal.functions.b.a(1, "bufferSize");
            c41962kM02 = X0.Q0(i0I).M0();
        }
        this.f171810z = c41962kM02;
        if (h(filter, WidgetType.District) && w12 != null) {
            I0 i0A = w12.a(locationId);
            io.reactivex.rxjava3.internal.functions.b.a(1, "bufferSize");
            c41962kM03 = X0.Q0(i0A).M0();
        }
        this.f171778A = c41962kM03;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object] */
    @Override // com.avito.android.select.p
    public final void j(@Y61.k String str, @Y61.l String str2, @Y61.k List list) {
        Filter next;
        InlineFilterValue inlineFilterMultiSelectValue;
        SearchParams searchParams;
        PresentationType presentationType;
        String str3;
        SearchParams searchParams2;
        Filter filter = this.f171783F;
        if (filter == null) {
            filter = this.f171789e;
        }
        List<Filter> filters = filter.getFilters();
        if (filters != null) {
            Iterator it = filters.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = 0;
                    break;
                } else {
                    next = it.next();
                    if (kotlin.jvm.internal.L.f(((Filter) next).getId(), str)) {
                        break;
                    }
                }
            }
            Filter filter2 = next;
            if (filter2 == null) {
                return;
            }
            Filter.Widget widget = filter2.getWidget();
            WidgetType type = widget != null ? widget.getType() : null;
            if ((type == null ? -1 : a.f171811a[type.ordinal()]) == 10) {
                inlineFilterMultiSelectValue = new InlineFilterValue.InlineFilterSelectValue((String) ((ParcelableEntity) list.get(0)).getId());
            } else {
                List list2 = list;
                ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList.add((String) ((ParcelableEntity) it2.next()).getId());
                }
                inlineFilterMultiSelectValue = new InlineFilterValue.InlineFilterMultiSelectValue(arrayList);
            }
            CN.f fVar = this.f171795k;
            if (fVar != null) {
                ItemsSearchLink itemsSearchLink = this.f171781D;
                if (itemsSearchLink == null || (searchParams2 = itemsSearchLink.f133403b) == null) {
                    searchParams2 = this.f171779B;
                }
                fVar.o(searchParams2, filter2, inlineFilterMultiSelectValue);
            }
            ItemsSearchLink itemsSearchLink2 = this.f171781D;
            if (itemsSearchLink2 == null || (searchParams = itemsSearchLink2.f133403b) == null) {
                searchParams = this.f171779B;
            }
            SearchParams searchParams3 = searchParams;
            if (itemsSearchLink2 == null || (presentationType = itemsSearchLink2.f133413l) == null) {
                presentationType = this.f171796l;
            }
            PresentationType presentationType2 = presentationType;
            if (itemsSearchLink2 == null || (str3 = itemsSearchLink2.f133404c) == null) {
                str3 = this.f171797m;
            }
            g(filter2, inlineFilterMultiSelectValue, searchParams3, presentationType2, str3);
        }
    }

    public final void k() {
        SearchParams searchParams;
        PresentationType presentationType;
        com.avito.android.inline_filters.dialog.E e12 = this.f171147c;
        D d12 = e12 instanceof D ? (D) e12 : null;
        if (d12 == null) {
            return;
        }
        ItemsSearchLink itemsSearchLink = this.f171781D;
        if (itemsSearchLink == null || (searchParams = itemsSearchLink.f133403b) == null) {
            searchParams = this.f171779B;
        }
        SearchParams searchParams2 = searchParams;
        InterfaceC31046f interfaceC31046f = this.f171793i;
        if (interfaceC31046f == null || searchParams2 == null) {
            d12.n(this.f171807w.getContext().getString(R.string.apply_inline_filter));
            return;
        }
        d12.d();
        SearchParams searchParams3 = this.f171779B;
        Area area = searchParams3 != null ? searchParams3.getArea() : null;
        SearchParams searchParams4 = this.f171779B;
        String drawId = searchParams4 != null ? searchParams4.getDrawId() : null;
        SearchParams searchParams5 = this.f171779B;
        String sellerId = searchParams5 != null ? searchParams5.getSellerId() : null;
        SearchParams searchParams6 = this.f171779B;
        SearchParams searchParamsCopy = searchParams2.copy(((-1234173943) & 1) != 0 ? searchParams2.categoryId : null, ((-1234173943) & 2) != 0 ? searchParams2.geoCoords : null, ((-1234173943) & 4) != 0 ? searchParams2.locationId : null, ((-1234173943) & 8) != 0 ? searchParams2.suggestLocationId : searchParams6 != null ? searchParams6.getSuggestLocationId() : null, ((-1234173943) & 16) != 0 ? searchParams2.metroIds : null, ((-1234173943) & 32) != 0 ? searchParams2.directionId : null, ((-1234173943) & 64) != 0 ? searchParams2.districtId : null, ((-1234173943) & 128) != 0 ? searchParams2.params : null, ((-1234173943) & 256) != 0 ? searchParams2.priceMax : null, ((-1234173943) & 512) != 0 ? searchParams2.priceMin : null, ((-1234173943) & 1024) != 0 ? searchParams2.query : null, ((-1234173943) & 2048) != 0 ? searchParams2.title : null, ((-1234173943) & 4096) != 0 ? searchParams2.owner : null, ((-1234173943) & 8192) != 0 ? searchParams2.sort : null, ((-1234173943) & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? searchParams2.withImagesOnly : null, ((-1234173943) & 32768) != 0 ? searchParams2.searchRadius : null, ((-1234173943) & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? searchParams2.radius : null, ((-1234173943) & 131072) != 0 ? searchParams2.footWalkingMetro : null, ((-1234173943) & 262144) != 0 ? searchParams2.withDeliveryOnly : null, ((-1234173943) & 524288) != 0 ? searchParams2.localPriority : null, ((-1234173943) & 1048576) != 0 ? searchParams2.earlyAccess : null, ((-1234173943) & 2097152) != 0 ? searchParams2.moreExpensive : null, ((-1234173943) & 4194304) != 0 ? searchParams2.widgetCategory : null, ((-1234173943) & 8388608) != 0 ? searchParams2.expanded : null, ((-1234173943) & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? searchParams2.sellerId : sellerId, ((-1234173943) & 33554432) != 0 ? searchParams2.cv2Vacancy : null, ((-1234173943) & 67108864) != 0 ? searchParams2.displayType : null, ((-1234173943) & 134217728) != 0 ? searchParams2.shopId : null, ((-1234173943) & 268435456) != 0 ? searchParams2.forcedLocationForRecommendation : null, ((-1234173943) & 536870912) != 0 ? searchParams2.area : area, ((-1234173943) & 1073741824) != 0 ? searchParams2.source : null, ((-1234173943) & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? searchParams2.clarifyIconType : null, (0 & 1) != 0 ? searchParams2.drawId : drawId);
        ItemsSearchLink itemsSearchLink2 = this.f171781D;
        if (itemsSearchLink2 == null || (presentationType = itemsSearchLink2.f133413l) == null) {
            presentationType = this.f171796l;
        }
        this.f171780C.b(interfaceC31046f.a(searchParamsCopy, presentationType).v0(new d(this, d12), new e(this, d12), io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.select.p
    public final void q(@Y61.k String str) {
    }

    @Override // com.avito.android.select.p
    public final void s3(@Y61.k String str) {
    }
}
