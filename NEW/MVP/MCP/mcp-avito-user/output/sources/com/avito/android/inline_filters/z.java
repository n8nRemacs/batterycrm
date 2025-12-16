package com.avito.android.inline_filters;

import Hr.InterfaceC14024a;
import android.os.Parcelable;
import android.view.View;
import cE.C27025b;
import com.avito.android.B2;
import com.avito.android.C0;
import com.avito.android.InterfaceC31096k2;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.beduin_models.BeduinUniversalPageContent;
import com.avito.android.deep_linking.links.BeduinUniversalPageLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.deep_linking.links.ScreenStyle;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.inline_filters.InterfaceC31062w;
import com.avito.android.inline_filters.dialog.InlineFilterDialogOpener;
import com.avito.android.inline_filters.link.InlineFiltersApplyLink;
import com.avito.android.onboarding_manager.OnboardingType;
import com.avito.android.remote.model.BxContentBusiness360;
import com.avito.android.remote.model.NavigationBarStyle;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.search.EntryPoint;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.Header;
import com.avito.android.remote.model.search.HeaderSubtitle;
import com.avito.android.remote.model.search.HeaderSubtitleAction;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.remote.model.search.InlineFilters;
import com.avito.android.remote.model.search.InlineFiltersKt;
import com.avito.android.remote.model.search.MapEntryAction;
import com.avito.android.remote.model.search.OnResult;
import com.avito.android.remote.model.search.Result;
import com.avito.android.remote.model.search.Tab;
import com.avito.android.remote.model.search.TabsConfig;
import com.avito.android.remote.model.search.TopWidget;
import com.avito.android.remote.model.search.WidgetType;
import com.avito.android.shortcut_navigation_bar.InlineActions;
import com.avito.android.shortcut_navigation_bar.InterfaceC34996m;
import com.avito.android.shortcut_navigation_bar.adapter.CollapsedShortcutItem;
import com.avito.android.shortcut_navigation_bar.adapter.InlineFilterNavigationItem;
import com.avito.android.shortcut_navigation_bar.adapter.ShortcutNavigationItem;
import com.avito.android.shortcut_navigation_bar.j0;
import com.avito.android.shortcut_navigation_bar.z0;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Kundle;
import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.kotlin.A1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import lE.C43624b;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import shark.AndroidResourceIdNames;

