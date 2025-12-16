package MJ0;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import aK0.InterfaceC19783a;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.user_stats.deeplink.UserStatsLink;
import ev.AbstractC40162b;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: UserStatsLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LMJ0/a;", "Lev/b;", "Lcom/avito/android/user_stats/deeplink/UserStatsLink;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a extends AbstractC40162b<UserStatsLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC19783a f10586d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f10587e;

    @Inject
    public a(@k InterfaceC19783a interfaceC19783a, @k a.InterfaceC4053a interfaceC4053a) {
        this.f10586d = interfaceC19783a;
        this.f10587e = interfaceC4053a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        UserStatsLink userStatsLink = (UserStatsLink) deepLink;
        List<String> listM0 = C42745f0.M0(userStatsLink.f316995g);
        List<String> listM02 = C42745f0.M0(userStatsLink.f316996h);
        this.f10587e.R(this.f10586d.a(userStatsLink.f316990b, userStatsLink.f316991c, userStatsLink.f316992d, userStatsLink.f316993e, userStatsLink.f316994f, listM0, listM02), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
