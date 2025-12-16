package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class ps4 implements n4i, v5i {
    public static final String w0 = cei.m("DelayMetCommandHandler");
    public final Object X;
    public int Y;
    public final uee Z;
    public final Context a;
    public final int b;
    public final v4i c;
    public final hwf d;
    public final jkc o;
    public final i30 s0;
    public PowerManager.WakeLock t0;
    public boolean u0;
    public final acf v0;

    public ps4(Context context, int i, hwf hwfVar, acf acfVar) {
        this.a = context;
        this.b = i;
        this.d = hwfVar;
        this.c = acfVar.a;
        this.v0 = acfVar;
        ywf ywfVar = hwfVar.o.j;
        u5i u5iVar = (u5i) hwfVar.b;
        this.Z = (uee) u5iVar.a;
        this.s0 = (i30) u5iVar.c;
        this.o = new jkc(ywfVar, this);
        this.u0 = false;
        this.Y = 0;
        this.X = new Object();
    }

    public static void a(ps4 ps4Var) {
        int i = ps4Var.b;
        i30 i30Var = ps4Var.s0;
        Context context = ps4Var.a;
        hwf hwfVar = ps4Var.d;
        v4i v4iVar = ps4Var.c;
        String str = v4iVar.a;
        int i2 = ps4Var.Y;
        String str2 = w0;
        if (i2 >= 2) {
            cei.g().c(str2, "Already stopped work for " + str);
            return;
        }
        ps4Var.Y = 2;
        cei.g().c(str2, "Stopping work for WorkSpec " + str);
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        cg3.d(intent, v4iVar);
        i30Var.execute(new hp(hwfVar, intent, i, 5));
        if (!hwfVar.d.d(str)) {
            cei.g().c(str2, "Processor does not have WorkSpec " + str + ". No need to reschedule");
            return;
        }
        cei.g().c(str2, "WorkSpec " + str + " needs to be rescheduled");
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_SCHEDULE_WORK");
        cg3.d(intent2, v4iVar);
        i30Var.execute(new hp(hwfVar, intent2, i, 5));
    }

    public final void b() {
        synchronized (this.X) {
            try {
                this.o.x();
                this.d.c.a(this.c);
                PowerManager.WakeLock wakeLock = this.t0;
                if (wakeLock != null && wakeLock.isHeld()) {
                    cei.g().c(w0, "Releasing wakelock " + this.t0 + "for WorkSpec " + this.c);
                    this.t0.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() throws Throwable {
        String str = this.c.a;
        StringBuilder sbO = ho7.o(str, " (");
        sbO.append(this.b);
        sbO.append(")");
        this.t0 = wjh.a(this.a, sbO.toString());
        cei ceiVarG = cei.g();
        String str2 = "Acquiring wakelock " + this.t0 + "for WorkSpec " + str;
        String str3 = w0;
        ceiVarG.c(str3, str2);
        this.t0.acquire();
        r5i r5iVarP = this.d.o.c.x().p(str);
        if (r5iVarP == null) {
            this.Z.execute(new os4(this, 0));
            return;
        }
        boolean zC = r5iVarP.c();
        this.u0 = zC;
        if (zC) {
            this.o.w(Collections.singletonList(r5iVarP));
            return;
        }
        cei.g().c(str3, "No constraints for " + str);
        f(Collections.singletonList(r5iVarP));
    }

    @Override // defpackage.n4i
    public final void d(ArrayList arrayList) {
        this.Z.execute(new os4(this, 0));
    }

    public final void e(boolean z) {
        cei ceiVarG = cei.g();
        StringBuilder sb = new StringBuilder("onExecuted ");
        v4i v4iVar = this.c;
        sb.append(v4iVar);
        sb.append(", ");
        sb.append(z);
        ceiVarG.c(w0, sb.toString());
        b();
        int i = this.b;
        hwf hwfVar = this.d;
        i30 i30Var = this.s0;
        Context context = this.a;
        if (z) {
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_SCHEDULE_WORK");
            cg3.d(intent, v4iVar);
            i30Var.execute(new hp(hwfVar, intent, i, 5));
        }
        if (this.u0) {
            Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
            i30Var.execute(new hp(hwfVar, intent2, i, 5));
        }
    }

    @Override // defpackage.n4i
    public final void f(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (nsi.d((r5i) it.next()).equals(this.c)) {
                this.Z.execute(new os4(this, 1));
                return;
            }
        }
    }
}
