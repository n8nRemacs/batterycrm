package com.avito.android.beduin.common.component.bar_chart;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import com.avito.android.beduin.common.component.bar_chart.column.BarChartColumnItem;
import com.google.android.gms.tasks.C37028k;
import java.util.Iterator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f100708b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f100709c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f100710d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f100711e;

    public /* synthetic */ c(Context context, boolean z12, C37028k c37028k) {
        this.f100710d = context;
        this.f100709c = z12;
        this.f100711e = c37028k;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f100708b) {
            case 0:
                Iterator<BarChartColumnItem> it = ((d) this.f100710d).f100732e.getColumns().iterator();
                int i12 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i12 = -1;
                    } else if (!it.next().isSelected()) {
                        i12++;
                    }
                }
                Integer numValueOf = Integer.valueOf(i12);
                if (i12 < 0) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    ((p) this.f100711e).a(numValueOf.intValue(), this.f100709c);
                    return;
                }
                return;
            default:
                Context context = (Context) this.f100710d;
                C37028k c37028k = (C37028k) this.f100711e;
                try {
                    if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext == null) {
                            applicationContext = context;
                        }
                        SharedPreferences.Editor editorEdit = applicationContext.getSharedPreferences("com.google.firebase.messaging", 0).edit();
                        editorEdit.putBoolean("proxy_notification_initialized", true);
                        editorEdit.apply();
                        NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                        if (this.f100709c) {
                            notificationManager.setNotificationDelegate("com.google.android.gms");
                        } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                            notificationManager.setNotificationDelegate(null);
                        }
                    } else {
                        context.getPackageName();
                    }
                    c37028k.d(null);
                    return;
                } catch (Throwable th2) {
                    c37028k.d(null);
                    throw th2;
                }
        }
    }

    public /* synthetic */ c(d dVar, p pVar, boolean z12) {
        this.f100710d = dVar;
        this.f100711e = pVar;
        this.f100709c = z12;
    }
}
