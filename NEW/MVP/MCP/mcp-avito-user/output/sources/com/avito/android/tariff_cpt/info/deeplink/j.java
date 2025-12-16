package com.avito.android.tariff_cpt.info.deeplink;

import Ju.InterfaceC14249c;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.tariff_cpt.info.deeplink.TariffCptInfoRefreshLink;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TariffCptInfoRefreshDeeplinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/tariff_cpt/info/deeplink/j;", "Lev/b;", "Lcom/avito/android/tariff_cpt/info/deeplink/TariffCptInfoRefreshLink;", "<init>", "()V", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j extends AbstractC40162b<TariffCptInfoRefreshLink> {
    @Inject
    public j() {
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        TariffCptInfoRefreshLink tariffCptInfoRefreshLink = (TariffCptInfoRefreshLink) deepLink;
        return new TariffCptInfoRefreshLink.b.a(tariffCptInfoRefreshLink.f298144b, tariffCptInfoRefreshLink.f298145c);
    }
}
