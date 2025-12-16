package com.avito.android.rating_ui.badge_score;

import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.rating_ui.RatingItemsMarginHorizontal;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RatingBadgeScoreItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_ui/badge_score/c;", "Lcom/avito/android/rating_ui/badge_score/a;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class c implements a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f249953b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Float f249954c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f249955d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f249956e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final DeepLink f249957f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final RatingItemsMarginHorizontal f249958g;

    public c(String str, Float f12, String str2, String str3, DeepLink deepLink, RatingItemsMarginHorizontal ratingItemsMarginHorizontal, int i12, C42822w c42822w) {
        deepLink = (i12 & 16) != 0 ? null : deepLink;
        ratingItemsMarginHorizontal = (i12 & 32) != 0 ? RatingItemsMarginHorizontal.MarginLarge.f249853b : ratingItemsMarginHorizontal;
        this.f249953b = str;
        this.f249954c = f12;
        this.f249955d = str2;
        this.f249956e = str3;
        this.f249957f = deepLink;
        this.f249958g = ratingItemsMarginHorizontal;
    }

    @Override // com.avito.android.rating_ui.badge_score.a
    @Y61.l
    /* renamed from: A, reason: from getter */
    public final Float getF9891c() {
        return this.f249954c;
    }

    @Override // com.avito.android.rating_ui.badge_score.a
    @Y61.k
    /* renamed from: c, reason: from getter */
    public final RatingItemsMarginHorizontal getF9895g() {
        return this.f249958g;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f249953b, cVar.f249953b) && L.f(this.f249954c, cVar.f249954c) && L.f(this.f249955d, cVar.f249955d) && L.f(this.f249956e, cVar.f249956e) && L.f(this.f249957f, cVar.f249957f) && L.f(this.f249958g, cVar.f249958g);
    }

    @Override // com.avito.android.rating_ui.badge_score.a
    @Y61.l
    /* renamed from: getDeeplink, reason: from getter */
    public final DeepLink getF9894f() {
        return this.f249957f;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85003b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF170076b() {
        return this.f249953b;
    }

    public final int hashCode() {
        int iHashCode = this.f249953b.hashCode() * 31;
        Float f12 = this.f249954c;
        int iD2 = H.d(H.d((iHashCode + (f12 == null ? 0 : f12.hashCode())) * 31, 31, this.f249955d), 31, this.f249956e);
        DeepLink deepLink = this.f249957f;
        return this.f249958g.hashCode() + ((iD2 + (deepLink != null ? deepLink.hashCode() : 0)) * 31);
    }

    @Override // com.avito.android.rating_ui.badge_score.a
    @Y61.k
    /* renamed from: s0, reason: from getter */
    public final String getF9892d() {
        return this.f249955d;
    }

    @Y61.k
    public final String toString() {
        return "RatingBadgeScoreItem(stringId=" + this.f249953b + ", scoreValue=" + this.f249954c + ", scoreText=" + this.f249955d + ", caption=" + this.f249956e + ", deeplink=" + this.f249957f + ", marginHorizontal=" + this.f249958g + ')';
    }

    @Override // com.avito.android.rating_ui.badge_score.a
    @Y61.k
    /* renamed from: w1, reason: from getter */
    public final String getF9893e() {
        return this.f249956e;
    }
}
