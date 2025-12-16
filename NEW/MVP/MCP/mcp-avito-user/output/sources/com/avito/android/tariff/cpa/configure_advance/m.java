package com.avito.android.tariff.cpa.configure_advance;

import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.tariff.cpa.configure_advance.deeplink.ConfigureAdvanceLink;
import kotlin.Metadata;

/* compiled from: ConfigureAdvanceFragmentFactory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/tariff/cpa/configure_advance/m;", "LA50/b;", "Lcom/avito/android/tariff/cpa/configure_advance/deeplink/ConfigureAdvanceLink;", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class m implements A50.b<ConfigureAdvanceLink> {
    @Override // A50.b
    public final Fragment a(DeepLink deepLink) {
        ConfigureAdvanceFragment.f294241y0.getClass();
        ConfigureAdvanceFragment configureAdvanceFragment = new ConfigureAdvanceFragment();
        Bundle bundle = new Bundle();
        bundle.putString("configureContext", ((ConfigureAdvanceLink) deepLink).f294261b);
        configureAdvanceFragment.setArguments(bundle);
        return configureAdvanceFragment;
    }
}
