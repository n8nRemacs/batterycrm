package u20;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.motivation_screen.MotivationDeeplink;
import com.avito.android.motivation_screen.ui.s;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MotivationDeeplinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lu20/a;", "Lev/b;", "Lcom/avito/android/motivation_screen/MotivationDeeplink;", "_avito_gig_motivation-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: u20.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C48769a extends AbstractC40162b<MotivationDeeplink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f439728d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final s f439729e;

    @Inject
    public C48769a(@k a.InterfaceC4053a interfaceC4053a, @k s sVar) {
        this.f439728d = interfaceC4053a;
        this.f439729e = sVar;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        this.f439728d.R(this.f439729e.a(((MotivationDeeplink) deepLink).f206288b), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
