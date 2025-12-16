package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
public final class r1 extends w1 {
    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.w1, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void i() {
        this.f349245c = true;
        if (this.f349246d.get() == null) {
            throw null;
        }
    }

    @Override // com.google.android.gms.common.api.internal.w1, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void j() {
        this.f349245c = false;
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.w1
    public final void k(ConnectionResult connectionResult, int i12) {
        if (i12 >= 0) {
            throw null;
        }
        Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
    }

    @Override // com.google.android.gms.common.api.internal.w1
    public final void l() {
        throw null;
    }

    @j.P
    public final q1 m(int i12) {
        throw null;
    }
}
