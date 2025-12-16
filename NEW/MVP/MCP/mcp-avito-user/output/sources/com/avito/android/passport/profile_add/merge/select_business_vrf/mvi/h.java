package com.avito.android.passport.profile_add.merge.select_business_vrf.mvi;

import com.avito.android.passport.deeplinks.PassportSelectBusinessVrfLink;
import com.avito.android.passport.profile_add.ProfileCreateExtendedFlow;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.L;
import kv.C43501a;

/* compiled from: SelectBusinessVrfBootstrap.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class h extends C42801a implements Y41.p<C43501a, Continuation<? super G0>, Object>, SuspendFunction {
    @Override // Y41.p
    public final Object invoke(C43501a c43501a, Continuation<? super G0> continuation) {
        i iVar = (i) this.receiver;
        iVar.getClass();
        if (L.f(c43501a.f413260a.f134521b, "REQ_KEY_DUPLICATION_FINISH") && iVar.f213462c.f213365b == PassportSelectBusinessVrfLink.Flow.f211126d) {
            iVar.f213463d.c(new M50.g(null, null, null, null, ProfileCreateExtendedFlow.Passport.Create.f211172d, null));
        }
        return G0.f406611a;
    }
}
