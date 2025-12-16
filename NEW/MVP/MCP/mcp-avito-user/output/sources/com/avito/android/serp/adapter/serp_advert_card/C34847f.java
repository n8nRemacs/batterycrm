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
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.image_loader.From;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.image_loader.d;
import com.avito.android.remote.model.DiscountIcon;
import com.avito.android.remote.model.QuorumFilterInfo;
import com.avito.android.remote.model.QuorumFilterPrice;
import com.avito.android.remote.model.RadiusInfo;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.badge.Badge;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.material.internal.CheckableImageButton;
import hw.InterfaceC41177b;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import ru.avito.component.serp.AsyncViewportTracker;
import ru.avito.component.serp.DeliveryTerms;
import ru.avito.component.snippet_badge_bar.SnippetBadgeBar;

/* compiled from: SerpAdvertListCard.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/serp_advert_card/f;", "Lcom/avito/android/serp/adapter/serp_advert_card/e;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC41177b
/* renamed from: com.avito.android.serp.adapter.serp_advert_card.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34847f implements InterfaceC34846e {

    /* renamed from: A, reason: collision with root package name */
    @Y61.l
    public final SnippetBadgeBar f271913A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.l
    public final TextView f271914B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.l
    public final TextView f271915C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.k
    public final Resources f271916D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final CheckableImageButton f271917E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.l
    public final View f271918F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.l
    public final TextView f271919G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.l
    public final ImageView f271920H;

    /* renamed from: I, reason: collision with root package name */
    @Y61.l
    public final ImageView f271921I;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final Q81.j f271922J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.image_loader.d f271923K;

    /* renamed from: L, reason: collision with root package name */
    public final float f271924L;

    /* renamed from: M, reason: collision with root package name */
    public final float f271925M;

    /* renamed from: N, reason: collision with root package name */
    public final float f271926N;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f271927b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final AsyncViewportTracker.ViewContext f271928c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.connection_quality.connectivity.a f271929d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.date_time_formatter.c f271930e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f271931f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f271932g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final TextView f271933h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final TextView f271934i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final TextView f271935j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final ImageView f271936k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final TextView f271937l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final TextView f271938m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final TextView f271939n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public final View f271940o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public final TextView f271941p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public final TextView f271942q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public final TextView f271943r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public final TextView f271944s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public final TextView f271945t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.l
    public final TextView f271946u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final TextView f271947v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.l
    public final TextView f271948w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.l
    public final TextView f271949x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final TextView f271950y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.l
    public final TextView f271951z;

    /* compiled from: Views.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/util/I6", "Landroid/view/View$OnLayoutChangeListener;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.serp.adapter.serp_advert_card.f$a */
    public static final class a implements View.OnLayoutChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f271952b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Y41.q f271953c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ C34847f f271954d;

        public a(View view, Y41.q qVar, C34847f c34847f) {
            this.f271952b = view;
            this.f271953c = qVar;
            this.f271954d = c34847f;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(@Y61.l View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            C34847f c34847f = this.f271954d;
            this.f271953c.invoke(Integer.valueOf(c34847f.f271932g.getWidth()), Integer.valueOf(c34847f.f271932g.getHeight()), c34847f.f271928c);
            this.f271952b.removeOnLayoutChangeListener(this);
        }
    }

    public C34847f(@Y61.k View view, @Y61.k com.avito.android.connection_quality.connectivity.a aVar, @Y61.k com.avito.android.server_time.h hVar, @Y61.k Locale locale, @Y61.k AsyncViewportTracker.ViewContext viewContext) throws Resources.NotFoundException {
        this.f271927b = view;
        this.f271928c = viewContext;
        this.f271929d = aVar;
        View viewFindViewById = view.findViewById(R.id.advert_content);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f271931f = (ViewGroup) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.image);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f271932g = (SimpleDraweeView) viewFindViewById2;
        this.f271933h = (TextView) view.findViewById(R.id.shop_name);
        this.f271934i = (TextView) view.findViewById(R.id.location);
        this.f271935j = (TextView) view.findViewById(R.id.distance);
        this.f271936k = (ImageView) view.findViewById(R.id.distance_icon);
        this.f271937l = (TextView) view.findViewById(R.id.quorum_filter_info);
        View viewFindViewById3 = view.findViewById(R.id.title);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f271938m = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.price);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById4;
        this.f271939n = textView;
        this.f271940o = view.findViewById(R.id.discount_icon);
        this.f271941p = (TextView) view.findViewById(R.id.discount_percentage);
        this.f271942q = (TextView) view.findViewById(R.id.price_without_discount);
        this.f271943r = (TextView) view.findViewById(R.id.price_list_count_hint);
        this.f271944s = (TextView) view.findViewById(R.id.discount);
        this.f271945t = (TextView) view.findViewById(R.id.short_term_rent_tag);
        this.f271946u = (TextView) view.findViewById(R.id.date);
        View viewFindViewById5 = view.findViewById(R.id.address);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f271947v = (TextView) viewFindViewById5;
        this.f271948w = (TextView) view.findViewById(R.id.additional_action);
        this.f271949x = (TextView) view.findViewById(R.id.additional_name);
        View viewFindViewById6 = view.findViewById(R.id.card_info_badge);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f271950y = (TextView) viewFindViewById6;
        this.f271951z = (TextView) view.findViewById(R.id.badge);
        this.f271913A = (SnippetBadgeBar) view.findViewById(R.id.badge_bar);
        this.f271914B = (TextView) view.findViewById(R.id.marketplace_instock);
        this.f271915C = (TextView) view.findViewById(R.id.marketplace_trust_factor);
        this.f271916D = view.getResources();
        View viewFindViewById7 = view.findViewById(R.id.btn_favorite);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.internal.CheckableImageButton");
        }
        this.f271917E = (CheckableImageButton) viewFindViewById7;
        this.f271918F = view.findViewById(R.id.delivery);
        this.f271919G = (TextView) view.findViewById(R.id.delivery_terms);
        this.f271920H = (ImageView) view.findViewById(R.id.has_realty_layout);
        ImageView imageView = (ImageView) view.findViewById(R.id.has_video);
        this.f271921I = imageView;
        this.f271922J = new Q81.j(textView, false);
        this.f271923K = new com.avito.android.image_loader.e().a(view.getContext());
        TypedValue typedValue = new TypedValue();
        view.getResources().getValue(R.dimen.inactive_alpha_old, typedValue, true);
        this.f271925M = typedValue.getFloat();
        view.getResources().getValue(R.dimen.active_alpha, typedValue, true);
        this.f271924L = typedValue.getFloat();
        view.getResources().getValue(R.dimen.viewed_alpha, typedValue, true);
        this.f271926N = typedValue.getFloat();
        this.f271930e = new com.avito.android.date_time_formatter.c(hVar, new com.avito.android.date_time_formatter.g(view.getContext().getResources(), 1), locale);
        if (imageView == null) {
            return;
        }
        imageView.setBackground(Q81.c.a(view));
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void B1(long j12) {
        String strA;
        TextView textView = this.f271946u;
        if (textView != null) {
            if (j12 > 0) {
                strA = this.f271930e.a(Long.valueOf(j12), TimeUnit.SECONDS);
            } else {
                strA = null;
            }
            I5.a(textView, strA, false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void B3(@Y61.k com.avito.android.image_loader.a aVar, @Y61.l String str, @Y61.k From from) {
        b(this.f271932g, aVar, from);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void B5(@Y61.l String str, @Y61.k RadiusInfo radiusInfo) {
        SpannableString spannableString = new SpannableString(D.d(str, radiusInfo));
        D.c(spannableString, radiusInfo, this.f271927b.getContext());
        I5.a(this.f271947v, spannableString, false);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void C(@Y61.l String str) {
        I5.a(this.f271947v, str, false);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void C9(@Y61.k String str) {
        TextView textView = this.f271946u;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void Cd(@Y61.l String str, @Y61.l DiscountIcon discountIcon, boolean z12) {
        TextView textView = this.f271944s;
        if (textView != null) {
            D.a(textView, this.f271939n, str, discountIcon, (64 & 16) != 0 ? false : false, (64 & 32) != 0 ? false : z12, false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void D0(@Y61.l QuorumFilterInfo quorumFilterInfo) {
        QuorumFilterPrice price;
        TextView textView = this.f271937l;
        if (textView != null) {
            I5.a(textView, (quorumFilterInfo == null || (price = quorumFilterInfo.getPrice()) == null) ? null : price.getText(), false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void E0(@Y61.l String str) {
        TextView textView = this.f271935j;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void F0(@Y61.l Y41.a<G0> aVar) {
        this.f271917E.setOnClickListener(new com.avito.android.profile_settings_extended.adapter.phones.l(25, aVar));
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void H2(@Y61.l Y41.a<G0> aVar) {
        TextView textView = this.f271948w;
        if (textView != null) {
            textView.setOnClickListener(new com.avito.android.seller_promotions.o(29, aVar));
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void M1(@Y61.l String str) {
        TextView textView = this.f271941p;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    @Y61.k
    public final Uri O(@Y61.k com.avito.android.image_loader.k kVar) {
        return ((com.avito.android.image_loader.m) kVar).a(this.f271932g);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void O5(boolean z12, boolean z13) {
        View view = this.f271940o;
        if (view == null) {
            return;
        }
        View view2 = this.f271927b;
        int iD2 = com.avito.android.actions_sheet.a.d(view2, R.dimen.discount_icon_small_padding);
        int iD3 = com.avito.android.actions_sheet.a.d(view2, R.dimen.discount_icon_large_padding);
        if (z12) {
            if (!z13) {
                iD2 = iD3;
            }
            view.setPadding(iD2, view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
        }
        D6.G(view, z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void Q0(@Y61.l DeliveryTerms deliveryTerms) {
        TextView textView = this.f271919G;
        if (deliveryTerms == null) {
            D6.w(textView);
            return;
        }
        D6.G(textView, true);
        if (textView == null) {
            return;
        }
        Q81.e eVar = Q81.e.f13555a;
        Context context = this.f271927b.getContext();
        eVar.getClass();
        textView.setText(Q81.e.a(context, deliveryTerms));
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void S0(@Y61.l String str) {
        ImageView imageView = this.f271936k;
        if (imageView != null) {
            Integer numA = str != null ? com.avito.android.lib.util.q.a(str) : null;
            if (numA == null) {
                D6.w(imageView);
                return;
            }
            D6.G(imageView, true);
            View view = this.f271927b;
            imageView.setImageDrawable(C35835l0.h(numA.intValue(), view.getContext()));
            imageView.setImageTintList(C35835l0.e(R.attr.gray36, view.getContext()));
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void V(@Y61.l String str) {
        TextView textView = this.f271934i;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void X3(@Y61.l String str) {
        TextView textView = this.f271943r;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // ru.avito.component.serp.AsyncViewportTracker
    public final void Z70(@Y61.k Y41.q<? super Integer, ? super Integer, ? super AsyncViewportTracker.ViewContext, G0> qVar) {
        SimpleDraweeView simpleDraweeView = this.f271932g;
        simpleDraweeView.addOnLayoutChangeListener(new a(simpleDraweeView, qVar, this));
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void ai(@Y61.l String str) {
        TextView textView = this.f271945t;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    public final void b(@Y61.k SimpleDraweeView simpleDraweeView, @Y61.k com.avito.android.image_loader.a aVar, @Y61.k From from) {
        Drawable drawableA = d.a.a(this.f271923K, simpleDraweeView.getContext(), aVar, from, null, 24);
        ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
        aVarA.d(aVar);
        aVarA.f169501s = drawableA;
        aVarA.f169495m = ImageRequest.SourcePlace.f169477b;
        aVarA.f169498p = null;
        aVarA.f169497o = new C34848g(this);
        aVarA.c();
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void b2(@Y61.l String str) {
        TextView textView = this.f271915C;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void c(@Y61.l Y41.a<G0> aVar) {
        this.f271927b.setOnClickListener(new com.avito.android.profile_settings_extended.adapter.phones.l(26, aVar));
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void d1(boolean z12) {
        D6.G(this.f271917E, z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void d5(@Y61.l String str, @Y61.k RadiusInfo radiusInfo) {
        TextView textView = this.f271934i;
        if (textView != null) {
            SpannableString spannableString = new SpannableString(D.d(str, radiusInfo));
            D.c(spannableString, radiusInfo, this.f271927b.getContext());
            I5.a(textView, spannableString, false);
        }
    }

    public final void e(boolean z12, boolean z13) {
        TextView textView = this.f271950y;
        ViewGroup viewGroup = this.f271931f;
        if (z12 && z13) {
            viewGroup.setAlpha(this.f271926N);
            D6.H(textView);
        } else if (z12 && !z13) {
            viewGroup.setAlpha(this.f271924L);
            D6.w(textView);
        } else {
            if (z12) {
                return;
            }
            viewGroup.setAlpha(this.f271925M);
            D6.w(textView);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void e1(@Y61.k Badge badge) {
        TextView textView = this.f271951z;
        if (textView == null) {
            return;
        }
        D6.G(textView, true);
        Q81.c.b(textView, badge);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void ew(boolean z12) {
        int dimensionPixelSize = z12 ? this.f271916D.getDimensionPixelSize(R.dimen.list_serp_card_title_right_margin) : 0;
        TextView textView = this.f271938m;
        ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin = dimensionPixelSize;
        textView.requestLayout();
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void f1(@Y61.l String str) {
        TextView textView = this.f271942q;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void f5(int i12) {
        View view = this.f271927b;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i12;
        view.setLayoutParams(layoutParams);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void i1(@Y61.l String str) {
        TextView textView = this.f271949x;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void k60(@Y61.l String str, @Y61.l RadiusInfo radiusInfo) {
        TextView textView = this.f271934i;
        if (textView != null) {
            textView.post(new Me.m(radiusInfo, this, str, 26));
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void l3(@Y61.l String str) {
        TextView textView = this.f271933h;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void o1(boolean z12) {
        ImageView imageView = this.f271921I;
        if (imageView != null) {
            D6.G(imageView, z12);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void o2(@Y61.l String str) {
        TextView textView = this.f271948w;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void o3(@Y61.l String str) {
        TextView textView = this.f271914B;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void setActive(boolean z12) {
        e(z12, this.f271931f.getAlpha() == this.f271926N);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    @SuppressLint({"RestrictedApi"})
    public final void setFavorite(boolean z12) {
        this.f271917E.setChecked(z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void setTitle(@Y61.k String str) {
        I5.a(this.f271938m, str, false);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void setViewed(boolean z12) {
        e(!(this.f271931f.getAlpha() == this.f271925M), z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void vd(@Y61.l ru.avito.component.snippet_badge_bar.d dVar) {
        SnippetBadgeBar snippetBadgeBar = this.f271913A;
        if (snippetBadgeBar != null) {
            snippetBadgeBar.a(dVar);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void w0() {
        D6.w(this.f271951z);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void w1(boolean z12) {
        ImageView imageView = this.f271920H;
        if (imageView != null) {
            D6.G(imageView, z12);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void z0(boolean z12) {
        View view = this.f271918F;
        if (view == null) {
            this.f271939n.setCompoundDrawablesWithIntrinsicBounds(0, 0, z12 ? R.drawable.ic_delivery_16 : 0, 0);
        } else {
            D6.G(view, z12);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void z3(@Y61.l String str, boolean z12, @Y61.l UniversalColor universalColor) {
        this.f271922J.a(str, z12, universalColor);
    }
}
