package YW;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.loyalty.links.reputation_unavailable.ReputationUnavailableLink;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ReputationUnavailableLinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LYW/a;", "Lev/b;", "Lcom/avito/android/loyalty/links/reputation_unavailable/ReputationUnavailableLink;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends AbstractC40162b<ReputationUnavailableLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final HW.a f19487d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f19488e;

    @Inject
    public a(@k HW.a aVar, @k a.InterfaceC4053a interfaceC4053a) {
        this.f19487d = aVar;
        this.f19488e = interfaceC4053a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        this.f19488e.R(this.f19487d.c(), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
