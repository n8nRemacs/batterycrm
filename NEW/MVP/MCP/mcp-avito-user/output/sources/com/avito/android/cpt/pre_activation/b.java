package com.avito.android.cpt.pre_activation;

import Y41.p;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: PreActivationFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class b extends H implements p<DeepLink, Boolean, G0> {
    @Override // Y41.p
    public final G0 invoke(DeepLink deepLink, Boolean bool) {
        DeepLink deepLink2 = deepLink;
        boolean zBooleanValue = bool.booleanValue();
        PreActivationFragment preActivationFragment = (PreActivationFragment) this.receiver;
        com.avito.android.deeplink_handler.handler.composite.a aVar = preActivationFragment.f126671k0;
        Bundle bundle = null;
        if (aVar == null) {
            aVar = null;
        }
        String strC = zBooleanValue ? com.avito.android.mnz_common.extensions.d.c(preActivationFragment, "request_key") : null;
        if (zBooleanValue) {
            bundle = new Bundle();
            bundle.putBoolean("cpt_mass_activation_key_from_pre_activation", true);
            G0 g02 = G0.f406611a;
        }
        aVar.r6(bundle, deepLink2, strC);
        return G0.f406611a;
    }
}
