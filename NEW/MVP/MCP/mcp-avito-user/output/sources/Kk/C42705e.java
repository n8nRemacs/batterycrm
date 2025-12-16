package kk;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.PlayerLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.player.PlayerAnalyticsParameters;
import com.avito.android.rec.ScreenSource;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PlayerLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkk/e;", "Lev/b;", "Lcom/avito/android/deep_linking/links/PlayerLink;", "_avito_player_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kk.e, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C42705e extends AbstractC40162b<PlayerLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f406572d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.player.router.d f406573e;

    @Inject
    public C42705e(@k a.InterfaceC4053a interfaceC4053a, @k com.avito.android.player.router.d dVar) {
        this.f406572d = interfaceC4053a;
        this.f406573e = dVar;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        PlayerLink playerLink = (PlayerLink) deepLink;
        ScreenSource.a aVar = ScreenSource.f251772c;
        String str2 = playerLink.f133585f;
        aVar.getClass();
        ScreenSource screenSourceA = ScreenSource.a.a(str2);
        String str3 = playerLink.f133587h;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = playerLink.f133583d;
        this.f406572d.R(this.f406573e.a(playerLink.f133581b, playerLink.f133582c, str4, playerLink.f133584e, screenSourceA, (80 & 128) != 0 ? null : 0, new PlayerAnalyticsParameters(str3, str4 != null ? str4 : "", playerLink.f133586g)), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
