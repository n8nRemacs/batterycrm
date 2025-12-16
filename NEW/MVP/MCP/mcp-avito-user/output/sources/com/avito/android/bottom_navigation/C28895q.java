package com.avito.android.bottom_navigation;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import androidx.core.view.C22829k0;
import androidx.core.view.C22833m0;
import com.avito.android.bottom_navigation.J;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.lib.design.tab_bar.TabBarLayout;
import com.avito.android.lib.design.tab_bar.b;
import com.avito.android.remote.model.Avatar;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.Image;
import com.avito.android.util.y6;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: BottomNavigationViewRe23.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bottom_navigation/q;", "Lcom/avito/android/bottom_navigation/m;", "a", "_avito_bottom-navigation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.bottom_navigation.q, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28895q implements InterfaceC28891m {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f107050f = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TabBarLayout f107051b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f107052c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C28890l f107053d = new C28890l();

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public A0 f107054e;

    /* compiled from: BottomNavigationViewRe23.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/avito/android/bottom_navigation/q$a;", "", "<init>", "()V", "", "AVATAR_IMAGE_SIZE_DP", "I", "BADGE_MAX_VALUE", "", "BADGE_MAX_VALUE_TEXT", "Ljava/lang/String;", "TOOLTIP_ANCHOR_OFFSET_DP", "_avito_bottom-navigation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bottom_navigation.q$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Views.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "run", "()V", "com/avito/android/util/E6", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.bottom_navigation.q$b */
    public static final class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            TabBarLayout tabBarLayout = C28895q.this.f107051b;
            if (tabBarLayout.isPresent) {
                tabBarLayout.setVisibility(0);
            }
        }
    }

    /* compiled from: BottomNavigationViewRe23.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/bottom_navigation/q$c", "Lcom/avito/android/lib/design/tab_bar/TabBarLayout$b;", "_avito_bottom-navigation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bottom_navigation.q$c */
    public static final class c implements TabBarLayout.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C28883e f107056a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C28895q f107057b;

        public c(C28883e c28883e, C28895q c28895q) {
            this.f107056a = c28883e;
            this.f107057b = c28895q;
        }

        @Override // com.avito.android.lib.design.tab_bar.TabBarLayout.b
        public final void a(@Y61.k com.avito.android.lib.design.tab_bar.b bVar) {
            this.f107056a.b(C28895q.a(this.f107057b, bVar));
        }

        @Override // com.avito.android.lib.design.tab_bar.TabBarLayout.b
        public final void b(@Y61.k com.avito.android.lib.design.tab_bar.b bVar) {
            this.f107056a.a(C28895q.a(this.f107057b, bVar));
        }
    }

    static {
        new a(null);
    }

    public C28895q(@Y61.k F f12, @Y61.k TabBarLayout tabBarLayout) {
        this.f107051b = tabBarLayout;
        this.f107052c = tabBarLayout.getContext();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<NavigationTabSetItem> it = f12.f106933b.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(b(it.next()));
        }
        tabBarLayout.setTabs(linkedHashSet);
    }

    public static final NavigationTab a(C28895q c28895q, com.avito.android.lib.design.tab_bar.b bVar) {
        c28895q.getClass();
        if (kotlin.jvm.internal.L.f(bVar, b.e.f180697c)) {
            return NavigationTab.f106970f;
        }
        if (kotlin.jvm.internal.L.f(bVar, b.d.f180696c)) {
            return NavigationTab.f106971g;
        }
        if (kotlin.jvm.internal.L.f(bVar, b.a.f180695c)) {
            return NavigationTab.f106972h;
        }
        if (kotlin.jvm.internal.L.f(bVar, b.f.f180698c)) {
            return NavigationTab.f106973i;
        }
        if (bVar instanceof b.g) {
            return NavigationTab.f106974j;
        }
        throw new IllegalStateException(("Unsupported TabBarItem: " + bVar).toString());
    }

    public static com.avito.android.lib.design.tab_bar.b b(NavigationTabSetItem navigationTabSetItem) {
        if (navigationTabSetItem == NavigationTab.f106970f) {
            return b.e.f180697c;
        }
        if (navigationTabSetItem == NavigationTab.f106971g) {
            return b.d.f180696c;
        }
        if (navigationTabSetItem == NavigationTab.f106972h) {
            return b.a.f180695c;
        }
        if (navigationTabSetItem == NavigationTab.f106973i) {
            return b.f.f180698c;
        }
        if (navigationTabSetItem == NavigationTab.f106974j) {
            return new b.g(b.g.a.C5307a.f180700a);
        }
        throw new IllegalStateException(("Unsupported NavigationTabSetItem: " + navigationTabSetItem).toString());
    }

    @Override // com.avito.android.bottom_navigation.InterfaceC28891m
    public final void e(@Y61.k NavigationTabSetItem navigationTabSetItem, @Y61.l String str, @Y61.l String str2, @Y61.l ButtonAction buttonAction, @Y61.l Boolean bool, int i12, @Y61.l Integer num, @Y61.l Integer num2) {
        AppCompatImageView icon;
        C28890l c28890l = this.f107053d;
        c28890l.a();
        com.avito.android.lib.design.tab_bar.b bVarB = b(navigationTabSetItem);
        TabBarLayout tabBarLayout = this.f107051b;
        com.avito.android.lib.design.tab_bar.a aVarA = tabBarLayout.a(bVarB);
        if (aVarA == null || (icon = aVarA.getIcon()) == null) {
            return;
        }
        c28890l.b(this.f107052c, icon, num != null ? y6.b(num.intValue()) : y6.b(6) + tabBarLayout.getPaddingTop(), str, str2, buttonAction, bool, i12, num2);
    }

    @Override // com.avito.android.bottom_navigation.z
    public final void i(boolean z12) {
        TabBarLayout tabBarLayout = this.f107051b;
        if (tabBarLayout.isPresent) {
            if (z12) {
                tabBarLayout.setVisibility(8);
            } else {
                tabBarLayout.postDelayed(new b(), 100L);
            }
        }
    }

    @Override // com.avito.android.bottom_navigation.InterfaceC28891m
    public final void k(@Y61.k NavigationTabSetItem navigationTabSetItem) {
        this.f107051b.setSelectedTab(b(navigationTabSetItem));
    }

    @Override // com.avito.android.bottom_navigation.InterfaceC28891m
    public final void l(@Y61.k Xj.c cVar) {
        this.f107051b.setOnTabClickListener(new c((C28883e) cVar, this));
    }

    @Override // com.avito.android.bottom_navigation.InterfaceC28891m
    public final void o(@Y61.k NavigationTab navigationTab, int i12) {
        Badge notification;
        com.avito.android.lib.design.tab_bar.a aVarA = this.f107051b.a(b(navigationTab));
        if (aVarA == null || (notification = aVarA.getNotification()) == null) {
            return;
        }
        notification.setTitleText(i12 <= 99 ? String.valueOf(i12) : "99+");
        notification.setVisibility(i12 > 0 ? 0 : 8);
    }

    @Override // com.avito.android.bottom_navigation.InterfaceC28891m
    public final void onDestroyView() {
        A0 a02 = this.f107054e;
        if (a02 != null) {
            a02.b();
        }
        this.f107053d.a();
    }

    @Override // com.avito.android.bottom_navigation.InterfaceC28891m
    public final void r(@Y61.k J j12) {
        Object next;
        Avatar avatar;
        Image image;
        Iterator<View> it = new C22829k0(this.f107051b).iterator();
        while (true) {
            C22833m0 c22833m0 = (C22833m0) it;
            if (!c22833m0.hasNext()) {
                next = null;
                break;
            }
            next = c22833m0.next();
            KeyEvent.Callback callback = (View) next;
            if ((callback instanceof com.avito.android.lib.design.tab_bar.a) && (((com.avito.android.lib.design.tab_bar.a) callback).getTabBarItem() instanceof b.g)) {
                break;
            }
        }
        com.avito.android.lib.design.tab_bar.a aVar = next instanceof com.avito.android.lib.design.tab_bar.a ? (com.avito.android.lib.design.tab_bar.a) next : null;
        if (aVar != null) {
            aVar.setTabBarItem(new b.g(b.g.a.C5307a.f180700a));
            J.b bVar = j12 instanceof J.b ? (J.b) j12 : null;
            if (bVar == null || (avatar = bVar.f106955b) == null || (image = avatar.getImage()) == null) {
                return;
            }
            com.avito.android.image_loader.a aVarB = com.avito.android.image_loader.b.b(image);
            ImageRequest.a aVar2 = new ImageRequest.a(new DM.a(aVar.getIcon()));
            aVar2.d(aVarB);
            int iB2 = y6.b(26);
            aVar2.f169502t = new ImageRequest.c(iB2, iB2);
            aVar2.f169503u = true;
            aVar2.f169490h = new d(aVar, aVar);
            aVar2.c();
        }
    }

    @Override // com.avito.android.bottom_navigation.InterfaceC28891m
    public final void setVisible(boolean z12) {
        float f12;
        TabBarLayout tabBarLayout = this.f107051b;
        tabBarLayout.setPresent(z12);
        A0 a02 = this.f107054e;
        if (a02 != null) {
            a02.b();
        }
        A0 a0A = C22823h0.a(tabBarLayout);
        if (z12) {
            f12 = 0.0f;
        } else {
            int height = tabBarLayout.getHeight();
            ViewGroup.LayoutParams layoutParams = tabBarLayout.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            f12 = height + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0);
        }
        a0A.g(f12);
        a0A.c(250L);
        com.avito.android.app.coldstart.d dVar = new com.avito.android.app.coldstart.d(this, 9);
        View view = a0A.f44903a.get();
        if (view != null) {
            view.animate().withStartAction(dVar);
        }
        a0A.h(new D.b(4, this, z12));
        a0A.d(new AccelerateDecelerateInterpolator());
        a0A.f();
        this.f107054e = a0A;
    }

    /* compiled from: ImageRequests.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/util/h2", "Lcom/avito/android/image_loader/i;", "_common_image-loader_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bottom_navigation.q$d */
    public static final class d implements com.avito.android.image_loader.i {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.lib.design.tab_bar.a f107058b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.lib.design.tab_bar.a f107059c;

        public d(com.avito.android.lib.design.tab_bar.a aVar, com.avito.android.lib.design.tab_bar.a aVar2) {
            this.f107058b = aVar;
            this.f107059c = aVar2;
        }

        @Override // com.avito.android.image_loader.i
        public final void H(int i12, int i13) {
            this.f107058b.setTabBarItem(new b.g(b.g.a.C5308b.f180701a));
        }

        @Override // com.avito.android.image_loader.i
        public final void b2(@Y61.l Throwable th2) {
            this.f107059c.setTabBarItem(new b.g(b.g.a.C5307a.f180700a));
        }

        @Override // com.avito.android.image_loader.i
        public final void S2() {
        }
    }
}
