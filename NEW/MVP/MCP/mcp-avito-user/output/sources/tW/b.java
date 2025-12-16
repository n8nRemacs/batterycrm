package TW;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.loyalty.links.BadgeBarShowV3Link;
import com.avito.android.loyalty.ui.badge_details_v3.BadgeDetailsV3DialogFragment;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BadgeBarShowV3LinkSyncHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LTW/b;", "Lev/b;", "Lcom/avito/android/loyalty/links/BadgeBarShowV3Link;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b extends AbstractC40162b<BadgeBarShowV3Link> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a.d f15694d;

    @Inject
    public b(@k a.d dVar) {
        this.f15694d = dVar;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        BadgeBarShowV3Link badgeBarShowV3Link = (BadgeBarShowV3Link) deepLink;
        BadgeDetailsV3DialogFragment.a aVar = BadgeDetailsV3DialogFragment.f183265n0;
        RW.a.f14478a.getClass();
        String string = bundle != null ? bundle.getString("user_key") : null;
        String str2 = badgeBarShowV3Link.f183212b;
        aVar.getClass();
        this.f15694d.w1(BadgeDetailsV3DialogFragment.a.a(str2, string), "BadgeDetailsV3Dialog");
        return AbstractC14250d.c.f9171c;
    }
}
