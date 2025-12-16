package com.avito.android.tariff.cpr.configure.deeplink;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.tariff.cpr.configure.advance.manual.CprConfigureAdvanceManualFragment;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TariffCprConfigureAdvanceManualHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpr/configure/deeplink/e;", "Lev/b;", "Lcom/avito/android/tariff/cpr/configure/deeplink/TariffCprConfigureAdvanceManualLink;", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e extends AbstractC40162b<TariffCprConfigureAdvanceManualLink> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final a.d f295504d;

    @Inject
    public e(@Y61.k a.d dVar) {
        this.f295504d = dVar;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        CprConfigureAdvanceManualFragment.a aVar = CprConfigureAdvanceManualFragment.f295324u0;
        String str2 = ((TariffCprConfigureAdvanceManualLink) deepLink).f295496b;
        aVar.getClass();
        this.f295504d.w1(CprConfigureAdvanceManualFragment.a.a(str2), "CprConfigureAdvanceManualDialog");
        return AbstractC14250d.c.f9171c;
    }
}
