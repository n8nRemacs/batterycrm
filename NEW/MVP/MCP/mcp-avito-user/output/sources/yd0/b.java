package YD0;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.tariff_select.deeplink.TariffSelectDeepLink;
import com.avito.android.tariff_select.f;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TariffSelectDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LYD0/b;", "Lev/b;", "Lcom/avito/android/tariff_select/deeplink/TariffSelectDeepLink;", "_avito_tariff-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b extends AbstractC40162b<TariffSelectDeepLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f19381d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final f f19382e;

    @Inject
    public b(@k a.InterfaceC4053a interfaceC4053a, @k f fVar) {
        this.f19381d = interfaceC4053a;
        this.f19382e = fVar;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        this.f19381d.R(this.f19382e.a(((TariffSelectDeepLink) deepLink).f301179b), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
