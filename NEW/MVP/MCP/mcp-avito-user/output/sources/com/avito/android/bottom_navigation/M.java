package com.avito.android.bottom_navigation;

import Au.ViewOnClickListenerC13080b;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.avito.android.R;
import com.avito.android.bottom_navigation.J;
import com.avito.android.bottom_navigation.ui.BottomNavigationTabView;
import com.avito.android.bottom_navigation.ui.RedesignBottomNavigationLayout;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.remote.model.Avatar;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.Image;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RedesignBottomNavigationView.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bottom_navigation/M;", "Lcom/avito/android/bottom_navigation/m;", "a", "_avito_bottom-navigation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class M implements InterfaceC28891m {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final RedesignBottomNavigationLayout f106956b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f106957c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f106958d;

    /* renamed from: e, reason: collision with root package name */
    public final Resources f106959e;

    /* renamed from: g, reason: collision with root package name */
    public final int f106961g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public C28883e f106962h;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public b f106964j;

    /* renamed from: f, reason: collision with root package name */
    public boolean f106960f = true;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final C28890l f106963i = new C28890l();

    /* compiled from: RedesignBottomNavigationView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bottom_navigation/M$a;", "Ljava/lang/Runnable;", "<init>", "()V", "_avito_bottom-navigation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public volatile boolean f106965b;

        public abstract void a();

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f106965b) {
                return;
            }
            a();
        }
    }

    /* compiled from: RedesignBottomNavigationView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/bottom_navigation/M$b", "Lcom/avito/android/bottom_navigation/M$a;", "_avito_bottom-navigation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends a {
        public b() {
        }

        @Override // com.avito.android.bottom_navigation.M.a
        public final void a() {
            M m12 = M.this;
            if (m12.f106960f) {
                m12.a(true);
            }
        }
    }

    /* compiled from: RedesignBottomNavigationView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/bottom_navigation/M$c", "Lcom/avito/android/image_loader/o;", "_avito_bottom-navigation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends com.avito.android.image_loader.o {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ BottomNavigationTabView f106968c;

        public c(BottomNavigationTabView bottomNavigationTabView) {
            this.f106968c = bottomNavigationTabView;
        }

        @Override // com.avito.android.image_loader.o, com.avito.android.image_loader.i
        public final void H(int i12, int i13) {
            BottomNavigationTabView bottomNavigationTabView = this.f106968c;
            M.this.getClass();
            M.b(bottomNavigationTabView, true);
        }
    }

    public M(@Y61.k F f12, @Y61.k RedesignBottomNavigationLayout redesignBottomNavigationLayout, @Y61.k ViewGroup viewGroup) throws Resources.NotFoundException {
        this.f106956b = redesignBottomNavigationLayout;
        this.f106957c = viewGroup;
        this.f106958d = viewGroup.getContext();
        this.f106959e = viewGroup.getResources();
        Context context = viewGroup.getContext();
        Resources resources = viewGroup.getResources();
        resources.getDimensionPixelSize(R.dimen.bottom_nav_icon_size);
        C35835l0.d(R.attr.gray28, context);
        this.f106961g = resources.getDimensionPixelSize(R.dimen.bottom_nav_height);
        NavigationTabSetItem navigationTabSetItem = NavigationTab.f106970f;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(redesignBottomNavigationLayout.getContext());
        for (NavigationTabSetItem navigationTabSetItem2 : f12.f106933b) {
            BottomNavigationTabView bottomNavigationTabView = (BottomNavigationTabView) layoutInflaterFrom.inflate(R.layout.bottom_navigation_item_view, (ViewGroup) redesignBottomNavigationLayout, false);
            ((LinearLayout.LayoutParams) ((LinearLayoutCompat.b) bottomNavigationTabView.getLayoutParams())).weight = 1.0f;
            redesignBottomNavigationLayout.addView(bottomNavigationTabView);
            bottomNavigationTabView.setOnClickListener(new ViewOnClickListenerC13080b(25, redesignBottomNavigationLayout, navigationTabSetItem2));
            bottomNavigationTabView.a(navigationTabSetItem2);
            TextView textView = bottomNavigationTabView.f107090b;
            (textView == null ? null : textView).setVisibility(8);
            D6.c(bottomNavigationTabView.getIcon$_avito_bottom_navigation_impl(), null, null, null, Integer.valueOf(y6.b(0)), 7);
            SimpleDraweeView icon$_avito_bottom_navigation_impl = bottomNavigationTabView.getIcon$_avito_bottom_navigation_impl();
            ViewGroup.LayoutParams layoutParams = icon$_avito_bottom_navigation_impl.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.gravity = 17;
            icon$_avito_bottom_navigation_impl.setLayoutParams(layoutParams2);
            D6.c(bottomNavigationTabView.getCurrentStroke$_avito_bottom_navigation_impl(), null, null, null, Integer.valueOf(y6.b(0)), 7);
            ImageView currentStroke$_avito_bottom_navigation_impl = bottomNavigationTabView.getCurrentStroke$_avito_bottom_navigation_impl();
            ViewGroup.LayoutParams layoutParams3 = currentStroke$_avito_bottom_navigation_impl.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
            layoutParams4.gravity = 17;
            currentStroke$_avito_bottom_navigation_impl.setLayoutParams(layoutParams4);
            TextView textView2 = bottomNavigationTabView.f107092d;
            textView2 = textView2 == null ? null : textView2;
            ViewGroup.LayoutParams layoutParams5 = textView2.getLayoutParams();
            if (layoutParams5 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) layoutParams5;
            layoutParams6.gravity = 17;
            textView2.setLayoutParams(layoutParams6);
            TextView textView3 = bottomNavigationTabView.f107092d;
            D6.c(textView3 == null ? null : textView3, null, null, null, Integer.valueOf(y6.b(9)), 7);
            linkedHashMap.put(navigationTabSetItem2, bottomNavigationTabView);
        }
        redesignBottomNavigationLayout.f107106q = linkedHashMap;
        redesignBottomNavigationLayout.n(navigationTabSetItem);
    }

    public static void b(BottomNavigationTabView bottomNavigationTabView, boolean z12) {
        SimpleDraweeView icon$_avito_bottom_navigation_impl = bottomNavigationTabView.getIcon$_avito_bottom_navigation_impl();
        D6.G(bottomNavigationTabView.getCurrentStroke$_avito_bottom_navigation_impl(), z12);
        int iB2 = y6.b(z12 ? 23 : 24);
        icon$_avito_bottom_navigation_impl.getLayoutParams().width = iB2;
        icon$_avito_bottom_navigation_impl.getLayoutParams().height = iB2;
    }

    public final void a(boolean z12) {
        D6.G(this.f106956b, z12);
        D6.c(this.f106957c, null, null, null, Integer.valueOf(z12 ? this.f106961g : 0), 7);
    }

    @Override // com.avito.android.bottom_navigation.InterfaceC28891m
    public final void e(@Y61.k NavigationTabSetItem navigationTabSetItem, @Y61.l String str, @Y61.l String str2, @Y61.l ButtonAction buttonAction, @Y61.l Boolean bool, int i12, @Y61.l Integer num, @Y61.l Integer num2) {
        C28890l c28890l = this.f106963i;
        c28890l.a();
        LinkedHashMap linkedHashMap = this.f106956b.f107106q;
        if (linkedHashMap == null) {
            linkedHashMap = null;
        }
        BottomNavigationTabView bottomNavigationTabView = (BottomNavigationTabView) linkedHashMap.get(navigationTabSetItem);
        if (bottomNavigationTabView == null) {
            return;
        }
        c28890l.b(this.f106958d, bottomNavigationTabView, num != null ? y6.b(num.intValue()) : this.f106959e.getDimensionPixelSize(R.dimen.bottom_nav_tab_tooltip_anchor_shift), str, str2, buttonAction, bool, i12, num2);
    }

    @Override // com.avito.android.bottom_navigation.z
    public final void i(boolean z12) {
        if (this.f106960f) {
            if (!z12) {
                b bVar = new b();
                this.f106964j = bVar;
                this.f106956b.postDelayed(bVar, 100L);
            } else {
                b bVar2 = this.f106964j;
                if (bVar2 != null) {
                    bVar2.f106965b = true;
                }
                a(false);
            }
        }
    }

    @Override // com.avito.android.bottom_navigation.InterfaceC28891m
    public final void k(@Y61.k NavigationTabSetItem navigationTabSetItem) {
        this.f106956b.n(navigationTabSetItem);
    }

    @Override // com.avito.android.bottom_navigation.InterfaceC28891m
    public final void l(@Y61.k Xj.c cVar) {
        this.f106956b.setOnTabClickListener(cVar);
        this.f106962h = (C28883e) cVar;
    }

    @Override // com.avito.android.bottom_navigation.InterfaceC28891m
    public final void o(@Y61.k NavigationTab navigationTab, int i12) {
        LinkedHashMap linkedHashMap = this.f106956b.f107106q;
        if (linkedHashMap == null) {
            linkedHashMap = null;
        }
        BottomNavigationTabView bottomNavigationTabView = (BottomNavigationTabView) linkedHashMap.get(navigationTab);
        if (bottomNavigationTabView != null) {
            bottomNavigationTabView.b(navigationTab, i12);
        }
    }

    @Override // com.avito.android.bottom_navigation.InterfaceC28891m
    public final void onDestroyView() {
        this.f106963i.a();
    }

    @Override // com.avito.android.bottom_navigation.InterfaceC28891m
    public final void r(@Y61.k J j12) {
        Image image;
        NavigationTab navigationTab = NavigationTab.f106974j;
        LinkedHashMap linkedHashMap = this.f106956b.f107106q;
        com.avito.android.image_loader.a aVarB = null;
        if (linkedHashMap == null) {
            linkedHashMap = null;
        }
        BottomNavigationTabView bottomNavigationTabView = (BottomNavigationTabView) linkedHashMap.get(navigationTab);
        if (bottomNavigationTabView == null) {
            return;
        }
        SimpleDraweeView icon$_avito_bottom_navigation_impl = bottomNavigationTabView.getIcon$_avito_bottom_navigation_impl();
        GW0.a hierarchy = icon$_avito_bottom_navigation_impl.getHierarchy();
        Context context = this.f106958d;
        Resources.Theme theme = context.getTheme();
        ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.i.f44673a;
        Resources resources = this.f106959e;
        hierarchy.o(resources.getDrawable(R.drawable.bg_bn_tab_profile, theme), 3);
        hierarchy.o(resources.getDrawable(R.drawable.bg_bn_tab_profile, context.getTheme()), 5);
        hierarchy.o(resources.getDrawable(R.drawable.bg_bn_tab_profile, context.getTheme()), 1);
        b(bottomNavigationTabView, false);
        TextView pro$_avito_bottom_navigation_impl = bottomNavigationTabView.getPro$_avito_bottom_navigation_impl();
        ViewGroup.LayoutParams layoutParams = pro$_avito_bottom_navigation_impl.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        boolean z12 = j12 instanceof J.a;
        layoutParams.width = z12 ? y6.b(20) : -2;
        pro$_avito_bottom_navigation_impl.setLayoutParams(layoutParams);
        D6.G(bottomNavigationTabView.getPro$_avito_bottom_navigation_impl(), j12.getF106954a());
        if (z12) {
            icon$_avito_bottom_navigation_impl.setImageResource(R.drawable.bg_bn_tab_profile);
            return;
        }
        if (j12 instanceof J.b) {
            Avatar avatar = ((J.b) j12).f106955b;
            if (avatar != null && (image = avatar.getImage()) != null) {
                aVarB = com.avito.android.image_loader.b.b(image);
            }
            C35949t5.b(icon$_avito_bottom_navigation_impl, aVarB, new c(bottomNavigationTabView));
            bottomNavigationTabView.setOnLongClickListener(new ViewOnLongClickListenerC28892n(this, 2));
        }
    }

    @Override // com.avito.android.bottom_navigation.InterfaceC28891m
    public final void setVisible(boolean z12) {
        this.f106960f = z12;
        a(z12);
    }
}
