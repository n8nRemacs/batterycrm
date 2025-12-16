package com.google.android.play.core.assetpacks;

import android.R;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import com.google.android.play.core.assetpacks.internal.C37139i;
import java.util.Arrays;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* loaded from: classes6.dex */
final class I extends com.google.android.play.core.assetpacks.internal.z {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.play.core.assetpacks.internal.F f358140a = new com.google.android.play.core.assetpacks.internal.F("AssetPackExtractionService");

    /* renamed from: b, reason: collision with root package name */
    public final Context f358141b;

    /* renamed from: p, reason: collision with root package name */
    public final Q f358142p;

    /* renamed from: q, reason: collision with root package name */
    public final N1 f358143q;

    /* renamed from: r, reason: collision with root package name */
    public final ServiceConnectionC37178t0 f358144r;

    /* renamed from: s, reason: collision with root package name */
    @j.k0
    public final NotificationManager f358145s;

    public I(Context context, Q q12, N1 n12, ServiceConnectionC37178t0 serviceConnectionC37178t0) {
        this.f358141b = context;
        this.f358142p = q12;
        this.f358143q = n12;
        this.f358144r = serviceConnectionC37178t0;
        this.f358145s = (NotificationManager) context.getSystemService(NotificationsSettings.Section.SECTION_PAID_SERVICES);
    }

    @Override // com.google.android.play.core.assetpacks.internal.A
    public final void C0(com.google.android.play.core.assetpacks.internal.B b12) {
        String[] packagesForUid;
        this.f358140a.a("clearAssetPackStorage AIDL call", new Object[0]);
        Context context = this.f358141b;
        if (!C37139i.a(context) || (packagesForUid = context.getPackageManager().getPackagesForUid(Binder.getCallingUid())) == null || !Arrays.asList(packagesForUid).contains("com.android.vending")) {
            b12.M2(new Bundle());
            return;
        }
        Q.h(this.f358142p.e());
        Bundle bundle = new Bundle();
        Parcel parcelE4 = b12.e4();
        int i12 = com.google.android.play.core.assetpacks.internal.t.f358383a;
        parcelE4.writeInt(1);
        bundle.writeToParcel(parcelE4, 0);
        b12.f4(parcelE4, 4);
    }

    @Override // com.google.android.play.core.assetpacks.internal.A
    public final void s2(Bundle bundle, com.google.android.play.core.assetpacks.internal.B b12) {
        synchronized (this) {
            try {
                this.f358140a.a("updateServiceState AIDL call", new Object[0]);
            } catch (Throwable th2) {
                throw th2;
            }
            if (C37139i.a(this.f358141b)) {
                String[] packagesForUid = this.f358141b.getPackageManager().getPackagesForUid(Binder.getCallingUid());
                if (packagesForUid != null && Arrays.asList(packagesForUid).contains("com.android.vending")) {
                    int i12 = bundle.getInt("action_type");
                    ServiceConnectionC37178t0 serviceConnectionC37178t0 = this.f358144r;
                    synchronized (serviceConnectionC37178t0.f358502c) {
                        serviceConnectionC37178t0.f358502c.add(b12);
                    }
                    if (i12 != 1) {
                        if (i12 != 2) {
                            this.f358140a.b("Unknown action type received: %d", Integer.valueOf(i12));
                            b12.M2(new Bundle());
                            return;
                        }
                        this.f358143q.a(false);
                        ServiceConnectionC37178t0 serviceConnectionC37178t02 = this.f358144r;
                        serviceConnectionC37178t02.f358501b.a("Stopping foreground installation service.", new Object[0]);
                        serviceConnectionC37178t02.f358503d.unbindService(serviceConnectionC37178t02);
                        ExtractionForegroundService extractionForegroundService = serviceConnectionC37178t02.f358504e;
                        if (extractionForegroundService != null) {
                            synchronized (extractionForegroundService) {
                                extractionForegroundService.stopForeground(true);
                                extractionForegroundService.stopSelf();
                            }
                        }
                        serviceConnectionC37178t02.a();
                        return;
                    }
                    String string = bundle.getString("notification_channel_name");
                    synchronized (this) {
                        if (string == null) {
                            string = "File downloads by Play";
                        }
                        try {
                            this.f358145s.createNotificationChannel(new NotificationChannel("playcore-assetpacks-service-notification-channel", string, 2));
                            this.f358143q.a(true);
                            ServiceConnectionC37178t0 serviceConnectionC37178t03 = this.f358144r;
                            String string2 = bundle.getString("notification_title");
                            String string3 = bundle.getString("notification_subtext");
                            long j12 = bundle.getLong("notification_timeout", 600000L);
                            Parcelable parcelable = bundle.getParcelable("notification_on_click_intent");
                            Notification.Builder timeoutAfter = new Notification.Builder(this.f358141b, "playcore-assetpacks-service-notification-channel").setTimeoutAfter(j12);
                            if (parcelable instanceof PendingIntent) {
                                timeoutAfter.setContentIntent((PendingIntent) parcelable);
                            }
                            Notification.Builder ongoing = timeoutAfter.setSmallIcon(R.drawable.stat_sys_download).setOngoing(false);
                            if (string2 == null) {
                                string2 = "Downloading additional file";
                            }
                            Notification.Builder contentTitle = ongoing.setContentTitle(string2);
                            if (string3 == null) {
                                string3 = "Transferring";
                            }
                            contentTitle.setSubText(string3);
                            int i13 = bundle.getInt("notification_color");
                            if (i13 != 0) {
                                timeoutAfter.setColor(i13).setVisibility(-1);
                            }
                            serviceConnectionC37178t03.f358505f = timeoutAfter.build();
                            this.f358141b.bindService(new Intent(this.f358141b, (Class<?>) ExtractionForegroundService.class), this.f358144r, 1);
                        } finally {
                        }
                    }
                    return;
                    throw th2;
                }
            }
            b12.M2(new Bundle());
        }
    }
}
