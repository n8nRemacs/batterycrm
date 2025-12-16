package com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.banner;

import VU.b;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.compose.runtime.internal.P;
import androidx.constraintlayout.widget.Barrier;
import com.avito.android.R;
import com.avito.android.lib.design.banner.a;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.gradient.AvitoLinearGradientDrawable;
import com.avito.android.lib.design.skeleton.Skeleton;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.banner.BannerItem;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.banner.g;
import com.avito.android.util.C35763c0;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BannerItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/banner/f;", "Lcom/avito/konveyor/adapter/b;", "LTV0/e;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f extends com.avito.konveyor.adapter.b implements TV0.e {

    /* renamed from: b, reason: collision with root package name */
    @l
    public BannerItem f220883b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f220884c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final CardView f220885d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final View f220886e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f220887f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final ImageView f220888g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final TextView f220889h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final Button f220890i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final Barrier f220891j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final View f220892k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final Skeleton f220893l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final Object f220894m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final Object f220895n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final UU.a f220896o;

    /* compiled from: BannerItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f220897a;

        static {
            int[] iArr = new int[BannerItem.Style.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                BannerItem.Style style = BannerItem.Style.f220869b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[BannerItem.Button.Style.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                BannerItem.Button.Style style2 = BannerItem.Button.Style.f220865b;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f220897a = iArr2;
        }
    }

    /* compiled from: BannerItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/banner/g;", "invoke", "()Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/banner/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<g> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final g invoke() {
            g.a aVar = g.f220901m;
            Context context = f.this.f220884c;
            aVar.getClass();
            int iB2 = y6.b(20);
            int iB3 = y6.b(24);
            int iJ2 = C35835l0.j(R.attr.textH40, context);
            int iJ3 = C35835l0.j(R.attr.textM10, context);
            b.a aVar2 = VU.b.f17147t;
            int iJ4 = C35835l0.j(R.attr.buttonPrimaryMedium, context);
            aVar2.getClass();
            VU.b bVarC = b.a.c(iJ4, context);
            VU.b bVarC2 = b.a.c(C35835l0.j(R.attr.buttonSecondaryMedium, context), context);
            Drawable drawableH = C35835l0.h(R.attr.ic_close24, context);
            AvitoLinearGradientDrawable.a.C5275a c5275a = new AvitoLinearGradientDrawable.a.C5275a(context, R.attr.gradientLinearMixedHorizontalVioletBlue, 0, 4, null);
            c5275a.f179264a = iB2;
            return new g(iJ2, iJ3, bVarC, bVarC2, drawableH, new AvitoLinearGradientDrawable(c5275a.a()), iB2, y6.b(6), y6.b(20), y6.b(26), iB3, iB3, null);
        }
    }

    /* compiled from: BannerItemView.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            BannerItem.Button button;
            Y41.l<String, G0> lVar;
            BannerItem bannerItem = f.this.f220883b;
            if (bannerItem != null && (button = bannerItem.f220858e) != null && (lVar = button.f220864c) != null) {
                lVar.invoke(bannerItem.f220855b);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: BannerItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/banner/g;", "invoke", "()Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/banner/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<g> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final g invoke() {
            g.a aVar = g.f220901m;
            Context context = f.this.f220884c;
            aVar.getClass();
            float fB2 = y6.b(28);
            int iB2 = y6.b(20);
            a.C5258a c5258a = com.avito.android.lib.design.banner.a.f178448x;
            int iJ2 = C35835l0.j(R.attr.bannerWarmgray, context);
            c5258a.getClass();
            C35763c0 c35763c0 = a.C5258a.b(iJ2, context).f178450b;
            int iD2 = c35763c0 != null ? c35763c0.f318848a : C35835l0.d(R.attr.warmGray24, context);
            int iJ3 = C35835l0.j(R.attr.textH50, context);
            int iJ4 = C35835l0.j(R.attr.textM20, context);
            b.a aVar2 = VU.b.f17147t;
            int iJ5 = C35835l0.j(R.attr.buttonPrimarySmall, context);
            aVar2.getClass();
            VU.b bVarC = b.a.c(iJ5, context);
            VU.b bVarC2 = b.a.c(C35835l0.j(R.attr.buttonDefaultInverseSmall, context), context);
            Drawable drawableH = C35835l0.h(R.attr.ic_close16, context);
            PaintDrawable paintDrawable = new PaintDrawable(iD2);
            paintDrawable.setShape(new RectShape());
            paintDrawable.setCornerRadius(fB2);
            return new g(iJ3, iJ4, bVarC, bVarC2, drawableH, paintDrawable, fB2, y6.b(8), y6.b(16), y6.b(24), iB2, iB2, null);
        }
    }

    public f(@k View view) {
        super(view);
        this.f220884c = view.getContext();
        this.f220885d = (CardView) view.findViewById(R.id.banner_content_group);
        this.f220886e = view.findViewById(R.id.banner_content_container);
        this.f220887f = (TextView) view.findViewById(R.id.banner_title);
        ImageView imageView = (ImageView) view.findViewById(R.id.banner_close_icon);
        this.f220888g = imageView;
        this.f220889h = (TextView) view.findViewById(R.id.banner_description);
        this.f220890i = (Button) view.findViewById(R.id.banner_button);
        this.f220891j = (Barrier) view.findViewById(R.id.banner_top_barrier);
        this.f220892k = view.findViewById(R.id.banner_loading_group);
        this.f220893l = (Skeleton) view.findViewById(R.id.banner_loading_skeleton);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406616d;
        this.f220894m = C42727D.b(lazyThreadSafetyMode, new d());
        this.f220895n = C42727D.b(lazyThreadSafetyMode, new b());
        this.f220896o = new UU.a(null, null, false, false, false, new c(), null, null, null, false, 991, null);
        imageView.setOnClickListener(new com.avito.android.order.feature.c(this, 28));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.C] */
    public final void B80(BannerItem bannerItem) {
        g gVar;
        int iOrdinal = bannerItem.f220859f.ordinal();
        if (iOrdinal == 0) {
            gVar = (g) this.f220895n.getValue();
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            gVar = (g) this.f220894m.getValue();
        }
        this.f220887f.setTextAppearance(gVar.f220902a);
        this.f220889h.setTextAppearance(gVar.f220903b);
        this.f220888g.setImageDrawable(gVar.f220906e);
        Drawable drawable = gVar.f220907f;
        CardView cardView = this.f220885d;
        cardView.setBackground(drawable);
        float f12 = gVar.f220908g;
        cardView.setRadius(f12);
        this.f220893l.setRadius(f12);
        this.f220891j.setMargin(gVar.f220909h);
        this.f220886e.setPaddingRelative(gVar.f220912k, gVar.f220910i, gVar.f220913l, gVar.f220911j);
        VU.b bVar = null;
        BannerItem.Button button = bannerItem.f220858e;
        BannerItem.Button.Style style = button != null ? button.f220863b : null;
        int i12 = style == null ? -1 : a.f220897a[style.ordinal()];
        if (i12 == 1) {
            bVar = gVar.f220904c;
        } else if (i12 == 2) {
            bVar = gVar.f220905d;
        }
        if (bVar != null) {
            this.f220890i.setStyle(bVar);
        }
    }

    public final void C80(BannerItem bannerItem) {
        BannerItem.Button button = bannerItem.f220858e;
        Button button2 = this.f220890i;
        if (button == null) {
            button2.setVisibility(8);
            return;
        }
        button2.setVisibility(0);
        button2.setState(UU.a.a(this.f220896o, bannerItem.f220858e.f220862a.k0(this.f220884c), false, false, false, null, 1022));
    }
}
