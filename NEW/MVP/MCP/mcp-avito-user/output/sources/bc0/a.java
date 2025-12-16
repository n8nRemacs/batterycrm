package BC0;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.tariff_cpt.level_feature.TariffCptLevelFeatureFragment;
import com.avito.android.tariff_cpt.level_feature.deeplink.TariffCptLevelFeatureLink;
import com.avito.android.tariff_cpt.level_feature.domain.TariffCptLevelFeatureContent;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TariffCptLevelFeatureDeeplinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LBC0/a;", "Lev/b;", "Lcom/avito/android/tariff_cpt/level_feature/deeplink/TariffCptLevelFeatureLink;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a extends AbstractC40162b<TariffCptLevelFeatureLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a.d f1244d;

    @Inject
    public a(@k a.d dVar) {
        this.f1244d = dVar;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        TariffCptLevelFeatureFragment.a aVar = TariffCptLevelFeatureFragment.f298421r0;
        TariffCptLevelFeatureContent tariffCptLevelFeatureContent = new TariffCptLevelFeatureContent(((TariffCptLevelFeatureLink) deepLink).f298450b);
        aVar.getClass();
        TariffCptLevelFeatureFragment tariffCptLevelFeatureFragment = new TariffCptLevelFeatureFragment();
        tariffCptLevelFeatureFragment.f298429n0.setValue(tariffCptLevelFeatureFragment, TariffCptLevelFeatureFragment.f298422s0[0], tariffCptLevelFeatureContent);
        this.f1244d.w1(tariffCptLevelFeatureFragment, "TariffCptLevelFeatureFragment");
        return AbstractC14250d.c.f9171c;
    }
}
