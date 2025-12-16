package com.avito.android.authorization.auto_recovery.recovery_availability;

import Zd.InterfaceC19542a;
import android.content.Intent;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.authorization.AuthSource;
import he.C40920c;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: RecoveryAvailabilityFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class e extends H implements Y41.a<G0> {
    @Override // Y41.a
    public final G0 invoke() {
        RecoveryAvailabilityFragment recoveryAvailabilityFragment = (RecoveryAvailabilityFragment) this.receiver;
        InterfaceC28373a interfaceC28373a = recoveryAvailabilityFragment.f93275q0;
        if (interfaceC28373a == null) {
            interfaceC28373a = null;
        }
        interfaceC28373a.c(new C40920c());
        InterfaceC19542a interfaceC19542a = recoveryAvailabilityFragment.f93272n0;
        Intent intentA = (interfaceC19542a != null ? interfaceC19542a : null).a(AuthSource.f92688W);
        intentA.setFlags(603979776);
        recoveryAvailabilityFragment.startActivity(intentA);
        return G0.f406611a;
    }
}
