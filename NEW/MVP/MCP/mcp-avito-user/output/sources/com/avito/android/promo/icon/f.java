package com.avito.android.promo.icon;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.avito.android.R;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.lib.design.banner.a;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.gradient.AvitoLinearGradientDrawable;
import com.avito.android.promo.PromoAction;
import com.avito.android.promo.PromoStyle;
import com.avito.android.promo.PromoWidgetItem;
import com.avito.android.util.C35835l0;
import j.f0;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import ld0.C43730a;
import ld0.C43731b;
import ld0.C43735f;
import ld0.InterfaceC43733d;
import ld0.InterfaceC43734e;

/* compiled from: PromoWidgetItemIconViewImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/promo/icon/f;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/promo/icon/e;", "Lld0/e;", "_avito_bx-content_widget_promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f extends com.avito.konveyor.adapter.b implements e, InterfaceC43734e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C43735f f231646b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f231647c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ImageView f231648d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f231649e;

    /* renamed from: f, reason: collision with root package name */
    public final int f231650f;

    /* renamed from: g, reason: collision with root package name */
    public final int f231651g;

    public f(@k View view, @k InterfaceC43733d interfaceC43733d) {
        super(view);
        View viewInflate = LayoutInflater.from(new androidx.appcompat.view.d(view.getContext(), R.style.Theme_DesignSystem_Re23)).inflate(R.layout.promo_block_with_icon_content, (ViewGroup) null);
        this.f231646b = new C43735f(view, interfaceC43733d, viewInflate);
        Context context = view.getContext();
        this.f231647c = context;
        View viewFindViewById = viewInflate.findViewById(R.id.promo_image);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f231648d = (ImageView) viewFindViewById;
        this.f231649e = view.getResources().getBoolean(R.bool.is_tablet);
        this.f231650f = view.getResources().getDimensionPixelSize(R.dimen.serp_horizontal_padding);
        this.f231651g = context.getResources().getDimensionPixelSize(R.dimen.serp_promo_banner_gradient_corner_radius);
    }

    @Override // com.avito.android.promo.icon.e
    public final void A2(@l String str) {
        C43731b.f413953a.getClass();
        Integer numValueOf = L.f(str, "developmentsCatalog") ? Integer.valueOf(R.drawable.ic_promo_developments_catalog) : null;
        ImageView imageView = this.f231648d;
        if (numValueOf == null) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            imageView.setImageResource(numValueOf.intValue());
        }
    }

    @Override // ld0.InterfaceC43734e
    public final void BM(@f0 int i12) {
        this.f231646b.BM(R.style.Re23_Text_H20);
    }

    @Override // ld0.InterfaceC43734e
    public final void Gg(@l String str, boolean z12) {
        this.f231646b.Gg(str, z12);
    }

    @Override // ld0.InterfaceC43734e
    public final void SG(@k List<PromoAction> list, @k PromoWidgetItem promoWidgetItem, int i12) {
        this.f231646b.SG(list, promoWidgetItem, i12);
    }

    @Override // ld0.InterfaceC43734e
    public final void W2() {
        this.f231646b.W2();
    }

    @Override // ld0.InterfaceC43734e
    public final void WU(@k PromoStyle promoStyle, boolean z12) throws Resources.NotFoundException {
        G0 g02;
        com.avito.android.lib.design.banner.a aVarA;
        C43731b.f413953a.getClass();
        C43730a c43730aB = C43731b.b(promoStyle);
        int[] iArr = d.n.f178966f;
        boolean z13 = this.f231649e;
        C43735f c43735f = this.f231646b;
        Context context = this.f231647c;
        if (c43730aB != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(C35835l0.j(c43730aB.f413951a, context), iArr);
            Banner banner = c43735f.f413961g;
            a.C5258a c5258a = com.avito.android.lib.design.banner.a.f178448x;
            Context context2 = banner.getContext();
            c5258a.getClass();
            com.avito.android.lib.design.banner.a aVarC = a.C5258a.c(typedArrayObtainStyledAttributes, context2);
            int i12 = this.f231651g;
            int i13 = c43730aB.f413952b;
            if (z13) {
                AvitoLinearGradientDrawable.a.C5275a c5275a = new AvitoLinearGradientDrawable.a.C5275a(this.f231647c, i13, 0, 4, null);
                c5275a.f179264a = i12;
                aVarA = com.avito.android.lib.design.banner.a.a(aVarC, null, null, new AvitoLinearGradientDrawable(c5275a.a()), 0, 0, this.f231650f, 0, false, 0.0f, false, false, 8388363);
            } else {
                AvitoLinearGradientDrawable.a.C5275a c5275a2 = new AvitoLinearGradientDrawable.a.C5275a(this.f231647c, i13, 0, 4, null);
                c5275a2.f179264a = i12;
                aVarA = com.avito.android.lib.design.banner.a.a(aVarC, null, null, new AvitoLinearGradientDrawable(c5275a2.a()), 0, 0, 0, 0, false, 0.0f, false, false, 8388443);
            }
            banner.setStyle(aVarA);
            typedArrayObtainStyledAttributes.recycle();
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(C35835l0.j(C43731b.a(promoStyle), context), iArr);
            Banner banner2 = c43735f.f413961g;
            a.C5258a c5258a2 = com.avito.android.lib.design.banner.a.f178448x;
            Context context3 = banner2.getContext();
            c5258a2.getClass();
            com.avito.android.lib.design.banner.a aVarC2 = a.C5258a.c(typedArrayObtainStyledAttributes2, context3);
            banner2.setStyle(z13 ? com.avito.android.lib.design.banner.a.a(aVarC2, null, null, null, 0, 0, this.f231650f, 0, false, 0.0f, false, false, 8388363) : com.avito.android.lib.design.banner.a.a(aVarC2, null, null, null, 0, 0, 0, 0, false, 0.0f, false, false, 8388443));
            typedArrayObtainStyledAttributes2.recycle();
        }
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f231646b.getClass();
    }

    @Override // ld0.InterfaceC43734e
    public final void r6(@k String str) {
        this.f231646b.r6(str);
    }

    @Override // ld0.InterfaceC43734e
    public final void v8() {
        this.f231646b.v8();
    }
}
