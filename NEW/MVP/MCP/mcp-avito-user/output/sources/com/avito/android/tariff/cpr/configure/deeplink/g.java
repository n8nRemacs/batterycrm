package com.avito.android.tariff.cpr.configure.deeplink;

import Ku.AbstractC14350a;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.google.gson.Gson;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TariffCprConfigureAdvanceManualLinkParser.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/tariff/cpr/configure/deeplink/g;", "LKu/a;", "Lcom/avito/android/tariff/cpr/configure/deeplink/TariffCprConfigureAdvanceManualLink;", "<init>", "()V", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g extends AbstractC14350a<TariffCprConfigureAdvanceManualLink> {
    @Inject
    public g() {
    }

    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        return new TariffCprConfigureAdvanceManualLink(Ku.i.p(uri, "context"));
    }
}
