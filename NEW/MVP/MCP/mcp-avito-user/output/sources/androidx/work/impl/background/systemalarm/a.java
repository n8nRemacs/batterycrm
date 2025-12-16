package androidx.work.impl.background.systemalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.RestrictTo;
import androidx.work.G;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.C23574p;
import androidx.work.impl.model.C23580w;
import androidx.work.impl.model.InterfaceC23575q;
import androidx.work.impl.utils.C23598h;
import j.N;

/* compiled from: Alarms.java */
@RestrictTo
/* loaded from: classes10.dex */
class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f55605a = 0;

    static {
        G.b("Alarms");
    }

    public static void a(@N Context context, @N C23580w c23580w, int i12) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i13 = b.f55606g;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        b.c(intent, c23580w);
        PendingIntent service = PendingIntent.getService(context, i12, intent, 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        G gA2 = G.a();
        c23580w.toString();
        gA2.getClass();
        alarmManager.cancel(service);
    }

    public static void b(@N Context context, @N WorkDatabase workDatabase, @N C23580w c23580w, long j12) {
        InterfaceC23575q interfaceC23575qX = workDatabase.x();
        C23574p c23574pF = interfaceC23575qX.f(c23580w);
        if (c23574pF != null) {
            int i12 = c23574pF.f55878c;
            a(context, c23580w, i12);
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            int i13 = b.f55606g;
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_DELAY_MET");
            b.c(intent, c23580w);
            PendingIntent service = PendingIntent.getService(context, i12, intent, 201326592);
            if (alarmManager != null) {
                alarmManager.setExact(0, j12, service);
                return;
            }
            return;
        }
        int iIntValue = ((Number) workDatabase.q(new VH0.c(new C23598h(workDatabase), 1))).intValue();
        interfaceC23575qX.a(new C23574p(c23580w.f55889a, c23580w.f55890b, iIntValue));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
        int i14 = b.f55606g;
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_DELAY_MET");
        b.c(intent2, c23580w);
        PendingIntent service2 = PendingIntent.getService(context, iIntValue, intent2, 201326592);
        if (alarmManager2 != null) {
            alarmManager2.setExact(0, j12, service2);
        }
    }
}
