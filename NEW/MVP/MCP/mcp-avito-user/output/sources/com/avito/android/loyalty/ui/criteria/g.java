package com.avito.android.loyalty.ui.criteria;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.viewpager2.widget.ViewPager2;
import com.avito.android.R;
import com.avito.android.lib.deprecated_design.tab.CommonTab;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.lib.design.tab_layout.AvitoTabLayout;
import com.avito.android.loyalty.ui.criteria.CriteriaTabsInfo;
import iX.InterfaceC41355a;
import kd0.C42670a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: CriteriaView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/loyalty/ui/criteria/g;", "", "b", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.deprecated_design.tab.adapter.j<CommonTab> f183457a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC41355a, G0> f183458b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f183459c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f183460d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C42670a f183461e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final AvitoTabLayout f183462f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ViewPager2 f183463g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final TextView f183464h;

    /* compiled from: CriteriaView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            g.this.f183458b.invoke(InterfaceC41355a.b.f398533a);
            return G0.f406611a;
        }
    }

    /* compiled from: CriteriaView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/loyalty/ui/criteria/g$b;", "", "<init>", "()V", "", "ADVICES_TAB_INDEX", "I", "ALL_TAB_INDEX", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: CriteriaView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c {
        static {
            int[] iArr = new int[CriteriaTabsInfo.Tab.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CriteriaTabsInfo.Tab tab = CriteriaTabsInfo.Tab.f183430b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: CriteriaView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.a<View> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final View invoke() {
            return g.this.f183460d;
        }
    }

    static {
        new b(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(@Y61.k View view, @Y61.k com.avito.android.lib.deprecated_design.tab.adapter.j<CommonTab> jVar, @Y61.k com.avito.android.lib.deprecated_design.tab.adapter.c<CommonTab> cVar, @Y61.k Y41.l<? super InterfaceC41355a, G0> lVar, @Y61.k com.avito.konveyor.adapter.j jVar2, @Y61.k com.avito.konveyor.adapter.a aVar) {
        this.f183457a = jVar;
        this.f183458b = lVar;
        this.f183459c = aVar;
        View viewFindViewById = view.findViewById(R.id.loyalty_criteria_content);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup = (ViewGroup) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.loyalty_criteria_data_content);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f183460d = (ViewGroup) viewFindViewById2;
        C42670a c42670a = new C42670a(viewGroup, new d(), 0, 4, null);
        this.f183461e = c42670a;
        View viewFindViewById3 = view.findViewById(R.id.loyalty_criteria_nav_bar);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.nav_bar.NavBar");
        }
        NavBar navBar = (NavBar) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.loyalty_criteria_tabs);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.tab_layout.AvitoTabLayout");
        }
        AvitoTabLayout avitoTabLayout = (AvitoTabLayout) viewFindViewById4;
        this.f183462f = avitoTabLayout;
        View viewFindViewById5 = view.findViewById(R.id.loyalty_criteria_view_pager);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.viewpager2.widget.ViewPager2");
        }
        ViewPager2 viewPager2 = (ViewPager2) viewFindViewById5;
        this.f183463g = viewPager2;
        View viewFindViewById6 = view.findViewById(R.id.loyalty_criteria_title);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f183464h = (TextView) viewFindViewById6;
        a aVar2 = new a();
        int i12 = NavBar.f179818g;
        navBar.c(R.attr.ic_arrowBack24, aVar2);
        com.avito.android.lib.design.tab_layout.util.b.b(viewPager2, avitoTabLayout);
        com.avito.android.lib.deprecated_design.tab.l.d(avitoTabLayout, cVar);
        viewPager2.setAdapter(jVar2);
        c42670a.a(new com.avito.android.imv_similiar_adverts.h(this, 21));
    }
}
