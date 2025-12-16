package com.avito.android.favorites.adapter.promo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.vertical_main.PromoAction;
import com.avito.android.remote.model.vertical_main.PromoActionStyle;
import com.avito.android.remote.model.vertical_main.PromoStyle;
import com.avito.android.util.I5;
import com.google.android.flexbox.FlexboxLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PromoItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/favorites/adapter/promo/w;", "Lcom/avito/android/lib/util/groupable_item/e;", "Lcom/avito/android/favorites/adapter/promo/u;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class w implements com.avito.android.lib.util.groupable_item.e, u {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final s f156677b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final x f156678c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final View f156679d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Banner f156680e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f156681f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final FlexboxLayout f156682g;

    public w(@Y61.k View view, @Y61.k s sVar, @Y61.k x xVar, @Y61.k View view2) {
        this.f156677b = sVar;
        this.f156678c = xVar;
        this.f156679d = view2;
        Banner banner = (Banner) view.findViewById(R.id.favorites_promo_root);
        this.f156680e = banner;
        View viewFindViewById = view2.findViewById(R.id.promo_text);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f156681f = (TextView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.promo_actions_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayout");
        }
        this.f156682g = (FlexboxLayout) viewFindViewById2;
        banner.setAppearanceFromAttr(R.attr.bannerBeige);
        banner.setContentView(view2);
        banner.setTitleTextAppearance(R.style.Re23_Text_H20);
    }

    @Override // com.avito.android.favorites.adapter.promo.u
    public final void KV(@Y61.k PromoStyle promoStyle) {
        this.f156680e.setAppearanceFromAttr(this.f156678c.a(promoStyle));
    }

    @Override // com.avito.android.lib.util.groupable_item.e
    public final void Tz(boolean z12, boolean z13) {
        this.f156680e.Tz(z12, z13);
    }

    @Override // com.avito.android.favorites.adapter.promo.u
    public final void W2() {
        this.f156682g.removeAllViews();
    }

    @Override // com.avito.android.favorites.adapter.promo.u
    public final void co(@Y61.k List<PromoAction> list, @Y61.k final FavoritesPromoItem favoritesPromoItem, final int i12) {
        FlexboxLayout flexboxLayout = this.f156682g;
        flexboxLayout.removeAllViews();
        for (final PromoAction promoAction : list) {
            PromoActionStyle style = promoAction.getStyle();
            PromoActionStyle promoActionStyle = PromoActionStyle.PRIMARY;
            Banner banner = this.f156680e;
            if (style == promoActionStyle) {
                Button button = (Button) LayoutInflater.from(new androidx.appcompat.view.d(banner.getThemedContext(), R.style.Theme_DesignSystem_Re23)).inflate(R.layout.favorites_promo_primary_action, (ViewGroup) flexboxLayout, false);
                com.avito.android.lib.design.button.b.a(button, promoAction.getTitle(), false);
                final int i13 = 1;
                button.setOnClickListener(new View.OnClickListener(this, promoAction, favoritesPromoItem, i12, i13) { // from class: com.avito.android.favorites.adapter.promo.v

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ int f156673b;

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ w f156674c;

                    /* renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ PromoAction f156675d;

                    /* renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ FavoritesPromoItem f156676e;

                    {
                        this.f156673b = i13;
                        this.f156674c = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (this.f156673b) {
                            case 0:
                                DeepLink uri = this.f156675d.getUri();
                                s sVar = this.f156674c.f156677b;
                                FavoritesPromoItem favoritesPromoItem2 = this.f156676e;
                                String str = favoritesPromoItem2.f156646c;
                                sVar.k(uri, favoritesPromoItem2);
                                break;
                            default:
                                DeepLink uri2 = this.f156675d.getUri();
                                s sVar2 = this.f156674c.f156677b;
                                FavoritesPromoItem favoritesPromoItem3 = this.f156676e;
                                String str2 = favoritesPromoItem3.f156646c;
                                sVar2.k(uri2, favoritesPromoItem3);
                                break;
                        }
                    }
                });
                flexboxLayout.addView(button);
            } else {
                Button button2 = (Button) LayoutInflater.from(new androidx.appcompat.view.d(banner.getThemedContext(), R.style.Theme_DesignSystem_Re23)).inflate(R.layout.favorites_promo_secondary_action, (ViewGroup) flexboxLayout, false);
                com.avito.android.lib.design.button.b.a(button2, promoAction.getTitle(), false);
                final int i14 = 0;
                button2.setOnClickListener(new View.OnClickListener(this, promoAction, favoritesPromoItem, i12, i14) { // from class: com.avito.android.favorites.adapter.promo.v

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ int f156673b;

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ w f156674c;

                    /* renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ PromoAction f156675d;

                    /* renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ FavoritesPromoItem f156676e;

                    {
                        this.f156673b = i14;
                        this.f156674c = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (this.f156673b) {
                            case 0:
                                DeepLink uri = this.f156675d.getUri();
                                s sVar = this.f156674c.f156677b;
                                FavoritesPromoItem favoritesPromoItem2 = this.f156676e;
                                String str = favoritesPromoItem2.f156646c;
                                sVar.k(uri, favoritesPromoItem2);
                                break;
                            default:
                                DeepLink uri2 = this.f156675d.getUri();
                                s sVar2 = this.f156674c.f156677b;
                                FavoritesPromoItem favoritesPromoItem3 = this.f156676e;
                                String str2 = favoritesPromoItem3.f156646c;
                                sVar2.k(uri2, favoritesPromoItem3);
                                break;
                        }
                    }
                });
                flexboxLayout.addView(button2);
            }
        }
    }

    @Override // TV0.e
    public final void j5() {
        throw null;
    }

    @Override // com.avito.android.favorites.adapter.promo.u
    public final void jY(@Y61.k String str) {
        this.f156680e.setTitle(str);
    }

    @Override // com.avito.android.favorites.adapter.promo.u
    public final void r6(@Y61.k String str) {
        TextView textView = this.f156681f;
        textView.setVisibility(0);
        I5.a(textView, str, false);
    }

    @Override // com.avito.android.favorites.adapter.promo.u
    public final void v8() {
        TextView textView = this.f156681f;
        textView.setVisibility(8);
        I5.a(textView, "", false);
    }
}
