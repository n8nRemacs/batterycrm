package com.avito.android.home.bottom_navigation;

import android.os.Handler;
import android.os.Looper;
import androidx.compose.ui.RunnableC22211b;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.view.Lifecycle;
import com.avito.android.R;
import com.avito.android.bottom_navigation.C28885g;
import com.avito.android.bottom_navigation.C28899v;
import com.avito.android.bottom_navigation.NavigationTab;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.bottom_navigation.RunnableC28882d;
import com.avito.android.bottom_navigation.space.BottomNavigationSpace;
import com.avito.android.bottom_navigation.ui.NavigationScreenAction;
import com.avito.android.bottom_navigation.ui.fragment.TabContainerFragment;
import com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory;
import com.avito.android.home.bottom_navigation.H;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.UUID;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.AbstractC42738c;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BottomNavigationContainerDelegate.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/home/bottom_navigation/a;", "", "a", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.home.bottom_navigation.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30759a {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f162335f = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ActivityC22955m f162336a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C30761c f162337b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final FragmentManager f162338c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Handler f162339d = new Handler(Looper.getMainLooper());

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final BottomNavigationSpace f162340e;

    /* compiled from: BottomNavigationContainerDelegate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/home/bottom_navigation/a$a;", "", "<init>", "()V", "", "DELAY_EXIT_SPACE_UXFB", "J", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.home.bottom_navigation.a$a, reason: collision with other inner class name */
    public static final class C4750a {
        public /* synthetic */ C4750a(C42822w c42822w) {
            this();
        }

        public C4750a() {
        }
    }

    /* compiled from: BottomNavigationContainerDelegate.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.home.bottom_navigation.a$b */
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C28899v.a f162341l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ BottomNavigationFragment f162342m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C28899v.a aVar, BottomNavigationFragment bottomNavigationFragment) {
            super(0);
            this.f162341l = aVar;
            this.f162342m = bottomNavigationFragment;
        }

        @Override // Y41.a
        public final G0 invoke() {
            C28885g c28885g;
            C28899v.a aVar = this.f162341l;
            if (aVar instanceof C28899v.a.C3201a) {
                ((C28899v.a.C3201a) aVar).getClass();
                NavigationTab navigationTab = NavigationTab.f106971g;
                BottomNavigationFragment bottomNavigationFragment = this.f162342m;
                if (bottomNavigationFragment.u5().contains(navigationTab) && (c28885g = bottomNavigationFragment.f162252H0) != null) {
                    NavigationTabSetItem navigationTabSetItemA = c28885g.a();
                    com.avito.android.bottom_navigation.ui.fragment.k kVar = c28885g.f107008d;
                    Handler handler = c28885g.f107012h;
                    if (navigationTab != navigationTabSetItemA) {
                        boolean z12 = kVar.c(navigationTab) == 0;
                        c28885g.e(navigationTab);
                        if (!z12 && !kVar.b(navigationTab)) {
                            if (kVar.f107161d.V()) {
                                c28885g.f("upNavigationTab()");
                            } else {
                                NavigationTabSetItem navigationTabSetItemA2 = c28885g.a();
                                kVar.e(navigationTabSetItemA2);
                                if (navigationTabSetItemA2 != null) {
                                    handler.post(new RunnableC28882d(0, c28885g, navigationTabSetItemA2));
                                }
                            }
                        }
                    } else if (!kVar.b(navigationTab)) {
                        if (kVar.f107161d.V()) {
                            c28885g.f("upNavigationTab()");
                        } else {
                            NavigationTabSetItem navigationTabSetItemA3 = c28885g.a();
                            kVar.e(navigationTabSetItemA3);
                            if (navigationTabSetItemA3 != null) {
                                handler.post(new RunnableC28882d(0, c28885g, navigationTabSetItemA3));
                            }
                        }
                    }
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: BottomNavigationContainerDelegate.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.home.bottom_navigation.a$c */
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ BottomNavigationOpenParams f162343l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ C30759a f162344m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ boolean f162345n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(BottomNavigationOpenParams bottomNavigationOpenParams, C30759a c30759a, boolean z12) {
            super(0);
            this.f162343l = bottomNavigationOpenParams;
            this.f162344m = c30759a;
            this.f162345n = z12;
        }

        @Override // Y41.a
        public final G0 invoke() {
            NavigationScreenAction f71588d;
            BottomNavigationFragment bottomNavigationFragmentB;
            C28885g c28885g;
            NavigationTabSetItem navigationTabSetItemA;
            TabContainerFragment tabContainerFragment;
            BottomNavigationOpenParams bottomNavigationOpenParams = this.f162343l;
            TabFragmentFactory.Data data = bottomNavigationOpenParams.f162305d.f162307c;
            C30759a c30759a = this.f162344m;
            if (data != null && (f71588d = data.getF264134d()) != null && (bottomNavigationFragmentB = c30759a.b()) != null && (c28885g = bottomNavigationFragmentB.f162252H0) != null && (navigationTabSetItemA = c28885g.a()) != null && (tabContainerFragment = (TabContainerFragment) c28885g.f107008d.f107164g.get(navigationTabSetItemA)) != null) {
                tabContainerFragment.f5(f71588d);
            }
            androidx.fragment.app.H hE2 = c30759a.f162338c.e();
            String string = UUID.randomUUID().toString();
            if (this.f162345n) {
                hE2.o(R.anim.space_screen_in, R.anim.space_screen_empty, R.anim.space_screen_empty, R.anim.space_screen_out);
            }
            BottomNavigationFragment.f162243V0.getClass();
            BottomNavigationFragment bottomNavigationFragment = new BottomNavigationFragment();
            bottomNavigationFragment.f162251G0.setValue(bottomNavigationFragment, BottomNavigationFragment.f162244W0[0], bottomNavigationOpenParams);
            hE2.n(R.id.fragment_container, bottomNavigationFragment, string);
            hE2.c(string);
            hE2.e();
            return G0.f406611a;
        }
    }

    static {
        new C4750a(null);
    }

    public C30759a(@Y61.k ActivityC22955m activityC22955m, @Y61.k C30761c c30761c) {
        this.f162336a = activityC22955m;
        this.f162337b = c30761c;
        this.f162338c = activityC22955m.getSupportFragmentManager();
        this.f162340e = c30761c.f162348c.e().f16134a;
    }

    public static void c(C28899v.a aVar, BottomNavigationFragment bottomNavigationFragment) {
        if (aVar == null) {
            return;
        }
        com.avito.android.util.architecture_components.l.a(bottomNavigationFragment.getLifecycle(), Lifecycle.State.f46682e, new b(aVar, bottomNavigationFragment));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final BottomNavigationOpenParams a(boolean z12, BottomNavigationSpace bottomNavigationSpace, BottomNavigationScreenParams bottomNavigationScreenParams) {
        H.b bVar;
        BottomNavigationSpace next;
        NavigationTabSetItem navigationTabSetItem;
        NavigationTabSetItem next2;
        H h12 = this.f162337b.f162346a;
        TabFragmentFactory.Data data = bottomNavigationScreenParams.f162307c;
        if (data == null) {
            bVar = new H.b(bottomNavigationSpace, null, 2, null);
        } else {
            com.avito.android.bottom_navigation.space.p pVar = data instanceof com.avito.android.bottom_navigation.space.p ? (com.avito.android.bottom_navigation.space.p) data : null;
            BottomNavigationSpace bottomNavigationSpaceU = pVar != null ? pVar.U() : null;
            com.avito.android.bottom_navigation.G g12 = h12.f162330a;
            if (bottomNavigationSpaceU != null) {
                com.avito.android.bottom_navigation.F fA2 = g12.a(bottomNavigationSpaceU);
                if (bottomNavigationSpaceU == bottomNavigationSpace && fA2.contains(data.getF107770d())) {
                    bVar = new H.b(bottomNavigationSpace, null, 2, null);
                } else {
                    com.avito.android.bottom_navigation.space.p pVar2 = (com.avito.android.bottom_navigation.space.p) data;
                    Set<NavigationTabSetItem> setW = pVar2.W();
                    if (setW != null) {
                        Iterator<NavigationTabSetItem> it = fA2.f106933b.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it.next();
                            if (setW.contains(next2)) {
                                break;
                            }
                        }
                        navigationTabSetItem = next2;
                    } else {
                        navigationTabSetItem = (NavigationTabSetItem) C42745f0.E(fA2);
                    }
                    if (navigationTabSetItem == null) {
                        throw new IllegalArgumentException(("allowedTabs должен содержать минимум 1 таб из требуемого спейса. currentSpace=" + bottomNavigationSpace + " requiredSpace=" + bottomNavigationSpaceU + ' ' + data).toString());
                    }
                    bVar = new H.b(bottomNavigationSpaceU, navigationTabSetItem.equals(data.getF107770d()) ? null : (TabFragmentFactory.Data) pVar2.g0(navigationTabSetItem));
                }
            } else {
                NavigationTabSetItem f173268d = data.getF107770d();
                if (!g12.a(bottomNavigationSpace).contains(f173268d)) {
                    Iterator it2 = ((AbstractC42738c) H.a.f162331a).iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = 0;
                            break;
                        }
                        next = it2.next();
                        if (g12.a((BottomNavigationSpace) next).contains(f173268d)) {
                            break;
                        }
                    }
                    bottomNavigationSpace = next;
                }
                if (bottomNavigationSpace == null) {
                    throw new IllegalArgumentException(("Таб не найден ни в одном спейсе. " + f173268d).toString());
                }
                bVar = new H.b(bottomNavigationSpace, null, 2, null);
            }
        }
        TabFragmentFactory.Data data2 = bVar.f162333b;
        if (data2 != null) {
            bottomNavigationScreenParams = new BottomNavigationScreenParams(bottomNavigationScreenParams.f162306b, data2, bottomNavigationScreenParams.f162308d);
        }
        return new BottomNavigationOpenParams(z12, bVar.f162332a, bottomNavigationScreenParams);
    }

    @Y61.l
    public final BottomNavigationFragment b() {
        Fragment fragmentPrevious;
        List<Fragment> listP = this.f162338c.P();
        ListIterator<Fragment> listIterator = listP.listIterator(listP.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                fragmentPrevious = null;
                break;
            }
            fragmentPrevious = listIterator.previous();
            if (fragmentPrevious instanceof BottomNavigationFragment) {
                break;
            }
        }
        if (fragmentPrevious instanceof BottomNavigationFragment) {
            return (BottomNavigationFragment) fragmentPrevious;
        }
        return null;
    }

    public final void d(BottomNavigationOpenParams bottomNavigationOpenParams, boolean z12) {
        BottomNavigationFragment bottomNavigationFragmentB = b();
        if (bottomNavigationOpenParams.f162304c == (bottomNavigationFragmentB != null ? bottomNavigationFragmentB.v5().f162304c : null)) {
            BottomNavigationFragment bottomNavigationFragmentB2 = b();
            if (bottomNavigationFragmentB2 != null) {
                bottomNavigationFragmentB2.w5(bottomNavigationOpenParams.f162305d);
                return;
            }
            return;
        }
        c cVar = new c(bottomNavigationOpenParams, this, z12);
        if (z12) {
            this.f162339d.post(new RunnableC22211b(9, cVar));
        } else {
            cVar.invoke();
        }
    }
}
