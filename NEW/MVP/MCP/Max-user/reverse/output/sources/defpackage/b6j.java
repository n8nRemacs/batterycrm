package defpackage;

import android.app.Application;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class b6j {
    public static String a;
    public static int b;

    public static final Uri a(Cursor cursor, int i) {
        Object ipdVar;
        try {
            ipdVar = cursor.getString(i);
        } catch (Throwable th) {
            ipdVar = new ipd(th);
        }
        if (ipdVar instanceof ipd) {
            ipdVar = null;
        }
        String str = (String) ipdVar;
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            if (pbj.c(str)) {
                return xpi.q(tfi.h(str));
            }
            return null;
        } catch (Throwable th2) {
            wqi.p("LocalMediaRepository:Cursor:getUri", "Failure Uri.fromFile(File(" + str + "))", th2);
            return null;
        }
    }

    public static String b() throws Throwable {
        BufferedReader bufferedReader;
        if (a == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                a = Application.getProcessName();
            } else {
                int iMyPid = b;
                if (iMyPid == 0) {
                    iMyPid = Process.myPid();
                    b = iMyPid;
                }
                String strTrim = null;
                strTrim = null;
                strTrim = null;
                BufferedReader bufferedReader2 = null;
                if (iMyPid > 0) {
                    try {
                        String str = "/proc/" + iMyPid + "/cmdline";
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            bufferedReader = new BufferedReader(new FileReader(str));
                            try {
                                String line = bufferedReader.readLine();
                                s5j.g(line);
                                strTrim = line.trim();
                            } catch (IOException unused) {
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader2 = bufferedReader;
                                efi.a(bufferedReader2);
                                throw th;
                            }
                        } finally {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        }
                    } catch (IOException unused2) {
                        bufferedReader = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    efi.a(bufferedReader);
                }
                a = strTrim;
            }
        }
        return a;
    }
}
