package com.avito.android.serp.adapter.vertical_main.vertical_filter;

import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.B2;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.bxcontent.Y0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.inline_filters.InterfaceC30995b;
import com.avito.android.inline_filters.W;
import com.avito.android.inline_filters.dialog.location_group.LocationGroupFilterData;
import com.avito.android.location.LocationSource;
import com.avito.android.remote.model.CaseText;
import com.avito.android.remote.model.Location;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.remote.model.search.InlineFilterValueKt;
import com.avito.android.remote.model.search.NextActionType;
import com.avito.android.remote.model.search.WidgetType;
import com.avito.android.remote.model.vertical_main.BottomContent;
import com.avito.android.remote.model.vertical_main.SearchFormWidgetAction;
import com.avito.android.remote.model.vertical_main.SearchFormWidgetAnalyticParams;
import com.avito.android.remote.model.vertical_main.StyleBlock;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.serp.adapter.vertical_main.VerticalFilterData;
import com.avito.android.serp.adapter.vertical_main.VerticalFormType;
import com.avito.android.serp.adapter.vertical_main.VerticalPromoBlockItem;
import com.avito.android.serp.adapter.vertical_main.analytics.SearchWidgetAction;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.R0;
import com.avito.android.util.V2;
import fv.C40482a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlin.text.C43044a;
import kotlin.text.C43059p;
import kotlin.text.InterfaceC43057n;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;
import kotlinx.coroutines.internal.C43238h;
import lE.C43624b;

