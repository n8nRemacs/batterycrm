package com.avito.android.advert.item.marketplace_sales_advert_promo_banner;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.advert.item.marketplace_sales_advert_promo_banner.MarketplaceSalesAdvertPromoBannerItem;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.design.strikethrough.StrikethroughTextView;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.sales.utils.Timer;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.serp_core.timer.CountDownTimerWidget;
import com.avito.android.util.C35763c0;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.text.j;
import java.util.Date;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: MarketplaceSalesAdvertPromoBannerView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/marketplace_sales_advert_promo_banner/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/marketplace_sales_advert_promo_banner/f;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f77524b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final SimpleDraweeView f77525c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final LinearLayout f77526d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f77527e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f77528f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final LinearLayout f77529g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final TextView f77530h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final StrikethroughTextView f77531i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final TextView f77532j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final SimpleDraweeView f77533k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final CountDownTimerWidget f77534l;

    /* compiled from: MarketplaceSalesAdvertPromoBannerView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            D6.w(g.this.f77534l);
            return G0.f406611a;
        }
    }

    public g(@k View view) {
        super(view);
        this.f77524b = view;
        View viewFindViewById = view.findViewById(R.id.sales_advert_promo_banner_background_image);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f77525c = (SimpleDraweeView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.sales_advert_promo_banner_text_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f77526d = (LinearLayout) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.sales_advert_promo_banner_title);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f77527e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.sales_advert_promo_banner_subtitle);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f77528f = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.sales_advert_promo_banner_price_container);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f77529g = (LinearLayout) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.sales_advert_promo_banner_price);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f77530h = (TextView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.sales_advert_promo_banner_old_price);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.strikethrough.StrikethroughTextView");
        }
        this.f77531i = (StrikethroughTextView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.sales_advert_promo_banner_old_price_hint);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f77532j = (TextView) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.sales_advert_promo_banner_right_image);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f77533k = (SimpleDraweeView) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(R.id.sales_advert_promo_banner_timer);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.serp_core.timer.CountDownTimerWidget");
        }
        this.f77534l = (CountDownTimerWidget) viewFindViewById10;
    }

    @Override // com.avito.android.advert.item.marketplace_sales_advert_promo_banner.f
    public final void I3(@l Long l12, @l Timer.TimerStyle timerStyle) {
        SimpleDraweeView simpleDraweeView = this.f77533k;
        CountDownTimerWidget countDownTimerWidget = this.f77534l;
        View view = this.f77524b;
        if (l12 == null || l12.longValue() - new Date().getTime() <= 0) {
            D6.w(countDownTimerWidget);
            simpleDraweeView.getLayoutParams().height = view.getResources().getDimensionPixelOffset(R.dimen.advert_sales_promo_banner_right_image_without_timer_size);
            simpleDraweeView.getLayoutParams().width = view.getResources().getDimensionPixelOffset(R.dimen.advert_sales_promo_banner_right_image_without_timer_size);
            D6.c(this.f77526d, null, Integer.valueOf(view.getResources().getDimensionPixelOffset(R.dimen.advert_sales_promo_banner_containers_without_timer_margin_top)), null, null, 13);
            D6.c(this.f77529g, null, Integer.valueOf(view.getResources().getDimensionPixelOffset(R.dimen.advert_sales_promo_banner_containers_without_timer_margin_top)), null, null, 13);
            return;
        }
        CountDownTimerWidget.d(countDownTimerWidget, l12.longValue());
        countDownTimerWidget.setOnFinishListener(new a());
        D6.H(countDownTimerWidget);
        simpleDraweeView.getLayoutParams().height = view.getResources().getDimensionPixelOffset(R.dimen.advert_sales_promo_banner_right_image_with_timer_size);
        simpleDraweeView.getLayoutParams().width = view.getResources().getDimensionPixelOffset(R.dimen.advert_sales_promo_banner_right_image_with_timer_size);
        D6.c(this.f77526d, null, Integer.valueOf(view.getResources().getDimensionPixelOffset(R.dimen.advert_sales_promo_banner_containers_with_timer_margin_top)), null, null, 13);
        D6.c(this.f77529g, null, Integer.valueOf(view.getResources().getDimensionPixelOffset(R.dimen.advert_sales_promo_banner_containers_with_timer_margin_top)), null, null, 13);
        if (timerStyle != null) {
            UniversalColor cellColor = timerStyle.getCellColor();
            Context context = view.getContext();
            C48063a c48063a = C48063a.f437606a;
            countDownTimerWidget.setCellBackgroundColorTint(c48063a.a(context, cellColor));
            countDownTimerWidget.setSeparatorTextColor(c48063a.a(view.getContext(), timerStyle.getCellColor()));
            countDownTimerWidget.setCellTextColor(c48063a.a(view.getContext(), timerStyle.getTextColor()));
        }
    }

    @Override // com.avito.android.advert.item.marketplace_sales_advert_promo_banner.f
    public final void N4(@l AttributedText attributedText, @l AttributedText attributedText2) {
        LinearLayout linearLayout = this.f77526d;
        if (attributedText == null && attributedText2 == null) {
            D6.w(linearLayout);
            return;
        }
        D6.H(linearLayout);
        TextView textView = this.f77527e;
        if (attributedText == null) {
            D6.w(textView);
        } else {
            j.a(textView, attributedText, null);
            D6.H(textView);
        }
        TextView textView2 = this.f77528f;
        if (attributedText2 == null) {
            D6.w(textView2);
        } else {
            j.a(textView2, attributedText2, null);
            D6.H(textView2);
        }
    }

    @Override // com.avito.android.advert.item.marketplace_sales_advert_promo_banner.f
    public final void bo(@l MarketplaceSalesAdvertPromoBannerItem.AdvertPromoBannerPriceBlock advertPromoBannerPriceBlock) {
        G0 g02;
        UniversalColor universalColor;
        Integer num;
        LinearLayout linearLayout = this.f77529g;
        View view = this.f77524b;
        if (advertPromoBannerPriceBlock == null) {
            D6.w(linearLayout);
            D6.f(this.f77529g, 0, 0, 0, view.getResources().getDimensionPixelOffset(R.dimen.advert_sales_promo_banner_text_container_default_padding_bottom), 7);
            return;
        }
        TextView textView = this.f77530h;
        MarketplaceSalesAdvertPromoBannerItem.AdvertPromoBannerPrice advertPromoBannerPrice = advertPromoBannerPriceBlock.f77513b;
        AttributedText attributedText = advertPromoBannerPriceBlock.f77514c;
        if (attributedText != null) {
            j.a(textView, attributedText, null);
            if (advertPromoBannerPrice.f77510c != null || advertPromoBannerPrice.f77511d != null) {
                textView.setText(textView.getText().toString());
            }
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            I5.a(textView, advertPromoBannerPrice.f77509b, false);
        }
        Integer num2 = advertPromoBannerPrice.f77510c;
        if (num2 != null) {
            textView.setTextAppearance(C35835l0.j(num2.intValue(), view.getContext()));
        }
        UniversalColor universalColor2 = advertPromoBannerPrice.f77511d;
        if (universalColor2 != null) {
            textView.setTextColor(C48063a.f437606a.a(view.getContext(), universalColor2));
        }
        MarketplaceSalesAdvertPromoBannerItem.AdvertPromoBannerPrice advertPromoBannerPrice2 = advertPromoBannerPriceBlock.f77515d;
        UniversalColor universalColor3 = advertPromoBannerPrice2.f77512e;
        StrikethroughTextView strikethroughTextView = this.f77531i;
        if (universalColor3 != null) {
            int iA2 = C48063a.f437606a.a(view.getContext(), universalColor3);
            com.avito.android.lib.design.text_view.d dVar = com.avito.android.lib.design.text_view.d.f180938a;
            Context context = view.getContext();
            Context context2 = view.getContext();
            Integer num3 = advertPromoBannerPrice2.f77510c;
            int iJ2 = C35835l0.j(num3 != null ? num3.intValue() : R.attr.textM1, context2);
            dVar.getClass();
            strikethroughTextView.setStyle(new com.avito.android.lib.design.strikethrough.a(new C35763c0(iA2, null, null, null, 14, null), com.avito.android.lib.design.text_view.d.a(iJ2, context)));
        }
        I5.a(strikethroughTextView, advertPromoBannerPrice2.f77509b, false);
        UniversalColor universalColor4 = advertPromoBannerPrice2.f77511d;
        if (universalColor4 != null) {
            strikethroughTextView.setTextColor(C48063a.f437606a.a(view.getContext(), universalColor4));
        }
        MarketplaceSalesAdvertPromoBannerItem.AdvertPromoBannerPrice advertPromoBannerPrice3 = advertPromoBannerPriceBlock.f77516e;
        String str = advertPromoBannerPrice3 != null ? advertPromoBannerPrice3.f77509b : null;
        TextView textView2 = this.f77532j;
        I5.a(textView2, str, false);
        if (advertPromoBannerPrice3 != null && (num = advertPromoBannerPrice3.f77510c) != null) {
            textView2.setTextAppearance(C35835l0.j(num.intValue(), view.getContext()));
        }
        if (advertPromoBannerPrice3 != null && (universalColor = advertPromoBannerPrice3.f77511d) != null) {
            textView2.setTextColor(C48063a.f437606a.a(view.getContext(), universalColor));
        }
        D6.f(this.f77526d, 0, 0, 0, view.getResources().getDimensionPixelOffset(R.dimen.advert_sales_promo_banner_text_container_with_price_padding_bottom), 7);
        D6.H(linearLayout);
    }

    @Override // com.avito.android.advert.item.marketplace_sales_advert_promo_banner.f
    public final void f4(@k UniversalImage universalImage) {
        com.avito.android.advert.item.delivery_suggests.l.w(com.avito.android.advert.item.delivery_suggests.l.g(this.f77524b, universalImage), C35949t5.a(this.f77533k));
    }

    @Override // com.avito.android.advert.item.marketplace_sales_advert_promo_banner.f
    public final void v1(@k UniversalImage universalImage) {
        Image imageG = com.avito.android.advert.item.delivery_suggests.l.g(this.f77524b, universalImage);
        SimpleDraweeView simpleDraweeView = this.f77525c;
        D6.H(simpleDraweeView);
        com.avito.android.advert.item.delivery_suggests.l.w(imageG, C35949t5.a(simpleDraweeView));
    }
}
