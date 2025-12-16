package id;

import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import com.jaredrummler.android.processes.models.AndroidAppProcess;
import com.jaredrummler.android.processes.models.Stat;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AppProcessStatistics.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lid/b;", "", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: id.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C41384b {
    public static long a(long j12) {
        Object next;
        int iMyPid = Process.myPid();
        ArrayList arrayList = new ArrayList();
        for (File file : new File("/proc").listFiles()) {
            if (file.isDirectory()) {
                try {
                    arrayList.add(new AndroidAppProcess(Integer.parseInt(file.getName())));
                } catch (AndroidAppProcess.NotAndroidAppProcessException | IOException | NumberFormatException unused) {
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((AndroidAppProcess) next).f364306c == iMyPid) {
                break;
            }
        }
        if (((AndroidAppProcess) next) == null) {
            return j12;
        }
        return (long) ((1000.0f / Os.sysconf(OsConstants._SC_CLK_TCK)) * Long.parseLong(Stat.b(r2.f364306c).f364312c[21]));
    }
}
