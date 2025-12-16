package com.google.android.gms.auth.api.signin.internal;

import android.os.Binder;
import androidx.camera.camera2.internal.G;
import com.google.android.gms.auth.api.signin.RevocationBoundService;
import com.google.android.gms.common.util.C;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes6.dex */
public final class w extends r {

    /* renamed from: a, reason: collision with root package name */
    public final RevocationBoundService f348794a;

    public w(RevocationBoundService revocationBoundService) {
        this.f348794a = revocationBoundService;
    }

    public final void f4() {
        if (!C.a(Binder.getCallingUid(), this.f348794a)) {
            throw new SecurityException(G.e(Binder.getCallingUid(), "Calling UID ", " is not Google Play services."));
        }
    }
}
