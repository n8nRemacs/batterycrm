package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class hwf implements ij5 {
    public static final String t0 = cei.m("SystemAlarmDispatcher");
    public final cg3 X;
    public final ArrayList Y;
    public Intent Z;
    public final Context a;
    public final t2g b;
    public final x5i c;
    public final jac d;
    public final c5i o;
    public SystemAlarmService s0;

    public hwf(SystemAlarmService systemAlarmService) {
        Context applicationContext = systemAlarmService.getApplicationContext();
        this.a = applicationContext;
        this.X = new cg3(applicationContext, new ssb(9));
        c5i c5iVarD = c5i.d(systemAlarmService);
        this.o = c5iVarD;
        this.c = new x5i(c5iVarD.b.e);
        jac jacVar = c5iVarD.f;
        this.d = jacVar;
        this.b = c5iVarD.d;
        jacVar.b(this);
        this.Y = new ArrayList();
        this.Z = null;
    }

    public static void c() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    @Override // defpackage.ij5
    public final void a(v4i v4iVar, boolean z) {
        i30 i30Var = (i30) ((u5i) this.b).c;
        String str = cg3.o;
        Intent intent = new Intent(this.a, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        cg3.d(intent, v4iVar);
        i30Var.execute(new hp(this, intent, 0, 5));
    }

    public final void b(Intent intent, int i) {
        cei ceiVarG = cei.g();
        String str = t0;
        ceiVarG.c(str, "Adding command " + intent + " (" + i + ")");
        c();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            cei.g().o(str, "Unknown command. Ignoring");
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            c();
            synchronized (this.Y) {
                try {
                    Iterator it = this.Y.iterator();
                    while (it.hasNext()) {
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                            return;
                        }
                    }
                } finally {
                }
            }
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.Y) {
            try {
                boolean zIsEmpty = this.Y.isEmpty();
                this.Y.add(intent);
                if (zIsEmpty) {
                    d();
                }
            } finally {
            }
        }
    }

    public final void d() {
        c();
        PowerManager.WakeLock wakeLockA = wjh.a(this.a, "ProcessCommand");
        try {
            wakeLockA.acquire();
            this.o.d.c(new gwf(this, 0));
        } finally {
            wakeLockA.release();
        }
    }
}
