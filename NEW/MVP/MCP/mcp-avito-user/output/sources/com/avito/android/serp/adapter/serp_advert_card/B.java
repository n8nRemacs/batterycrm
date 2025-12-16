package com.avito.android.serp.adapter.serp_advert_card;

import aV.C19818a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.SpannableString;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.cyclic_gallery_widget.item.CircularGalleryItemType;
import com.avito.android.design.widget.ClickableGalleryPager;
import com.avito.android.lib.deprecated_design.CheckableImageView;
import com.avito.android.lib.design.docking_badge.DockingBadgeContainer;
import com.avito.android.remote.model.BuyWithDeliveryButton;
import com.avito.android.remote.model.DiscountIcon;
import com.avito.android.remote.model.QuorumFilterInfo;
import com.avito.android.remote.model.QuorumFilterPrice;
import com.avito.android.remote.model.RadiusInfo;
import com.avito.android.remote.model.SellerRating;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.badge.Badge;
import com.avito.android.remote.model.badge_bar.SerpBadge;
import com.avito.android.remote.model.badge_bar.SerpBadgeBar;
import com.avito.android.remote.model.sales.utils.BadgeSticker;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.w6;
import com.google.android.material.internal.CheckableImageButton;
import hw.InterfaceC41177b;
import j.InterfaceC42161q;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import jr0.C42418a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import ru.avito.component.serp.AsyncViewportTracker;
import ru.avito.component.serp.DeliveryTerms;
import ru.avito.component.snippet_badge_bar.SnippetBadgeBar;
import sK0.C48063a;

/* compiled from: SerpAdvertTileCard.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/serp_advert_card/B;", "Lcom/avito/android/serp/adapter/serp_advert_card/w;", "a", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC41177b
/* loaded from: classes3.dex */
public final class B implements w {

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public static final DecimalFormat f271723i0;

    /* renamed from: A, reason: collision with root package name */
    @Y61.l
    public final DockingBadgeContainer f271724A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.l
    public final TextView f271725B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.l
    public final TextView f271726C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.l
    public final TextView f271727D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.l
    public final CheckableImageButton f271728E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.l
    public final CheckableImageView f271729F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.l
    public final TextView f271730G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.l
    public final TextView f271731H;

    /* renamed from: I, reason: collision with root package name */
    @Y61.l
    public final View f271732I;

    /* renamed from: J, reason: collision with root package name */
    @Y61.l
    public final View f271733J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.l
    public final View f271734K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.l
    public final LinearLayout f271735L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.l
    public final ImageView f271736M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.l
    public final TextView f271737N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.l
    public final TextView f271738O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.l
    public final ImageView f271739P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.l
    public final ImageView f271740Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.l
    public final TextView f271741R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.l
    public final View f271742S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.l
    public final TextView f271743T;

    /* renamed from: U, reason: collision with root package name */
    @Y61.l
    public final TextView f271744U;

    /* renamed from: V, reason: collision with root package name */
    @Y61.l
    public final ImageView f271745V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.l
    public final View f271746W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final Q81.j f271747X;

    /* renamed from: Y, reason: collision with root package name */
    public final float f271748Y;

    /* renamed from: Z, reason: collision with root package name */
    public final float f271749Z;

    /* renamed from: a0, reason: collision with root package name */
    public float f271750a0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f271751b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f271752b0;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public AsyncViewportTracker.ViewContext f271753c;

    /* renamed from: c0, reason: collision with root package name */
    public final int f271754c0;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.date_time_formatter.c f271755d;

    /* renamed from: d0, reason: collision with root package name */
    public final int f271756d0;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f271757e;

    /* renamed from: e0, reason: collision with root package name */
    @Y61.l
    public final Drawable f271758e0;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ClickableGalleryPager f271759f;

    /* renamed from: f0, reason: collision with root package name */
    @Y61.k
    public ShownItemsAbTestGroup f271760f0;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final TextView f271761g;

