package com.avito.android.profile.user_profile.cards.passport;

import Ua0.InterfaceC15503a;
import Y41.l;
import Y61.k;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.profile.user_profile.cards.CardItem;
import com.avito.android.remote.model.Avatar;
import com.avito.android.remote.model.ProfileRating;
import com.avito.android.remote.model.ProfileRatingAction;
import com.avito.android.remote.model.user_profile.Support;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import m90.C43931a;

/* compiled from: PassportCardItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/passport/f;", "Lcom/avito/android/profile/user_profile/cards/passport/c;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC15503a, G0> f225142b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC28373a f225143c;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public f(@k l<? super InterfaceC15503a, G0> lVar, @k InterfaceC28373a interfaceC28373a) {
        this.f225142b = lVar;
        this.f225143c = interfaceC28373a;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        G0 g02;
        Float fValueOf;
        DeepLink deepLink;
        h hVar = (h) eVar;
        CardItem.PassportCardItem passportCardItem = (CardItem.PassportCardItem) aVar;
        CardItem.InfoCardItem infoCardItem = passportCardItem.f224461d;
        Avatar avatar = infoCardItem.f224413d;
        G0 g03 = null;
        String alert = avatar != null ? avatar.getAlert() : null;
        Avatar avatar2 = infoCardItem.f224413d;
        String description = avatar2 != null ? avatar2.getDescription() : null;
        hVar.jx();
        hVar.jm();
        if (alert != null && description != null) {
            hVar.lx(alert, description);
        } else if (description != null) {
            hVar.c00(description);
        }
        hVar.SL(infoCardItem.f224417h);
        hVar.sC(infoCardItem.f224420k);
        hVar.bQ(infoCardItem.f224422m);
        hVar.J(infoCardItem.f224414e);
        Support support = infoCardItem.f224421l;
        if (support != null) {
            hVar.eB(support.getTitle(), support.getFormattedContactId());
        } else {
            hVar.B8();
        }
        ReputationAndRatingCard reputationAndRatingCard = infoCardItem.f224424o;
        if (reputationAndRatingCard != null) {
            hVar.sZ(reputationAndRatingCard, this.f225142b);
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            hVar.FT();
        }
        ProfileRating profileRating = infoCardItem.f224423n;
        ProfileRatingAction action = profileRating != null ? profileRating.getAction() : null;
        if (profileRating == null || (fValueOf = profileRating.getScoreFloat()) == null) {
            fValueOf = profileRating != null ? Float.valueOf(profileRating.getScore()) : null;
        }
        hVar.S2(action != null ? action.getTitle() : null, fValueOf);
        if (action != null && (deepLink = action.getDeepLink()) != null) {
            hVar.Y70(new d(this, deepLink));
        }
        DeliveryRestrictionCard deliveryRestrictionCard = infoCardItem.f224425p;
        if (deliveryRestrictionCard != null) {
            hVar.zP(deliveryRestrictionCard, new e(this));
            this.f225143c.c(new C43931a());
            g03 = G0.f406611a;
        }
        if (g03 == null) {
            hVar.o60();
        }
        hVar.R50(passportCardItem.f224462e);
    }
}