/* compiled from: VerticalFilterPresenterImpl.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/vertical_filter/v;", "Lcom/avito/android/serp/adapter/vertical_main/p;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class v implements com.avito.android.serp.adapter.vertical_main.p {

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public final C43238h f273575A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.l
    public Y0 f273576B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.l
    public Object f273577C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.y f273578D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<Filter> f273579E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.y f273580F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.k
    public final HashMap f273581G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.l
    public VerticalFilterData f273582H;

    /* renamed from: I, reason: collision with root package name */
    @Y61.l
    public Parcelable f273583I;

    /* renamed from: J, reason: collision with root package name */
    @Y61.l
    public SearchFormWidgetAnalyticParams f273584J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.l
    public Analytics f273585K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public String f273586L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.l
    public StyleBlock f273587M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.l
    public BottomContent f273588N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f273589O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.l
    public String f273590P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final C43059p f273591Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public Object f273592R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.l
    public VerticalPromoBlockItem.ContentStyle f273593S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.l
    public Y41.p<? super String, ? super String, G0> f273594T;

    /* renamed from: U, reason: collision with root package name */
    @Y61.l
    public Filter f273595U;

    /* renamed from: V, reason: collision with root package name */
    @Y61.l
    public Filter f273596V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f273597W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<VerticalPromoBlockItem.VerticalFilterItem> f273598X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final e2 f273599Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final e2 f273600Z;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC34876l> f273601a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f273602b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.inline_filters.dialog.s f273603c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.vertical_main.m f273604d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final h31.e<com.avito.android.location.r> f273605e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC30995b> f273606f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final CN.f f273607g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final h31.e<W> f273608h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34866b f273609i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f273610j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final SearchParams f273611k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final String f273612l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.guests_selector.d f273613m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.analytics.widgets_tracker.g f273614n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f273615o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final C43624b f273616p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.inline_filters.dialog.calendar.date_range.a f273617q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final B2 f273618r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<DeepLink> f273619s = new com.jakewharton.rxrelay3.c<>();

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final e2 f273620t = f2.b(0, 0, null, 7);

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<Throwable> f273621u = new com.jakewharton.rxrelay3.c<>();

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final e2 f273622v = f2.b(0, 0, null, 7);

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<DeepLink> f273623w = new com.jakewharton.rxrelay3.c<>();

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final e2 f273624x = f2.b(0, 0, null, 7);

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<Integer> f273625y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public final e2 f273626z;

    /* compiled from: VerticalFilterPresenterImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/search/Filter;", "kotlin.jvm.PlatformType", "targetFilter", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/search/Filter;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {

        /* compiled from: VerticalFilterPresenterImpl.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.serp.adapter.vertical_main.vertical_filter.v$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C8120a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f273628a;

            static {
                int[] iArr = new int[WidgetType.values().length];
                try {
                    iArr[WidgetType.Checkbox.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[WidgetType.AllFilters.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f273628a = iArr;
            }
        }

        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            Filter filter = (Filter) obj;
            Filter.Widget widget = filter.getWidget();
            WidgetType type = widget != null ? widget.getType() : null;
            int i12 = type == null ? -1 : C8120a.f273628a[type.ordinal()];
            v vVar = v.this;
            if (i12 == 1) {
                InlineFilterValue value = filter.getValue();
                InlineFilterValue.InlineFilterBooleanValue inlineFilterBooleanValue = value instanceof InlineFilterValue.InlineFilterBooleanValue ? (InlineFilterValue.InlineFilterBooleanValue) value : null;
                if (inlineFilterBooleanValue == null) {
                    inlineFilterBooleanValue = new InlineFilterValue.InlineFilterBooleanValue(false);
                }
                vVar.w(filter, inlineFilterBooleanValue.copy(!inlineFilterBooleanValue.getValue()));
                return;
            }
            if (i12 != 2) {
                vVar.u(filter);
                return;
            }
            Y41.p<? super String, ? super String, G0> pVar = vVar.f273594T;
            if (pVar != null) {
                SearchFormWidgetAnalyticParams searchFormWidgetAnalyticParams = vVar.f273584J;
                pVar.invoke(kotlin.jvm.internal.L.f(searchFormWidgetAnalyticParams != null ? searchFormWidgetAnalyticParams.getCategoryId() : null, "112") ? "search_widget" : "icon_shashlyk", "vertical_main");
            }
        }
    }

    /* compiled from: VerticalFilterPresenterImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T> f273629b = new b<>();

        @Override // l41.g
        public final void accept(Object obj) {
            com.avito.android.bxcontent.mvi.entity.f.t("Vertical filter clicks failed: ", (Throwable) obj, V2.f318762a, null);
        }
    }

    /* compiled from: VerticalFilterPresenterImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0001\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends kotlin.jvm.internal.N implements Y41.a {

        /* renamed from: l, reason: collision with root package name */
        public static final c f273630l = new c();

        public c() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ Object invoke() {
            return null;
        }
    }

    /* compiled from: VerticalFilterPresenterImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0001\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends kotlin.jvm.internal.N implements Y41.a {

        /* renamed from: l, reason: collision with root package name */
        public static final d f273631l = new d();

        public d() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ Object invoke() {
            return null;
        }
    }

    /* compiled from: VerticalFilterPresenterImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends kotlin.jvm.internal.H implements Y41.a<G0> {
        @Override // Y41.a
        public final G0 invoke() {
            ((v) this.receiver).t();
            return G0.f406611a;
        }
    }

    /* compiled from: VerticalFilterPresenterImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/remote/model/search/Filter;", "<anonymous parameter 0>", "Lcom/avito/android/remote/model/search/InlineFilterValue;", "selectedValue", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/model/search/Filter;Lcom/avito/android/remote/model/search/InlineFilterValue;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends kotlin.jvm.internal.N implements Y41.p<Filter, InlineFilterValue, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Filter f273633m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Filter filter) {
            super(2);
            this.f273633m = filter;
        }

        @Override // Y41.p
        public final G0 invoke(Filter filter, InlineFilterValue inlineFilterValue) {
            v.this.w(this.f273633m, inlineFilterValue);
            return G0.f406611a;
        }
    }

    /* compiled from: VerticalFilterPresenterImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/inline_filters/dialog/location_group/LocationGroupFilterData;", "data", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/inline_filters/dialog/location_group/LocationGroupFilterData;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends kotlin.jvm.internal.N implements Y41.l<LocationGroupFilterData, G0> {
        public g() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(LocationGroupFilterData locationGroupFilterData) {
            DeepLink deepLink;
            String str;
            LocationGroupFilterData locationGroupFilterData2 = locationGroupFilterData;
            VerticalFilterData verticalFilterData = new VerticalFilterData(new SearchFormWidgetAction(locationGroupFilterData2.f171694d, locationGroupFilterData2.f171695e, null, 4, null), locationGroupFilterData2.f171692b, locationGroupFilterData2.f171694d, locationGroupFilterData2.f171693c, locationGroupFilterData2.f171695e, null, locationGroupFilterData2.f171696f, 32, null);
            v vVar = v.this;
            boolean z12 = locationGroupFilterData2.f171699i;
            if (z12 && (str = locationGroupFilterData2.f171698h) != null) {
                vVar.f273605e.get().a(new Location(str, new CaseText(), false, false, false, false, null, null, false, null, null, null, 4092, null), LocationSource.f181713e, true);
            }
            if (!z12 || (deepLink = locationGroupFilterData2.f171697g) == null) {
                vVar.r(verticalFilterData, u.f273574l);
            } else {
                vVar.f273623w.accept(deepLink);
                C43259k.d(vVar.f273575A, null, null, new A(vVar, deepLink, null), 3);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: VerticalFilterPresenterImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "link", "", "<anonymous parameter 1>", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends kotlin.jvm.internal.N implements Y41.p<DeepLink, Boolean, G0> {
        public h() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(DeepLink deepLink, Boolean bool) {
            DeepLink deepLink2 = deepLink;
            bool.getClass();
            v vVar = v.this;
            vVar.f273619s.accept(deepLink2);
            C43259k.d(vVar.f273575A, null, null, new B(vVar, deepLink2, null), 3);
            return G0.f406611a;
        }
    }

    /* compiled from: VerticalFilterPresenterImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Integer;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends kotlin.jvm.internal.N implements Y41.l<Integer, G0> {
        public i() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Integer num) {
            v.this.t();
            return G0.f406611a;
        }
    }

    /* compiled from: VerticalFilterPresenterImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.serp.adapter.vertical_main.vertical_filter.VerticalFilterPresenterImpl$performSearch$1", f = "VerticalFilterPresenterImpl.kt", i = {}, l = {625}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f273637q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ VerticalFilterData f273639s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(VerticalFilterData verticalFilterData, Continuation<? super j> continuation) {
            super(2, continuation);
            this.f273639s = verticalFilterData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return v.this.new j(this.f273639s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((j) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f273637q;
            if (i12 == 0) {
                C42729a0.b(obj);
                e2 e2Var = v.this.f273620t;
                DeepLink deepLink = this.f273639s.f272515f;
                this.f273637q = 1;
                if (e2Var.emit(deepLink, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: VerticalFilterPresenterImpl.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InlineFilterValue f273640l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Filter f273641m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ v f273642n;

        /* compiled from: VerticalFilterPresenterImpl.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f273643a;

            static {
                int[] iArr = new int[NextActionType.values().length];
                try {
                    iArr[NextActionType.FocusField.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[NextActionType.Autocomplete.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f273643a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InlineFilterValue inlineFilterValue, Filter filter, v vVar) {
            super(0);
            this.f273640l = inlineFilterValue;
            this.f273641m = filter;
            this.f273642n = vVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            Filter.Config config;
            Filter.NextAction nextAction;
            String focusField;
            VerticalFilterData verticalFilterData;
            List<Filter> list;
            Filter.Widget widget;
            Filter.Config config2;
            Filter.NextAction nextAction2;
            if (InlineFilterValueKt.isNotEmpty(this.f273640l)) {
                Object obj = null;
                Filter filter = this.f273641m;
                NextActionType type = (filter == null || (widget = filter.getWidget()) == null || (config2 = widget.getConfig()) == null || (nextAction2 = config2.getNextAction()) == null) ? null : nextAction2.getType();
                int i12 = type == null ? -1 : a.f273643a[type.ordinal()];
                v vVar = this.f273642n;
                if (i12 == 1) {
                    Filter.Widget widget2 = filter.getWidget();
                    if (widget2 != null && (config = widget2.getConfig()) != null && (nextAction = config.getNextAction()) != null && (focusField = nextAction.getFocusField()) != null && (verticalFilterData = vVar.f273582H) != null && (list = verticalFilterData.f272512c) != null) {
                        Iterator<T> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Object next = it.next();
                            if (kotlin.jvm.internal.L.f(((Filter) next).getId(), focusField)) {
                                obj = next;
                                break;
                            }
                        }
                        Filter filter2 = (Filter) obj;
                        if (filter2 != null) {
                            vVar.u(filter2);
                        }
                    }
                } else if (i12 == 2) {
                    vVar.v(SearchWidgetAction.f272569c);
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: VerticalFilterPresenterImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.serp.adapter.vertical_main.vertical_filter.VerticalFilterPresenterImpl$updateFiltersCount$1", f = "VerticalFilterPresenterImpl.kt", i = {}, l = {569}, m = "invokeSuspend", n = {}, s = {})
    public static final class l extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f273644q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ int f273646s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(int i12, Continuation<? super l> continuation) {
            super(2, continuation);
            this.f273646s = i12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return v.this.new l(this.f273646s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((l) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f273644q;
            if (i12 == 0) {
                C42729a0.b(obj);
                e2 e2Var = v.this.f273626z;
                Integer numBoxInt = Boxing.boxInt(this.f273646s);
                this.f273644q = 1;
                if (e2Var.emit(numBoxInt, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: VerticalFilterPresenterImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends kotlin.jvm.internal.N implements Y41.l<DeepLink, G0> {
        public m() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            b.a.a(v.this.f273615o, deepLink, null, null, 6);
            return G0.f406611a;
        }
    }

    @Inject
    public v(@Y61.k h31.e<InterfaceC34876l> eVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.inline_filters.dialog.s sVar, @Y61.k com.avito.android.serp.adapter.vertical_main.m mVar, @Y61.k h31.e<com.avito.android.location.r> eVar2, @Y61.k @hs0.n h31.e<InterfaceC30995b> eVar3, @hs0.l @Y61.k CN.f fVar, @Y61.k h31.e<W> eVar4, @Y61.k InterfaceC34866b interfaceC34866b, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.l SearchParams searchParams, @Y61.l String str, @hs0.u @Y61.l VerticalFilterState verticalFilterState, @Y61.k R0 r02, @Y61.k com.avito.android.guests_selector.d dVar, @Y61.k com.avito.android.serp.analytics.widgets_tracker.g gVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k C43624b c43624b, @Y61.k com.avito.android.inline_filters.dialog.calendar.date_range.a aVar2, @Y61.k B2 b22) {
        this.f273601a = eVar;
        this.f273602b = interfaceC28373a;
        this.f273603c = sVar;
        this.f273604d = mVar;
        this.f273605e = eVar2;
        this.f273606f = eVar3;
        this.f273607g = fVar;
        this.f273608h = eVar4;
        this.f273609i = interfaceC34866b;
        this.f273610j = interfaceC35745a5;
        this.f273611k = searchParams;
        this.f273612l = str;
        this.f273613m = dVar;
        this.f273614n = gVar;
        this.f273615o = aVar;
        this.f273616p = c43624b;
        this.f273617q = aVar2;
        this.f273618r = b22;
        com.jakewharton.rxrelay3.c<Integer> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f273625y = cVar;
        this.f273626z = f2.b(0, 0, null, 7);
        this.f273575A = U.a(r02.b());
        this.f273579E = new com.jakewharton.rxrelay3.c<>();
        this.f273581G = new HashMap();
        this.f273582H = verticalFilterState != null ? verticalFilterState.f273423b : null;
        this.f273583I = verticalFilterState != null ? verticalFilterState.f273424c : null;
        this.f273586L = "";
        this.f273589O = verticalFilterState != null ? verticalFilterState.f273425d : false;
        this.f273590P = verticalFilterState != null ? verticalFilterState.f273426e : null;
        this.f273591Q = new C43059p(InlineFilterValue.InlineFilterDateRangeValue.NUMERIC_ID_REGEX_PATTERN);
        this.f273592R = d.f273631l;
        this.f273597W = new C41981q0(cVar);
        com.jakewharton.rxrelay3.c<VerticalPromoBlockItem.VerticalFilterItem> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f273598X = cVar2;
        new C41981q0(cVar2);
        e2 e2VarB = f2.b(0, 0, null, 7);
        this.f273599Y = e2VarB;
        this.f273600Z = e2VarB;
    }

    @Override // com.avito.android.serp.adapter.vertical_main.p
    public final void b(@Y61.k Y0 y02) {
        Filter filter;
        this.f273576B = y02;
        C43175k.K(new C43197r1(new G(this, null), new F(C40482a.b(this.f273615o))), this.f273575A);
        VerticalFilterData verticalFilterData = this.f273582H;
        if (verticalFilterData == null || (filter = verticalFilterData.f272516g) == null) {
            return;
        }
        u(filter);
        this.f273583I = null;
    }

    @Override // com.avito.android.serp.adapter.vertical_main.p
    public final void c(@Y61.k Y41.a<Integer> aVar) {
        this.f273592R = aVar;
    }

    @Override // com.avito.android.serp.adapter.vertical_main.p
    @Y61.k
    /* renamed from: d, reason: from getter */
    public final C41981q0 getF273597W() {
        return this.f273597W;
    }

    @Override // com.avito.android.serp.adapter.vertical_main.p
    @Y61.l
    public final VerticalFilterState d0() {
        VerticalFilterData verticalFilterData = this.f273582H;
        if (verticalFilterData == null) {
            return null;
        }
        Y0 y02 = this.f273576B;
        Parcelable parcelableD0 = y02 != null ? y02.d0() : null;
        boolean z12 = this.f273589O;
        SearchFormWidgetAction searchFormWidgetAction = verticalFilterData.f272511b;
        return new VerticalFilterState(verticalFilterData, parcelableD0, z12, searchFormWidgetAction != null ? searchFormWidgetAction.getTooltipText() : null);
    }

    @Override // com.avito.android.serp.adapter.vertical_main.p
    @Y61.k
    /* renamed from: e, reason: from getter */
    public final e2 getF273624x() {
        return this.f273624x;
    }

    @Override // com.avito.android.serp.adapter.vertical_main.b
    public final void e0() {
        this.f273577C = null;
        this.f273594T = null;
        Y0 y02 = this.f273576B;
        if (y02 != null) {
            y02.f2();
        }
        this.f273576B = null;
        this.f273592R = c.f273630l;
        io.reactivex.rxjava3.internal.observers.y yVar = this.f273580F;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        io.reactivex.rxjava3.internal.observers.y yVar2 = this.f273578D;
        if (yVar2 != null) {
            DisposableHelper.a(yVar2);
        }
        this.f273580F = null;
        this.f273578D = null;
        this.f273582H = null;
        Q0.d(this.f273575A.f411905b);
    }

    @Override // com.avito.android.serp.adapter.vertical_main.p
    @Y61.k
    /* renamed from: g, reason: from getter */
    public final e2 getF273626z() {
        return this.f273626z;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00da  */
    /* JADX WARN: Type inference failed for: r3v15, types: [Y41.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.avito.android.serp.adapter.vertical_main.vertical_filter.J, java.lang.Object] */
    @Override // com.avito.android.serp.adapter.vertical_main.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(@Y61.k com.avito.android.serp.adapter.vertical_main.vertical_filter.J r27, @Y61.k com.avito.android.serp.adapter.vertical_main.VerticalPromoBlockItem.VerticalFilterItem r28, int r29) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.serp.adapter.vertical_main.vertical_filter.v.h(com.avito.android.serp.adapter.vertical_main.vertical_filter.J, com.avito.android.serp.adapter.vertical_main.VerticalPromoBlockItem$VerticalFilterItem, int):void");
    }

    @Override // com.avito.android.serp.adapter.vertical_main.b
    @Y61.k
    /* renamed from: i, reason: from getter */
    public final e2 getF273620t() {
        return this.f273620t;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.avito.android.serp.adapter.vertical_main.vertical_filter.J, java.lang.Object] */
    @Override // com.avito.android.serp.adapter.vertical_main.p
    public final void i0() {
        ?? r02 = this.f273577C;
        if (r02 != 0) {
            r02.Sj();
        }
    }

    @Override // com.avito.android.serp.adapter.vertical_main.b
    public final void j(@Y61.k Filter filter) {
        this.f273579E.accept(filter);
    }

    @Override // com.avito.android.serp.adapter.vertical_main.p
    public final void j0() {
        this.f273590P = null;
        this.f273589O = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.serp.adapter.vertical_main.p
    public final void k(@Y61.k String str, @Y61.k List<? extends ParcelableEntity<String>> list) throws NumberFormatException {
        List<Filter> list2;
        Object next;
        InlineFilterValue inlineFilterMultiSelectValue;
        String str2;
        VerticalFilterData verticalFilterData = this.f273582H;
        if (verticalFilterData == null || (list2 = verticalFilterData.f272512c) == null) {
            return;
        }
        Iterator<T> it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (kotlin.jvm.internal.L.f(((Filter) next).getId(), str)) {
                    break;
                }
            }
        }
        Filter filter = (Filter) next;
        if (filter == null) {
            return;
        }
        int i12 = 0;
        if (filter.getValue() instanceof InlineFilterValue.InlineFilterSelectIntValue) {
            ParcelableEntity parcelableEntity = (ParcelableEntity) C42745f0.K(0, list);
            if (parcelableEntity != null && (str2 = (String) parcelableEntity.getId()) != null) {
                String string = str2.toString();
                C43044a.a(10);
                i12 = Integer.parseInt(string, 10);
            }
            inlineFilterMultiSelectValue = new InlineFilterValue.InlineFilterSelectIntValue(i12);
        } else {
            Filter.Widget widget = filter.getWidget();
            if ((widget != null ? widget.getType() : null) == WidgetType.Select) {
                ParcelableEntity parcelableEntity2 = (ParcelableEntity) C42745f0.K(0, list);
                inlineFilterMultiSelectValue = new InlineFilterValue.InlineFilterSelectValue(parcelableEntity2 != null ? (String) parcelableEntity2.getId() : null);
            } else {
                List<? extends ParcelableEntity<String>> list3 = list;
                ArrayList arrayList = new ArrayList(C42745f0.q(list3, 10));
                Iterator<T> it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList.add((String) ((ParcelableEntity) it2.next()).getId());
                }
                inlineFilterMultiSelectValue = new InlineFilterValue.InlineFilterMultiSelectValue(arrayList);
            }
        }
        w(filter, inlineFilterMultiSelectValue);
    }

    @Override // com.avito.android.serp.adapter.vertical_main.p
    @Y61.k
    /* renamed from: m, reason: from getter */
    public final e2 getF273600Z() {
        return this.f273600Z;
    }

    @Override // com.avito.android.serp.adapter.vertical_main.b
    public final void n(@Y61.k Filter filter, boolean z12) {
        w(filter, new InlineFilterValue.InlineFilterBooleanValue(z12));
    }

    @Override // com.avito.android.serp.adapter.vertical_main.b
    public final void o(@Y61.k Filter filter, @Y61.l Filter.InnerOptions.Options options) {
        w(filter, new InlineFilterValue.InlineFilterSelectValue(options != null ? options.getOptionId() : null));
    }

    @Override // com.avito.android.serp.adapter.vertical_main.p
    public final void q(@Y61.k Y41.p<? super String, ? super String, G0> pVar) {
        this.f273594T = pVar;
    }

    public final void r(VerticalFilterData verticalFilterData, Y41.a<G0> aVar) {
        this.f273582H = verticalFilterData;
        SearchFormWidgetAnalyticParams searchFormWidgetAnalyticParams = this.f273584J;
        VerticalPromoBlockItem.VerticalFilterItem verticalFilterItem = new VerticalPromoBlockItem.VerticalFilterItem("", this.f273586L, verticalFilterData.f272512c, verticalFilterData.f272511b, verticalFilterData.f272514e, searchFormWidgetAnalyticParams, verticalFilterData.f272517h, this.f273587M, this.f273588N, this.f273593S, this.f273585K, null, null, 6144, null);
        this.f273598X.accept(verticalFilterItem);
        C43259k.d(this.f273575A, null, null, new C(this, verticalFilterItem, null), 3);
        this.f273609i.a(this.f273582H);
        y();
        x(verticalFilterData.f272517h);
        s(verticalFilterData.f272511b);
        aVar.invoke();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [Y41.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.avito.android.serp.adapter.vertical_main.vertical_filter.J, java.lang.Object] */
    public final void s(SearchFormWidgetAction searchFormWidgetAction) {
        String tooltipText;
        Integer num;
        this.f273590P = searchFormWidgetAction != null ? searchFormWidgetAction.getTooltipText() : null;
        if (searchFormWidgetAction == null || (tooltipText = searchFormWidgetAction.getTooltipText()) == null) {
            return;
        }
        InterfaceC43057n interfaceC43057nB = C43059p.b(this.f273591Q, tooltipText);
        if ((interfaceC43057nB != null ? interfaceC43057nB.getValue() : null) == null || (num = (Integer) this.f273592R.invoke()) == null) {
            return;
        }
        int iIntValue = num.intValue();
        ?? r12 = this.f273577C;
        if (r12 != 0) {
            r12.HW(new E(this, tooltipText, iIntValue));
        }
    }

    public final void t() {
        VerticalFilterData verticalFilterData = this.f273582H;
        this.f273582H = verticalFilterData != null ? VerticalFilterData.b(verticalFilterData, null, null, 95) : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(com.avito.android.remote.model.search.Filter r50) {
        /*
            Method dump skipped, instructions count: 679
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.serp.adapter.vertical_main.vertical_filter.v.u(com.avito.android.remote.model.search.Filter):void");
    }

    public final void v(SearchWidgetAction searchWidgetAction) {
        VerticalFilterData verticalFilterData = this.f273582H;
        if (verticalFilterData == null) {
            return;
        }
        this.f273619s.accept(verticalFilterData.f272515f);
        C43259k.d(this.f273575A, null, null, new j(verticalFilterData, null), 3);
        SearchFormWidgetAnalyticParams searchFormWidgetAnalyticParams = this.f273584J;
        String categoryId = searchFormWidgetAnalyticParams != null ? searchFormWidgetAnalyticParams.getCategoryId() : null;
        SearchFormWidgetAnalyticParams searchFormWidgetAnalyticParams2 = this.f273584J;
        this.f273602b.c(new Nr0.g(categoryId, searchFormWidgetAnalyticParams2 != null ? searchFormWidgetAnalyticParams2.getFormRawParams() : null, searchWidgetAction));
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [com.avito.android.serp.adapter.vertical_main.vertical_filter.J, java.lang.Object] */
    public final void w(Filter filter, InlineFilterValue inlineFilterValue) {
        SearchFormWidgetAnalyticParams searchFormWidgetAnalyticParams = this.f273584J;
        this.f273602b.c(new Nr0.f(searchFormWidgetAnalyticParams != null ? searchFormWidgetAnalyticParams.getCategoryId() : null, filter.getTitle(), inlineFilterValue.toStringList()));
        k kVar = new k(inlineFilterValue, filter, this);
        VerticalFilterData verticalFilterData = this.f273582H;
        if (verticalFilterData == null) {
            return;
        }
        io.reactivex.rxjava3.internal.observers.y yVar = this.f273578D;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        ?? r32 = this.f273577C;
        if (r32 != 0) {
            r32.Of(null, true);
        }
        this.f273578D = (io.reactivex.rxjava3.internal.observers.y) this.f273601a.get().a(verticalFilterData, filter, inlineFilterValue, VerticalFormType.f272519c).j0(this.f273610j.e()).v0(new x(this, kVar), new z(this), io.reactivex.rxjava3.internal.functions.a.f401993c);
    }

    public final void x(Integer num) {
        int iIntValue = num != null ? num.intValue() : 0;
        this.f273625y.accept(Integer.valueOf(iIntValue));
        C43259k.d(this.f273575A, null, null, new l(iIntValue, null), 3);
        VerticalFilterData verticalFilterData = this.f273582H;
        this.f273582H = verticalFilterData != null ? VerticalFilterData.b(verticalFilterData, null, Integer.valueOf(iIntValue), 63) : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.avito.android.serp.adapter.vertical_main.vertical_filter.J, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y() {
        /*
            r12 = this;
            java.lang.Object r0 = r12.f273577C
            if (r0 != 0) goto L5
            return
        L5:
            com.avito.android.serp.adapter.vertical_main.VerticalFilterData r1 = r12.f273582H
            if (r1 != 0) goto La
            return
        La:
            java.util.List<com.avito.android.remote.model.search.Filter> r2 = r1.f272512c
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L13
            return
        L13:
            r2 = 0
            java.util.List<com.avito.android.remote.model.vertical_main.SearchFormWidgetSubmitParam> r3 = r1.f272514e
            if (r3 == 0) goto L42
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L1e:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L38
            java.lang.Object r4 = r3.next()
            r5 = r4
            com.avito.android.remote.model.vertical_main.SearchFormWidgetSubmitParam r5 = (com.avito.android.remote.model.vertical_main.SearchFormWidgetSubmitParam) r5
            java.lang.String r5 = r5.getKey()
            java.lang.String r6 = "verticalId"
            boolean r5 = kotlin.jvm.internal.L.f(r5, r6)
            if (r5 == 0) goto L1e
            goto L39
        L38:
            r4 = r2
        L39:
            com.avito.android.remote.model.vertical_main.SearchFormWidgetSubmitParam r4 = (com.avito.android.remote.model.vertical_main.SearchFormWidgetSubmitParam) r4
            if (r4 == 0) goto L42
            java.lang.String r3 = r4.getValue()
            goto L43
        L42:
            r3 = r2
        L43:
            java.lang.String r4 = r1.f272513d
            r5 = 0
            r0.Of(r4, r5)
            java.lang.String r4 = "112"
            boolean r4 = kotlin.jvm.internal.L.f(r3, r4)
            if (r4 != 0) goto L5c
            java.lang.String r4 = "4"
            boolean r3 = kotlin.jvm.internal.L.f(r3, r4)
            if (r3 == 0) goto L5a
            goto L5c
        L5a:
            r9 = r5
            goto L5e
        L5c:
            r5 = 1
            goto L5a
        L5e:
            com.avito.android.serp.adapter.vertical_main.VerticalPromoBlockItem$ContentStyle r11 = r12.f273593S
            java.util.List<com.avito.android.remote.model.search.Filter> r7 = r1.f272512c
            java.lang.Integer r8 = r1.f272517h
            com.avito.android.serp.adapter.vertical_main.m r6 = r12.f273604d
            r10 = 1
            java.util.ArrayList r1 = r6.a(r7, r8, r9, r10, r11)
            r0.s1(r1)
            com.avito.android.serp.adapter.vertical_main.VerticalPromoBlockItem$ContentStyle r1 = r12.f273593S
            if (r1 == 0) goto L75
            java.lang.Integer r3 = r1.f272533g
            goto L76
        L75:
            r3 = r2
        L76:
            if (r1 == 0) goto L7a
            java.lang.String r2 = r1.f272528b
        L7a:
            java.lang.String r1 = "avitoTheme"
            boolean r1 = kotlin.jvm.internal.L.f(r2, r1)
            if (r1 == 0) goto L86
            r0.OD(r3)
            goto L89
        L86:
            r0.YI(r3)
        L89:
            com.avito.android.remote.model.vertical_main.BottomContent r1 = r12.f273588N
            com.avito.android.serp.adapter.vertical_main.vertical_filter.v$m r2 = new com.avito.android.serp.adapter.vertical_main.vertical_filter.v$m
            r2.<init>()
            r0.c20(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.serp.adapter.vertical_main.vertical_filter.v.y():void");
    }
}