    /* renamed from: g0, reason: collision with root package name */
    @Y61.k
    public final G f271762g0;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final TextView f271763h;

    /* renamed from: h0, reason: collision with root package name */
    @Y61.k
    public final Vt.c f271764h0;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final ImageView f271765i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final TextView f271766j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final ImageView f271767k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final TextView f271768l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final TextView f271769m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final TextView f271770n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final TextView f271771o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public final TextView f271772p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final TextView f271773q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public final TextView f271774r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public final View f271775s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public final TextView f271776t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.l
    public final TextView f271777u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.l
    public final TextView f271778v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.l
    public final TextView f271779w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.l
    public final TextView f271780x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.l
    public final TextView f271781y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.l
    public final SnippetBadgeBar f271782z;

    /* compiled from: SerpAdvertTileCard.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/serp/adapter/serp_advert_card/B$a;", "", "<init>", "()V", "Ljava/text/DecimalFormat;", "ratingFormatter", "Ljava/text/DecimalFormat;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SerpAdvertTileCard.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[ShownItemsAbTestGroup.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ShownItemsAbTestGroup shownItemsAbTestGroup = ShownItemsAbTestGroup.f271856b;
                iArr[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ShownItemsAbTestGroup shownItemsAbTestGroup2 = ShownItemsAbTestGroup.f271856b;
                iArr[4] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: Views.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/util/I6", "Landroid/view/View$OnLayoutChangeListener;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements View.OnLayoutChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f271783b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ B f271784c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ N f271785d;

        /* JADX WARN: Multi-variable type inference failed */
        public c(View view, B b12, Y41.q qVar) {
            this.f271783b = view;
            this.f271784c = b12;
            this.f271785d = (N) qVar;
        }

