package com.avito.android.profile.user_profile.cards.info;

import Ua0.InterfaceC15503a;
import Y41.l;
import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.profile.user_profile.cards.CardItem;
import com.avito.android.remote.model.Avatar;
import com.avito.android.remote.model.ProfileRating;
import com.avito.android.remote.model.ProfileRatingAction;
import com.avito.android.remote.model.user_profile.Support;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;

/* compiled from: InfoCardItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/info/f;", "Lcom/avito/android/profile/user_profile/cards/info/c;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes16.dex */
public final class f implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC15503a, G0> f224996b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public f(@k l<? super InterfaceC15503a, G0> lVar) {
        this.f224996b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        Float fValueOf;
        DeepLink deepLink;
        h hVar = (h) eVar;
        CardItem.InfoCardItem infoCardItem = (CardItem.InfoCardItem) aVar;
        Avatar avatar = infoCardItem.f224413d;
        String alert = avatar != null ? avatar.getAlert() : null;
        String description = avatar != null ? avatar.getDescription() : null;
        hVar.jx();
        hVar.jm();
        if (alert != null && description != null) {
            hVar.lx(alert, description);
        } else if (description != null) {
            hVar.c00(description);
        }
        hVar.g40(avatar);
        hVar.J(infoCardItem.f224414e);
        Support support = infoCardItem.f224421l;
        if (support != null) {
            hVar.eB(support.getTitle(), support.getFormattedContactId());
        } else {
            hVar.B8();
        }
        hVar.SL(infoCardItem.f224417h);
        hVar.sC(infoCardItem.f224420k);
        hVar.bQ(infoCardItem.f224422m);
        hVar.zX(new d(this, infoCardItem));
        ProfileRating profileRating = infoCardItem.f224423n;
        ProfileRatingAction action = profileRating != null ? profileRating.getAction() : null;
        if (profileRating == null || (fValueOf = profileRating.getScoreFloat()) == null) {
            fValueOf = profileRating != null ? Float.valueOf(profileRating.getScore()) : null;
        }
        hVar.S2(action != null ? action.getTitle() : null, fValueOf);
        if (action == null || (deepLink = action.getDeepLink()) == null) {
            return;
        }
        hVar.Y70(new e(this, deepLink));
    }
}
