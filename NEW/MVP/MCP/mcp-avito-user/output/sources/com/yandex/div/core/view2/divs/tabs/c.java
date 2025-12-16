package com.yandex.div.core.view2.divs.tabs;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.yandex.div.core.InterfaceC37911f;
import com.yandex.div.core.InterfaceC37915j;
import com.yandex.div.core.dagger.z;
import com.yandex.div.core.view2.C38029k;
import com.yandex.div.core.view2.C38040w;
import com.yandex.div.core.view2.O;
import com.yandex.div.core.view2.P;
import com.yandex.div.core.view2.X;
import com.yandex.div.core.view2.divs.C37931a;
import com.yandex.div.core.view2.divs.C37955g;
import com.yandex.div.core.view2.divs.C38006w;
import com.yandex.div.core.view2.divs.widgets.B;
import com.yandex.div.internal.util.u;
import com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout;
import com.yandex.div.internal.widget.tabs.d;
import com.yandex.div.internal.widget.tabs.o;
import com.yandex.div.internal.widget.tabs.s;
import com.yandex.div.internal.widget.tabs.v;
import com.yandex.div2.AbstractC38330g;
import com.yandex.div2.C38501q0;
import com.yandex.div2.DivTabs;
import com.yandex.div2.K5;
import com.yandex.div2.Y0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: DivTabsBinder.kt */
@z
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div/core/view2/divs/tabs/c;", "", "a", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f368746k = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C38006w f368747a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final P f368748b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.internal.viewpool.h f368749c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final s f368750d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C37955g f368751e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC37915j f368752f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final X f368753g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.core.downloader.k f368754h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Context f368755i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public Long f368756j;

    /* compiled from: DivTabsBinder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/yandex/div/core/view2/divs/tabs/c$a;", "", "<init>", "()V", "", "DEFAULT_LINE_HEIGHT_COEFFICIENT", "F", "", "TAG_TAB_HEADER", "Ljava/lang/String;", "TAG_TAB_ITEM", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: DivTabsBinder.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[DivTabs.TabTitleStyle.AnimationType.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
            iArr[2] = 3;
        }
    }

    /* compiled from: DivTabsBinder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div.core.view2.divs.tabs.c$c, reason: collision with other inner class name */
    public static final class C10885c extends N implements Y41.l<Object, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.yandex.div.internal.widget.tabs.z f368757l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ DivTabs f368758m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ com.yandex.div.json.expressions.e f368759n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10885c(com.yandex.div.internal.widget.tabs.z zVar, DivTabs divTabs, com.yandex.div.json.expressions.e eVar) {
            super(1);
            this.f368757l = zVar;
            this.f368758m = divTabs;
            this.f368759n = eVar;
        }

        @Override // Y41.l
        public final G0 invoke(Object obj) {
            C37931a.f(this.f368757l.getDivider(), this.f368758m.f372058w, this.f368759n);
            return G0.f406611a;
        }
    }

    /* compiled from: DivTabsBinder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends N implements Y41.l<Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.yandex.div.internal.widget.tabs.z f368760l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.yandex.div.internal.widget.tabs.z zVar) {
            super(1);
            this.f368760l = zVar;
        }

        @Override // Y41.l
        public final G0 invoke(Integer num) {
            this.f368760l.getDivider().setBackgroundColor(num.intValue());
            return G0.f406611a;
        }
    }

    /* compiled from: DivTabsBinder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "hasSeparator", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends N implements Y41.l<Boolean, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.yandex.div.internal.widget.tabs.z f368761l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.yandex.div.internal.widget.tabs.z zVar) {
            super(1);
            this.f368761l = zVar;
        }

        @Override // Y41.l
        public final G0 invoke(Boolean bool) {
            this.f368761l.getDivider().setVisibility(bool.booleanValue() ? 0 : 8);
            return G0.f406611a;
        }
    }

    /* compiled from: DivTabsBinder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "restrictScroll", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends N implements Y41.l<Boolean, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.yandex.div.internal.widget.tabs.z f368762l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.yandex.div.internal.widget.tabs.z zVar) {
            super(1);
            this.f368762l = zVar;
        }

        @Override // Y41.l
        public final G0 invoke(Boolean bool) {
            this.f368762l.getViewPager().setOnInterceptTouchEventListener(bool.booleanValue() ? new B(1) : null);
            return G0.f406611a;
        }
    }

    /* compiled from: DivTabsBinder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "<anonymous parameter 0>", "Lkotlin/G0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends N implements Y41.l<Object, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.yandex.div.internal.widget.tabs.z f368763l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ DivTabs f368764m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ com.yandex.div.json.expressions.e f368765n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(com.yandex.div.internal.widget.tabs.z zVar, DivTabs divTabs, com.yandex.div.json.expressions.e eVar) {
            super(1);
            this.f368763l = zVar;
            this.f368764m = divTabs;
            this.f368765n = eVar;
        }

        @Override // Y41.l
        public final G0 invoke(Object obj) {
            C37931a.k(this.f368763l.getTitleLayout(), this.f368764m.f372061z, this.f368765n);
            return G0.f406611a;
        }
    }

    /* compiled from: DivTabsBinder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends N implements Y41.l<Object, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.yandex.div.internal.widget.tabs.z f368767m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ com.yandex.div.json.expressions.e f368768n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ DivTabs.TabTitleStyle f368769o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(com.yandex.div.internal.widget.tabs.z zVar, com.yandex.div.json.expressions.e eVar, DivTabs.TabTitleStyle tabTitleStyle) {
            super(1);
            this.f368767m = zVar;
            this.f368768n = eVar;
            this.f368769o = tabTitleStyle;
        }

        @Override // Y41.l
        public final G0 invoke(Object obj) {
            v<?> titleLayout = this.f368767m.getTitleLayout();
            int i12 = c.f368746k;
            c.this.getClass();
            c.a(titleLayout, this.f368768n, this.f368769o);
            return G0.f406611a;
        }
    }

    static {
        new a(null);
    }

    @Inject
    public c(@Y61.k C38006w c38006w, @Y61.k P p12, @Y61.k com.yandex.div.internal.viewpool.h hVar, @Y61.k s sVar, @Y61.k C37955g c37955g, @Y61.k InterfaceC37915j interfaceC37915j, @Y61.k X x12, @Y61.k com.yandex.div.core.downloader.k kVar, @Y61.k @Named("themed_context") Context context) {
        this.f368747a = c38006w;
        this.f368748b = p12;
        this.f368749c = hVar;
        this.f368750d = sVar;
        this.f368751e = c37955g;
        this.f368752f = interfaceC37915j;
        this.f368753g = x12;
        this.f368754h = kVar;
        this.f368755i = context;
        hVar.a("DIV2.TAB_HEADER_VIEW", new v.b(context), 12);
        hVar.a("DIV2.TAB_ITEM_VIEW", new O(this, 17), 2);
    }

    public static void a(v vVar, com.yandex.div.json.expressions.e eVar, DivTabs.TabTitleStyle tabTitleStyle) {
        Integer numA;
        BaseIndicatorTabLayout.AnimationType animationType;
        com.yandex.div.json.expressions.b<Long> bVar;
        com.yandex.div.json.expressions.b<Long> bVar2;
        com.yandex.div.json.expressions.b<Long> bVar3;
        com.yandex.div.json.expressions.b<Long> bVar4;
        int iIntValue = tabTitleStyle.f372089c.a(eVar).intValue();
        int iIntValue2 = tabTitleStyle.f372087a.a(eVar).intValue();
        int iIntValue3 = tabTitleStyle.f372099m.a(eVar).intValue();
        com.yandex.div.json.expressions.b<Integer> bVar5 = tabTitleStyle.f372097k;
        int iIntValue4 = (bVar5 == null || (numA = bVar5.a(eVar)) == null) ? 0 : numA.intValue();
        vVar.getClass();
        vVar.setTabTextColors(BaseIndicatorTabLayout.k(iIntValue3, iIntValue));
        vVar.setSelectedTabIndicatorColor(iIntValue2);
        vVar.setTabBackgroundColor(iIntValue4);
        DisplayMetrics displayMetrics = vVar.getResources().getDisplayMetrics();
        Float fValueOf = tabTitleStyle.f372092f == null ? null : Float.valueOf(C37931a.o(r3.a(eVar), displayMetrics));
        C38501q0 c38501q0 = tabTitleStyle.f372093g;
        float fFloatValue = fValueOf == null ? c38501q0 == null ? -1.0f : 0.0f : fValueOf.floatValue();
        float fO2 = (c38501q0 == null || (bVar4 = c38501q0.f376143c) == null) ? fFloatValue : C37931a.o(bVar4.a(eVar), displayMetrics);
        float fO3 = (c38501q0 == null || (bVar3 = c38501q0.f376144d) == null) ? fFloatValue : C37931a.o(bVar3.a(eVar), displayMetrics);
        float fO4 = (c38501q0 == null || (bVar2 = c38501q0.f376141a) == null) ? fFloatValue : C37931a.o(bVar2.a(eVar), displayMetrics);
        if (c38501q0 != null && (bVar = c38501q0.f376142b) != null) {
            fFloatValue = C37931a.o(bVar.a(eVar), displayMetrics);
        }
        vVar.setTabIndicatorCornersRadii(new float[]{fO2, fO2, fO3, fO3, fFloatValue, fFloatValue, fO4, fO4});
        vVar.setTabItemSpacing(C37931a.o(tabTitleStyle.f372100n.a(eVar), displayMetrics));
        int iOrdinal = tabTitleStyle.f372091e.a(eVar).ordinal();
        if (iOrdinal == 0) {
            animationType = BaseIndicatorTabLayout.AnimationType.f370415b;
        } else if (iOrdinal == 1) {
            animationType = BaseIndicatorTabLayout.AnimationType.f370416c;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            animationType = BaseIndicatorTabLayout.AnimationType.f370417d;
        }
        vVar.setAnimationType(animationType);
        vVar.setAnimationDuration(tabTitleStyle.f372090d.a(eVar).longValue());
        vVar.setTabTitleStyle(tabTitleStyle);
    }

    public static final void b(c cVar, C38029k c38029k, DivTabs divTabs, com.yandex.div.json.expressions.e eVar, com.yandex.div.internal.widget.tabs.z zVar, C38040w c38040w, com.yandex.div.core.state.f fVar, ArrayList arrayList, int i12) throws Resources.NotFoundException {
        cVar.getClass();
        l lVar = new l(c38029k, cVar.f368751e, cVar.f368752f, cVar.f368753g, zVar, divTabs);
        boolean zBooleanValue = divTabs.f372044i.a(eVar).booleanValue();
        com.google.firebase.components.g gVar = zBooleanValue ? new com.google.firebase.components.g(13) : new com.google.firebase.components.g(14);
        int currentItem = zVar.getViewPager().getCurrentItem();
        int currentItem2 = zVar.getViewPager().getCurrentItem();
        if (currentItem2 == currentItem) {
            u uVar = u.f370187a;
            com.yandex.div.core.view2.divs.tabs.h hVar = new com.yandex.div.core.view2.divs.tabs.h(lVar, currentItem2);
            uVar.getClass();
            u.f370188b.post(new Oa1.B(5, hVar));
        }
        com.yandex.div.core.view2.divs.tabs.b bVar = new com.yandex.div.core.view2.divs.tabs.b(cVar.f368749c, zVar, new d.i(), gVar, zBooleanValue, c38029k, cVar.f368750d, cVar.f368748b, c38040w, lVar, fVar, cVar.f368754h);
        com.avito.android.vas_planning.domain.b bVar2 = new com.avito.android.vas_planning.domain.b(2, arrayList);
        C38029k c38029k2 = bVar.f368738p;
        bVar.b(bVar2, c38029k2.getExpressionResolver(), com.yandex.div.core.util.e.a(c38029k2));
        bVar.f368744v.clear();
        bVar.f370461c.x(i12, true);
        zVar.setDivTabsAdapter(bVar);
    }

    public static final void d(com.yandex.div.json.expressions.b<?> bVar, F21.b bVar2, com.yandex.div.json.expressions.e eVar, c cVar, com.yandex.div.internal.widget.tabs.z zVar, DivTabs.TabTitleStyle tabTitleStyle) {
        InterfaceC37911f interfaceC37911fD = bVar == null ? null : bVar.d(eVar, cVar.new h(zVar, eVar, tabTitleStyle));
        if (interfaceC37911fD == null) {
            interfaceC37911fD = InterfaceC37911f.f367528l2;
        }
        bVar2.e(interfaceC37911fD);
    }

    public final void c(@Y61.k com.yandex.div.internal.widget.tabs.z zVar, @Y61.k DivTabs divTabs, @Y61.k C38029k c38029k, @Y61.k C38040w c38040w, @Y61.k com.yandex.div.core.state.f fVar) throws Resources.NotFoundException {
        int i12;
        com.yandex.div.json.expressions.b<Boolean> bVar;
        com.yandex.div.json.expressions.b<Long> bVar2;
        ArrayList arrayList;
        List<DivTabs.f> list;
        Long l12;
        com.yandex.div.core.view2.divs.tabs.b divTabsAdapter;
        DivTabs divTabs2;
        DivTabs div = zVar.getDiv();
        com.yandex.div.json.expressions.e expressionResolver = c38029k.getExpressionResolver();
        zVar.setDiv(divTabs);
        C38006w c38006w = this.f368747a;
        if (div != null) {
            c38006w.h(c38029k, zVar, div);
            if (div.equals(divTabs) && (divTabsAdapter = zVar.getDivTabsAdapter()) != null) {
                C38029k c38029k2 = divTabsAdapter.f368738p;
                if (divTabsAdapter.f368743u.f367430a.get(c38029k2.getDataTag()) == null) {
                    divTabs2 = null;
                } else {
                    com.yandex.div.core.downloader.j jVar = new com.yandex.div.core.downloader.j();
                    new LinkedHashSet();
                    divTabs2 = (DivTabs) jVar.a(new AbstractC38330g.p(divTabs), expressionResolver).get(0).a();
                    DisplayMetrics displayMetrics = c38029k2.getResources().getDisplayMetrics();
                    List<DivTabs.f> list2 = divTabs2.f372050o;
                    ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new com.yandex.div.core.view2.divs.tabs.a((DivTabs.f) it.next(), displayMetrics, expressionResolver));
                    }
                    com.avito.android.vas_planning.domain.b bVar3 = new com.avito.android.vas_planning.domain.b(1, arrayList2);
                    o oVar = divTabsAdapter.f370461c;
                    int currentItem = oVar.getCurrentItem();
                    divTabsAdapter.b(bVar3, c38029k2.getExpressionResolver(), com.yandex.div.core.util.e.a(c38029k2));
                    divTabsAdapter.f368744v.clear();
                    oVar.x(currentItem, true);
                }
                if (divTabs2 != null) {
                    zVar.setDiv(divTabs2);
                    return;
                }
            }
        }
        zVar.g();
        F21.b bVarA = com.yandex.div.core.util.e.a(zVar);
        c38006w.d(zVar, divTabs, div, c38029k);
        g gVar = new g(zVar, divTabs, expressionResolver);
        gVar.invoke(null);
        Y0 y02 = divTabs.f372061z;
        y02.f374037b.d(expressionResolver, gVar);
        y02.f374038c.d(expressionResolver, gVar);
        com.yandex.div.json.expressions.b<Long> bVar4 = y02.f374039d;
        bVar4.d(expressionResolver, gVar);
        com.yandex.div.json.expressions.b<Long> bVar5 = y02.f374036a;
        bVar5.d(expressionResolver, gVar);
        v<?> titleLayout = zVar.getTitleLayout();
        i iVar = new i(divTabs, expressionResolver, titleLayout);
        iVar.invoke(null);
        F21.b bVarA2 = com.yandex.div.core.util.e.a(titleLayout);
        DivTabs.TabTitleStyle tabTitleStyle = divTabs.f372060y;
        com.yandex.div.json.expressions.b<Long> bVar6 = tabTitleStyle.f372102p;
        if (bVar6 != null) {
            bVarA2.e(bVar6.d(expressionResolver, iVar));
        }
        bVarA2.e(tabTitleStyle.f372094h.d(expressionResolver, iVar));
        Y0 y03 = tabTitleStyle.f372103q;
        bVarA2.e(y03.f374039d.d(expressionResolver, iVar));
        bVarA2.e(y03.f374036a.d(expressionResolver, iVar));
        bVarA2.e(bVar4.d(expressionResolver, iVar));
        bVarA2.e(bVar5.d(expressionResolver, iVar));
        a(zVar.getTitleLayout(), expressionResolver, tabTitleStyle);
        F21.b bVarA3 = com.yandex.div.core.util.e.a(zVar);
        d(tabTitleStyle.f372089c, bVarA3, expressionResolver, this, zVar, tabTitleStyle);
        d(tabTitleStyle.f372087a, bVarA3, expressionResolver, this, zVar, tabTitleStyle);
        d(tabTitleStyle.f372099m, bVarA3, expressionResolver, this, zVar, tabTitleStyle);
        d(tabTitleStyle.f372097k, bVarA3, expressionResolver, this, zVar, tabTitleStyle);
        com.yandex.div.json.expressions.b<Long> bVar7 = tabTitleStyle.f372092f;
        if (bVar7 != null) {
            d(bVar7, bVarA3, expressionResolver, this, zVar, tabTitleStyle);
        }
        C38501q0 c38501q0 = tabTitleStyle.f372093g;
        d(c38501q0 == null ? null : c38501q0.f376143c, bVarA3, expressionResolver, this, zVar, tabTitleStyle);
        d(c38501q0 == null ? null : c38501q0.f376144d, bVarA3, expressionResolver, this, zVar, tabTitleStyle);
        d(c38501q0 == null ? null : c38501q0.f376142b, bVarA3, expressionResolver, this, zVar, tabTitleStyle);
        d(c38501q0 == null ? null : c38501q0.f376141a, bVarA3, expressionResolver, this, zVar, tabTitleStyle);
        d(tabTitleStyle.f372100n, bVarA3, expressionResolver, this, zVar, tabTitleStyle);
        d(tabTitleStyle.f372091e, bVarA3, expressionResolver, this, zVar, tabTitleStyle);
        d(tabTitleStyle.f372090d, bVarA3, expressionResolver, this, zVar, tabTitleStyle);
        zVar.getPagerLayout().setClipToPadding(false);
        C10885c c10885c = new C10885c(zVar, divTabs, expressionResolver);
        Y0 y04 = divTabs.f372058w;
        bVarA.e(y04.f374037b.d(expressionResolver, c10885c));
        bVarA.e(y04.f374038c.d(expressionResolver, c10885c));
        bVarA.e(y04.f374039d.d(expressionResolver, c10885c));
        bVarA.e(y04.f374036a.d(expressionResolver, c10885c));
        com.yandex.div.core.view2.divs.tabs.b bVar8 = null;
        c10885c.invoke(null);
        bVarA.e(divTabs.f372057v.e(expressionResolver, new d(zVar)));
        bVarA.e(divTabs.f372047l.e(expressionResolver, new e(zVar)));
        zVar.getTitleLayout().setOnScrollChangedListener(new com.my.target.ads.a(this, c38029k));
        List<DivTabs.f> list3 = divTabs.f372050o;
        ArrayList arrayList3 = new ArrayList(C42745f0.q(list3, 10));
        Iterator<T> it2 = list3.iterator();
        while (it2.hasNext()) {
            arrayList3.add(new com.yandex.div.core.view2.divs.tabs.a((DivTabs.f) it2.next(), zVar.getResources().getDisplayMetrics(), expressionResolver));
        }
        com.yandex.div.core.view2.divs.tabs.b divTabsAdapter2 = zVar.getDivTabsAdapter();
        com.yandex.div.json.expressions.b<Boolean> bVar9 = divTabs.f372044i;
        if (divTabsAdapter2 != null) {
            if (divTabsAdapter2.f368737o == bVar9.a(expressionResolver).booleanValue()) {
                bVar8 = divTabsAdapter2;
            }
        }
        com.yandex.div.json.expressions.b<Long> bVar10 = divTabs.f372056u;
        if (bVar8 != null) {
            bVar8.f368742t = fVar;
            bVar8.f368741s.f368812g = divTabs;
            if (L.f(div, divTabs)) {
                bVar8.d();
            } else {
                bVar8.b(new com.avito.android.vas_planning.domain.b(2, arrayList3), expressionResolver, bVarA);
            }
            bVar2 = bVar10;
            bVar = bVar9;
            arrayList = arrayList3;
            list = list3;
        } else {
            long jLongValue = bVar10.a(expressionResolver).longValue();
            long j12 = jLongValue >> 31;
            if (j12 == 0 || j12 == -1) {
                i12 = (int) jLongValue;
            } else {
                int i13 = com.yandex.div.internal.n.f370123a;
                i12 = jLongValue > 0 ? Integer.MAX_VALUE : BeduinInputModel.MIN_TEXT_VERSION;
            }
            bVar = bVar9;
            bVar2 = bVar10;
            arrayList = arrayList3;
            list = list3;
            b(this, c38029k, divTabs, expressionResolver, zVar, c38040w, fVar, arrayList3, i12);
        }
        com.yandex.div.core.view2.divs.tabs.d dVar = new com.yandex.div.core.view2.divs.tabs.d(zVar);
        Iterator<T> it3 = list.iterator();
        while (it3.hasNext()) {
            K5 f374468o = ((DivTabs.f) it3.next()).f372126a.a().getF375607m();
            if (f374468o instanceof K5.c) {
                K5.c cVar = (K5.c) f374468o;
                bVarA.e(cVar.f372715c.f376151a.d(expressionResolver, dVar));
                bVarA.e(cVar.f372715c.f376152b.d(expressionResolver, dVar));
            }
        }
        com.yandex.div.core.view2.divs.tabs.g gVar2 = new com.yandex.div.core.view2.divs.tabs.g(this, zVar);
        bVarA.e(bVar.d(expressionResolver, new com.yandex.div.core.view2.divs.tabs.e(zVar, divTabs, expressionResolver, this, c38029k, c38040w, fVar, arrayList)));
        bVarA.e(bVar2.d(expressionResolver, gVar2));
        boolean z12 = L.f(c38029k.getPrevDataTag(), q21.c.f428994b) || L.f(c38029k.getDataTag(), c38029k.getPrevDataTag());
        long jLongValue2 = bVar2.a(expressionResolver).longValue();
        if (!z12 || (l12 = this.f368756j) == null || l12.longValue() != jLongValue2) {
            gVar2.invoke(Long.valueOf(jLongValue2));
        }
        bVarA.e(divTabs.f372059x.e(expressionResolver, new com.yandex.div.core.view2.divs.tabs.f(zVar, this, divTabs)));
        bVarA.e(divTabs.f372053r.e(expressionResolver, new f(zVar)));
    }
}
