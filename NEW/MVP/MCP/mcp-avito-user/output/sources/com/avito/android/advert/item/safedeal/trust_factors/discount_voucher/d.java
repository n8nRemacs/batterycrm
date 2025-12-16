package com.avito.android.advert.item.safedeal.trust_factors.discount_voucher;

import Y61.k;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.consultation.B;
import com.avito.android.advert.item.delivery_suggests.l;
import com.avito.android.advert_core.safedeal.trust_factors.TrustFactorsComponent;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.safedeal.SafeDeal;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.text.j;
import com.avito.android.util.y6;
import com.facebook.drawee.view.SimpleDraweeView;
import javax.inject.Inject;
import kotlin.Metadata;
import sK0.C48063a;

/* compiled from: TrustFactorsVoucherPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/safedeal/trust_factors/discount_voucher/d;", "LTV0/d;", "Lcom/avito/android/advert/item/safedeal/trust_factors/discount_voucher/f;", "Lcom/avito/android/advert/item/safedeal/trust_factors/discount_voucher/TrustFactorsVoucherItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements TV0.d<f, TrustFactorsVoucherItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.advert.item.safedeal.trust_factors.d f79116b;

    @Inject
    public d(@k com.avito.android.advert.item.safedeal.trust_factors.d dVar) {
        this.f79116b = dVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        TrustFactorsComponent.Voucher voucher = ((TrustFactorsVoucherItem) aVar).f79106d;
        SafeDeal.Component.Voucher voucher2 = voucher.f84274b;
        UniversalColor backgroundColor = voucher2.getBackgroundColor();
        GradientDrawable gradientDrawableE = l.e(0);
        gradientDrawableE.setCornerRadius(y6.b(24));
        View view = fVar.f79118b;
        Context context = view.getContext();
        C48063a c48063a = C48063a.f437606a;
        gradientDrawableE.setColor(c48063a.a(context, backgroundColor));
        view.setBackground(gradientDrawableE);
        Image imageG = l.g(view, voucher2.getImage());
        SimpleDraweeView simpleDraweeView = fVar.f79120d;
        if (imageG == null) {
            D6.w(simpleDraweeView);
        } else {
            D6.H(simpleDraweeView);
            l.w(imageG, C35949t5.a(simpleDraweeView));
        }
        j.c(fVar.f79121e, voucher2.getTitle(), null);
        j.c(fVar.f79122f, voucher2.getSubtitle(), null);
        SafeDeal.Component.Voucher.Button button = voucher2.getButton();
        UniversalColor backgroundColor2 = button.getBackgroundColor();
        UniversalColor highlightedBackgroundColor = button.getHighlightedBackgroundColor();
        GradientDrawable gradientDrawableE2 = l.e(0);
        gradientDrawableE2.setCornerRadius(y6.b(16));
        gradientDrawableE2.setColor(c48063a.a(view.getContext(), backgroundColor2));
        RippleDrawable rippleDrawable = new RippleDrawable(C48063a.e(view.getContext(), highlightedBackgroundColor), gradientDrawableE2, null);
        FrameLayout frameLayout = fVar.f79123g;
        frameLayout.setBackground(rippleDrawable);
        frameLayout.setOnClickListener(new B(fVar, 6));
        DeepLink onTapDeepLink = voucher.f84274b.getButton().getOnTapDeepLink();
        fVar.f79126j = onTapDeepLink != null ? new c(this, onTapDeepLink) : null;
    }
}
