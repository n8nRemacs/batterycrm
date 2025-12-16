package com.avito.android.mortgage.verification_flow;

import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: VerificationFlowFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class e extends H implements Y41.l<DeepLink, G0> {
    @Override // Y41.l
    public final G0 invoke(DeepLink deepLink) {
        DeepLink deepLink2 = deepLink;
        com.avito.android.deeplink_handler.handler.composite.a aVar = ((VerificationFlowFragment) this.receiver).f203851r0;
        if (aVar == null) {
            aVar = null;
        }
        com.avito.android.deeplink_handler.handler.composite.b.a(aVar, deepLink2);
        return G0.f406611a;
    }
}
