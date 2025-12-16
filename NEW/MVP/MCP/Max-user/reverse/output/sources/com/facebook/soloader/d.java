package com.facebook.soloader;

import android.os.StrictMode;
import android.os.Trace;
import defpackage.az1;
import defpackage.cri;
import defpackage.da5;
import defpackage.dbj;
import defpackage.ea5;
import defpackage.ywi;
import defpackage.yz9;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public abstract class d {
    static {
        new ReentrantReadWriteLock();
    }

    public static String[] a(String str, da5 da5Var) {
        boolean z = SoLoader.a;
        if (z) {
            Api18TraceUtils.a("soloader.NativeDeps.getDependencies[", str, "]");
        }
        try {
            try {
                String[] strArrA = ywi.a(da5Var);
                if (z) {
                    Trace.endSection();
                }
                return strArrA;
            } catch (yz9 e) {
                throw dbj.b(str, e);
            }
        } catch (Throwable th) {
            if (SoLoader.a) {
                Trace.endSection();
            }
            throw th;
        }
    }

    public static void b(String str, ea5 ea5Var, int i, StrictMode.ThreadPolicy threadPolicy) {
        String[] strArrA = a(str, ea5Var);
        StringBuilder sbN = az1.n("Loading ", str, "'s dependencies: ");
        sbN.append(Arrays.toString(strArrA));
        cri.a("SoLoader", sbN.toString());
        for (String str2 : strArrA) {
            if (!str2.startsWith("/")) {
                SoLoader.n(str2, null, i | 1, threadPolicy);
            }
        }
    }
}
