package N50;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.passport.deeplinks.PassportDuplicationFinishLink;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PassportDuplicationFinishLinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LN50/a;", "Lev/b;", "Lcom/avito/android/passport/deeplinks/PassportDuplicationFinishLink;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a extends AbstractC40162b<PassportDuplicationFinishLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final E50.a f11201d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f11202e;

    @Inject
    public a(@k E50.a aVar, @k a.InterfaceC4053a interfaceC4053a) {
        this.f11201d = aVar;
        this.f11202e = interfaceC4053a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        this.f11202e.R(this.f11201d.i(), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
