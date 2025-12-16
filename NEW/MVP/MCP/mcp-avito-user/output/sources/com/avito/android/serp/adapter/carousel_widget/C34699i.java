package com.avito.android.serp.adapter.carousel_widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.header_button.HeaderButton;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.inset.ItemsCarouselWidget;
import com.avito.android.remote.model.sales.utils.Timer;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.serp.adapter.constructor.SerpConstructorAdvertItem;
import com.avito.android.serp.adapter.witcher.C34889h;
import com.avito.android.serp_core.timer.CountDownTimerWidget;
import com.avito.android.util.C35949t5;
import com.avito.android.util.C35976x4;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.L0;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.flexbox.FlexboxLayout;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import j.InterfaceC42150f;
import java.util.Date;
import java.util.List;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import ru.avito.component.serp.FixedWidthLinearLayoutManager;
import sK0.C48063a;
import sK0.C48065c;

/* compiled from: CarouselItemsWidgetView.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/carousel_widget/i;", "Lcom/avito/android/serp/adapter/carousel_widget/h;", "Lcom/avito/konveyor/adapter/b;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.serp.adapter.carousel_widget.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34699i extends com.avito.konveyor.adapter.b implements InterfaceC34698h {

    /* renamed from: T, reason: collision with root package name */
    public static final /* synthetic */ int f269353T = 0;

    /* renamed from: A, reason: collision with root package name */
    public final int f269354A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f269355B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f269356C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f269357D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f269358E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f269359F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f269360G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f269361H;

    /* renamed from: I, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f269362I;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.util.recycler_wrap_height_calculator.c f269363J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.m f269364K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f269365L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f269366M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f269367N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f269368O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f269369P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final H f269370Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f269371R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f269372S;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.favorite.p f269373b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.viewed.g f269374c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.h f269375d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final L0 f269376e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final View f269377f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final I f269378g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f269379h;

    /* renamed from: i, reason: collision with root package name */
    public final Context f269380i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final FrameLayout f269381j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f269382k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final TextView f269383l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f269384m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final HeaderButton f269385n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final FlexboxLayout f269386o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final CountDownTimerWidget f269387p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f269388q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f269389r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final Button f269390s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.j f269391t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.l
    public SV.c f269392u;

    /* renamed from: v, reason: collision with root package name */
    public int f269393v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f269394w;

    /* renamed from: x, reason: collision with root package name */
    public final int f269395x;

    /* renamed from: y, reason: collision with root package name */
    public final int f269396y;

    /* renamed from: z, reason: collision with root package name */
    public final int f269397z;

    /* compiled from: CarouselItemsWidgetView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.serp.adapter.carousel_widget.i$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f269398a;

        static {
            int[] iArr = new int[SerpDisplayType.values().length];
            try {
                iArr[SerpDisplayType.ItemsCarouselWidgetGridXL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f269398a = iArr;
        }
    }

    /* compiled from: CarouselItemsWidgetView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.serp.adapter.carousel_widget.i$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            D6.w(C34699i.this.f269387p);
            return G0.f406611a;
        }
    }

    public C34699i(@Y61.k com.avito.android.favorite.p pVar, @Y61.k com.avito.android.advert.viewed.g gVar, @Y61.k com.avito.konveyor.adapter.h hVar, @Y61.k L0 l02, @Y61.k com.avito.konveyor.a aVar, @Y61.l RecyclerView.t tVar, @Y61.k View view, @Y61.k I i12, @Y61.k com.avito.android.util.text.a aVar2) {
        super(view);
        this.f269373b = pVar;
        this.f269374c = gVar;
        this.f269375d = hVar;
        this.f269376e = l02;
        this.f269377f = view;
        this.f269378g = i12;
        this.f269379h = aVar2;
        this.f269380i = view.getContext();
        View viewFindViewById = view.findViewById(R.id.carousel_external_root);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        this.f269381j = (FrameLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.carousel_inner_root);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f269382k = (ViewGroup) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.carousel_subtitle);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f269383l = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.carousel_recycler);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById4;
        this.f269384m = recyclerView;
        View viewFindViewById5 = view.findViewById(R.id.carousel_header_button);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.header_button.HeaderButton");
        }
        this.f269385n = (HeaderButton) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.flexbox_container);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayout");
        }
        FlexboxLayout flexboxLayout = (FlexboxLayout) viewFindViewById6;
        this.f269386o = flexboxLayout;
        View viewFindViewById7 = view.findViewById(R.id.carousel_timer);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.serp_core.timer.CountDownTimerWidget");
        }
        this.f269387p = (CountDownTimerWidget) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.carousel_background_image);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f269388q = (SimpleDraweeView) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.icon_image);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f269389r = (SimpleDraweeView) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(R.id.carousel_button);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f269390s = (Button) viewFindViewById10;
        com.avito.konveyor.adapter.j jVar = new com.avito.konveyor.adapter.j(hVar, aVar);
        this.f269391t = jVar;
        this.f269394w = C42727D.c(new C34703m(this));
        this.f269395x = view.getResources().getDimensionPixelSize(R.dimen.serp_carousel_inner_root_bottom_padding);
        this.f269396y = view.getResources().getDimensionPixelSize(R.dimen.sales_card_text_content_min_height);
        this.f269397z = view.getResources().getDimensionPixelSize(R.dimen.vacancy_carousel_max_width);
        this.f269354A = view.getResources().getDimensionPixelSize(R.dimen.gig_carousel_max_width);
        this.f269355B = C42727D.c(new B(this));
        this.f269356C = C42727D.c(new w(this));
        this.f269357D = C42727D.c(new v(this));
        this.f269358E = C42727D.c(new u(this));
        this.f269359F = C42727D.c(new t(this));
        this.f269360G = C42727D.c(new C34705o(this));
        this.f269361H = C42727D.c(new x(this));
        this.f269362I = C42727D.c(new r(this));
        this.f269363J = new com.avito.android.lib.util.recycler_wrap_height_calculator.c();
        InterfaceC42726C interfaceC42726CC = C42727D.c(new C34707q(this));
        this.f269365L = interfaceC42726CC;
        this.f269366M = C42727D.c(new y(this));
        this.f269367N = C42727D.c(new C34704n(this));
        this.f269368O = C42727D.c(new C34706p(this));
        this.f269369P = C42727D.c(new C34708s(this));
        this.f269370Q = new H(flexboxLayout);
        if (tVar != null) {
            ((FixedWidthLinearLayoutManager) interfaceC42726CC.getValue()).f53688E = 5;
            recyclerView.setRecycledViewPool(tVar);
            recyclerView.setItemViewCacheSize(5);
        }
        jVar.setHasStableIds(true);
        recyclerView.setLayoutManager((FixedWidthLinearLayoutManager) interfaceC42726CC.getValue());
        recyclerView.setScrollingTouchSlop(1);
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(null);
        recyclerView.l(new com.avito.android.serp.adapter.service_trust_grid.i(), -1);
    }

    public static final void B80(C34699i c34699i) {
        RecyclerView.m layoutManager = c34699i.f269384m.getLayoutManager();
        c34699i.f269378g.I0(layoutManager != null ? layoutManager.Y0() : null, c34699i.f269393v);
    }

    public static int F80(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int marginStart = layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        return marginStart + (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd() : 0);
    }

    @Override // com.avito.android.favorite.s, com.avito.android.advert.viewed.j, com.avito.android.serp.adapter.closable.e
    public final void C3(int i12) {
        boolean z12 = this.f269372S;
        RecyclerView recyclerView = this.f269384m;
        if (!z12) {
            C35976x4.c(i12, recyclerView);
            return;
        }
        RecyclerView.m layoutManager = recyclerView.getLayoutManager();
        Parcelable parcelableY0 = layoutManager != null ? layoutManager.Y0() : null;
        C35976x4.c(i12, recyclerView);
        RecyclerView.m layoutManager2 = recyclerView.getLayoutManager();
        if (layoutManager2 != null) {
            layoutManager2.X0(parcelableY0);
        }
    }

    public final int C80(RecyclerView recyclerView, float f12) throws Resources.NotFoundException {
        int iC2 = this.f269376e.c();
        boolean z12 = recyclerView.getResources().getBoolean(R.bool.is_tablet);
        boolean z13 = recyclerView.getResources().getConfiguration().orientation == 2;
        if (z12 || z13) {
            f12 = 0.28f;
        }
        return (int) ((iC2 - (recyclerView.getPaddingStart() * 2)) * f12);
    }

    public final int D80() {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        HeaderButton headerButton = this.f269385n;
        headerButton.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int iF80 = F80(headerButton) + headerButton.getMeasuredWidth();
        int iC2 = this.f269376e.c() - F80(this.f269386o);
        ViewGroup viewGroup = this.f269382k;
        return (iC2 - (viewGroup.getPaddingEnd() + viewGroup.getPaddingStart())) - iF80;
    }

    @Override // com.avito.android.serp.adapter.carousel_widget.InterfaceC34698h
    public final void E10(@Y61.l SerpDisplayType serpDisplayType, boolean z12, boolean z13, boolean z14) {
        InterfaceC42726C interfaceC42726C = this.f269394w;
        ViewGroup viewGroup = this.f269382k;
        FrameLayout frameLayout = this.f269381j;
        if (z13) {
            frameLayout.setPadding(0, E80(), 0, E80());
            viewGroup.setPadding(0, ((Number) interfaceC42726C.getValue()).intValue(), 0, this.f269395x);
        } else if (z12) {
            if (serpDisplayType == SerpDisplayType.CarouselGig) {
                frameLayout.setPadding(0, E80(), 0, 0);
                Resources resources = this.f269377f.getResources();
                viewGroup.setPadding(0, resources.getDimensionPixelSize(R.dimen.serp_gig_carousel_inner_root_top_padding), 0, resources.getDimensionPixelSize(R.dimen.serp_gig_carousel_inner_root_bottom_padding));
            } else {
                frameLayout.setPadding(0, E80(), 0, E80());
                viewGroup.setPadding(0, ((Number) interfaceC42726C.getValue()).intValue(), 0, ((Number) interfaceC42726C.getValue()).intValue());
            }
        } else if (z14) {
            frameLayout.setPadding(0, 0, 0, 0);
            viewGroup.setPadding(0, 0, 0, 0);
        } else {
            frameLayout.setPadding(0, E80(), 0, E80());
            viewGroup.setPadding(0, 0, 0, 0);
        }
        int i12 = serpDisplayType == null ? -1 : a.f269398a[serpDisplayType.ordinal()];
        InterfaceC42726C interfaceC42726C2 = this.f269357D;
        int iIntValue = i12 == 1 ? ((Number) interfaceC42726C2.getValue()).intValue() : ((Number) this.f269356C.getValue()).intValue();
        int i13 = serpDisplayType != null ? a.f269398a[serpDisplayType.ordinal()] : -1;
        RecyclerView recyclerView = this.f269384m;
        recyclerView.setPadding(iIntValue, recyclerView.getPaddingTop(), i13 == 1 ? ((Number) interfaceC42726C2.getValue()).intValue() : recyclerView.getPaddingRight(), recyclerView.getPaddingBottom());
    }

    public final int E80() {
        return ((Number) this.f269355B.getValue()).intValue();
    }

    public final void G80(boolean z12, @InterfaceC42150f Integer num, ItemsCarouselWidget.ButtonColors buttonColors) {
        HeaderButton headerButton = this.f269385n;
        if (num != null) {
            headerButton.setAppearanceFromAttr(num.intValue());
        }
        if (buttonColors != null) {
            Context context = this.f269380i;
            headerButton.setTextColor(C48063a.f437606a.a(context, buttonColors.getTextColor()));
            headerButton.e(context.getResources().getDimensionPixelSize(R.dimen.serp_carousel_header_button_corner_radius), C48065c.a(context, buttonColors.getBackgroundColor(), R.attr.black), null);
        }
        D6.G(headerButton, z12);
    }

    @Override // com.avito.android.serp.adapter.carousel_widget.InterfaceC34698h
    public final void I3(@Y61.l Long l12, @Y61.l Timer.TimerStyle timerStyle) {
        CountDownTimerWidget countDownTimerWidget = this.f269387p;
        if (l12 == null || l12.longValue() - new Date().getTime() <= 0) {
            D6.w(countDownTimerWidget);
            return;
        }
        CountDownTimerWidget.d(countDownTimerWidget, l12.longValue());
        countDownTimerWidget.setOnFinishListener(new b());
        D6.H(countDownTimerWidget);
        if (timerStyle != null) {
            UniversalColor cellColor = timerStyle.getCellColor();
            C48063a c48063a = C48063a.f437606a;
            Context context = this.f269380i;
            countDownTimerWidget.setCellBackgroundColorTint(c48063a.a(context, cellColor));
            countDownTimerWidget.setSeparatorTextColor(c48063a.a(context, timerStyle.getCellColor()));
            countDownTimerWidget.setCellTextColor(c48063a.a(context, timerStyle.getTextColor()));
        }
    }

    @Override // com.avito.android.serp.adapter.carousel_widget.InterfaceC34698h
    public final void I6(@Y61.k Y41.a<G0> aVar) {
        this.f269386o.setOnClickListener(new com.avito.android.seller_promotions.o(13, aVar));
        this.f269383l.setOnClickListener(new com.avito.android.seller_promotions.o(14, aVar));
        this.f269385n.setOnClickListener(new com.avito.android.seller_promotions.o(15, aVar));
    }

    @Override // com.avito.android.serp.adapter.carousel_widget.InterfaceC34698h
    public final void L4() {
        RecyclerView recyclerView = this.f269384m;
        recyclerView.setOnFlingListener(null);
        recyclerView.s();
        recyclerView.m(new C34700j(this));
        recyclerView.n(new C34701k(this));
        recyclerView.o(new C34702l(this));
    }

    @Override // com.avito.android.serp.adapter.carousel_widget.InterfaceC34698h
    public final void M(@Y61.l UniversalImage universalImage) {
        SimpleDraweeView simpleDraweeView = this.f269389r;
        if (universalImage == null) {
            D6.w(simpleDraweeView);
            return;
        }
        D6.H(simpleDraweeView);
        C35949t5.c(this.f269389r, com.avito.android.image_loader.b.b(UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.b(this.f269380i))), null, null, null, 14);
    }

    @Override // com.avito.android.serp.adapter.carousel_widget.InterfaceC34698h
    public final void NS(@Y61.l ItemsCarouselWidget.Button button) {
        Button button2 = this.f269390s;
        if (button == null) {
            D6.w(button2);
            return;
        }
        button2.setText(button.getTitle());
        String style = button.getStyle();
        button2.setAppearanceFromAttr(style != null ? com.avito.android.lib.util.f.d(style) : R.attr.buttonPrimaryMedium);
        D6.H(button2);
    }

    @Override // com.avito.android.serp.adapter.carousel_widget.InterfaceC34698h
    public final void W4(@Y61.l Parcelable parcelable) {
        RecyclerView.m layoutManager = this.f269384m.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.X0(parcelable);
        }
    }

    @Override // com.avito.android.serp.adapter.carousel_widget.InterfaceC34698h
    public final void Y1(@Y61.k AttributedText attributedText) {
        TextView textView = this.f269383l;
        com.avito.android.util.text.j.a(textView, attributedText, null);
        textView.setVisibility(0);
    }

    @Override // com.avito.android.serp.adapter.carousel_widget.InterfaceC34698h
    public final boolean YV(@Y61.l UniversalImage universalImage, boolean z12) {
        Image imageG = universalImage != null ? com.avito.android.advert.item.delivery_suggests.l.g(this.f269377f, universalImage) : null;
        SimpleDraweeView simpleDraweeView = this.f269388q;
        if (imageG == null || z12) {
            D6.w(simpleDraweeView);
            return false;
        }
        ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
        aVarA.d(com.avito.android.image_loader.b.b(imageG));
        aVarA.c();
        D6.H(simpleDraweeView);
        return true;
    }

    @Override // com.avito.android.serp.adapter.carousel_widget.InterfaceC34698h
    public final void a0(@Y61.k Y41.a<G0> aVar) {
        this.f269390s.setOnClickListener(new com.avito.android.seller_promotions.o(16, aVar));
    }

    @Override // com.avito.android.serp.adapter.carousel_widget.InterfaceC34698h
    @Y61.k
    public final String bO(@Y61.k AttributedText attributedText, boolean z12, @InterfaceC42150f @Y61.l Integer num, @Y61.l ItemsCarouselWidget.ButtonColors buttonColors) {
        G80(z12, num, buttonColors);
        CharSequence charSequenceC = this.f269379h.c(this.f269377f.getContext(), attributedText);
        this.f269370Q.c(D80(), charSequenceC);
        return String.valueOf(charSequenceC);
    }

    @Override // com.avito.android.serp.adapter.carousel_widget.InterfaceC34698h
    public final void ce(@Y61.k UV0.c cVar) {
        com.avito.android.favorite.p pVar = this.f269373b;
        pVar.f155231e = cVar;
        pVar.s4(this);
    }

    @Override // com.avito.android.serp.adapter.carousel_widget.InterfaceC34698h
    public final void f(@Y61.l String str) {
        int i12;
        TextView textView = this.f269383l;
        if (str == null || str.length() == 0) {
            i12 = 8;
        } else {
            i12 = 0;
            I5.a(textView, str, false);
        }
        textView.setVisibility(i12);
    }

    @Override // com.avito.android.serp.adapter.carousel_widget.InterfaceC34698h
    public final void il(@Y61.l SerpDisplayType serpDisplayType) {
        RecyclerView recyclerView = this.f269384m;
        if (serpDisplayType != null && serpDisplayType.isCarouselVacancy()) {
            recyclerView.setLayoutManager((FixedWidthLinearLayoutManager) this.f269368O.getValue());
        } else if ((serpDisplayType != null && serpDisplayType.isAvitoSales()) || (serpDisplayType != null && serpDisplayType.isAvitoPromotion())) {
            recyclerView.setLayoutManager((FixedWidthLinearLayoutManager) this.f269365L.getValue());
        } else if (serpDisplayType != null && serpDisplayType.isServiceTrustGrid()) {
            recyclerView.setLayoutManager((FixedWidthLinearLayoutManager) this.f269366M.getValue());
        } else if (serpDisplayType != null && serpDisplayType.isItemsCarouselWidgetGridXL()) {
            recyclerView.setLayoutManager((FixedWidthLinearLayoutManager) this.f269369P.getValue());
        } else if (serpDisplayType == null || !serpDisplayType.isCarouselGig()) {
            recyclerView.setLayoutManager((GridLayoutManager) this.f269367N.getValue());
            recyclerView.l(new C34889h(recyclerView.getResources().getInteger(R.integer.serp_columns), recyclerView.getResources(), this.f269376e), -1);
        } else {
            recyclerView.setLayoutManager(new FixedWidthLinearLayoutManager(this.f269354A, this.f269377f.getContext()));
        }
        SV.c cVar = new SV.c(8388611, 0);
        SV.c cVar2 = this.f269392u;
        if (cVar2 != null) {
            cVar2.b(null);
        }
        recyclerView.setOnFlingListener(null);
        recyclerView.s();
        recyclerView.m(new C34700j(this));
        recyclerView.n(new C34701k(this));
        recyclerView.o(new C34702l(this));
        cVar.b(recyclerView);
        this.f269392u = cVar;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f269371R;
        if (aVar != null) {
            ((N) aVar).invoke();
        }
        this.f269371R = null;
        this.f269384m.setAdapter(null);
        io.reactivex.rxjava3.internal.observers.m mVar = this.f269364K;
        if (mVar != null) {
            DisposableHelper.a(mVar);
        }
        this.f269373b.I();
        this.f269374c.e0();
    }

    @Override // com.avito.android.serp.adapter.carousel_widget.InterfaceC34698h
    public final boolean mx(@Y61.l UniversalColor universalColor, boolean z12) {
        Integer numValueOf;
        ViewGroup viewGroup = this.f269382k;
        if (universalColor != null) {
            numValueOf = Integer.valueOf(C48063a.f437606a.a(viewGroup.getContext(), universalColor));
        } else {
            numValueOf = null;
        }
        if (numValueOf == null || z12) {
            viewGroup.setBackground(null);
            viewGroup.setBackgroundTintList(null);
            return false;
        }
        viewGroup.setBackgroundResource(R.drawable.rounded_background_r16);
        viewGroup.setBackgroundTintList(ColorStateList.valueOf(numValueOf.intValue()));
        return true;
    }

    @Override // com.avito.android.serp.adapter.carousel_widget.InterfaceC34698h
    public final void t(@Y61.k Y41.a<G0> aVar) {
        this.f269371R = aVar;
    }

    @Override // com.avito.android.serp.adapter.carousel_widget.InterfaceC34698h
    public final void v20(boolean z12, boolean z13) {
        InterfaceC42726C interfaceC42726C = this.f269358E;
        RecyclerView recyclerView = this.f269384m;
        if (z12) {
            D6.f(recyclerView, ((Number) interfaceC42726C.getValue()).intValue(), 0, 0, 0, 14);
        }
        if (z13) {
            D6.f(recyclerView, 0, 0, ((Number) interfaceC42726C.getValue()).intValue(), 0, 11);
        }
    }

    @Override // com.avito.android.serp.adapter.carousel_widget.InterfaceC34698h
    @SuppressLint({"NotifyDataSetChanged"})
    public final void xc(@Y61.k UV0.c cVar, int i12, @Y61.l SerpDisplayType serpDisplayType) {
        List<T> list = cVar.f16399b;
        boolean z12 = false;
        if (!list.isEmpty() && (list.get(0) instanceof SerpConstructorAdvertItem)) {
            z12 = true;
        }
        this.f269372S = z12;
        this.f269375d.f338510e = cVar;
        RecyclerView recyclerView = this.f269384m;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        com.avito.konveyor.adapter.j jVar = this.f269391t;
        if (adapter == null) {
            recyclerView.setAdapter(jVar);
        } else if (recyclerView.d0()) {
            recyclerView.post(new com.avito.android.publish.screen.objects.view.actions.h(this, 14));
        } else {
            jVar.notifyDataSetChanged();
        }
        this.f269393v = i12;
        if ((serpDisplayType == null || !serpDisplayType.isAvitoSales()) && (serpDisplayType == null || !serpDisplayType.isAvitoPromotion())) {
            return;
        }
        this.f269364K = (io.reactivex.rxjava3.internal.observers.m) com.avito.android.lib.util.recycler_wrap_height_calculator.c.a(this.f269363J, this.f269384m, null, null, Integer.valueOf(((Number) this.f269359F.getValue()).intValue()), 14).x(new z(this), new A(this));
    }

    @Override // com.avito.android.serp.adapter.carousel_widget.InterfaceC34698h
    public final void zG(@Y61.k String str, boolean z12, @InterfaceC42150f @Y61.l Integer num, @Y61.l ItemsCarouselWidget.ButtonColors buttonColors) {
        G80(z12, num, buttonColors);
        this.f269370Q.c(D80(), str);
    }

    @Override // com.avito.android.serp.adapter.carousel_widget.InterfaceC34698h
    public final void zb(@Y61.k UV0.c cVar) {
        com.avito.android.advert.viewed.g gVar = this.f269374c;
        gVar.c(cVar);
        gVar.d(this);
    }
}
