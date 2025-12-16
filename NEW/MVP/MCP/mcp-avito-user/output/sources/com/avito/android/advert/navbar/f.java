package com.avito.android.advert.navbar;

import Ca1.ViewOnClickListenerC13236c;
import LV.c;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.P;
import androidx.view.C22977J;
import androidx.view.C22981N;
import androidx.view.InterfaceC22983P;
import androidx.view.V0;
import com.avito.android.R;
import com.avito.android.advert.navbar.o;
import com.avito.android.advert.navbar.q;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.lib.design.nav_bar.a;
import com.avito.android.lib.design.nav_bar.b;
import com.avito.android.remote.model.AdvertCardNavBar;
import com.avito.android.remote.model.AdvertCardNavBarContent;
import com.avito.android.remote.model.AdvertCardNavBarContentType;
import com.avito.android.remote.model.AdvertLastPriceChange;
import com.avito.android.remote.model.AdvertNavBarAction;
import com.avito.android.remote.model.AdvertNavBarKt;
import com.avito.android.util.C35763c0;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.R0;
import com.avito.android.util.y6;
import com.jakewharton.rxbinding4.view.C37719f;
import io.reactivex.rxjava3.core.z;
import j.InterfaceC42156l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;
import kotlinx.coroutines.rx3.y;
import m.C43852a;

