package com.avito.android.serp.adapter.serp_advert_card;

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
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.image_loader.From;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.image_loader.d;
import com.avito.android.remote.model.BuyWithDeliveryButton;
import com.avito.android.remote.model.DiscountIcon;
import com.avito.android.remote.model.QuorumFilterInfo;
import com.avito.android.remote.model.QuorumFilterPrice;
import com.avito.android.remote.model.RadiusInfo;
import com.avito.android.remote.model.SellerRating;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.badge.Badge;
import com.avito.android.remote.model.sales.utils.BadgeSticker;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.w6;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.material.internal.CheckableImageButton;
import hw.InterfaceC41177b;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import ru.avito.component.serp.AsyncViewportTracker;
import ru.avito.component.serp.DeliveryTerms;
import ru.avito.component.snippet_badge_bar.SnippetBadgeBar;
import sK0.C48063a;

/* compiled from: SerpAdvertSaleCard.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/serp_advert_card/s;", "Lcom/avito/android/serp/adapter/serp_advert_card/o;", "a", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC41177b
/* loaded from: classes3.dex */
public final class s implements o {

    /* renamed from: d0, reason: collision with root package name */
    @Y61.k
    public static final DecimalFormat f272150d0;

    /* renamed from: A, reason: collision with root package name */
    @Y61.l
    public final TextView f272151A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.l
    public final TextView f272152B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.l
    public final TextView f272153C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.l
    public final CheckableImageButton f272154D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.l
    public final TextView f272155E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.l
    public final TextView f272156F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.l
    public final View f272157G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.l
    public final View f272158H;

    /* renamed from: I, reason: collision with root package name */
    @Y61.l
    public final View f272159I;

    /* renamed from: J, reason: collision with root package name */
    @Y61.l
    public final TextView f272160J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.l
    public final TextView f272161K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.l
    public final ImageView f272162L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.l
    public final ImageView f272163M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.l
    public final TextView f272164N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.l
    public final View f272165O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.l
    public final TextView f272166P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.l
    public final TextView f272167Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.l
    public final ImageView f272168R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.l
    public final View f272169S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public final Q81.j f272170T;

    /* renamed from: U, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.image_loader.d f272171U;

    /* renamed from: V, reason: collision with root package name */
    public final float f272172V;

    /* renamed from: W, reason: collision with root package name */
    public final float f272173W;

    /* renamed from: X, reason: collision with root package name */
    public final float f272174X;

    /* renamed from: Y, reason: collision with root package name */
    public final int f272175Y;

    /* renamed from: Z, reason: collision with root package name */
    public final int f272176Z;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.l
    public final Drawable f272177a0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f272178b;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public ShownItemsAbTestGroup f272179b0;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.connection_quality.connectivity.a f272180c;

    /* renamed from: c0, reason: collision with root package name */
    @Y61.k
    public final H f272181c0;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final AsyncViewportTracker.ViewContext f272182d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.date_time_formatter.c f272183e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f272184f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f272185g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final TextView f272186h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final TextView f272187i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final TextView f272188j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final ImageView f272189k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final TextView f272190l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final TextView f272191m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final TextView f272192n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final TextView f272193o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public final TextView f272194p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public final TextView f272195q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public final TextView f272196r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public final View f272197s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public final TextView f272198t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.l
    public final TextView f272199u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.l
    public final TextView f272200v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.l
    public final TextView f272201w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.l
    public final TextView f272202x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.l
    public final TextView f272203y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.l
    public final SnippetBadgeBar f272204z;

    /* compiled from: SerpAdvertSaleCard.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/serp/adapter/serp_advert_card/s$a;", "", "<init>", "()V", "Ljava/text/DecimalFormat;", "ratingFormatter", "Ljava/text/DecimalFormat;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SerpAdvertSaleCard.kt */
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
        public final /* synthetic */ View f272205b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Y41.q f272206c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ s f272207d;

