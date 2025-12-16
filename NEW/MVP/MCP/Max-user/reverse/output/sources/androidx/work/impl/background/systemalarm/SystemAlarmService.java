package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import defpackage.cei;
import defpackage.hwf;
import defpackage.m48;
import defpackage.wjh;
import defpackage.xjh;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class SystemAlarmService extends m48 {
    public static final String d = cei.m("SystemAlarmService");
    public hwf b;
    public boolean c;

    public final void a() {
        this.c = true;
        cei.g().c(d, "All commands completed in dispatcher");
        String str = wjh.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (xjh.a) {
            linkedHashMap.putAll(xjh.b);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str2 = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                cei.g().o(wjh.a, "WakeLock held for " + str2);
            }
        }
        stopSelf();
    }

    @Override // defpackage.m48, android.app.Service
    public final void onCreate() {
        super.onCreate();
        hwf hwfVar = new hwf(this);
        this.b = hwfVar;
        if (hwfVar.s0 != null) {
            cei.g().e(hwf.t0, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            hwfVar.s0 = this;
        }
        this.c = false;
    }

    @Override // defpackage.m48, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.c = true;
        hwf hwfVar = this.b;
        hwfVar.getClass();
        cei.g().c(hwf.t0, "Destroying SystemAlarmDispatcher");
        hwfVar.d.e(hwfVar);
        hwfVar.s0 = null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.c) {
            cei.g().i(d, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            hwf hwfVar = this.b;
            hwfVar.getClass();
            cei ceiVarG = cei.g();
            String str = hwf.t0;
            ceiVarG.c(str, "Destroying SystemAlarmDispatcher");
            hwfVar.d.e(hwfVar);
            hwfVar.s0 = null;
            hwf hwfVar2 = new hwf(this);
            this.b = hwfVar2;
            if (hwfVar2.s0 != null) {
                cei.g().e(str, "A completion listener for SystemAlarmDispatcher already exists.");
            } else {
                hwfVar2.s0 = this;
            }
            this.c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.b.b(intent, i2);
        return 3;
    }
}
