package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import androidx.collection.o1;
import com.google.common.base.H;
import j.k0;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
public final class zzgr {

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
    public static class zza {

        /* renamed from: a, reason: collision with root package name */
        public static volatile H<zzgp> f350805a;

        public static H<zzgp> zza(Context context) {
            H<zzgp> h12;
            H<zzgp> hB2;
            synchronized (zza.class) {
                try {
                    h12 = f350805a;
                    if (h12 == null) {
                        new zzgr();
                        if (zzgs.zza(Build.TYPE, Build.TAGS)) {
                            if (zzge.zza() && !context.isDeviceProtectedStorage()) {
                                context = context.createDeviceProtectedStorageContext();
                            }
                            hB2 = zzgr.b(context);
                        } else {
                            hB2 = H.a();
                        }
                        h12 = hB2;
                        f350805a = h12;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return h12;
        }
    }

    public static zzgk a(Context context, File file) throws IOException {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            try {
                o1 o1Var = new o1();
                HashMap map = new HashMap();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        String.valueOf(file);
                        context.getPackageName();
                        zzgk zzgkVar = new zzgk(o1Var);
                        bufferedReader.close();
                        return zzgkVar;
                    }
                    String[] strArrSplit = line.split(" ", 3);
                    if (strArrSplit.length == 3) {
                        String str = new String(strArrSplit[0]);
                        String strDecode = Uri.decode(new String(strArrSplit[1]));
                        String strDecode2 = (String) map.get(strArrSplit[2]);
                        if (strDecode2 == null) {
                            String str2 = new String(strArrSplit[2]);
                            strDecode2 = Uri.decode(str2);
                            if (strDecode2.length() < 1024 || strDecode2 == str2) {
                                map.put(str2, strDecode2);
                            }
                        }
                        if (!o1Var.containsKey(str)) {
                            o1Var.put(str, new o1());
                        }
                        ((o1) o1Var.get(str)).put(strDecode, strDecode2);
                    }
                }
            } finally {
            }
        } catch (IOException e12) {
            throw new RuntimeException(e12);
        }
    }

    @k0
    public static H<zzgp> b(Context context) {
        H hA2;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            StrictMode.allowThreadDiskWrites();
            try {
                File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
                hA2 = file.exists() ? H.d(file) : H.a();
            } catch (RuntimeException unused) {
                hA2 = H.a();
            }
            H<zzgp> hD2 = hA2.c() ? H.d(a(context, (File) hA2.b())) : H.a();
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            return hD2;
        } catch (Throwable th2) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th2;
        }
    }
}
