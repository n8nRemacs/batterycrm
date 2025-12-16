package com.avito.android.user_adverts.root_screen.adverts_host.host_view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.os.C22777e;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.C23411b;
import androidx.recyclerview.widget.C23412c;
import androidx.recyclerview.widget.C23413d;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.view.C22977J;
import androidx.view.C22981N;
import androidx.view.Lifecycle;
import androidx.viewpager2.widget.ViewPager2;
import com.avito.android.R;
import com.avito.android.analytics.screens.UserAdvertsScreen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.component.toast.c;
import com.avito.android.lib.design.tab_group.TabGroup;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.profile.logout_view.ProfileLogoutView;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.user_adverts.root_screen.adverts_host.UserAdvertsHostFragment;
import com.avito.android.user_adverts.root_screen.adverts_host.host_view.HostViewState;
import com.avito.android.user_adverts.root_screen.adverts_host.host_view.c;
import com.avito.android.user_adverts.root_screen.adverts_host.placeholder.UserAdvertsPlaceholderView;
import com.avito.android.user_adverts.root_screen.adverts_host.publish_button.PublishFabView;
import com.avito.android.user_adverts.root_screen.adverts_host.scroll_proxy_view.ScrollProxyView;
import com.avito.android.user_adverts.space.UserAdvertsSpace;
import com.avito.android.user_adverts.tab_screens.UserAdvertsListData;
import com.avito.android.user_adverts.tab_screens.adverts.UserAdvertsListMviFragment;
import com.google.android.material.appbar.AppBarLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.Z;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.N0;