/* compiled from: InlineFiltersPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/z;", "Lcom/avito/android/inline_filters/w;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class z implements InterfaceC31062w {

    /* renamed from: A, reason: collision with root package name */
    @Y61.l
    public Object f172384A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.l
    public InterfaceC31096k2 f172385B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.l
    public Object f172386C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.l
    public DN.a f172387D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.l
    public PN.a f172388E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f172389F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f172390G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f172391H;

    /* renamed from: I, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<kotlin.Q<DeepLink, Boolean>> f172392I;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.b<Boolean> f172393J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.b<Boolean> f172394K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<Throwable> f172395L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<Filter.AutoShowPresetFiltersDialog> f172396M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f172397N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.l
    public Filter f172398O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.l
    public final HashMap f172399P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.l
    public SearchParams f172400Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.l
    public PresentationType f172401R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.l
    public String f172402S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.l
    public final Parcelable f172403T;

    /* renamed from: U, reason: collision with root package name */
    @Y61.l
    public Filter f172404U;

    /* renamed from: V, reason: collision with root package name */
    @Y61.l
    public Filter f172405V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.l
    public kotlin.jvm.internal.N f172406W;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30995b f172407a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f172408b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final W f172409c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC31046f f172410d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.location.r f172411e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final j0 f172412f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.inline_filters.dialog.s f172413g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f172414h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final CN.f f172415i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final CN.o f172416j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14024a f172417k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.inline_filters.link.f f172418l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final C27025b f172419m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.guests_selector.d f172420n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final B2 f172421o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.onboarding_manager.a f172422p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final C0 f172423q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final C43624b f172424r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.inline_filters.dialog.calendar.date_range.a f172425s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public InlineActions f172426t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.l
    public InlineFilters f172427u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.l
    public List<String> f172428v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f172429w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public List<? extends ShortcutNavigationItem> f172430x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public List<z0> f172431y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f172432z;

    /* compiled from: InlineFiltersPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0005\u001a\u00020\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/G0;", "kotlin.jvm.PlatformType", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            Result result;
            Header header;
            Result result2;
            Header header2;
            Result result3;
            Header header3;
            Result result4;
            Header header4;
            Result result5;
            Header header5;
            Result result6;
            Result result7;
            Result result8;
            z zVar = z.this;
            ArrayList arrayList = new ArrayList(zVar.f172430x);
            Iterator it = arrayList.iterator();
            int i12 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i12 = -1;
                    break;
                } else if (((ShortcutNavigationItem) it.next()) instanceof CollapsedShortcutItem) {
                    break;
                } else {
                    i12++;
                }
            }
            Integer numValueOf = Integer.valueOf(i12);
            Integer selectedFiltersCount = null;
            if (i12 < 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                Object obj2 = arrayList.get(numValueOf.intValue());
                CollapsedShortcutItem collapsedShortcutItem = obj2 instanceof CollapsedShortcutItem ? (CollapsedShortcutItem) obj2 : null;
                if (collapsedShortcutItem != null) {
                    arrayList.set(numValueOf.intValue(), new CollapsedShortcutItem(collapsedShortcutItem.f283219m, collapsedShortcutItem.f283220n, collapsedShortcutItem.f283221o, true, collapsedShortcutItem.f283228c, collapsedShortcutItem.f283229d, collapsedShortcutItem.f283232g, collapsedShortcutItem.f283233h));
                }
            }
            zVar.f172430x = arrayList;
            InlineFilters inlineFilters = zVar.f172427u;
            TopWidget topWidget = (inlineFilters == null || (result8 = inlineFilters.getResult()) == null) ? null : result8.getTopWidget();
            InlineFilters inlineFilters2 = zVar.f172427u;
            TabsConfig tabsConfig = (inlineFilters2 == null || (result7 = inlineFilters2.getResult()) == null) ? null : result7.getTabsConfig();
            InlineFilters inlineFilters3 = zVar.f172427u;
            EntryPoint topEntryPoint = (inlineFilters3 == null || (result6 = inlineFilters3.getResult()) == null) ? null : result6.getTopEntryPoint();
            InlineFilters inlineFilters4 = zVar.f172427u;
            String title = (inlineFilters4 == null || (result5 = inlineFilters4.getResult()) == null || (header5 = result5.getHeader()) == null) ? null : header5.getTitle();
            InlineFilters inlineFilters5 = zVar.f172427u;
            DeepLink resetAction = (inlineFilters5 == null || (result4 = inlineFilters5.getResult()) == null || (header4 = result4.getHeader()) == null) ? null : header4.getResetAction();
            InlineFilters inlineFilters6 = zVar.f172427u;
            Integer itemsCount = (inlineFilters6 == null || (result3 = inlineFilters6.getResult()) == null || (header3 = result3.getHeader()) == null) ? null : header3.getItemsCount();
            InlineFilters inlineFilters7 = zVar.f172427u;
            HeaderSubtitle subTitle = (inlineFilters7 == null || (result2 = inlineFilters7.getResult()) == null || (header2 = result2.getHeader()) == null) ? null : header2.getSubTitle();
            InlineFilters inlineFilters8 = zVar.f172427u;
            if (inlineFilters8 != null && (result = inlineFilters8.getResult()) != null && (header = result.getHeader()) != null) {
                selectedFiltersCount = header.getSelectedFiltersCount();
            }
            zVar.m(topWidget, tabsConfig, topEntryPoint, title, resetAction, itemsCount, subTitle, selectedFiltersCount, zVar.f172430x, zVar.f172431y, S.b(zVar.f172427u));
        }
    }

    /* compiled from: InlineFiltersPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/shortcut_navigation_bar/z0;", "selectedTab", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/shortcut_navigation_bar/z0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<z0, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(z0 z0Var) {
            String str;
            ArrayList arrayList;
            List<Tab> tabs;
            z0 z0Var2 = z0Var;
            z zVar = z.this;
            InlineFilters inlineFilters = zVar.f172427u;
            if (inlineFilters != null) {
                Result result = inlineFilters.getResult();
                Result resultCopy = null;
                if (result != null) {
                    Result result2 = inlineFilters.getResult();
                    if (result2 == null || (tabs = result2.getTabs()) == null) {
                        arrayList = null;
                    } else {
                        List<Tab> list = tabs;
                        ArrayList arrayList2 = new ArrayList(C42745f0.q(list, 10));
                        int i12 = 0;
                        for (Object obj : list) {
                            int i13 = i12 + 1;
                            if (i12 < 0) {
                                C42745f0.H0();
                                throw null;
                            }
                            arrayList2.add(Tab.copy$default((Tab) obj, null, null, kotlin.jvm.internal.L.f(String.valueOf(i12), z0Var2.f283599h), null, null, null, null, 123, null));
                            i12 = i13;
                        }
                        arrayList = arrayList2;
                    }
                    str = null;
                    resultCopy = result.copy((32751 & 1) != 0 ? result.onResult : null, (32751 & 2) != 0 ? result.header : null, (32751 & 4) != 0 ? result.topEntryPoint : null, (32751 & 8) != 0 ? result.bottomEntryPoint : null, (32751 & 16) != 0 ? result.filters : null, (32751 & 32) != 0 ? result.geoFilter : null, (32751 & 64) != 0 ? result.actionHorizontalBlock : null, (32751 & 128) != 0 ? result.uri : null, (32751 & 256) != 0 ? result.tabs : arrayList, (32751 & 512) != 0 ? result.topWidget : null, (32751 & 1024) != 0 ? result.tabsConfig : null, (32751 & 2048) != 0 ? result.submitParams : null, (32751 & 4096) != 0 ? result.additionalAction : null, (32751 & 8192) != 0 ? result.filtersButtonOnboarding : null, (32751 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? result.mapEntryAction : null);
                } else {
                    str = null;
                }
                zVar.m1(InlineFilters.copy$default(inlineFilters, str, resultCopy, 1, str));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: InlineFiltersPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ EntryPoint.Onboarding f172436l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ z f172437m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(EntryPoint.Onboarding onboarding, z zVar) {
            super(0);
            this.f172436l = onboarding;
            this.f172437m = zVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            DeepLink deeplink = this.f172436l.getDeeplink();
            if (deeplink != null) {
                b.a.a(this.f172437m.f172408b, deeplink, null, null, 6);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: InlineFiltersPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ EntryPoint.Onboarding f172438l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ z f172439m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(EntryPoint.Onboarding onboarding, z zVar) {
            super(0);
            this.f172438l = onboarding;
            this.f172439m = zVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            DeepLink onShow = this.f172438l.getOnShow();
            if (onShow != null) {
                b.a.a(this.f172439m.f172408b, onShow, null, null, 6);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: InlineFiltersPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ SearchParams f172441m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Filter f172442n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(SearchParams searchParams, Filter filter) {
            super(0);
            this.f172441m = searchParams;
            this.f172442n = filter;
        }

        @Override // Y41.a
        public final G0 invoke() {
            z.this.f172415i.i(this.f172441m, this.f172442n);
            return G0.f406611a;
        }
    }

    /* compiled from: InlineFiltersPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ SearchParams f172444m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Filter f172445n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Filter.Onboarding f172446o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(SearchParams searchParams, Filter filter, Filter.Onboarding onboarding) {
            super(0);
            this.f172444m = searchParams;
            this.f172445n = filter;
            this.f172446o = onboarding;
        }

        @Override // Y41.a
        public final G0 invoke() {
            z zVar = z.this;
            CN.f fVar = zVar.f172415i;
            Filter filter = this.f172445n;
            SearchParams searchParams = this.f172444m;
            fVar.l(searchParams, filter);
            z.c(zVar, this.f172446o.getOnTapAction(), searchParams);
            return G0.f406611a;
        }
    }

    /* compiled from: InlineFiltersPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Filter.Onboarding f172448m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Filter.Onboarding onboarding) {
            super(0);
            this.f172448m = onboarding;
        }

        @Override // Y41.a
        public final G0 invoke() {
            z.d(z.this, this.f172448m);
            return G0.f406611a;
        }
    }

    /* compiled from: InlineFiltersPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f172450m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str) {
            super(0);
            this.f172450m = str;
        }

        @Override // Y41.a
        public final G0 invoke() {
            z.this.f172415i.m(this.f172450m);
            return G0.f406611a;
        }
    }

    /* compiled from: InlineFiltersPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ NavigationBarStyle.NavigationIconOnboarding f172451l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ z f172452m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(NavigationBarStyle.NavigationIconOnboarding navigationIconOnboarding, z zVar) {
            super(0);
            this.f172451l = navigationIconOnboarding;
            this.f172452m = zVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            DeepLink buttonDeeplink = this.f172451l.getButtonDeeplink();
            if (buttonDeeplink != null) {
                b.a.a(this.f172452m.f172408b, buttonDeeplink, null, null, 6);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: InlineFiltersPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ NavigationBarStyle.NavigationIconOnboarding f172453l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ z f172454m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(NavigationBarStyle.NavigationIconOnboarding navigationIconOnboarding, z zVar) {
            super(0);
            this.f172453l = navigationIconOnboarding;
            this.f172454m = zVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            DeepLink onShowDeeplink = this.f172453l.getOnShowDeeplink();
            if (onShowDeeplink != null) {
                b.a.a(this.f172454m.f172408b, onShowDeeplink, null, null, 6);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: InlineFiltersPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ OnResult f172456m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(OnResult onResult) {
            super(0);
            this.f172456m = onResult;
        }

        @Override // Y41.a
        public final G0 invoke() {
            b.a.a(z.this.f172408b, this.f172456m.getDeepLink(), null, null, 6);
            return G0.f406611a;
        }
    }

    /* compiled from: InlineFiltersPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Tab.Onboarding f172457l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ z f172458m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Tab.Onboarding onboarding, z zVar) {
            super(0);
            this.f172457l = onboarding;
            this.f172458m = zVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            DeepLink deeplink = this.f172457l.getDeeplink();
            if (deeplink != null) {
                b.a.a(this.f172458m.f172408b, deeplink, null, null, 6);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: InlineFiltersPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Tab.Onboarding f172459l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ z f172460m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Tab.Onboarding onboarding, z zVar) {
            super(0);
            this.f172459l = onboarding;
            this.f172460m = zVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            DeepLink onShow = this.f172459l.getOnShow();
            if (onShow != null) {
                b.a.a(this.f172460m.f172408b, onShow, null, null, 6);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: InlineFiltersPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class o extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Tab.Onboarding f172461l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ z f172462m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(Tab.Onboarding onboarding, z zVar) {
            super(0);
            this.f172461l = onboarding;
            this.f172462m = zVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            DeepLink onDismiss = this.f172461l.getOnDismiss();
            if (onDismiss != null) {
                b.a.a(this.f172462m.f172408b, onDismiss, null, null, 6);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: InlineFiltersPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class p extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ EntryPoint.Onboarding f172463l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ z f172464m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(EntryPoint.Onboarding onboarding, z zVar) {
            super(0);
            this.f172463l = onboarding;
            this.f172464m = zVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            DeepLink deeplink = this.f172463l.getDeeplink();
            if (deeplink != null) {
                b.a.a(this.f172464m.f172408b, deeplink, null, null, 6);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: InlineFiltersPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class q extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ EntryPoint.Onboarding f172465l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ z f172466m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(EntryPoint.Onboarding onboarding, z zVar) {
            super(0);
            this.f172465l = onboarding;
            this.f172466m = zVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            DeepLink onShow = this.f172465l.getOnShow();
            if (onShow != null) {
                b.a.a(this.f172466m.f172408b, onShow, null, null, 6);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: InlineFiltersPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class r extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ TopWidget.Onboarding f172467l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ z f172468m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(TopWidget.Onboarding onboarding, z zVar) {
            super(0);
            this.f172467l = onboarding;
            this.f172468m = zVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            DeepLink deeplink = this.f172467l.getDeeplink();
            if (deeplink != null) {
                b.a.a(this.f172468m.f172408b, deeplink, null, null, 6);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: InlineFiltersPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class s extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ TopWidget.Onboarding f172469l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ z f172470m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(TopWidget.Onboarding onboarding, z zVar) {
            super(0);
            this.f172469l = onboarding;
            this.f172470m = zVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            DeepLink onShow = this.f172469l.getOnShow();
            if (onShow != null) {
                b.a.a(this.f172470m.f172408b, onShow, null, null, 6);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: InlineFiltersPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class t extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f172471l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(Y41.a<G0> aVar) {
            super(0);
            this.f172471l = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f172471l.invoke();
            return G0.f406611a;
        }
    }

    /* compiled from: InlineFiltersPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class u extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ EntryPoint f172472l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ z f172473m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(z zVar, EntryPoint entryPoint) {
            super(0);
            this.f172472l = entryPoint;
            this.f172473m = zVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            DeepLink cancelButtonDeeplink = this.f172472l.getCancelButtonDeeplink();
            if (cancelButtonDeeplink != null) {
                b.a.a(this.f172473m.f172408b, cancelButtonDeeplink, null, null, 6);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: InlineFiltersPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()Lkotlin/G0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class v extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ EntryPoint f172475m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(EntryPoint entryPoint) {
            super(0);
            this.f172475m = entryPoint;
        }

        @Override // Y41.a
        public final G0 invoke() {
            EntryPoint entryPoint = this.f172475m;
            z zVar = z.this;
            DeepLink deepLinkA = z.a(zVar, entryPoint);
            if (deepLinkA == null) {
                return null;
            }
            b.a.a(zVar.f172408b, deepLinkA, null, null, 6);
            return G0.f406611a;
        }
    }

    /* compiled from: InlineFiltersPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class w extends kotlin.jvm.internal.N implements Y41.l<DeepLink, G0> {
        public w() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            b.a.a(z.this.f172408b, deepLink, null, null, 6);
            return G0.f406611a;
        }
    }

    /* compiled from: InlineFiltersPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class x extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f172477l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(Y41.a<G0> aVar) {
            super(0);
            this.f172477l = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f172477l.invoke();
            return G0.f406611a;
        }
    }

    /* compiled from: InlineFiltersPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class y extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ EntryPoint f172478l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ z f172479m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(z zVar, EntryPoint entryPoint) {
            super(0);
            this.f172478l = entryPoint;
            this.f172479m = zVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            DeepLink cancelButtonDeeplink;
            EntryPoint entryPoint = this.f172478l;
            if (entryPoint != null && (cancelButtonDeeplink = entryPoint.getCancelButtonDeeplink()) != null) {
                b.a.a(this.f172479m.f172408b, cancelButtonDeeplink, null, null, 6);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: InlineFiltersPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()Lkotlin/G0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.inline_filters.z$z, reason: collision with other inner class name */
    public static final class C5084z extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ EntryPoint f172481m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5084z(EntryPoint entryPoint) {
            super(0);
            this.f172481m = entryPoint;
        }

        @Override // Y41.a
        public final G0 invoke() {
            EntryPoint entryPoint = this.f172481m;
            z zVar = z.this;
            DeepLink deepLinkA = z.a(zVar, entryPoint);
            if (deepLinkA == null) {
                return null;
            }
            b.a.a(zVar.f172408b, deepLinkA, null, null, 6);
            return G0.f406611a;
        }
    }

    @Inject
    public z(@Y61.k InterfaceC30995b interfaceC30995b, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k W w12, @Y61.k InterfaceC31046f interfaceC31046f, @Y61.k com.avito.android.location.r rVar, @Y61.k j0 j0Var, @Y61.k com.avito.android.inline_filters.dialog.s sVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k CN.f fVar, @Y61.k CN.o oVar, @Y61.l @com.avito.android.inline_filters.di.s Kundle kundle, @Y61.k InterfaceC14024a interfaceC14024a, @Y61.k com.avito.android.inline_filters.link.f fVar2, @Y61.k C27025b c27025b, @Y61.k com.avito.android.guests_selector.d dVar, @Y61.k B2 b22, @Y61.k com.avito.android.onboarding_manager.a aVar2, @Y61.k C0 c02, @Y61.k C43624b c43624b, @Y61.k com.avito.android.inline_filters.dialog.calendar.date_range.a aVar3) {
        this.f172407a = interfaceC30995b;
        this.f172408b = aVar;
        this.f172409c = w12;
        this.f172410d = interfaceC31046f;
        this.f172411e = rVar;
        this.f172412f = j0Var;
        this.f172413g = sVar;
        this.f172414h = interfaceC35745a5;
        this.f172415i = fVar;
        this.f172416j = oVar;
        this.f172417k = interfaceC14024a;
        this.f172418l = fVar2;
        this.f172419m = c27025b;
        this.f172420n = dVar;
        this.f172421o = b22;
        this.f172422p = aVar2;
        this.f172423q = c02;
        this.f172424r = c43624b;
        this.f172425s = aVar3;
        C42784z0 c42784z0 = C42784z0.f406748b;
        this.f172430x = c42784z0;
        this.f172431y = c42784z0;
        this.f172390G = new io.reactivex.rxjava3.disposables.c();
        this.f172391H = new io.reactivex.rxjava3.disposables.c();
        this.f172392I = new com.jakewharton.rxrelay3.c<>();
        this.f172393J = new com.jakewharton.rxrelay3.b<>();
        this.f172394K = new com.jakewharton.rxrelay3.b<>();
        this.f172395L = new com.jakewharton.rxrelay3.c<>();
        this.f172396M = new com.jakewharton.rxrelay3.c<>();
        this.f172397N = new com.jakewharton.rxrelay3.c<>();
        this.f172399P = new HashMap();
        State state = kundle != null ? (State) kundle.d("InlineFiltersState") : null;
        this.f172426t = state != null ? state.f171034b : null;
        m1(state != null ? state.f171035c : null);
        InlineFilters inlineFilters = this.f172427u;
        if (inlineFilters != null) {
            g(inlineFilters);
        }
        this.f172428v = state != null ? state.f171040h : null;
        this.f172398O = state != null ? state.f171036d : null;
        this.f172400Q = state != null ? state.f171037e : null;
        this.f172401R = state != null ? state.f171038f : null;
        this.f172402S = state != null ? state.f171041i : null;
        this.f172403T = state != null ? state.f171039g : null;
        this.f172389F = state != null ? state.f171042j : false;
    }

    public static final DeepLink a(z zVar, EntryPoint entryPoint) {
        BeduinUniversalPageContent universalPage;
        zVar.getClass();
        BeduinUniversalPageLink beduinUniversalPageLink = (entryPoint == null || (universalPage = entryPoint.getUniversalPage()) == null) ? null : new BeduinUniversalPageLink(null, ScreenStyle.BOTTOM_SHEET.f133649b, universalPage.getScreenName(), Long.valueOf(zVar.f172417k.a(universalPage)), null, null, null, 112, null);
        if (beduinUniversalPageLink != null) {
            return beduinUniversalPageLink;
        }
        if (entryPoint != null) {
            return entryPoint.getDeeplink();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.avito.android.shortcut_navigation_bar.m, java.lang.Object] */
    public static final void b(z zVar) {
        Filter filter;
        InlineFilters inlineFilters;
        Result result;
        List<Filter> filters;
        DeepLink noMatchLink;
        Filter.Widget widgetCopy$default;
        Result resultCopy;
        ArrayList arrayList;
        Result result2;
        List<Filter> filters2;
        Filter.Config config;
        Result result3;
        Result result4;
        List<Filter> filters3;
        Object next;
        Filter.Config config2;
        InlineFilters inlineFilters2 = zVar.f172427u;
        InlineFilters inlineFiltersCopy$default = null;
        if (inlineFilters2 == null || (result4 = inlineFilters2.getResult()) == null || (filters3 = result4.getFilters()) == null) {
            filter = null;
        } else {
            Iterator<T> it = filters3.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Filter.Widget widget = ((Filter) next).getWidget();
                if ((widget == null || (config2 = widget.getConfig()) == null) ? false : kotlin.jvm.internal.L.f(config2.isAutoOpen(), Boolean.TRUE)) {
                    break;
                }
            }
            filter = (Filter) next;
        }
        if (filter == null || (inlineFilters = zVar.f172427u) == null || (result = inlineFilters.getResult()) == null || (filters = result.getFilters()) == null) {
            return;
        }
        int iIndexOf = filters.indexOf(filter);
        Integer numValueOf = Integer.valueOf(iIndexOf);
        if (!(iIndexOf >= 0)) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            InlineFilters inlineFilters3 = zVar.f172427u;
            if (inlineFilters3 == null || (result3 = inlineFilters3.getResult()) == null || (noMatchLink = result3.getUri()) == null) {
                noMatchLink = new NoMatchLink();
            }
            ShortcutNavigationItem shortcutNavigationItemC = zVar.f172412f.c(filter, iIntValue, noMatchLink);
            Filter.Widget widget2 = filter.getWidget();
            if (widget2 != null) {
                Filter.Widget widget3 = filter.getWidget();
                widgetCopy$default = Filter.Widget.copy$default(widget2, null, null, (widget3 == null || (config = widget3.getConfig()) == null) ? null : config.copy(((-16777217) & 1) != 0 ? config.customTitle : null, ((-16777217) & 2) != 0 ? config.customTitleOn : null, ((-16777217) & 4) != 0 ? config.attributedDisplayTitle : null, ((-16777217) & 8) != 0 ? config.toPlaceholder : null, ((-16777217) & 16) != 0 ? config.fromPlaceholder : null, ((-16777217) & 32) != 0 ? config.toValueFormat : null, ((-16777217) & 64) != 0 ? config.fromValueFormat : null, ((-16777217) & 128) != 0 ? config.thousandsSeparator : null, ((-16777217) & 256) != 0 ? config.groups : null, ((-16777217) & 512) != 0 ? config.areGroupsCollapsible : null, ((-16777217) & 1024) != 0 ? config.resetDisabled : null, ((-16777217) & 2048) != 0 ? config.withBackButton : null, ((-16777217) & 4096) != 0 ? config.withSkipButton : null, ((-16777217) & 8192) != 0 ? config.size : null, ((-16777217) & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? config.nextAction : null, ((-16777217) & 32768) != 0 ? config.withImages : null, ((-16777217) & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? config.sortDirection : null, ((-16777217) & 131072) != 0 ? config.optionTabs : null, ((-16777217) & 262144) != 0 ? config.hideCounterOnEmptyTabSelection : null, ((-16777217) & 524288) != 0 ? config.suggestLimit : null, ((-16777217) & 1048576) != 0 ? config.defaultSuggests : null, ((-16777217) & 2097152) != 0 ? config.categoryId : null, ((-16777217) & 4194304) != 0 ? config.imageParams : null, ((-16777217) & 8388608) != 0 ? config.externalId : null, ((-16777217) & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? config.isAutoOpen : Boolean.FALSE, ((-16777217) & 33554432) != 0 ? config.hint : null, ((-16777217) & 67108864) != 0 ? config.radioIds : null, ((-16777217) & 134217728) != 0 ? config.limit : null, ((-16777217) & 268435456) != 0 ? config.limitMessage : null, ((-16777217) & 536870912) != 0 ? config.theme : null, ((-16777217) & 1073741824) != 0 ? config.searchAvailable : null, ((-16777217) & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? config.icon : null, (524287 & 1) != 0 ? config.iconOn : null, (524287 & 2) != 0 ? config.autofocusFilterId : null, (524287 & 4) != 0 ? config.displaying : null, (524287 & 8) != 0 ? config.multiThemeIcon : null, (524287 & 16) != 0 ? config.fields : null, (524287 & 32) != 0 ? config.values : null, (524287 & 64) != 0 ? config.minGuests : null, (524287 & 128) != 0 ? config.maxGuests : null, (524287 & 256) != 0 ? config.maxAdultsCount : null, (524287 & 512) != 0 ? config.maxChildrenCount : null, (524287 & 1024) != 0 ? config.isNdProfSearch : null, (524287 & 2048) != 0 ? config.deeplink : null, (524287 & 4096) != 0 ? config.autoShowPresetFiltersDialog : null, (524287 & 8192) != 0 ? config.widgetType : null, (524287 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? config.calendarSelectionType : null, (524287 & 32768) != 0 ? config.flexSearchDate : null, (524287 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? config.followCategoryDeeplink : null, (524287 & 131072) != 0 ? config.separators : null, (524287 & 262144) != 0 ? config.isToolbarFilter : null), null, null, null, null, 123, null);
            } else {
                widgetCopy$default = null;
            }
            Filter filterCopy = filter.copy((65279 & 1) != 0 ? filter.attrId : null, (65279 & 2) != 0 ? filter.id : null, (65279 & 4) != 0 ? filter.widget : widgetCopy$default, (65279 & 8) != 0 ? filter.payload : null, (65279 & 16) != 0 ? filter.title : null, (65279 & 32) != 0 ? filter.searchHint : null, (65279 & 64) != 0 ? filter.displayTitle : null, (65279 & 128) != 0 ? filter.isHighlighted : null, (65279 & 256) != 0 ? filter.value : null, (65279 & 512) != 0 ? filter.options : null, (65279 & 1024) != 0 ? filter.selectedOptions : null, (65279 & 2048) != 0 ? filter.filters : null, (65279 & 4096) != 0 ? filter.changedParamType : null, (65279 & 8192) != 0 ? filter.hasSuggest : null, (65279 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? filter.richTitle : null, (65279 & 32768) != 0 ? filter.resetAreaOnChange : false);
            InlineFilters inlineFilters4 = zVar.f172427u;
            if (inlineFilters4 != null) {
                Result result5 = inlineFilters4.getResult();
                if (result5 != null) {
                    InlineFilters inlineFilters5 = zVar.f172427u;
                    if (inlineFilters5 == null || (result2 = inlineFilters5.getResult()) == null || (filters2 = result2.getFilters()) == null) {
                        arrayList = null;
                    } else {
                        ArrayList arrayList2 = new ArrayList(filters2);
                        arrayList2.set(iIntValue, filterCopy);
                        G0 g02 = G0.f406611a;
                        arrayList = arrayList2;
                    }
                    resultCopy = result5.copy((32751 & 1) != 0 ? result5.onResult : null, (32751 & 2) != 0 ? result5.header : null, (32751 & 4) != 0 ? result5.topEntryPoint : null, (32751 & 8) != 0 ? result5.bottomEntryPoint : null, (32751 & 16) != 0 ? result5.filters : arrayList, (32751 & 32) != 0 ? result5.geoFilter : null, (32751 & 64) != 0 ? result5.actionHorizontalBlock : null, (32751 & 128) != 0 ? result5.uri : null, (32751 & 256) != 0 ? result5.tabs : null, (32751 & 512) != 0 ? result5.topWidget : null, (32751 & 1024) != 0 ? result5.tabsConfig : null, (32751 & 2048) != 0 ? result5.submitParams : null, (32751 & 4096) != 0 ? result5.additionalAction : null, (32751 & 8192) != 0 ? result5.filtersButtonOnboarding : null, (32751 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? result5.mapEntryAction : null);
                } else {
                    resultCopy = null;
                }
                inlineFiltersCopy$default = InlineFilters.copy$default(inlineFilters4, null, resultCopy, 1, null);
            }
            zVar.m1(inlineFiltersCopy$default);
            ?? r02 = zVar.f172384A;
            if (r02 != 0) {
                r02.TP(shortcutNavigationItemC);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v7, types: [com.avito.android.shortcut_navigation_bar.m, java.lang.Object] */
    public static final void c(z zVar, Filter.Onboarding.OnTapAction onTapAction, SearchParams searchParams) {
        Result result;
        List<Filter> filters;
        Result result2;
        Filter.Onboarding filtersButtonOnboarding;
        zVar.getClass();
        if (onTapAction == null) {
            return;
        }
        String nextOnboardingId = onTapAction.getNextOnboardingId();
        DeepLink deeplink = onTapAction.getDeeplink();
        Filter filter = null;
        if (nextOnboardingId == null) {
            if (deeplink != null) {
                b.a.a(zVar.f172408b, deeplink, null, null, 6);
                return;
            }
            return;
        }
        InlineFilters inlineFilters = zVar.f172427u;
        Filter.Onboarding onboarding = (inlineFilters == null || (result2 = inlineFilters.getResult()) == null || (filtersButtonOnboarding = result2.getFiltersButtonOnboarding()) == null || !kotlin.jvm.internal.L.f(filtersButtonOnboarding.getOnceShowId(), nextOnboardingId)) ? null : filtersButtonOnboarding;
        if (onboarding != null) {
            OnboardingType onboardingType = OnboardingType.f209410c;
            ?? r32 = zVar.f172384A;
            if (r32 != 0) {
                r32.EH(onboarding, onboardingType, new L(zVar, searchParams, onboarding), new M(zVar, searchParams), new N(zVar, onboarding));
                return;
            }
            return;
        }
        InlineFilters inlineFilters2 = zVar.f172427u;
        if (inlineFilters2 != null && (result = inlineFilters2.getResult()) != null && (filters = result.getFilters()) != null) {
            Iterator<T> it = filters.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Filter.Onboarding onboardingC = S.c((Filter) next);
                if (kotlin.jvm.internal.L.f(onboardingC != null ? onboardingC.getOnceShowId() : null, nextOnboardingId)) {
                    filter = next;
                    break;
                }
            }
            filter = filter;
        }
        if (filter != null) {
            zVar.j(filter, OnboardingType.f209410c, searchParams);
        }
    }

    public static final void d(z zVar, Filter.Onboarding onboarding) {
        InlineFilters inlineFilters = zVar.f172427u;
        Filter.Onboarding.OnTapAction onTapAction = onboarding.getOnTapAction();
        Filter.Onboarding onboardingA = S.a(inlineFilters, onTapAction != null ? onTapAction.getNextOnboardingId() : null);
        while (onboardingA != null) {
            String onceShowId = onboardingA.getOnceShowId();
            if (onceShowId != null) {
                zVar.f172422p.f209413a.e(onceShowId);
            }
            InlineFilters inlineFilters2 = zVar.f172427u;
            Filter.Onboarding.OnTapAction onTapAction2 = onboardingA.getOnTapAction();
            onboardingA = S.a(inlineFilters2, onTapAction2 != null ? onTapAction2.getNextOnboardingId() : null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void f(z zVar, List list, SearchParams searchParams, PresentationType presentationType, String str, boolean z12, Y41.a aVar, int i12) {
        boolean z13 = (i12 & 16) != 0 ? false : z12;
        Y41.a aVar2 = (i12 & 32) != 0 ? null : aVar;
        zVar.f172432z = true;
        zVar.f172394K.accept(Boolean.TRUE);
        io.reactivex.rxjava3.disposables.c cVar = zVar.f172390G;
        cVar.e();
        cVar.b(zVar.f172407a.d(list, searchParams, presentationType, (8 & 8) != 0 ? null : null, zVar.f172428v, (8 & 32) != 0 ? null : str).j0(zVar.f172414h.e()).v0(new C31063x(zVar, searchParams, list, aVar2, z13), new com.avito.android.inline_filters.y(zVar), io.reactivex.rxjava3.internal.functions.a.f401993c));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kotlin.Q q12 = (kotlin.Q) it.next();
            Filter filter = (Filter) q12.f406619b;
            InlineFilterValue inlineFilterValue = (InlineFilterValue) q12.f406620c;
            boolean zF2 = kotlin.jvm.internal.L.f(filter.getId(), SearchParamsConverterKt.SORT);
            CN.f fVar = zVar.f172415i;
            if (zF2) {
                fVar.b(searchParams != null ? searchParams.getCategoryId() : null, filter, inlineFilterValue);
            } else {
                fVar.o(searchParams, filter, inlineFilterValue);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0098  */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.avito.android.inline_filters.dialog.InlineFilterDialogOpener, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void i(com.avito.android.inline_filters.z r45, com.avito.android.remote.model.search.Filter r46, com.avito.android.remote.model.SearchParams r47, android.os.Parcelable r48, com.avito.android.remote.model.PresentationType r49, java.lang.String r50, int r51) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.inline_filters.z.i(com.avito.android.inline_filters.z, com.avito.android.remote.model.search.Filter, com.avito.android.remote.model.SearchParams, android.os.Parcelable, com.avito.android.remote.model.PresentationType, java.lang.String, int):void");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.avito.android.inline_filters.dialog.InlineFilterDialogOpener, java.lang.Object] */
    @Override // com.avito.android.inline_filters.InterfaceC31062w
    public final void I() {
        this.f172391H.e();
        this.f172390G.e();
        this.f172384A = null;
        this.f172385B = null;
        ?? r12 = this.f172386C;
        if (r12 != 0) {
            r12.f2();
        }
        this.f172386C = null;
        this.f172387D = null;
        this.f172388E = null;
    }

    @Override // com.avito.android.inline_filters.InterfaceC31062w
    /* renamed from: V0, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF172395L() {
        return this.f172395L;
    }

    @Override // com.avito.android.inline_filters.InterfaceC31062w
    @Y61.l
    public final List<String> W0() {
        return this.f172428v;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.avito.android.shortcut_navigation_bar.m, java.lang.Object] */
    @Override // com.avito.android.inline_filters.InterfaceC31062w
    public final void X0(@Y61.l SearchParams searchParams) {
        InlineFilters inlineFilters;
        Result result;
        Filter.Onboarding filtersButtonOnboarding;
        if (searchParams == null || (inlineFilters = this.f172427u) == null || (result = inlineFilters.getResult()) == null || (filtersButtonOnboarding = result.getFiltersButtonOnboarding()) == null) {
            return;
        }
        OnboardingType onboardingType = OnboardingType.f209409b;
        ?? r12 = this.f172384A;
        if (r12 != 0) {
            r12.EH(filtersButtonOnboarding, onboardingType, new L(this, searchParams, filtersButtonOnboarding), new M(this, searchParams), new N(this, filtersButtonOnboarding));
        }
    }

    @Override // com.avito.android.inline_filters.InterfaceC31062w
    public final void Y0() {
        Result result;
        EntryPoint bottomEntryPoint;
        Result result2;
        InlineFilters inlineFilters = this.f172427u;
        if (inlineFilters == null || (result = inlineFilters.getResult()) == null || (bottomEntryPoint = result.getBottomEntryPoint()) == null) {
            return;
        }
        v vVar = new v(bottomEntryPoint);
        DN.a aVar = this.f172387D;
        if (aVar != null) {
            aVar.a(bottomEntryPoint, new t(vVar), new u(this, bottomEntryPoint));
        }
        if (this.f172389F || !kotlin.jvm.internal.L.f(bottomEntryPoint.isAutoOpen(), Boolean.TRUE)) {
            return;
        }
        InlineFilters inlineFilters2 = this.f172427u;
        Result resultCopy = (inlineFilters2 == null || (result2 = inlineFilters2.getResult()) == null) ? null : result2.copy((32751 & 1) != 0 ? result2.onResult : null, (32751 & 2) != 0 ? result2.header : null, (32751 & 4) != 0 ? result2.topEntryPoint : null, (32751 & 8) != 0 ? result2.bottomEntryPoint : EntryPoint.copy$default(bottomEntryPoint, null, null, null, null, Boolean.FALSE, null, null, 111, null), (32751 & 16) != 0 ? result2.filters : null, (32751 & 32) != 0 ? result2.geoFilter : null, (32751 & 64) != 0 ? result2.actionHorizontalBlock : null, (32751 & 128) != 0 ? result2.uri : null, (32751 & 256) != 0 ? result2.tabs : null, (32751 & 512) != 0 ? result2.topWidget : null, (32751 & 1024) != 0 ? result2.tabsConfig : null, (32751 & 2048) != 0 ? result2.submitParams : null, (32751 & 4096) != 0 ? result2.additionalAction : null, (32751 & 8192) != 0 ? result2.filtersButtonOnboarding : null, (32751 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? result2.mapEntryAction : null);
        InlineFilters inlineFilters3 = this.f172427u;
        m1(inlineFilters3 != null ? InlineFilters.copy$default(inlineFilters3, null, resultCopy, 1, null) : null);
        this.f172389F = true;
        vVar.invoke();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.avito.android.shortcut_navigation_bar.m, java.lang.Object] */
    @Override // com.avito.android.inline_filters.InterfaceC31062w
    public final void Z0(@Y61.l BxContentBusiness360.ReplaceMain.Onboarding onboarding, @Y61.k Y41.a<G0> aVar) {
        ?? r02;
        if (onboarding == null || (r02 = this.f172384A) == 0) {
            return;
        }
        OnboardingType onboardingType = OnboardingType.f209409b;
        r02.HQ(onboarding, aVar);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.avito.android.shortcut_navigation_bar.m, java.lang.Object] */
    @Override // com.avito.android.inline_filters.InterfaceC31062w
    public final void a1() {
        Result result;
        EntryPoint topEntryPoint;
        EntryPoint.Onboarding onboarding;
        ?? r12;
        InlineFilters inlineFilters = this.f172427u;
        if (inlineFilters == null || (result = inlineFilters.getResult()) == null || (topEntryPoint = result.getTopEntryPoint()) == null || (onboarding = topEntryPoint.getOnboarding()) == null || (r12 = this.f172384A) == 0) {
            return;
        }
        OnboardingType onboardingType = OnboardingType.f209409b;
        r12.JY(onboarding, new p(onboarding, this), new q(onboarding, this));
    }

    @Override // com.avito.android.inline_filters.InterfaceC31062w
    /* renamed from: b1, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF172392I() {
        return this.f172392I;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.avito.android.shortcut_navigation_bar.m, java.lang.Object] */
    @Override // com.avito.android.inline_filters.InterfaceC31062w
    public final void c1() {
        Result result;
        OnResult onResult;
        ?? r12;
        InlineFilters inlineFilters = this.f172427u;
        if (inlineFilters == null || (result = inlineFilters.getResult()) == null || (onResult = result.getOnResult()) == null || (r12 = this.f172384A) == 0) {
            return;
        }
        r12.fk(onResult.getJoinOnboardingsLogic(), new l(onResult));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.avito.android.inline_filters.dialog.InlineFilterDialogOpener, java.lang.Object] */
    @Override // com.avito.android.inline_filters.InterfaceC31062w
    @Y61.k
    public final Kundle d0() {
        Kundle kundle = new Kundle();
        InlineActions inlineActions = this.f172426t;
        InlineFilters inlineFilters = this.f172427u;
        Filter filter = this.f172398O;
        SearchParams searchParams = this.f172400Q;
        PresentationType presentationType = this.f172401R;
        ?? r12 = this.f172386C;
        kundle.j(new State(inlineActions, inlineFilters, filter, searchParams, presentationType, r12 != 0 ? r12.d0() : null, this.f172428v, this.f172402S, this.f172389F), "InlineFiltersState");
        return kundle;
    }

    @Override // com.avito.android.inline_filters.InterfaceC31062w
    /* renamed from: d1, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF172396M() {
        return this.f172396M;
    }

    public final void e(Filter filter, InlineFilterValue inlineFilterValue, SearchParams searchParams, PresentationType presentationType, String str) {
        f(this, Collections.singletonList(new kotlin.Q(filter, inlineFilterValue)), searchParams, presentationType, str, filter.getResetAreaOnChange(), null, 32);
    }

    @Override // com.avito.android.inline_filters.InterfaceC31062w
    public final void e1() {
        Result result;
        InlineFilters inlineFilters = this.f172427u;
        MapEntryAction mapEntryAction = (inlineFilters == null || (result = inlineFilters.getResult()) == null) ? null : result.getMapEntryAction();
        PN.a aVar = this.f172388E;
        if (aVar != null) {
            aVar.a(mapEntryAction, new w());
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.avito.android.shortcut_navigation_bar.m, java.lang.Object] */
    @Override // com.avito.android.inline_filters.InterfaceC31062w
    public final void f1() {
        Result result;
        EntryPoint bottomEntryPoint;
        EntryPoint.Onboarding onboarding;
        ?? r12;
        View f3162a;
        InlineFilters inlineFilters = this.f172427u;
        if (inlineFilters == null || (result = inlineFilters.getResult()) == null || (bottomEntryPoint = result.getBottomEntryPoint()) == null || (onboarding = bottomEntryPoint.getOnboarding()) == null || (r12 = this.f172384A) == 0) {
            return;
        }
        OnboardingType onboardingType = OnboardingType.f209409b;
        DN.a aVar = this.f172387D;
        if (aVar == null || (f3162a = aVar.getF3162a()) == null) {
            return;
        }
        r12.Df(onboarding, f3162a, new d(onboarding, this), new e(onboarding, this));
    }

    public final void g(InlineFilters inlineFilters) {
        Result resultCopy;
        Header header;
        String title;
        Result resultCopy2;
        Header header2;
        Header header3;
        HeaderSubtitle subTitle;
        Result result = inlineFilters.getResult();
        Filter geoFilter = result != null ? result.getGeoFilter() : null;
        if (geoFilter == null) {
            Result result2 = inlineFilters.getResult();
            if (result2 != null) {
                Result result3 = inlineFilters.getResult();
                resultCopy = result2.copy((32751 & 1) != 0 ? result2.onResult : null, (32751 & 2) != 0 ? result2.header : (result3 == null || (header = result3.getHeader()) == null) ? null : Header.copy$default(header, null, null, null, null, null, null, 47, null), (32751 & 4) != 0 ? result2.topEntryPoint : null, (32751 & 8) != 0 ? result2.bottomEntryPoint : null, (32751 & 16) != 0 ? result2.filters : null, (32751 & 32) != 0 ? result2.geoFilter : null, (32751 & 64) != 0 ? result2.actionHorizontalBlock : null, (32751 & 128) != 0 ? result2.uri : null, (32751 & 256) != 0 ? result2.tabs : null, (32751 & 512) != 0 ? result2.topWidget : null, (32751 & 1024) != 0 ? result2.tabsConfig : null, (32751 & 2048) != 0 ? result2.submitParams : null, (32751 & 4096) != 0 ? result2.additionalAction : null, (32751 & 8192) != 0 ? result2.filtersButtonOnboarding : null, (32751 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? result2.mapEntryAction : null);
            } else {
                resultCopy = null;
            }
            m1(InlineFilters.copy$default(inlineFilters, null, resultCopy, 1, null));
            return;
        }
        Result result4 = inlineFilters.getResult();
        if (result4 == null || (header3 = result4.getHeader()) == null || (subTitle = header3.getSubTitle()) == null || (title = subTitle.getTitle()) == null) {
            title = "";
        }
        HeaderSubtitle headerSubtitle = new HeaderSubtitle(title, new HeaderSubtitleAction(null, geoFilter.getId()), geoFilter.getRichTitle());
        if (this.f172404U != null) {
            this.f172404U = geoFilter;
        }
        Result result5 = inlineFilters.getResult();
        if (result5 != null) {
            Result result6 = inlineFilters.getResult();
            resultCopy2 = result5.copy((32751 & 1) != 0 ? result5.onResult : null, (32751 & 2) != 0 ? result5.header : (result6 == null || (header2 = result6.getHeader()) == null) ? null : Header.copy$default(header2, null, null, null, null, headerSubtitle, null, 47, null), (32751 & 4) != 0 ? result5.topEntryPoint : null, (32751 & 8) != 0 ? result5.bottomEntryPoint : null, (32751 & 16) != 0 ? result5.filters : null, (32751 & 32) != 0 ? result5.geoFilter : null, (32751 & 64) != 0 ? result5.actionHorizontalBlock : null, (32751 & 128) != 0 ? result5.uri : null, (32751 & 256) != 0 ? result5.tabs : null, (32751 & 512) != 0 ? result5.topWidget : null, (32751 & 1024) != 0 ? result5.tabsConfig : null, (32751 & 2048) != 0 ? result5.submitParams : null, (32751 & 4096) != 0 ? result5.additionalAction : null, (32751 & 8192) != 0 ? result5.filtersButtonOnboarding : null, (32751 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? result5.mapEntryAction : null);
        } else {
            resultCopy2 = null;
        }
        m1(InlineFilters.copy$default(inlineFilters, null, resultCopy2, 1, null));
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [com.avito.android.shortcut_navigation_bar.m, java.lang.Object] */
    @Override // com.avito.android.inline_filters.InterfaceC31062w
    public final void g1() {
        ?? r32;
        Result result;
        InlineFilters inlineFilters = this.f172427u;
        List<Tab> tabs = (inlineFilters == null || (result = inlineFilters.getResult()) == null) ? null : result.getTabs();
        if (tabs != null) {
            int i12 = 0;
            for (Object obj : tabs) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                Tab tab = (Tab) obj;
                Tab.Onboarding onboarding = tab.getOnboarding();
                String title = tab.getTitle();
                if (title == null) {
                    title = "";
                }
                String str = title;
                if (onboarding != null && str.length() > 0 && (r32 = this.f172384A) != 0) {
                    OnboardingType onboardingType = OnboardingType.f209409b;
                    r32.zw(onboarding, new m(onboarding, this), new n(onboarding, this), new o(onboarding, this), str, i12);
                }
                i12 = i13;
            }
        }
    }

    public final void h(Filter filter, SearchParams searchParams, PresentationType presentationType, String str) {
        Filter.InnerOptions.Options optionsFirstOption;
        Result result;
        Header header;
        Result result2;
        Header header2;
        Result result3;
        Header header3;
        Result result4;
        Header header4;
        Result result5;
        Header header5;
        Result result6;
        Result result7;
        Result result8;
        Filter.InnerOptions.State state;
        String id2 = filter.getId();
        boolean zF2 = kotlin.jvm.internal.L.f(id2, SearchParamsConverterKt.SORT);
        CN.f fVar = this.f172415i;
        if (zF2) {
            fVar.j(searchParams.getCategoryId());
        } else if (!kotlin.jvm.internal.L.f(id2, "locationGroup")) {
            fVar.n(searchParams, filter);
        }
        Filter.Widget widget = filter.getWidget();
        String id3 = null;
        if ((widget != null ? widget.getType() : null) != WidgetType.Checkbox) {
            this.f172398O = filter;
            this.f172400Q = searchParams;
            this.f172401R = presentationType;
            this.f172402S = str;
            i(this, filter, searchParams, null, presentationType, str, 4);
            return;
        }
        if (this.f172432z) {
            return;
        }
        for (ShortcutNavigationItem shortcutNavigationItem : this.f172430x) {
            if (shortcutNavigationItem instanceof InlineFilterNavigationItem) {
                InlineFilterNavigationItem inlineFilterNavigationItem = (InlineFilterNavigationItem) shortcutNavigationItem;
                Filter filter2 = inlineFilterNavigationItem.f283232g;
                if (kotlin.jvm.internal.L.f(filter2 != null ? filter2.getId() : null, filter.getId()) && (state = inlineFilterNavigationItem.f283237l) != null) {
                    inlineFilterNavigationItem.f283237l = inlineFilterNavigationItem.f283236k;
                    inlineFilterNavigationItem.f283236k = state;
                    inlineFilterNavigationItem.f283233h = state.getDisplayTitle();
                    Boolean isHighlighted = inlineFilterNavigationItem.f283236k.getIsHighlighted();
                    inlineFilterNavigationItem.f283234i = isHighlighted != null ? isHighlighted.booleanValue() : false;
                }
            }
        }
        InlineFilters inlineFilters = this.f172427u;
        TopWidget topWidget = (inlineFilters == null || (result8 = inlineFilters.getResult()) == null) ? null : result8.getTopWidget();
        InlineFilters inlineFilters2 = this.f172427u;
        TabsConfig tabsConfig = (inlineFilters2 == null || (result7 = inlineFilters2.getResult()) == null) ? null : result7.getTabsConfig();
        InlineFilters inlineFilters3 = this.f172427u;
        EntryPoint topEntryPoint = (inlineFilters3 == null || (result6 = inlineFilters3.getResult()) == null) ? null : result6.getTopEntryPoint();
        InlineFilters inlineFilters4 = this.f172427u;
        String title = (inlineFilters4 == null || (result5 = inlineFilters4.getResult()) == null || (header5 = result5.getHeader()) == null) ? null : header5.getTitle();
        InlineFilters inlineFilters5 = this.f172427u;
        DeepLink resetAction = (inlineFilters5 == null || (result4 = inlineFilters5.getResult()) == null || (header4 = result4.getHeader()) == null) ? null : header4.getResetAction();
        InlineFilters inlineFilters6 = this.f172427u;
        Integer itemsCount = (inlineFilters6 == null || (result3 = inlineFilters6.getResult()) == null || (header3 = result3.getHeader()) == null) ? null : header3.getItemsCount();
        InlineFilters inlineFilters7 = this.f172427u;
        HeaderSubtitle subTitle = (inlineFilters7 == null || (result2 = inlineFilters7.getResult()) == null || (header2 = result2.getHeader()) == null) ? null : header2.getSubTitle();
        InlineFilters inlineFilters8 = this.f172427u;
        m(topWidget, tabsConfig, topEntryPoint, title, resetAction, itemsCount, subTitle, (inlineFilters8 == null || (result = inlineFilters8.getResult()) == null || (header = result.getHeader()) == null) ? null : header.getSelectedFiltersCount(), this.f172430x, C42784z0.f406748b, S.b(this.f172427u));
        if (filter.getValue() == null && (optionsFirstOption = InlineFiltersKt.firstOption(filter)) != null) {
            id3 = optionsFirstOption.getId();
        }
        e(filter, new InlineFilterValue.InlineFilterSelectValue(id3), searchParams, presentationType, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.inline_filters.InterfaceC31062w
    public final void h1(@Y61.l Y41.a<InterfaceC31062w.b> aVar) {
        this.f172406W = (kotlin.jvm.internal.N) aVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.avito.android.shortcut_navigation_bar.m, java.lang.Object] */
    @Override // com.avito.android.inline_filters.InterfaceC31062w
    public final void i1(@Y61.l NavigationBarStyle.NavigationIconOnboarding navigationIconOnboarding) {
        ?? r02;
        if (navigationIconOnboarding == null || (r02 = this.f172384A) == 0) {
            return;
        }
        OnboardingType onboardingType = OnboardingType.f209409b;
        r02.xU(navigationIconOnboarding, new j(navigationIconOnboarding, this), new k(navigationIconOnboarding, this));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.avito.android.shortcut_navigation_bar.m, java.lang.Object] */
    public final void j(Filter filter, OnboardingType onboardingType, SearchParams searchParams) {
        Filter.Widget widget;
        Filter.Config config;
        Filter.Displaying displaying;
        Filter.Onboarding onboarding;
        ?? r02;
        String id2 = filter.getId();
        if (id2 == null || (widget = filter.getWidget()) == null || (config = widget.getConfig()) == null || (displaying = config.getDisplaying()) == null || (onboarding = displaying.getOnboarding()) == null || (r02 = this.f172384A) == 0) {
            return;
        }
        r02.q00(id2, onboarding, onboardingType, onboarding.getOnTapAction() == null, new f(searchParams, filter), new g(searchParams, filter, onboarding), new h(onboarding));
    }

    @Override // com.avito.android.inline_filters.InterfaceC31062w
    public final void j1(@Y61.l SearchParams searchParams) {
        InlineFilters inlineFilters;
        Result result;
        List<Filter> filters;
        Object next;
        Filter.Config config;
        if (searchParams == null || (inlineFilters = this.f172427u) == null || (result = inlineFilters.getResult()) == null || (filters = result.getFilters()) == null) {
            return;
        }
        List<Filter> list = filters;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Filter.Widget widget = ((Filter) next).getWidget();
            if ((widget == null || (config = widget.getConfig()) == null) ? false : kotlin.jvm.internal.L.f(config.isAutoOpen(), Boolean.TRUE)) {
                break;
            }
        }
        if (((Filter) next) != null) {
            return;
        }
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            j((Filter) it2.next(), OnboardingType.f209409b, searchParams);
        }
    }

    public final void k() {
        Result result;
        Header header;
        Integer selectedFiltersCount;
        InlineFilters inlineFilters = this.f172427u;
        if (inlineFilters == null || (result = inlineFilters.getResult()) == null || (header = result.getHeader()) == null || (selectedFiltersCount = header.getSelectedFiltersCount()) == null) {
            return;
        }
        int iIntValue = selectedFiltersCount.intValue();
        InterfaceC31096k2 interfaceC31096k2 = this.f172385B;
        if (interfaceC31096k2 != null) {
            interfaceC31096k2.d(iIntValue);
        }
    }

    @Override // com.avito.android.inline_filters.InterfaceC31062w
    public final void k1(@Y61.l List<String> list) {
        this.f172428v = list;
    }

    public final void l(InlineFilters inlineFilters) {
        List<Filter> filters;
        Header header;
        Header header2;
        Header header3;
        Header header4;
        Header header5;
        Header header6;
        Header header7;
        Header header8;
        Header header9;
        Header header10;
        Result result = inlineFilters.getResult();
        List<Tab> tabs = result != null ? result.getTabs() : null;
        j0 j0Var = this.f172412f;
        this.f172431y = j0Var.a(tabs);
        this.f172430x = j0Var.d(inlineFilters);
        this.f172416j.i();
        Result result2 = inlineFilters.getResult();
        TopWidget topWidget = result2 != null ? result2.getTopWidget() : null;
        Result result3 = inlineFilters.getResult();
        TabsConfig tabsConfig = result3 != null ? result3.getTabsConfig() : null;
        Result result4 = inlineFilters.getResult();
        EntryPoint topEntryPoint = result4 != null ? result4.getTopEntryPoint() : null;
        Result result5 = inlineFilters.getResult();
        String title = (result5 == null || (header10 = result5.getHeader()) == null) ? null : header10.getTitle();
        Result result6 = inlineFilters.getResult();
        DeepLink resetAction = (result6 == null || (header9 = result6.getHeader()) == null) ? null : header9.getResetAction();
        Result result7 = inlineFilters.getResult();
        Integer itemsCount = (result7 == null || (header8 = result7.getHeader()) == null) ? null : header8.getItemsCount();
        Result result8 = inlineFilters.getResult();
        HeaderSubtitle subTitle = (result8 == null || (header7 = result8.getHeader()) == null) ? null : header7.getSubTitle();
        Result result9 = inlineFilters.getResult();
        m(topWidget, tabsConfig, topEntryPoint, title, resetAction, itemsCount, subTitle, (result9 == null || (header6 = result9.getHeader()) == null) ? null : header6.getSelectedFiltersCount(), this.f172430x, this.f172431y, S.b(inlineFilters));
        Result result10 = inlineFilters.getResult();
        if (result10 == null || (filters = result10.getFilters()) == null) {
            return;
        }
        Result result11 = inlineFilters.getResult();
        if (result11 != null && (header5 = result11.getHeader()) != null) {
            header5.getTitle();
        }
        Result result12 = inlineFilters.getResult();
        if (result12 != null && (header4 = result12.getHeader()) != null) {
            header4.getResetAction();
        }
        Result result13 = inlineFilters.getResult();
        if (result13 != null && (header3 = result13.getHeader()) != null) {
            header3.getItemsCount();
        }
        Result result14 = inlineFilters.getResult();
        if (result14 != null && (header2 = result14.getHeader()) != null) {
            header2.getSubTitle();
        }
        Result result15 = inlineFilters.getResult();
        if (result15 != null && (header = result15.getHeader()) != null) {
            header.getSelectedFiltersCount();
        }
        if (filters.isEmpty()) {
            return;
        }
        InlineFilterValue value = filters.get(0).getValue();
        InlineFilterValue.InlineCategoryNodesValue inlineCategoryNodesValue = value instanceof InlineFilterValue.InlineCategoryNodesValue ? (InlineFilterValue.InlineCategoryNodesValue) value : null;
        if (inlineCategoryNodesValue != null && kotlin.jvm.internal.L.f(inlineCategoryNodesValue.isFinalNode(), Boolean.TRUE)) {
            this.f172397N.accept(G0.f406611a);
        }
    }

    @Override // com.avito.android.inline_filters.InterfaceC31062w
    /* renamed from: l1, reason: from getter */
    public final com.jakewharton.rxrelay3.b getF172393J() {
        return this.f172393J;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00bc  */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.avito.android.shortcut_navigation_bar.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.avito.android.shortcut_navigation_bar.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [Y41.a, kotlin.jvm.internal.N] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(com.avito.android.remote.model.search.TopWidget r38, com.avito.android.remote.model.search.TabsConfig r39, com.avito.android.remote.model.search.EntryPoint r40, java.lang.String r41, com.avito.android.deep_linking.links.DeepLink r42, java.lang.Integer r43, com.avito.android.remote.model.search.HeaderSubtitle r44, java.lang.Integer r45, java.util.List<? extends com.avito.android.shortcut_navigation_bar.adapter.ShortcutNavigationItem> r46, java.util.List<com.avito.android.shortcut_navigation_bar.z0> r47, com.avito.android.remote.model.SerpSpaceType r48) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.inline_filters.z.m(com.avito.android.remote.model.search.TopWidget, com.avito.android.remote.model.search.TabsConfig, com.avito.android.remote.model.search.EntryPoint, java.lang.String, com.avito.android.deep_linking.links.DeepLink, java.lang.Integer, com.avito.android.remote.model.search.HeaderSubtitle, java.lang.Integer, java.util.List, java.util.List, com.avito.android.remote.model.SerpSpaceType):void");
    }

    @Override // com.avito.android.inline_filters.InterfaceC31062w
    public final void m1(@Y61.l InlineFilters inlineFilters) {
        Result result;
        List<Filter> filters;
        HashMap map;
        this.f172427u = inlineFilters;
        if (inlineFilters == null || (result = inlineFilters.getResult()) == null || (filters = result.getFilters()) == null) {
            return;
        }
        for (Filter filter : filters) {
            String id2 = filter.getId();
            if (id2 != null && (map = this.f172399P) != null) {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.avito.android.shortcut_navigation_bar.m, java.lang.Object] */
    @Override // com.avito.android.inline_filters.InterfaceC31062w
    public final void n1(@Y61.l BxContentBusiness360.ReplaceMain.ToastReplaceMain toastReplaceMain, @Y61.k Y41.a<G0> aVar) {
        ?? r02;
        if (toastReplaceMain == null || (r02 = this.f172384A) == 0) {
            return;
        }
        OnboardingType onboardingType = OnboardingType.f209409b;
        r02.xL(toastReplaceMain, aVar);
    }

    @Override // com.avito.android.inline_filters.InterfaceC31062w
    public final void o1(@Y61.l PresentationType presentationType, @Y61.k SearchParams searchParams, @Y61.k String str, @Y61.l String str2) {
        Filter filter;
        Result result;
        List<Filter> filters;
        Result result2;
        Result result3;
        Filter actionHorizontalBlock;
        List<Filter> filters2;
        Object next;
        if (this.f172398O != null) {
            return;
        }
        InlineFilters inlineFilters = this.f172427u;
        Filter geoFilter = null;
        if (inlineFilters == null || (result3 = inlineFilters.getResult()) == null || (actionHorizontalBlock = result3.getActionHorizontalBlock()) == null || (filters2 = actionHorizontalBlock.getFilters()) == null) {
            filter = null;
        } else {
            Iterator<T> it = filters2.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (kotlin.jvm.internal.L.f(((Filter) next).getId(), SearchParamsConverterKt.SORT)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            filter = (Filter) next;
        }
        if (filter != null && kotlin.jvm.internal.L.f(filter.getId(), str)) {
            h(filter, searchParams, presentationType, str2);
            return;
        }
        InlineFilters inlineFilters2 = this.f172427u;
        if (inlineFilters2 != null && (result2 = inlineFilters2.getResult()) != null) {
            geoFilter = result2.getGeoFilter();
        }
        if (geoFilter != null && kotlin.jvm.internal.L.f(geoFilter.getId(), str)) {
            h(geoFilter, searchParams, presentationType, str2);
            return;
        }
        InlineFilters inlineFilters3 = this.f172427u;
        if (inlineFilters3 == null || (result = inlineFilters3.getResult()) == null || (filters = result.getFilters()) == null) {
            return;
        }
        for (Filter filter2 : filters) {
            if (kotlin.jvm.internal.L.f(filter2.getId(), str)) {
                h(filter2, searchParams, presentationType, str2);
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.avito.android.inline_filters.dialog.InlineFilterDialogOpener, java.lang.Object] */
    @Override // com.avito.android.inline_filters.InterfaceC31062w
    public final void onPause() {
        ?? r02 = this.f172386C;
        if (r02 != 0) {
            r02.onPause();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.avito.android.inline_filters.dialog.InlineFilterDialogOpener, java.lang.Object] */
    @Override // com.avito.android.inline_filters.InterfaceC31062w
    public final void onResume() {
        ?? r02 = this.f172386C;
        if (r02 != 0) {
            r02.onResume();
        }
    }

    @Override // com.avito.android.inline_filters.InterfaceC31062w
    /* renamed from: p1, reason: from getter */
    public final com.jakewharton.rxrelay3.b getF172394K() {
        return this.f172394K;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.inline_filters.InterfaceC31062w
    public final void q(@Y61.k List list) {
        InlineFilterValue inlineFilterMultiSelectValue;
        if (list.size() == 1 && (list.get(0) instanceof SelectParameter.Value)) {
            inlineFilterMultiSelectValue = new InlineFilterValue.InlineFilterSelectValue((String) ((ParcelableEntity) list.get(0)).getId());
        } else {
            List list2 = list;
            ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add((String) ((ParcelableEntity) it.next()).getId());
            }
            inlineFilterMultiSelectValue = new InlineFilterValue.InlineFilterMultiSelectValue(arrayList);
        }
        InlineFilterValue inlineFilterValue = inlineFilterMultiSelectValue;
        if (inlineFilterValue.isEmpty()) {
            this.f172415i.k();
        }
        Filter filter = this.f172398O;
        if (filter != null && !kotlin.jvm.internal.L.f(filter.getValue(), inlineFilterValue)) {
            e(this.f172398O, inlineFilterValue, this.f172400Q, this.f172401R, this.f172402S);
        }
        this.f172398O = null;
        this.f172400Q = null;
        this.f172401R = null;
        this.f172402S = null;
    }

    @Override // com.avito.android.inline_filters.InterfaceC31062w
    public final void q1(@Y61.l NavigationBarStyle.DisplayType.SearchWithActionTitle.Onboarding onboarding) {
        if (onboarding == null) {
            return;
        }
        this.f172391H.b(AbstractC41768a.y(500L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b).q(this.f172414h.e()).v(new GL.a(11, this, onboarding), io.reactivex.rxjava3.internal.functions.a.f401996f));
    }

    @Override // com.avito.android.inline_filters.InterfaceC31062w
    @Y61.l
    /* renamed from: r1, reason: from getter */
    public final InlineActions getF172426t() {
        return this.f172426t;
    }

    @Override // com.avito.android.inline_filters.InterfaceC31062w
    public final void s1() {
        InlineFilters inlineFilters = this.f172427u;
        if (inlineFilters != null) {
            g(inlineFilters);
        }
        InlineFilters inlineFilters2 = this.f172427u;
        if (inlineFilters2 != null) {
            l(inlineFilters2);
        }
    }

    @Override // com.avito.android.inline_filters.InterfaceC31062w
    public final void setSubscribed(boolean z12) {
        this.f172429w = z12;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.avito.android.shortcut_navigation_bar.m, java.lang.Object] */
    @Override // com.avito.android.inline_filters.InterfaceC31062w
    public final void t1(@Y61.l String str) {
        Result result;
        Filter geoFilter;
        Filter.Widget widget;
        Filter.Config config;
        Filter.Displaying displaying;
        Filter.Onboarding onboarding;
        InlineFilters inlineFilters;
        Result result2;
        Header header;
        HeaderSubtitle subTitle;
        HeaderSubtitleAction action;
        String filterId;
        ?? r22;
        InlineFilters inlineFilters2 = this.f172427u;
        if (inlineFilters2 == null || (result = inlineFilters2.getResult()) == null || (geoFilter = result.getGeoFilter()) == null || (widget = geoFilter.getWidget()) == null || (config = widget.getConfig()) == null || (displaying = config.getDisplaying()) == null || (onboarding = displaying.getOnboarding()) == null || (inlineFilters = this.f172427u) == null || (result2 = inlineFilters.getResult()) == null || (header = result2.getHeader()) == null || (subTitle = header.getSubTitle()) == null || (action = subTitle.getAction()) == null || (filterId = action.getFilterId()) == null || (r22 = this.f172384A) == 0) {
            return;
        }
        OnboardingType onboardingType = OnboardingType.f209409b;
        r22.Xk(filterId, onboarding, new i(str));
    }

    @Override // com.avito.android.inline_filters.InterfaceC31062w
    @Y61.l
    /* renamed from: u1, reason: from getter */
    public final InlineFilters getF172427u() {
        return this.f172427u;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.avito.android.shortcut_navigation_bar.m, java.lang.Object] */
    @Override // com.avito.android.inline_filters.InterfaceC31062w
    public final void v1() {
        Result result;
        TopWidget topWidget;
        TopWidget.Onboarding onboarding;
        ?? r12;
        InlineFilters inlineFilters = this.f172427u;
        if (inlineFilters == null || (result = inlineFilters.getResult()) == null || (topWidget = result.getTopWidget()) == null || (onboarding = topWidget.getOnboarding()) == null || (r12 = this.f172384A) == 0) {
            return;
        }
        OnboardingType onboardingType = OnboardingType.f209409b;
        r12.VA(onboarding, new r(onboarding, this), new s(onboarding, this));
    }

    @Override // com.avito.android.inline_filters.InterfaceC31062w
    public final void w1(@Y61.k InterfaceC34996m interfaceC34996m, @Y61.k InlineFilterDialogOpener inlineFilterDialogOpener, @Y61.l InterfaceC31096k2 interfaceC31096k2, @Y61.l DN.a aVar, @Y61.l PN.a aVar2) {
        this.f172384A = interfaceC34996m;
        this.f172385B = interfaceC31096k2;
        this.f172386C = inlineFilterDialogOpener;
        this.f172387D = aVar;
        this.f172388E = aVar2;
        k();
        e1();
        Y0();
        InlineFilters inlineFilters = this.f172427u;
        if (inlineFilters != null) {
            l(inlineFilters);
            interfaceC34996m.kF();
            this.f172393J.accept(Boolean.TRUE);
        }
        Filter filter = this.f172398O;
        if (filter != null) {
            Filter.Widget widget = filter.getWidget();
            if ((widget != null ? widget.getType() : null) != WidgetType.Beduin) {
                i(this, filter, this.f172400Q, this.f172403T, null, this.f172402S, 8);
            }
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        com.jakewharton.rxrelay3.c<G0> cVar = this.f172397N;
        cVar.getClass();
        io.reactivex.rxjava3.disposables.d dVarT0 = cVar.z(3L, timeUnit, io.reactivex.rxjava3.schedulers.b.f404942b).j0(io.reactivex.rxjava3.android.schedulers.b.b()).t0(new a());
        io.reactivex.rxjava3.disposables.c cVar2 = this.f172391H;
        cVar2.b(dVarT0);
        cVar2.b(this.f172408b.d9().N(O.f171012b).t0(new P(this)));
        cVar2.b(this.f172418l.f172316b.t0(new l41.g() { // from class: com.avito.android.inline_filters.z.b
            /* JADX WARN: Type inference failed for: r4v0, types: [Y41.a, kotlin.jvm.internal.N] */
            @Override // l41.g
            public final void accept(Object obj) {
                Result result;
                List<Filter> filters;
                ?? r42;
                InterfaceC31062w.b bVar;
                Object next;
                InlineFiltersApplyLink inlineFiltersApplyLink = (InlineFiltersApplyLink) obj;
                z zVar = z.this;
                InlineFilters inlineFilters2 = zVar.f172427u;
                if (inlineFilters2 == null || (result = inlineFilters2.getResult()) == null || (filters = result.getFilters()) == null || (r42 = zVar.f172406W) == 0 || (bVar = (InterfaceC31062w.b) r42.invoke()) == null) {
                    return;
                }
                List<InlineFiltersApplyLink.FilterValue> list = inlineFiltersApplyLink.f172309b;
                ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
                for (InlineFiltersApplyLink.FilterValue filterValue : list) {
                    Iterator<T> it = filters.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            if (kotlin.jvm.internal.L.f(((Filter) next).getId(), filterValue.getId())) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    Filter filter2 = (Filter) next;
                    if (filter2 == null) {
                        filter2 = new Filter(null, filterValue.getId(), null, null, null, null, null, null, null, null, null, null, null, null, null, false, 57352, null);
                    }
                    arrayList.add(new kotlin.Q(filter2, new InlineFilterValue.InlineFilterSelectValue(filterValue.getValue())));
                }
                z.f(zVar, arrayList, bVar.f172374a, bVar.f172375b, bVar.f172376c, false, new A(inlineFiltersApplyLink, zVar), 16);
            }
        }));
        cVar2.b(A1.h(interfaceC34996m.getF283478d0(), null, new c(), 3));
    }

    @Override // com.avito.android.inline_filters.InterfaceC31062w
    public final void x1(@Y61.l InlineActions inlineActions) {
        this.f172426t = inlineActions;
    }

    @Override // com.avito.android.inline_filters.InterfaceC31062w
    public final void y1(@Y61.l Filter filter, @Y61.k SearchParams searchParams, @Y61.l PresentationType presentationType, @Y61.l String str) {
        if (this.f172398O != null || filter == null) {
            return;
        }
        h(filter, searchParams, presentationType, str);
    }

    @Override // com.avito.android.inline_filters.InterfaceC31062w
    public final void z1(@Y61.l SearchParams searchParams, @Y61.l String str) {
        Map mapC = P0.c();
        this.f172432z = true;
        this.f172394K.accept(Boolean.TRUE);
        this.f172390G.b(this.f172407a.b(searchParams == null ? new SearchParams(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 1, null) : searchParams, mapC, (8 & 4) != 0 ? null : null, null, (8 & 16) != 0 ? null : this.f172428v, (8 & 32) != 0 ? null : str).j0(this.f172414h.e()).v0(new D(this), new E(this), io.reactivex.rxjava3.internal.functions.a.f401993c));
    }
}
