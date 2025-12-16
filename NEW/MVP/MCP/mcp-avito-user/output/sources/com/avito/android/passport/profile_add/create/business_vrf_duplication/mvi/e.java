package com.avito.android.passport.profile_add.create.business_vrf_duplication.mvi;

import Ju.InterfaceC14249c;
import Y41.p;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.O;
import com.avito.android.passport.profile_add.ProfileCreateExtendedFlow;
import com.avito.android.passport.profile_add.analytics.AnalyticScreen;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.L;
import kv.C43501a;

/* compiled from: BusinessVrfDuplicationProfileCreationBootstrap.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class e extends C42801a implements p<C43501a, Continuation<? super G0>, Object>, SuspendFunction {
    @Override // Y41.p
    public final Object invoke(C43501a c43501a, Continuation<? super G0> continuation) {
        C43501a c43501a2 = c43501a;
        f fVar = (f) this.receiver;
        fVar.getClass();
        if (L.f(c43501a2.f413260a.f134521b, "passport.profile_add.create.business_vrf_duplication.start_verification")) {
            O.d dVar = O.d.f133520b;
            InterfaceC14249c interfaceC14249c = c43501a2.f413261b;
            boolean zF2 = L.f(interfaceC14249c, dVar);
            InterfaceC28373a interfaceC28373a = fVar.f211249d;
            if (zF2) {
                interfaceC28373a.c(new M50.j(null, null, null, null, AnalyticScreen.f211214g, ProfileCreateExtendedFlow.Passport.Create.f211172d, null));
            } else if (L.f(interfaceC14249c, O.b.f133518b)) {
                interfaceC28373a.c(new M50.g(null, null, null, null, ProfileCreateExtendedFlow.Passport.Create.f211172d, null));
            }
        }
        return G0.f406611a;
    }
}
