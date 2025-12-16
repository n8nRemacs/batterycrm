package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class cg3 implements ij5 {
    public static final String o = cei.m("CommandHandler");
    public final Context a;
    public final HashMap b = new HashMap();
    public final Object c = new Object();
    public final ssb d;

    public cg3(Context context, ssb ssbVar) {
        this.a = context;
        this.d = ssbVar;
    }

    public static v4i c(Intent intent) {
        return new v4i(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    public static void d(Intent intent, v4i v4iVar) {
        intent.putExtra("KEY_WORKSPEC_ID", v4iVar.a);
        intent.putExtra("KEY_WORKSPEC_GENERATION", v4iVar.b);
    }

    @Override // defpackage.ij5
    public final void a(v4i v4iVar, boolean z) {
        synchronized (this.c) {
            try {
                ps4 ps4Var = (ps4) this.b.remove(v4iVar);
                this.d.v(v4iVar);
                if (ps4Var != null) {
                    ps4Var.e(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Intent intent, int i, hwf hwfVar) {
        List<acf> listW;
        String action = intent.getAction();
        int i2 = 5;
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            cei.g().c(o, "Handling constraints changed " + intent);
            Context context = this.a;
            du3 du3Var = new du3(context, i, hwfVar);
            jkc jkcVar = du3Var.b;
            ArrayList arrayListM = hwfVar.o.c.x().m();
            String str = mt3.a;
            Iterator it = arrayListM.iterator();
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            while (it.hasNext()) {
                bu3 bu3Var = ((r5i) it.next()).j;
                z |= bu3Var.d;
                z2 |= bu3Var.b;
                z3 |= bu3Var.e;
                z4 |= bu3Var.a != 1;
                if (z && z2 && z3 && z4) {
                    break;
                }
            }
            String str2 = ConstraintProxyUpdateReceiver.a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z2).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z3).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z4);
            context.sendBroadcast(intent2);
            jkcVar.w(arrayListM);
            ArrayList arrayList = new ArrayList(arrayListM.size());
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator it2 = arrayListM.iterator();
            while (it2.hasNext()) {
                r5i r5iVar = (r5i) it2.next();
                String str3 = r5iVar.a;
                if (jCurrentTimeMillis >= r5iVar.a() && (!r5iVar.c() || jkcVar.l(str3))) {
                    arrayList.add(r5iVar);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                r5i r5iVar2 = (r5i) it3.next();
                String str4 = r5iVar2.a;
                v4i v4iVarD = nsi.d(r5iVar2);
                Intent intent3 = new Intent(context, (Class<?>) SystemAlarmService.class);
                intent3.setAction("ACTION_DELAY_MET");
                d(intent3, v4iVarD);
                cei.g().c(du3.c, "Creating a delay_met command for workSpec with id (" + str4 + ")");
                ((i30) ((u5i) hwfVar.b).c).execute(new hp(hwfVar, intent3, du3Var.a, i2));
            }
            jkcVar.x();
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            cei.g().c(o, "Handling reschedule " + intent + ", " + i);
            hwfVar.o.g();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
            cei.g().e(o, "Invalid request for " + action + " , requires KEY_WORKSPEC_ID .");
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            Context context2 = this.a;
            v4i v4iVarC = c(intent);
            cei ceiVarG = cei.g();
            String str5 = o;
            ceiVarG.c(str5, "Handling schedule work for " + v4iVarC);
            WorkDatabase workDatabase = hwfVar.o.c;
            workDatabase.c();
            try {
                r5i r5iVarP = workDatabase.x().p(v4iVarC.a);
                if (r5iVarP == null) {
                    cei.g().o(str5, "Skipping scheduling " + v4iVarC + " because it's no longer in the DB");
                    return;
                }
                if (r5iVarP.b.a()) {
                    cei.g().o(str5, "Skipping scheduling " + v4iVarC + "because it is finished.");
                    return;
                }
                long jA = r5iVarP.a();
                if (r5iVarP.c()) {
                    cei.g().c(str5, "Opportunistically setting an alarm for " + v4iVarC + "at " + jA);
                    oc.b(context2, workDatabase, v4iVarC, jA);
                    Intent intent4 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                    intent4.setAction("ACTION_CONSTRAINTS_CHANGED");
                    ((i30) ((u5i) hwfVar.b).c).execute(new hp(hwfVar, intent4, i, i2));
                } else {
                    cei.g().c(str5, "Setting up Alarms for " + v4iVarC + "at " + jA);
                    oc.b(context2, workDatabase, v4iVarC, jA);
                }
                workDatabase.q();
                return;
            } finally {
                workDatabase.k();
            }
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            synchronized (this.c) {
                try {
                    v4i v4iVarC2 = c(intent);
                    cei ceiVarG2 = cei.g();
                    String str6 = o;
                    ceiVarG2.c(str6, "Handing delay met for " + v4iVarC2);
                    if (this.b.containsKey(v4iVarC2)) {
                        cei.g().c(str6, "WorkSpec " + v4iVarC2 + " is is already being handled for ACTION_DELAY_MET");
                    } else {
                        ps4 ps4Var = new ps4(this.a, i, hwfVar, this.d.A(v4iVarC2));
                        this.b.put(v4iVarC2, ps4Var);
                        ps4Var.c();
                    }
                } finally {
                }
            }
            return;
        }
        if (!"ACTION_STOP_WORK".equals(action)) {
            if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                cei.g().o(o, "Ignoring intent " + intent);
                return;
            }
            v4i v4iVarC3 = c(intent);
            boolean z5 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
            cei.g().c(o, "Handling onExecutionCompleted " + intent + ", " + i);
            a(v4iVarC3, z5);
            return;
        }
        ssb ssbVar = this.d;
        Bundle extras2 = intent.getExtras();
        String string = extras2.getString("KEY_WORKSPEC_ID");
        if (extras2.containsKey("KEY_WORKSPEC_GENERATION")) {
            int i3 = extras2.getInt("KEY_WORKSPEC_GENERATION");
            ArrayList arrayList2 = new ArrayList(1);
            acf acfVarV = ssbVar.v(new v4i(string, i3));
            listW = arrayList2;
            if (acfVarV != null) {
                arrayList2.add(acfVarV);
                listW = arrayList2;
            }
        } else {
            listW = ssbVar.w(string);
        }
        for (acf acfVar : listW) {
            cei.g().c(o, "Handing stopWork work for " + string);
            c5i c5iVar = hwfVar.o;
            c5iVar.d.c(new qkf(c5iVar, acfVar, false));
            Context context3 = this.a;
            WorkDatabase workDatabase2 = hwfVar.o.c;
            v4i v4iVar = acfVar.a;
            String str7 = oc.a;
            ywf ywfVarU = workDatabase2.u();
            xwf xwfVarO = ywfVarU.o(v4iVar);
            if (xwfVarO != null) {
                oc.a(context3, v4iVar, xwfVarO.c);
                cei.g().c(oc.a, "Removing SystemIdInfo for workSpecId (" + v4iVar + ")");
                String str8 = v4iVar.a;
                int i4 = v4iVar.b;
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) ywfVarU.a;
                workDatabase_Impl.b();
                crd crdVar = (crd) ywfVarU.c;
                vk6 vk6VarA = crdVar.a();
                if (str8 == null) {
                    vk6VarA.S(1);
                } else {
                    vk6VarA.f(1, str8);
                }
                vk6VarA.k(2, i4);
                workDatabase_Impl.c();
                try {
                    vk6VarA.w();
                    workDatabase_Impl.q();
                } finally {
                    workDatabase_Impl.k();
                    crdVar.r(vk6VarA);
                }
            }
            hwfVar.a(acfVar.a, false);
        }
    }
}