        public c(View view, Y41.q qVar, s sVar) {
            this.f272205b = view;
            this.f272206c = qVar;
            this.f272207d = sVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(@Y61.l View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            s sVar = this.f272207d;
            this.f272206c.invoke(Integer.valueOf(sVar.f272185g.getWidth()), Integer.valueOf(sVar.f272185g.getHeight()), sVar.f272182d);
            this.f272205b.removeOnLayoutChangeListener(this);
        }
    }

    static {
        new a(null);
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setDecimalSeparator(',');
        f272150d0 = new DecimalFormat("0.0", decimalFormatSymbols);
    }

    public s(@Y61.k View view, @Y61.k com.avito.android.connection_quality.connectivity.a aVar, @Y61.k com.avito.android.server_time.h hVar, @Y61.k Locale locale, @Y61.k AsyncViewportTracker.ViewContext viewContext) throws Resources.NotFoundException {
        this.f272178b = view;
        this.f272180c = aVar;
        this.f272182d = viewContext;
        View viewFindViewById = view.findViewById(R.id.advert_content);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f272184f = (ViewGroup) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.image);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f272185g = (SimpleDraweeView) viewFindViewById2;
        this.f272186h = (TextView) view.findViewById(R.id.shop_name);
        this.f272187i = (TextView) view.findViewById(R.id.verification);
        this.f272188j = (TextView) view.findViewById(R.id.location);
        this.f272189k = (ImageView) view.findViewById(R.id.distance_icon);
        this.f272190l = (TextView) view.findViewById(R.id.quorum_filter_info);
        this.f272191m = (TextView) view.findViewById(R.id.distance);
        View viewFindViewById3 = view.findViewById(R.id.title);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f272192n = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.price);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById4;
        this.f272193o = textView;
        this.f272194p = (TextView) view.findViewById(R.id.price_without_discount);
        this.f272195q = (TextView) view.findViewById(R.id.discount);
        this.f272196r = (TextView) view.findViewById(R.id.discount_percentage);
        this.f272197s = view.findViewById(R.id.discount_icon);
        this.f272198t = (TextView) view.findViewById(R.id.price_list_count_hint);
        this.f272199u = (TextView) view.findViewById(R.id.date);
        this.f272200v = (TextView) view.findViewById(R.id.address);
        this.f272201w = (TextView) view.findViewById(R.id.address_additional_info);
        this.f272202x = (TextView) view.findViewById(R.id.card_info_badge);
        this.f272203y = (TextView) view.findViewById(R.id.badge);
        this.f272204z = (SnippetBadgeBar) view.findViewById(R.id.badge_bar);
        this.f272151A = (TextView) view.findViewById(R.id.badge_sticker);
        this.f272152B = (TextView) view.findViewById(R.id.marketplace_instock);
        this.f272153C = (TextView) view.findViewById(R.id.marketplace_trust_factor);
        this.f272154D = (CheckableImageButton) view.findViewById(R.id.btn_favorite);
        this.f272155E = (TextView) view.findViewById(R.id.buy_with_delivery_link);
        this.f272156F = (TextView) view.findViewById(R.id.additional_name);
        this.f272157G = view.findViewById(R.id.more_actions_button);
        this.f272158H = view.findViewById(R.id.hidden_stub);
        this.f272159I = view.findViewById(R.id.delivery);
        this.f272160J = (TextView) view.findViewById(R.id.delivery_terms);
        this.f272161K = (TextView) view.findViewById(R.id.additional_action);
        this.f272162L = (ImageView) view.findViewById(R.id.has_realty_layout);
        ImageView imageView = (ImageView) view.findViewById(R.id.has_video);
        this.f272163M = imageView;
        this.f272164N = (TextView) view.findViewById(R.id.seller_info_name);
        this.f272165O = view.findViewById(R.id.rating_star);
        this.f272166P = (TextView) view.findViewById(R.id.rating);
        this.f272167Q = (TextView) view.findViewById(R.id.rating_count);
        this.f272168R = (ImageView) view.findViewById(R.id.similar_button);
        this.f272169S = view.findViewById(R.id.geo_reference);
        this.f272170T = new Q81.j(textView, false);
        this.f272171U = new com.avito.android.image_loader.e().a(view.getContext());
        this.f272175Y = C35835l0.d(R.attr.green600, view.getContext());
        this.f272176Z = C35835l0.d(R.attr.green300, view.getContext());
        this.f272177a0 = C35835l0.h(R.attr.ic_verify16, view.getContext());
        this.f272179b0 = ShownItemsAbTestGroup.f271856b;
        this.f272181c0 = new H(false, false, 3, null);
        TypedValue typedValue = new TypedValue();
        view.getResources().getValue(R.dimen.inactive_alpha_old, typedValue, true);
        this.f272173W = typedValue.getFloat();
        view.getResources().getValue(R.dimen.active_alpha, typedValue, true);
        this.f272172V = typedValue.getFloat();
        view.getResources().getValue(R.dimen.viewed_alpha, typedValue, true);
        this.f272174X = typedValue.getFloat();
        this.f272183e = new com.avito.android.date_time_formatter.c(hVar, new com.avito.android.date_time_formatter.g(view.getContext().getResources(), 1), locale);
        if (imageView == null) {
            return;
        }
        imageView.setBackground(Q81.c.a(view));
    }

    public static final void f(s sVar, boolean z12, boolean z13) {
        if (z12 && !z13) {
            sVar.f272184f.setAlpha(sVar.f272172V);
            D6.w(sVar.f272202x);
        } else {
            if (z12) {
                return;
            }
            sVar.f272184f.setAlpha(sVar.f272173W);
            D6.w(sVar.f272202x);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void B1(long j12) {
        String strA;
        TextView textView = this.f272199u;
        if (textView != null) {
            if (j12 > 0) {
                strA = this.f272183e.a(Long.valueOf(j12), TimeUnit.SECONDS);
            } else {
                strA = null;
            }
            I5.a(textView, strA, false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void B3(@Y61.k com.avito.android.image_loader.a aVar, @Y61.l String str, @Y61.k From from) {
        Drawable drawableA = d.a.a(this.f272171U, this.f272178b.getContext(), aVar, from, null, 24);
        ImageRequest.a aVarA = C35949t5.a(this.f272185g);
        aVarA.d(aVar);
        aVarA.f169501s = drawableA;
        aVarA.f169495m = ImageRequest.SourcePlace.f169477b;
        aVarA.f169498p = str;
        aVarA.f169497o = new t(this);
        aVarA.c();
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void B5(@Y61.l String str, @Y61.k RadiusInfo radiusInfo) {
        TextView textView = this.f272200v;
        if (textView != null) {
            SpannableString spannableString = new SpannableString(D.d(str, radiusInfo));
            D.c(spannableString, radiusInfo, this.f272178b.getContext());
            I5.a(textView, spannableString, false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void C(@Y61.l String str) {
        TextView textView = this.f272200v;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void Cd(@Y61.l String str, @Y61.l DiscountIcon discountIcon, boolean z12) {
        TextView textView = this.f272195q;
        if (textView == null) {
            return;
        }
        D.a(textView, this.f272193o, str, discountIcon, (64 & 16) != 0 ? false : false, (64 & 32) != 0 ? false : z12, false);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void D0(@Y61.l QuorumFilterInfo quorumFilterInfo) {
        QuorumFilterPrice price;
        TextView textView = this.f272190l;
        if (textView != null) {
            I5.a(textView, (quorumFilterInfo == null || (price = quorumFilterInfo.getPrice()) == null) ? null : price.getText(), false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void E0(@Y61.l String str) {
        TextView textView = this.f272191m;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    @SuppressLint({"RestrictedApi"})
    public final void Ed(@Y61.k SerpDisplayType serpDisplayType, boolean z12) {
        CheckableImageButton checkableImageButton = this.f272154D;
        if (checkableImageButton != null) {
            checkableImageButton.setChecked(z12);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void F0(@Y61.k Y41.a<G0> aVar) {
        CheckableImageButton checkableImageButton = this.f272154D;
        if (checkableImageButton != null) {
            checkableImageButton.setOnClickListener(new i(4, aVar));
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void Fc(@Y61.l String str, @Y61.l UniversalColor universalColor, boolean z12, @Y61.l UniversalColor universalColor2) {
        this.f272170T.a(str, z12, universalColor2);
        if (universalColor != null) {
            TextView textView = this.f272193o;
            textView.setTextColor(C48063a.f437606a.a(textView.getContext(), universalColor));
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void H2(@Y61.l Y41.a<G0> aVar) {
        TextView textView = this.f272161K;
        if (textView != null) {
            textView.setOnClickListener(new i(1, aVar));
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void IU(@Y61.l UniversalColor universalColor, @Y61.l UniversalColor universalColor2) {
        TextView textView = this.f272195q;
        if (textView != null && universalColor != null) {
            textView.setTextColor(C48063a.f437606a.a(textView.getContext(), universalColor));
        }
        TextView textView2 = this.f272196r;
        if (textView2 == null || universalColor2 == null) {
            return;
        }
        textView2.setTextColor(C48063a.f437606a.a(textView2.getContext(), universalColor2));
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void K9(@Y61.l BadgeSticker badgeSticker, boolean z12) {
        TextView textView = this.f272151A;
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

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void L6(@Y61.k Y41.l lVar, @Y61.l BuyWithDeliveryButton buyWithDeliveryButton) {
        TextView textView = this.f272155E;
        if (textView == null) {
            return;
        }
        if (buyWithDeliveryButton == null) {
            textView.setOnClickListener(null);
            D6.w(textView);
        } else {
            textView.setText(buyWithDeliveryButton.getTitle());
            textView.setOnClickListener(new com.avito.android.search.filter.adapter.select.m(20, lVar, buyWithDeliveryButton));
            D6.G(textView, true);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void M1(@Y61.l String str) {
        TextView textView = this.f272196r;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void N5(@Y61.l SellerRating sellerRating) {
        Float fValueOf;
        if (sellerRating != null) {
            Float scoreFloat = sellerRating.getScoreFloat();
            fValueOf = Float.valueOf(scoreFloat != null ? scoreFloat.floatValue() : sellerRating.getScore());
        } else {
            fValueOf = null;
        }
        boolean z12 = (sellerRating == null || fValueOf == null || sellerRating.getReviewCount() == null) ? false : true;
        TextView textView = this.f272166P;
        if (textView != null) {
            D6.G(textView, z12);
        }
        View view = this.f272165O;
        if (view != null) {
            D6.G(view, z12);
        }
        TextView textView2 = this.f272167Q;
        if (textView2 != null) {
            D6.G(textView2, z12);
        }
        if (z12) {
            if (textView != null) {
                I5.a(textView, f272150d0.format(fValueOf), false);
            }
            if (textView2 != null) {
                I5.a(textView2, sellerRating.getReviewCount(), false);
            }
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    @Y61.k
    public final Uri O(@Y61.k com.avito.android.image_loader.k kVar) {
        return ((com.avito.android.image_loader.m) kVar).a(this.f272185g);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void O5(boolean z12, boolean z13) {
        View view = this.f272178b;
        int iD2 = com.avito.android.actions_sheet.a.d(view, R.dimen.discount_icon_small_padding);
        int iD3 = com.avito.android.actions_sheet.a.d(view, R.dimen.discount_icon_large_padding);
        View view2 = this.f272197s;
        D6.G(view2, z12);
        if (!z12 || view2 == null) {
            return;
        }
        if (!z13) {
            iD2 = iD3;
        }
        view2.setPadding(iD2, view2.getPaddingTop(), view2.getPaddingRight(), view2.getPaddingBottom());
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void Q0(@Y61.l DeliveryTerms deliveryTerms) {
        TextView textView = this.f272160J;
        if (deliveryTerms == null) {
            D6.w(textView);
            return;
        }
        D6.G(textView, true);
        if (textView == null) {
            return;
        }
        Q81.e eVar = Q81.e.f13555a;
        Context context = this.f272178b.getContext();
        eVar.getClass();
        textView.setText(Q81.e.a(context, deliveryTerms));
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void S0(@Y61.l String str) {
        ImageView imageView = this.f272189k;
        if (imageView != null) {
            Integer numA = str != null ? com.avito.android.lib.util.q.a(str) : null;
            if (numA == null) {
                D6.w(imageView);
                return;
            }
            D6.G(imageView, true);
            View view = this.f272178b;
            imageView.setImageDrawable(C35835l0.h(numA.intValue(), view.getContext()));
            imageView.setImageTintList(C35835l0.e(R.attr.gray36, view.getContext()));
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void V(@Y61.l String str) {
        TextView textView = this.f272188j;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void W9(@Y61.k ShownItemsAbTestGroup shownItemsAbTestGroup) {
        this.f272179b0 = shownItemsAbTestGroup;
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void X2(@Y61.l UniversalColor universalColor, @Y61.k String str) {
        TextView textView = this.f272192n;
        I5.a(textView, str, false);
        if (universalColor != null) {
            textView.setTextColor(C48063a.f437606a.a(textView.getContext(), universalColor));
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void X3(@Y61.l String str) {
        TextView textView = this.f272198t;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void Y4() {
        TextView textView = this.f272202x;
        if (textView != null) {
            I5.a(textView, textView.getContext().getText(R.string.reserved_badge_text), false);
        }
    }

    @Override // ru.avito.component.serp.AsyncViewportTracker
    public final void Z70(@Y61.k Y41.q<? super Integer, ? super Integer, ? super AsyncViewportTracker.ViewContext, G0> qVar) {
        SimpleDraweeView simpleDraweeView = this.f272185g;
        simpleDraweeView.addOnLayoutChangeListener(new c(simpleDraweeView, qVar, this));
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void a7() {
        this.f272185g.getLayoutParams().height = this.f272178b.getResources().getDimensionPixelSize(R.dimen.serp_vm_grid_snippet_height);
    }

    public final void b(boolean z12, boolean z13) {
        TextView textView = this.f272202x;
        ViewGroup viewGroup = this.f272184f;
        if (z12 && z13) {
            viewGroup.setAlpha(this.f272174X);
            D6.H(textView);
        } else if (z12 && !z13) {
            viewGroup.setAlpha(this.f272172V);
            D6.w(textView);
        } else {
            if (z12) {
                return;
            }
            viewGroup.setAlpha(this.f272173W);
            D6.w(textView);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void b2(@Y61.l String str) {
        TextView textView = this.f272153C;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void c(@Y61.k Y41.a<G0> aVar) {
        this.f272178b.setOnClickListener(new i(3, aVar));
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void d1(boolean z12) {
        D6.G(this.f272154D, z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void d4(@Y61.l ru.avito.component.snippet_badge_bar.d dVar) {
        SnippetBadgeBar snippetBadgeBar = this.f272204z;
        if (snippetBadgeBar != null) {
            snippetBadgeBar.a(dVar);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void d5(@Y61.l String str, @Y61.k RadiusInfo radiusInfo) {
        TextView textView = this.f272188j;
        if (textView != null) {
            SpannableString spannableString = new SpannableString(D.d(str, radiusInfo));
            View view = this.f272178b;
            D.c(spannableString, radiusInfo, view.getContext());
            SpannableString spannableString2 = new SpannableString(spannableString);
            D.c(spannableString2, radiusInfo, view.getContext());
            I5.a(textView, spannableString2, false);
        }
    }

    public final void e() {
        ShownItemsAbTestGroup shownItemsAbTestGroup = this.f272179b0;
        shownItemsAbTestGroup.getClass();
        boolean z12 = shownItemsAbTestGroup == ShownItemsAbTestGroup.f271857c || shownItemsAbTestGroup == ShownItemsAbTestGroup.f271858d || shownItemsAbTestGroup == ShownItemsAbTestGroup.f271859e;
        H h12 = this.f272181c0;
        if (z12) {
            boolean z13 = h12.f271855b;
            boolean z14 = h12.f271854a;
            int iOrdinal = this.f272179b0.ordinal();
            TextView textView = this.f272202x;
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
                    TextView textView2 = this.f272192n;
                    textView2.setTextColor(C35835l0.d(R.attr.gray48, textView2.getContext()));
                    this.f272193o.setTextColor(C35835l0.d(R.attr.gray48, textView2.getContext()));
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
            b(h12.f271855b, h12.f271854a);
        }
        boolean z15 = h12.f271854a;
        Drawable drawable = this.f272177a0;
        if (z15) {
            if (drawable != null) {
                drawable.setTint(this.f272176Z);
            }
        } else if (drawable != null) {
            drawable.setTint(this.f272175Y);
        }
        TextView textView3 = this.f272187i;
        if (textView3 != null) {
            I5.d(textView3, null, drawable, 11);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void e1(@Y61.k Badge badge) {
        TextView textView = this.f272203y;
        if (textView == null) {
            return;
        }
        D6.G(textView, true);
        Q81.c.b(textView, badge);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void e7(@Y61.l String str) {
        TextView textView = this.f272201w;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void f1(@Y61.l String str) {
        TextView textView = this.f272194p;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void hf(float f12) {
        SimpleDraweeView simpleDraweeView = this.f272185g;
        simpleDraweeView.getLayoutParams().height = -2;
        simpleDraweeView.setAspectRatio(1.0f);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void i1(@Y61.l String str) {
        TextView textView = this.f272156F;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void k1(@Y61.l String str) {
        TextView textView = this.f272187i;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void k5(boolean z12, boolean z13) {
        View view = this.f272158H;
        if (view == null) {
            return;
        }
        ViewGroup viewGroup = this.f272184f;
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
            w6.a(duration, new u(this));
            duration.start();
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void ka(@Y61.k Y41.a aVar, boolean z12) {
        ImageView imageView = this.f272168R;
        if (imageView != null) {
            D6.G(imageView, z12);
        }
        if (imageView != null) {
            imageView.setOnClickListener(new i(5, aVar));
        }
        View view = this.f272169S;
        if (view != null) {
            D6.c(view, null, null, Integer.valueOf(z12 ? D6.j(this.f272178b, 24) : 0), null, 11);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void l3(@Y61.l String str) {
        TextView textView = this.f272186h;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void l6(@Y61.k Y41.a aVar, boolean z12) {
        View view = this.f272157G;
        if (view == null) {
            return;
        }
        D6.G(view, z12);
        view.setOnClickListener(new i(2, aVar));
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void m1(@Y61.l String str) {
        TextView textView = this.f272164N;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void o1(boolean z12) {
        ImageView imageView = this.f272163M;
        if (imageView != null) {
            D6.G(imageView, z12);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void o2(@Y61.l String str) {
        TextView textView = this.f272161K;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void o3(@Y61.l String str) {
        TextView textView = this.f272152B;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void setActive(boolean z12) {
        this.f272181c0.f271855b = z12;
        e();
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void setViewed(boolean z12) {
        this.f272181c0.f271854a = z12;
        e();
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void w0() {
        D6.w(this.f272203y);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void w1(boolean z12) {
        ImageView imageView = this.f272162L;
        if (imageView != null) {
            D6.G(imageView, z12);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void z0(boolean z12) {
        View view = this.f272159I;
        if (view == null) {
            this.f272193o.setCompoundDrawablesWithIntrinsicBounds(0, 0, z12 ? R.drawable.ic_delivery_16 : 0, 0);
        } else {
            D6.G(view, z12);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void hZ(boolean z12) {
    }
}
