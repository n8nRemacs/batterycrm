package com.avito.android.favorites;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.l;
import androidx.appcompat.widget.ActionMenuView;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.component.toast.c;
import com.avito.android.component.toast.f;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.InterfaceC31171n;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.lib.design.list_item.ListItem;
import com.avito.android.lib.design.tab_bar.TabBarLayout;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.progress_info_toast_bar.ProgressInfoToastBar;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35976x4;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import com.google.android.material.appbar.AppBarLayout;
import com.jakewharton.rxbinding4.view.C37722i;
import java.util.Arrays;
import java.util.Collections;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: FavoritesView.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/favorites/x1;", "Lcom/avito/android/favorites/h1;", "Lcom/avito/android/component/toast/util/g;", "_avito_favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class x1 implements InterfaceC30665h1, com.avito.android.component.toast.util.g {

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f157595A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f157596B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.core.z<kotlin.G0> f157597C;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f157598b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final G1 f157599c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30683q0 f157600d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f157601e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.a f157602f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.beduin_v2.repository.cart_total_quantity.L f157603g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.item_visibility_tracker.b f157604h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final ProgressInfoToastBar.a f157605i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f157606j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final Context f157607k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final SwipeRefreshLayout f157608l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f157609m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final View f157610n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.progress_overlay.l f157611o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final Chips f157612p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final ListItem f157613q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f157614r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final ComposeView f157615s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final AppBarLayout f157616t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<CategoryChipable> f157617u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.l
    public ProgressInfoToastBar f157618v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.tooltip.k f157619w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final ComposeView f157620x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final ComposeView f157621y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public final ComposeView f157622z;

    /* compiled from: FavoritesView.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/Menu;", ChannelContext.MENU, "Landroid/view/MenuInflater;", "inflater", "Lkotlin/G0;", "invoke", "(Landroid/view/Menu;Landroid/view/MenuInflater;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<Menu, MenuInflater, kotlin.G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ boolean f157624m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z12) {
            super(2);
            this.f157624m = z12;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(Menu menu, MenuInflater menuInflater) {
            Menu menu2 = menu;
            MenuInflater menuInflater2 = menuInflater;
            menu2.clear();
            final x1 x1Var = x1.this;
            menuInflater2.inflate(x1Var.f157606j ? R.menu.favorites_list_global : R.menu.favorites_list, menu2);
            int size = menu2.size();
            for (int i12 = 0; i12 < size; i12++) {
                MenuItem item = menu2.getItem(i12);
                if (item.getItemId() == R.id.menu_cart_item) {
                    com.avito.android.lib.beduin_v2.repository.cart_total_quantity.L l12 = x1Var.f157603g;
                    InterfaceC31171n interfaceC31171n = (InterfaceC31171n) l12.f176456a.f176464O.getValue();
                    if (interfaceC31171n != null) {
                        com.avito.android.lib.beduin_v2.repository.cart_total_quantity.utils.d.b(l12, item, interfaceC31171n);
                    } else {
                        item.setVisible(l12.d());
                    }
                    x1Var.f157600d.X1();
                } else {
                    item.setVisible(this.f157624m);
                }
            }
            MenuItem menuItemFindItem = menu2.findItem(R.id.menu_remove_sheet);
            View actionView = menuItemFindItem != null ? menuItemFindItem.getActionView() : null;
            if (actionView != null) {
                actionView.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.favorites.w1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        com.avito.android.lib.util.g.a((com.avito.android.lib.design.bottom_sheet.d) x1Var.f157595A.getValue());
                    }
                });
            }
            return kotlin.G0.f406611a;
        }
    }

    public x1(@Y61.k ViewGroup viewGroup, @Y61.k G1 g12, @Y61.k InterfaceC30683q0 interfaceC30683q0, @Y61.k com.avito.konveyor.adapter.a aVar, @Y61.k com.avito.konveyor.a aVar2, @Y61.k com.avito.android.lib.beduin_v2.repository.cart_total_quantity.L l12, @Y61.k com.avito.konveyor.item_visibility_tracker.b bVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k ProgressInfoToastBar.a aVar3, @Y61.k MenuInflater menuInflater, boolean z12, boolean z13) {
        this.f157598b = viewGroup;
        this.f157599c = g12;
        this.f157600d = interfaceC30683q0;
        this.f157601e = aVar;
        this.f157602f = aVar2;
        this.f157603g = l12;
        this.f157604h = bVar;
        this.f157605i = aVar3;
        this.f157606j = z13;
        Context context = viewGroup.getContext();
        this.f157607k = context;
        View viewFindViewById = viewGroup.findViewById(R.id.swipe_refresh_layout);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.swiperefreshlayout.widget.SwipeRefreshLayout");
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) viewFindViewById;
        this.f157608l = swipeRefreshLayout;
        View viewFindViewById2 = viewGroup.findViewById(R.id.recycler_view);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById2;
        TabBarLayout.a aVar4 = TabBarLayout.f180679h;
        TabBarLayout.a.e(aVar4, recyclerView, 0, 3);
        this.f157609m = recyclerView;
        View viewFindViewById3 = viewGroup.findViewById(android.R.id.empty);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        TabBarLayout.a.d(aVar4, viewFindViewById3);
        this.f157610n = viewFindViewById3;
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l(viewGroup, R.id.content, interfaceC28373a, 0, 0, 24, null);
        this.f157611o = lVar;
        View viewFindViewById4 = viewGroup.findViewById(R.id.category);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.chips.Chips");
        }
        this.f157612p = (Chips) viewFindViewById4;
        View viewFindViewById5 = viewGroup.findViewById(R.id.order);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.list_item.ListItem");
        }
        ListItem listItem = (ListItem) viewFindViewById5;
        this.f157613q = listItem;
        View viewFindViewById6 = viewGroup.findViewById(R.id.order_menu);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById6;
        this.f157614r = viewGroup2;
        View viewFindViewById7 = viewGroup.findViewById(R.id.list_action_menu_view);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.ActionMenuView");
        }
        ActionMenuView actionMenuView = (ActionMenuView) viewFindViewById7;
        ComposeView composeView = (ComposeView) viewGroup.findViewById(R.id.show_only_active_favorites_switch);
        composeView.setContent(new C22096n(-1985893193, new C1(this), true));
        this.f157615s = composeView;
        View viewFindViewById8 = viewGroup.findViewById(R.id.favorites_appbar);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout");
        }
        this.f157616t = (AppBarLayout) viewFindViewById8;
        com.jakewharton.rxrelay3.c<CategoryChipable> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f157617u = cVar;
        ComposeView composeView2 = (ComposeView) viewGroup.findViewById(R.id.favorites_search_bar);
        composeView2.setContent(new C22096n(-2057844474, new s1(this), true));
        this.f157620x = composeView2;
        ComposeView composeView3 = (ComposeView) viewGroup.findViewById(R.id.favorites_search_not_found);
        composeView3.setContent(new C22096n(-635839901, new u1(this), true));
        this.f157621y = composeView3;
        ComposeView composeView4 = (ComposeView) viewGroup.findViewById(R.id.favorites_empty_global);
        composeView4.setContent(new C22096n(532818292, new q1(this), true));
        this.f157622z = composeView4;
        this.f157595A = C42727D.c(new o1(this));
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setItemAnimator(null);
        recyclerView.l(new KC.a(context.getResources()), -1);
        interfaceC30683q0.Z1(recyclerView);
        int[] iArrA = com.avito.android.lib.deprecated_design.c.a(swipeRefreshLayout.getContext(), false);
        swipeRefreshLayout.setColorSchemeColors(Arrays.copyOf(iArrA, iArrA.length));
        swipeRefreshLayout.setProgressBackgroundColorSchemeColor(C35835l0.d(R.attr.white, swipeRefreshLayout.getContext()));
        swipeRefreshLayout.setOnRefreshListener(new j1(this));
        g12.f156276b = new k1(this);
        ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, y6.b(z12 ? 10 : 16), marginLayoutParams.bottomMargin);
        viewGroup2.setLayoutParams(marginLayoutParams);
        actionMenuView.setVisibility(z12 ? 0 : 8);
        if (z12) {
            menuInflater.inflate(z13 ? R.menu.favorites_list_global : R.menu.favorites_list, actionMenuView.getMenu());
            actionMenuView.setOverflowIcon(C35835l0.h(R.attr.ic_more20, context));
            Drawable overflowIcon = actionMenuView.getOverflowIcon();
            if (overflowIcon != null) {
                overflowIcon.setTint(C35835l0.d(R.attr.black, context));
            }
            MenuItem menuItemFindItem = actionMenuView.getMenu().findItem(R.id.menu_cart_item);
            if (menuItemFindItem != null) {
                menuItemFindItem.setVisible(false);
            }
            actionMenuView.setOnMenuItemClickListener(new j1(this));
        }
        lVar.f231600j = new l1(this);
        this.f157596B = cVar;
        this.f157597C = C37722i.a(listItem);
    }

    @Override // com.avito.android.advert.viewed.j, com.avito.android.serp.adapter.closable.e
    public final void C3(int i12) {
        C35976x4.c(i12, this.f157609m);
    }

    @Override // com.avito.android.favorites.InterfaceC30665h1
    public final void FP(@Y61.k PrintableText printableText, @Y61.l ApiError apiError, @Y61.l Throwable th2) {
        com.avito.android.component.toast.f fVarA;
        if (th2 == null && apiError == null) {
            fVarA = f.a.f125253a;
        } else {
            f.c.f125255c.getClass();
            fVarA = f.c.a.a(apiError, th2);
        }
        com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, this.f157598b, printableText, null, null, null, fVarA, 2750, null, null, false, false, null, null, 4046);
    }

    @Override // com.avito.android.component.toast.util.g
    public final void a(@Y61.k PrintableText printableText, int i12, @Y61.l String str, @Y61.l Y41.a aVar, @Y61.k ToastBarPosition toastBarPosition, @Y61.k com.avito.android.component.toast.f fVar) {
        com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, this.f157598b, printableText, null, (str == null || aVar == null) ? C42784z0.f406748b : Collections.singletonList(new c.a.C3719a(str, false, null, aVar, 6, null)), null, fVar, 2750, toastBarPosition, null, false, false, null, null, 3978);
    }

    public final void c(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menu_remove_all) {
            Context context = this.f157607k;
            new l.a(context).setMessage(context.getString(R.string.config_remove_favorites)).setPositiveButton(context.getString(R.string.yes), new DialogInterfaceOnClickListenerC30673l0(this, 1)).setNegativeButton(context.getString(R.string.cancel), new i1(0)).setCancelable(true).show();
        } else if (itemId == R.id.menu_remove_inactive) {
            this.f157600d.Y1();
        }
    }

    public final void d() {
        if (this.f157606j) {
            D6.w(this.f157622z);
        } else {
            D6.w(this.f157610n);
        }
    }

    public final void e() {
        this.f157611o.j();
    }

    public final void g() {
        CategoryChipable categoryChipable = new CategoryChipable(0, "", 0, null, false, null, 48, null);
        int i12 = Chips.f178664L;
        this.f157612p.o(categoryChipable, false);
    }

    public final void i(boolean z12) {
        boolean z13 = !z12;
        D6.G(this.f157612p, z13);
        D6.G(this.f157614r, z13);
        D6.c(this.f157620x, null, null, null, Integer.valueOf(z12 ? y6.b(16) : y6.b(0)), 7);
    }

    public final void k(boolean z12) {
        D6.G(this.f157616t, z12);
    }

    public final void l(boolean z12) {
        a aVar = new a(z12);
        G1 g12 = this.f157599c;
        g12.f156277c = aVar;
        g12.f156275a.invalidateOptionsMenu();
    }

    public final void m(@Y61.l String str, boolean z12) {
        boolean z13 = ((str == null || str.length() == 0) || z12) ? false : true;
        ListItem listItem = this.f157613q;
        D6.G(listItem, z13);
        listItem.setTitle(str);
    }

    public final void n(boolean z12) {
        this.f157620x.setVisibility(z12 ? 0 : 8);
        if (z12) {
            D6.c(this.f157612p, null, Integer.valueOf(y6.b(12)), null, null, 13);
        }
    }

    public final void o(int i12) {
        CategoryChipable categoryChipable = new CategoryChipable(i12, "", 0, null, false, null, 48, null);
        int i13 = Chips.f178664L;
        this.f157612p.q(categoryChipable, true);
    }

    public final void p(boolean z12) {
        D6.c(this.f157612p, null, Integer.valueOf(y6.b(z12 ? 24 : 0)), null, null, 13);
    }

    public final void q(@Y61.k String str) {
        this.f157611o.a(str);
    }

    public final void t2() {
        this.f157611o.k(null);
    }
}
