package nB0;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.tariff.cpx.configure.advance_manual.CpxConfigureAdvanceManualFragment;
import com.avito.android.tariff.cpx.configure.advance_manual.deeplink.TariffCpxConfigureAdvanceManualDeepLink;
import com.avito.android.tariff.remote.model.cpx.CpxConfigureAdvanceManualResult;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CpxConfigureAdvanceManualDeeplinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LnB0/d;", "Lev/b;", "Lcom/avito/android/tariff/cpx/configure/advance_manual/deeplink/TariffCpxConfigureAdvanceManualDeepLink;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d extends AbstractC40162b<TariffCpxConfigureAdvanceManualDeepLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a.d f414918d;

    @Inject
    public d(@k a.d dVar) {
        this.f414918d = dVar;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        CpxConfigureAdvanceManualFragment.a aVar = CpxConfigureAdvanceManualFragment.f295770u0;
        CpxConfigureAdvanceManualResult cpxConfigureAdvanceManualResult = ((TariffCpxConfigureAdvanceManualDeepLink) deepLink).f295805b;
        aVar.getClass();
        this.f414918d.w1(CpxConfigureAdvanceManualFragment.a.a(cpxConfigureAdvanceManualResult), "CpxConfigureAdvanceManualFragment");
        return AbstractC14250d.c.f9171c;
    }
}
