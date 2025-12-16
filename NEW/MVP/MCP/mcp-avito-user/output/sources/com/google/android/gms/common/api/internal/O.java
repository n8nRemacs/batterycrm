package com.google.android.gms.common.api.internal;

import android.app.NotificationManager;
import android.content.Context;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import com.google.android.gms.common.C36688g;
import com.google.android.gms.common.C36690i;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
final class O implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C36626b0 f349040b;

    public O(C36626b0 c36626b0) {
        this.f349040b = c36626b0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C36626b0 c36626b0 = this.f349040b;
        C36688g c36688g = c36626b0.f349080d;
        Context context = c36626b0.f349079c;
        c36688g.getClass();
        if (C36690i.f349291a.getAndSet(true)) {
            return;
        }
        try {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationsSettings.Section.SECTION_PAID_SERVICES);
            if (notificationManager != null) {
                notificationManager.cancel(10436);
            }
        } catch (SecurityException unused) {
        }
    }
}
