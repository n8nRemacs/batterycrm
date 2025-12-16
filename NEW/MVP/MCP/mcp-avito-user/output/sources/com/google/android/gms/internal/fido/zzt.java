package com.google.android.gms.internal.fido;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import com.google.android.gms.fido.u2f.b;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
public final class zzt implements b {

    /* renamed from: a, reason: collision with root package name */
    public final PendingIntent f350437a;

    public zzt(PendingIntent pendingIntent) {
        this.f350437a = pendingIntent;
    }

    public final boolean hasPendingIntent() {
        return this.f350437a != null;
    }

    public final void launchPendingIntent(Activity activity, int i12) throws IntentSender.SendIntentException {
        PendingIntent pendingIntent = this.f350437a;
        if (pendingIntent == null) {
            throw new IllegalStateException("No PendingIntent available");
        }
        activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i12, null, 0, 0, 0);
    }
}
