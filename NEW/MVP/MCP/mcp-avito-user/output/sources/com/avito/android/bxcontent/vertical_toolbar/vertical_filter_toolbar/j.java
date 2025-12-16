package com.avito.android.bxcontent.vertical_toolbar.vertical_filter_toolbar;

import Ca1.ViewOnTouchListenerC13234a;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.bxcontent.vertical_toolbar.category_filter_toolbar.n;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.list_item.ListItemCheckbox;
import com.avito.android.lib.design.segmented_control.SegmentedControl;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import sK0.C48063a;

/* compiled from: VerticalFilterToolbarView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bxcontent/vertical_toolbar/vertical_filter_toolbar/j;", "Lcom/avito/android/bxcontent/vertical_toolbar/vertical_filter_toolbar/h;", "a", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class j implements h {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f113180o = 0;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f113181a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AppBarLayout f113182b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final CollapsingToolbarLayout f113183c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final RecyclerView f113184d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final FrameLayout f113185e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Banner f113186f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final View f113187g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final View f113188h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<G0> f113189i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final C41981q0 f113190j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<G0> f113191k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final C41981q0 f113192l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final n f113193m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f113194n;

    /* compiled from: VerticalFilterToolbarView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/bxcontent/vertical_toolbar/vertical_filter_toolbar/j$a;", "", "<init>", "()V", "", "HEADER_THUMB_BACKGROUND_RADIUS", "I", "HEADER_THUMB_RADIUS", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    public j(@k View view) {
        this.f113181a = view;
        AppBarLayout appBarLayout = (AppBarLayout) view.findViewById(R.id.bx_appbar);
        this.f113182b = appBarLayout;
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) view.findViewById(R.id.collapsingToolbar);
        this.f113183c = collapsingToolbarLayout;
        this.f113184d = (RecyclerView) view.findViewById(R.id.recycler_view);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.collapsing_toolbar_overlay);
        this.f113185e = frameLayout;
        ImageView imageView = (ImageView) appBarLayout.findViewById(R.id.navigation_icon);
        ImageView imageView2 = (ImageView) appBarLayout.findViewById(R.id.search_icon);
        Banner banner = (Banner) appBarLayout.findViewById(R.id.vertical_filter_toolbar_content);
        this.f113186f = banner;
        this.f113187g = appBarLayout.findViewById(R.id.thumb_layout);
        this.f113188h = appBarLayout.findViewById(R.id.header_thumb);
        com.jakewharton.rxrelay3.c<G0> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f113189i = cVar;
        this.f113190j = new C41981q0(cVar);
        com.jakewharton.rxrelay3.c<G0> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f113191k = cVar2;
        this.f113192l = new C41981q0(cVar2);
        this.f113193m = new n(this, 2);
        this.f113194n = true;
        Context context = view.getContext();
        if (com.avito.android.lib.util.darkTheme.c.a(context)) {
            ColorStateList colorStateListE = C35835l0.e(R.attr.constantWhite, context);
            imageView.setImageTintList(colorStateListE);
            imageView2.setImageTintList(colorStateListE);
        } else {
            ColorStateList colorStateListE2 = C35835l0.e(R.attr.constantBlack, context);
            imageView.setImageTintList(colorStateListE2);
            imageView2.setImageTintList(colorStateListE2);
        }
        com.avito.android.lib.util.i.f181373a.getClass();
        boolean z12 = !com.avito.android.lib.util.i.f181377e;
        appBarLayout.setFitsSystemWindows(z12);
        collapsingToolbarLayout.setFitsSystemWindows(z12);
        banner.setFitsSystemWindows(z12);
        m(this, banner.getContext().getColor(R.color.vf_toolbar_gradient_bg_startColor), banner.getContext().getColor(R.color.vf_toolbar_gradient_bg_endColor), 0.0f, 0.0f, 60);
        final int i12 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.bxcontent.vertical_toolbar.vertical_filter_toolbar.i

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ j f113179c;

            {
                this.f113179c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        this.f113179c.f113189i.accept(G0.f406611a);
                        break;
                    default:
                        this.f113179c.f113191k.accept(G0.f406611a);
                        break;
                }
            }
        });
        final int i13 = 1;
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.bxcontent.vertical_toolbar.vertical_filter_toolbar.i

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ j f113179c;

            {
                this.f113179c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        this.f113179c.f113189i.accept(G0.f406611a);
                        break;
                    default:
                        this.f113179c.f113191k.accept(G0.f406611a);
                        break;
                }
            }
        });
        frameLayout.setOnTouchListener(new ViewOnTouchListenerC13234a(this, 5));
    }

    public static void l(View view, float f12) {
        if (view == null) {
            return;
        }
        if (!(view instanceof ViewGroup)) {
            view.setAlpha(f12);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup instanceof Input ? true : viewGroup instanceof SegmentedControl ? true : viewGroup instanceof Button ? true : viewGroup instanceof ListItemCheckbox ? true : viewGroup instanceof Badge) {
            viewGroup.setAlpha(f12);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            l(viewGroup.getChildAt(i12), f12);
        }
    }

    public static void m(j jVar, int i12, int i13, float f12, float f13, int i14) {
        if ((i14 & 16) != 0) {
            f12 = 0.0f;
        }
        if ((i14 & 32) != 0) {
            f13 = 0.0f;
        }
        jVar.getClass();
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i12, i13});
        gradientDrawable.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, f12, f12, f13, f13});
        jVar.f113186f.setBackground(gradientDrawable);
    }

    @Override // com.avito.android.bxcontent.vertical_toolbar.vertical_filter_toolbar.h
    @k
    /* renamed from: T1, reason: from getter */
    public final Banner getF113186f() {
        return this.f113186f;
    }

    @Override // com.avito.android.bxcontent.vertical_toolbar.vertical_filter_toolbar.h
    public final void a(@l UniversalColor universalColor, @l UniversalColor universalColor2, @l UniversalColor universalColor3, @k Y41.l<? super Drawable, G0> lVar) {
        View view = this.f113187g;
        CollapsingToolbarLayout collapsingToolbarLayout = this.f113183c;
        Banner banner = this.f113186f;
        if (universalColor == null && universalColor2 == null) {
            collapsingToolbarLayout.setContentScrim(banner.getContext().getDrawable(R.drawable.vertical_filter_toolbar_collapsed_view_background));
            view.setBackground(banner.getContext().getDrawable(R.drawable.vertical_filter_toolbar_view_thumb_background));
            return;
        }
        if (universalColor != null) {
            View view2 = this.f113181a;
            Context context = view2.getContext();
            C48063a c48063a = C48063a.f437606a;
            int iA2 = c48063a.a(context, universalColor);
            if (universalColor2 != null) {
                int iA3 = c48063a.a(view2.getContext(), universalColor2);
                GradientDrawable.Orientation orientation = GradientDrawable.Orientation.LEFT_RIGHT;
                ((d) lVar).invoke(new GradientDrawable(orientation, new int[]{iA2, iA3}));
                collapsingToolbarLayout.setContentScrim(new GradientDrawable(orientation, new int[]{iA2, iA3}));
                banner.setBackground(new GradientDrawable(orientation, new int[]{iA2, iA3}));
                GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{iA2, iA3});
                float fB2 = y6.b(20);
                gradientDrawable.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, fB2, fB2, fB2, fB2});
                float fB3 = y6.b(2);
                view.setBackground(gradientDrawable);
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{fB3, fB3, fB3, fB3, fB3, fB3, fB3, fB3}, null, null));
                if (universalColor3 != null) {
                    shapeDrawable.getPaint().setColor(c48063a.a(view2.getContext(), universalColor3));
                }
                this.f113188h.setBackground(shapeDrawable);
            }
        }
    }

    @Override // tl.InterfaceC48686b
    @k
    /* renamed from: b, reason: from getter */
    public final C41981q0 getF113226k() {
        return this.f113192l;
    }

    @Override // com.avito.android.bxcontent.vertical_toolbar.vertical_filter_toolbar.h
    public final void d(@l UniversalColor universalColor, @l UniversalColor universalColor2) {
        int color;
        int color2;
        Banner banner = this.f113186f;
        if (universalColor != null) {
            color = C48063a.f437606a.a(banner.getContext(), universalColor);
        } else {
            color = banner.getContext().getColor(R.color.vf_toolbar_gradient_bg_startColor);
        }
        int i12 = color;
        if (universalColor2 != null) {
            color2 = C48063a.f437606a.a(banner.getContext(), universalColor2);
        } else {
            color2 = banner.getContext().getColor(R.color.vf_toolbar_gradient_bg_endColor);
        }
        int i13 = color2;
        if (D6.y(this.f113187g)) {
            m(this, i12, i13, 0.0f, 0.0f, 60);
        } else {
            m(this, i12, i13, y6.b(16), y6.b(16), 12);
        }
    }

    @Override // tl.InterfaceC48686b
    @k
    /* renamed from: e, reason: from getter */
    public final C41981q0 getF113224i() {
        return this.f113190j;
    }

    @Override // com.avito.android.bxcontent.vertical_toolbar.vertical_filter_toolbar.h
    public final void h(boolean z12) {
        View view = this.f113187g;
        if (z12) {
            D6.H(view);
        } else {
            D6.w(view);
        }
    }

    public final void n(int i12) {
        View view = this.f113187g;
        if (D6.r(view) == i12) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i12;
        view.setLayoutParams(layoutParams);
    }

    @Override // com.avito.android.bxcontent.vertical_toolbar.vertical_filter_toolbar.h
    public final void setTitle(@l String str) {
        this.f113183c.setTitle(str);
    }
}