/* compiled from: AdvertDetailsNavBarDelegate.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/navbar/f;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_details_items.photogallery.c f80819a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f80820b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final androidx.appcompat.view.d f80821c;

    /* renamed from: d, reason: collision with root package name */
    public final int f80822d;

    /* renamed from: e, reason: collision with root package name */
    public final int f80823e;

    /* renamed from: f, reason: collision with root package name */
    public final int f80824f;

    /* renamed from: g, reason: collision with root package name */
    public final int f80825g;

    /* renamed from: h, reason: collision with root package name */
    public final int f80826h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Toolbar f80827i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final NavBar f80828j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public View f80829k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public com.avito.android.lib.design.nav_bar.a f80830l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public ArrayList f80831m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f80832n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final Menu f80833o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public final Drawable f80834p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public final C22977J f80835q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final e2 f80836r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final e2 f80837s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final e2 f80838t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final e2 f80839u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final e2 f80840v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final e2 f80841w;

    /* renamed from: x, reason: collision with root package name */
    public long f80842x;

    /* compiled from: AdvertDetailsNavBarDelegate.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f80843a;

        static {
            int[] iArr = new int[AdvertLastPriceChange.values().length];
            try {
                iArr[AdvertLastPriceChange.f253578UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdvertLastPriceChange.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f80843a = iArr;
        }
    }

    /* compiled from: AdvertDetailsNavBarDelegate.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f80844l = new b();

        public b() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertDetailsNavBarDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/G0;", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "apply", "(Lkotlin/G0;)Landroid/view/View;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f80845b;

        public c(View view) {
            this.f80845b = view;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return this.f80845b;
        }
    }

    /* compiled from: AdvertDetailsNavBarDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/G0;", "it", "Landroidx/appcompat/view/menu/ActionMenuItemView;", "kotlin.jvm.PlatformType", "apply", "(Lkotlin/G0;)Landroidx/appcompat/view/menu/ActionMenuItemView;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ActionMenuItemView f80846b;

        public d(ActionMenuItemView actionMenuItemView) {
            this.f80846b = actionMenuItemView;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return this.f80846b;
        }
    }

    /* compiled from: AdvertDetailsNavBarDelegate.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends H implements Y41.l<Integer, G0> {
        @Override // Y41.l
        public final G0 invoke(Integer num) {
            f.a((f) this.receiver, num.intValue());
            return G0.f406611a;
        }
    }

    public f(@Y61.k View view, @Y61.k com.avito.android.advert_details_items.photogallery.c cVar, @Y61.k R0 r02) {
        this.f80819a = cVar;
        this.f80820b = r02;
        androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(view.getContext(), R.style.Theme_DesignSystem_Re23);
        this.f80821c = dVar;
        this.f80822d = dVar.getResources().getDimensionPixelSize(R.dimen.advert_details_navbar_back_button_margin_start);
        this.f80823e = dVar.getResources().getDimensionPixelSize(R.dimen.advert_details_navbar_icons_padding);
        this.f80824f = dVar.getResources().getDimensionPixelSize(R.dimen.advert_details_navbar_content_spacing);
        this.f80825g = dVar.getResources().getDimensionPixelSize(R.dimen.advert_details_navbar_padding_horizontal);
        this.f80826h = androidx.core.content.d.getColor(dVar, R.color.re_23_constant_gray_12);
        View viewFindViewById = view.findViewById(R.id.toolbar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
        }
        Toolbar toolbar = (Toolbar) viewFindViewById;
        this.f80827i = toolbar;
        View viewFindViewById2 = view.findViewById(R.id.navbar);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.nav_bar.NavBar");
        }
        NavBar navBar = (NavBar) viewFindViewById2;
        this.f80828j = navBar;
        this.f80830l = new com.avito.android.lib.design.nav_bar.a(null, null, false, null, null, null, null, 127, null);
        new com.avito.android.lib.design.nav_bar.b(0, null, 0, null, null, null, null, 127, null);
        this.f80831m = new ArrayList();
        this.f80833o = toolbar.getMenu();
        this.f80834p = toolbar.getOverflowIcon();
        InterfaceC22983P interfaceC22983PA = V0.a(navBar);
        this.f80835q = interfaceC22983PA != null ? C22981N.a(interfaceC22983PA.getLifecycle()) : null;
        this.f80836r = f2.b(0, 0, null, 7);
        this.f80837s = f2.b(0, 0, null, 7);
        this.f80838t = f2.b(0, 0, null, 7);
        this.f80839u = f2.b(0, 0, null, 7);
        this.f80840v = f2.b(0, 0, null, 7);
        this.f80841w = f2.b(0, 0, null, 7);
    }

    public static final void a(f fVar, int i12) {
        p pVar = (p) C42745f0.K(i12, fVar.f80831m);
        if (pVar == null) {
            return;
        }
        q qVar = pVar.f80863b;
        boolean z12 = qVar instanceof q.c;
        C22977J c22977j = fVar.f80835q;
        R0 r02 = fVar.f80820b;
        if (z12) {
            if (c22977j != null) {
                C43259k.d(c22977j, r02.b(), null, new j(fVar, null), 2);
                return;
            }
            return;
        }
        if (qVar instanceof q.f) {
            if (c22977j != null) {
                C43259k.d(c22977j, r02.b(), null, new k(fVar, null), 2);
                return;
            }
            return;
        }
        if (qVar instanceof q.a) {
            if (c22977j != null) {
                C43259k.d(c22977j, r02.b(), null, new l(fVar, null), 2);
            }
        } else if (qVar instanceof q.d) {
            if (c22977j != null) {
                C43259k.d(c22977j, r02.b(), null, new m(fVar, null), 2);
            }
        } else {
            if (!(qVar instanceof q.e)) {
                boolean z13 = qVar instanceof q.b;
                return;
            }
            DeepLink deepLink = pVar.f80868g;
            if (deepLink == null || c22977j == null) {
                return;
            }
            C43259k.d(c22977j, r02.b(), null, new n(fVar, deepLink, null), 2);
        }
    }

    public static SpannableStringBuilder f(f fVar, String str, androidx.appcompat.view.d dVar, int i12, int i13) {
        int iB2 = y6.b(3);
        fVar.getClass();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(FV.a.f4720a.e(str, dVar, i12, iB2));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(C35835l0.d(i13, dVar)), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    @Y61.k
    public final Y41.a<G0> b() {
        return !this.f80832n ? com.avito.android.checkable_image.q.b(this.f80827i.findViewById(R.id.menu_subscription)) : b.f80844l;
    }

    @Y61.k
    public final z<View> c() {
        View viewFindViewById = this.f80828j.findViewById(R.id.nav_bar_actions_container);
        MenuItem menuItemFindItem = this.f80833o.findItem(R.id.menu_download_buttons_dropdown);
        return z.g0(y.b(this.f80839u).d0(new c(viewFindViewById)), C37719f.a(menuItemFindItem).d0(new d((ActionMenuItemView) this.f80827i.findViewById(menuItemFindItem.getItemId()))));
    }

    public final void d(@InterfaceC42156l int i12, @Y61.l String str) {
        if (this.f80832n) {
            return;
        }
        if (str == null) {
            str = "";
        }
        Integer numA = com.avito.android.lib.util.q.a(str);
        int iIntValue = numA != null ? numA.intValue() : R.attr.navigationIcon;
        Toolbar toolbar = this.f80827i;
        toolbar.setNavigationIcon(C35835l0.n(toolbar.getContext(), iIntValue, i12));
    }

    public final void e(int i12) {
        ArrayList<p> arrayList = this.f80831m;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        for (p pVarA : arrayList) {
            if (L.f(pVarA.f80863b, q.c.f80871a)) {
                pVarA = p.a(pVarA, pVarA.f80864c, false, new C35763c0(C35835l0.d(i12, this.f80821c), null, null, null, 14, null), 107);
            }
            arrayList2.add(pVarA);
        }
        this.f80831m = new ArrayList(arrayList2);
        j();
    }

    public final void g(int i12, q qVar) {
        Drawable drawableA = C43852a.a(this.f80821c, i12);
        if (drawableA == null) {
            return;
        }
        ArrayList<p> arrayList = this.f80831m;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        for (p pVarA : arrayList) {
            if (L.f(pVarA.f80863b, qVar)) {
                pVarA = p.a(pVarA, drawableA.mutate(), false, null, 123);
            }
            arrayList2.add(pVarA);
        }
        this.f80831m = new ArrayList(arrayList2);
    }

    public final void h(boolean z12, q qVar) {
        ArrayList<p> arrayList = this.f80831m;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        for (p pVarA : arrayList) {
            if (L.f(pVarA.f80863b, qVar)) {
                pVarA = p.a(pVarA, null, z12, null, 119);
            }
            arrayList2.add(pVarA);
        }
        this.f80831m = new ArrayList(arrayList2);
        j();
    }

    public final void i(@Y61.l com.avito.android.advert.navbar.e eVar) {
        q bVar;
        Drawable drawableH;
        G0 g02;
        String title;
        CharSequence charSequenceF;
        if (eVar == null) {
            return;
        }
        this.f80832n = true;
        NavBar navBar = this.f80828j;
        D6.H(navBar);
        D6.w(this.f80827i);
        AdvertCardNavBar advertCardNavBar = eVar.f80816a;
        AdvertCardNavBarContent content = advertCardNavBar.getContent();
        ArrayList arrayList = null;
        AdvertCardNavBarContentType type = content != null ? content.getType() : null;
        AdvertCardNavBarContentType advertCardNavBarContentType = AdvertCardNavBarContentType.PREVIEW;
        androidx.appcompat.view.d dVar = this.f80821c;
        int i12 = 0;
        if (type == advertCardNavBarContentType) {
            View viewInflate = LayoutInflater.from(dVar).inflate(R.layout.advert_details_navbar_content_view, (ViewGroup) null);
            this.f80829k = viewInflate;
            viewInflate.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            View viewFindViewById = viewInflate.findViewById(R.id.preview);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
            }
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) viewFindViewById;
            com.avito.android.advert.navbar.a aVar = eVar.f80817b;
            if (aVar != null) {
                C35949t5.c(simpleDraweeView, com.avito.android.image_loader.b.b(aVar.f80805a), null, null, null, 14);
                simpleDraweeView.setOnClickListener(new ViewOnClickListenerC13236c(viewInflate, this, aVar));
                g02 = G0.f406611a;
            } else {
                g02 = null;
            }
            if (g02 == null) {
                D6.w(simpleDraweeView);
            }
            AdvertCardNavBarContent content2 = advertCardNavBar.getContent();
            if (content2 != null && (title = content2.getTitle()) != null) {
                AdvertCardNavBarContent content3 = advertCardNavBar.getContent();
                AdvertLastPriceChange lastPriceChange = content3 != null ? content3.getLastPriceChange() : null;
                int i13 = lastPriceChange != null ? a.f80843a[lastPriceChange.ordinal()] : -1;
                if (i13 != 1) {
                    charSequenceF = title;
                    if (i13 == 2) {
                        charSequenceF = f(this, title, dVar, R.attr.textIconArrowDown, R.attr.text_success);
                    }
                } else {
                    charSequenceF = f(this, title, dVar, R.attr.textIconArrowUp, R.attr.text_error);
                }
                View viewFindViewById2 = viewInflate.findViewById(R.id.title);
                if (viewFindViewById2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                }
                I5.a((TextView) viewFindViewById2, charSequenceF, false);
            }
            View viewFindViewById3 = viewInflate.findViewById(R.id.subtitle);
            if (viewFindViewById3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            TextView textView = (TextView) viewFindViewById3;
            AdvertCardNavBarContent content4 = advertCardNavBar.getContent();
            I5.a(textView, content4 != null ? content4.getSubtitle() : null, false);
        }
        com.avito.android.lib.design.nav_bar.a aVar2 = this.f80830l;
        Drawable drawableH2 = C35835l0.h(R.attr.ic_arrowBack24, dVar);
        h hVar = new h(this);
        View view = this.f80829k;
        List<AdvertNavBarAction> actions = advertCardNavBar.getActions();
        int i14 = this.f80826h;
        if (actions != null) {
            this.f80831m.clear();
            boolean z12 = eVar.f80818c;
            if (z12 && (drawableH = C35835l0.h(R.attr.ic_more24, dVar)) != null) {
                this.f80831m.add(new p(0, q.d.f80872a, drawableH, false, null, com.avito.android.util.V0.c(ColorStateList.valueOf(i14)), null, 88, null));
            }
            for (Object obj : AdvertNavBarKt.getVisibleActions(actions)) {
                int i15 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                switch (o.a.f80861a[((AdvertNavBarAction) obj).getType().ordinal()]) {
                    case 1:
                        bVar = q.c.f80871a;
                        break;
                    case 2:
                        bVar = q.f.f80874a;
                        break;
                    case 3:
                        bVar = q.a.f80869a;
                        break;
                    case 4:
                        bVar = q.e.f80873a;
                        break;
                    case 5:
                        bVar = new q.b("pdf");
                        break;
                    case 6:
                        bVar = new q.b("docx");
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                Integer numValueOf = L.f(bVar, q.c.f80871a) ? Integer.valueOf(R.attr.ic_favorites24) : L.f(bVar, q.f.f80874a) ? Integer.valueOf(R.attr.ic_share24) : L.f(bVar, q.a.f80869a) ? Integer.valueOf(R.attr.ic_addCompare24) : null;
                Drawable drawableH3 = numValueOf != null ? C35835l0.h(numValueOf.intValue(), dVar) : null;
                if (drawableH3 != null) {
                    this.f80831m.add(new p(z12 ? i15 : i12, bVar, drawableH3, false, null, com.avito.android.util.V0.c(ColorStateList.valueOf(i14)), null, 88, null));
                }
                i12 = i15;
            }
            ArrayList arrayList2 = this.f80831m;
            arrayList = new ArrayList(C42745f0.q(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                p pVar = (p) it.next();
                arrayList.add(new a.C5289a(pVar.f80864c, pVar.f80866e, pVar.f80867f, 0, 0, this.f80823e, 24, null));
            }
        }
        com.avito.android.lib.design.nav_bar.a aVarA = com.avito.android.lib.design.nav_bar.a.a(aVar2, drawableH2, hVar, null, view, arrayList, new i(1, this, f.class, "onRightButtonClick", "onRightButtonClick(I)V", 0), 12);
        navBar.setState(aVarA);
        this.f80830l = aVarA;
        b.C5290b c5290b = com.avito.android.lib.design.nav_bar.b.f179844h;
        int iJ2 = C35835l0.j(R.attr.navBarDefault, dVar);
        c5290b.getClass();
        com.avito.android.lib.design.nav_bar.b bVar2 = (com.avito.android.lib.design.nav_bar.b) c.a.a(c5290b, dVar, iJ2);
        RippleDrawable rippleDrawableC = com.avito.android.util.V0.c(ColorStateList.valueOf(i14));
        bVar2.f179846b.getClass();
        navBar.setStyle(com.avito.android.lib.design.nav_bar.b.a(bVar2, this.f80825g, new b.a(R.attr.black, this.f80822d, this.f80823e, rippleDrawableC), this.f80824f, null, new C35763c0(C35835l0.d(R.attr.black, dVar), null, null, null, 14, null), 88));
    }

    public final void j() {
        com.avito.android.lib.design.nav_bar.a aVar = this.f80830l;
        ArrayList arrayList = this.f80831m;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((p) obj).f80865d) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            Drawable drawable = pVar.f80864c;
            a.C5289a c5289a = drawable != null ? new a.C5289a(drawable, pVar.f80866e, pVar.f80867f, 0, 0, this.f80823e, 24, null) : null;
            if (c5289a != null) {
                arrayList3.add(c5289a);
            }
        }
        com.avito.android.lib.design.nav_bar.a aVarA = com.avito.android.lib.design.nav_bar.a.a(aVar, null, null, null, null, arrayList3, new e(1, this, f.class, "onRightButtonClick", "onRightButtonClick(I)V", 0), 31);
        this.f80828j.setState(aVarA);
        this.f80830l = aVarA;
    }
}
