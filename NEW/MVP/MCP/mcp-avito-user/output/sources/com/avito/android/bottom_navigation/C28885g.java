package com.avito.android.bottom_navigation;

import android.os.Handler;
import androidx.view.InterfaceC23487e;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.bottom_navigation.space.BottomNavigationSpace;
import com.avito.android.bottom_navigation.ui.fragment.TabContainerFragment;
import com.avito.android.bottom_navigation.ui.fragment.factory.NavigationState;
import com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import com.avito.android.home.bottom_navigation.BottomNavigationFragment;
import com.avito.android.ui.fragments.ResultFragmentData;
import com.avito.android.ui.fragments.TabBaseFragment;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: BottomNavigationController.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bottom_navigation/g;", "", "_avito_bottom-navigation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.bottom_navigation.g, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28885g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final F f107005a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28891m f107006b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.l<NavigationState.NavbarBusiness360, G0> f107007c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.bottom_navigation.ui.fragment.k f107008d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final BottomNavigationFragment.l f107009e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final BottomNavigationFragment.m f107010f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f107011g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Handler f107012h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Set<com.avito.android.bottom_navigation.ui.fragment.f> f107013i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final BottomNavigationFragment.n f107014j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final BottomNavigationFragment.o f107015k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final BottomNavigationFragment.p f107016l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final SK0.b f107017m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final Y41.a<String> f107018n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final BottomNavigationSpace f107019o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f107020p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public ResultFragmentData f107021q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final ArrayDeque<NavigationTabSetItem> f107022r;

    public C28885g(@Y61.k F f12, @Y61.k InterfaceC28891m interfaceC28891m, @Y61.k Y41.l lVar, @Y61.k com.avito.android.bottom_navigation.ui.fragment.k kVar, @Y61.k BottomNavigationFragment.l lVar2, @Y61.k BottomNavigationFragment.m mVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k Handler handler, @Y61.k Set set, @Y61.k BottomNavigationFragment.n nVar, @Y61.k BottomNavigationFragment.o oVar, @Y61.k BottomNavigationFragment.p pVar, @Y61.k SK0.b bVar, @Y61.k Y41.a aVar, @Y61.k BottomNavigationSpace bottomNavigationSpace, boolean z12) {
        this.f107005a = f12;
        this.f107006b = interfaceC28891m;
        this.f107007c = lVar;
        this.f107008d = kVar;
        this.f107009e = lVar2;
        this.f107010f = mVar;
        this.f107011g = interfaceC28373a;
        this.f107012h = handler;
        this.f107013i = set;
        this.f107014j = nVar;
        this.f107015k = oVar;
        this.f107016l = pVar;
        this.f107017m = bVar;
        this.f107018n = aVar;
        this.f107019o = bottomNavigationSpace;
        this.f107020p = z12;
        C28883e c28883e = new C28883e(this);
        this.f107022r = new ArrayDeque<>();
        if (!z12) {
            interfaceC28891m.setVisible(false);
        }
        interfaceC28891m.l(c28883e);
    }

    @Y61.l
    public final NavigationTabSetItem a() {
        return (NavigationTabSetItem) C42745f0.R(this.f107022r);
    }

    public final void b(boolean z12) {
        com.avito.android.bottom_navigation.ui.fragment.k kVar = this.f107008d;
        if (kVar.f107161d.V()) {
            f("finish(isBackPressed=" + z12 + ')');
            return;
        }
        NavigationTabSetItem navigationTabSetItemA = a();
        boolean zB2 = kVar.b(a());
        BottomNavigationFragment.m mVar = this.f107010f;
        if (navigationTabSetItemA == null) {
            mVar.b(null);
            return;
        }
        ArrayDeque<NavigationTabSetItem> arrayDeque = this.f107022r;
        boolean z13 = true;
        if (arrayDeque.size() > 1 || (!zB2 && this.f107020p)) {
            z13 = false;
        }
        TabContainerFragment tabContainerFragment = (TabContainerFragment) kVar.f107164g.get(navigationTabSetItemA);
        if (!(tabContainerFragment != null ? tabContainerFragment.d5(z12, z13) : false)) {
            arrayDeque.remove(navigationTabSetItemA);
            NavigationTabSetItem navigationTabSetItemA2 = a();
            if (navigationTabSetItemA2 != null) {
                kVar.a(navigationTabSetItemA2);
                g(navigationTabSetItemA2);
            } else if (z13) {
                mVar.b(null);
            } else {
                NavigationTabSetItem navigationTabSetItem = (NavigationTabSetItem) C42745f0.E(this.f107005a);
                kVar.e(navigationTabSetItem);
                arrayDeque.add(navigationTabSetItem);
                g(navigationTabSetItem);
            }
        }
        NavigationTabSetItem navigationTabSetItemA3 = a();
        if (navigationTabSetItemA3 != null) {
            this.f107012h.post(new RunnableC28882d(0, this, navigationTabSetItemA3));
        }
    }

    public final void c(@Y61.k TabFragmentFactory.Data data) {
        com.avito.android.bottom_navigation.ui.fragment.k kVar = this.f107008d;
        if (kVar.f107161d.V()) {
            f("openScreen(data=" + data + ')');
            return;
        }
        NavigationTabSetItem f115238d = data.getF115238d();
        NavigationTabSetItem navigationTabSetItemA = a();
        if (data.getF186714d() && !this.f107009e.a()) {
            BottomNavigationFragment bottomNavigationFragment = BottomNavigationFragment.this;
            com.avito.android.L l12 = bottomNavigationFragment.f162267o0;
            BottomNavigationFragment.q5(bottomNavigationFragment, (l12 != null ? l12 : null).d(data), data.getF115238d());
            return;
        }
        ResultFragmentData resultFragmentData = this.f107021q;
        NavigationTabSetItem f115238d2 = data.getF115238d();
        TabContainerFragment tabContainerFragmentD = !kotlin.jvm.internal.L.f(f115238d2, navigationTabSetItemA) ? kVar.d(f115238d2) : (TabContainerFragment) kVar.f107164g.get(f115238d2);
        InterfaceC23487e interfaceC23487eE5 = tabContainerFragmentD.e5();
        if (!(interfaceC23487eE5 instanceof com.avito.android.bottom_navigation.ui.fragment.m ? ((com.avito.android.bottom_navigation.ui.fragment.m) interfaceC23487eE5).O(data) : false)) {
            TabBaseFragment tabBaseFragmentA = kVar.f107160c.a(data);
            if (resultFragmentData != null) {
                tabBaseFragmentA.f304616p0 = resultFragmentData;
            }
            tabContainerFragmentD.b5(tabBaseFragmentA, data.t3(), data.getF264134d());
        }
        this.f107021q = null;
        ArrayDeque<NavigationTabSetItem> arrayDeque = this.f107022r;
        arrayDeque.remove(f115238d);
        arrayDeque.add(f115238d);
        g(f115238d);
    }

    @Y61.k
    public final BottomNavigationControllerState d() {
        ArrayDeque<NavigationTabSetItem> arrayDeque = this.f107022r;
        ArrayList arrayList = new ArrayList(C42745f0.q(arrayDeque, 10));
        Iterator<NavigationTabSetItem> it = arrayDeque.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(this.f107005a.indexOf(it.next())));
        }
        return new BottomNavigationControllerState(arrayList, this.f107021q);
    }

    public final void e(@Y61.k NavigationTabSetItem navigationTabSetItem) {
        com.avito.android.bottom_navigation.ui.fragment.k kVar = this.f107008d;
        if (kVar.f107161d.V()) {
            f("selectTab(tab=" + navigationTabSetItem + ')');
            return;
        }
        if (navigationTabSetItem.getF106947d() && !this.f107009e.a()) {
            this.f107010f.a(navigationTabSetItem);
            return;
        }
        if (navigationTabSetItem.equals(a())) {
            kVar.e(navigationTabSetItem);
        } else {
            kVar.a(navigationTabSetItem);
        }
        ArrayDeque<NavigationTabSetItem> arrayDeque = this.f107022r;
        arrayDeque.remove(navigationTabSetItem);
        arrayDeque.add(navigationTabSetItem);
        g(navigationTabSetItem);
    }

    public final void f(String str) {
        StringBuilder sbA = androidx.appcompat.app.r.A("Method: ", str, " \n                |currentTab: ");
        sbA.append(a());
        sbA.append("\n                |tabStack: ");
        sbA.append(this.f107022r);
        this.f107011g.c(new NonFatalErrorEvent(C43066x.F0(sbA.toString()), null, null, null, 14, null));
    }

    public final void g(NavigationTabSetItem navigationTabSetItem) {
        if (!this.f107008d.f107161d.V()) {
            this.f107006b.k(navigationTabSetItem);
            this.f107012h.post(new RunnableC28882d(0, this, navigationTabSetItem));
        } else {
            f("updateViewTab(tab=" + navigationTabSetItem + ')');
        }
    }
}
