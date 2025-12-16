package ld0;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.lib.design.banner.a;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.gradient.AvitoLinearGradientDrawable;
import com.avito.android.promo.PromoAction;
import com.avito.android.promo.PromoActionStyle;
import com.avito.android.promo.PromoStyle;
import com.avito.android.promo.PromoWidgetItem;
import com.avito.android.promo.mini.g;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import com.google.android.flexbox.FlexboxLayout;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import ld0.C43731b;

/* compiled from: PromoWidgetItemViewImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lld0/f;", "Lcom/avito/android/lib/util/groupable_item/e;", "Lld0/e;", "_avito_bx-content_widget_promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ld0.f, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C43735f implements com.avito.android.lib.util.groupable_item.e, InterfaceC43734e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC43733d f413956b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final View f413957c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f413958d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f413959e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final FlexboxLayout f413960f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Banner f413961g;

    /* renamed from: h, reason: collision with root package name */
    public final int f413962h;

    public C43735f(@k View view, @k InterfaceC43733d interfaceC43733d, @k View view2) {
        this.f413956b = interfaceC43733d;
        this.f413957c = view2;
        Context context = view.getContext();
        this.f413958d = context;
        View viewFindViewById = view2.findViewById(R.id.promo_text);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f413959e = (TextView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.promo_actions_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayout");
        }
        this.f413960f = (FlexboxLayout) viewFindViewById2;
        Banner banner = (Banner) view.findViewById(R.id.vertical_promo_root);
        this.f413961g = banner;
        this.f413962h = context.getResources().getDimensionPixelSize(R.dimen.serp_promo_banner_gradient_corner_radius);
        banner.setAppearanceFromAttr(R.attr.bannerBeige);
        banner.setContentView(view2);
    }

    @Override // ld0.InterfaceC43734e
    public final void BM(int i12) {
        this.f413961g.setTitleTextAppearance(R.style.Re23_Text_H20);
    }

    @Override // ld0.InterfaceC43734e
    public final void Gg(@l String str, boolean z12) {
        this.f413961g.setTitle(str);
    }

    @Override // ld0.InterfaceC43734e
    public final void SG(@k List<PromoAction> list, @k PromoWidgetItem promoWidgetItem, int i12) {
        int i13;
        FlexboxLayout flexboxLayout = this.f413960f;
        flexboxLayout.removeAllViews();
        for (PromoAction promoAction : list) {
            C43731b c43731b = C43731b.f413953a;
            PromoActionStyle style = promoAction.getStyle();
            c43731b.getClass();
            switch (style == null ? -1 : C43731b.a.f413955b[style.ordinal()]) {
                case 1:
                    i13 = R.layout.promo_primary_action;
                    break;
                case 2:
                default:
                    i13 = R.layout.promo_secondary_action;
                    break;
                case 3:
                    i13 = R.layout.promo_accent_action;
                    break;
                case 4:
                    i13 = R.layout.promo_accent_secondary_action;
                    break;
                case 5:
                    i13 = R.layout.promo_overlay_action;
                    break;
                case 6:
                    i13 = R.layout.promo_overlay_secondary_action;
                    break;
                case 7:
                    i13 = R.layout.promo_pay_action;
                    break;
                case 8:
                    i13 = R.layout.promo_pay_secondary_action;
                    break;
                case 9:
                    i13 = R.layout.promo_success_action;
                    break;
                case 10:
                    i13 = R.layout.promo_danger_action;
                    break;
                case 11:
                    i13 = R.layout.promo_inverse_action;
                    break;
                case 12:
                    i13 = R.layout.promo_inverse_secondary_action;
                    break;
            }
            Button button = (Button) LayoutInflater.from(new androidx.appcompat.view.d(this.f413961g.getThemedContext(), R.style.Theme_DesignSystem_Re23)).inflate(i13, (ViewGroup) flexboxLayout, false);
            com.avito.android.lib.design.button.b.a(button, promoAction.getTitle(), false);
            button.setOnClickListener(new g(this, promoAction, promoWidgetItem, i12, 1));
            flexboxLayout.addView(button);
        }
    }

    @Override // com.avito.android.lib.util.groupable_item.e
    public final void Tz(boolean z12, boolean z13) {
        this.f413961g.Tz(z12, z13);
    }

    @Override // ld0.InterfaceC43734e
    public final void W2() {
        this.f413960f.removeAllViews();
    }

    @Override // ld0.InterfaceC43734e
    public final void WU(@k PromoStyle promoStyle, boolean z12) {
        G0 g02;
        C43731b.f413953a.getClass();
        C43730a c43730aB = C43731b.b(promoStyle);
        Banner banner = this.f413961g;
        if (c43730aB != null) {
            int i12 = c43730aB.f413951a;
            Context context = this.f413958d;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(C35835l0.j(i12, context), d.n.f178966f);
            a.C5258a c5258a = com.avito.android.lib.design.banner.a.f178448x;
            Context context2 = banner.getContext();
            c5258a.getClass();
            com.avito.android.lib.design.banner.a aVarC = a.C5258a.c(typedArrayObtainStyledAttributes, context2);
            AvitoLinearGradientDrawable.a.C5275a c5275a = new AvitoLinearGradientDrawable.a.C5275a(this.f413958d, c43730aB.f413952b, 0, 4, null);
            c5275a.f179264a = this.f413962h;
            banner.setStyle(com.avito.android.lib.design.banner.a.a(aVarC, null, null, new AvitoLinearGradientDrawable(c5275a.a()), 0, 0, 0, 0, false, 0.0f, false, false, 8388603));
            typedArrayObtainStyledAttributes.recycle();
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            banner.setAppearanceFromAttr(C43731b.a(promoStyle));
        }
    }

    @Override // TV0.e
    public final void j5() {
        throw null;
    }

    @Override // ld0.InterfaceC43734e
    public final void r6(@k String str) {
        TextView textView = this.f413959e;
        textView.setVisibility(0);
        I5.a(textView, str, false);
    }

    @Override // ld0.InterfaceC43734e
    public final void v8() {
        TextView textView = this.f413959e;
        textView.setVisibility(8);
        I5.a(textView, "", false);
    }
}
