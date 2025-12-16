package com.avito.android.bottom_navigation;

import Au.ViewOnClickListenerC13080b;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.avito.android.R;
import com.avito.android.bottom_navigation.J;
import com.avito.android.bottom_navigation.ui.BottomNavigationLayout;
import com.avito.android.bottom_navigation.ui.BottomNavigationTabView;
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

/* compiled from: BottomNavigationView.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bottom_navigation/o;", "Lcom/avito/android/bottom_navigation/m;", "a", "_avito_bottom-navigation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.bottom_navigation.o, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28893o implements InterfaceC28891m {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final BottomNavigationLayout f107037b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f107038c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f107039d;

    /* renamed from: e, reason: collision with root package name */
    public final Resources f107040e;

    /* renamed from: g, reason: collision with root package name */
    public final int f107042g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public C28883e f107043h;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public b f107045j;

    /* renamed from: f, reason: collision with root package name */
    public boolean f107041f = true;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final C28890l f107044i = new C28890l();

    /* compiled from: BottomNavigationView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bottom_navigation/o$a;", "Ljava/lang/Runnable;", "<init>", "()V", "_avito_bottom-navigation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bottom_navigation.o$a */
    public static abstract class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public volatile boolean f107046b;

        public abstract void a();

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f107046b) {
                return;
            }
            a();
        }
    }

    /* compiled from: BottomNavigationView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/bottom_navigation/o$b", "Lcom/avito/android/bottom_navigation/o$a;", "_avito_bottom-navigation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bottom_navigation.o$b */
    public static final class b extends a {
        public b() {
        }

        @Override // com.avito.android.bottom_navigation.C28893o.a
        public final void a() {
            C28893o c28893o = C28893o.this;
            if (c28893o.f107041f) {
                c28893o.a(true);
            }
        }
    }

    /* compiled from: BottomNavigationView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/bottom_navigation/o$c", "Lcom/avito/android/image_loader/o;", "_avito_bottom-navigation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bottom_navigation.o$c */
    public static final class c extends com.avito.android.image_loader.o {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ BottomNavigationTabView f107049c;

        public c(BottomNavigationTabView bottomNavigationTabView) {
            this.f107049c = bottomNavigationTabView;
        }

        @Override // com.avito.android.image_loader.o, com.avito.android.image_loader.i
        public final void H(int i12, int i13) {
            BottomNavigationTabView bottomNavigationTabView = this.f107049c;
            C28893o.this.getClass();
            C28893o.b(bottomNavigationTabView, true);
        }
    }

    public C28893o(@Y61.k F f12, @Y61.k BottomNavigationLayout bottomNavigationLayout, @Y61.k ViewGroup viewGroup) throws Resources.NotFoundException {
        this.f107037b = bottomNavigationLayout;
        this.f107038c = viewGroup;
        this.f107039d = viewGroup.getContext();
        this.f107040e = viewGroup.getResources();
        Context context = viewGroup.getContext();
        Resources resources = viewGroup.getResources();
        resources.getDimensionPixelSize(R.dimen.bottom_nav_icon_size);
        C35835l0.d(R.attr.gray28, context);
        this.f107042g = resources.getDimensionPixelSize(R.dimen.bottom_nav_height);
        NavigationTabSetItem navigationTabSetItem = NavigationTab.f106970f;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(bottomNavigationLayout.getContext());
        for (NavigationTabSetItem navigationTabSetItem2 : f12.f106933b) {
            BottomNavigationTabView bottomNavigationTabView = (BottomNavigationTabView) layoutInflaterFrom.inflate(R.layout.bottom_navigation_item_view, (ViewGroup) bottomNavigationLayout, false);
            ((LinearLayout.LayoutParams) ((LinearLayoutCompat.b) bottomNavigationTabView.getLayoutParams())).weight = 1.0f;
            bottomNavigationLayout.addView(bottomNavigationTabView);
            bottomNavigationTabView.setOnClickListener(new ViewOnClickListenerC13080b(23, bottomNavigationLayout, navigationTabSetItem2));
            bottomNavigationTabView.a(navigationTabSetItem2);
            linkedHashMap.put(navigationTabSetItem2, bottomNavigationTabView);
        }
        bottomNavigationLayout.f107088q = linkedHashMap;
        bottomNavigationLayout.n(navigationTabSetItem);
    }

    public static void b(BottomNavigationTabView bottomNavigationTabView, boolean z12) {
        SimpleDraweeView icon$_avito_bottom_navigation_impl = bottomNavigationTabView.getIcon$_avito_bottom_navigation_impl();
        D6.G(bottomNavigationTabView.getCurrentStroke$_avito_bottom_navigation_impl(), z12);
        int iB2 = y6.b(z12 ? 23 : 24);
        int iA2 = z12 ? y6.a(20.5f) : y6.b(20);
        icon$_avito_bottom_navigation_impl.getLayoutParams().width = iB2;
        icon$_avito_bottom_navigation_impl.getLayoutParams().height = iB2;
        D6.c(icon$_avito_bottom_navigation_impl, null, null, null, Integer.valueOf(iA2), 7);
    }

    public final void a(boolean z12) {
        D6.G(this.f107037b, z12);
        D6.c(this.f107038c, null, null, null, Integer.valueOf(z12 ? this.f107042g : 0), 7);
    }

    @Override // com.avito.android.bottom_navigation.InterfaceC28891m
    public final void e(@Y61.k NavigationTabSetItem navigationTabSetItem, @Y61.l String str, @Y61.l String str2, @Y61.l ButtonAction buttonAction, @Y61.l Boolean bool, int i12, @Y61.l Integer num, @Y61.l Integer num2) {
        C28890l c28890l = this.f107044i;
        c28890l.a();
        LinkedHashMap linkedHashMap = this.f107037b.f107088q;
        if (linkedHashMap == null) {
            linkedHashMap = null;
        }
        BottomNavigationTabView bottomNavigationTabView = (BottomNavigationTabView) linkedHashMap.get(navigationTabSetItem);
        if (bottomNavigationTabView == null) {
            return;
        }
        c28890l.b(this.f107039d, bottomNavigationTabView, num != null ? y6.b(num.intValue()) : this.f107040e.getDimensionPixelSize(R.dimen.bottom_nav_tab_tooltip_anchor_shift), str, str2, buttonAction, bool, i12, num2);
    }

    @Override // com.avito.android.bottom_navigation.z
    public final void i(boolean z12) {
        if (this.f107041f) {
            if (!z12) {
                b bVar = new b();
                this.f107045j = bVar;
                this.f107037b.postDelayed(bVar, 100L);
            } else {
                b bVar2 = this.f107045j;
                if (bVar2 != null) {
                    bVar2.f107046b = true;
                }
                a(false);
            }
        }
    }

    @Override // com.avito.android.bottom_navigation.InterfaceC28891m
    public final void k(@Y61.k NavigationTabSetItem navigationTabSetItem) {
        this.f107037b.n(navigationTabSetItem);
    }

    @Override // com.avito.android.bottom_navigation.InterfaceC28891m
    public final void l(@Y61.k Xj.c cVar) {
        this.f107037b.setOnTabClickListener(cVar);
        this.f107043h = (C28883e) cVar;
    }

    @Override // com.avito.android.bottom_navigation.InterfaceC28891m
    public final void o(@Y61.k NavigationTab navigationTab, int i12) {
        LinkedHashMap linkedHashMap = this.f107037b.f107088q;
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
        this.f107044i.a();
    }

    @Override // com.avito.android.bottom_navigation.InterfaceC28891m
    public final void r(@Y61.k J j12) {
        Image image;
        NavigationTab navigationTab = NavigationTab.f106974j;
        LinkedHashMap linkedHashMap = this.f107037b.f107088q;
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
        Context context = this.f107039d;
        Resources.Theme theme = context.getTheme();
        ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.i.f44673a;
        Resources resources = this.f107040e;
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
            bottomNavigationTabView.setOnLongClickListener(new ViewOnLongClickListenerC28892n(this, 0));
        }
    }

    @Override // com.avito.android.bottom_navigation.InterfaceC28891m
    public final void setVisible(boolean z12) {
        this.f107041f = z12;
        a(z12);
    }
}
