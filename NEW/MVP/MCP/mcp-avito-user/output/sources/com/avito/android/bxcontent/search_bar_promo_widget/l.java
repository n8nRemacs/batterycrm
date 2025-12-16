package com.avito.android.bxcontent.search_bar_promo_widget;

import Y41.p;
import Y41.q;
import android.animation.ArgbEvaluator;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.C22771k;
import com.avito.android.R;
import com.avito.android.bxcontent.search_bar_promo_widget.SearchPromoHeaderWidgetItem;
import com.avito.android.bxcontent.search_bar_promo_widget.e;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.header_button.HeaderButton;
import com.avito.android.lib.util.darkTheme.ThemeAppearance;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.search_bar.utils.UdfToolbarColors;
import com.avito.android.search_bar.utils.UdfToolbarStyle;
import com.avito.android.ui.status_bar.d;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import fG0.C40289a;
import j.InterfaceC42158n;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import sK0.C48063a;
import sK0.C48065c;

/* compiled from: SearchPromoHeaderWidgetView.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bxcontent/search_bar_promo_widget/l;", "Lcom/avito/android/bxcontent/search_bar_promo_widget/i;", "a", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class l implements i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f112891a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AppBarLayout f112892b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final CollapsingToolbarLayout f112893c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ConstraintLayout f112894d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f112895e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final HeaderButton f112896f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final FrameLayout f112897g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final FrameLayout f112898h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f112899i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f112900j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f112901k;

    /* renamed from: l, reason: collision with root package name */
    public float f112902l;

    /* renamed from: m, reason: collision with root package name */
    public float f112903m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f112904n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public k f112905o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public SearchPromoHeaderAppbarBehaviour f112906p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final ArgbEvaluator f112907q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super Float, G0> f112908r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super UdfToolbarColors, G0> f112909s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super com.avito.android.ui.status_bar.d, G0> f112910t;

    /* compiled from: SearchPromoHeaderWidgetView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/bxcontent/search_bar_promo_widget/l$a;", "", "<init>", "()V", "", "HEADER_CLOSE_STATE", "F", "HEADER_OPEN_STATE", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    public l(@Y61.k View view) {
        this.f112891a = view;
        View viewFindViewById = view.findViewById(R.id.bx_appbar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout");
        }
        this.f112892b = (AppBarLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.collapsing_toolbar_promo_banner);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.appbar.CollapsingToolbarLayout");
        }
        this.f112893c = (CollapsingToolbarLayout) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.search_promo_header);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        }
        this.f112894d = (ConstraintLayout) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.search_promo_header_title);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f112895e = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.search_promo_header_button_header);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.header_button.HeaderButton");
        }
        this.f112896f = (HeaderButton) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.search_promo_header_bottom);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        this.f112897g = (FrameLayout) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.search_promo_header_background);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        this.f112898h = (FrameLayout) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.search_promo_header_background_image);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f112899i = (SimpleDraweeView) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.search_promo_header_right_image);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f112900j = (SimpleDraweeView) viewFindViewById9;
        this.f112903m = -1.0f;
        this.f112907q = new ArgbEvaluator();
    }

    @Override // com.avito.android.bxcontent.search_bar_promo_widget.i
    public final void a(@Y61.l ArrayList arrayList) {
        ConstraintLayout constraintLayout = this.f112894d;
        if (arrayList == null) {
            constraintLayout.setBackground(null);
            return;
        }
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            UniversalColor universalColor = (UniversalColor) it.next();
            arrayList2.add(Integer.valueOf(C48063a.f437606a.a(this.f112892b.getContext(), universalColor)));
        }
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, C42745f0.L0(arrayList2));
        gradientDrawable.setCornerRadius(0.0f);
        constraintLayout.setBackground(gradientDrawable);
    }

    @Override // com.avito.android.bxcontent.search_bar_promo_widget.i
    public final void b(@Y61.k final SearchPromoHeaderWidgetItem.SearchBarPromoItemTitle searchBarPromoItemTitle, @Y61.k final q<? super DeepLink, ? super String, ? super String, G0> qVar) {
        int i12;
        final int i13 = 0;
        this.f112897g.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.bxcontent.search_bar_promo_widget.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        TextView textView = this.f112895e;
                        String string = textView.getText().toString();
                        String string2 = textView.getText().toString();
                        qVar.invoke(searchBarPromoItemTitle.f112855c, string, string2);
                        break;
                    default:
                        TextView textView2 = this.f112895e;
                        String string3 = textView2.getText().toString();
                        String string4 = textView2.getText().toString();
                        qVar.invoke(searchBarPromoItemTitle.f112855c, string3, string4);
                        break;
                }
            }
        });
        com.avito.android.util.text.j.a(this.f112895e, searchBarPromoItemTitle.f112854b, null);
        HeaderButton headerButton = this.f112896f;
        SearchPromoHeaderWidgetItem.SearchBarPromoItemHeaderButton searchBarPromoItemHeaderButton = searchBarPromoItemTitle.f112856d;
        if (searchBarPromoItemHeaderButton != null) {
            String str = searchBarPromoItemHeaderButton.f112851b;
            Integer numJ = str != null ? com.avito.android.lib.util.f.j(str) : null;
            if (numJ != null) {
                headerButton.setAppearanceFromAttr(numJ.intValue());
            }
            UniversalColor universalColor = searchBarPromoItemHeaderButton.f112852c;
            AppBarLayout appBarLayout = this.f112892b;
            if (universalColor != null) {
                headerButton.e(appBarLayout.getContext().getResources().getDimensionPixelSize(R.dimen.search_promo_header_header_button_corner_radius), C48065c.a(appBarLayout.getContext(), universalColor, R.attr.black), null);
            }
            UniversalColor universalColor2 = searchBarPromoItemHeaderButton.f112853d;
            if (universalColor2 != null) {
                headerButton.setTextColor(C48063a.f437606a.a(appBarLayout.getContext(), universalColor2));
            }
            final int i14 = 1;
            headerButton.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.bxcontent.search_bar_promo_widget.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i14) {
                        case 0:
                            TextView textView = this.f112895e;
                            String string = textView.getText().toString();
                            String string2 = textView.getText().toString();
                            qVar.invoke(searchBarPromoItemTitle.f112855c, string, string2);
                            break;
                        default:
                            TextView textView2 = this.f112895e;
                            String string3 = textView2.getText().toString();
                            String string4 = textView2.getText().toString();
                            qVar.invoke(searchBarPromoItemTitle.f112855c, string3, string4);
                            break;
                    }
                }
            });
            i12 = 0;
        } else {
            i12 = 8;
        }
        headerButton.setVisibility(i12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [com.avito.android.bxcontent.search_bar_promo_widget.k, com.google.android.material.appbar.AppBarLayout$g] */
    @Override // com.avito.android.bxcontent.search_bar_promo_widget.i
    public final void c(boolean z12, @Y61.k Y41.l<? super Float, G0> lVar, @Y61.k final Y41.l<? super com.avito.android.ui.status_bar.d, G0> lVar2, @Y61.l final UdfToolbarAndStatusBarConfig udfToolbarAndStatusBarConfig, @Y61.k Y41.l<? super UdfToolbarColors, G0> lVar3, @Y61.k final p<? super String, ? super String, G0> pVar, @Y61.k final Y41.l<? super h, G0> lVar4, final boolean z13, boolean z14) throws Resources.NotFoundException {
        this.f112908r = lVar;
        this.f112909s = lVar3;
        this.f112910t = lVar2;
        com.avito.android.lib.util.i.f181373a.getClass();
        boolean z15 = com.avito.android.lib.util.i.f181377e;
        AppBarLayout appBarLayout = this.f112892b;
        int dimensionPixelSize = appBarLayout.getContext().getResources().getDimensionPixelSize(R.dimen.search_promo_header_bottom_height);
        C22771k c22771kD = com.avito.android.lib.util.i.d(appBarLayout);
        int i12 = c22771kD != null ? c22771kD.f44776b : 0;
        int dimensionPixelSize2 = appBarLayout.getContext().getResources().getDimensionPixelSize(R.dimen.search_promo_header_search_bar_height) + (z15 ? i12 : 0);
        float dimensionPixelSize3 = appBarLayout.getContext().getResources().getDimensionPixelSize(R.dimen.search_promo_header_search_bar_height_bottom_line) + dimensionPixelSize;
        int dimensionPixelSize4 = appBarLayout.getContext().getResources().getDimensionPixelSize(R.dimen.search_promo_header_margin_bottom) + appBarLayout.getContext().getResources().getDimensionPixelSize(R.dimen.search_promo_header_search_bar_height) + i12 + dimensionPixelSize;
        this.f112906p = new SearchPromoHeaderAppbarBehaviour(dimensionPixelSize3);
        CoordinatorLayout.g gVar = new CoordinatorLayout.g(-1, dimensionPixelSize4);
        gVar.b(this.f112906p);
        appBarLayout.setLayoutParams(gVar);
        D6.H(appBarLayout);
        boolean z16 = !z15;
        this.f112891a.setFitsSystemWindows(z16);
        appBarLayout.setFitsSystemWindows(z16);
        CollapsingToolbarLayout collapsingToolbarLayout = this.f112893c;
        collapsingToolbarLayout.setFitsSystemWindows(z16);
        ConstraintLayout constraintLayout = this.f112894d;
        constraintLayout.setFitsSystemWindows(z16);
        SimpleDraweeView simpleDraweeView = this.f112899i;
        simpleDraweeView.setFitsSystemWindows(z16);
        this.f112898h.setFitsSystemWindows(z16);
        appBarLayout.setVisibility(0);
        this.f112902l = dimensionPixelSize3;
        D6.H(collapsingToolbarLayout);
        collapsingToolbarLayout.setMinimumHeight(dimensionPixelSize2);
        collapsingToolbarLayout.setStatusBarScrim(new ColorDrawable(0));
        D6.H(constraintLayout);
        D6.c(this.f112894d, null, null, null, Integer.valueOf(appBarLayout.getContext().getResources().getDimensionPixelSize(R.dimen.search_promo_header_margin_bottom)), 7);
        ?? r112 = new AppBarLayout.g() { // from class: com.avito.android.bxcontent.search_bar_promo_widget.k
            @Override // com.google.android.material.appbar.AppBarLayout.b
            public final void c(AppBarLayout appBarLayout2, int i13) {
                ThemeAppearance themeAppearance;
                Y41.l<? super UdfToolbarColors, G0> lVar5;
                Y41.l<? super Float, G0> lVar6;
                float f12 = i13;
                l lVar7 = this.f112885b;
                float fA2 = 1.0f - M0.a.a(Math.abs(f12 / lVar7.f112902l), 0.0f, 1.0f);
                if (lVar7.f112903m == fA2) {
                    return;
                }
                lVar7.f112903m = fA2;
                if (lVar7.f112904n) {
                    return;
                }
                boolean z17 = z13;
                if (!z17 && (lVar6 = lVar7.f112908r) != null) {
                    ((e.a) lVar6).invoke(Float.valueOf(fA2));
                }
                UdfToolbarAndStatusBarConfig udfToolbarAndStatusBarConfig2 = udfToolbarAndStatusBarConfig;
                if (udfToolbarAndStatusBarConfig2 == null || (themeAppearance = udfToolbarAndStatusBarConfig2.f112858c) == null) {
                    themeAppearance = ThemeAppearance.f181334b;
                }
                com.avito.android.ui.status_bar.d dVar = new com.avito.android.ui.status_bar.d(themeAppearance, new d.a.C9356a(R.attr.transparentWhite));
                Y41.l lVar8 = lVar4;
                if (fA2 == 1.0f) {
                    if (!lVar7.f112901k) {
                        TextView textView = lVar7.f112895e;
                        ((e.d) pVar).invoke(textView.getText().toString(), textView.getText().toString());
                        lVar7.f112901k = true;
                    }
                    if (z17) {
                        udfToolbarColorsF = lVar7.f(udfToolbarAndStatusBarConfig2 != null ? udfToolbarAndStatusBarConfig2.f112857b : null, 1.0f, true);
                    }
                    ((e.C3314e) lVar8).invoke(new h(true, udfToolbarColorsF));
                } else if (fA2 == 0.0f) {
                    dVar = new com.avito.android.ui.status_bar.d(ThemeAppearance.f181334b, new d.a.C9356a(R.attr.white));
                    if (z17) {
                        udfToolbarColorsF = lVar7.f(udfToolbarAndStatusBarConfig2 != null ? udfToolbarAndStatusBarConfig2.f112857b : null, 0.0f, true);
                    }
                    ((e.C3314e) lVar8).invoke(new h(false, udfToolbarColorsF));
                } else if (z17 && (lVar5 = lVar7.f112909s) != null) {
                    ((e.c) lVar5).invoke(lVar7.f(udfToolbarAndStatusBarConfig2 != null ? udfToolbarAndStatusBarConfig2.f112857b : null, fA2, false));
                }
                if (z17) {
                    ((e.b) lVar2).invoke(dVar);
                }
            }
        };
        this.f112905o = r112;
        appBarLayout.f(r112);
        appBarLayout.a(this.f112905o);
        simpleDraweeView.getLayoutParams().height = dimensionPixelSize4;
        constraintLayout.setVisibility(0);
        appBarLayout.g(z12, false, true);
        d3(z14);
    }

    @Override // com.avito.android.bxcontent.search_bar_promo_widget.i
    public final void d() {
        AppBarLayout appBarLayout = this.f112892b;
        appBarLayout.getLayoutParams().height = -2;
        D6.w(appBarLayout);
        appBarLayout.g(false, false, true);
        appBarLayout.f(this.f112905o);
        D6.w(this.f112894d);
        CollapsingToolbarLayout collapsingToolbarLayout = this.f112893c;
        D6.w(collapsingToolbarLayout);
        collapsingToolbarLayout.setFitsSystemWindows(false);
        Y41.l<? super Float, G0> lVar = this.f112908r;
        if (lVar != null) {
            ((e.a) lVar).invoke(Float.valueOf(0.0f));
        }
        Y41.l<? super UdfToolbarColors, G0> lVar2 = this.f112909s;
        if (lVar2 != null) {
            ((e.c) lVar2).invoke(f(null, 0.0f, true));
        }
        Y41.l<? super com.avito.android.ui.status_bar.d, G0> lVar3 = this.f112910t;
        if (lVar3 != null) {
            ((e.b) lVar3).invoke(new com.avito.android.ui.status_bar.d(ThemeAppearance.f181334b, new d.a.C9357d(R.color.common_white)));
        }
        collapsingToolbarLayout.setMinimumHeight(0);
        this.f112908r = null;
        this.f112909s = null;
        this.f112910t = null;
    }

    @Override // com.avito.android.bxcontent.search_bar_promo_widget.i
    public final void d3(boolean z12) {
        if (z12 != this.f112904n) {
            this.f112904n = z12;
            SearchPromoHeaderAppbarBehaviour searchPromoHeaderAppbarBehaviour = this.f112906p;
            if (searchPromoHeaderAppbarBehaviour != null) {
                searchPromoHeaderAppbarBehaviour.f112838r = z12;
            }
            Y41.l<? super Float, G0> lVar = this.f112908r;
            if (lVar != null) {
                if (z12) {
                    ((e.a) lVar).invoke(Float.valueOf(0.0f));
                } else if (this.f112903m != 0.0f) {
                    ((e.a) lVar).invoke(Float.valueOf(1.0f));
                }
            }
            Y41.l<? super UdfToolbarColors, G0> lVar2 = this.f112909s;
            if (lVar2 != null) {
                if (z12) {
                    ((e.c) lVar2).invoke(f(null, 0.0f, true));
                } else {
                    if (this.f112903m == 0.0f) {
                        return;
                    }
                    ((e.c) lVar2).invoke(f(null, 1.0f, true));
                }
            }
        }
    }

    public final UdfToolbarStyle.Color.ByColor e(UdfToolbarStyle.Color color, @InterfaceC42158n int i12, float f12) {
        AppBarLayout appBarLayout = this.f112892b;
        return new UdfToolbarStyle.Color.ByColor(color == null ? androidx.core.content.d.getColor(appBarLayout.getContext(), i12) : ((Integer) this.f112907q.evaluate(f12, Integer.valueOf(androidx.core.content.d.getColor(appBarLayout.getContext(), i12)), Integer.valueOf(fG0.b.a(color, appBarLayout.getContext())))).intValue());
    }

    public final UdfToolbarColors f(UdfToolbarColors udfToolbarColors, float f12, boolean z12) {
        UdfToolbarStyle.Color byRes;
        UdfToolbarStyle.Color.ByColor byColorE;
        UdfToolbarStyle.Color.ByColor byColorE2;
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
        if (f12 == 0.0f) {
            C40289a.f395790a.getClass();
            byRes = new UdfToolbarStyle.Color.ByRes(R.color.common_white);
        } else {
            byRes = udfToolbarColors != null ? udfToolbarColors.f264030b : null;
        }
        UdfToolbarStyle.Color color = (udfToolbarColors == null || (searchInput3 = udfToolbarColors.f264032d) == null) ? null : searchInput3.f264048b;
        C40289a.f395790a.getClass();
        UdfToolbarColors.SearchInput searchInput4 = new UdfToolbarColors.SearchInput(e(color, R.color.common_black, f12), e((udfToolbarColors == null || (searchInput2 = udfToolbarColors.f264032d) == null) ? null : searchInput2.f264049c, R.color.common_gray_36, f12), e((udfToolbarColors == null || (searchInput = udfToolbarColors.f264032d) == null) ? null : searchInput.f264050d, R.color.common_warm_gray_4, f12));
        UdfToolbarStyle.Color.ByColor byColorE3 = e((udfToolbarColors == null || (filterIcon4 = udfToolbarColors.f264033e) == null) ? null : filterIcon4.f264040b, R.color.common_black, f12);
        if (z12) {
            byColorE = e((udfToolbarColors == null || (filterIcon3 = udfToolbarColors.f264033e) == null) ? null : filterIcon3.f264041c, R.color.common_warm_gray_12, f12);
        } else {
            byColorE = null;
        }
        UdfToolbarColors.FilterIcon filterIcon5 = new UdfToolbarColors.FilterIcon(byColorE3, byColorE, new UdfToolbarColors.Point(e((udfToolbarColors == null || (filterIcon2 = udfToolbarColors.f264033e) == null || (point4 = filterIcon2.f264042d) == null) ? null : point4.f264046b, R.color.common_warm_gray_4, f12), e((udfToolbarColors == null || (filterIcon = udfToolbarColors.f264033e) == null || (point3 = filterIcon.f264042d) == null) ? null : point3.f264047c, R.color.common_red, f12)));
        UdfToolbarStyle.Color.ByColor byColorE4 = e((udfToolbarColors == null || (cartIcon5 = udfToolbarColors.f264034f) == null) ? null : cartIcon5.f264036b, R.color.common_black, f12);
        UdfToolbarStyle.Color.ByColor byColorE5 = e((udfToolbarColors == null || (cartIcon4 = udfToolbarColors.f264034f) == null) ? null : cartIcon4.f264037c, R.color.common_white, f12);
        if (z12) {
            byColorE2 = e((udfToolbarColors == null || (cartIcon3 = udfToolbarColors.f264034f) == null) ? null : cartIcon3.f264038d, R.color.common_warm_gray_12, f12);
        } else {
            byColorE2 = null;
        }
        return new UdfToolbarColors(byRes, null, searchInput4, filterIcon5, new UdfToolbarColors.CartIcon(byColorE4, byColorE5, byColorE2, new UdfToolbarColors.Point(e((udfToolbarColors == null || (cartIcon2 = udfToolbarColors.f264034f) == null || (point2 = cartIcon2.f264039e) == null) ? null : point2.f264046b, R.color.common_white, f12), e((udfToolbarColors == null || (cartIcon = udfToolbarColors.f264034f) == null || (point = cartIcon.f264039e) == null) ? null : point.f264047c, R.color.common_red, f12))), null, 34, null);
    }

    @Override // com.avito.android.bxcontent.search_bar_promo_widget.i
    public final void f4(@Y61.l UniversalImage universalImage) {
        if (universalImage == null) {
            D6.w(this.f112900j);
        } else {
            C35949t5.c(this.f112900j, com.avito.android.image_loader.b.b(UniversalImageKt.getImageDependsOnTheme(universalImage, com.avito.android.lib.util.darkTheme.c.b(this.f112892b.getContext()))), null, null, null, 14);
        }
    }

    @Override // com.avito.android.bxcontent.search_bar_promo_widget.i
    public final void v1(@Y61.l UniversalImage universalImage) {
        if (universalImage == null) {
            D6.w(this.f112899i);
        } else {
            C35949t5.c(this.f112899i, com.avito.android.image_loader.b.b(UniversalImageKt.getImageDependsOnTheme(universalImage, com.avito.android.lib.util.darkTheme.c.b(this.f112892b.getContext()))), null, null, null, 14);
        }
    }
}
