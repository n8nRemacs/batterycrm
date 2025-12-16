package com.google.android.gms.common.util;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import com.google.android.gms.common.internal.C36729v;
import j.P;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@RX0.a
/* loaded from: classes6.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    @I41.h
    public static String f349619a;

    /* renamed from: b, reason: collision with root package name */
    public static int f349620b;

    @RX0.a
    @P
    public static String a() throws Throwable {
        BufferedReader bufferedReader;
        if (f349619a == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                f349619a = Application.getProcessName();
            } else {
                int iMyPid = f349620b;
                if (iMyPid == 0) {
                    iMyPid = Process.myPid();
                    f349620b = iMyPid;
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
                                C36729v.j(line);
                                strTrim = line.trim();
                            } catch (IOException unused) {
                            } catch (Throwable th2) {
                                th = th2;
                                bufferedReader2 = bufferedReader;
                                q.a(bufferedReader2);
                                throw th;
                            }
                        } finally {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        }
                    } catch (IOException unused2) {
                        bufferedReader = null;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    q.a(bufferedReader);
                }
                f349619a = strTrim;
            }
        }
        return f349619a;
    }
}
