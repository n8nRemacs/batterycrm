package zg0;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import com.avito.android.analytics_ratings_reviews.ReviewsOpenPageFrom;
import com.avito.android.deep_linking.UserRatingDetailsLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.rating.f;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: UserRatingDetailsLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lzg0/a;", "Lev/b;", "Lcom/avito/android/deep_linking/UserRatingDetailsLink;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: zg0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C50563a extends AbstractC40162b<UserRatingDetailsLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final f f444162d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f444163e;

    @Inject
    public C50563a(@k a.InterfaceC4053a interfaceC4053a, @k f fVar) {
        this.f444162d = fVar;
        this.f444163e = interfaceC4053a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        ReviewsOpenPageFrom.f91254c.getClass();
        this.f444163e.R(this.f444162d.c(((UserRatingDetailsLink) deepLink).f132877b, ReviewsOpenPageFrom.a.a(bundle)), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
