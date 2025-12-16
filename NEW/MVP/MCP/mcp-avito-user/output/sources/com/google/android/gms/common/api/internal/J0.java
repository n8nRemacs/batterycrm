package com.google.android.gms.common.api.internal;

import android.app.Activity;
import com.google.android.gms.common.C36688g;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.CancellationException;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
public final class J0 extends w1 {
    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void f() {
        new CancellationException("Host activity was destroyed before Google Play services could be made available.");
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.w1
    public final void k(ConnectionResult connectionResult, int i12) {
        String str = connectionResult.f348862e;
        if (str == null) {
            str = "Error connecting to Google Play services";
        }
        new ApiException(new Status(connectionResult.f348860c, str, connectionResult.f348861d, connectionResult));
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.common.api.internal.m, java.lang.Object] */
    @Override // com.google.android.gms.common.api.internal.w1
    public final void l() {
        Activity activityL1 = this.f349033b.l1();
        if (activityL1 == null) {
            new ApiException(new Status(8, null, null, null));
            throw null;
        }
        if (this.f349248f.c(C36688g.f349288a, activityL1) != 0) {
            throw null;
        }
        throw null;
    }
}
