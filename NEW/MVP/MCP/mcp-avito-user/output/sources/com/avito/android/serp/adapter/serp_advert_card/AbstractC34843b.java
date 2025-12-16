package com.avito.android.serp.adapter.serp_advert_card;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.deprecated_design.badge_bar.CompactFlexibleLayout;
import com.avito.android.remote.model.DiscountIcon;
import com.avito.android.remote.model.QuorumFilterInfo;
import com.avito.android.remote.model.QuorumFilterPrice;
import com.avito.android.remote.model.badge.Badge;
import com.avito.android.remote.model.badge_bar.SerpBadge;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.google.android.material.internal.CheckableImageButton;
import hw.InterfaceC41177b;
import j.InterfaceC42156l;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import ru.avito.component.serp.DeliveryTerms;

/* compiled from: RdsSerpAdvertCard.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/serp_advert_card/b;", "Lcom/avito/android/serp/adapter/serp_advert_card/a;", "a", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC41177b
/* renamed from: com.avito.android.serp.adapter.serp_advert_card.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC34843b implements InterfaceC34842a {

    /* renamed from: A, reason: collision with root package name */
    @Y61.l
    public final TextView f271862A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.l
    public final TextView f271863B;

    /* renamed from: C, reason: collision with root package name */
    @InterfaceC42156l
    public final int f271864C;

    /* renamed from: D, reason: collision with root package name */
    public final int f271865D;

    /* renamed from: E, reason: collision with root package name */
    public final int f271866E;

    /* renamed from: F, reason: collision with root package name */
    public final ColorStateList f271867F;

    /* renamed from: G, reason: collision with root package name */
    public final Drawable f271868G;

    /* renamed from: H, reason: collision with root package name */
    public final int f271869H;

    /* renamed from: I, reason: collision with root package name */
    public final int f271870I;

    /* renamed from: J, reason: collision with root package name */
    public final float f271871J;

    /* renamed from: K, reason: collision with root package name */
    public final float f271872K;

    /* renamed from: L, reason: collision with root package name */
    public final int f271873L;

    /* renamed from: M, reason: collision with root package name */
    public final int f271874M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.l
    public final Drawable f271875N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public a f271876O;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f271877b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.date_time_formatter.c f271878c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f271879d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f271880e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f271881f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final TextView f271882g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final TextView f271883h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final TextView f271884i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final TextView f271885j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final TextView f271886k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final TextView f271887l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final TextView f271888m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final ImageView f271889n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public final TextView f271890o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public final TextView f271891p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public final TextView f271892q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public final TextView f271893r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public final TextView f271894s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public final CompactFlexibleLayout f271895t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.l
    public final TextView f271896u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.l
    public final TextView f271897v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final CheckableImageButton f271898w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final View f271899x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final ImageView f271900y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public final View f271901z;

    /* compiled from: RdsSerpAdvertCard.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/serp_advert_card/b$a;", "", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.serp.adapter.serp_advert_card.b$a */
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f271902a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f271903b;

        public a(boolean z12, boolean z13) {
            this.f271902a = z12;
            this.f271903b = z13;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f271902a == aVar.f271902a && this.f271903b == aVar.f271903b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f271903b) + (Boolean.hashCode(this.f271902a) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("State(isActive=");
            sb2.append(this.f271902a);
            sb2.append(", isViewed=");
            return androidx.appcompat.app.r.x(sb2, this.f271903b, ')');
        }
    }

    public AbstractC34843b(@Y61.k View view, @Y61.k com.avito.android.server_time.h hVar, @Y61.k Locale locale) throws Resources.NotFoundException {
        this.f271877b = view;
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f271879d = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.price);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById2;
        this.f271880e = textView;
        View viewFindViewById3 = view.findViewById(R.id.price_without_discount);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f271881f = (TextView) viewFindViewById3;
        this.f271882g = (TextView) view.findViewById(R.id.discount);
        this.f271883h = (TextView) view.findViewById(R.id.discount_percentage);
        this.f271884i = (TextView) view.findViewById(R.id.additional_name);
        this.f271885j = (TextView) view.findViewById(R.id.shop_name);
        this.f271886k = (TextView) view.findViewById(R.id.verification);
        this.f271887l = (TextView) view.findViewById(R.id.location);
        this.f271888m = (TextView) view.findViewById(R.id.distance);
        this.f271889n = (ImageView) view.findViewById(R.id.distance_icon);
        this.f271890o = (TextView) view.findViewById(R.id.quorum_filter_info);
        this.f271891p = (TextView) view.findViewById(R.id.address);
        this.f271892q = (TextView) view.findViewById(R.id.date);
        this.f271893r = (TextView) view.findViewById(R.id.card_info_badge);
        this.f271894s = (TextView) view.findViewById(R.id.badge);
        this.f271895t = (CompactFlexibleLayout) view.findViewById(R.id.badge_bar);
        this.f271896u = (TextView) view.findViewById(R.id.marketplace_instock);
        this.f271897v = (TextView) view.findViewById(R.id.marketplace_trust_factor);
        View viewFindViewById4 = view.findViewById(R.id.btn_favorite);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.internal.CheckableImageButton");
        }
        this.f271898w = (CheckableImageButton) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.safe_deal);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f271899x = viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.verified_seller);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        ImageView imageView = (ImageView) viewFindViewById6;
        this.f271900y = imageView;
        View viewFindViewById7 = view.findViewById(R.id.delivery);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f271901z = viewFindViewById7;
        this.f271862A = (TextView) view.findViewById(R.id.delivery_terms);
        this.f271863B = (TextView) view.findViewById(R.id.extra_description);
        this.f271864C = C35835l0.d(R.attr.white, view.getContext());
        this.f271865D = C35835l0.d(R.attr.blue, view.getContext());
        this.f271866E = view.getResources().getDimensionPixelOffset(R.dimen.rds_highlighted_price_horizontal_padding);
        this.f271867F = textView.getTextColors();
        this.f271868G = textView.getBackground();
        this.f271869H = textView.getPaddingLeft();
        this.f271870I = textView.getPaddingRight();
        this.f271873L = C35835l0.d(R.attr.green600, view.getContext());
        this.f271874M = C35835l0.d(R.attr.green300, view.getContext());
        this.f271875N = C35835l0.h(R.attr.ic_verify16, view.getContext());
        this.f271876O = new a(true, false);
        Resources resources = view.getResources();
        TypedValue typedValue = new TypedValue();
        resources.getValue(R.dimen.rds_active_alpha, typedValue, true);
        this.f271871J = typedValue.getFloat();
        resources.getValue(R.dimen.rds_inactive_alpha, typedValue, true);
        this.f271872K = typedValue.getFloat();
        this.f271878c = new com.avito.android.date_time_formatter.c(hVar, new com.avito.android.date_time_formatter.g(view.getContext().getResources(), 1), locale);
        D6.w(imageView);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34842a
    public final void B1(long j12) {
        String strA;
        TextView textView = this.f271892q;
        if (textView != null) {
            if (j12 > 0) {
                strA = this.f271878c.a(Long.valueOf(j12), TimeUnit.SECONDS);
            } else {
                strA = null;
            }
            I5.a(textView, strA, false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34842a
    public final void C(@Y61.l String str) {
        TextView textView = this.f271891p;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34842a
    public final void D0(@Y61.l QuorumFilterInfo quorumFilterInfo) {
        QuorumFilterPrice price;
        TextView textView = this.f271890o;
        if (textView != null) {
            I5.a(textView, (quorumFilterInfo == null || (price = quorumFilterInfo.getPrice()) == null) ? null : price.getText(), false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34842a
    public final void E0(@Y61.l String str) {
        TextView textView = this.f271888m;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34842a
    public final void F0(@Y61.k Y41.a<G0> aVar) {
        this.f271898w.setOnClickListener(new com.avito.android.seller_promotions.o(28, aVar));
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34842a
    public final void M1(@Y61.l String str) {
        TextView textView = this.f271883h;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34842a
    public final void Ol(@Y61.l String str, @Y61.l DiscountIcon discountIcon, boolean z12) {
        TextView textView = this.f271882g;
        if (textView != null) {
            D.a(textView, this.f271880e, str != null ? str.toString() : null, discountIcon, (64 & 16) != 0 ? false : false, (64 & 32) != 0 ? false : z12, false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34842a
    public final void PT(boolean z12) {
        TextView textView = this.f271880e;
        if (!z12) {
            I5.d(textView, null, null, 11);
        } else {
            View view = this.f271877b;
            I5.d(textView, null, new InsetDrawable(androidx.core.content.d.getDrawable(view.getContext(), R.drawable.common_ic_discount_16), com.avito.android.actions_sheet.a.d(view, R.dimen.discount_icon_large_padding), 0, 0, 0), 11);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34842a
    public final void Q0(@Y61.l DeliveryTerms deliveryTerms) {
        TextView textView = this.f271862A;
        if (deliveryTerms == null) {
            D6.w(textView);
            return;
        }
        D6.G(textView, true);
        if (textView == null) {
            return;
        }
        Q81.e eVar = Q81.e.f13555a;
        Context context = this.f271877b.getContext();
        eVar.getClass();
        textView.setText(Q81.e.a(context, deliveryTerms));
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34842a
    public final void S0(@Y61.l String str) {
        ImageView imageView = this.f271889n;
        if (imageView != null) {
            Integer numA = str != null ? com.avito.android.lib.util.q.a(str) : null;
            if (numA == null) {
                D6.w(imageView);
                return;
            }
            D6.G(imageView, true);
            View view = this.f271877b;
            imageView.setImageDrawable(C35835l0.h(numA.intValue(), view.getContext()));
            imageView.setImageTintList(C35835l0.e(R.attr.gray36, view.getContext()));
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34842a
    public final void V(@Y61.l String str) {
        TextView textView = this.f271887l;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34842a
    public final void V8(@Y61.l List<SerpBadge> list) {
        CompactFlexibleLayout compactFlexibleLayout = this.f271895t;
        if (compactFlexibleLayout != null) {
            Q81.b.a(compactFlexibleLayout, list, 0);
        }
    }

    public void b(float f12) {
        this.f271899x.setAlpha(f12);
        this.f271900y.setAlpha(f12);
        this.f271901z.setAlpha(f12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34842a
    public final void b2(@Y61.l String str) {
        TextView textView = this.f271897v;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34842a
    public final void c(@Y61.k Y41.a<G0> aVar) {
        this.f271877b.setOnClickListener(new com.avito.android.seller_promotions.o(27, aVar));
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34842a
    public final void d1(boolean z12) {
        D6.G(this.f271898w, z12);
    }

    public final void e() {
        boolean z12 = this.f271876O.f271902a;
        float f12 = this.f271872K;
        float f13 = this.f271871J;
        b(z12 ? f13 : f12);
        a aVar = this.f271876O;
        boolean z13 = aVar.f271902a;
        boolean z14 = aVar.f271903b;
        boolean z15 = z13 && !z14;
        TextView textView = this.f271893r;
        if (z13 && z14) {
            if (textView != null) {
                D6.H(textView);
            }
        } else if (!z13 || z14) {
            if (!z13 && textView != null) {
                D6.w(textView);
            }
        } else if (textView != null) {
            D6.w(textView);
        }
        Drawable drawable = this.f271875N;
        if (z15) {
            if (drawable != null) {
                drawable.setTint(this.f271874M);
            }
        } else if (drawable != null) {
            drawable.setTint(this.f271873L);
        }
        TextView textView2 = this.f271886k;
        if (textView2 != null) {
            I5.d(textView2, null, drawable, 11);
        }
        if (z15) {
            f12 = f13;
        }
        TextView textView3 = this.f271880e;
        for (Drawable drawable2 : textView3.getCompoundDrawables()) {
            if (drawable2 != null) {
                drawable2.setAlpha((int) (255 * f12));
            }
        }
        this.f271879d.setEnabled(z15);
        textView3.setEnabled(z15);
        TextView textView4 = this.f271885j;
        if (textView4 != null) {
            textView4.setEnabled(z15);
        }
        TextView textView5 = this.f271887l;
        if (textView5 != null) {
            textView5.setEnabled(z15);
        }
        TextView textView6 = this.f271888m;
        if (textView6 != null) {
            textView6.setEnabled(z15);
        }
        TextView textView7 = this.f271891p;
        if (textView7 != null) {
            textView7.setEnabled(z15);
        }
        TextView textView8 = this.f271896u;
        if (textView8 != null) {
            textView8.setEnabled(z15);
        }
        TextView textView9 = this.f271897v;
        if (textView9 != null) {
            textView9.setEnabled(z15);
        }
        TextView textView10 = this.f271892q;
        if (textView10 != null) {
            textView10.setEnabled(z15);
        }
        TextView textView11 = this.f271862A;
        if (textView11 != null) {
            textView11.setEnabled(z15);
        }
        TextView textView12 = this.f271882g;
        if (textView12 != null) {
            textView12.setEnabled(z15);
        }
        TextView textView13 = this.f271883h;
        if (textView13 == null) {
            return;
        }
        textView13.setEnabled(z15);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34842a
    public final void e1(@Y61.k Badge badge) {
        TextView textView = this.f271894s;
        if (textView == null) {
            return;
        }
        D6.G(textView, true);
        Q81.c.b(textView, badge);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34842a
    public final void f1(@Y61.l String str) {
        I5.a(this.f271881f, str, false);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34842a
    public final void i1(@Y61.l String str) {
        TextView textView = this.f271884i;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34842a
    public final void k1(@Y61.l String str) {
        TextView textView = this.f271886k;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34842a
    public final void k10(@Y61.l String str, boolean z12) {
        TextView textView = this.f271880e;
        I5.a(textView, str, false);
        if (!z12) {
            D6.f(this.f271880e, this.f271869H, 0, this.f271870I, 0, 10);
            textView.setBackground(this.f271868G);
            textView.setTextColor(this.f271867F);
            return;
        }
        TextView textView2 = this.f271880e;
        int i12 = this.f271866E;
        D6.f(textView2, i12, 0, i12, 0, 10);
        textView.setBackgroundColor(this.f271865D);
        textView.setTextColor(this.f271864C);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34842a
    public final void l3(@Y61.l String str) {
        TextView textView = this.f271885j;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34842a
    public final void o3(@Y61.l String str) {
        TextView textView = this.f271896u;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34842a
    public final void q50(@Y61.l AttributedText attributedText) {
        TextView textView = this.f271863B;
        if (textView != null) {
            com.avito.android.util.text.j.a(textView, attributedText, null);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34842a
    public final void setActive(boolean z12) {
        a aVar = this.f271876O;
        boolean z13 = aVar.f271903b;
        aVar.getClass();
        this.f271876O = new a(z12, z13);
        e();
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34842a
    public final void setFavorite(boolean z12) {
        this.f271898w.setChecked(z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34842a
    public final void setTitle(@Y61.k String str) {
        this.f271879d.setText(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34842a
    public final void setViewed(boolean z12) {
        a aVar = this.f271876O;
        boolean z13 = aVar.f271902a;
        aVar.getClass();
        this.f271876O = new a(z13, z12);
        e();
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34842a
    public final void w0() {
        D6.w(this.f271894s);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34842a
    public final void z0(boolean z12) {
        D6.G(this.f271901z, z12);
    }
}
