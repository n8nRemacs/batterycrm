package com.avito.android.advert.item.developer.trust;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.remote.model.DeveloperCard;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.text.j;
import com.avito.android.util.y6;
import h5.InterfaceC40772a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DeveloperTrustView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/developer/trust/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/developer/trust/f;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC40772a f75195b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f75196c;

    /* renamed from: d, reason: collision with root package name */
    public final LayoutInflater f75197d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f75198e;

    /* renamed from: f, reason: collision with root package name */
    public final ImageView f75199f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f75200g;

    /* renamed from: h, reason: collision with root package name */
    public final Banner f75201h;

    /* renamed from: i, reason: collision with root package name */
    public final Banner f75202i;

    public g(@k View view, @k InterfaceC40772a interfaceC40772a) {
        super(view);
        this.f75195b = interfaceC40772a;
        this.f75196c = view.getContext();
        this.f75197d = LayoutInflater.from(view.getContext());
        this.f75198e = (TextView) view.findViewById(R.id.developer_trust_title);
        this.f75199f = (ImageView) view.findViewById(R.id.developer_trust_title_logo);
        this.f75200g = (TextView) view.findViewById(R.id.developer_trust_description);
        this.f75201h = (Banner) view.findViewById(R.id.developer_trust_trust_banner);
        this.f75202i = (Banner) view.findViewById(R.id.developer_trust_foundation_banner);
    }

    @Override // com.avito.android.advert.item.developer.trust.f
    public final void cW(@l Image image, @l AttributedText attributedText) {
        TextView textView = this.f75198e;
        if (attributedText == null) {
            D6.w(textView);
        } else {
            D6.H(textView);
            j.c(textView, attributedText, null);
        }
        ImageView imageView = this.f75199f;
        if (imageView == null || image == null) {
            return;
        }
        h.a(imageView, image);
        com.avito.android.image_loader.glide.utils.b.d(imageView, com.avito.android.image_loader.b.b(image));
        D6.H(imageView);
    }

    @Override // com.avito.android.advert.item.developer.trust.f
    public final void q(@l AttributedText attributedText) {
        TextView textView = this.f75200g;
        if (attributedText == null) {
            D6.w(textView);
        } else {
            D6.H(textView);
            j.c(textView, attributedText, null);
        }
    }

    @Override // com.avito.android.advert.item.developer.trust.f
    public final void sM(@k DeveloperCard developerCard, @k DeveloperCard developerCard2) {
        u50(developerCard);
        uw(developerCard2, false);
    }

    @Override // com.avito.android.advert.item.developer.trust.f
    public final void u50(@l DeveloperCard developerCard) {
        Banner banner = this.f75201h;
        if (developerCard == null) {
            D6.w(banner);
            return;
        }
        D6.H(banner);
        LinearLayout linearLayout = (LinearLayout) this.f75197d.inflate(R.layout.advert_details_developer_trust_card, banner.getContainer(), false);
        ((TextView) linearLayout.findViewById(R.id.developer_trust_card_title)).setText(developerCard.getTitle());
        ((TextView) linearLayout.findViewById(R.id.developer_trust_card_description)).setText(developerCard.getDescription());
        ImageView imageView = (ImageView) linearLayout.findViewById(R.id.developer_trust_card_icon);
        FrameLayout frameLayout = (FrameLayout) linearLayout.findViewById(R.id.developer_trust_card_icon_container);
        boolean zF2 = L.f(developerCard.isTrusted(), Boolean.TRUE);
        Context context = this.f75196c;
        if (zF2) {
            imageView.setImageDrawable(C35835l0.h(R.attr.ic_verify16, context));
            imageView.setImageTintList(C35835l0.e(R.attr.constantWhite, context));
            frameLayout.setBackgroundResource(R.drawable.bg_developer_trust_green);
        } else {
            imageView.setImageDrawable(C35835l0.h(R.attr.ic_verifyOutline16, context));
            imageView.setImageTintList(C35835l0.e(R.attr.black, context));
            frameLayout.setBackgroundResource(R.drawable.bg_developer_trust_gray);
        }
        TextView textView = (TextView) linearLayout.findViewById(R.id.developer_trust_arrow);
        FV.a.f4720a.getClass();
        FV.a.c(textView, R.attr.textIconArrowForwardIos);
        D6.H(textView);
        banner.setContentView(linearLayout);
        banner.l(Integer.valueOf(y6.b(12)), Integer.valueOf(y6.b(11)), Integer.valueOf(y6.b(14)), Integer.valueOf(y6.b(16)));
        DeepLink deepLink = developerCard.getDeepLink();
        if (deepLink != null) {
            banner.setOnClickListener(new com.avito.android.advert.closed.b(23, this, deepLink));
        }
    }

    @Override // com.avito.android.advert.item.developer.trust.f
    public final void uw(@l DeveloperCard developerCard, boolean z12) {
        String title = developerCard != null ? developerCard.getTitle() : null;
        Banner banner = this.f75202i;
        if (title == null) {
            if ((developerCard != null ? developerCard.getDescription() : null) == null) {
                D6.w(banner);
                return;
            }
        }
        D6.H(banner);
        LinearLayout linearLayout = (LinearLayout) this.f75197d.inflate(R.layout.advert_details_developer_trust_card_right, this.f75201h.getContainer(), false);
        ((TextView) linearLayout.findViewById(R.id.developer_trust_card_title)).setText(developerCard.getTitle());
        ((TextView) linearLayout.findViewById(R.id.developer_trust_card_description)).setText(developerCard.getDescription());
        ImageView imageView = (ImageView) linearLayout.findViewById(R.id.developer_trust_card_icon);
        FrameLayout frameLayout = (FrameLayout) linearLayout.findViewById(R.id.developer_trust_card_icon_container);
        ImageView imageView2 = (ImageView) linearLayout.findViewById(R.id.developer_trust_logo);
        D6.w(frameLayout);
        if (imageView2 != null) {
            D6.w(imageView2);
        }
        if (developerCard.getLogo() == null && imageView2 != null) {
            Context context = this.f75196c;
            imageView.setImageDrawable(C35835l0.h(R.attr.ic_realtyOutline16, context));
            imageView.setImageTintList(C35835l0.e(R.attr.black, context));
            frameLayout.setBackgroundResource(R.drawable.bg_developer_trust_gray);
            D6.H(frameLayout);
        } else if (imageView2 != null) {
            h.a(imageView2, developerCard.getLogo());
            com.avito.android.image_loader.glide.utils.b.d(imageView2, com.avito.android.image_loader.b.b(developerCard.getLogo()));
            D6.H(imageView2);
        }
        D6.w((TextView) linearLayout.findViewById(R.id.developer_trust_arrow));
        banner.setContentView(linearLayout);
        banner.l(Integer.valueOf(y6.b(12)), Integer.valueOf(y6.b(11)), Integer.valueOf(y6.b(14)), Integer.valueOf(y6.b(13)));
        if (z12) {
            banner.getLayoutParams().width = -2;
            D6.c(banner, Integer.valueOf(y6.b(13)), null, null, null, 14);
            banner.requestLayout();
        }
    }
}
