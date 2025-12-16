package com.avito.android.bxcontent.vertical_toolbar.category_filter_toolbar;

import Pr0.InterfaceC14832a;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.bxcontent.BxContentFragment;
import com.avito.android.lib.util.darkTheme.ThemeAppearance;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.WidgetType;
import com.avito.android.remote.model.vertical_main.SearchFormWidgetAction;
import com.avito.android.serp.adapter.l1;
import com.avito.android.serp.adapter.vertical_main.category_vertical_filter.item.CategoryVerticalFilterItem;
import com.avito.android.ui.status_bar.d;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.flow.p2;
import tl.InterfaceC48685a;

/* compiled from: VerticalCategoryFilterToolbarPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/vertical_toolbar/category_filter_toolbar/b;", "Lcom/avito/android/bxcontent/vertical_toolbar/category_filter_toolbar/a;", "a", "b", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements com.avito.android.bxcontent.vertical_toolbar.category_filter_toolbar.a {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f113056o = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f113057b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.analytics.widgets_tracker.g f113058c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.vertical_main.p f113059d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14832a f113060e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public l f113061f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public BxContentFragment.F f113062g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public InterfaceC48685a f113063h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public com.avito.android.serp.adapter.vertical_main.category_vertical_filter.d f113064i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public CategoryVerticalFilterItem f113065j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public C3319b f113066k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f113067l = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final Z1<com.avito.android.ui.status_bar.d> f113068m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final n2<com.avito.android.ui.status_bar.d> f113069n;

    /* compiled from: VerticalCategoryFilterToolbarPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/bxcontent/vertical_toolbar/category_filter_toolbar/b$a;", "", "<init>", "()V", "", "POSITION_NOT_APPLICABLE", "I", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: VerticalCategoryFilterToolbarPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/vertical_toolbar/category_filter_toolbar/b$b;", "", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.vertical_toolbar.category_filter_toolbar.b$b, reason: collision with other inner class name */
    public static final /* data */ class C3319b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final Filter f113070a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Filter f113071b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final Filter f113072c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final Filter f113073d;

        public C3319b(@Y61.l Filter filter, @Y61.l Filter filter2, @Y61.l Filter filter3, @Y61.l Filter filter4) {
            this.f113070a = filter;
            this.f113071b = filter2;
            this.f113072c = filter3;
            this.f113073d = filter4;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3319b)) {
                return false;
            }
            C3319b c3319b = (C3319b) obj;
            return L.f(this.f113070a, c3319b.f113070a) && L.f(this.f113071b, c3319b.f113071b) && L.f(this.f113072c, c3319b.f113072c) && L.f(this.f113073d, c3319b.f113073d);
        }

        public final int hashCode() {
            Filter filter = this.f113070a;
            int iHashCode = (filter == null ? 0 : filter.hashCode()) * 31;
            Filter filter2 = this.f113071b;
            int iHashCode2 = (iHashCode + (filter2 == null ? 0 : filter2.hashCode())) * 31;
            Filter filter3 = this.f113072c;
            int iHashCode3 = (iHashCode2 + (filter3 == null ? 0 : filter3.hashCode())) * 31;
            Filter filter4 = this.f113073d;
            return iHashCode3 + (filter4 != null ? filter4.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "ParsedFilters(toolbarFilter=" + this.f113070a + ", selectTabFilter=" + this.f113071b + ", parametersFilter=" + this.f113072c + ", allFiltersFilter=" + this.f113073d + ')';
        }
    }

    static {
        new a(null);
    }

    @Inject
    public b(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.serp.analytics.widgets_tracker.g gVar, @Y61.k com.avito.android.serp.adapter.vertical_main.p pVar, @Y61.k InterfaceC14832a interfaceC14832a) {
        this.f113057b = aVar;
        this.f113058c = gVar;
        this.f113059d = pVar;
        this.f113060e = interfaceC14832a;
        Z1<com.avito.android.ui.status_bar.d> z1A = p2.a(null);
        this.f113068m = z1A;
        this.f113069n = C43175k.b(z1A);
    }

    public static ArrayList a(Filter filter) {
        List<Filter.InnerOptions> options;
        if (filter == null || (options = filter.getOptions()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = options.iterator();
        while (it.hasNext()) {
            List<Filter.InnerOptions.Options> options2 = ((Filter.InnerOptions) it.next()).getOptions();
            if (options2 == null) {
                options2 = C42784z0.f406748b;
            }
            C42745f0.h(options2, arrayList);
        }
        return arrayList;
    }

    public static C3319b c(List list) {
        Filter.Config config;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            Filter.Widget widget = ((Filter) obj).getWidget();
            if ((widget == null || (config = widget.getConfig()) == null) ? false : L.f(config.isToolbarFilter(), Boolean.TRUE)) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        int iF2 = P0.f(C42745f0.q(arrayList2, 10));
        if (iF2 < 16) {
            iF2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
        for (Object obj2 : arrayList2) {
            Filter.Widget widget2 = ((Filter) obj2).getWidget();
            linkedHashMap.put(widget2 != null ? widget2.getType() : null, obj2);
        }
        Filter filter = (Filter) C42745f0.G(arrayList);
        Filter filter2 = (Filter) linkedHashMap.get(WidgetType.Select);
        Filter filter3 = (Filter) linkedHashMap.get(WidgetType.CategoryWithParams);
        if (filter3 == null) {
            filter3 = (Filter) linkedHashMap.get(WidgetType.Shortcut);
        }
        return new C3319b(filter, filter2, filter3, (Filter) linkedHashMap.get(WidgetType.AllFilters));
    }

    @Override // com.avito.android.bxcontent.vertical_toolbar.category_filter_toolbar.a
    public final void A4(@Y61.k l lVar, @Y61.k BxContentFragment.F f12, @Y61.k InterfaceC48685a interfaceC48685a) {
        this.f113061f = lVar;
        this.f113062g = f12;
        this.f113063h = interfaceC48685a;
        this.f113064i = new com.avito.android.serp.adapter.vertical_main.category_vertical_filter.d(lVar.getF113106m());
        io.reactivex.rxjava3.disposables.d dVarT0 = lVar.getF113110q().t0(new g(interfaceC48685a));
        io.reactivex.rxjava3.disposables.c cVar = this.f113067l;
        cVar.b(dVarT0);
        cVar.b(lVar.getF113114u().t0(new h(this, interfaceC48685a)));
        cVar.b(lVar.getF113112s().t0(new i(this)));
        com.avito.android.serp.adapter.vertical_main.category_vertical_filter.d dVar = this.f113064i;
        if (dVar == null) {
            return;
        }
        cVar.b(dVar.f272666l.t0(new f(this)));
    }

    public final void d(com.avito.android.serp.adapter.vertical_main.category_vertical_filter.d dVar) {
        Filter.Widget widget;
        Filter.Config config;
        C3319b c3319b = this.f113066k;
        Filter filter = c3319b != null ? c3319b.f113072c : null;
        String icon = (filter == null || (widget = filter.getWidget()) == null || (config = widget.getConfig()) == null) ? null : config.getIcon();
        String displayTitle = filter != null ? filter.getDisplayTitle() : null;
        TextView textView = dVar.f272659e;
        I5.a(textView, displayTitle, false);
        Integer numM = icon != null ? com.avito.android.lib.util.f.m(icon) : null;
        if (numM == null) {
            FV.a.f4720a.getClass();
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        } else {
            FV.a aVar = FV.a.f4720a;
            int iIntValue = numM.intValue();
            int iB2 = y6.b(10);
            aVar.getClass();
            FV.a.j(textView, iIntValue, iB2);
        }
        C3319b c3319b2 = this.f113066k;
        D6.G(dVar.f272660f, (c3319b2 != null ? c3319b2.f113073d : null) != null);
    }

    @Override // com.avito.android.ui.status_bar.k
    @Y61.k
    public final n2<com.avito.android.ui.status_bar.d> e2() {
        return this.f113069n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.avito.android.serp.adapter.vertical_main.category_vertical_filter.d] */
    public final void f(com.avito.android.serp.adapter.vertical_main.category_vertical_filter.d dVar) {
        ?? arrayList;
        List<Filter.InnerOptions.Options> selectedOptions;
        C3319b c3319b = this.f113066k;
        Filter.InnerOptions.Options options = null;
        Filter filter = c3319b != null ? c3319b.f113071b : null;
        ArrayList arrayListA = a(filter);
        if (filter != null && (selectedOptions = filter.getSelectedOptions()) != null) {
            options = (Filter.InnerOptions.Options) C42745f0.G(selectedOptions);
        }
        int iIndexOf = arrayListA != null ? arrayListA.indexOf(options) : 0;
        if (arrayListA != null) {
            arrayList = new ArrayList(C42745f0.q(arrayListA, 10));
            Iterator it = arrayListA.iterator();
            while (it.hasNext()) {
                arrayList.add(((Filter.InnerOptions.Options) it.next()).getTitle());
            }
        } else {
            arrayList = C42784z0.f406748b;
        }
        dVar.P0(iIndexOf, arrayList);
    }

    @Override // com.avito.android.bxcontent.vertical_toolbar.category_filter_toolbar.a
    public final void f0() {
        this.f113068m.setValue(null);
        this.f113067l.e();
        this.f113061f = null;
        this.f113062g = null;
        this.f113065j = null;
        this.f113064i = null;
        this.f113066k = null;
    }

    @Override // com.avito.android.bxcontent.vertical_toolbar.category_filter_toolbar.a
    public final void h(@Y61.l l1 l1Var) {
        com.avito.android.serp.adapter.vertical_main.category_vertical_filter.d dVar;
        CategoryVerticalFilterItem categoryVerticalFilterItem = l1Var instanceof CategoryVerticalFilterItem ? (CategoryVerticalFilterItem) l1Var : null;
        Z1<com.avito.android.ui.status_bar.d> z12 = this.f113068m;
        if (categoryVerticalFilterItem == null) {
            if (this.f113065j == null) {
                return;
            }
            z12.setValue(null);
            BxContentFragment.F f12 = this.f113062g;
            if (f12 != null) {
                BxContentFragment bxContentFragment = BxContentFragment.this;
                BxContentFragment.C28907a c28907a = BxContentFragment.f108886v5;
                bxContentFragment.a6(false, false);
                bxContentFragment.K5().vn(false);
                return;
            }
            return;
        }
        com.avito.android.serp.adapter.vertical_main.category_vertical_filter.d dVar2 = this.f113064i;
        if (dVar2 == null) {
            return;
        }
        CategoryVerticalFilterItem categoryVerticalFilterItem2 = this.f113065j;
        this.f113058c.h(-1, "category_vertical_filter", null, null, null, (56 & 32) != 0 ? null : null, (56 & 64) != 0 ? null : categoryVerticalFilterItem2 != null ? categoryVerticalFilterItem2.f272672f : null);
        this.f113065j = categoryVerticalFilterItem;
        this.f113066k = c(categoryVerticalFilterItem.f272670d);
        l lVar = this.f113061f;
        if (lVar != null && (dVar = this.f113064i) != null) {
            lVar.setTitle(categoryVerticalFilterItem.f272669c);
            SearchFormWidgetAction searchFormWidgetAction = categoryVerticalFilterItem.f272671e;
            com.avito.android.lib.design.button.b.a(dVar.f272661g, searchFormWidgetAction != null ? searchFormWidgetAction.getTitle() : null, false);
        }
        f(dVar2);
        d(dVar2);
        C3319b c3319b = this.f113066k;
        Filter filter = c3319b != null ? c3319b.f113071b : null;
        dVar2.f272662h = new c(a(filter), this, filter);
        dVar2.f272663i = new d(this);
        dVar2.f272664j = new e(this);
        z12.setValue(new com.avito.android.ui.status_bar.d(ThemeAppearance.f181334b, new d.a.C9357d(R.color.common_white)));
        BxContentFragment.F f13 = this.f113062g;
        if (f13 != null) {
            BxContentFragment bxContentFragment2 = BxContentFragment.this;
            BxContentFragment.C28907a c28907a2 = BxContentFragment.f108886v5;
            bxContentFragment2.a6(true, false);
            bxContentFragment2.K5().vn(true);
        }
        this.f113059d.h(dVar2, categoryVerticalFilterItem.f272673g, -1);
    }
}
