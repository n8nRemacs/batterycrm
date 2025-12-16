package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class pwf implements n4i, ij5 {
    public static final String t0 = cei.m("SystemFgDispatcher");
    public final HashMap X;
    public final HashSet Y;
    public final jkc Z;
    public final c5i a;
    public final t2g b;
    public final Object c = new Object();
    public v4i d;
    public final LinkedHashMap o;
    public SystemForegroundService s0;

    public pwf(Context context) {
        c5i c5iVarD = c5i.d(context);
        this.a = c5iVarD;
        this.b = c5iVarD.d;
        this.d = null;
        this.o = new LinkedHashMap();
        this.Y = new HashSet();
        this.X = new HashMap();
        this.Z = new jkc(c5iVarD.j, this);
        c5iVarD.f.b(this);
    }

    public static Intent b(Context context, v4i v4iVar, qe6 qe6Var) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", qe6Var.a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", qe6Var.b);
        intent.putExtra("KEY_NOTIFICATION", qe6Var.c);
        intent.putExtra("KEY_WORKSPEC_ID", v4iVar.a);
        intent.putExtra("KEY_GENERATION", v4iVar.b);
        return intent;
    }

    public static Intent c(Context context, v4i v4iVar, qe6 qe6Var) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", v4iVar.a);
        intent.putExtra("KEY_GENERATION", v4iVar.b);
        intent.putExtra("KEY_NOTIFICATION_ID", qe6Var.a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", qe6Var.b);
        intent.putExtra("KEY_NOTIFICATION", qe6Var.c);
        return intent;
    }

    @Override // defpackage.ij5
    public final void a(v4i v4iVar, boolean z) {
        Map.Entry entry;
        synchronized (this.c) {
            try {
                r5i r5iVar = (r5i) this.X.remove(v4iVar);
                if (r5iVar != null ? this.Y.remove(r5iVar) : false) {
                    this.Z.w(this.Y);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        qe6 qe6Var = (qe6) this.o.remove(v4iVar);
        if (v4iVar.equals(this.d) && this.o.size() > 0) {
            Iterator it = this.o.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.d = (v4i) entry.getKey();
            if (this.s0 != null) {
                qe6 qe6Var2 = (qe6) entry.getValue();
                SystemForegroundService systemForegroundService = this.s0;
                systemForegroundService.b.post(new qwf(systemForegroundService, qe6Var2.a, qe6Var2.c, qe6Var2.b));
                SystemForegroundService systemForegroundService2 = this.s0;
                systemForegroundService2.b.post(new xk0(systemForegroundService2, qe6Var2.a, 3));
            }
        }
        SystemForegroundService systemForegroundService3 = this.s0;
        if (qe6Var == null || systemForegroundService3 == null) {
            return;
        }
        cei.g().c(t0, "Removing Notification (id: " + qe6Var.a + ", workSpecId: " + v4iVar + ", notificationType: " + qe6Var.b);
        systemForegroundService3.b.post(new xk0(systemForegroundService3, qe6Var.a, 3));
    }

    @Override // defpackage.n4i
    public final void d(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            r5i r5iVar = (r5i) it.next();
            String str = r5iVar.a;
            cei.g().c(t0, "Constraints unmet for WorkSpec " + str);
            v4i v4iVarD = nsi.d(r5iVar);
            c5i c5iVar = this.a;
            c5iVar.d.c(new qkf(c5iVar, new acf(v4iVarD), true));
        }
    }

    public final void e(Intent intent) {
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        v4i v4iVar = new v4i(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        cei.g().c(t0, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
        if (notification == null || this.s0 == null) {
            return;
        }
        qe6 qe6Var = new qe6(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.o;
        linkedHashMap.put(v4iVar, qe6Var);
        if (this.d == null) {
            this.d = v4iVar;
            SystemForegroundService systemForegroundService = this.s0;
            systemForegroundService.b.post(new qwf(systemForegroundService, intExtra, notification, intExtra2));
            return;
        }
        SystemForegroundService systemForegroundService2 = this.s0;
        systemForegroundService2.b.post(new hp(systemForegroundService2, intExtra, notification, 6));
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            i |= ((qe6) ((Map.Entry) it.next()).getValue()).b;
        }
        qe6 qe6Var2 = (qe6) linkedHashMap.get(this.d);
        if (qe6Var2 != null) {
            SystemForegroundService systemForegroundService3 = this.s0;
            systemForegroundService3.b.post(new qwf(systemForegroundService3, qe6Var2.a, qe6Var2.c, i));
        }
    }

    @Override // defpackage.n4i
    public final void f(List list) {
    }

    public final void g() {
        this.s0 = null;
        synchronized (this.c) {
            this.Z.x();
        }
        this.a.f.e(this);
    }
}
