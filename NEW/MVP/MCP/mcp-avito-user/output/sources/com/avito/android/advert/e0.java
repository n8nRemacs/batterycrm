package com.avito.android.advert;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import com.avito.android.R;
import com.avito.android.advert.navbar.q;
import com.avito.android.advert.navbar.r;
import com.avito.android.advert_details.AdvertDetailsStyle;
import com.avito.android.component.toast.c;
import com.avito.android.component.toast.f;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.InterfaceC31171n;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.utils.a;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.lib.util.darkTheme.ThemeAppearance;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.AdvertNavBarStyle;
import com.avito.android.remote.model.AdvertNavBarStyleKt;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35766c3;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.L5;
import com.avito.android.util.P5;
import com.avito.android.util.R0;
import com.facebook.drawee.view.SimpleDraweeView;
import com.jakewharton.rxbinding4.view.C37719f;
import j.InterfaceC42150f;
import j.InterfaceC42156l;
import j.InterfaceC42158n;
import java.io.Serializable;
import java.util.Collections;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: AdvertDetailsToolbarView.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/e0;", "Lcom/avito/android/advert/d0;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e0 implements d0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f71152a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final com.avito.android.lib.beduin_v2.repository.cart_total_quantity.L f71153b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.navbar.f f71154c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final SimpleDraweeView f71155d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public com.avito.android.advert.navbar.r f71156e = new r.a(R.attr.blue);

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public kotlin.jvm.internal.N f71157f = a.f71160l;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f71158g = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: h, reason: collision with root package name */
    public boolean f71159h;

    /* compiled from: AdvertDetailsToolbarView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f71160l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    public e0(@Y61.k com.avito.android.advert_details_items.photogallery.c cVar, @Y61.k View view, @Y61.l com.avito.android.lib.beduin_v2.repository.cart_total_quantity.L l12, @Y61.k R0 r02) {
        this.f71152a = view;
        this.f71153b = l12;
        this.f71154c = new com.avito.android.advert.navbar.f(view, cVar, r02);
        this.f71155d = (SimpleDraweeView) view.findViewById(R.id.logo_drawee_view);
    }

    @Override // com.avito.android.advert.d0
    public final void Ac(@Y61.k InterfaceC31171n interfaceC31171n, boolean z12) {
        com.avito.android.lib.beduin_v2.repository.cart_total_quantity.L l12 = this.f71153b;
        if (l12 == null) {
            return;
        }
        MenuItem menuItemC = c();
        com.avito.android.lib.beduin_v2.repository.cart_total_quantity.L.g(menuItemC, interfaceC31171n);
        menuItemC.setVisible(l12.e(interfaceC31171n) && z12);
    }

    @Override // com.avito.android.advert.d0
    public final void Bc(float f12) {
        View view;
        com.avito.android.advert.navbar.f fVar = this.f71154c;
        fVar.getClass();
        if (f12 < 0.0f || f12 > 1.0f || (view = fVar.f80829k) == null) {
            return;
        }
        view.setAlpha(f12);
        view.setTranslationY((1.0f - f12) * view.getHeight());
    }

    @Override // com.avito.android.advert.d0
    public final void Cc(@InterfaceC42150f int i12, @InterfaceC42150f int i13) {
        int iD2 = C35835l0.d(i12, this.f71152a.getContext());
        com.avito.android.advert.navbar.f fVar = this.f71154c;
        boolean z12 = fVar.f80832n;
        Toolbar toolbar = fVar.f80827i;
        if (!z12) {
            toolbar.setBackgroundColor(iD2);
        }
        if (fVar.f80832n) {
            return;
        }
        P5.c(toolbar, i13);
    }

    @Override // com.avito.android.advert.d0
    public final void Dc(boolean z12) {
        if (!this.f71159h) {
            b().setVisible(z12);
            return;
        }
        com.avito.android.advert.navbar.f fVar = this.f71154c;
        fVar.getClass();
        fVar.h(z12, q.a.f80869a);
    }

    @Override // com.avito.android.advert.d0
    public final void Ec(@Y61.l Long l12) {
        long jLongValue;
        com.avito.android.advert.navbar.f fVar = this.f71154c;
        if (l12 != null) {
            fVar.getClass();
            jLongValue = l12.longValue();
        } else {
            jLongValue = 0;
        }
        fVar.f80842x = jLongValue;
    }

    @Override // com.avito.android.advert.d0
    public final void Fc() {
        this.f71157f = (kotlin.jvm.internal.N) this.f71154c.b();
    }

    @Override // com.avito.android.advert.d0
    @Y61.k
    public final io.reactivex.rxjava3.core.z<G0> Gc() {
        return C37719f.a(a());
    }

    @Override // com.avito.android.advert.d0
    public final void Hc(@InterfaceC42150f int i12, @InterfaceC42150f int i13, @InterfaceC42158n int i14, boolean z12) {
        com.avito.android.advert.navbar.f fVar = this.f71154c;
        if (fVar.f80833o.hasVisibleItems()) {
            return;
        }
        int i15 = z12 ? R.menu.advert_details_toolbar_brand_global : R.menu.advert_details;
        boolean z13 = fVar.f80832n;
        Toolbar toolbar = fVar.f80827i;
        if (z13) {
            toolbar.m(i15);
        } else {
            toolbar.m(i15);
        }
        if (!fVar.f80832n) {
            P5.c(toolbar, i12);
        }
        this.f71156e = new r.a(i13);
        if (!fVar.f80832n) {
            P5.f(toolbar, i13);
        }
        Drawable drawable = fVar.f80834p;
        if (drawable != null) {
            drawable.setTint(C35835l0.d(i13, this.f71152a.getContext()));
        }
        if (fVar.f80832n) {
            return;
        }
        P5.e(toolbar, androidx.core.content.d.getColor(toolbar.getContext(), i14));
    }

    @Override // com.avito.android.advert.d0
    public final void Ic(boolean z12) {
        if (this.f71159h) {
            return;
        }
        b().setEnabled(z12);
    }

    @Override // com.avito.android.advert.d0
    public final void Jc(@Y61.k UniversalColor universalColor, @Y61.k AdvertNavBarStyle.ThemeAppearance themeAppearance, @Y61.l String str, boolean z12) {
        Menu menu;
        int size;
        com.avito.android.advert.navbar.f fVar = this.f71154c;
        if (fVar.f80833o.hasVisibleItems()) {
            return;
        }
        View view = this.f71152a;
        int iA2 = C48063a.f437606a.a(view.getContext(), universalColor);
        int i12 = z12 ? R.menu.advert_details_toolbar_brand_global : R.menu.advert_details;
        boolean z13 = fVar.f80832n;
        Toolbar toolbar = fVar.f80827i;
        if (z13) {
            toolbar.m(i12);
        } else {
            toolbar.m(i12);
        }
        fVar.d(iA2, str);
        r.c cVar = new r.c(universalColor);
        this.f71156e = cVar;
        int iA3 = com.avito.android.advert.navbar.s.a(cVar, view.getContext());
        if (!fVar.f80832n && (menu = toolbar.getMenu()) != null && (size = menu.size()) != 0) {
            kotlin.ranges.k it = kotlin.ranges.s.r(0, size).iterator();
            while (it.f406910d) {
                C35766c3.a(iA3, menu.getItem(it.a()));
            }
        }
        Drawable drawable = fVar.f80834p;
        if (drawable != null) {
            drawable.setTint(iA2);
        }
        int iD2 = d(themeAppearance);
        if (fVar.f80832n) {
            return;
        }
        P5.e(toolbar, iD2);
    }

    @Override // com.avito.android.advert.d0
    public final void Kc(@Y61.l UniversalImage universalImage, @Y61.k Y41.a<G0> aVar) {
        SimpleDraweeView simpleDraweeView = this.f71155d;
        if (simpleDraweeView == null) {
            return;
        }
        if (universalImage == null) {
            C35949t5.a(simpleDraweeView).b();
            simpleDraweeView.setVisibility(8);
            return;
        }
        simpleDraweeView.setVisibility(0);
        Image imageDependsOnThemeOrDefault = UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.b(simpleDraweeView.getContext()));
        ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
        aVarA.d(com.avito.android.image_loader.b.b(imageDependsOnThemeOrDefault));
        aVarA.c();
        simpleDraweeView.setOnClickListener(new com.avito.android.active_orders_common.items.order.n(1, aVar));
    }

    @Override // com.avito.android.advert.d0
    @Y61.k
    public final io.reactivex.rxjava3.core.z<G0> Lc() {
        com.avito.android.advert.navbar.f fVar = this.f71154c;
        io.reactivex.rxjava3.internal.operators.observable.C cB2 = kotlinx.coroutines.rx3.y.b(fVar.f80838t);
        MenuItem menuItemFindItem = fVar.f80833o.findItem(R.id.menu_add_to_compare);
        return io.reactivex.rxjava3.core.z.g0(cB2, menuItemFindItem != null ? C37719f.a(menuItemFindItem) : io.reactivex.rxjava3.internal.operators.observable.U.f403867b);
    }

    @Override // com.avito.android.advert.d0
    @Y61.k
    public final io.reactivex.rxjava3.core.z<G0> Mc() {
        com.avito.android.advert.navbar.f fVar = this.f71154c;
        io.reactivex.rxjava3.internal.operators.observable.C cB2 = kotlinx.coroutines.rx3.y.b(fVar.f80837s);
        MenuItem menuItemFindItem = fVar.f80833o.findItem(R.id.menu_share);
        return io.reactivex.rxjava3.core.z.g0(cB2, menuItemFindItem != null ? C37719f.a(menuItemFindItem) : io.reactivex.rxjava3.internal.operators.observable.U.f403867b);
    }

    /* JADX WARN: Type inference failed for: r10v8, types: [Y41.p, kotlin.jvm.internal.N] */
    @Override // com.avito.android.advert.d0
    @SuppressLint({"InflateParams"})
    public final void Nc(@Y61.k AdvertDetailsStyle advertDetailsStyle, @Y61.l AdvertNavBarStyle advertNavBarStyle, boolean z12) {
        com.avito.android.lib.beduin_v2.repository.cart_total_quantity.L l12 = this.f71153b;
        if (l12 == null) {
            return;
        }
        MenuItem menuItemC = c();
        View view = this.f71152a;
        View viewInflate = LayoutInflater.from(view.getContext()).inflate(R.layout.cart_menu_icon, (ViewGroup) null);
        menuItemC.setActionView(viewInflate);
        boolean z13 = false;
        if (advertNavBarStyle == null) {
            com.avito.android.advert.advert_details_style.c.a(advertDetailsStyle).f68634c.f68652d.invoke(menuItemC, this.f71156e);
        } else {
            com.avito.android.lib.beduin_v2.repository.cart_total_quantity.utils.a aVar = com.avito.android.lib.beduin_v2.repository.cart_total_quantity.utils.a.f176528a;
            a.AbstractC5229a.b bVar = new a.AbstractC5229a.b(0);
            UniversalColor elementsColor = advertNavBarStyle.getElementsColor();
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(C48063a.f437606a.a(view.getContext(), elementsColor));
            ColorStateList colorStateListValueOf2 = ColorStateList.valueOf(d(advertNavBarStyle.getThemeAppearance()));
            aVar.getClass();
            com.avito.android.lib.beduin_v2.repository.cart_total_quantity.utils.a.b(viewInflate, bVar, colorStateListValueOf, colorStateListValueOf2, 1.0f);
            com.avito.android.lib.beduin_v2.repository.cart_total_quantity.utils.a.c(viewInflate, androidx.core.content.d.getColor(view.getContext(), R.color.common_red), 0, false);
        }
        if (l12.d() && z12) {
            z13 = true;
        }
        menuItemC.setVisible(z13);
    }

    @Override // com.avito.android.advert.d0
    public final void Oc(@Y61.k Throwable th2) {
        com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, this.f71152a, com.avito.android.printable_text.b.c(R.string.advert_details_menu_share_error, new Serializable[0]), null, null, null, new f.c(th2), 0, ToastBarPosition.f181046d, null, false, false, null, null, 4014);
    }

    @Override // com.avito.android.advert.d0
    public final void Pc(boolean z12, boolean z13) {
        boolean z14 = this.f71159h;
        com.avito.android.advert.navbar.f fVar = this.f71154c;
        if (z14) {
            fVar.getClass();
            fVar.h(z12, q.f.f80874a);
            return;
        }
        MenuItem menuItemFindItem = fVar.f80833o.findItem(R.id.menu_share);
        if (menuItemFindItem == null) {
            throw new IllegalArgumentException("Toolbar was not inflated");
        }
        if (z13) {
            View view = this.f71152a;
            menuItemFindItem.setIcon(C35835l0.j(R.attr.ic_share24, view.getContext()));
            C35766c3.a(com.avito.android.advert.navbar.s.a(this.f71156e, view.getContext()), menuItemFindItem);
        }
        menuItemFindItem.setVisible(z12);
    }

    @Override // com.avito.android.advert.d0
    public final void Qc(@Y61.k UniversalColor universalColor, @Y61.k UniversalColor universalColor2, @Y61.l String str) {
        View view = this.f71152a;
        Context context = view.getContext();
        C48063a c48063a = C48063a.f437606a;
        int iA2 = c48063a.a(context, universalColor);
        int iA3 = c48063a.a(view.getContext(), universalColor2);
        com.avito.android.advert.navbar.f fVar = this.f71154c;
        if (!fVar.f80832n) {
            fVar.f80827i.setBackgroundColor(iA2);
        }
        fVar.d(iA3, str);
    }

    @Override // com.avito.android.advert.d0
    @Y61.k
    public final io.reactivex.rxjava3.core.z<G0> Rc() {
        com.avito.android.advert.navbar.f fVar = this.f71154c;
        return io.reactivex.rxjava3.core.z.g0(kotlinx.coroutines.rx3.y.b(fVar.f80841w), P5.g(fVar.f80827i));
    }

    @Override // com.avito.android.advert.d0
    @Y61.k
    public final io.reactivex.rxjava3.core.z<View> Sc() {
        return this.f71154c.c();
    }

    @Override // com.avito.android.advert.d0
    public final boolean Tc() {
        View view = this.f71154c.f80829k;
        return (view == null || kotlin.jvm.internal.L.d(Float.valueOf(view.getAlpha()), 0.0f)) ? false : true;
    }

    @Override // com.avito.android.advert.d0
    public final void Uc(@j.e0 int i12) {
        a().setTitle(i12);
    }

    @Override // com.avito.android.advert.d0
    public final void Vc(@Y61.k PrintableText printableText, @Y61.k Throwable th2) {
        com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, this.f71152a, printableText, null, null, null, new f.c(th2), 0, ToastBarPosition.f181046d, null, false, false, null, null, 4014);
    }

    @Override // com.avito.android.advert.d0
    public final void Wc(boolean z12) {
        boolean z13 = this.f71159h;
        int i12 = R.drawable.ic_add_to_comparison;
        if (!z13) {
            MenuItem menuItemB = b();
            menuItemB.setChecked(z12);
            if (z12) {
                i12 = R.drawable.ic_add_to_comparison_selected;
            }
            menuItemB.setIcon(i12);
            return;
        }
        if (z12) {
            i12 = R.drawable.ic_add_to_comparison_selected;
        }
        com.avito.android.advert.navbar.f fVar = this.f71154c;
        fVar.getClass();
        fVar.g(i12, q.a.f80869a);
        fVar.j();
    }

    @Override // com.avito.android.advert.d0
    @Y61.k
    public final io.reactivex.rxjava3.core.z<G0> Xc() {
        com.avito.android.lib.beduin_v2.repository.cart_total_quantity.L l12 = this.f71153b;
        return l12 != null ? l12.b(c()) : io.reactivex.rxjava3.internal.operators.observable.U.f403867b;
    }

    @Override // com.avito.android.advert.d0
    public final void Yc(@Y61.k Y41.a aVar, @Y61.k String str, @Y61.k String str2) {
        com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, this.f71152a, com.avito.android.printable_text.b.f(str), null, Collections.singletonList(new c.a.C3719a(str2, false, null, aVar, 6, null)), null, null, 0, null, null, false, false, null, null, 4090);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // com.avito.android.advert.d0
    public final void Zc() {
        this.f71157f.invoke();
    }

    public final MenuItem a() {
        MenuItem menuItemFindItem = this.f71154c.f80833o.findItem(R.id.menu_add_note);
        if (menuItemFindItem != null) {
            return menuItemFindItem;
        }
        throw new IllegalArgumentException("Toolbar was not inflated");
    }

    @Override // com.avito.android.advert.d0
    public final void ad(@Y61.k String str, @Y61.k String str2, @Y61.k Throwable th2, @Y61.k Y41.a<G0> aVar) {
        com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
        PrintableText printableTextF = com.avito.android.printable_text.b.f(str);
        f.c cVar2 = new f.c(th2);
        com.avito.android.component.toast.c.b(cVar, this.f71152a, printableTextF, null, Collections.singletonList(new c.a.C3719a(str2, false, null, aVar, 6, null)), null, cVar2, 0, null, null, false, false, null, null, 4074);
    }

    public final MenuItem b() {
        MenuItem menuItemFindItem = this.f71154c.f80833o.findItem(R.id.menu_add_to_compare);
        if (menuItemFindItem != null) {
            return menuItemFindItem;
        }
        throw new IllegalArgumentException("Toolbar was not inflated");
    }

    @Override // com.avito.android.advert.d0
    @Y61.k
    public final io.reactivex.rxjava3.core.z<G0> bd() {
        com.avito.android.advert.navbar.f fVar = this.f71154c;
        io.reactivex.rxjava3.internal.operators.observable.C cB2 = kotlinx.coroutines.rx3.y.b(fVar.f80836r);
        MenuItem menuItemFindItem = fVar.f80833o.findItem(R.id.menu_subscription);
        return io.reactivex.rxjava3.core.z.g0(cB2, menuItemFindItem != null ? C37719f.a(menuItemFindItem) : io.reactivex.rxjava3.internal.operators.observable.U.f403867b);
    }

    public final MenuItem c() {
        MenuItem menuItemFindItem = this.f71154c.f80833o.findItem(R.id.menu_cart_item);
        if (menuItemFindItem != null) {
            return menuItemFindItem;
        }
        throw new IllegalArgumentException("Toolbar was not inflated");
    }

    @Override // com.avito.android.advert.d0
    public final void cd() {
        if (this.f71159h) {
            return;
        }
        Drawable icon = b().setIcon(R.drawable.comparison_onboarding_animation).getIcon();
        AnimatedVectorDrawable animatedVectorDrawable = icon instanceof AnimatedVectorDrawable ? (AnimatedVectorDrawable) icon : null;
        if (animatedVectorDrawable != null) {
            animatedVectorDrawable.start();
        }
    }

    @InterfaceC42156l
    public final int d(AdvertNavBarStyle.ThemeAppearance themeAppearance) {
        ThemeAppearance searchViewThemeAppearance = AdvertNavBarStyleKt.toSearchViewThemeAppearance(themeAppearance);
        View view = this.f71152a;
        return androidx.core.content.d.getColor(view.getContext(), com.avito.android.lib.util.darkTheme.d.a(searchViewThemeAppearance, com.avito.android.lib.util.darkTheme.c.a(view.getContext())) ? R.color.custom_product_color_constant_warm_gray_36 : R.color.custom_product_color_constant_warm_gray_36_night);
    }

    public final void e(boolean z12) {
        boolean z13 = this.f71159h;
        View view = this.f71152a;
        com.avito.android.advert.navbar.f fVar = this.f71154c;
        if (z13) {
            fVar.e(z12 ? com.avito.android.lib.util.darkTheme.c.b(view.getContext()) ? R.attr.red900 : R.attr.red600 : R.attr.black);
            return;
        }
        MenuItem menuItemFindItem = fVar.f80833o.findItem(R.id.menu_subscription);
        if (menuItemFindItem == null) {
            throw new IllegalArgumentException("Toolbar was not inflated");
        }
        if (z12) {
            C35766c3.a(androidx.core.content.d.getColor(view.getContext(), R.color.expected_favorites_icon_selected), menuItemFindItem);
        } else {
            C35766c3.a(com.avito.android.advert.navbar.s.a(this.f71156e, view.getContext()), menuItemFindItem);
        }
    }

    @Override // com.avito.android.advert.d0
    @Y61.k
    public final NavBar getView() {
        return this.f71154c.f80828j;
    }

    @Override // com.avito.android.advert.d0
    public final void setFavorite(boolean z12) {
        boolean z13 = this.f71159h;
        com.avito.android.advert.navbar.f fVar = this.f71154c;
        int i12 = R.drawable.ic_fav_24_rich;
        if (z13) {
            if (z12) {
                i12 = R.drawable.ic_fav_24_rich_selected;
            }
            fVar.getClass();
            fVar.g(i12, q.c.f80871a);
            fVar.j();
            e(z12);
            return;
        }
        MenuItem menuItemFindItem = fVar.f80833o.findItem(R.id.menu_subscription);
        if (menuItemFindItem == null) {
            throw new IllegalArgumentException("Toolbar was not inflated");
        }
        menuItemFindItem.setChecked(z12);
        if (z12) {
            i12 = R.drawable.ic_fav_24_rich_selected;
        }
        menuItemFindItem.setIcon(i12);
        e(z12);
    }

    @Override // com.avito.android.advert.d0
    public final void wc(@Y61.k String str) {
        L5.b(this.f71152a.getContext(), str, 0);
    }

    @Override // com.avito.android.advert.d0
    public final void xc(boolean z12) {
        if (this.f71159h) {
            return;
        }
        a().setVisible(z12);
    }

    @Override // com.avito.android.advert.d0
    public final void yc(@Y61.l com.avito.android.advert.navbar.e eVar) {
        if (eVar == null) {
            return;
        }
        this.f71159h = true;
        this.f71154c.i(eVar);
    }

    @Override // com.avito.android.advert.d0
    public final void zc(boolean z12) {
        boolean z13 = this.f71159h;
        com.avito.android.advert.navbar.f fVar = this.f71154c;
        if (z13) {
            fVar.getClass();
            fVar.h(z12, q.d.f80872a);
        } else {
            MenuItem menuItemFindItem = fVar.f80833o.findItem(R.id.menu_download_buttons_dropdown);
            if (menuItemFindItem == null) {
                throw new IllegalArgumentException("Toolbar was not inflated");
            }
            menuItemFindItem.setVisible(z12);
        }
    }
}
