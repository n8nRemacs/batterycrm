package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* loaded from: classes.dex */
public abstract class oc {
    public static final String a = cei.m("Alarms");

    public static void a(Context context, v4i v4iVar, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        String str = cg3.o;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        cg3.d(intent, v4iVar);
        PendingIntent service = PendingIntent.getService(context, i, intent, 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        cei.g().c(a, "Cancelling existing alarm with (workSpecId, systemId) (" + v4iVar + ", " + i + ")");
        alarmManager.cancel(service);
    }

    public static void b(Context context, WorkDatabase workDatabase, v4i v4iVar, long j) {
        ywf ywfVarU = workDatabase.u();
        xwf xwfVarO = ywfVarU.o(v4iVar);
        if (xwfVarO != null) {
            int i = xwfVarO.c;
            a(context, v4iVar, i);
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            String str = cg3.o;
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_DELAY_MET");
            cg3.d(intent, v4iVar);
            PendingIntent service = PendingIntent.getService(context, i, intent, 201326592);
            if (alarmManager != null) {
                nc.a(alarmManager, 0, j, service);
                return;
            }
            return;
        }
        int iIntValue = ((Number) workDatabase.o(new tv0(4, new qc7(workDatabase)))).intValue();
        ywfVarU.p(new xwf(v4iVar.a, v4iVar.b, iIntValue));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
        String str2 = cg3.o;
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_DELAY_MET");
        cg3.d(intent2, v4iVar);
        PendingIntent service2 = PendingIntent.getService(context, iIntValue, intent2, 201326592);
        if (alarmManager2 != null) {
            nc.a(alarmManager2, 0, j, service2);
        }
    }
}
