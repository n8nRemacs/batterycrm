package com.avito.android.user_advert.advert.items.auction_banner;

import Y41.l;
import Y61.k;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.avito.android.R;
import com.avito.android.avito_map.AvitoMapMarkerKt;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.deprecated_design.badge_bar.BadgeView;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.util.v;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.user_adverts.auction.AuctionBannerBadge;
import com.avito.android.remote.model.user_adverts.auction.AuctionButton;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import sK0.C48065c;
import wK0.AbstractC49526a;

/* compiled from: AuctionBannerItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_advert/advert/items/auction_banner/j;", "Lcom/avito/android/user_advert/advert/items/auction_banner/h;", "Lcom/avito/konveyor/adapter/b;", "a", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f309228i = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final CardView f309229b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f309230c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f309231d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final BadgeView f309232e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final SimpleDraweeView f309233f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Button f309234g;

    /* renamed from: h, reason: collision with root package name */
    public final int f309235h;

    /* compiled from: AuctionBannerItemView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/avito/android/user_advert/advert/items/auction_banner/j$a;", "", "<init>", "()V", "", "BADGE_BACKGROUND_DEFAULT_COLOR", "Ljava/lang/String;", "BADGE_TITLE_DEFAULT_COLOR", "BANNER_BACKGROUND_DEFAULT_COLOR", "BANNER_TITLE_DEFAULT_COLOR", "BUTTON_BACKGROUND_DEFAULT_COLOR", "BUTTON_BACKGROUND_HIGHLIGHTED_DEFAULT_COLOR", "BUTTON_TITLE_DEFAULT_COLOR", "DESCRIPTION_TEXT_DEFAULT_COLOR", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public j(@k View view) {
        super(view);
        this.f309229b = (CardView) view.findViewById(R.id.auction_banner);
        this.f309230c = (TextView) view.findViewById(R.id.auction_banner_title);
        this.f309231d = (TextView) view.findViewById(R.id.auction_banner_description);
        this.f309232e = (BadgeView) view.findViewById(R.id.auction_banner_badge);
        this.f309233f = (SimpleDraweeView) view.findViewById(R.id.auction_banner_icon);
        this.f309234g = (Button) view.findViewById(R.id.auction_banner_button);
        this.f309235h = view.getResources().getDimensionPixelSize(R.dimen.my_advert_auction_banner_icon_size);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f309229b.setOnClickListener(null);
    }

    @Override // com.avito.android.user_advert.advert.items.auction_banner.h
    public final void vw(@k final com.avito.android.user_advert.advert.items.auction_banner.a aVar, @k final l<? super DeepLink, G0> lVar) {
        int i12;
        CardView cardView = this.f309229b;
        int iG2 = C48065c.g(aVar.f309215i, cardView.getContext(), "blue50");
        if (aVar.f309217k != null) {
            final int i13 = 1;
            cardView.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.user_advert.advert.items.auction_banner.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    l lVar2 = lVar;
                    a aVar2 = aVar;
                    switch (i13) {
                        case 0:
                            int i14 = j.f309228i;
                            lVar2.invoke(aVar2.f309216j.getDeeplink());
                            break;
                        default:
                            int i15 = j.f309228i;
                            lVar2.invoke(aVar2.f309217k);
                            break;
                    }
                }
            });
        }
        cardView.setBackgroundColor(iG2);
        v.b(cardView, R.dimen.my_advert_auction_banner_corner_radius);
        TextView textView = this.f309230c;
        int iG3 = C48065c.g(aVar.f309210d, textView.getContext(), AvitoMapMarkerKt.AMENITY_TYPE_BLACK);
        String str = aVar.f309209c;
        I5.a(textView, str, false);
        textView.setTextColor(iG3);
        AuctionBannerBadge auctionBannerBadge = aVar.f309213g;
        BadgeView badgeView = this.f309232e;
        if (auctionBannerBadge != null) {
            int iG4 = C48065c.g(auctionBannerBadge.getUniversalTitleColor(), badgeView.getContext(), "white");
            int iG5 = C48065c.g(auctionBannerBadge.getUniversalBackgroundColor(), badgeView.getContext(), "green600");
            badgeView.setText(auctionBannerBadge.getTitle());
            badgeView.setTextColor(iG4);
            badgeView.setBackgroundColor(iG5);
            v.b(badgeView, R.dimen.my_advert_auction_banner_badge_corner_radius);
            badgeView.setVisibility(0);
        } else {
            badgeView.setVisibility(8);
        }
        UniversalImage universalImage = aVar.f309214h;
        Image image = universalImage != null ? universalImage.getImage() : null;
        SimpleDraweeView simpleDraweeView = this.f309233f;
        if (image != null) {
            int i14 = this.f309235h;
            simpleDraweeView.setImageURI(image.findUri(i14, i14));
            simpleDraweeView.setVisibility(0);
        } else {
            simpleDraweeView.setVisibility(8);
        }
        TextView textView2 = this.f309231d;
        int iG6 = C48065c.g(aVar.f309212f, textView2.getContext(), AvitoMapMarkerKt.AMENITY_TYPE_BLACK);
        if (str == null || auctionBannerBadge == null) {
            ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (str == null) {
                ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                i12 = marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0;
            } else {
                i12 = marginLayoutParams.topMargin;
            }
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, i12, D6.s(simpleDraweeView), marginLayoutParams.bottomMargin);
            textView2.setLayoutParams(marginLayoutParams);
        }
        I5.a(textView2, aVar.f309211e, false);
        textView2.setTextColor(iG6);
        AuctionButton auctionButton = aVar.f309216j;
        Button button = this.f309234g;
        if (auctionButton == null) {
            button.setVisibility(8);
            return;
        }
        int iG7 = C48065c.g(auctionButton.getTitleColor(), button.getContext(), "white");
        int iG8 = C48065c.g(auctionButton.getColor(), button.getContext(), AvitoMapMarkerKt.AMENITY_TYPE_BLACK);
        int iG9 = C48065c.g(auctionButton.getHighlightedColor(), button.getContext(), "gray12");
        button.setText(auctionButton.getTitle());
        button.setTextColor(iG7);
        button.setBackground(AbstractC49526a.C12816a.a(AbstractC49526a.f441376b, ColorStateList.valueOf(iG8), ColorStateList.valueOf(iG9), 0, null, 0, 124));
        v.b(button, R.dimen.my_advert_auction_banner_button_corner_radius);
        final int i15 = 0;
        button.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.user_advert.advert.items.auction_banner.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l lVar2 = lVar;
                a aVar2 = aVar;
                switch (i15) {
                    case 0:
                        int i142 = j.f309228i;
                        lVar2.invoke(aVar2.f309216j.getDeeplink());
                        break;
                    default:
                        int i152 = j.f309228i;
                        lVar2.invoke(aVar2.f309217k);
                        break;
                }
            }
        });
        button.setVisibility(0);
    }
}
