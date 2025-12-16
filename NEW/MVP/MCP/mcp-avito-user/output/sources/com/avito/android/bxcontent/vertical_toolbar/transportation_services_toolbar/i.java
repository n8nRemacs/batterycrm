package com.avito.android.bxcontent.vertical_toolbar.transportation_services_toolbar;

import Ca1.ViewOnTouchListenerC13234a;
import Y41.l;
import Y61.k;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.blueprint.date.interval.j;
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
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import j.InterfaceC42156l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: ServicesTransportationWidgetToolbarView.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bxcontent/vertical_toolbar/transportation_services_toolbar/i;", "Lcom/avito/android/bxcontent/vertical_toolbar/transportation_services_toolbar/h;", "a", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class i implements h {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f113136q = 0;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f113137a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Banner f113138b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final FrameLayout f113139c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final RecyclerView f113140d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final AppBarLayout f113141e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final CollapsingToolbarLayout f113142f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final View f113143g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final View f113144h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final View f113145i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final TextView f113146j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final TextView f113147k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final ImageView f113148l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final ImageView f113149m;

    /* renamed from: n, reason: collision with root package name */
    public final int f113150n;

    /* renamed from: o, reason: collision with root package name */
    public final int f113151o;

    /* renamed from: p, reason: collision with root package name */
    @k
    public final n f113152p;

    /* compiled from: ServicesTransportationWidgetToolbarView.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/bxcontent/vertical_toolbar/transportation_services_toolbar/i$a;", "", "<init>", "()V", "", "CONTENT_BOTTOM_CORNERS_RADIUS", "I", "CONTENT_BOTTOM_PADDING", "", "HEADER_THUMB_ALPHA_THRESHOLD", "D", "HEADER_THUMB_BACKGROUND_RADIUS", "HEADER_THUMB_RADIUS", "MAX_THUMB_HEIGHT", "MIN_THUMB_HEIGHT", "", "TOOLBAR_TITLE_THRESHOLD", "F", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    public i(@k View view) {
        this.f113137a = view;
        Banner banner = (Banner) view.findViewById(R.id.serviceTransportationWidget);
        this.f113138b = banner;
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.collapsing_toolbar_overlay);
        this.f113139c = frameLayout;
        this.f113140d = (RecyclerView) view.findViewById(R.id.recycler_view);
        AppBarLayout appBarLayout = (AppBarLayout) view.findViewById(R.id.bx_appbar);
        this.f113141e = appBarLayout;
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) view.findViewById(R.id.serviceTransportationWidgetCollapsingToolbar);
        this.f113142f = collapsingToolbarLayout;
        this.f113143g = appBarLayout.findViewById(R.id.service_transportation_widget_header_thumb);
        this.f113144h = appBarLayout.findViewById(R.id.service_transportation_widget_thumb_layout);
        this.f113145i = appBarLayout.findViewById(R.id.service_transportation_widget_thumb_layout_overlay);
        this.f113146j = (TextView) appBarLayout.findViewById(R.id.service_transportation_widget_toolbar_title);
        this.f113147k = (TextView) appBarLayout.findViewById(R.id.service_transportation_widget_subtitle);
        ImageView imageView = (ImageView) appBarLayout.findViewById(R.id.service_transportation_widget_search_icon);
        this.f113148l = imageView;
        ImageView imageView2 = (ImageView) appBarLayout.findViewById(R.id.service_transportation_widget_navigation_icon);
        this.f113149m = imageView2;
        this.f113150n = C35835l0.d(R.attr.transparentBlack, view.getContext());
        this.f113151o = view.getContext().getColor(R.color.expected_constant_black_alpha_32);
        this.f113152p = new n(this, 1);
        Context context = view.getContext();
        if (com.avito.android.lib.util.darkTheme.c.a(context)) {
            ColorStateList colorStateListE = C35835l0.e(R.attr.constantWhite, context);
            imageView2.setImageTintList(colorStateListE);
            imageView.setImageTintList(colorStateListE);
        } else {
            ColorStateList colorStateListE2 = C35835l0.e(R.attr.constantBlack, context);
            imageView2.setImageTintList(colorStateListE2);
            imageView.setImageTintList(colorStateListE2);
        }
        com.avito.android.lib.util.i.f181373a.getClass();
        boolean z12 = !com.avito.android.lib.util.i.f181377e;
        appBarLayout.setFitsSystemWindows(z12);
        collapsingToolbarLayout.setFitsSystemWindows(z12);
        banner.setFitsSystemWindows(z12);
        frameLayout.setOnTouchListener(new ViewOnTouchListenerC13234a(this, 4));
    }

    public static void b(View view, float f12) {
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
            View childAt = viewGroup.getChildAt(i12);
            if (childAt != null) {
                b(childAt, f12);
            }
        }
    }

    @Override // com.avito.android.bxcontent.vertical_toolbar.transportation_services_toolbar.h
    @k
    /* renamed from: T1, reason: from getter */
    public final Banner getF113138b() {
        return this.f113138b;
    }

    @Override // com.avito.android.bxcontent.vertical_toolbar.transportation_services_toolbar.h
    public final void a(@k String str, @k String str2, @k UniversalColor universalColor, @k UniversalColor universalColor2, @k UniversalColor universalColor3, @k l lVar, @k Y41.a aVar, @k Y41.a aVar2) {
        I5.a(this.f113146j, str, false);
        I5.a(this.f113147k, str2, false);
        Banner banner = this.f113138b;
        Context context = banner.getContext();
        C48063a c48063a = C48063a.f437606a;
        int iA2 = c48063a.a(context, universalColor2);
        View view = this.f113144h;
        if (D6.y(view)) {
            c(0.0f, 0.0f, iA2);
        } else {
            c(y6.b(16), y6.b(16), iA2);
        }
        int iA3 = c48063a.a(banner.getContext(), universalColor);
        ((b) lVar).invoke(universalColor);
        this.f113142f.setContentScrim(new ColorDrawable(iA3));
        banner.setBackgroundColor(iA3);
        float fB2 = y6.b(20);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{0.0f, 0.0f, 0.0f, 0.0f, fB2, fB2, fB2, fB2}, null, null));
        Paint paint = shapeDrawable.getPaint();
        View view2 = this.f113137a;
        paint.setColor(c48063a.a(view2.getContext(), universalColor));
        view.setBackground(shapeDrawable);
        float fB3 = y6.b(2);
        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new RoundRectShape(new float[]{fB3, fB3, fB3, fB3, fB3, fB3, fB3, fB3}, null, null));
        shapeDrawable2.getPaint().setColor(c48063a.a(view2.getContext(), universalColor3));
        this.f113143g.setBackground(shapeDrawable2);
        D6.f(this.f113138b, 0, 0, 0, y6.b(12), 7);
        D6.H(view);
        this.f113149m.setOnClickListener(new j(28, aVar2));
        this.f113148l.setOnClickListener(new j(29, aVar));
    }

    public final void c(float f12, float f13, @InterfaceC42156l int i12) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{0.0f, 0.0f, 0.0f, 0.0f, f12, f12, f13, f13}, null, null));
        Banner banner = this.f113138b;
        banner.setBackground(shapeDrawable);
        banner.setBackgroundTintList(ColorStateList.valueOf(i12));
    }
}
