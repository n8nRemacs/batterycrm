package com.avito.android.tariff.cpx.configure.landing.items.card;

import Y41.l;
import Y61.k;
import android.content.res.Resources;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.docking_badge.DockingBadgeContainer;
import com.avito.android.lib.design.docking_badge.DockingBadgeItem;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.text.j;
import com.avito.android.util.y6;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: CpxConfigureLandingCardItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/landing/items/card/i;", "Lcom/avito/android/tariff/cpx/configure/landing/items/card/h;", "Lcom/avito/konveyor/adapter/b;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f295981b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final View f295982c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final DockingBadgeContainer f295983d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Button f295984e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final SimpleDraweeView f295985f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final LinearLayout f295986g;

    public i(@k View view) {
        super(view);
        this.f295981b = view;
        View viewFindViewById = view.findViewById(R.id.cpx_configure_landing_card_item);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f295982c = viewFindViewById;
        View viewFindViewById2 = viewFindViewById.findViewById(R.id.badge_bar);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.docking_badge.DockingBadgeContainer");
        }
        this.f295983d = (DockingBadgeContainer) viewFindViewById2;
        View viewFindViewById3 = viewFindViewById.findViewById(R.id.button);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f295984e = (Button) viewFindViewById3;
        View viewFindViewById4 = viewFindViewById.findViewById(R.id.image);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f295985f = (SimpleDraweeView) viewFindViewById4;
        View viewFindViewById5 = viewFindViewById.findViewById(R.id.texts);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f295986g = (LinearLayout) viewFindViewById5;
    }

    @Override // com.avito.android.tariff.cpx.configure.landing.items.card.h
    public final void Ez(@k l lVar, @k com.avito.android.util.text.a aVar, @k ArrayList arrayList) {
        LinearLayout linearLayout = this.f295986g;
        if (linearLayout.getChildCount() > 0) {
            linearLayout.removeAllViews();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            com.avito.android.lib.design.text_view.a aVar2 = new com.avito.android.lib.design.text_view.a(linearLayout.getContext(), null, 0, 0, 14, null);
            j.c(aVar2, gVar.f295979a, aVar);
            XA0.d.a(aVar2, aVar, gVar.f295979a, lVar);
            Integer num = gVar.f295980b;
            D6.f(aVar2, 0, 0, 0, num != null ? y6.b(num.intValue()) : 0, 7);
            linearLayout.addView(aVar2);
        }
    }

    @Override // com.avito.android.tariff.cpx.configure.landing.items.card.h
    public final void L1() {
        D6.w(this.f295984e);
    }

    @Override // com.avito.android.tariff.cpx.configure.landing.items.card.h
    public final void P3(@k List<DockingBadgeItem> list) {
        DockingBadgeContainer dockingBadgeContainer = this.f295983d;
        dockingBadgeContainer.setBadgeItems(list);
        D6.c(this.f295982c, null, Integer.valueOf(y6.b(22)), null, null, 13);
        D6.H(dockingBadgeContainer);
    }

    @Override // com.avito.android.tariff.cpx.configure.landing.items.card.h
    public final void XR() {
        LinearLayout linearLayout = this.f295986g;
        linearLayout.removeAllViews();
        D6.w(linearLayout);
    }

    @Override // com.avito.android.tariff.cpx.configure.landing.items.card.h
    public final void gc(@k ButtonAction buttonAction, @k l<? super DeepLink, G0> lVar) throws Resources.NotFoundException {
        String title = buttonAction.getTitle();
        Button button = this.f295984e;
        com.avito.android.lib.design.button.b.a(button, title, false);
        String style = buttonAction.getStyle();
        if (style != null) {
            button.setAppearance(C35835l0.j(com.avito.android.lib.util.f.d(style), button.getContext()));
        }
        button.setEnabled(!L.f(buttonAction.isEnabled(), Boolean.FALSE));
        DeepLink deeplink = buttonAction.getDeeplink();
        if (deeplink != null) {
            button.setOnClickListener(new XA0.c(lVar, deeplink, 0));
        } else {
            button.setOnClickListener(null);
        }
    }

    @Override // com.avito.android.tariff.cpx.configure.landing.items.card.h
    public final void i(@k UniversalImage universalImage) {
        SimpleDraweeView simpleDraweeView = this.f295985f;
        C35949t5.c(simpleDraweeView, com.avito.android.image_loader.b.b(UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.b(simpleDraweeView.getContext()))), null, null, null, 14);
        D6.H(simpleDraweeView);
    }

    @Override // com.avito.android.tariff.cpx.configure.landing.items.card.h
    public final void lC() {
        D6.c(this.f295982c, null, Integer.valueOf(y6.b(12)), null, null, 13);
        D6.w(this.f295983d);
    }

    @Override // com.avito.android.tariff.cpx.configure.landing.items.card.h
    public final void p0() {
        D6.w(this.f295985f);
    }
}
