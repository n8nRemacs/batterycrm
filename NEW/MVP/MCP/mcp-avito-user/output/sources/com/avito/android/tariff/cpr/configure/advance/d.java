package com.avito.android.tariff.cpr.configure.advance;

import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.tariff.cpr.configure.advance.CprConfigureAdvanceFragment;
import com.avito.android.tariff.cpr.configure.deeplink.TariffCprConfigureAdvanceLink;
import kotlin.Metadata;

/* compiled from: CprConfigureAdvanceFragmentFactory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/tariff/cpr/configure/advance/d;", "LA50/b;", "Lcom/avito/android/tariff/cpr/configure/deeplink/TariffCprConfigureAdvanceLink;", "<init>", "()V", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d implements A50.b<TariffCprConfigureAdvanceLink> {
    @Override // A50.b
    public final Fragment a(DeepLink deepLink) {
        CprConfigureAdvanceFragment.a aVar = CprConfigureAdvanceFragment.f295152C0;
        String configureContext = ((TariffCprConfigureAdvanceLink) deepLink).getConfigureContext();
        aVar.getClass();
        CprConfigureAdvanceFragment cprConfigureAdvanceFragment = new CprConfigureAdvanceFragment();
        Bundle bundle = new Bundle();
        bundle.putString("configure_context", configureContext);
        cprConfigureAdvanceFragment.setArguments(bundle);
        return cprConfigureAdvanceFragment;
    }
}
