package com.avito.android.favorites.adapter.advert;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.SpannableString;
import android.text.style.StrikethroughSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.B2;
import com.avito.android.R;
import com.avito.android.cart_snippet_actions.models.ui.Stepper;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.favorites.adapter.advert.related_products.RelatedProductsView;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.image_loader.d;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.strikethrough.StrikethroughTextView;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.related_products.RelatedProductsEntryPointState;
import com.avito.android.remote.model.AdvertAction;
import com.avito.android.remote.model.BuyWithDeliveryInFavorites;
import com.avito.android.remote.model.DiscountIcon;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.autotekateaser.AutotekaLink;
import com.avito.android.remote.model.autotekateaser.AutotekaPurchaseAction;
import com.avito.android.remote.model.badge_bar.SerpBadgeBar;
import com.avito.android.remote.model.sales.utils.BadgeSticker;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.material.internal.CheckableImageButton;
import java.util.concurrent.TimeUnit;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import ru.avito.component.snippet_badge_bar.SnippetBadgeBar;
import sK0.C48063a;

/* compiled from: FavoriteAdvertItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/favorites/adapter/advert/s;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/favorites/adapter/advert/r;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class s extends com.avito.konveyor.adapter.b implements r {

    /* renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ int f156471H = 0;

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public final Button f156472A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.k
    public final Button f156473B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.k
    public final FlexboxLayout f156474C;

    /* renamed from: D, reason: collision with root package name */
    public final float f156475D;

    /* renamed from: E, reason: collision with root package name */
    public final float f156476E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f156477F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.image_loader.d f156478G;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f156479b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.date_time_formatter.b f156480c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final B2 f156481d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f156482e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f156483f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f156484g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final TextView f156485h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final StrikethroughTextView f156486i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final TextView f156487j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final TextView f156488k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final TextView f156489l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final TextView f156490m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final TextView f156491n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final TextView f156492o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.cart_snippet_actions.l f156493p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final Button f156494q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final Button f156495r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final TextView f156496s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final CheckableImageButton f156497t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final TextView f156498u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final Button f156499v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final RelatedProductsView f156500w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final TextView f156501x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final SnippetBadgeBar f156502y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public final Button f156503z;

    /* compiled from: FavoriteAdvertItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[RelatedProductsEntryPointState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                RelatedProductsEntryPointState relatedProductsEntryPointState = RelatedProductsEntryPointState.f252814b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                RelatedProductsEntryPointState relatedProductsEntryPointState2 = RelatedProductsEntryPointState.f252814b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public s(@Y61.k View view, @Y61.k com.avito.android.date_time_formatter.b bVar, @Y61.k B2 b22) {
        super(view);
        this.f156479b = view;
        this.f156480c = bVar;
        this.f156481d = b22;
        View viewFindViewById = view.findViewById(R.id.image);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f156482e = (SimpleDraweeView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.statusDescription);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f156483f = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.title);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f156484g = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.price);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f156485h = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.discount_new);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.strikethrough.StrikethroughTextView");
        }
        this.f156486i = (StrikethroughTextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.discount);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f156487j = (TextView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.discount_percentage);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f156488k = (TextView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.location);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f156489l = (TextView) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.address);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f156490m = (TextView) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(R.id.date);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f156491n = (TextView) viewFindViewById10;
        View viewFindViewById11 = view.findViewById(R.id.stocks_quantity);
        if (viewFindViewById11 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f156492o = (TextView) viewFindViewById11;
        KeyEvent.Callback callbackFindViewById = view.findViewById(R.id.cart_actions);
        if (callbackFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
        }
        this.f156493p = (com.avito.android.cart_snippet_actions.l) callbackFindViewById;
        View viewFindViewById12 = view.findViewById(R.id.buy_with_delivery_button);
        if (viewFindViewById12 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f156494q = (Button) viewFindViewById12;
        View viewFindViewById13 = view.findViewById(R.id.autoteka_purchase_button);
        if (viewFindViewById13 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f156495r = (Button) viewFindViewById13;
        View viewFindViewById14 = view.findViewById(R.id.note);
        if (viewFindViewById14 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f156496s = (TextView) viewFindViewById14;
        View viewFindViewById15 = view.findViewById(R.id.btn_favorite);
        if (viewFindViewById15 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.internal.CheckableImageButton");
        }
        this.f156497t = (CheckableImageButton) viewFindViewById15;
        View viewFindViewById16 = view.findViewById(R.id.btn_similar);
        if (viewFindViewById16 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f156498u = (TextView) viewFindViewById16;
        View viewFindViewById17 = view.findViewById(R.id.actionButton);
        if (viewFindViewById17 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f156499v = (Button) viewFindViewById17;
        View viewFindViewById18 = view.findViewById(R.id.relatedProducts);
        if (viewFindViewById18 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.favorites.adapter.advert.related_products.RelatedProductsView");
        }
        this.f156500w = (RelatedProductsView) viewFindViewById18;
        View viewFindViewById19 = view.findViewById(R.id.badge_sticker);
        if (viewFindViewById19 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f156501x = (TextView) viewFindViewById19;
        View viewFindViewById20 = view.findViewById(R.id.badge_bar);
        if (viewFindViewById20 == null) {
            throw new NullPointerException("null cannot be cast to non-null type ru.avito.component.snippet_badge_bar.SnippetBadgeBar");
        }
        this.f156502y = (SnippetBadgeBar) viewFindViewById20;
        View viewFindViewById21 = view.findViewById(R.id.call_button);
        if (viewFindViewById21 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f156503z = (Button) viewFindViewById21;
        View viewFindViewById22 = view.findViewById(R.id.message_button);
        if (viewFindViewById22 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f156472A = (Button) viewFindViewById22;
        View viewFindViewById23 = view.findViewById(R.id.contact_button);
        if (viewFindViewById23 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f156473B = (Button) viewFindViewById23;
        View viewFindViewById24 = view.findViewById(R.id.contactButtonsContainer);
        if (viewFindViewById24 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayout");
        }
        this.f156474C = (FlexboxLayout) viewFindViewById24;
        this.f156475D = androidx.core.content.res.i.b(view.getResources(), R.dimen.active_alpha);
        this.f156476E = androidx.core.content.res.i.b(view.getResources(), R.dimen.inactive_alpha_old);
        this.f156478G = new com.avito.android.image_loader.e().a(view.getContext());
    }

    public static void B80(Button button, AdvertAction advertAction, Y41.l lVar) {
        com.avito.android.lib.design.button.b.a(button, advertAction != null ? advertAction.getTitle() : null, false);
        if (advertAction != null) {
            String style = advertAction.getStyle();
            if (style != null) {
                button.setAppearanceFromAttr(com.avito.android.lib.util.f.d(style));
            }
            button.setEnabled(!L.f(advertAction.getDisabled(), Boolean.TRUE));
            DeepLink deepLink = advertAction.getDeepLink();
            if (deepLink != null) {
                button.setOnClickListener(new XA0.c(lVar, deepLink, 5));
            }
        }
    }

    @Override // com.avito.android.favorites.adapter.advert.r
    public final void BW() {
        D6.w(this.f156492o);
    }

    @Override // com.avito.android.favorites.adapter.advert.r
    public final void Bh(@Y61.k Y41.l<? super Integer, G0> lVar) {
        this.f156493p.setStepperValueChangedListener(lVar);
    }

    @Override // com.avito.android.favorites.adapter.advert.r
    public final void C(@Y61.l String str) {
        I5.a(this.f156490m, str, false);
    }

    @Override // com.avito.android.favorites.adapter.advert.r
    public final void CS(@Y61.l String str, boolean z12) {
        TextView textView = this.f156485h;
        if (z12) {
            textView.setTextAppearance(R.style.Re23_Text_H40);
            textView.setTextColor(C35835l0.d(R.attr.red700, textView.getContext()));
        } else {
            textView.setTextAppearance(R.style.Legacy_Text_H4);
        }
        I5.a(textView, str, false);
    }

    @Override // com.avito.android.favorites.adapter.advert.r
    public final void CX(int i12) throws Resources.NotFoundException {
        TextView textView = this.f156492o;
        String string = textView.getResources().getString(R.string.stocks_info_quantity, Integer.valueOf(i12));
        D6.G(textView, true);
        I5.a(textView, string, false);
    }

    @Override // com.avito.android.favorites.adapter.advert.r
    public final void Ce(@Y61.l Long l12) {
        TextView textView = this.f156491n;
        if (l12 == null) {
            D6.w(textView);
        } else {
            D6.G(textView, true);
            I5.a(textView, this.f156480c.a(l12, TimeUnit.SECONDS), false);
        }
    }

    @Override // com.avito.android.favorites.adapter.advert.r
    public final void EK(@Y61.l BadgeSticker badgeSticker, boolean z12) {
        TextView textView = this.f156501x;
        if (badgeSticker == null) {
            D6.w(textView);
            return;
        }
        Context context = textView.getContext();
        UniversalColor backgroundColor = badgeSticker.getStyle().getBackgroundColor();
        C48063a.f437606a.getClass();
        textView.setBackgroundTintList(C48063a.e(context, backgroundColor));
        textView.setTextColor(C48063a.e(textView.getContext(), badgeSticker.getStyle().getFontColor()));
        I5.a(textView, badgeSticker.getTitle(), false);
        int dimensionPixelSize = z12 ? textView.getContext().getResources().getDimensionPixelSize(R.dimen.card_badge_sticker_bottom_margin_with_rotation_large) : textView.getContext().getResources().getDimensionPixelSize(R.dimen.card_badge_sticker_bottom_margin_with_rotation);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = dimensionPixelSize;
        textView.setLayoutParams(marginLayoutParams);
    }

    @Override // com.avito.android.favorites.adapter.advert.r
    public final void F0(@Y61.l Y41.a<G0> aVar) {
        CheckableImageButton checkableImageButton = this.f156497t;
        if (aVar == null) {
            checkableImageButton.setOnClickListener(null);
            return;
        }
        checkableImageButton.setOnClickListener(new com.avito.android.extended_profile_widgets.adapter.header.k(23, aVar));
        B2 b22 = this.f156481d;
        b22.getClass();
        kotlin.reflect.n<Object> nVar = B2.f67184X[46];
        if (((Boolean) b22.f67203S.a().invoke()).booleanValue()) {
            com.avito.android.checkable_image.q.e(checkableImageButton);
        }
    }

    @Override // com.avito.android.favorites.adapter.advert.r
    public final void FQ(@Y61.l Y41.a<G0> aVar) {
        TextView textView = this.f156498u;
        if (aVar == null) {
            textView.setOnClickListener(null);
        } else {
            textView.setOnClickListener(new com.avito.android.extended_profile_widgets.adapter.header.k(22, aVar));
        }
    }

    @Override // com.avito.android.favorites.adapter.advert.r
    public final void G00(@Y61.k AttributedText attributedText, @Y61.k RelatedProductsEntryPointState relatedProductsEntryPointState, @Y61.k Y41.a<G0> aVar) {
        RelatedProductsView.a cVar;
        RelatedProductsView relatedProductsView = this.f156500w;
        relatedProductsView.setVisibility(0);
        int iOrdinal = relatedProductsEntryPointState.ordinal();
        if (iOrdinal == 0) {
            cVar = new RelatedProductsView.a.c(attributedText, aVar);
        } else if (iOrdinal == 1) {
            cVar = RelatedProductsView.a.b.f156468a;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            cVar = RelatedProductsView.a.C4581a.f156467a;
        }
        relatedProductsView.setState(cVar);
    }

    @Override // com.avito.android.favorites.adapter.advert.r
    public final void Jk(@Y61.l Stepper stepper) {
        com.avito.android.cart_snippet_actions.l lVar = this.f156493p;
        if (stepper != null) {
            int i12 = stepper.f116272c;
            int i13 = stepper.f116271b;
            if (i13 != 0 || i12 != 0) {
                if (i13 <= 0) {
                    lVar.setVisible(true);
                    lVar.setAddToCartButtonVisible(true);
                    return;
                }
                lVar.setVisible(true);
                lVar.setStepperVisible(true);
                lVar.Qr();
                lVar.setStepperMaxValue(i12);
                lVar.setStepperValue(i13);
                PrintableText printableText = stepper.f116274e;
                lVar.Hf(printableText != null ? printableText.k0(this.f156479b.getContext()) : null, stepper.f116275f);
                return;
            }
        }
        lVar.setVisible(false);
    }

    @Override // com.avito.android.favorites.adapter.advert.r
    public final void KD(@Y61.l SerpBadgeBar serpBadgeBar) {
        this.f156502y.a(serpBadgeBar != null ? Q81.b.d(serpBadgeBar) : null);
    }

    @Override // com.avito.android.favorites.adapter.advert.r
    @Y61.k
    public final Uri O(@Y61.k com.avito.android.image_loader.k kVar) {
        return ((com.avito.android.image_loader.m) kVar).a(this.f156482e);
    }

    @Override // com.avito.android.favorites.adapter.advert.r
    public final void V(@Y61.l String str) {
        I5.a(this.f156489l, str, false);
    }

    @Override // com.avito.android.favorites.adapter.advert.r
    public final void XN() {
        this.f156500w.setVisibility(8);
    }

    @Override // com.avito.android.favorites.adapter.advert.r
    public final void c(@Y61.l Y41.a<G0> aVar) {
        View view = this.f156479b;
        if (aVar == null) {
            view.setOnClickListener(null);
        } else {
            view.setOnClickListener(new com.avito.android.extended_profile_widgets.adapter.header.k(21, aVar));
        }
    }

    @Override // com.avito.android.favorites.adapter.advert.r
    public final void d(@Y61.l Y41.a<G0> aVar) {
        this.f156477F = aVar;
    }

    @Override // com.avito.android.favorites.adapter.advert.r
    public final void fM(@Y61.l String str, boolean z12) {
        TextView textView = this.f156488k;
        if (z12) {
            textView.setTextAppearance(R.style.Re23_Text_S20);
        } else {
            textView.setTextAppearance(R.style.Legacy_Text_M2);
        }
        textView.setTextColor(C35835l0.d(R.attr.red600, this.f156485h.getContext()));
        I5.a(textView, str, false);
    }

    @Override // com.avito.android.favorites.adapter.advert.r
    public final void i50(@Y61.l String str, @Y61.l DiscountIcon discountIcon, boolean z12) {
        Drawable drawable;
        int iA2;
        TextView textView = this.f156485h;
        StrikethroughTextView strikethroughTextView = this.f156486i;
        TextView textView2 = this.f156487j;
        if (str == null || str.length() == 0) {
            textView2.setText("");
            D6.w(textView2);
            strikethroughTextView.setText("");
            D6.w(strikethroughTextView);
            I5.d(textView, null, null, 11);
            return;
        }
        if (z12) {
            I5.a(strikethroughTextView, str, false);
            D6.w(textView2);
            I5.d(textView, null, null, 11);
            return;
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new StrikethroughSpan(), 0, str.length(), 33);
        textView2.setText(spannableString);
        D6.H(textView2);
        D6.w(strikethroughTextView);
        if (discountIcon != null) {
            Context context = textView.getContext();
            try {
                Integer numA = com.avito.android.lib.util.q.a(discountIcon.getName());
                iA2 = C48063a.f437606a.a(context, discountIcon.getColor());
                drawable = numA != null ? C35835l0.h(numA.intValue(), context) : null;
            } catch (Throwable unused) {
            }
            if (drawable != null) {
                drawable.setTint(iA2);
            } else {
                drawable = null;
            }
        } else {
            drawable = androidx.core.content.d.getDrawable(textView.getContext(), R.drawable.markdown);
        }
        I5.d(textView, null, drawable, 11);
    }

    @Override // com.avito.android.favorites.adapter.advert.r
    public final void iI(@Y61.l AdvertAction.Phone phone, @Y61.l AdvertAction.Messenger messenger, @Y61.l AdvertAction advertAction, @Y61.k Y41.l lVar) {
        this.f156474C.setVisibility(C42756l.B(new AdvertAction[]{phone, messenger, advertAction}).isEmpty() ? 8 : 0);
        B80(this.f156503z, phone, lVar);
        B80(this.f156472A, messenger, lVar);
        B80(this.f156473B, advertAction, lVar);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f156477F;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // com.avito.android.favorites.adapter.advert.r
    public final void kG(@Y61.l String str) {
        I5.a(this.f156496s, str, false);
    }

    @Override // com.avito.android.favorites.adapter.advert.r
    public final void ms(@Y61.l com.avito.android.extended_profile_ui_components.c cVar) {
        this.f156494q.setOnClickListener(cVar);
    }

    @Override // com.avito.android.favorites.adapter.advert.r
    public final void nd(boolean z12, boolean z13) {
        D6.G(this.f156498u, !z12 && z13);
        D6.G(this.f156483f, !z12);
        TextView textView = this.f156496s;
        TextView textView2 = this.f156487j;
        TextView textView3 = this.f156485h;
        TextView textView4 = this.f156484g;
        SimpleDraweeView simpleDraweeView = this.f156482e;
        if (z12) {
            float f12 = this.f156475D;
            simpleDraweeView.setAlpha(f12);
            textView4.setAlpha(f12);
            textView3.setAlpha(f12);
            textView2.setAlpha(f12);
            textView.setAlpha(f12);
            return;
        }
        float f13 = this.f156476E;
        simpleDraweeView.setAlpha(f13);
        textView4.setAlpha(f13);
        textView3.setAlpha(f13);
        textView2.setAlpha(f13);
        textView.setAlpha(f13);
    }

    @Override // com.avito.android.favorites.adapter.advert.r
    public final void rr(@Y61.l BuyWithDeliveryInFavorites buyWithDeliveryInFavorites) {
        String title = buyWithDeliveryInFavorites != null ? buyWithDeliveryInFavorites.getTitle() : null;
        Button button = this.f156494q;
        com.avito.android.lib.design.button.b.a(button, title, false);
        String style = buyWithDeliveryInFavorites != null ? buyWithDeliveryInFavorites.getStyle() : null;
        if (style != null) {
            button.setAppearanceFromAttr(com.avito.android.lib.util.f.d(style));
        }
    }

    @Override // com.avito.android.favorites.adapter.advert.r
    public final void setFavorite(boolean z12) {
        this.f156497t.setChecked(z12);
    }

    @Override // com.avito.android.favorites.adapter.advert.r
    public final void setOnAddToCartClickListener(@Y61.l View.OnClickListener onClickListener) {
        this.f156493p.setOnAddToCartClickListener(onClickListener);
    }

    @Override // com.avito.android.favorites.adapter.advert.r
    public final void setTitle(@Y61.k String str) {
        I5.a(this.f156484g, str, false);
    }

    @Override // com.avito.android.favorites.adapter.advert.r
    public final void tT(@Y61.l AutotekaPurchaseAction autotekaPurchaseAction, @Y61.l AutotekaLink autotekaLink, @Y61.k Y41.l<? super AutotekaPurchaseAction, G0> lVar, @Y61.k Y41.l<? super DeepLink, G0> lVar2) {
        Button button = this.f156495r;
        if (autotekaPurchaseAction == null && autotekaLink == null) {
            D6.w(button);
            return;
        }
        if (autotekaLink != null) {
            button.setText(autotekaLink.getText());
            button.setOnClickListener(new com.avito.android.extended_profile_ui_components.c(10, lVar2, autotekaLink));
            D6.G(button, true);
        } else if (autotekaPurchaseAction != null) {
            button.setText(autotekaPurchaseAction.getLabel());
            button.setOnClickListener(new com.avito.android.extended_profile_ui_components.c(11, lVar, autotekaPurchaseAction));
            D6.G(button, true);
        }
    }

    @Override // com.avito.android.favorites.adapter.advert.r
    public final void vu(@Y61.l String str, boolean z12, @Y61.k Y41.a aVar) {
        Button button = this.f156499v;
        D6.G(button, z12);
        if (str == null) {
            str = "";
        }
        button.setText(str);
        button.setOnClickListener(new com.avito.android.extended_profile_widgets.adapter.header.k(24, aVar));
    }

    @Override // com.avito.android.favorites.adapter.advert.r
    public final void x(@Y61.k com.avito.android.image_loader.k kVar) {
        Drawable drawableA = d.a.a(this.f156478G, this.f156479b.getContext(), kVar, null, null, 28);
        ImageRequest.a aVarA = C35949t5.a(this.f156482e);
        aVarA.d(kVar);
        aVarA.f169501s = drawableA;
        aVarA.c();
    }
}
