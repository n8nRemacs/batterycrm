package com.avito.android.advert.badge_details;

import com.avito.android.remote.model.advert_badge_bar.BadgeDetailsResponse;
import com.avito.android.util.D6;
import com.avito.android.util.P2;
import kotlin.Metadata;

/* compiled from: BadgeDetailsPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/remote/model/advert_badge_bar/BadgeDetailsResponse;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class i<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f68780b;

    public i(k kVar) {
        this.f68780b = kVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        BadgeDetailsActivity badgeDetailsActivity;
        P2 p22 = (P2) obj;
        k kVar = this.f68780b;
        kVar.getClass();
        if (p22 instanceof P2.c) {
            s sVar = kVar.f68792k;
            if (sVar != null) {
                D6.H(sVar.f68816d);
                return;
            }
            return;
        }
        if (p22 instanceof P2.b) {
            BadgeDetailsResponse badgeDetailsResponse = (BadgeDetailsResponse) ((P2.b) p22).f318720a;
            kVar.f68794m = badgeDetailsResponse;
            kVar.c(badgeDetailsResponse);
        } else {
            if (!(p22 instanceof P2.a) || (badgeDetailsActivity = kVar.f68793l) == null) {
                return;
            }
            badgeDetailsActivity.a2(kVar.f68787f.getF68809a());
        }
    }
}
