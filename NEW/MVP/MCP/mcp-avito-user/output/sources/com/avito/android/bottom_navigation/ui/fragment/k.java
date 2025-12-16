package com.avito.android.bottom_navigation.ui.fragment;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.H;
import androidx.view.Lifecycle;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.bottom_navigation.F;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.bottom_navigation.ui.NavigationScreenAction;
import com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: TabFragmentManagerImpl.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bottom_navigation/ui/fragment/k;", "Lcom/avito/android/bottom_navigation/ui/fragment/j;", "_avito_bottom-navigation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f107158a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final F f107159b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TabFragmentFactory f107160c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final FragmentManager f107161d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f107162e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Y41.l<String, G0> f107163f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f107164g = new LinkedHashMap();

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f107165h = new LinkedHashMap();

    public k(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k F f12, @Y61.k TabFragmentFactory tabFragmentFactory, @Y61.k FragmentManager fragmentManager, boolean z12, @Y61.k a aVar, @Y61.k ViewGroup viewGroup, @Y61.k Y41.l lVar) {
        this.f107158a = interfaceC28373a;
        this.f107159b = f12;
        this.f107160c = tabFragmentFactory;
        this.f107161d = fragmentManager;
        this.f107162e = z12;
        this.f107163f = lVar;
        for (NavigationTabSetItem navigationTabSetItem : f12.f106933b) {
            Fragment fragmentH = this.f107161d.H(navigationTabSetItem.getName());
            if (fragmentH instanceof TabContainerFragment) {
                this.f107164g.put(navigationTabSetItem, fragmentH);
            }
            LinkedHashMap linkedHashMap = this.f107165h;
            View viewFindViewById = viewGroup.findViewById(navigationTabSetItem.getF106946c());
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
            linkedHashMap.put(navigationTabSetItem, viewFindViewById);
        }
        this.f107161d.e0(aVar, true);
    }

    public final void a(@Y61.k NavigationTabSetItem navigationTabSetItem) {
        TabContainerFragment tabContainerFragmentD = d(navigationTabSetItem);
        if (tabContainerFragmentD.h5() == 0) {
            tabContainerFragmentD.b5(this.f107160c.c(navigationTabSetItem), null, NavigationScreenAction.f107100b);
        }
        this.f107163f.invoke(navigationTabSetItem.getName());
    }

    public final boolean b(@Y61.l NavigationTabSetItem navigationTabSetItem) {
        if (navigationTabSetItem == null) {
            return false;
        }
        TabContainerFragment tabContainerFragment = (TabContainerFragment) this.f107164g.get(navigationTabSetItem);
        Fragment fragmentE5 = tabContainerFragment != null ? tabContainerFragment.e5() : null;
        l lVar = fragmentE5 instanceof l ? (l) fragmentE5 : null;
        if (lVar != null) {
            return lVar.b0(navigationTabSetItem);
        }
        return false;
    }

    public final int c(@Y61.k NavigationTabSetItem navigationTabSetItem) {
        TabContainerFragment tabContainerFragment = (TabContainerFragment) this.f107164g.get(navigationTabSetItem);
        if (tabContainerFragment != null) {
            return tabContainerFragment.h5();
        }
        return 0;
    }

    public final TabContainerFragment d(NavigationTabSetItem navigationTabSetItem) {
        LinkedHashMap linkedHashMap = this.f107164g;
        TabContainerFragment tabContainerFragmentB = (TabContainerFragment) linkedHashMap.get(navigationTabSetItem);
        if (tabContainerFragmentB == null) {
            tabContainerFragmentB = this.f107160c.b(navigationTabSetItem);
        }
        boolean zEquals = tabContainerFragmentB.equals((TabContainerFragment) linkedHashMap.put(navigationTabSetItem, tabContainerFragmentB));
        FragmentManager fragmentManager = this.f107161d;
        if (!zEquals && !tabContainerFragmentB.isAdded()) {
            H hE2 = fragmentManager.e();
            hE2.j(navigationTabSetItem.getF106946c(), tabContainerFragmentB, navigationTabSetItem.getName(), 1);
            hE2.c(navigationTabSetItem.getName());
            hE2.e();
        }
        H hE3 = fragmentManager.e();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            hE3.p((Fragment) entry.getValue(), L.f(entry.getKey(), navigationTabSetItem) ? Lifecycle.State.f46683f : Lifecycle.State.f46682e);
        }
        hE3.e();
        if (this.f107162e) {
            try {
                fragmentManager.E();
            } catch (IllegalStateException e12) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                fragmentManager.y("", null, new PrintWriter((OutputStream) byteArrayOutputStream, true), new String[0]);
                this.f107158a.c(new NonFatalErrorEvent(byteArrayOutputStream.toString(StandardCharsets.UTF_8.name()), null, null, null, 14, null));
                throw e12;
            }
        } else {
            fragmentManager.E();
        }
        for (NavigationTabSetItem navigationTabSetItem2 : this.f107159b.f106933b) {
            View view = (View) this.f107165h.get(navigationTabSetItem2);
            if (view != null) {
                view.setVisibility(L.f(navigationTabSetItem2, navigationTabSetItem) ? 0 : 8);
            }
        }
        return tabContainerFragmentB;
    }

    public final void e(@Y61.l NavigationTabSetItem navigationTabSetItem) {
        if (navigationTabSetItem != null) {
            TabContainerFragment tabContainerFragment = (TabContainerFragment) this.f107164g.get(navigationTabSetItem);
            if (tabContainerFragment != null ? tabContainerFragment.i5(navigationTabSetItem) : false) {
                return;
            }
            d(navigationTabSetItem).b5(this.f107160c.c(navigationTabSetItem), null, NavigationScreenAction.f107100b);
        }
    }
}
