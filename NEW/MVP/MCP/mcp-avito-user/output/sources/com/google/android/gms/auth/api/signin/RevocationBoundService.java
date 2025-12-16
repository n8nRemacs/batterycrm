package com.google.android.gms.auth.api.signin;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.auth.api.signin.internal.w;
import j.N;
import j.P;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
@Deprecated
/* loaded from: classes6.dex */
public final class RevocationBoundService extends Service {
    @Override // android.app.Service
    @P
    public final IBinder onBind(@N Intent intent) {
        if (!"com.google.android.gms.auth.api.signin.RevocationBoundService.disconnect".equals(intent.getAction()) && !"com.google.android.gms.auth.api.signin.RevocationBoundService.clearClientState".equals(intent.getAction())) {
            "Unknown action sent to RevocationBoundService: ".concat(String.valueOf(intent.getAction()));
            return null;
        }
        if (Log.isLoggable("RevocationService", 2)) {
            "RevocationBoundService handling ".concat(String.valueOf(intent.getAction()));
        }
        return new w(this);
    }
}
