package com.avito.android;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.avito.android.util.C35775d4;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.jvm.internal.C42822w;

/* compiled from: BaseApp.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/s;", "Landroid/app/Application;", "<init>", "()V", "a", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.s, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractApplicationC34428s extends Application {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f256016b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static AbstractApplicationC34428s f256017c;

    /* compiled from: BaseApp.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/s$a;", "", "<init>", "()V", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.s$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(@Y61.k Context context) {
        super.attachBaseContext(context);
        f256016b.getClass();
        f256017c = this;
        com.avito.android.time.c cVar = com.avito.android.time.c.f301452a;
        com.avito.android.time.a aVar = new com.avito.android.time.a();
        cVar.getClass();
        com.avito.android.time.c.f301453b = aVar;
    }

    public final boolean d() {
        Object bVar;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        C35775d4.f318858a.getClass();
        String packageName = getPackageName();
        if (Build.VERSION.SDK_INT >= 28) {
            int i12 = kotlin.Z.f406624c;
            bVar = Application.getProcessName();
        } else {
            try {
                bVar = (String) Class.forName("android.app.ActivityThread").getDeclaredMethod("currentProcessName", new Class[0]).invoke(null, new Object[0]);
                int i13 = kotlin.Z.f406624c;
            } catch (Throwable th2) {
                int i14 = kotlin.Z.f406624c;
                bVar = new Z.b(th2);
            }
        }
        if (kotlin.Z.b(bVar) == null) {
            return kotlin.jvm.internal.L.f(packageName, (String) bVar);
        }
        int iMyPid = Process.myPid();
        Object systemService = getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return false;
        }
        List<ActivityManager.RunningAppProcessInfo> list = runningAppProcesses;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : list) {
            if (iMyPid == runningAppProcessInfo.pid && kotlin.jvm.internal.L.f(packageName, runningAppProcessInfo.processName)) {
                return true;
            }
        }
        return false;
    }
}
