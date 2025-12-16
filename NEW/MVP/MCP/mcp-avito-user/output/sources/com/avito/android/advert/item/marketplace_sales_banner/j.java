package com.avito.android.advert.item.marketplace_sales_banner;

import PK0.n;
import Y61.k;
import Y61.l;
import Y9.c;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.lib.design.badge.g;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.util.v;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.sales.Background;
import com.avito.android.remote.model.sales.BannerBadge;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35763c0;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.facebook.drawee.drawable.s;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: MarketplaceSalesBannerView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/marketplace_sales_banner/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/marketplace_sales_banner/i;", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f77554k = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Banner f77555b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ConstraintLayout f77556c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f77557d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f77558e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Guideline f77559f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final SimpleDraweeView f77560g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final Badge f77561h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final Button f77562i;

    /* renamed from: j, reason: collision with root package name */
    public int f77563j;

    /* compiled from: MarketplaceSalesBannerView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/advert/item/marketplace_sales_banner/j$a;", "", "<init>", "()V", "", "SUBTITLE_LINES_LIMIT", "I", "TITLE_LINES_LIMIT", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public j(@k Banner banner) {
        super(banner);
        this.f77555b = banner;
        View viewFindViewById = banner.findViewById(R.id.sales_banner_content);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        }
        this.f77556c = (ConstraintLayout) viewFindViewById;
        View viewFindViewById2 = banner.findViewById(R.id.banner_title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f77557d = (TextView) viewFindViewById2;
        View viewFindViewById3 = banner.findViewById(R.id.banner_subtitle);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f77558e = (TextView) viewFindViewById3;
        View viewFindViewById4 = banner.findViewById(R.id.banner_guideline);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.Guideline");
        }
        this.f77559f = (Guideline) viewFindViewById4;
        View viewFindViewById5 = banner.findViewById(R.id.banner_image);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f77560g = (SimpleDraweeView) viewFindViewById5;
        View viewFindViewById6 = banner.findViewById(R.id.banner_badge);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.badge.Badge");
        }
        this.f77561h = (Badge) viewFindViewById6;
        View viewFindViewById7 = banner.findViewById(R.id.banner_button);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f77562i = (Button) viewFindViewById7;
        this.f77563j = banner.getContext().getResources().getDimensionPixelSize(R.dimen.default_banner_bottom_margin);
    }

    public final Integer B80(int i12) {
        if (i12 == 0) {
            return -1;
        }
        if (i12 != 1) {
            return null;
        }
        return Integer.valueOf(this.f77556c.getId());
    }

    public final void C80(TextView textView, int i12) {
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        if (i12 == 0) {
            bVar.f44218v = -1;
            bVar.f44219w = -1;
            this.f77557d.getLayoutParams().width = textView.getContext().getResources().getDimensionPixelSize(R.dimen.default_title_and_subtitle_width);
            this.f77558e.getLayoutParams().width = textView.getContext().getResources().getDimensionPixelSize(R.dimen.default_title_and_subtitle_width);
        } else if (i12 == 1) {
            bVar.f44219w = -1;
            bVar.f44218v = this.f77560g.getId();
        }
        textView.setLayoutParams(bVar);
    }

    @Override // com.avito.android.advert.item.marketplace_sales_banner.i
    public final void F5() {
        View view = this.f77562i;
        if (view.getVisibility() != 0) {
            view = this.f77561h;
            if (view.getVisibility() != 0) {
                view = this.f77558e;
                if (view.getVisibility() != 0) {
                    view = this.f77557d;
                }
            }
        }
        View view2 = view;
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        bVar.f44203m = this.f77556c.getId();
        view2.setLayoutParams(bVar);
        D6.c(view2, null, null, null, Integer.valueOf(this.f77563j), 7);
    }

    @Override // com.avito.android.advert.item.marketplace_sales_banner.i
    public final void In(@k Background background) {
        Banner banner = this.f77555b;
        Banner.h(banner, ColorStateList.valueOf(C48063a.f437606a.a(banner.getContext(), background.getColor())));
        Float opacity = background.getOpacity();
        banner.setAlpha(opacity != null ? opacity.floatValue() : 1.0f);
    }

    @Override // com.avito.android.advert.item.marketplace_sales_banner.i
    public final void P6() {
        v.a(this.f77560g, this.f77555b.getContext().getResources().getDimensionPixelSize(R.dimen.banner_v2_image_corner_radius));
    }

    @Override // com.avito.android.advert.item.marketplace_sales_banner.i
    public final void Yo(@l BannerBadge bannerBadge) {
        String text;
        C35763c0 c35763c0A;
        G0 g02 = null;
        c35763c0A = null;
        C35763c0 c35763c0A2 = null;
        n nVarA = null;
        g02 = null;
        Badge badge = this.f77561h;
        if (bannerBadge != null && (text = bannerBadge.getText()) != null) {
            g.a aVar = com.avito.android.lib.design.badge.g.f178395r;
            Context context = badge.getContext();
            int iJ2 = C35835l0.j(R.attr.badgeTextBlackM, badge.getContext());
            aVar.getClass();
            com.avito.android.lib.design.badge.g gVarB = g.a.b(iJ2, context);
            UniversalColor backgroundColor = bannerBadge.getBackgroundColor();
            if (backgroundColor != null) {
                int iA2 = C48063a.f437606a.a(badge.getContext(), backgroundColor);
                C35763c0 c35763c0 = gVarB.f178401f;
                c35763c0A = c35763c0 != null ? C35763c0.a(c35763c0, iA2) : null;
            } else {
                c35763c0A = null;
            }
            n nVar = gVarB.f178396a;
            if (nVar != null) {
                UniversalColor textColor = bannerBadge.getTextColor();
                if (textColor != null) {
                    int iA3 = C48063a.f437606a.a(badge.getContext(), textColor);
                    C35763c0 c35763c02 = nVar.f12988b;
                    if (c35763c02 != null) {
                        c35763c0A2 = C35763c0.a(c35763c02, iA3);
                    }
                }
                nVarA = n.a(nVar, null, c35763c0A2, null, null, null, null, null, null, null, 8189);
            }
            badge.setStyle(com.avito.android.lib.design.badge.g.a(gVarB, nVarA, 0, 0, c35763c0A, 0, null, 0, 0, 0.0f, g.c.a(gVarB.f178409n), 122846));
            badge.setState(new com.avito.android.lib.design.badge.f(text, Boolean.FALSE, false, 4, null));
            D6.H(badge);
            g02 = G0.f406611a;
        }
        if (g02 == null) {
            D6.w(badge);
        }
    }

    @Override // com.avito.android.advert.item.marketplace_sales_banner.i
    public final void bi(@l com.avito.android.remote.model.sales.Button button, @k Y41.a<G0> aVar) {
        Button button2 = this.f77562i;
        if (button == null) {
            button2.setOnClickListener(null);
            D6.w(button2);
        } else {
            D6.H(button2);
            button2.setText(button.getText());
            button2.setAppearanceFromAttr(com.avito.android.lib.util.f.d(button.getStyle()));
            button2.setOnClickListener(new com.avito.android.active_orders_common.items.order.n(23, aVar));
        }
    }

    @Override // com.avito.android.advert.item.marketplace_sales_banner.i
    public final void i(@l UniversalImage universalImage) {
        Image imageDependsOnThemeOrDefault = universalImage != null ? UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.b(this.f77555b.getContext())) : null;
        SimpleDraweeView simpleDraweeView = this.f77560g;
        if (imageDependsOnThemeOrDefault == null) {
            D6.w(simpleDraweeView);
        } else {
            D6.H(simpleDraweeView);
            com.avito.android.advert.item.delivery_suggests.l.w(imageDependsOnThemeOrDefault, C35949t5.a(simpleDraweeView));
        }
    }

    @Override // com.avito.android.advert.item.marketplace_sales_banner.i
    public final void j0(int i12) {
        Banner banner = this.f77555b;
        TypedArray typedArrayObtainStyledAttributes = banner.getContext().obtainStyledAttributes(null, c.l.f19369b, 0, i12);
        this.f77563j = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, banner.getContext().getResources().getDimensionPixelSize(R.dimen.default_banner_bottom_margin));
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(7, 0);
        ViewGroup.LayoutParams layoutParams = banner.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginStart(dimensionPixelOffset);
        marginLayoutParams.setMarginEnd(dimensionPixelOffset);
        banner.setLayoutParams(marginLayoutParams);
        Guideline guideline = this.f77559f;
        ViewGroup.LayoutParams layoutParams2 = guideline.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams2;
        bVar.f44185d = typedArrayObtainStyledAttributes.getFloat(8, 0.7f);
        guideline.setLayoutParams(bVar);
        int i13 = typedArrayObtainStyledAttributes.getInt(5, -1);
        int i14 = typedArrayObtainStyledAttributes.getInt(2, -1);
        int i15 = typedArrayObtainStyledAttributes.getInt(6, -1);
        int i16 = typedArrayObtainStyledAttributes.getInt(1, -1);
        Integer numB80 = B80(i13);
        Integer numB802 = B80(i14);
        Integer numB803 = B80(i15);
        Integer numB804 = B80(i16);
        SimpleDraweeView simpleDraweeView = this.f77560g;
        ViewGroup.LayoutParams layoutParams3 = simpleDraweeView.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams3;
        if (numB80 != null) {
            bVar2.f44217u = numB80.intValue();
        }
        if (numB802 != null) {
            bVar2.f44219w = numB802.intValue();
        }
        if (numB803 != null) {
            bVar2.f44197j = numB803.intValue();
        }
        if (numB804 != null) {
            bVar2.f44203m = numB804.intValue();
        }
        simpleDraweeView.setLayoutParams(bVar2);
        C80(this.f77557d, typedArrayObtainStyledAttributes.getInt(9, -1));
        C80(this.f77558e, typedArrayObtainStyledAttributes.getInt(9, -1));
        s.a aVarA = Y5.b.a(Integer.valueOf(typedArrayObtainStyledAttributes.getInt(4, -1)));
        if (aVarA != null) {
            ((GW0.a) simpleDraweeView.getHierarchy()).n(aVarA);
        }
        ViewGroup.LayoutParams layoutParams4 = simpleDraweeView.getLayoutParams();
        if (layoutParams4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar3 = (ConstraintLayout.b) layoutParams4;
        bVar3.f44161H = typedArrayObtainStyledAttributes.getString(3);
        simpleDraweeView.setLayoutParams(bVar3);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // com.avito.android.advert.item.marketplace_sales_banner.i
    public final void k(@l AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f77558e, attributedText, null);
    }

    @Override // com.avito.android.advert.item.marketplace_sales_banner.i
    public final void setTitle(@l String str) {
        I5.a(this.f77557d, str, false);
    }

    @Override // com.avito.android.advert.item.marketplace_sales_banner.i
    public final void x8(@k AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f77557d, attributedText, null);
    }

    @Override // com.avito.android.advert.item.marketplace_sales_banner.i
    public final void y7() {
        this.f77557d.setMaxLines(2);
        this.f77558e.setMaxLines(2);
    }
}
