package com.avito.android.hero_banner.widget;

import android.animation.ArgbEvaluator;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.C22771k;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.hero_banner.widget.HeroBannerWidgetItem;
import com.avito.android.hero_banner.widget.h;
import com.avito.android.lib.design.gradient.AvitoLinearGradientDrawable;
import com.avito.android.lib.design.gradient.a;
import com.avito.android.lib.util.darkTheme.ThemeAppearance;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.search_bar.utils.UdfToolbarColors;
import com.avito.android.search_bar.utils.UdfToolbarStyle;
import com.avito.android.ui.status_bar.d;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import j.InterfaceC42158n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import m.C43852a;
import sK0.C48063a;

/* compiled from: HeroBannerWidgetViewImpl.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/hero_banner/widget/o;", "Lcom/avito/android/hero_banner/widget/l;", "a", "_avito_bx-content_widget_hero-banner_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class o implements l {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f161928b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final androidx.appcompat.view.d f161929c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final AppBarLayout f161930d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final CollapsingToolbarLayout f161931e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ConstraintLayout f161932f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f161933g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final TextView f161934h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final TextView f161935i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final View f161936j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final CardView f161937k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f161938l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f161939m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public View f161940n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f161941o;

    /* renamed from: p, reason: collision with root package name */
    public float f161942p;

    /* renamed from: q, reason: collision with root package name */
    public float f161943q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f161944r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public m f161945s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public HeroBannerAppbarBehaviour f161946t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final ArgbEvaluator f161947u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super Float, G0> f161948v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super UdfToolbarColors, G0> f161949w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super com.avito.android.ui.status_bar.d, G0> f161950x;

    /* compiled from: HeroBannerWidgetViewImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/hero_banner/widget/o$a;", "", "<init>", "()V", "", "HEADER_CLOSE_STATE", "F", "HEADER_OPEN_STATE", "_avito_bx-content_widget_hero-banner_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: HeroBannerWidgetViewImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f161951b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o f161952c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ UniversalColor f161953d;

        public b(View view, o oVar, UniversalColor universalColor) {
            this.f161951b = view;
            this.f161952c = oVar;
            this.f161953d = universalColor;
        }

        @Override // java.lang.Runnable
        public final void run() throws Resources.NotFoundException {
            o oVar = this.f161952c;
            int iA2 = C48063a.f437606a.a(oVar.f161929c, this.f161953d);
            androidx.appcompat.view.d dVar = oVar.f161929c;
            float dimension = dVar.getResources().getDimension(R.dimen.bx_content_widget_hero_banner_util_corner_radius);
            float dimension2 = dVar.getResources().getDimension(R.dimen.bx_content_widget_hero_banner_util_shadow_size);
            float[] fArr = new float[8];
            for (int i12 = 0; i12 < 8; i12++) {
                fArr[i12] = dimension;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
            shapeDrawable.getPaint().setColor(C35835l0.d(R.attr.transparentWhite, dVar));
            shapeDrawable.getPaint().setShadowLayer(dimension2, 0.0f, 0.0f, iA2);
            ConstraintLayout constraintLayout = oVar.f161932f;
            int left = constraintLayout.getLeft();
            int top = constraintLayout.getTop();
            View view = this.f161951b;
            view.setBackground(new InsetDrawable((Drawable) shapeDrawable, left, top, view.getWidth() - constraintLayout.getRight(), view.getHeight() - constraintLayout.getBottom()));
        }
    }

    /* compiled from: View.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "androidx/core/view/t0", "core-ktx_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements View.OnLayoutChangeListener {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f161955c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f161956d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ UniversalColor f161957e;

        public c(View view, int i12, UniversalColor universalColor) {
            this.f161955c = view;
            this.f161956d = i12;
            this.f161957e = universalColor;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) throws Resources.NotFoundException {
            view.removeOnLayoutChangeListener(this);
            o oVar = o.this;
            float dimension = oVar.f161929c.getResources().getDimension(R.dimen.bx_content_widget_hero_banner_util_shadow_size);
            View view2 = this.f161955c;
            view2.getLayoutParams().height = (this.f161956d * 2) + oVar.f161932f.getHeight() + ((int) dimension);
            D6.H(oVar.f161940n);
            view2.post(new b(view2, oVar, this.f161957e));
        }
    }

    static {
        new a(null);
    }

    public o(@Y61.k View view) {
        this.f161928b = view;
        this.f161929c = new androidx.appcompat.view.d(view.getContext(), R.style.Theme_DesignSystem_Re23);
        View viewFindViewById = view.findViewById(R.id.bx_appbar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout");
        }
        this.f161930d = (AppBarLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.hero_banner_collapsing_toolbar);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.appbar.CollapsingToolbarLayout");
        }
        this.f161931e = (CollapsingToolbarLayout) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.hero_banner);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        }
        this.f161932f = (ConstraintLayout) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.hero_banner_title);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f161933g = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.hero_banner_subtitle);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f161934h = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.hero_banner_icon);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f161935i = (TextView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.hero_banner_bottom);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f161936j = viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.hero_banner_background);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.cardview.widget.CardView");
        }
        this.f161937k = (CardView) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.hero_banner_background_image);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f161938l = (SimpleDraweeView) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(R.id.hero_banner_right_image);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f161939m = (SimpleDraweeView) viewFindViewById10;
        this.f161943q = -1.0f;
        this.f161947u = new ArgbEvaluator();
    }

    public static void M0(TextView textView) {
        textView.setTextSize(0, textView.getTextSize() / textView.getContext().getResources().getConfiguration().fontScale);
    }

    public final UdfToolbarColors D0(UdfToolbarColors udfToolbarColors, float f12, boolean z12) {
        UdfToolbarStyle.Color.ByColor byColorE0;
        UdfToolbarStyle.Color.ByColor byColorE02;
        UdfToolbarColors.CartIcon cartIcon;
        UdfToolbarColors.Point point;
        UdfToolbarColors.CartIcon cartIcon2;
        UdfToolbarColors.Point point2;
        UdfToolbarColors.CartIcon cartIcon3;
        UdfToolbarColors.CartIcon cartIcon4;
        UdfToolbarColors.CartIcon cartIcon5;
        UdfToolbarColors.FilterIcon filterIcon;
        UdfToolbarColors.Point point3;
        UdfToolbarColors.FilterIcon filterIcon2;
        UdfToolbarColors.Point point4;
        UdfToolbarColors.FilterIcon filterIcon3;
        UdfToolbarColors.FilterIcon filterIcon4;
        UdfToolbarColors.SearchInput searchInput;
        UdfToolbarColors.SearchInput searchInput2;
        UdfToolbarColors.SearchInput searchInput3;
        UdfToolbarStyle.Color byRes = f12 == 0.0f ? new UdfToolbarStyle.Color.ByRes(R.color.common_white) : udfToolbarColors != null ? udfToolbarColors.f264030b : null;
        UdfToolbarColors.SearchInput searchInput4 = new UdfToolbarColors.SearchInput(e0((udfToolbarColors == null || (searchInput3 = udfToolbarColors.f264032d) == null) ? null : searchInput3.f264048b, R.color.common_black, f12), e0((udfToolbarColors == null || (searchInput2 = udfToolbarColors.f264032d) == null) ? null : searchInput2.f264049c, R.color.common_gray_36, f12), e0((udfToolbarColors == null || (searchInput = udfToolbarColors.f264032d) == null) ? null : searchInput.f264050d, R.color.common_warm_gray_4, f12));
        UdfToolbarStyle.Color.ByColor byColorE03 = e0((udfToolbarColors == null || (filterIcon4 = udfToolbarColors.f264033e) == null) ? null : filterIcon4.f264040b, R.color.common_black, f12);
        if (z12) {
            byColorE0 = e0((udfToolbarColors == null || (filterIcon3 = udfToolbarColors.f264033e) == null) ? null : filterIcon3.f264041c, R.color.common_warm_gray_12, f12);
        } else {
            byColorE0 = null;
        }
        UdfToolbarColors.FilterIcon filterIcon5 = new UdfToolbarColors.FilterIcon(byColorE03, byColorE0, new UdfToolbarColors.Point(e0((udfToolbarColors == null || (filterIcon2 = udfToolbarColors.f264033e) == null || (point4 = filterIcon2.f264042d) == null) ? null : point4.f264046b, R.color.common_warm_gray_4, f12), e0((udfToolbarColors == null || (filterIcon = udfToolbarColors.f264033e) == null || (point3 = filterIcon.f264042d) == null) ? null : point3.f264047c, R.color.common_red, f12)));
        UdfToolbarStyle.Color.ByColor byColorE04 = e0((udfToolbarColors == null || (cartIcon5 = udfToolbarColors.f264034f) == null) ? null : cartIcon5.f264036b, R.color.common_black, f12);
        UdfToolbarStyle.Color.ByColor byColorE05 = e0((udfToolbarColors == null || (cartIcon4 = udfToolbarColors.f264034f) == null) ? null : cartIcon4.f264037c, R.color.common_white, f12);
        if (z12) {
            byColorE02 = e0((udfToolbarColors == null || (cartIcon3 = udfToolbarColors.f264034f) == null) ? null : cartIcon3.f264038d, R.color.common_warm_gray_12, f12);
        } else {
            byColorE02 = null;
        }
        return new UdfToolbarColors(byRes, null, searchInput4, filterIcon5, new UdfToolbarColors.CartIcon(byColorE04, byColorE05, byColorE02, new UdfToolbarColors.Point(e0((udfToolbarColors == null || (cartIcon2 = udfToolbarColors.f264034f) == null || (point2 = cartIcon2.f264039e) == null) ? null : point2.f264046b, R.color.common_white, f12), e0((udfToolbarColors == null || (cartIcon = udfToolbarColors.f264034f) == null || (point = cartIcon.f264039e) == null) ? null : point.f264047c, R.color.common_red, f12))), null, 34, null);
    }

    public final void E0(int i12) {
        com.avito.android.lib.util.i.f181373a.getClass();
        C22771k c22771kD = com.avito.android.lib.util.i.d(this.f161930d);
        int i13 = c22771kD != null ? c22771kD.f44776b : 0;
        androidx.appcompat.view.d dVar = this.f161929c;
        this.f161931e.getLayoutParams().height = dVar.getResources().getDimensionPixelSize(R.dimen.hero_banner_margin_bottom) + dVar.getResources().getDimensionPixelSize(R.dimen.bx_content_widget_hero_banner_util_margin_top) + i13 + i12;
    }

    @Override // com.avito.android.hero_banner.widget.l
    public final void Ve(@Y61.k final HeroBannerWidgetItem.HeroBannerItemTitle heroBannerItemTitle, @Y61.l AttributedText attributedText, @Y61.k final Y41.q<? super DeepLink, ? super String, ? super String, G0> qVar) {
        Integer numQ;
        final int i12 = 0;
        this.f161936j.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.hero_banner.widget.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        o oVar = this;
                        String string = oVar.f161933g.getText().toString();
                        String string2 = oVar.f161934h.getText().toString();
                        qVar.invoke(heroBannerItemTitle.f161875c, string, string2);
                        break;
                    default:
                        TextView textView = this.f161933g;
                        String string3 = textView.getText().toString();
                        String string4 = textView.getText().toString();
                        qVar.invoke(heroBannerItemTitle.f161875c, string3, string4);
                        break;
                }
            }
        });
        AttributedText attributedText2 = heroBannerItemTitle.f161874b;
        TextView textView = this.f161933g;
        G0 g02 = null;
        com.avito.android.util.text.j.a(textView, attributedText2, null);
        M0(textView);
        androidx.appcompat.view.d dVar = this.f161929c;
        SimpleDraweeView simpleDraweeView = this.f161939m;
        ConstraintLayout constraintLayout = this.f161932f;
        TextView textView2 = this.f161934h;
        if (attributedText != null) {
            int dimension = (int) dVar.getResources().getDimension(R.dimen.bx_content_widget_hero_banner_util_height_big);
            E0(dimension);
            constraintLayout.getLayoutParams().height = dimension;
            simpleDraweeView.getLayoutParams().height = (int) dVar.getResources().getDimension(R.dimen.bx_content_widget_hero_banner_util_right_image_height_big);
            com.avito.android.util.text.j.a(textView2, attributedText, null);
            M0(textView2);
            D6.H(textView2);
        } else {
            int dimension2 = (int) dVar.getResources().getDimension(R.dimen.bx_content_widget_hero_banner_util_height_small);
            E0(dimension2);
            constraintLayout.getLayoutParams().height = dimension2;
            simpleDraweeView.getLayoutParams().height = (int) dVar.getResources().getDimension(R.dimen.bx_content_widget_hero_banner_util_right_image_height_small);
            D6.w(textView2);
        }
        TextView textView3 = this.f161935i;
        HeroBannerWidgetItem.HeroBannerItemHeaderIcon heroBannerItemHeaderIcon = heroBannerItemTitle.f161876d;
        if (heroBannerItemHeaderIcon != null) {
            FV.a.a(FV.a.f4720a, textView3, Integer.valueOf(R.attr.textIconArrowForwardIos));
            String str = heroBannerItemHeaderIcon.f161872b;
            if (str != null && (numQ = com.avito.android.lib.util.f.q(str)) != null) {
                textView3.setTextAppearance(C35835l0.j(numQ.intValue(), dVar));
            }
            textView3.setTextColor(C48063a.f437606a.a(dVar, heroBannerItemHeaderIcon.f161873c));
            final int i13 = 1;
            textView3.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.hero_banner.widget.n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i13) {
                        case 0:
                            o oVar = this;
                            String string = oVar.f161933g.getText().toString();
                            String string2 = oVar.f161934h.getText().toString();
                            qVar.invoke(heroBannerItemTitle.f161875c, string, string2);
                            break;
                        default:
                            TextView textView4 = this.f161933g;
                            String string3 = textView4.getText().toString();
                            String string4 = textView4.getText().toString();
                            qVar.invoke(heroBannerItemTitle.f161875c, string3, string4);
                            break;
                    }
                }
            });
            M0(textView3);
            D6.H(textView3);
            g02 = G0.f406611a;
        }
        if (g02 == null) {
            D6.w(textView3);
        }
    }

    @Override // com.avito.android.hero_banner.widget.l
    public final void aR(@Y61.l List<UniversalColor> list) {
        Drawable drawableA;
        androidx.appcompat.view.d dVar = this.f161929c;
        if (list != null) {
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.LEFT_RIGHT;
            List<UniversalColor> list2 = list;
            ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(C48063a.f437606a.a(dVar, (UniversalColor) it.next())));
            }
            GradientDrawable gradientDrawable = new GradientDrawable(orientation, C42745f0.L0(arrayList));
            gradientDrawable.setCornerRadius(dVar.getResources().getDimension(R.dimen.bx_content_widget_hero_banner_util_corner_radius));
            drawableA = gradientDrawable;
        } else {
            drawableA = C43852a.a(dVar, R.drawable.hero_banner_default_background);
        }
        this.f161937k.setBackground(drawableA);
    }

    @Override // com.avito.android.hero_banner.widget.l
    public final void d3(boolean z12) {
        if (z12 != this.f161944r) {
            this.f161944r = z12;
            HeroBannerAppbarBehaviour heroBannerAppbarBehaviour = this.f161946t;
            if (heroBannerAppbarBehaviour != null) {
                heroBannerAppbarBehaviour.f161867r = z12;
            }
            Y41.l<? super Float, G0> lVar = this.f161948v;
            if (lVar != null) {
                if (z12) {
                    ((h.a) lVar).invoke(Float.valueOf(0.0f));
                } else if (this.f161943q != 0.0f) {
                    ((h.a) lVar).invoke(Float.valueOf(1.0f));
                }
            }
            Y41.l<? super UdfToolbarColors, G0> lVar2 = this.f161949w;
            if (lVar2 != null) {
                if (z12) {
                    ((h.c) lVar2).invoke(D0(null, 0.0f, true));
                } else {
                    if (this.f161943q == 0.0f) {
                        return;
                    }
                    ((h.c) lVar2).invoke(D0(null, 1.0f, true));
                }
            }
        }
    }

    public final UdfToolbarStyle.Color.ByColor e0(UdfToolbarStyle.Color color, @InterfaceC42158n int i12, float f12) {
        int color2;
        int iIntValue;
        androidx.appcompat.view.d dVar = this.f161929c;
        if (color == null) {
            iIntValue = androidx.core.content.d.getColor(dVar, i12);
        } else {
            ArgbEvaluator argbEvaluator = this.f161947u;
            Integer numValueOf = Integer.valueOf(androidx.core.content.d.getColor(dVar, i12));
            if (color instanceof UdfToolbarStyle.Color.ByColor) {
                color2 = ((UdfToolbarStyle.Color.ByColor) color).f264069b;
            } else if (color instanceof UdfToolbarStyle.Color.ByUniversalColor) {
                color2 = C48063a.f437606a.a(dVar, ((UdfToolbarStyle.Color.ByUniversalColor) color).f264071b);
            } else if (color instanceof UdfToolbarStyle.Color.ByRes) {
                color2 = androidx.core.content.d.getColor(dVar, ((UdfToolbarStyle.Color.ByRes) color).f264070b);
            } else {
                if (!(color instanceof UdfToolbarStyle.Color.RippleColorByThemeAppearance)) {
                    throw new NoWhenBranchMatchedException();
                }
                color2 = androidx.core.content.d.getColor(dVar, com.avito.android.lib.util.darkTheme.d.a(((UdfToolbarStyle.Color.RippleColorByThemeAppearance) color).f264072b, com.avito.android.lib.util.darkTheme.c.a(dVar)) ? R.color.custom_product_color_constant_warm_gray_36 : R.color.custom_product_color_constant_warm_gray_36_night);
            }
            iIntValue = ((Integer) argbEvaluator.evaluate(f12, numValueOf, Integer.valueOf(color2))).intValue();
        }
        return new UdfToolbarStyle.Color.ByColor(iIntValue);
    }

    @Override // com.avito.android.hero_banner.widget.l
    public final void f0() {
        AppBarLayout appBarLayout = this.f161930d;
        D6.w(appBarLayout);
        appBarLayout.g(false, false, true);
        appBarLayout.f(this.f161945s);
        D6.w(this.f161932f);
        CollapsingToolbarLayout collapsingToolbarLayout = this.f161931e;
        D6.w(collapsingToolbarLayout);
        D6.w(this.f161940n);
        collapsingToolbarLayout.setFitsSystemWindows(false);
        Y41.l<? super Float, G0> lVar = this.f161948v;
        if (lVar != null) {
            ((h.a) lVar).invoke(Float.valueOf(0.0f));
        }
        Y41.l<? super UdfToolbarColors, G0> lVar2 = this.f161949w;
        if (lVar2 != null) {
            ((h.c) lVar2).invoke(D0(null, 0.0f, true));
        }
        Y41.l<? super com.avito.android.ui.status_bar.d, G0> lVar3 = this.f161950x;
        if (lVar3 != null) {
            ((h.b) lVar3).invoke(new com.avito.android.ui.status_bar.d(ThemeAppearance.f181334b, new d.a.C9357d(R.color.common_white)));
        }
        collapsingToolbarLayout.setMinimumHeight(0);
        this.f161948v = null;
        this.f161949w = null;
        this.f161950x = null;
    }

    @Override // com.avito.android.hero_banner.widget.l
    public final void f4(@Y61.l UniversalImage universalImage) throws Resources.NotFoundException {
        SimpleDraweeView simpleDraweeView = this.f161939m;
        if (universalImage == null) {
            D6.w(simpleDraweeView);
            return;
        }
        androidx.appcompat.view.d dVar = this.f161929c;
        float dimension = dVar.getResources().getDimension(R.dimen.bx_content_widget_hero_banner_util_corner_radius);
        GW0.a hierarchy = simpleDraweeView.getHierarchy();
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.d(0.0f, 0.0f, dimension, 0.0f);
        hierarchy.s(roundingParams);
        C35949t5.c(this.f161939m, com.avito.android.image_loader.b.b(UniversalImageKt.getImageDependsOnTheme(universalImage, com.avito.android.lib.util.darkTheme.c.b(dVar))), null, null, null, 14);
    }

    @Override // com.avito.android.hero_banner.widget.l
    public final void hd(@Y61.k String str) {
        Drawable drawableA;
        Integer numH = com.avito.android.lib.util.f.h(str);
        androidx.appcompat.view.d dVar = this.f161929c;
        if (numH != null) {
            int iIntValue = numH.intValue();
            int dimension = (int) dVar.getResources().getDimension(R.dimen.bx_content_widget_hero_banner_util_corner_radius);
            AvitoLinearGradientDrawable.a.C5275a c5275a = new AvitoLinearGradientDrawable.a.C5275a(dVar, iIntValue, 0, 4, null);
            c5275a.f179264a = dimension;
            drawableA = new AvitoLinearGradientDrawable(c5275a.a());
        } else {
            Integer numI = com.avito.android.lib.util.f.i(str);
            if (numI != null) {
                int iIntValue2 = numI.intValue();
                int dimension2 = (int) dVar.getResources().getDimension(R.dimen.bx_content_widget_hero_banner_util_corner_radius);
                a.C5276a.C5277a c5277a = new a.C5276a.C5277a(dVar, iIntValue2, 0, 4, null);
                c5277a.f179264a = dimension2;
                drawableA = new com.avito.android.lib.design.gradient.a(dVar, c5277a.a());
            } else {
                drawableA = C43852a.a(dVar, R.drawable.hero_banner_default_background);
            }
        }
        this.f161937k.setBackground(drawableA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [com.avito.android.hero_banner.widget.m, com.google.android.material.appbar.AppBarLayout$g] */
    @Override // com.avito.android.hero_banner.widget.l
    public final void kY(boolean z12, @Y61.k Y41.l<? super Float, G0> lVar, @Y61.k final Y41.l<? super com.avito.android.ui.status_bar.d, G0> lVar2, @Y61.l final HeroBannerWidgetItem.UdfToolbarAndStatusBarConfig udfToolbarAndStatusBarConfig, @Y61.k Y41.l<? super UdfToolbarColors, G0> lVar3, @Y61.k final Y41.p<? super String, ? super String, G0> pVar, @Y61.k final Y41.l<? super k, G0> lVar4, final boolean z13, boolean z14) throws Resources.NotFoundException {
        this.f161948v = lVar;
        this.f161949w = lVar3;
        this.f161950x = lVar2;
        com.avito.android.lib.util.i.f181373a.getClass();
        boolean z15 = com.avito.android.lib.util.i.f181377e;
        AppBarLayout appBarLayout = this.f161930d;
        C22771k c22771kD = com.avito.android.lib.util.i.d(appBarLayout);
        int i12 = c22771kD != null ? c22771kD.f44776b : 0;
        androidx.appcompat.view.d dVar = this.f161929c;
        D6.c(this.f161932f, null, Integer.valueOf(dVar.getResources().getDimensionPixelSize(R.dimen.bx_content_widget_hero_banner_util_margin_top) + i12), null, null, 13);
        int dimensionPixelSize = dVar.getResources().getDimensionPixelSize(R.dimen.hero_banner_search_bar_height);
        if (!z15) {
            i12 = 0;
        }
        int i13 = dimensionPixelSize + i12;
        float fB2 = y6.b(50);
        this.f161946t = new HeroBannerAppbarBehaviour(fB2);
        CoordinatorLayout.g gVar = new CoordinatorLayout.g(appBarLayout.getLayoutParams());
        gVar.b(this.f161946t);
        appBarLayout.setLayoutParams(gVar);
        E0(dVar.getResources().getDimensionPixelSize(R.dimen.bx_content_widget_hero_banner_util_height_small));
        D6.H(appBarLayout);
        boolean z16 = !z15;
        this.f161928b.setFitsSystemWindows(z16);
        appBarLayout.setFitsSystemWindows(z16);
        CollapsingToolbarLayout collapsingToolbarLayout = this.f161931e;
        collapsingToolbarLayout.setFitsSystemWindows(z16);
        final ConstraintLayout constraintLayout = this.f161932f;
        constraintLayout.setFitsSystemWindows(z16);
        this.f161938l.setFitsSystemWindows(z16);
        this.f161937k.setFitsSystemWindows(z16);
        this.f161942p = fB2;
        D6.H(collapsingToolbarLayout);
        collapsingToolbarLayout.setMinimumHeight(i13);
        collapsingToolbarLayout.setStatusBarScrim(new ColorDrawable(0));
        D6.H(constraintLayout);
        ?? r13 = new AppBarLayout.g() { // from class: com.avito.android.hero_banner.widget.m
            @Override // com.google.android.material.appbar.AppBarLayout.b
            public final void c(AppBarLayout appBarLayout2, int i14) {
                ThemeAppearance themeAppearance;
                Y41.l<? super UdfToolbarColors, G0> lVar5;
                Y41.l<? super Float, G0> lVar6;
                float f12 = i14;
                o oVar = this.f161918b;
                float fA2 = 1.0f - M0.a.a(Math.abs(f12 / oVar.f161942p), 0.0f, 1.0f);
                if (oVar.f161943q == fA2) {
                    return;
                }
                oVar.f161943q = fA2;
                if (oVar.f161944r) {
                    return;
                }
                boolean z17 = z13;
                if (!z17 && (lVar6 = oVar.f161948v) != null) {
                    ((h.a) lVar6).invoke(Float.valueOf(fA2));
                }
                HeroBannerWidgetItem.UdfToolbarAndStatusBarConfig udfToolbarAndStatusBarConfig2 = udfToolbarAndStatusBarConfig;
                if (udfToolbarAndStatusBarConfig2 == null || (themeAppearance = udfToolbarAndStatusBarConfig2.f161878c) == null) {
                    themeAppearance = ThemeAppearance.f181334b;
                }
                com.avito.android.ui.status_bar.d dVar2 = new com.avito.android.ui.status_bar.d(themeAppearance, new d.a.C9356a(R.attr.transparentWhite));
                Y41.l lVar7 = lVar4;
                if (fA2 == 1.0f) {
                    if (!oVar.f161941o) {
                        ((h.d) pVar).invoke(oVar.f161933g.getText().toString(), oVar.f161934h.getText().toString());
                        oVar.f161941o = true;
                    }
                    if (z17) {
                        udfToolbarColorsD0 = oVar.D0(udfToolbarAndStatusBarConfig2 != null ? udfToolbarAndStatusBarConfig2.f161877b : null, 1.0f, true);
                    }
                    ((h.e) lVar7).invoke(new k(true, udfToolbarColorsD0));
                } else if (fA2 == 0.0f) {
                    dVar2 = new com.avito.android.ui.status_bar.d(ThemeAppearance.f181334b, new d.a.C9356a(R.attr.white));
                    if (z17) {
                        udfToolbarColorsD0 = oVar.D0(udfToolbarAndStatusBarConfig2 != null ? udfToolbarAndStatusBarConfig2.f161877b : null, 0.0f, true);
                    }
                    ((h.e) lVar7).invoke(new k(false, udfToolbarColorsD0));
                } else if (z17 && (lVar5 = oVar.f161949w) != null) {
                    ((h.c) lVar5).invoke(oVar.D0(udfToolbarAndStatusBarConfig2 != null ? udfToolbarAndStatusBarConfig2.f161877b : null, fA2, false));
                }
                if (z17) {
                    ((h.b) lVar2).invoke(dVar2);
                }
            }
        };
        this.f161945s = r13;
        appBarLayout.f(r13);
        appBarLayout.a(this.f161945s);
        appBarLayout.g(z12, false, true);
        d3(z14);
        final int iArgb = Color.argb(153, 255, 255, 255);
        final float dimension = dVar.getResources().getDimension(R.dimen.bx_content_widget_hero_banner_util_corner_radius);
        constraintLayout.post(new Runnable() { // from class: com.avito.android.hero_banner.widget.a
            @Override // java.lang.Runnable
            public final void run() throws Resources.NotFoundException {
                View view = constraintLayout;
                float width = view.getWidth();
                float height = view.getHeight();
                double dAtan2 = ((float) Math.atan2(height, width)) + 1.5707963267948966d;
                float f12 = 2;
                float f13 = width / f12;
                float f14 = height / f12;
                double d12 = f13;
                double dSqrt = ((float) Math.sqrt((height * height) + (width * width))) * 1.5f;
                double d13 = 2;
                double d14 = f14;
                b bVar = new b(dimension, (float) (((Math.cos(dAtan2) * dSqrt) / d13) + d12), (float) (((Math.sin(dAtan2) * dSqrt) / d13) + d14), (float) (d12 - ((Math.cos(dAtan2) * dSqrt) / d13)), (float) (d14 - ((Math.sin(dAtan2) * dSqrt) / d13)), iArgb, width, height);
                float fB3 = com.avito.android.authorization.auto_recovery.phone_confirm.b.b(view, R.dimen.bx_content_widget_hero_banner_util_corner_radius);
                float[] fArr = new float[8];
                for (int i14 = 0; i14 < 8; i14++) {
                    fArr[i14] = fB3;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
                shapeDrawable.getPaint().setColor(C35835l0.d(R.attr.white, view.getContext()));
                LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bVar, shapeDrawable});
                int dimensionPixelSize2 = view.getContext().getResources().getDimensionPixelSize(R.dimen.bx_content_widget_hero_banner_util_border_width);
                layerDrawable.setLayerInset(1, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
                view.setBackground(layerDrawable);
            }
        });
    }

    @Override // com.avito.android.hero_banner.widget.l
    public final void uV(int i12, @Y61.k UniversalColor universalColor) throws Resources.NotFoundException {
        View viewFindViewById = this.f161928b.findViewById(i12);
        this.f161940n = viewFindViewById;
        if (viewFindViewById != null) {
            HeroBannerAppbarBehaviour heroBannerAppbarBehaviour = this.f161946t;
            if (heroBannerAppbarBehaviour != null) {
                heroBannerAppbarBehaviour.f161871v = viewFindViewById;
            }
            com.avito.android.lib.util.i.f181373a.getClass();
            C22771k c22771kD = com.avito.android.lib.util.i.d(this.f161930d);
            int i13 = c22771kD != null ? c22771kD.f44776b : 0;
            ConstraintLayout constraintLayout = this.f161932f;
            if (!constraintLayout.isLaidOut() || constraintLayout.isLayoutRequested()) {
                constraintLayout.addOnLayoutChangeListener(new c(viewFindViewById, i13, universalColor));
                return;
            }
            viewFindViewById.getLayoutParams().height = (i13 * 2) + constraintLayout.getHeight() + ((int) this.f161929c.getResources().getDimension(R.dimen.bx_content_widget_hero_banner_util_shadow_size));
            D6.H(this.f161940n);
            viewFindViewById.post(new b(viewFindViewById, this, universalColor));
        }
    }

    @Override // com.avito.android.hero_banner.widget.l
    public final void v1(@Y61.l UniversalImage universalImage) {
        if (universalImage == null) {
            D6.w(this.f161938l);
        } else {
            C35949t5.c(this.f161938l, com.avito.android.image_loader.b.b(UniversalImageKt.getImageDependsOnTheme(universalImage, com.avito.android.lib.util.darkTheme.c.b(this.f161929c))), null, null, null, 14);
        }
    }
}
