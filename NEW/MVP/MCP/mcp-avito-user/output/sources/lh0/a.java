package LH0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.rating_ui.RatingItemsMarginHorizontal;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MyAdvertReviewsScoreItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LLH0/a;", "Lcom/avito/android/rating_ui/badge_score/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.android.rating_ui.badge_score.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f9890b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Float f9891c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f9892d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f9893e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final DeepLink f9894f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final RatingItemsMarginHorizontal f9895g;

    public a(String str, Float f12, String str2, String str3, DeepLink deepLink, RatingItemsMarginHorizontal ratingItemsMarginHorizontal, int i12, C42822w c42822w) {
        deepLink = (i12 & 16) != 0 ? null : deepLink;
        ratingItemsMarginHorizontal = (i12 & 32) != 0 ? RatingItemsMarginHorizontal.MarginNormal.f249854b : ratingItemsMarginHorizontal;
        this.f9890b = str;
        this.f9891c = f12;
        this.f9892d = str2;
        this.f9893e = str3;
        this.f9894f = deepLink;
        this.f9895g = ratingItemsMarginHorizontal;
    }

    @Override // com.avito.android.rating_ui.badge_score.a
    @l
    /* renamed from: A, reason: from getter */
    public final Float getF9891c() {
        return this.f9891c;
    }

    @Override // com.avito.android.rating_ui.badge_score.a
    @k
    /* renamed from: c, reason: from getter */
    public final RatingItemsMarginHorizontal getF9895g() {
        return this.f9895g;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f9890b, aVar.f9890b) && L.f(this.f9891c, aVar.f9891c) && L.f(this.f9892d, aVar.f9892d) && L.f(this.f9893e, aVar.f9893e) && L.f(this.f9894f, aVar.f9894f) && L.f(this.f9895g, aVar.f9895g);
    }

    @Override // com.avito.android.rating_ui.badge_score.a
    @l
    /* renamed from: getDeeplink, reason: from getter */
    public final DeepLink getF9894f() {
        return this.f9894f;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85003b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF9890b() {
        return this.f9890b;
    }

    public final int hashCode() {
        int iHashCode = this.f9890b.hashCode() * 31;
        Float f12 = this.f9891c;
        int iD2 = H.d(H.d((iHashCode + (f12 == null ? 0 : f12.hashCode())) * 31, 31, this.f9892d), 31, this.f9893e);
        DeepLink deepLink = this.f9894f;
        return this.f9895g.hashCode() + ((iD2 + (deepLink != null ? deepLink.hashCode() : 0)) * 31);
    }

    @Override // com.avito.android.rating_ui.badge_score.a
    @k
    /* renamed from: s0, reason: from getter */
    public final String getF9892d() {
        return this.f9892d;
    }

    @k
    public final String toString() {
        return "MyAdvertReviewsScoreItem(stringId=" + this.f9890b + ", scoreValue=" + this.f9891c + ", scoreText=" + this.f9892d + ", caption=" + this.f9893e + ", deeplink=" + this.f9894f + ", marginHorizontal=" + this.f9895g + ')';
    }

    @Override // com.avito.android.rating_ui.badge_score.a
    @k
    /* renamed from: w1, reason: from getter */
    public final String getF9893e() {
        return this.f9893e;
    }
}
