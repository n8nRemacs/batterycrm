package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.net.Uri;
import android.os.Debug;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.Thread;
import one.me.android.concurrent.UncaughtException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class pn3 implements Thread.UncaughtExceptionHandler {
    public final /* synthetic */ int a;

    public /* synthetic */ pn3(int i) {
        this.a = i;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) throws JSONException, IOException {
        Context context;
        String str;
        switch (this.a) {
            case 0:
                UncaughtException uncaughtException = new UncaughtException(th);
                ActivityManager activityManager = (ActivityManager) ((Context) t1b.a.getAccessor().c(12)).getSystemService("activity");
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                Log.wtf("UncaughtException", "availMem = " + memoryInfo.availMem, uncaughtException);
                ((y3b) ((yi5) y4e.a.getAccessor().c(9))).a(uncaughtException);
                return;
        }
        while (!(th instanceof OutOfMemoryError)) {
            Throwable cause = th.getCause();
            if (cause == null || cause == th) {
                return;
            } else {
                th = cause;
            }
        }
        u17 u17Var = u17.a;
        if (feg.b || (context = u17.c) == null || !u17.b.getAndSet(false)) {
            return;
        }
        x79 x79Var = feg.c;
        if (x79Var == null) {
            x79Var = null;
        }
        String str2 = (String) x79Var.c;
        String strB = d6j.b();
        if (strB.equals(context.getPackageName())) {
            str = "tracer";
        } else {
            str = "tracer-" + Uri.encode(dnf.p(strB, ':', '-', false));
        }
        File file = new File(context.getCacheDir(), str);
        File fileG = jz5.g(file, "dump-tmp.hprof");
        File fileG2 = jz5.g(file, "dump-tmp-meta.json");
        try {
            nbj.b(file);
            Debug.dumpHprofData(fileG.getAbsolutePath());
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("buildUuid", str2);
            jSONObject.put("tag", (Object) null);
            jz5.h(fileG2, jSONObject.toString());
        } catch (Exception unused) {
            u17.a(fileG);
            u17.a(fileG2);
        }
        File fileG3 = jz5.g(file, "dump.hprof");
        File fileG4 = jz5.g(file, "dump-meta.json");
        try {
            if (fileG3.exists()) {
                nbj.a(fileG3);
            }
            if (fileG4.exists()) {
                nbj.a(fileG4);
            }
            nbj.d(fileG, fileG3);
            nbj.d(fileG2, fileG4);
        } catch (Exception unused2) {
            u17.a(fileG3);
            u17.a(fileG4);
        }
    }
}
