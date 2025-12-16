package com.google.android.gms.internal.fido;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import com.google.android.gms.fido.fido2.b;
import j.P;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@Deprecated
/* loaded from: classes6.dex */
public final class zzi implements b {

    /* renamed from: a, reason: collision with root package name */
    @P
    public final PendingIntent f350434a;

    public zzi(@P PendingIntent pendingIntent) {
        this.f350434a = pendingIntent;
    }

    public final boolean hasPendingIntent() {
        return this.f350434a != null;
    }

    public final void launchPendingIntent(Activity activity, int i12) throws IntentSender.SendIntentException {
        PendingIntent pendingIntent = this.f350434a;
        if (pendingIntent == null) {
            throw new IllegalStateException("No PendingIntent available");
        }
        activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i12, null, 0, 0, 0);
    }
}
