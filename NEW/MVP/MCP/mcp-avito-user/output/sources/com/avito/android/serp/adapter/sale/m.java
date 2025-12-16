package com.avito.android.serp.adapter.sale;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.sales.SalesHeaderWidget;
import com.avito.android.remote.model.sales.utils.Timer;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp_core.timer.CountDownTimerWidget;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.facebook.drawee.drawable.s;
import java.util.ArrayList;
import java.util.List;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import sK0.C48063a;
import sK0.C48065c;

/* compiled from: SaleHeaderView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/sale/m;", "Lcom/avito/android/serp/adapter/sale/l;", "Lcom/avito/konveyor/adapter/b;", "a", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class m extends com.avito.konveyor.adapter.b implements l {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f271502b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.h f271503c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.j f271504d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f271505e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Banner f271506f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f271507g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final TextView f271508h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f271509i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final TextView f271510j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final Badge f271511k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final CountDownTimerWidget f271512l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f271513m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f271514n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final ArrayList f271515o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final UV0.c<TV0.a> f271516p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f271517q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f271518r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f271519s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f271520t;

    /* compiled from: SaleHeaderView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/serp/adapter/sale/m$a;", "", "<init>", "()V", "", "DEFAULT_TITLE_AND_SUBTITLE_MAX_LINES", "I", "IMAGE_BOTTOM_SUBTITLE_MAX_LINES", "IMAGE_BOTTOM_TITLE_MAX_LINES", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SaleHeaderView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f271521a;

        static {
            int[] iArr = new int[SalesHeaderWidget.ImageDisplayMode.values().length];
            try {
                iArr[SalesHeaderWidget.ImageDisplayMode.BOTTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SalesHeaderWidget.ImageDisplayMode.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f271521a = iArr;
        }
    }

    /* compiled from: SaleHeaderView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<Integer> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final Integer invoke() {
            return com.avito.android.advert.item.delivery_suggests.l.n(m.this.f271502b, R.dimen.banner_padding_bottom_with_image_last);
        }
    }

    /* compiled from: SaleHeaderView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.a<Integer> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final Integer invoke() {
            return com.avito.android.advert.item.delivery_suggests.l.n(m.this.f271502b, R.dimen.banner_padding_bottom_without_image_last);
        }
    }

    /* compiled from: SaleHeaderView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<G0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            D6.w(m.this.f271512l);
            return G0.f406611a;
        }
    }

    /* compiled from: SaleHeaderView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class f extends N implements Y41.a<Integer> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final Integer invoke() {
            return com.avito.android.advert.item.delivery_suggests.l.n(m.this.f271502b, R.dimen.image_bottom_mode_sale_header_subtitle_margin_top);
        }
    }

    /* compiled from: SaleHeaderView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class g extends N implements Y41.a<Integer> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final Integer invoke() {
            return com.avito.android.advert.item.delivery_suggests.l.n(m.this.f271502b, R.dimen.image_top_mode_sale_header_subtitle_margin_top);
        }
    }

    static {
        new a(null);
    }

    public m(@Y61.k View view, @Y61.k com.avito.konveyor.adapter.h hVar, @Y61.k com.avito.konveyor.adapter.j jVar) {
        super(view);
        this.f271502b = view;
        this.f271503c = hVar;
        this.f271504d = jVar;
        this.f271505e = view.getContext();
        Banner banner = (Banner) view;
        this.f271506f = banner;
        View viewFindViewById = banner.findViewById(R.id.sale_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f271507g = (TextView) viewFindViewById;
        View viewFindViewById2 = banner.findViewById(R.id.sale_subtitle);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f271508h = (TextView) viewFindViewById2;
        View viewFindViewById3 = banner.findViewById(R.id.items_recycler);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById3;
        this.f271509i = recyclerView;
        View viewFindViewById4 = banner.findViewById(R.id.sale_sticker);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f271510j = (TextView) viewFindViewById4;
        View viewFindViewById5 = banner.findViewById(R.id.timer_badge);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.badge.Badge");
        }
        this.f271511k = (Badge) viewFindViewById5;
        View viewFindViewById6 = banner.findViewById(R.id.timer);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.serp_core.timer.CountDownTimerWidget");
        }
        this.f271512l = (CountDownTimerWidget) viewFindViewById6;
        View viewFindViewById7 = banner.findViewById(R.id.image);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f271513m = (SimpleDraweeView) viewFindViewById7;
        View viewFindViewById8 = banner.findViewById(R.id.bottom_image);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f271514n = (SimpleDraweeView) viewFindViewById8;
        ArrayList arrayList = new ArrayList();
        this.f271515o = arrayList;
        this.f271516p = new UV0.c<>(arrayList);
        this.f271517q = C42727D.c(new f());
        this.f271518r = C42727D.c(new g());
        this.f271519s = C42727D.c(new c());
        this.f271520t = C42727D.c(new d());
        recyclerView.setAdapter(jVar);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setOverScrollMode(2);
        recyclerView.l(new com.avito.android.serp.adapter.sale.a(), -1);
    }

    @Override // com.avito.android.serp.adapter.sale.l
    public final void D7(@Y61.k UniversalColor universalColor) {
        Banner.h(this.f271506f, C48065c.a(this.f271502b.getContext(), universalColor, R.attr.constantWhite));
    }

    @Override // com.avito.android.serp.adapter.sale.l
    public final void Er(boolean z12) {
        Banner banner = this.f271506f;
        if (z12) {
            D6.f(this.f271506f, 0, 0, 0, ((Number) this.f271519s.getValue()).intValue(), 7);
            banner.Tz(false, false);
        } else {
            D6.f(this.f271506f, 0, 0, 0, ((Number) this.f271520t.getValue()).intValue(), 7);
            banner.Tz(false, true);
        }
    }

    @Override // com.avito.android.serp.adapter.sale.l
    public final void GN(@Y61.k List<? extends PersistableSerpItem> list) {
        ArrayList arrayList = this.f271515o;
        arrayList.clear();
        boolean zIsEmpty = list.isEmpty();
        RecyclerView recyclerView = this.f271509i;
        if (zIsEmpty) {
            D6.w(recyclerView);
        } else {
            arrayList.addAll(list);
            D6.H(recyclerView);
        }
        this.f271503c.f338510e = this.f271516p;
        this.f271504d.notifyDataSetChanged();
    }

    @Override // com.avito.android.serp.adapter.sale.l
    public final void I3(@Y61.l Long l12, @Y61.l Timer.TimerStyle timerStyle) {
        CountDownTimerWidget countDownTimerWidget = this.f271512l;
        if (l12 == null) {
            D6.w(countDownTimerWidget);
            return;
        }
        CountDownTimerWidget.d(countDownTimerWidget, l12.longValue());
        countDownTimerWidget.setOnFinishListener(new e());
        D6.H(countDownTimerWidget);
        Context context = this.f271505e;
        if (timerStyle == null) {
            countDownTimerWidget.setSeparatorTextColor(C35835l0.d(R.attr.constantWhite, context));
            countDownTimerWidget.setCellTextColor(C35835l0.d(R.attr.constantBlack, context));
            return;
        }
        UniversalColor cellColor = timerStyle.getCellColor();
        C48063a c48063a = C48063a.f437606a;
        countDownTimerWidget.setCellBackgroundColorTint(c48063a.a(context, cellColor));
        countDownTimerWidget.setSeparatorTextColor(c48063a.a(context, timerStyle.getCellColor()));
        countDownTimerWidget.setCellTextColor(c48063a.a(context, timerStyle.getTextColor()));
    }

    @Override // com.avito.android.serp.adapter.sale.l
    public final void QB(@Y61.l UniversalImage universalImage, boolean z12) {
        Image imageG = universalImage != null ? com.avito.android.advert.item.delivery_suggests.l.g(this.f271502b, universalImage) : null;
        SimpleDraweeView simpleDraweeView = this.f271514n;
        if (imageG == null) {
            if (z12) {
                D6.w(simpleDraweeView);
                return;
            } else {
                D6.g(simpleDraweeView);
                return;
            }
        }
        D6.H(simpleDraweeView);
        com.avito.android.advert.item.delivery_suggests.l.w(imageG, C35949t5.a(simpleDraweeView));
        RecyclerView recyclerView = this.f271509i;
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        bVar.f44199k = simpleDraweeView.getId();
        recyclerView.setLayoutParams(bVar);
    }

    @Override // com.avito.android.serp.adapter.sale.l
    @Y61.l
    public final String e(@Y61.l AttributedText attributedText) {
        TextView textView = this.f271507g;
        com.avito.android.util.text.j.a(textView, attributedText, null);
        CharSequence text = textView.getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    @Override // com.avito.android.serp.adapter.sale.l
    public final void g00(@Y61.l String str, @Y61.l SalesHeaderWidget.DateBadgeStyle dateBadgeStyle) {
        Badge badge = this.f271511k;
        if (str == null) {
            D6.w(badge);
            return;
        }
        badge.setTitleText(str);
        D6.H(badge);
        if (dateBadgeStyle != null) {
            UniversalColor textColor = dateBadgeStyle.getTextColor();
            Context context = this.f271505e;
            C48063a c48063a = C48063a.f437606a;
            badge.setTextColor(c48063a.a(context, textColor));
            Drawable background = badge.getBackground();
            GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
            if (gradientDrawable != null) {
                gradientDrawable.setColor(c48063a.a(context, dateBadgeStyle.getBackgroundColor()));
            }
            badge.setBackground(gradientDrawable);
        }
    }

    @Override // com.avito.android.serp.adapter.sale.l
    public final void jl(@Y61.l String str) {
        I5.a(this.f271510j, str, false);
    }

    @Override // com.avito.android.serp.adapter.sale.l
    public final void k(@Y61.l AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f271508h, attributedText, null);
    }

    @Override // com.avito.android.serp.adapter.sale.l
    public final void yX(@Y61.l UniversalImage universalImage, @Y61.k SalesHeaderWidget.ImageDisplayMode imageDisplayMode) {
        Image imageG = universalImage != null ? com.avito.android.advert.item.delivery_suggests.l.g(this.f271502b, universalImage) : null;
        SimpleDraweeView simpleDraweeView = this.f271513m;
        if (imageG == null) {
            D6.w(simpleDraweeView);
            return;
        }
        D6.H(simpleDraweeView);
        int i12 = b.f271521a[imageDisplayMode.ordinal()];
        TextView textView = this.f271508h;
        TextView textView2 = this.f271507g;
        RecyclerView recyclerView = this.f271509i;
        if (i12 == 1) {
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            bVar.f44199k = simpleDraweeView.getId();
            recyclerView.setLayoutParams(bVar);
            simpleDraweeView.getLayoutParams().height = 0;
            ViewGroup.LayoutParams layoutParams2 = simpleDraweeView.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams2;
            bVar2.f44203m = this.f271514n.getId();
            simpleDraweeView.setLayoutParams(bVar2);
            textView2.setMaxLines(3);
            textView.setMaxLines(2);
            D6.c(this.f271508h, null, Integer.valueOf(((Number) this.f271517q.getValue()).intValue()), null, null, 13);
            ((GW0.a) simpleDraweeView.getHierarchy()).n(s.c.f340134f);
        } else if (i12 == 2) {
            ViewGroup.LayoutParams layoutParams3 = recyclerView.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar3 = (ConstraintLayout.b) layoutParams3;
            bVar3.f44199k = this.f271512l.getId();
            recyclerView.setLayoutParams(bVar3);
            simpleDraweeView.getLayoutParams().height = -2;
            ViewGroup.LayoutParams layoutParams4 = simpleDraweeView.getLayoutParams();
            if (layoutParams4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar4 = (ConstraintLayout.b) layoutParams4;
            bVar4.f44203m = -1;
            simpleDraweeView.setLayoutParams(bVar4);
            textView2.setMaxLines(10);
            textView.setMaxLines(10);
            D6.c(this.f271508h, null, Integer.valueOf(((Number) this.f271518r.getValue()).intValue()), null, null, 13);
            ((GW0.a) simpleDraweeView.getHierarchy()).n(s.c.f340133e);
        }
        Size size = (Size) C42745f0.D(imageG.getVariants().keySet());
        simpleDraweeView.setAspectRatio(size.getWidth() / size.getHeight());
        com.avito.android.advert.item.delivery_suggests.l.w(imageG, C35949t5.a(simpleDraweeView));
    }
}
