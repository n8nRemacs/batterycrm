package CB0;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.tariff.cpx.level.feature.TariffCpxLevelFeatureFragment;
import com.avito.android.tariff.cpx.level.feature.domain.TariffCpxLevelFeatureContent;
import com.avito.android.tariff.deeplink.TariffCpxLevelFeatureLink;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TariffCpxLevelFeatureHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LCB0/d;", "Lev/b;", "Lcom/avito/android/tariff/deeplink/TariffCpxLevelFeatureLink;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d extends AbstractC40162b<TariffCpxLevelFeatureLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a.d f2047d;

    @Inject
    public d(@k a.d dVar) {
        this.f2047d = dVar;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        TariffCpxLevelFeatureFragment.a aVar = TariffCpxLevelFeatureFragment.f296924q0;
        TariffCpxLevelFeatureContent tariffCpxLevelFeatureContent = new TariffCpxLevelFeatureContent(((TariffCpxLevelFeatureLink) deepLink).f297388b);
        aVar.getClass();
        TariffCpxLevelFeatureFragment tariffCpxLevelFeatureFragment = new TariffCpxLevelFeatureFragment();
        tariffCpxLevelFeatureFragment.f296931m0.setValue(tariffCpxLevelFeatureFragment, TariffCpxLevelFeatureFragment.f296925r0[0], tariffCpxLevelFeatureContent);
        this.f2047d.w1(tariffCpxLevelFeatureFragment, "TariffCpxLevelFeatureFragment");
        return AbstractC14250d.c.f9171c;
    }
}
