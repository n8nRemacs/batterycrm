package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.content.IntentSender;
import com.google.android.gms.common.api.r;
import com.google.android.gms.common.internal.C36729v;
import j.N;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes6.dex */
public abstract class p<R extends r> extends t<R> {
    @Override // com.google.android.gms.common.api.t
    @RX0.a
    public final void b(@N Status status) {
        PendingIntent pendingIntent = status.f348907d;
        if (pendingIntent == null) {
            d();
            return;
        }
        if (pendingIntent != null) {
            try {
                C36729v.j(pendingIntent);
                pendingIntent.getIntentSender();
                throw null;
            } catch (IntentSender.SendIntentException unused) {
                new Status(8, null, null, null);
                d();
            }
        }
    }

    public abstract void d();
}
