package com.google.android.play.core.appupdate;

import android.os.Bundle;
import com.google.android.gms.tasks.C37028k;
import com.google.android.play.core.install.InstallException;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes6.dex */
final class u extends t {
    @Override // com.google.android.play.core.appupdate.t, com.google.android.play.core.appupdate.internal.n
    public final void l(Bundle bundle) {
        super.l(bundle);
        int i12 = bundle.getInt("error.code", -2);
        C37028k c37028k = this.f358075b;
        if (i12 != 0) {
            c37028k.c(new InstallException(bundle.getInt("error.code", -2)));
        } else {
            c37028k.d(null);
        }
    }
}
