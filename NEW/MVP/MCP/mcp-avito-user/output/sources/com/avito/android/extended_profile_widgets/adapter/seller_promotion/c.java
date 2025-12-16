package com.avito.android.extended_profile_widgets.adapter.seller_promotion;

import Y41.l;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.text.j;
import com.avito.android.util.y6;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SellerPromotionPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/seller_promotion/c;", "LTV0/d;", "Lcom/avito/android/extended_profile_widgets/adapter/seller_promotion/e;", "Lcom/avito/android/extended_profile_widgets/adapter/seller_promotion/SellerPromotionItem;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c implements TV0.d<e, SellerPromotionItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<oB.k, G0> f154928b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public c(@k l<? super oB.k, G0> lVar) {
        this.f154928b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        e eVar2 = (e) eVar;
        SellerPromotionItem sellerPromotionItem = (SellerPromotionItem) aVar;
        View view = eVar2.f154930b;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = sellerPromotionItem.f154921e;
        view.setLayoutParams(marginLayoutParams);
        AttributedText title = sellerPromotionItem.f154920d.getTitle();
        TextView textView = eVar2.f154932d;
        j.c(textView, title, eVar2.f154931c);
        FV.a.f4720a.f(textView, R.attr.textIconArrowForwardIos, y6.b(3));
        view.setOnClickListener(new com.avito.android.extended_profile_ui_components.c(5, this, sellerPromotionItem));
    }
}