        /* JADX WARN: Type inference failed for: r4v1, types: [Y41.q, kotlin.jvm.internal.N] */
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(@Y61.l View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            B b12 = this.f271784c;
            View childAt = b12.f271759f.getChildAt(0);
            if (childAt != null) {
                this.f271785d.invoke(Integer.valueOf(childAt.getWidth()), Integer.valueOf(childAt.getHeight()), b12.f271753c);
            }
            this.f271783b.removeOnLayoutChangeListener(this);
        }
    }

    /* compiled from: SerpAdvertTileCard.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f271786l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.a<G0> aVar) {
            super(0);
            this.f271786l = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f271786l.invoke();
            return G0.f406611a;
        }
    }

    static {
        new a(null);
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setDecimalSeparator(',');
        f271723i0 = new DecimalFormat("0.0", decimalFormatSymbols);
    }

    public B(@Y61.k View view, @Y61.k com.avito.android.server_time.h hVar, @Y61.k Locale locale, @Y61.k AsyncViewportTracker.ViewContext viewContext, @Y61.l com.avito.android.video_snippets.g gVar, @InterfaceC42161q @Y61.l Integer num) throws Resources.NotFoundException {
        this.f271751b = view;
        this.f271753c = viewContext;
        View viewFindViewById = view.findViewById(R.id.advert_content);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f271757e = (ViewGroup) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.image_pager);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.design.widget.ClickableGalleryPager");
        }
        this.f271759f = (ClickableGalleryPager) viewFindViewById2;
        this.f271761g = (TextView) view.findViewById(R.id.shop_name);
        this.f271763h = (TextView) view.findViewById(R.id.verification);
        this.f271765i = (ImageView) view.findViewById(R.id.location_icon);
        this.f271766j = (TextView) view.findViewById(R.id.location);
        this.f271767k = (ImageView) view.findViewById(R.id.distance_icon);
        this.f271768l = (TextView) view.findViewById(R.id.quorum_filter_info);
        this.f271769m = (TextView) view.findViewById(R.id.distance);
        View viewFindViewById3 = view.findViewById(R.id.title);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f271770n = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.price);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById4;
        this.f271771o = textView;
        this.f271772p = (TextView) view.findViewById(R.id.price_without_discount);
        View viewFindViewById5 = view.findViewById(R.id.discount);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f271773q = (TextView) viewFindViewById5;
        this.f271774r = (TextView) view.findViewById(R.id.discount_percentage);
        this.f271775s = view.findViewById(R.id.discount_icon);
        this.f271776t = (TextView) view.findViewById(R.id.price_list_count_hint);
        this.f271777u = (TextView) view.findViewById(R.id.date);
        this.f271778v = (TextView) view.findViewById(R.id.address);
        this.f271779w = (TextView) view.findViewById(R.id.address_additional_info);
        this.f271780x = (TextView) view.findViewById(R.id.card_info_badge);
        this.f271781y = (TextView) view.findViewById(R.id.badge);
        this.f271782z = (SnippetBadgeBar) view.findViewById(R.id.badge_bar);
        this.f271724A = (DockingBadgeContainer) view.findViewById(R.id.badge_bar_redesign);
        this.f271725B = (TextView) view.findViewById(R.id.badge_sticker);
        this.f271726C = (TextView) view.findViewById(R.id.marketplace_instock);
        this.f271727D = (TextView) view.findViewById(R.id.marketplace_trust_factor);
        this.f271728E = (CheckableImageButton) view.findViewById(R.id.btn_favorite);
        this.f271729F = (CheckableImageView) view.findViewById(R.id.btn_favorite_redesign);
        this.f271730G = (TextView) view.findViewById(R.id.buy_with_delivery_link);
        this.f271731H = (TextView) view.findViewById(R.id.additional_name);
        this.f271732I = view.findViewById(R.id.more_actions_button);
        this.f271733J = view.findViewById(R.id.hidden_stub);
        this.f271734K = view.findViewById(R.id.delivery);
        this.f271735L = (LinearLayout) view.findViewById(R.id.delivery_terms_container);
        this.f271736M = (ImageView) view.findViewById(R.id.delivery_terms_icon);
        this.f271737N = (TextView) view.findViewById(R.id.delivery_terms);
        this.f271738O = (TextView) view.findViewById(R.id.additional_action);
        this.f271739P = (ImageView) view.findViewById(R.id.has_realty_layout);
        ImageView imageView = (ImageView) view.findViewById(R.id.has_video);
        this.f271740Q = imageView;
        this.f271741R = (TextView) view.findViewById(R.id.seller_info_name);
        this.f271742S = view.findViewById(R.id.rating_star);
        this.f271743T = (TextView) view.findViewById(R.id.rating);
        this.f271744U = (TextView) view.findViewById(R.id.rating_count);
        this.f271745V = (ImageView) view.findViewById(R.id.similar_button);
        this.f271746W = view.findViewById(R.id.geo_reference);
        this.f271747X = new Q81.j(textView, false);
        this.f271754c0 = C35835l0.d(R.attr.green600, view.getContext());
        this.f271756d0 = C35835l0.d(R.attr.green300, view.getContext());
        this.f271758e0 = C35835l0.h(R.attr.ic_verify16, view.getContext());
        this.f271760f0 = ShownItemsAbTestGroup.f271856b;
        Integer numValueOf = null;
        this.f271762g0 = new G(false, false, 3, null);
        com.jakewharton.rxrelay3.c cVar = new com.jakewharton.rxrelay3.c();
        if (num != null) {
            numValueOf = Integer.valueOf(view.getContext().getResources().getDimensionPixelSize(num.intValue()));
        }
        Yt.d dVar = new Yt.d(R.layout.constructor_advert_image_page, true, numValueOf);
        Yt.e eVar = new Yt.e(gVar, cVar);
        View viewFindViewById6 = view.findViewById(R.id.advert_content);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f271764h0 = new Vt.c(viewFindViewById6, new EnumMap(P0.g(new Q(CircularGalleryItemType.f132169b, dVar), new Q(CircularGalleryItemType.f132170c, dVar), new Q(CircularGalleryItemType.f132171d, eVar), new Q(CircularGalleryItemType.f132172e, eVar))));
        TypedValue typedValue = new TypedValue();
        view.getResources().getValue(R.dimen.inactive_alpha_old, typedValue, true);
        this.f271749Z = typedValue.getFloat();
        view.getResources().getValue(R.dimen.active_alpha, typedValue, true);
        this.f271748Y = typedValue.getFloat();
        view.getResources().getValue(R.dimen.viewed_alpha, typedValue, true);
        this.f271750a0 = typedValue.getFloat();
        this.f271755d = new com.avito.android.date_time_formatter.c(hVar, new com.avito.android.date_time_formatter.g(view.getContext().getResources(), 1), locale);
        if (imageView == null) {
            return;
        }
        imageView.setBackground(Q81.c.a(view));
    }

    public static final void f(B b12, boolean z12, boolean z13) {
        if (z12 && !z13) {
            b12.f271757e.setAlpha(b12.f271748Y);
            D6.w(b12.f271780x);
        } else {
            if (z12) {
                return;
            }
            b12.f271757e.setAlpha(b12.f271749Z);
            D6.w(b12.f271780x);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void B1(long j12) {
        String strA;
        TextView textView = this.f271777u;
        if (textView != null) {
            if (j12 > 0) {
                strA = this.f271755d.a(Long.valueOf(j12), TimeUnit.SECONDS);
            } else {
                strA = null;
            }
            I5.a(textView, strA, false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void B5(@Y61.l String str, @Y61.k RadiusInfo radiusInfo) {
        TextView textView = this.f271778v;
        if (textView != null) {
            SpannableString spannableString = new SpannableString(D.d(str, radiusInfo));
            D.c(spannableString, radiusInfo, this.f271751b.getContext());
            I5.a(textView, spannableString, false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void C(@Y61.l String str) {
        TextView textView = this.f271778v;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void D0(@Y61.l QuorumFilterInfo quorumFilterInfo) {
        QuorumFilterPrice price;
        TextView textView = this.f271768l;
        if (textView != null) {
            I5.a(textView, (quorumFilterInfo == null || (price = quorumFilterInfo.getPrice()) == null) ? null : price.getText(), false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void E0(@Y61.l String str) {
        TextView textView = this.f271769m;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    @SuppressLint({"RestrictedApi"})
    public final void Ed(@Y61.k SerpDisplayType serpDisplayType, boolean z12) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View view = this.f271751b;
        CheckableImageButton checkableImageButton = this.f271728E;
        if (checkableImageButton != null) {
            checkableImageButton.setChecked(z12);
            if (this.f271752b0 && serpDisplayType.isList()) {
                ViewGroup.LayoutParams layoutParams = checkableImageButton.getLayoutParams();
                marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams == null) {
                    return;
                }
                marginLayoutParams.rightMargin = D6.j(view, 6);
                return;
            }
            return;
        }
        CheckableImageView checkableImageView = this.f271729F;
        if (checkableImageView != null) {
            checkableImageView.setChecked(z12);
            if (this.f271752b0 && serpDisplayType.isList()) {
                ViewGroup.LayoutParams layoutParams2 = checkableImageView.getLayoutParams();
                marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                if (marginLayoutParams == null) {
                    return;
                }
                marginLayoutParams.rightMargin = D6.j(view, 6);
            }
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void F0(@Y61.k Y41.a<G0> aVar) {
        CheckableImageButton checkableImageButton = this.f271728E;
        if (checkableImageButton != null) {
            checkableImageButton.setOnClickListener(new A(0, aVar));
            return;
        }
        CheckableImageView checkableImageView = this.f271729F;
        if (checkableImageView != null) {
            checkableImageView.setOnClickListener(new A(1, aVar));
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void Fc(@Y61.l String str, @Y61.l UniversalColor universalColor, boolean z12, @Y61.l UniversalColor universalColor2) {
        this.f271747X.a(str, z12, universalColor2);
        if (universalColor != null) {
            TextView textView = this.f271771o;
            textView.setTextColor(C48063a.f437606a.a(textView.getContext(), universalColor));
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void Fd(int i12, @Y61.k List list) {
        Vt.c cVar = this.f271764h0;
        cVar.a(list, false);
        cVar.f17465b.x(cVar.f17467d.b(0), false);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void GZ(@Y61.l String str, boolean z12, @Y61.l Boolean bool) {
        TextView textView = this.f271766j;
        if (textView != null) {
            I5.a(textView, str, false);
            if (bool != null) {
                textView.setTextColor(bool.booleanValue() ? C35835l0.d(R.attr.gray54, textView.getContext()) : C35835l0.d(R.attr.black, textView.getContext()));
            }
        }
        ImageView imageView = this.f271765i;
        if (imageView != null) {
            D6.G(imageView, z12);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void H2(@Y61.l Y41.a<G0> aVar) {
        TextView textView = this.f271738O;
        if (textView != null) {
            textView.setOnClickListener(new com.avito.android.profile_settings_extended.adapter.phones.l(29, aVar));
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void Id(boolean z12) {
        this.f271759f.setSkipTouchEventToParent(z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void K9(@Y61.l BadgeSticker badgeSticker, boolean z12) {
        TextView textView = this.f271725B;
        if (badgeSticker == null) {
            if (textView != null) {
                D6.w(textView);
                return;
            }
            return;
        }
        if (textView != null) {
            Context context = textView.getContext();
            UniversalColor backgroundColor = badgeSticker.getStyle().getBackgroundColor();
            C48063a.f437606a.getClass();
            textView.setBackgroundTintList(C48063a.e(context, backgroundColor));
            textView.setTextColor(C48063a.e(textView.getContext(), badgeSticker.getStyle().getFontColor()));
            I5.a(textView, badgeSticker.getTitle(), false);
            int dimensionPixelSize = z12 ? textView.getContext().getResources().getDimensionPixelSize(R.dimen.card_badge_sticker_bottom_margin_large) : textView.getContext().getResources().getDimensionPixelSize(R.dimen.card_badge_sticker_bottom_margin_small);
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = dimensionPixelSize;
            textView.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void Kl(@Y61.l DeliveryTerms deliveryTerms, @Y61.l String str) {
        ImageView imageView = this.f271736M;
        LinearLayout linearLayout = this.f271735L;
        TextView textView = this.f271737N;
        if (deliveryTerms != null) {
            D6.G(linearLayout, true);
            D6.G(textView, true);
            if (textView != null) {
                Q81.e eVar = Q81.e.f13555a;
                Context context = this.f271751b.getContext();
                eVar.getClass();
                textView.setText(Q81.e.a(context, deliveryTerms));
            }
            D6.w(imageView);
            return;
        }
        if (str == null) {
            D6.w(linearLayout);
            D6.w(textView);
            return;
        }
        D6.G(linearLayout, true);
        D6.G(textView, true);
        if (textView != null) {
            textView.setText(str);
        }
        D6.G(imageView, true);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void L6(@Y61.k Y41.l lVar, @Y61.l BuyWithDeliveryButton buyWithDeliveryButton) {
        TextView textView = this.f271730G;
        if (textView == null) {
            return;
        }
        if (buyWithDeliveryButton == null) {
            textView.setOnClickListener(null);
            D6.w(textView);
        } else {
            textView.setText(buyWithDeliveryButton.getTitle());
            textView.setOnClickListener(new com.avito.android.search.filter.adapter.select.m(lVar, buyWithDeliveryButton));
            D6.G(textView, true);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void M1(@Y61.l String str) {
        TextView textView = this.f271774r;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void N5(@Y61.l SellerRating sellerRating) {
        Float fValueOf;
        if (sellerRating != null) {
            Float scoreFloat = sellerRating.getScoreFloat();
            fValueOf = Float.valueOf(scoreFloat != null ? scoreFloat.floatValue() : sellerRating.getScore());
        } else {
            fValueOf = null;
        }
        boolean z12 = (sellerRating == null || fValueOf == null || sellerRating.getReviewCount() == null) ? false : true;
        TextView textView = this.f271743T;
        if (textView != null) {
            D6.G(textView, z12);
        }
        View view = this.f271742S;
        if (view != null) {
            D6.G(view, z12);
        }
        TextView textView2 = this.f271744U;
        if (textView2 != null) {
            D6.G(textView2, z12);
        }
        if (z12) {
            if (textView != null) {
                I5.a(textView, f271723i0.format(fValueOf), false);
            }
            if (textView2 != null) {
                I5.a(textView2, sellerRating.getReviewCount(), false);
            }
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    @Y61.k
    public final Uri O(@Y61.k com.avito.android.image_loader.k kVar) {
        return ((com.avito.android.image_loader.m) kVar).a(this.f271759f);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void O5(boolean z12, boolean z13) {
        View view = this.f271751b;
        int iD2 = com.avito.android.actions_sheet.a.d(view, R.dimen.discount_icon_small_padding);
        int iD3 = com.avito.android.actions_sheet.a.d(view, R.dimen.discount_icon_large_padding);
        View view2 = this.f271775s;
        D6.G(view2, z12);
        if (!z12 || view2 == null) {
            return;
        }
        if (!z13) {
            iD2 = iD3;
        }
        view2.setPadding(iD2, view2.getPaddingTop(), view2.getPaddingRight(), view2.getPaddingBottom());
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void S0(@Y61.l String str) {
        ImageView imageView = this.f271767k;
        if (imageView != null) {
            Integer numA = str != null ? com.avito.android.lib.util.q.a(str) : null;
            if (numA == null) {
                D6.w(imageView);
                return;
            }
            D6.G(imageView, true);
            View view = this.f271751b;
            imageView.setImageDrawable(C35835l0.h(numA.intValue(), view.getContext()));
            imageView.setImageTintList(C35835l0.e(R.attr.gray36, view.getContext()));
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void W9(@Y61.k ShownItemsAbTestGroup shownItemsAbTestGroup) {
        throw null;
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void X2(@Y61.l UniversalColor universalColor, @Y61.k String str) {
        TextView textView = this.f271770n;
        I5.a(textView, str, false);
        if (universalColor != null) {
            textView.setTextColor(C48063a.f437606a.a(textView.getContext(), universalColor));
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void X3(@Y61.l String str) {
        TextView textView = this.f271776t;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void Y4() {
        TextView textView = this.f271780x;
        if (textView != null) {
            I5.a(textView, textView.getContext().getText(R.string.reserved_badge_text), false);
        }
    }

    @Override // ru.avito.component.serp.AsyncViewportTracker
    public final void Z70(@Y61.k Y41.q<? super Integer, ? super Integer, ? super AsyncViewportTracker.ViewContext, G0> qVar) {
        ClickableGalleryPager clickableGalleryPager = this.f271759f;
        if (D6.y(clickableGalleryPager)) {
            clickableGalleryPager.addOnLayoutChangeListener(new c(clickableGalleryPager, this, qVar));
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void Zc(int i12, int i13, @Y61.k AsyncViewportTracker.ViewContext viewContext) {
        ClickableGalleryPager clickableGalleryPager = this.f271759f;
        ViewGroup.LayoutParams layoutParams = clickableGalleryPager.getLayoutParams();
        layoutParams.width = i12;
        layoutParams.height = i13;
        clickableGalleryPager.setLayoutParams(layoutParams);
        this.f271753c = viewContext;
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void a7() {
        this.f271759f.getLayoutParams().height = this.f271751b.getResources().getDimensionPixelSize(R.dimen.serp_vm_grid_snippet_height);
    }

    public final void b(boolean z12, boolean z13) {
        TextView textView = this.f271780x;
        ViewGroup viewGroup = this.f271757e;
        if (z12 && z13) {
            viewGroup.setAlpha(this.f271750a0);
            D6.H(textView);
        } else if (z12 && !z13) {
            viewGroup.setAlpha(this.f271748Y);
            D6.w(textView);
        } else {
            if (z12) {
                return;
            }
            viewGroup.setAlpha(this.f271749Z);
            D6.w(textView);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void b2(@Y61.l String str) {
        TextView textView = this.f271727D;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void c(@Y61.k Y41.a<G0> aVar) {
        this.f271751b.setOnClickListener(new i(6, aVar));
        this.f271764h0.b(new d(aVar));
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void cJ(@Y61.l String str, @Y61.l DiscountIcon discountIcon, boolean z12, boolean z13) {
        D.a(this.f271773q, this.f271771o, str, discountIcon, false, z12, z13);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void d1(boolean z12) {
        View view = this.f271728E;
        if (view == null && (view = this.f271729F) == null) {
            return;
        }
        D6.G(view, z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void d5(@Y61.l String str, @Y61.k RadiusInfo radiusInfo) {
        TextView textView = this.f271766j;
        if (textView != null) {
            SpannableString spannableString = new SpannableString(D.d(str, radiusInfo));
            View view = this.f271751b;
            D.c(spannableString, radiusInfo, view.getContext());
            SpannableString spannableString2 = new SpannableString(spannableString);
            D.c(spannableString2, radiusInfo, view.getContext());
            I5.a(textView, spannableString2, false);
        }
    }

    public final void e() {
        ShownItemsAbTestGroup shownItemsAbTestGroup = this.f271760f0;
        shownItemsAbTestGroup.getClass();
        boolean z12 = shownItemsAbTestGroup == ShownItemsAbTestGroup.f271857c || shownItemsAbTestGroup == ShownItemsAbTestGroup.f271858d || shownItemsAbTestGroup == ShownItemsAbTestGroup.f271859e;
        G g12 = this.f271762g0;
        if (z12) {
            boolean z13 = g12.f271853b;
            boolean z14 = g12.f271852a;
            int iOrdinal = this.f271760f0.ordinal();
            TextView textView = this.f271780x;
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        b(z13, z14);
                    } else if (z13 && z14) {
                        D6.w(textView);
                    } else {
                        f(this, z13, z14);
                    }
                } else if (z13 && z14) {
                    TextView textView2 = this.f271770n;
                    textView2.setTextColor(C35835l0.d(R.attr.gray48, textView2.getContext()));
                    this.f271771o.setTextColor(C35835l0.d(R.attr.gray48, textView2.getContext()));
                    D6.H(textView);
                } else {
                    f(this, z13, z14);
                }
            } else if (z13 && z14) {
                D6.H(textView);
            } else {
                f(this, z13, z14);
            }
        } else {
            b(g12.f271853b, g12.f271852a);
        }
        boolean z15 = g12.f271852a;
        Drawable drawable = this.f271758e0;
        if (z15) {
            if (drawable != null) {
                drawable.setTint(this.f271756d0);
            }
        } else if (drawable != null) {
            drawable.setTint(this.f271754c0);
        }
        TextView textView3 = this.f271763h;
        if (textView3 != null) {
            I5.d(textView3, null, drawable, 11);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void e1(@Y61.k Badge badge) {
        TextView textView = this.f271781y;
        if (textView == null) {
            return;
        }
        D6.G(textView, true);
        Q81.c.b(textView, badge);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void e7(@Y61.l String str) {
        TextView textView = this.f271779w;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void f1(@Y61.l String str) {
        TextView textView = this.f271772p;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    public final void g() {
        this.f271750a0 = 1.0f;
        if (this.f271762g0.f271852a) {
            e();
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void i1(@Y61.l String str) {
        TextView textView = this.f271731H;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void k1(@Y61.l String str) {
        TextView textView = this.f271763h;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void k5(boolean z12, boolean z13) {
        View view = this.f271733J;
        if (view == null) {
            return;
        }
        ViewGroup viewGroup = this.f271757e;
        if (!z12) {
            D6.w(view);
            D6.H(viewGroup);
            return;
        }
        D6.H(view);
        if (!z13) {
            view.setAlpha(1.0f);
            D6.g(viewGroup);
        } else {
            view.setAlpha(0.0f);
            ViewPropertyAnimator duration = view.animate().alpha(1.0f).setDuration(200L);
            w6.a(duration, new C(this));
            duration.start();
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void ka(@Y61.k Y41.a aVar, boolean z12) {
        ImageView imageView = this.f271745V;
        if (imageView != null) {
            D6.G(imageView, z12);
        }
        if (imageView != null) {
            imageView.setOnClickListener(new i(7, aVar));
        }
        View view = this.f271746W;
        if (view != null) {
            D6.c(view, null, null, Integer.valueOf(z12 ? D6.j(this.f271751b, 24) : 0), null, 11);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void l3(@Y61.l String str) {
        TextView textView = this.f271761g;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void l6(@Y61.k Y41.a aVar, boolean z12) {
        View view = this.f271732I;
        if (view == null) {
            return;
        }
        D6.G(view, z12);
        view.setOnClickListener(new i(8, aVar));
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void m1(@Y61.l String str) {
        TextView textView = this.f271741R;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void o1(boolean z12) {
        ImageView imageView = this.f271740Q;
        if (imageView != null) {
            D6.G(imageView, z12);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void o2(@Y61.l String str) {
        TextView textView = this.f271738O;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void o3(@Y61.l String str) {
        TextView textView = this.f271726C;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void o5(@Y61.l SerpBadgeBar serpBadgeBar) {
        List<SerpBadge> badges;
        SerpBadge serpBadge;
        SnippetBadgeBar snippetBadgeBar = this.f271782z;
        if (snippetBadgeBar != null) {
            snippetBadgeBar.a(serpBadgeBar != null ? Q81.b.d(serpBadgeBar) : null);
            return;
        }
        DockingBadgeContainer dockingBadgeContainer = this.f271724A;
        if (dockingBadgeContainer != null) {
            dockingBadgeContainer.setState(new C19818a((serpBadgeBar == null || (badges = serpBadgeBar.getBadges()) == null || (serpBadge = (SerpBadge) C42745f0.G(badges)) == null) ? C42784z0.f406748b : Collections.singletonList(C42418a.a(serpBadge, this.f271751b.getContext())), 0, 0, 6, null));
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void setActive(boolean z12) {
        this.f271762g0.f271853b = z12;
        e();
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void setViewed(boolean z12) {
        this.f271762g0.f271852a = z12;
        e();
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void w0() {
        D6.w(this.f271781y);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void w1(boolean z12) {
        ImageView imageView = this.f271739P;
        if (imageView != null) {
            D6.G(imageView, z12);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void w8(boolean z12) {
        D6.H(this.f271759f);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void z0(boolean z12) {
        View view = this.f271734K;
        if (view == null) {
            this.f271771o.setCompoundDrawablesWithIntrinsicBounds(0, 0, z12 ? R.drawable.ic_delivery_16 : 0, 0);
        } else {
            D6.G(view, z12);
        }
    }

    public /* synthetic */ B(View view, com.avito.android.server_time.h hVar, Locale locale, AsyncViewportTracker.ViewContext viewContext, com.avito.android.video_snippets.g gVar, Integer num, int i12, C42822w c42822w) {
        this(view, hVar, locale, viewContext, gVar, (i12 & 32) != 0 ? null : num);
    }
}
