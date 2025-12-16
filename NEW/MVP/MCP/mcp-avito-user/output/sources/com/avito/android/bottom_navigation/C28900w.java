package com.avito.android.bottom_navigation;

import Au.ViewOnClickListenerC13080b;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.avito.android.R;
import com.avito.android.bottom_navigation.J;
import com.avito.android.bottom_navigation.ui.GlobalBottomNavigationLayout;
import com.avito.android.bottom_navigation.ui.GlobalBottomNavigationTabView;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.remote.model.Avatar;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.Image;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* compiled from: GlobalBottomNavigationView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bottom_navigation/w;", "Lcom/avito/android/bottom_navigation/m;", "a", "_avito_bottom-navigation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.bottom_navigation.w, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28900w implements InterfaceC28891m {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final GlobalBottomNavigationLayout f107167b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f107168c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f107169d;

    /* renamed from: e, reason: collision with root package name */
    public final Resources f107170e;

    /* renamed from: g, reason: collision with root package name */
    public final int f107172g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public C28883e f107173h;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public b f107175j;

    /* renamed from: f, reason: collision with root package name */
    public boolean f107171f = true;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final C28890l f107174i = new C28890l();

    /* compiled from: GlobalBottomNavigationView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bottom_navigation/w$a;", "Ljava/lang/Runnable;", "<init>", "()V", "_avito_bottom-navigation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bottom_navigation.w$a */
    public static abstract class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public volatile boolean f107176b;

        public abstract void a();

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f107176b) {
                return;
            }
            a();
        }
    }

    /* compiled from: GlobalBottomNavigationView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/bottom_navigation/w$b", "Lcom/avito/android/bottom_navigation/w$a;", "_avito_bottom-navigation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bottom_navigation.w$b */
    public static final class b extends a {
        public b() {
        }

        @Override // com.avito.android.bottom_navigation.C28900w.a
        public final void a() {
            C28900w c28900w = C28900w.this;
            if (c28900w.f107171f) {
                c28900w.a(true);
            }
        }
    }

    /* compiled from: GlobalBottomNavigationView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/bottom_navigation/w$c", "Lcom/avito/android/image_loader/o;", "_avito_bottom-navigation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bottom_navigation.w$c */
    public static final class c extends com.avito.android.image_loader.o {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ GlobalBottomNavigationTabView f107179c;

        public c(GlobalBottomNavigationTabView globalBottomNavigationTabView) {
            this.f107179c = globalBottomNavigationTabView;
        }

        @Override // com.avito.android.image_loader.o, com.avito.android.image_loader.i
        public final void H(int i12, int i13) {
            GlobalBottomNavigationTabView globalBottomNavigationTabView = this.f107179c;
            C28900w.this.getClass();
            C28900w.b(globalBottomNavigationTabView, true);
        }
    }

    public C28900w(@Y61.k F f12, @Y61.k GlobalBottomNavigationLayout globalBottomNavigationLayout, @Y61.k ViewGroup viewGroup) throws Resources.NotFoundException {
        this.f107167b = globalBottomNavigationLayout;
        this.f107168c = viewGroup;
        this.f107169d = viewGroup.getContext();
        this.f107170e = viewGroup.getResources();
        Context context = viewGroup.getContext();
        Resources resources = viewGroup.getResources();
        resources.getDimensionPixelSize(R.dimen.bottom_nav_icon_size);
        C35835l0.d(R.attr.gray28, context);
        this.f107172g = resources.getDimensionPixelSize(R.dimen.bottom_nav_height);
        NavigationTabSetItem navigationTabSetItem = GlobalNavigationTab.f106937f;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(globalBottomNavigationLayout.getContext());
        for (NavigationTabSetItem navigationTabSetItem2 : f12.f106933b) {
            GlobalBottomNavigationTabView globalBottomNavigationTabView = (GlobalBottomNavigationTabView) layoutInflaterFrom.inflate(R.layout.global_bottom_navigation_item_view, (ViewGroup) globalBottomNavigationLayout, false);
            ((LinearLayout.LayoutParams) ((LinearLayoutCompat.b) globalBottomNavigationTabView.getLayoutParams())).weight = 1.0f;
            globalBottomNavigationLayout.addView(globalBottomNavigationTabView);
            globalBottomNavigationTabView.setOnClickListener(new ViewOnClickListenerC13080b(24, globalBottomNavigationLayout, navigationTabSetItem2));
            GW0.a hierarchy = globalBottomNavigationTabView.getIcon$_avito_bottom_navigation_impl().getHierarchy();
            int f106945b = navigationTabSetItem2.getF106945b();
            boolean zA2 = y.a(navigationTabSetItem2);
            Drawable drawable = globalBottomNavigationTabView.getContext().getDrawable(f106945b);
            if (zA2 && drawable != null) {
                drawable.setTint(C35835l0.d(R.attr.components_tabBar_default, globalBottomNavigationTabView.getContext()));
            }
            hierarchy.o(drawable, 0);
            linkedHashMap.put(navigationTabSetItem2, globalBottomNavigationTabView);
        }
        globalBottomNavigationLayout.f107095q = linkedHashMap;
        globalBottomNavigationLayout.n(navigationTabSetItem);
    }

    public static void b(GlobalBottomNavigationTabView globalBottomNavigationTabView, boolean z12) {
        SimpleDraweeView icon$_avito_bottom_navigation_impl = globalBottomNavigationTabView.getIcon$_avito_bottom_navigation_impl();
        D6.G(globalBottomNavigationTabView.getCurrentStroke$_avito_bottom_navigation_impl(), z12);
        int iB2 = y6.b(z12 ? 23 : 24);
        int iA2 = z12 ? y6.a(20.5f) : y6.b(20);
        icon$_avito_bottom_navigation_impl.getLayoutParams().width = iB2;
        icon$_avito_bottom_navigation_impl.getLayoutParams().height = iB2;
        D6.c(icon$_avito_bottom_navigation_impl, null, null, null, Integer.valueOf(iA2), 7);
    }

    public final void a(boolean z12) {
        D6.G(this.f107167b, z12);
        D6.c(this.f107168c, null, null, null, Integer.valueOf(z12 ? this.f107172g : 0), 7);
    }

    @Override // com.avito.android.bottom_navigation.InterfaceC28891m
    public final void e(@Y61.k NavigationTabSetItem navigationTabSetItem, @Y61.l String str, @Y61.l String str2, @Y61.l ButtonAction buttonAction, @Y61.l Boolean bool, int i12, @Y61.l Integer num, @Y61.l Integer num2) {
        C28890l c28890l = this.f107174i;
        c28890l.a();
        LinkedHashMap linkedHashMap = this.f107167b.f107095q;
        if (linkedHashMap == null) {
            linkedHashMap = null;
        }
        GlobalBottomNavigationTabView globalBottomNavigationTabView = (GlobalBottomNavigationTabView) linkedHashMap.get(navigationTabSetItem);
        if (globalBottomNavigationTabView == null) {
            return;
        }
        c28890l.b(this.f107169d, globalBottomNavigationTabView, num != null ? num.intValue() : this.f107170e.getDimensionPixelSize(R.dimen.bottom_nav_tab_tooltip_anchor_shift), str, str2, buttonAction, bool, i12, num2);
    }

    @Override // com.avito.android.bottom_navigation.z
    public final void i(boolean z12) {
        if (this.f107171f) {
            if (!z12) {
                b bVar = new b();
                this.f107175j = bVar;
                this.f107167b.postDelayed(bVar, 100L);
            } else {
                b bVar2 = this.f107175j;
                if (bVar2 != null) {
                    bVar2.f107176b = true;
                }
                a(false);
            }
        }
    }

    @Override // com.avito.android.bottom_navigation.InterfaceC28891m
    public final void k(@Y61.k NavigationTabSetItem navigationTabSetItem) {
        this.f107167b.n(navigationTabSetItem);
    }

    @Override // com.avito.android.bottom_navigation.InterfaceC28891m
    public final void l(@Y61.k Xj.c cVar) {
        this.f107167b.setOnTabClickListener(cVar);
        this.f107173h = (C28883e) cVar;
    }

    @Override // com.avito.android.bottom_navigation.InterfaceC28891m
    public final void o(@Y61.k NavigationTab navigationTab, int i12) {
        LinkedHashMap linkedHashMap = this.f107167b.f107095q;
        if (linkedHashMap == null) {
            linkedHashMap = null;
        }
        GlobalBottomNavigationTabView globalBottomNavigationTabView = (GlobalBottomNavigationTabView) linkedHashMap.get(navigationTab);
        if (globalBottomNavigationTabView != null) {
            if (i12 <= 0) {
                Badge badge = globalBottomNavigationTabView.f107098c;
                if (badge == null) {
                    badge = null;
                }
                badge.setVisibility(8);
                Badge badge2 = globalBottomNavigationTabView.f107098c;
                (badge2 != null ? badge2 : null).setState(new com.avito.android.lib.design.badge.f(null, null, false, 6, null));
                return;
            }
            if (navigationTab == NavigationTab.f106972h) {
                Badge badge3 = globalBottomNavigationTabView.f107098c;
                if (badge3 == null) {
                    badge3 = null;
                }
                badge3.setVisibility(4);
            } else {
                Badge badge4 = globalBottomNavigationTabView.f107098c;
                if (badge4 == null) {
                    badge4 = null;
                }
                badge4.setVisibility(0);
            }
            Badge badge5 = globalBottomNavigationTabView.f107098c;
            (badge5 != null ? badge5 : null).setState(new com.avito.android.lib.design.badge.f(i12 < 100 ? String.valueOf(i12) : "99+", null, false, 6, null));
        }
    }

    @Override // com.avito.android.bottom_navigation.InterfaceC28891m
    public final void onDestroyView() {
        this.f107174i.a();
    }

    @Override // com.avito.android.bottom_navigation.InterfaceC28891m
    public final void r(@Y61.k J j12) {
        Image image;
        NavigationTab navigationTab = NavigationTab.f106974j;
        LinkedHashMap linkedHashMap = this.f107167b.f107095q;
        com.avito.android.image_loader.a aVarB = null;
        if (linkedHashMap == null) {
            linkedHashMap = null;
        }
        GlobalBottomNavigationTabView globalBottomNavigationTabView = (GlobalBottomNavigationTabView) linkedHashMap.get(navigationTab);
        if (globalBottomNavigationTabView == null) {
            return;
        }
        SimpleDraweeView icon$_avito_bottom_navigation_impl = globalBottomNavigationTabView.getIcon$_avito_bottom_navigation_impl();
        GW0.a hierarchy = icon$_avito_bottom_navigation_impl.getHierarchy();
        Context context = this.f107169d;
        Resources.Theme theme = context.getTheme();
        ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.i.f44673a;
        Resources resources = this.f107170e;
        hierarchy.o(resources.getDrawable(R.drawable.bg_bn_tab_profile, theme), 3);
        hierarchy.o(resources.getDrawable(R.drawable.bg_bn_tab_profile, context.getTheme()), 5);
        hierarchy.o(resources.getDrawable(R.drawable.bg_bn_tab_profile, context.getTheme()), 1);
        b(globalBottomNavigationTabView, false);
        if (j12 instanceof J.a) {
            icon$_avito_bottom_navigation_impl.setImageResource(R.drawable.bg_bn_tab_profile);
            return;
        }
        if (j12 instanceof J.b) {
            Avatar avatar = ((J.b) j12).f106955b;
            if (avatar != null && (image = avatar.getImage()) != null) {
                aVarB = com.avito.android.image_loader.b.b(image);
            }
            C35949t5.b(icon$_avito_bottom_navigation_impl, aVarB, new c(globalBottomNavigationTabView));
            globalBottomNavigationTabView.setOnLongClickListener(new ViewOnLongClickListenerC28892n(this, 1));
        }
    }

    @Override // com.avito.android.bottom_navigation.InterfaceC28891m
    public final void setVisible(boolean z12) {
        this.f107171f = z12;
        a(z12);
    }
}
