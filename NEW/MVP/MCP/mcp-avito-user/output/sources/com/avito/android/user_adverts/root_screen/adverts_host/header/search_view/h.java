package com.avito.android.user_adverts.root_screen.adverts_host.header.search_view;

import Au.C13079a;
import BI0.a;
import BI0.d;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ca1.C27140f;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.UserAdvertsScreen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.bottom_navigation.C28888j;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.input.s;
import com.avito.android.lib.design.list_item.ListItemSwitcher;
import com.avito.android.lib.design.tooltip.b;
import com.avito.android.lib.design.tooltip.i;
import com.avito.android.lib.design.tooltip.p;
import com.avito.android.lib.design.tooltip.r;
import com.avito.android.user_adverts.root_screen.adverts_host.C35565c;
import com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.d;
import com.avito.android.util.D6;
import com.avito.android.util.K2;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import com.google.android.material.appbar.AppBarLayout;
import java.util.List;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import nE.C44240b;

/* compiled from: UserAdvertsSearchView.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/header/search_view/h;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/header/search_view/c;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/header/search_view/d;", "b", "c", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h implements com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.c, com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.d {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f312807p = 0;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ScreenPerformanceTracker f312808a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC28373a f312809b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d.a f312810c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f312811d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Object f312812e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Object f312813f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Object f312814g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f312815h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f312816i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.f f312817j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final String f312818k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final String f312819l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.h f312820m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.j f312821n;

    /* renamed from: o, reason: collision with root package name */
    @l
    public C35565c f312822o;

    /* compiled from: UserAdvertsSearchView.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/header/search_view/h$b;", "", "<init>", "()V", "", "SEARCH_CONTENT_ANIMATION_DURATION", "J", "SEARCH_CONTENT_ANIMATION_START_DELAY", "", "SEARCH_CONTENT_INVISIBLE_ALPHA", "F", "SEARCH_CONTENT_TOAST_DELAY", "SEARCH_CONTENT_VISIBLE_ALPHA", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: UserAdvertsSearchView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/header/search_view/h$c;", "Lcom/google/android/material/appbar/AppBarLayout$Behavior$a;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends AppBarLayout.Behavior.a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f312824a = new c();

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior.b
        /* renamed from: a */
        public final boolean getF313042a() {
            return false;
        }
    }

    /* compiled from: UserAdvertsSearchView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<String, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            C35565c c35565c;
            String str2 = str;
            h hVar = h.this;
            if (hVar.f312815h && (c35565c = hVar.f312822o) != null) {
                c35565c.a(new a.k(str2));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: UserAdvertsSearchView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/lib/design/tooltip/k;", "invoke", "()Lcom/avito/android/lib/design/tooltip/k;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<com.avito.android.lib.design.tooltip.k> {
        public e() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.C] */
        /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final com.avito.android.lib.design.tooltip.k invoke() {
            int i12 = h.f312807p;
            h hVar = h.this;
            hVar.getClass();
            com.avito.android.lib.design.tooltip.k kVar = new com.avito.android.lib.design.tooltip.k(hVar.f312811d, 0, 0, 6, null);
            r.a aVar = new r.a(new i.c(new b.c()));
            aVar.m(((Number) hVar.f312812e.getValue()).intValue());
            aVar.j(((Number) hVar.f312813f.getValue()).intValue());
            kVar.f181224j = aVar;
            int i13 = kVar.f181229o;
            kVar.f181228n = -1;
            kVar.f181229o = i13;
            p.a(kVar, new i(hVar, kVar));
            kVar.setOnDismissListener(new C28888j(hVar, 4));
            return kVar;
        }
    }

    /* compiled from: UserAdvertsSearchView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class f extends N implements Y41.a<Integer> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final Integer invoke() {
            return Integer.valueOf(h.this.f312811d.getResources().getDimensionPixelSize(R.dimen.user_adverts_filters_new_tooltip_anchor_offset));
        }
    }

    /* compiled from: UserAdvertsSearchView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class g extends N implements Y41.a<Integer> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final Integer invoke() {
            return Integer.valueOf(h.this.f312811d.getResources().getDimensionPixelSize(R.dimen.user_adverts_filters_new_tooltip_display_min_padding));
        }
    }

    /* compiled from: UserAdvertsSearchView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/header/search_view/suggestion/a;", "item", "", "index", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/user_adverts/root_screen/adverts_host/header/search_view/suggestion/a;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.h$h, reason: collision with other inner class name */
    public static final class C9570h extends N implements Y41.p<com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.suggestion.a, Integer, G0> {
        public C9570h() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.suggestion.a aVar, Integer num) {
            com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.suggestion.a aVar2 = aVar;
            int iIntValue = num.intValue();
            h hVar = h.this;
            Editable editableM53getText = hVar.f312810c.f312790c.m53getText();
            String string = editableM53getText != null ? editableM53getText.toString() : null;
            if (string == null) {
                string = "";
            }
            C35565c c35565c = hVar.f312822o;
            if (c35565c != null) {
                c35565c.a(new a.j(aVar2.f312954b, iIntValue, string));
            }
            return G0.f406611a;
        }
    }

    static {
        new b(null);
    }

    public h(@k View view, @k ScreenPerformanceTracker screenPerformanceTracker, @k InterfaceC28373a interfaceC28373a, @k C44240b c44240b) throws Resources.NotFoundException, BlueprintCollisionException {
        this.f312808a = screenPerformanceTracker;
        this.f312809b = interfaceC28373a;
        d.a aVar = new d.a(view, c44240b.v().invoke().booleanValue());
        this.f312810c = aVar;
        this.f312811d = view.getContext();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406616d;
        this.f312812e = C42727D.b(lazyThreadSafetyMode, new g());
        this.f312813f = C42727D.b(lazyThreadSafetyMode, new f());
        this.f312814g = C42727D.b(lazyThreadSafetyMode, new e());
        this.f312815h = true;
        this.f312816i = true;
        s sVar = new s(null, new d());
        C13079a c13079a = new C13079a(this, 11);
        this.f312817j = new com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.f(this, 0);
        String string = view.getResources().getString(R.string.user_adverts_search_hint);
        this.f312818k = string;
        this.f312819l = view.getResources().getString(R.string.user_adverts_search_hint_disabled);
        com.avito.android.advert.item.fmp.calculator.l lVar = new com.avito.android.advert.item.fmp.calculator.l(this, 18);
        Input input = aVar.f312790c;
        input.setOnFocusChangeListener(lVar);
        input.b(sVar);
        aVar.f312795h.e(c13079a);
        final int i12 = 0;
        aVar.f312789b.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.g

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h f312806c;

            {
                this.f312806c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        C35565c c35565c = this.f312806c.f312822o;
                        if (c35565c != null) {
                            c35565c.a(a.c.f1291a);
                            break;
                        }
                        break;
                    default:
                        C35565c c35565c2 = this.f312806c.f312822o;
                        if (c35565c2 != null) {
                            c35565c2.a(a.f.f1294a);
                            break;
                        }
                        break;
                }
            }
        });
        input.setOnEditorActionListener(new C27140f(this, 14));
        input.setHint(string);
        input.setClearButton(true);
        input.setFocusByClearButton(false);
        aVar.f312792e.addOnAttachStateChangeListener(new a());
        com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.suggestion.d dVar = new com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.suggestion.d(new C9570h());
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(new com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.suggestion.b(dVar));
        com.avito.konveyor.a aVarA = c10493a.a();
        com.avito.konveyor.adapter.h hVar = new com.avito.konveyor.adapter.h(aVarA, aVarA, null, 4, null);
        this.f312820m = hVar;
        com.avito.konveyor.adapter.j jVar = new com.avito.konveyor.adapter.j(hVar, aVarA);
        jVar.setHasStableIds(true);
        this.f312821n = jVar;
        aVar.f312794g.setAdapter(jVar);
        final int i13 = 1;
        aVar.f312797j.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.g

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h f312806c;

            {
                this.f312806c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        C35565c c35565c = this.f312806c.f312822o;
                        if (c35565c != null) {
                            c35565c.a(a.c.f1291a);
                            break;
                        }
                        break;
                    default:
                        C35565c c35565c2 = this.f312806c.f312822o;
                        if (c35565c2 != null) {
                            c35565c2.a(a.f.f1294a);
                            break;
                        }
                        break;
                }
            }
        });
    }

    public static void a(final View view, boolean z12, final boolean z13) {
        final float f12 = z12 ? 1.0f : 0.0f;
        if (view.getAlpha() == f12) {
            return;
        }
        view.animate().cancel();
        final int i12 = 0;
        ViewPropertyAnimator viewPropertyAnimatorWithStartAction = view.animate().alpha(f12).setStartDelay(100L).setDuration(150L).withStartAction(new Runnable() { // from class: com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.e
            @Override // java.lang.Runnable
            public final void run() {
                View view2 = view;
                float f13 = f12;
                boolean z14 = z13;
                switch (i12) {
                    case 0:
                        int i13 = h.f312807p;
                        if (z14 && f13 == 1.0f) {
                            D6.H(view2);
                            break;
                        }
                        break;
                    default:
                        int i14 = h.f312807p;
                        if (z14 && f13 == 0.0f) {
                            D6.w(view2);
                            break;
                        }
                        break;
                }
            }
        });
        final int i13 = 1;
        viewPropertyAnimatorWithStartAction.withEndAction(new Runnable() { // from class: com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.e
            @Override // java.lang.Runnable
            public final void run() {
                View view2 = view;
                float f13 = f12;
                boolean z14 = z13;
                switch (i13) {
                    case 0:
                        int i132 = h.f312807p;
                        if (z14 && f13 == 1.0f) {
                            D6.H(view2);
                            break;
                        }
                        break;
                    default:
                        int i14 = h.f312807p;
                        if (z14 && f13 == 0.0f) {
                            D6.w(view2);
                            break;
                        }
                        break;
                }
            }
        }).start();
    }

    public static void e(AppBarLayout appBarLayout, AppBarLayout.Behavior.a aVar) {
        ViewGroup.LayoutParams layoutParams = appBarLayout.getLayoutParams();
        CoordinatorLayout.g gVar = layoutParams instanceof CoordinatorLayout.g ? (CoordinatorLayout.g) layoutParams : null;
        Object obj = gVar != null ? gVar.f44447a : null;
        AppBarLayout.Behavior behavior = obj instanceof AppBarLayout.Behavior ? (AppBarLayout.Behavior) obj : null;
        if (behavior != null) {
            behavior.f355745o = aVar;
        }
    }

    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, kotlin.C] */
    public final void b(@k BI0.d dVar) {
        boolean z12 = dVar instanceof d.b ? true : dVar instanceof d.c;
        d.a aVar = this.f312810c;
        if (z12) {
            D6.w(aVar.f312788a);
            D6.w(aVar.f312796i);
            AppBarLayout appBarLayout = aVar.f312791d;
            if (appBarLayout != null) {
                e(appBarLayout, null);
            }
            a(aVar.f312792e, false, true);
            return;
        }
        if (dVar instanceof d.C0052d) {
            d.C0052d c0052d = (d.C0052d) dVar;
            d(c0052d, true);
            D6.H(aVar.f312788a);
            D6.H(aVar.f312796i);
            if (c0052d.f1328e.f1318a) {
                this.f312815h = false;
                Input.t(aVar.f312790c, c0052d.f1337n, false, 6);
                this.f312815h = true;
            }
            boolean z13 = c0052d.f1324a;
            boolean z14 = c0052d.f1326c;
            String str = this.f312818k;
            if (!z13 && !z14) {
                str = this.f312819l;
            }
            aVar.f312790c.setHint(str);
            boolean z15 = c0052d.f1339p;
            View view = aVar.f312797j;
            D6.G(view, z15);
            D6.G(aVar.f312798k, c0052d.f1340q);
            view.setEnabled(z14);
            if (c0052d.f1341r) {
                ?? r62 = this.f312814g;
                if (!((com.avito.android.lib.design.tooltip.k) r62.getValue()).isShowing() && ((com.avito.android.lib.design.tooltip.k) r62.getValue()).f(view) != null) {
                    this.f312809b.c(new pI0.c());
                }
            }
            Input input = aVar.f312790c;
            input.setEnabled(z14);
            View view2 = aVar.f312789b;
            View view3 = aVar.f312792e;
            if (z13) {
                AppBarLayout appBarLayout2 = aVar.f312791d;
                if (appBarLayout2 != null) {
                    e(appBarLayout2, c.f312824a);
                }
                AppBarLayout appBarLayout3 = aVar.f312791d;
                if (appBarLayout3 != null) {
                    appBarLayout3.g(false, true, true);
                }
                D6.H(view2);
                c(c0052d.f1336m, true);
                ListItemSwitcher listItemSwitcher = aVar.f312795h;
                listItemSwitcher.setEnabled(z14);
                if (c0052d.f1329f.f1318a) {
                    this.f312816i = false;
                    listItemSwitcher.setChecked(c0052d.f1338o);
                    this.f312816i = true;
                }
                if (z14 && !input.f179340l.isFocused()) {
                    input.v();
                }
                if (!z14) {
                    view3.postDelayed(this.f312817j, 300L);
                }
                a(view3, true, true);
            } else {
                c(C42784z0.f406748b, false);
                K2.d(input, true);
                AppBarLayout appBarLayout4 = aVar.f312791d;
                if (appBarLayout4 != null) {
                    e(appBarLayout4, null);
                }
                D6.w(view2);
                a(view3, false, true);
            }
            d(c0052d, false);
        }
    }

    public final void c(List<com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.suggestion.a> list, boolean z12) {
        this.f312820m.f338510e = new UV0.c(list);
        this.f312821n.notifyDataSetChanged();
        d.a aVar = this.f312810c;
        List<com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.suggestion.a> list2 = list;
        D6.G(aVar.f312793f, !list2.isEmpty());
        if (z12) {
            a(aVar.f312794g, !list2.isEmpty(), false);
        }
    }

    public final void d(d.C0052d c0052d, boolean z12) {
        if (c0052d.f1324a) {
            ScreenPerformanceTracker screenPerformanceTracker = this.f312808a;
            if (z12) {
                UserAdvertsScreen.f90543d.getClass();
                screenPerformanceTracker.m(UserAdvertsScreen.f90546g);
            } else {
                UserAdvertsScreen.f90543d.getClass();
                ScreenPerformanceTracker.a.c(screenPerformanceTracker, UserAdvertsScreen.f90546g, null, null, 6);
            }
        }
    }

    /* compiled from: UserAdvertsSearchView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/user_adverts/root_screen/adverts_host/header/search_view/h$a", "Landroid/view/View$OnAttachStateChangeListener;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(@k View view) {
            view.removeCallbacks(h.this.f312817j);
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(@k View view) {
        }
    }
}
