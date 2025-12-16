package com.avito.android.profile.user_profile.cards;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.lib.design.banner.a;
import com.avito.android.lib.design.button.Button;
import com.avito.android.profile.user_profile.cards.passport.DeliveryRestrictionCard;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35763c0;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import sK0.C48063a;

/* compiled from: ProfileInfoDeliveryRestrictionSubView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/g;", "Lcom/avito/android/profile/user_profile/cards/e;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g implements e {

    /* renamed from: b, reason: collision with root package name */
    public final Context f224962b;

    /* renamed from: c, reason: collision with root package name */
    public final Banner f224963c;

    /* renamed from: d, reason: collision with root package name */
    public final SimpleDraweeView f224964d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f224965e;

    /* renamed from: f, reason: collision with root package name */
    public final Button f224966f;

    public g(@Y61.k View view) {
        this.f224962b = view.getContext();
        this.f224963c = (Banner) view.findViewById(R.id.user_profile_delivery_restriction_item);
        this.f224964d = (SimpleDraweeView) view.findViewById(R.id.banner_image);
        this.f224965e = (TextView) view.findViewById(R.id.banner_title);
        this.f224966f = (Button) view.findViewById(R.id.banner_button);
    }

    @Override // com.avito.android.profile.user_profile.cards.e
    public final void o60() {
        D6.w(this.f224963c);
    }

    @Override // com.avito.android.profile.user_profile.cards.e
    public final void zP(@Y61.k DeliveryRestrictionCard deliveryRestrictionCard, @Y61.k Y41.l<? super DeepLink, G0> lVar) {
        Banner banner = this.f224963c;
        D6.H(banner);
        ImageRequest.a aVarA = C35949t5.a(this.f224964d);
        Context context = this.f224962b;
        aVarA.d(com.avito.android.image_loader.b.b(UniversalImageKt.getImageDependsOnTheme(deliveryRestrictionCard.f225114d, com.avito.android.lib.util.darkTheme.c.b(context))));
        aVarA.f169500r = false;
        aVarA.c();
        com.avito.android.util.text.j.a(this.f224965e, deliveryRestrictionCard.f225112b, null);
        DeliveryRestrictionCard.DeliveryRestrictionAction deliveryRestrictionAction = deliveryRestrictionCard.f225113c;
        this.f224966f.setState(new UU.a(deliveryRestrictionAction.f225116b, null, false, false, false, new f(lVar, deliveryRestrictionAction), null, null, null, false, 990, null));
        a.C5258a c5258a = com.avito.android.lib.design.banner.a.f178448x;
        int iJ2 = C35835l0.j(R.attr.bannerWarmgray, context);
        c5258a.getClass();
        com.avito.android.lib.design.banner.a aVarB = a.C5258a.b(iJ2, context);
        UniversalColor universalColor = deliveryRestrictionCard.f225115e;
        banner.setStyle(com.avito.android.lib.design.banner.a.a(aVarB, null, new C35763c0(universalColor != null ? C48063a.f437606a.a(context, universalColor) : C35835l0.d(R.attr.warmGray2, context), null, null, null, 14, null), null, com.akita.view.foundation.util.f.a(14), com.akita.view.foundation.util.f.a(15), com.akita.view.foundation.util.f.a(16), com.akita.view.foundation.util.f.a(16), false, com.akita.view.foundation.util.f.a(20), false, false, 8371981));
    }
}
