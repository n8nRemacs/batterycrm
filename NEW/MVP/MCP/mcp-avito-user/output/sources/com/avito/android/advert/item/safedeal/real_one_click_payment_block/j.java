package com.avito.android.advert.item.safedeal.real_one_click_payment_block;

import Rh.C15041a;
import Y61.k;
import Y61.l;
import android.animation.ObjectAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.core.os.C22777e;
import com.avito.android.R;
import com.avito.android.advert.item.safedeal.real_one_click_payment_block.delivery_address.PaymentDeliveryAddress;
import com.avito.android.advert.item.safedeal.real_one_click_payment_block.h;
import com.avito.android.advert.item.safedeal.real_one_click_payment_block.payment_button.PaymentTypeButton;
import com.avito.android.advert.item.safedeal.real_one_click_payment_block.payment_slider.PaymentSlider;
import com.avito.android.advert.item.safedeal.real_one_click_payment_block.payment_slider.m;
import com.avito.android.advert.item.safedeal.real_one_click_payment_block.payment_slider.n;
import com.avito.android.advert.item.safedeal.real_one_click_payment_block.payment_slider.o;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.lib.util.q;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.safedeal.remote.model.SafeDealPaymentBlockEvents;
import com.avito.android.safedeal.remote.model.SafeDealPaymentBlockResponse;
import com.avito.android.safedeal.remote.model.SafeDealPaymentBlockSlider;
import com.avito.android.util.C1;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: AdvertDetailsSafeDealPaymentBlockView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/safedeal/real_one_click_payment_block/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/safedeal/real_one_click_payment_block/h;", "Lcom/avito/android/advert/item/safedeal/real_one_click_payment_block/payment_slider/o;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class j extends com.avito.konveyor.adapter.b implements h, o {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f78929l = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f78930b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public SafeDealPaymentBlockResponse f78931c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public h.b f78932d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final View f78933e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final View f78934f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final TextView f78935g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final PaymentDeliveryAddress f78936h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final PaymentSlider f78937i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final PaymentTypeButton f78938j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final TextView f78939k;

    public j(@k ViewGroup viewGroup, @k com.avito.android.util.text.a aVar) {
        super(viewGroup);
        this.f78930b = aVar;
        this.f78933e = viewGroup.findViewById(R.id.payment_block_content_container_skeleton);
        this.f78934f = viewGroup.findViewById(R.id.payment_block_content_container);
        View viewFindViewById = viewGroup.findViewById(R.id.payment_block_type_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f78935g = (TextView) viewFindViewById;
        View viewFindViewById2 = viewGroup.findViewById(R.id.payment_block_type_address);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.advert.item.safedeal.real_one_click_payment_block.delivery_address.PaymentDeliveryAddress");
        }
        this.f78936h = (PaymentDeliveryAddress) viewFindViewById2;
        View viewFindViewById3 = viewGroup.findViewById(R.id.payment_block_slider);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.advert.item.safedeal.real_one_click_payment_block.payment_slider.PaymentSlider");
        }
        this.f78937i = (PaymentSlider) viewFindViewById3;
        View viewFindViewById4 = viewGroup.findViewById(R.id.payment_block_type_button);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.advert.item.safedeal.real_one_click_payment_block.payment_button.PaymentTypeButton");
        }
        this.f78938j = (PaymentTypeButton) viewFindViewById4;
        View viewFindViewById5 = viewGroup.findViewById(R.id.payment_block_type_bottom_text);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f78939k = (TextView) viewFindViewById5;
    }

    @Override // com.avito.android.advert.item.safedeal.real_one_click_payment_block.payment_slider.o
    public final void ED() {
        h.b bVar;
        SafeDealPaymentBlockSlider slider;
        SafeDealPaymentBlockResponse safeDealPaymentBlockResponse = this.f78931c;
        DeepLink deepLinkE = (safeDealPaymentBlockResponse == null || (slider = safeDealPaymentBlockResponse.getSlider()) == null) ? null : slider.getOnTapDeepLink();
        if (deepLinkE instanceof NoMatchLink) {
            deepLinkE = null;
        }
        if (deepLinkE == null || (bVar = this.f78932d) == null) {
            return;
        }
        bVar.r(null, deepLinkE, null);
    }

    @Override // com.avito.android.advert.item.safedeal.real_one_click_payment_block.h
    public final void EY() {
        com.avito.android.advert.item.safedeal.real_one_click_payment_block.payment_slider.l lVar = this.f78937i.f78948e;
        lVar.setVisibility(0);
        C1.f318564a.getClass();
        if (!C1.a() || lVar.getVisibility() == 8) {
            return;
        }
        lVar.f78994e.removeCallbacksAndMessages(null);
        ObjectAnimator objectAnimator = lVar.f78993d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        String str = lVar.f78992c;
        TextView textView = lVar.f78991b;
        textView.setText(str);
        n.f78999d.getClass();
        ObjectAnimator objectAnimatorA = n.b.a(textView);
        lVar.f78993d = objectAnimatorA;
        objectAnimatorA.addListener(new m(lVar));
        lVar.f78994e.postDelayed(new com.avito.android.advert.item.safedeal.real_one_click_payment_block.payment_slider.g(4, lVar.f78995f), 0L);
    }

    @Override // com.avito.android.advert.item.safedeal.real_one_click_payment_block.h
    public final void gY() {
        this.f78933e.setVisibility(8);
        this.f78934f.setVisibility(8);
    }

    @Override // com.avito.android.advert.item.safedeal.real_one_click_payment_block.h
    public final void jj() {
        PaymentSlider paymentSlider = this.f78937i;
        com.avito.android.advert.item.safedeal.real_one_click_payment_block.payment_slider.h hVar = paymentSlider.f78946c;
        hVar.f78968g = true;
        Drawable drawable = hVar.f78966e;
        if (drawable != null) {
            drawable.setAlpha(0);
        }
        com.avito.android.advert.item.safedeal.real_one_click_payment_block.payment_slider.k kVar = paymentSlider.f78947d;
        kVar.f78982d = true;
        kVar.b(kVar.f78980b);
        com.avito.android.advert.item.safedeal.real_one_click_payment_block.payment_slider.l lVar = paymentSlider.f78948e;
        lVar.setVisibility(8);
        lVar.f78994e.removeCallbacksAndMessages(null);
        ObjectAnimator objectAnimator = lVar.f78993d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        lVar.f78991b.setText(lVar.f78992c);
    }

    @Override // com.avito.android.advert.item.safedeal.real_one_click_payment_block.h
    public final void nu(@k SafeDealPaymentBlockResponse safeDealPaymentBlockResponse, @k final h.b bVar) {
        Drawable drawableN;
        ParametrizedEvent parametrizedEventC;
        h.b bVar2;
        if (L.f(this.f78931c, safeDealPaymentBlockResponse)) {
            return;
        }
        this.f78931c = safeDealPaymentBlockResponse;
        this.f78932d = bVar;
        this.f78933e.setVisibility(8);
        this.f78934f.setVisibility(0);
        SafeDealPaymentBlockEvents events = safeDealPaymentBlockResponse.getEvents();
        if (events != null && (parametrizedEventC = events.getOnShowEvent()) != null && (bVar2 = this.f78932d) != null) {
            bVar2.u(parametrizedEventC);
        }
        this.f78935g.setText(safeDealPaymentBlockResponse.getTitle());
        String title = safeDealPaymentBlockResponse.getAddressCard().getTitle();
        PaymentDeliveryAddress paymentDeliveryAddress = this.f78936h;
        paymentDeliveryAddress.setText(title);
        final DeepLink deepLinkC = safeDealPaymentBlockResponse.getAddressCard().getOnTapDeepLink();
        if (deepLinkC instanceof NoMatchLink) {
            deepLinkC = null;
        }
        if (deepLinkC != null) {
            final int i12 = 0;
            paymentDeliveryAddress.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.advert.item.safedeal.real_one_click_payment_block.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    h.b bVar3 = bVar;
                    DeepLink deepLink = deepLinkC;
                    switch (i12) {
                        case 0:
                            int i13 = j.f78929l;
                            bVar3.r(null, deepLink, null);
                            break;
                        default:
                            int i14 = j.f78929l;
                            bVar3.r(null, deepLink, null);
                            break;
                    }
                }
            });
        }
        PaymentSlider paymentSlider = this.f78937i;
        paymentSlider.setPaymentListener(this);
        paymentSlider.setPriceText(safeDealPaymentBlockResponse.getSlider().getTitle());
        paymentSlider.setProgressText(safeDealPaymentBlockResponse.getSlider().getTitleAfterSwipe());
        String strD = safeDealPaymentBlockResponse.getBankButton().getIconName();
        UniversalColor iconColor = safeDealPaymentBlockResponse.getBankButton().getIconColor();
        UniversalColor universalColorC = safeDealPaymentBlockResponse.getBankButton().getBackground().getColor();
        UniversalColor universalColorD = safeDealPaymentBlockResponse.getBankButton().getBackground().getHighlightedColor();
        String title2 = safeDealPaymentBlockResponse.getBankButton().getTitle();
        UniversalColor universalColorF = safeDealPaymentBlockResponse.getBankButton().getTextColor();
        PaymentTypeButton paymentTypeButton = this.f78938j;
        paymentTypeButton.getClass();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(y6.b(16));
        C48063a c48063a = C48063a.f437606a;
        gradientDrawable.setColor(c48063a.a(paymentTypeButton.getContext(), universalColorC));
        paymentTypeButton.setBackground(new RippleDrawable(C48063a.e(paymentTypeButton.getContext(), universalColorD), gradientDrawable, null));
        Integer numA = q.a(strD);
        if (numA != null) {
            int iIntValue = numA.intValue();
            drawableN = iconColor != null ? C35835l0.n(paymentTypeButton.getContext(), iIntValue, c48063a.a(paymentTypeButton.getContext(), iconColor)) : C35835l0.h(iIntValue, paymentTypeButton.getContext());
        } else {
            drawableN = null;
        }
        paymentTypeButton.f78940b.setImageDrawable(drawableN);
        TextView textView = paymentTypeButton.f78941c;
        if (title2 == null || paymentTypeButton.f78942d <= paymentTypeButton.f78943e) {
            textView.setVisibility(8);
        } else {
            textView.setText(title2);
            textView.setTextColor(universalColorF != null ? c48063a.a(paymentTypeButton.getContext(), universalColorF) : C35835l0.d(R.attr.constantWhite, paymentTypeButton.getContext()));
            textView.setVisibility(0);
        }
        DeepLink deepLinkE = safeDealPaymentBlockResponse.getBankButton().getOnTapDeepLink();
        final DeepLink deepLink = deepLinkE instanceof NoMatchLink ? null : deepLinkE;
        if (deepLink != null) {
            final int i13 = 1;
            paymentTypeButton.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.advert.item.safedeal.real_one_click_payment_block.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    h.b bVar3 = bVar;
                    DeepLink deepLink2 = deepLink;
                    switch (i13) {
                        case 0:
                            int i132 = j.f78929l;
                            bVar3.r(null, deepLink2, null);
                            break;
                        default:
                            int i14 = j.f78929l;
                            bVar3.r(null, deepLink2, null);
                            break;
                    }
                }
            });
        }
        MovementMethod linkMovementMethod = LinkMovementMethod.getInstance();
        TextView textView2 = this.f78939k;
        textView2.setMovementMethod(linkMovementMethod);
        safeDealPaymentBlockResponse.getDeliveryPolicy().setOnDeepLinkClickListener(new C15041a(bVar, 4));
        com.avito.android.util.text.j.c(textView2, safeDealPaymentBlockResponse.getDeliveryPolicy(), this.f78930b);
    }

    @Override // com.avito.android.advert.item.safedeal.real_one_click_payment_block.payment_slider.o
    public final void rH() {
        h.b bVar;
        SafeDealPaymentBlockSlider slider;
        SafeDealPaymentBlockResponse safeDealPaymentBlockResponse = this.f78931c;
        DeepLink deepLinkD = (safeDealPaymentBlockResponse == null || (slider = safeDealPaymentBlockResponse.getSlider()) == null) ? null : slider.getOnStartSwipeDeepLink();
        if (deepLinkD instanceof NoMatchLink) {
            deepLinkD = null;
        }
        if (deepLinkD == null || (bVar = this.f78932d) == null) {
            return;
        }
        bVar.r(null, deepLinkD, null);
    }

    @Override // com.avito.android.advert.item.safedeal.real_one_click_payment_block.h
    public final void s3() {
        this.f78933e.setVisibility(0);
        this.f78934f.setVisibility(8);
    }

    @Override // com.avito.android.advert.item.safedeal.real_one_click_payment_block.payment_slider.o
    public final void tE() {
        h.b bVar;
        SafeDealPaymentBlockSlider slider;
        SafeDealPaymentBlockResponse safeDealPaymentBlockResponse = this.f78931c;
        DeepLink deepLinkC = (safeDealPaymentBlockResponse == null || (slider = safeDealPaymentBlockResponse.getSlider()) == null) ? null : slider.getOnFinishSwipeDeepLink();
        DeepLink deepLink = deepLinkC instanceof NoMatchLink ? null : deepLinkC;
        if (deepLink == null || (bVar = this.f78932d) == null) {
            return;
        }
        bVar.r(C22777e.b(new Q("payment_block_create_order_from_slider", this.f78931c)), deepLink, "delivery_order_create_deep_link_handler");
    }
}