/* compiled from: HostViewRenderer.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0006\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/host_view/j;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/host_view/c;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/host_view/c$a;", "a", "b", "c", "d", "e", "f", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class j implements com.avito.android.user_adverts.root_screen.adverts_host.host_view.c, c.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f313019a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f313020b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f313021c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final SwipeRefreshLayout f313022d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ProfileLogoutView f313023e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final AppBarLayout f313024f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ViewPager2 f313025g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final TabGroup f313026h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final View f313027i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final UserAdvertsPlaceholderView f313028j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final PublishFabView f313029k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final View f313030l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final View f313031m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final a f313032n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final d f313033o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final c f313034p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final e f313035q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final C22977J f313036r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public HostViewState f313037s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public c.b f313038t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.l
    public N0 f313039u;

    /* renamed from: v, reason: collision with root package name */
    public int f313040v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final Y41.l<Integer, G0> f313041w;

    /* compiled from: HostViewRenderer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/host_view/j$a;", "Lcom/google/android/material/appbar/AppBarLayout$Behavior$a;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends AppBarLayout.Behavior.a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f313042a = true;

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior.b
        /* renamed from: a, reason: from getter */
        public final boolean getF313042a() {
            return this.f313042a;
        }
    }

    /* compiled from: HostViewRenderer.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/host_view/j$b;", "", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ScreenPerformanceTracker f313043a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.deeplink_handler.handler.composite.a f313044b;

        @Inject
        public b(@Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
            this.f313043a = screenPerformanceTracker;
            this.f313044b = aVar;
        }
    }

    /* compiled from: HostViewRenderer.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/host_view/j$c;", "Landroidx/viewpager2/widget/ViewPager2$i;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends ViewPager2.i {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public Y41.l<? super Integer, G0> f313045d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public Y41.l<? super Integer, G0> f313046e;

        /* compiled from: HostViewRenderer.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a extends N implements Y41.l<Integer, G0> {

            /* renamed from: l, reason: collision with root package name */
            public static final a f313047l = new a();

            public a() {
                super(1);
            }

            @Override // Y41.l
            public final /* bridge */ /* synthetic */ G0 invoke(Integer num) {
                num.intValue();
                return G0.f406611a;
            }
        }

        /* compiled from: HostViewRenderer.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class b extends N implements Y41.l<Integer, G0> {

            /* renamed from: l, reason: collision with root package name */
            public static final b f313048l = new b();

            public b() {
                super(1);
            }

            @Override // Y41.l
            public final /* bridge */ /* synthetic */ G0 invoke(Integer num) {
                num.intValue();
                return G0.f406611a;
            }
        }

        /* compiled from: HostViewRenderer.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.host_view.j$c$c, reason: collision with other inner class name */
        public static final class C9592c extends N implements Y41.l<Integer, G0> {

            /* renamed from: l, reason: collision with root package name */
            public static final C9592c f313049l = new C9592c();

            public C9592c() {
                super(1);
            }

            @Override // Y41.l
            public final /* bridge */ /* synthetic */ G0 invoke(Integer num) {
                num.intValue();
                return G0.f406611a;
            }
        }

        /* compiled from: HostViewRenderer.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class d extends N implements Y41.l<Integer, G0> {

            /* renamed from: l, reason: collision with root package name */
            public static final d f313050l = new d();

            public d() {
                super(1);
            }

            @Override // Y41.l
            public final /* bridge */ /* synthetic */ G0 invoke(Integer num) {
                num.intValue();
                return G0.f406611a;
            }
        }

        public c() {
            this(null, null, 3, null);
        }

        public final void a() {
            this.f313045d = C9592c.f313049l;
            this.f313046e = d.f313050l;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public final void onPageScrollStateChanged(int i12) {
            this.f313046e.invoke(Integer.valueOf(i12));
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public final void onPageSelected(int i12) {
            this.f313045d.invoke(Integer.valueOf(i12));
        }

        public c(Y41.l lVar, Y41.l lVar2, int i12, C42822w c42822w) {
            lVar = (i12 & 1) != 0 ? a.f313047l : lVar;
            lVar2 = (i12 & 2) != 0 ? b.f313048l : lVar2;
            this.f313045d = lVar;
            this.f313046e = lVar2;
        }
    }

    /* compiled from: HostViewRenderer.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/host_view/j$d;", "Landroidx/viewpager2/widget/ViewPager2$i;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d extends ViewPager2.i {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final Y41.l<Integer, G0> f313051d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final Y41.l<Integer, G0> f313052e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f313053f = true;

        /* JADX WARN: Multi-variable type inference failed */
        public d(@Y61.k Y41.l<? super Integer, G0> lVar, @Y61.k Y41.l<? super Integer, G0> lVar2) {
            this.f313051d = lVar;
            this.f313052e = lVar2;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public final void onPageScrollStateChanged(int i12) {
            if (this.f313053f) {
                ((p) this.f313052e).invoke(Integer.valueOf(i12));
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public final void onPageSelected(int i12) {
            if (this.f313053f) {
                ((o) this.f313051d).invoke(Integer.valueOf(i12));
            }
        }
    }

    /* compiled from: HostViewRenderer.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/host_view/j$e;", "Landroidx/viewpager2/adapter/b;", "Ljava/lang/Runnable;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e extends androidx.viewpager2.adapter.b implements Runnable {

        /* renamed from: k, reason: collision with root package name */
        @Y61.k
        public final FragmentManager f313054k;

        /* renamed from: l, reason: collision with root package name */
        @Y61.k
        public final C23413d<HostViewState.c> f313055l;

        /* renamed from: m, reason: collision with root package name */
        @Y61.k
        public final ArrayList f313056m;

        /* JADX WARN: Illegal instructions before constructor call */
        public e(@Y61.k UserAdvertsHostFragment userAdvertsHostFragment) {
            Lifecycle lifecycle = userAdvertsHostFragment.getLifecycle();
            FragmentManager childFragmentManager = userAdvertsHostFragment.getChildFragmentManager();
            super(childFragmentManager, lifecycle);
            this.f313054k = childFragmentManager;
            this.f313055l = new C23413d<>(new C23411b(this), new C23412c.a(new com.avito.android.user_adverts.root_screen.adverts_host.host_view.k()).a());
            this.f313056m = new ArrayList();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.f313055l.f53994f.size();
        }

        @Override // androidx.viewpager2.adapter.b, androidx.recyclerview.widget.RecyclerView.Adapter
        public final long getItemId(int i12) {
            return this.f313055l.f53994f.get(i12).f312980a.hashCode();
        }

        @Override // androidx.viewpager2.adapter.b
        public final boolean k(long j12) {
            Iterator<HostViewState.c> it = this.f313055l.f53994f.iterator();
            while (it.hasNext()) {
                if (it.next().f312980a.hashCode() == j12) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.viewpager2.adapter.b
        @Y61.k
        public final Fragment l(int i12) {
            HostViewState.c cVar = this.f313055l.f53994f.get(i12);
            UserAdvertsListMviFragment.C35649a c35649a = UserAdvertsListMviFragment.f314828R0;
            UserAdvertsListData userAdvertsListData = new UserAdvertsListData(cVar.f312980a, -1, -1, UserAdvertsSpace.f314189c, false, UserAdvertsScreen.f90543d, true);
            c35649a.getClass();
            UserAdvertsListMviFragment userAdvertsListMviFragment = new UserAdvertsListMviFragment();
            userAdvertsListMviFragment.setArguments(C22777e.b(new Q("key_user_adverts_list_data", userAdvertsListData)));
            return userAdvertsListMviFragment;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Iterator it = C42745f0.M0(this.f313056m).iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
    }

    /* compiled from: HostViewRenderer.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/host_view/j$f;", "Lcom/google/android/material/appbar/AppBarLayout$g;", "LQI0/a;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$e;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f implements AppBarLayout.g, QI0.a, SwipeRefreshLayout.e {

        /* renamed from: b, reason: collision with root package name */
        public int f313057b;

        /* renamed from: c, reason: collision with root package name */
        public int f313058c = 1;

        @Override // QI0.a
        public final void a(int i12) {
            this.f313058c = i12;
        }

        @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.e
        public final boolean b() {
            return (this.f313057b == 0 && this.f313058c == 1) ? false : true;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.b
        public final void c(@Y61.l AppBarLayout appBarLayout, int i12) {
            this.f313057b = i12;
        }
    }

    /* compiled from: HostViewRenderer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class g {
        static {
            int[] iArr = new int[HostViewState.AppBarContent.ExpandType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                HostViewState.AppBarContent.ExpandType expandType = HostViewState.AppBarContent.ExpandType.f312967b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                HostViewState.AppBarContent.ExpandType expandType2 = HostViewState.AppBarContent.ExpandType.f312967b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: HostViewRenderer.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.l<Throwable, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f313059l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Runnable f313060m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(View view, Runnable runnable) {
            super(1);
            this.f313059l = view;
            this.f313060m = runnable;
        }

        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            this.f313059l.removeCallbacks(this.f313060m);
            return G0.f406611a;
        }
    }

    /* compiled from: HostViewRenderer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.r f313061b;

        public i(kotlinx.coroutines.r rVar) {
            this.f313061b = rVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i12 = Z.f406624c;
            this.f313061b.resumeWith(G0.f406611a);
        }
    }

    /* compiled from: HostViewRenderer.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.host_view.j$j, reason: collision with other inner class name */
    public static final class C9593j extends N implements Y41.l<Throwable, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ e f313062l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ k f313063m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9593j(e eVar, k kVar) {
            super(1);
            this.f313062l = eVar;
            this.f313063m = kVar;
        }

        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            this.f313062l.f313056m.remove(this.f313063m);
            return G0.f406611a;
        }
    }

    /* compiled from: HostViewRenderer.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/user_adverts/root_screen/adverts_host/host_view/j$k", "Ljava/lang/Runnable;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class k implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e f313064b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.r f313065c;

        public k(e eVar, kotlinx.coroutines.r rVar) {
            this.f313064b = eVar;
            this.f313065c = rVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f313064b.f313056m.remove(this);
            int i12 = Z.f406624c;
            this.f313065c.resumeWith(G0.f406611a);
        }
    }

    /* compiled from: HostViewRenderer.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.l<Integer, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.r f313067m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(kotlinx.coroutines.r rVar) {
            super(1);
            this.f313067m = rVar;
        }

        @Override // Y41.l
        public final G0 invoke(Integer num) {
            if (num.intValue() == 0) {
                j.this.f313034p.a();
                int i12 = Z.f406624c;
                this.f313067m.resumeWith(G0.f406611a);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: HostViewRenderer.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.l<Throwable, G0> {
        public m() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            j.this.f313034p.a();
            return G0.f406611a;
        }
    }

    /* compiled from: HostViewRenderer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final n f313069l = new n();

        public n() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    public j(@Y61.k View view, @Y61.k UserAdvertsHostFragment userAdvertsHostFragment, boolean z12, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k ScreenPerformanceTracker screenPerformanceTracker) {
        int measuredHeight;
        this.f313019a = aVar;
        this.f313020b = screenPerformanceTracker;
        this.f313021c = view.getContext();
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.swipe_refresh_layout);
        this.f313022d = swipeRefreshLayout;
        ProfileLogoutView profileLogoutView = (ProfileLogoutView) view.findViewById(R.id.profile_logout_view);
        this.f313023e = profileLogoutView;
        AppBarLayout appBarLayout = (AppBarLayout) view.findViewById(R.id.app_bar);
        this.f313024f = appBarLayout;
        ScrollProxyView scrollProxyView = (ScrollProxyView) view.findViewById(R.id.scroll_proxy);
        ViewPager2 viewPager2 = (ViewPager2) view.findViewById(R.id.tabs_pager);
        this.f313025g = viewPager2;
        TabGroup tabGroup = (TabGroup) view.findViewById(R.id.tabs_re23);
        this.f313026h = tabGroup;
        View viewFindViewById = view.findViewById(R.id.user_adverts_content_placeholder_container);
        this.f313027i = viewFindViewById;
        UserAdvertsPlaceholderView userAdvertsPlaceholderView = (UserAdvertsPlaceholderView) view.findViewById(R.id.user_adverts_content_placeholder);
        this.f313028j = userAdvertsPlaceholderView;
        PublishFabView publishFabView = (PublishFabView) view.findViewById(R.id.publish_fab_view);
        this.f313029k = publishFabView;
        View viewFindViewById2 = view.findViewById(R.id.toolbar);
        this.f313030l = viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.navbar_offset);
        this.f313031m = viewFindViewById3;
        a aVar2 = new a();
        this.f313032n = aVar2;
        d dVar = new d(new o(1, this, j.class, "pageSelected", "pageSelected(I)V", 0), new p(1, this, j.class, "pageScrollStateChanged", "pageScrollStateChanged(I)V", 0));
        this.f313033o = dVar;
        c cVar = new c(null, null, 3, null);
        this.f313034p = cVar;
        e eVar = new e(userAdvertsHostFragment);
        this.f313035q = eVar;
        this.f313036r = C22981N.a(userAdvertsHostFragment.getLifecycle());
        this.f313037s = HostViewState.b.f312979b;
        this.f313038t = new C31685o(16);
        this.f313040v = -1;
        this.f313041w = new v(this);
        viewPager2.setVisibility(0);
        swipeRefreshLayout.setVisibility(8);
        profileLogoutView.setVisibility(8);
        publishFabView.setVisibility(0);
        if (publishFabView.getParent() instanceof CoordinatorLayout) {
            publishFabView.getF313793d().w(publishFabView);
        } else {
            publishFabView.setVisibility(0);
        }
        publishFabView.getF313793d().f313794l = true;
        appBarLayout.setExpanded(true);
        int paddingBottom = viewFindViewById.getPaddingBottom();
        if (publishFabView.getMeasuredHeight() != 0) {
            measuredHeight = publishFabView.getMeasuredHeight();
        } else {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            publishFabView.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            measuredHeight = publishFabView.getMeasuredHeight();
        }
        viewFindViewById.setPaddingRelative(viewFindViewById.getPaddingStart(), viewFindViewById.getPaddingTop(), viewFindViewById.getPaddingEnd(), measuredHeight + paddingBottom);
        viewPager2.setOffscreenPageLimit(1);
        viewPager2.setAdapter(eVar);
        viewPager2.e(dVar);
        viewPager2.e(cVar);
        viewFindViewById2.setVisibility(z12 ? 0 : 8);
        viewFindViewById3.setVisibility(!z12 ? 0 : 8);
        f fVar = new f();
        appBarLayout.a(fVar);
        scrollProxyView.setProxyScrollListener(fVar);
        swipeRefreshLayout.setOnChildScrollUpCallback(fVar);
        com.avito.android.lib.design.tab_group.layout.i.b(tabGroup, viewPager2);
        if (!appBarLayout.isLaidOut() || appBarLayout.isLayoutRequested()) {
            appBarLayout.addOnLayoutChangeListener(new u(appBarLayout, aVar2));
        } else {
            ViewGroup.LayoutParams layoutParams = appBarLayout.getLayoutParams();
            CoordinatorLayout.g gVar = layoutParams instanceof CoordinatorLayout.g ? (CoordinatorLayout.g) layoutParams : null;
            CoordinatorLayout.c cVar2 = gVar != null ? gVar.f44447a : null;
            AppBarLayout.Behavior behavior = cVar2 instanceof AppBarLayout.Behavior ? (AppBarLayout.Behavior) cVar2 : null;
            if (behavior != null) {
                behavior.f355745o = aVar2;
            }
        }
        appBarLayout.setStateListAnimator(null);
        userAdvertsPlaceholderView.setRefreshClickListener(new com.avito.android.user_adverts.root_screen.adverts_host.host_view.h(this));
        profileLogoutView.setLoginButtonClickListener(new com.avito.android.user_adverts.root_screen.adverts_host.host_view.g(this, 0));
        swipeRefreshLayout.setOnRefreshListener(new com.avito.android.str_seller_orders.orders_seller.d(this, 6));
        publishFabView.setPublishClickListener(new com.avito.android.user_adverts.root_screen.adverts_host.host_view.i(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.avito.android.user_adverts.root_screen.adverts_host.host_view.j] */
    /* JADX WARN: Type inference failed for: r8v1, types: [com.avito.android.user_adverts.root_screen.adverts_host.host_view.j] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.avito.android.user_adverts.root_screen.adverts_host.host_view.j r8, java.util.ArrayList r9, java.util.ArrayList r10, int r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts.root_screen.adverts_host.host_view.j.a(com.avito.android.user_adverts.root_screen.adverts_host.host_view.j, java.util.ArrayList, java.util.ArrayList, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static Object b(View view, Continuation continuation) {
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(1, IntrinsicsKt.intercepted(continuation));
        rVar.p();
        i iVar = new i(rVar);
        rVar.r(new h(view, iVar));
        view.postOnAnimation(iVar);
        Object objO = rVar.o();
        if (objO == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objO == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objO : G0.f406611a;
    }

    public static Object d(e eVar, List list, Continuation continuation) {
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(1, IntrinsicsKt.intercepted(continuation));
        rVar.p();
        k kVar = new k(eVar, rVar);
        eVar.f313056m.add(kVar);
        rVar.r(new C9593j(eVar, kVar));
        eVar.f313055l.b(list, eVar);
        Object objO = rVar.o();
        if (objO == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objO == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objO : G0.f406611a;
    }

    public static void i(j jVar) {
        HostViewState.d dVar = new HostViewState.d(true, false, "");
        jVar.f313025g.setVisibility(8);
        jVar.f313026h.setVisibility(8);
        SwipeRefreshLayout swipeRefreshLayout = jVar.f313022d;
        swipeRefreshLayout.setRefreshing(false);
        swipeRefreshLayout.setEnabled(false);
        jVar.j(dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(androidx.viewpager2.widget.ViewPager2 r5, int r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.avito.android.user_adverts.root_screen.adverts_host.host_view.l
            if (r0 == 0) goto L13
            r0 = r7
            com.avito.android.user_adverts.root_screen.adverts_host.host_view.l r0 = (com.avito.android.user_adverts.root_screen.adverts_host.host_view.l) r0
            int r1 = r0.f313072s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f313072s = r1
            goto L18
        L13:
            com.avito.android.user_adverts.root_screen.adverts_host.host_view.l r0 = new com.avito.android.user_adverts.root_screen.adverts_host.host_view.l
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f313070q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f313072s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r7)
            goto L4e
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.C42729a0.b(r7)
            int r7 = r5.getCurrentItem()
            if (r7 != r6) goto L3d
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        L3d:
            com.avito.android.user_adverts.root_screen.adverts_host.host_view.m r7 = new com.avito.android.user_adverts.root_screen.adverts_host.host_view.m
            r2 = 0
            r7.<init>(r4, r5, r6, r2)
            r0.f313072s = r3
            r5 = 3000(0xbb8, double:1.482E-320)
            java.lang.Object r7 = kotlinx.coroutines.D1.c(r5, r7, r0)
            if (r7 != r1) goto L4e
            return r1
        L4e:
            kotlin.G0 r7 = (kotlin.G0) r7
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts.root_screen.adverts_host.host_view.j.c(androidx.viewpager2.widget.ViewPager2, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final Object e(ViewPager2 viewPager2, Continuation<? super G0> continuation) {
        if (viewPager2.getScrollState() == 0) {
            return G0.f406611a;
        }
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(1, IntrinsicsKt.intercepted(continuation));
        rVar.p();
        this.f313034p.f313046e = new l(rVar);
        rVar.r(new m());
        Object objO = rVar.o();
        if (objO == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objO == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objO : G0.f406611a;
    }

    public final HostViewState.a.C9588a f() {
        HostViewState hostViewState = this.f313037s;
        if (hostViewState instanceof HostViewState.a.C9588a) {
            return (HostViewState.a.C9588a) hostViewState;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x005d A[EDGE_INSN: B:56:0x005d->B:26:0x005d BREAK  A[LOOP:0: B:11:0x002b->B:60:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[LOOP:0: B:11:0x002b->B:60:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r7v6, types: [androidx.fragment.app.Fragment] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(@Y61.k com.avito.android.user_adverts.root_screen.adverts_host.host_view.b r20) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts.root_screen.adverts_host.host_view.j.g(com.avito.android.user_adverts.root_screen.adverts_host.host_view.b):void");
    }

    public final void h(PrintableText printableText, com.avito.android.component.toast.f fVar) {
        com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, this.f313022d, printableText, null, Collections.singletonList(new c.a.C3719a(this.f313021c.getString(R.string.user_adverts_pending_message_action_text), true, null, n.f313069l, 4, null)), null, fVar, 0, null, null, false, false, null, null, 4074);
    }

    public final void j(HostViewState.d dVar) {
        boolean z12 = dVar.f312981a;
        PublishFabView publishFabView = this.f313029k;
        boolean z13 = dVar.f312982b;
        if (z12) {
            if (publishFabView.getParent() instanceof CoordinatorLayout) {
                publishFabView.getF313793d().w(publishFabView);
            } else {
                publishFabView.setVisibility(0);
            }
            publishFabView.getF313793d().f313794l = z13;
            return;
        }
        if (publishFabView.getParent() instanceof CoordinatorLayout) {
            publishFabView.getF313793d().v(publishFabView);
        } else {
            publishFabView.setVisibility(8);
        }
        publishFabView.getF313793d().f313794l = z13;
    }
}
