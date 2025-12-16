package com.facebook.soloader;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.os.StrictMode;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import defpackage.bj;
import defpackage.cri;
import defpackage.cs;
import defpackage.d6f;
import defpackage.dxf;
import defpackage.f6f;
import defpackage.fwf;
import defpackage.g6f;
import defpackage.h6f;
import defpackage.hg0;
import defpackage.hx4;
import defpackage.kc3;
import defpackage.nca;
import defpackage.nwf;
import defpackage.py0;
import defpackage.u45;
import defpackage.urg;
import defpackage.xm5;
import defpackage.ywf;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public class SoLoader {
    public static ywf b;
    public static int l;
    public static final ReentrantReadWriteLock c = new ReentrantReadWriteLock();
    public static Context d = null;
    public static volatile h6f[] e = null;
    public static final AtomicInteger f = new AtomicInteger(0);
    public static py0 g = null;
    public static final HashSet h = new HashSet();
    public static final HashMap i = new HashMap();
    public static final Set j = Collections.newSetFromMap(new ConcurrentHashMap());
    public static boolean k = true;
    public static int m = 0;
    public static final boolean a = true;

    public static void a(ArrayList arrayList, int i2) {
        cs csVar = new cs(d, i2);
        cri.a("SoLoader", "Adding application source: " + csVar.toString());
        arrayList.add(0, csVar);
    }

    public static void b(Context context, ArrayList arrayList) {
        if ((l & 8) != 0) {
            File fileF = urg.f(context, "lib-main");
            try {
                if (fileF.exists()) {
                    fwf.b(fileF);
                    return;
                }
                return;
            } catch (Throwable th) {
                Log.w("SoLoader", "Failed to delete " + fileF.getCanonicalPath(), th);
                return;
            }
        }
        File file = new File(context.getApplicationInfo().sourceDir);
        ArrayList arrayList2 = new ArrayList();
        hg0 hg0Var = new hg0(context, file, "lib-main");
        arrayList2.add(hg0Var);
        cri.a("SoLoader", "adding backup source from : " + hg0Var.toString());
        if (context.getApplicationInfo().splitSourceDirs != null) {
            cri.a("SoLoader", "adding backup sources from split apks");
            String[] strArr = context.getApplicationInfo().splitSourceDirs;
            int length = strArr.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                File file2 = new File(strArr[i2]);
                StringBuilder sb = new StringBuilder("lib-");
                int i4 = i3 + 1;
                sb.append(i3);
                hg0 hg0Var2 = new hg0(context, file2, sb.toString());
                cri.a("SoLoader", "adding backup source: " + hg0Var2.toString());
                a aVar = new a(hg0Var2, hg0Var2, false);
                try {
                    boolean z = aVar.y().length != 0;
                    aVar.close();
                    if (z) {
                        arrayList2.add(hg0Var2);
                    }
                    i2++;
                    i3 = i4;
                } catch (Throwable th2) {
                    try {
                        aVar.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }
        arrayList.addAll(0, arrayList2);
    }

    public static void c(ArrayList arrayList) {
        String strK = SysUtil$MarshmallowSysdeps.is64Bit() ? "/system/lib64:/vendor/lib64" : "/system/lib:/vendor/lib";
        String str = System.getenv("LD_LIBRARY_PATH");
        if (str != null && !str.equals("")) {
            strK = u45.k(str, ":", strK);
        }
        Iterator it = new HashSet(Arrays.asList(strK.split(":"))).iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            cri.a("SoLoader", "adding system library source: " + str2);
            arrayList.add(new hx4(new File(str2), 2));
        }
    }

    public static void d(String str, int i2, StrictMode.ThreadPolicy threadPolicy) {
        boolean z;
        ReentrantReadWriteLock reentrantReadWriteLock = c;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (e == null) {
                Log.e("SoLoader", "Could not load: " + str + " because SoLoader is not initialized");
                throw new UnsatisfiedLinkError("SoLoader not initialized, couldn't find DSO to load: " + str);
            }
            reentrantReadWriteLock.readLock().unlock();
            if (threadPolicy == null) {
                threadPolicy = StrictMode.allowThreadDiskReads();
                z = true;
            } else {
                z = false;
            }
            if (a) {
                Api18TraceUtils.a("SoLoader.loadLibrary[", str, "]");
            }
            try {
                reentrantReadWriteLock.readLock().lock();
                try {
                    try {
                        for (h6f h6fVar : e) {
                            if (h6fVar.c(str, i2, threadPolicy) != 0) {
                                if (z) {
                                    return;
                                } else {
                                    return;
                                }
                            }
                        }
                        throw f6f.a(str, d, e);
                    } catch (IOException e2) {
                        g6f g6fVar = new g6f(str, e2.toString());
                        g6fVar.initCause(e2);
                        throw g6fVar;
                    }
                } finally {
                }
            } finally {
                if (a) {
                    Trace.endSection();
                }
                if (z) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
            }
        } finally {
        }
    }

    public static int e(Context context) {
        int i2 = m;
        if (i2 != 0) {
            return i2;
        }
        if (context == null) {
            cri.a("SoLoader", "context is null, fallback to THIRD_PARTY_APP appType");
            return 1;
        }
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        int i3 = applicationInfo.flags;
        int i4 = (i3 & 1) != 0 ? (i3 & 128) != 0 ? 3 : 2 : 1;
        cri.a("SoLoader", "ApplicationInfo.flags is: " + applicationInfo.flags + " appType is: " + i4);
        return i4;
    }

    public static synchronized bj f() {
        py0 py0Var;
        py0Var = g;
        return py0Var == null ? null : py0Var.x();
    }

    public static void g(Context context, int i2) {
        if (l()) {
            Log.w("SoLoader", "SoLoader already initialized");
            return;
        }
        Log.w("SoLoader", "Initializing SoLoader: " + i2);
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            boolean zI = i(context);
            k = zI;
            if (zI) {
                int iE = e(context);
                m = iE;
                if ((i2 & 128) == 0) {
                    if (iE == 2 || (context != null && (context.getApplicationInfo().flags & 268435456) == 0)) {
                        i2 |= 8;
                    }
                }
                j(context);
                k(context, i2);
                cri.e("SoLoader", "Init SoLoader delegate");
                nca.a(new kc3(25));
            } else {
                h();
                cri.e("SoLoader", "Init System Loader delegate");
                nca.a(new nwf());
            }
            Log.w("SoLoader", "SoLoader initialized: " + i2);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            throw th;
        }
    }

    public static void h() {
        if (e != null) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = c;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (e == null) {
                e = new h6f[0];
            }
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th) {
            c.writeLock().unlock();
            throw th;
        }
    }

    public static boolean i(Context context) {
        String packageName;
        Bundle bundle = null;
        try {
            packageName = context.getPackageName();
        } catch (Exception e2) {
            e = e2;
            packageName = null;
        }
        try {
            bundle = context.getPackageManager().getApplicationInfo(packageName, 128).metaData;
        } catch (Exception e3) {
            e = e3;
            Log.w("SoLoader", "Unexpected issue with package manager (" + packageName + ")", e);
            return bundle == null ? true : true;
        }
        if (bundle == null && !bundle.getBoolean("com.facebook.soloader.enabled", true)) {
            return false;
        }
    }

    public static void init(Context context, int i2) throws IOException {
        g(context, i2);
    }

    public static synchronized void j(Context context) {
        if (context != null) {
            try {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    Log.w("SoLoader", "context.getApplicationContext returned null, holding reference to original context.ApplicationSoSource fallbacks to: " + context.getApplicationInfo().nativeLibraryDir);
                } else {
                    context = applicationContext;
                }
                d = context;
                g = new py0(context, 13);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (b != null) {
            return;
        }
        b = new ywf(9);
    }

    public static void k(Context context, int i2) {
        int i3;
        int i4;
        ReentrantReadWriteLock.WriteLock writeLock;
        if (e != null) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = c;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (e != null) {
                writeLock = reentrantReadWriteLock.writeLock();
            } else {
                l = i2;
                ArrayList arrayList = new ArrayList();
                if ((i2 & 512) != 0) {
                    dxf dxfVar = new dxf();
                    cri.a("SoLoader", "adding systemLoadWrapper source: " + dxfVar);
                    arrayList.add(0, dxfVar);
                } else {
                    c(arrayList);
                    if (context != null) {
                        if ((i2 & 1) != 0) {
                            int i5 = m;
                            if (i5 != 1) {
                                if (i5 != 2 && i5 != 3) {
                                    throw new RuntimeException("Unsupported app type, we should not reach here");
                                }
                                i4 = 1;
                            } else {
                                i4 = 0;
                            }
                            a(arrayList, i4);
                            cri.a("SoLoader", "Adding exo package source: lib-main");
                            arrayList.add(0, new xm5(context, "lib-main"));
                        } else {
                            if (m == 2 || (context.getApplicationInfo().flags & 268435456) == 0) {
                                b bVar = new b(context);
                                cri.a("SoLoader", "validating/adding directApk source: " + bVar.toString());
                                if (!bVar.c.isEmpty()) {
                                    arrayList.add(0, bVar);
                                }
                            }
                            int i6 = m;
                            if (i6 != 1) {
                                if (i6 != 2 && i6 != 3) {
                                    throw new RuntimeException("Unsupported app type, we should not reach here");
                                }
                                i3 = 1;
                            } else {
                                i3 = 0;
                            }
                            a(arrayList, i3);
                            b(context, arrayList);
                        }
                    }
                }
                h6f[] h6fVarArr = (h6f[]) arrayList.toArray(new h6f[arrayList.size()]);
                reentrantReadWriteLock.writeLock().lock();
                try {
                    int i7 = l;
                    int i8 = (i7 & 2) == 0 ? 0 : 1;
                    if ((i7 & 256) != 0) {
                        i8 |= 4;
                    }
                    reentrantReadWriteLock.writeLock().unlock();
                    int length = h6fVarArr.length;
                    while (true) {
                        int i9 = length - 1;
                        if (length <= 0) {
                            break;
                        }
                        cri.a("SoLoader", "Preparing SO source: " + h6fVarArr[i9]);
                        boolean z = a;
                        if (z) {
                            Api18TraceUtils.a("SoLoader", "_", h6fVarArr[i9].getClass().getSimpleName());
                        }
                        h6fVarArr[i9].d(i8);
                        if (z) {
                            Trace.endSection();
                        }
                        length = i9;
                    }
                    e = h6fVarArr;
                    f.getAndIncrement();
                    cri.a("SoLoader", "init finish: " + e.length + " SO sources prepared");
                    writeLock = c.writeLock();
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            writeLock.unlock();
        } catch (Throwable th) {
            reentrantReadWriteLock = c;
            throw th;
        }
    }

    public static boolean l() {
        if (e != null) {
            return true;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = c;
        reentrantReadWriteLock.readLock().lock();
        try {
            boolean z = e != null;
            reentrantReadWriteLock.readLock().unlock();
            return z;
        } catch (Throwable th) {
            c.readLock().unlock();
            throw th;
        }
    }

    public static boolean m(int i2, String str) {
        Boolean boolValueOf;
        if (e == null) {
            ReentrantReadWriteLock reentrantReadWriteLock = c;
            reentrantReadWriteLock.readLock().lock();
            try {
                if (e == null) {
                    if (!"http://www.android.com/".equals(System.getProperty("java.vendor.url"))) {
                        synchronized (SoLoader.class) {
                            try {
                                boolean zContains = h.contains(str);
                                boolean z = !zContains;
                                if (!zContains) {
                                    System.loadLibrary(str);
                                }
                                boolValueOf = Boolean.valueOf(z);
                            } finally {
                            }
                        }
                        reentrantReadWriteLock.readLock().unlock();
                    } else if (!l()) {
                        throw new IllegalStateException("SoLoader.init() not yet called");
                    }
                }
                reentrantReadWriteLock.readLock().unlock();
                boolValueOf = null;
            } catch (Throwable th) {
                c.readLock().unlock();
                throw th;
            }
        } else {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        if (!k) {
            return nca.b(str);
        }
        if (m != 2) {
        }
        String strMapLibraryName = System.mapLibraryName(str);
        bj bjVarF = null;
        while (true) {
            try {
                return n(strMapLibraryName, str, i2, null);
            } catch (UnsatisfiedLinkError e2) {
                Log.w("SoLoader", "Starting recovery for " + strMapLibraryName, e2);
                c.writeLock().lock();
                if (bjVarF == null) {
                    try {
                        try {
                            bjVarF = f();
                        } finally {
                            c.writeLock().unlock();
                        }
                    } catch (NoBaseApkException e3) {
                        Log.e("SoLoader", "Base APK not found during recovery", e3);
                        throw e3;
                    } catch (Exception e4) {
                        Log.e("SoLoader", "Got an exception during recovery, will throw the initial error instead", e4);
                        throw e2;
                    }
                }
                if (bjVarF == null || !bjVarF.q(e2, e)) {
                    c.writeLock().unlock();
                    Log.w("SoLoader", "Failed to recover");
                    throw e2;
                }
                f.getAndIncrement();
                Log.w("SoLoader", "Attempting to load library again");
            }
        }
        c.writeLock().unlock();
        Log.w("SoLoader", "Failed to recover");
        throw e2;
    }

    public static boolean n(String str, String str2, int i2, StrictMode.ThreadPolicy threadPolicy) {
        Object obj;
        if (!TextUtils.isEmpty(str2) && j.contains(str2)) {
            return false;
        }
        synchronized (SoLoader.class) {
            try {
                HashSet hashSet = h;
                if (hashSet.contains(str)) {
                    return false;
                }
                HashMap map = i;
                if (map.containsKey(str)) {
                    obj = map.get(str);
                } else {
                    Object obj2 = new Object();
                    map.put(str, obj2);
                    obj = obj2;
                }
                ReentrantReadWriteLock reentrantReadWriteLock = c;
                reentrantReadWriteLock.readLock().lock();
                try {
                    synchronized (obj) {
                        synchronized (SoLoader.class) {
                            if (hashSet.contains(str)) {
                                reentrantReadWriteLock.readLock().unlock();
                                return false;
                            }
                            try {
                                cri.a("SoLoader", "About to load: " + str);
                                d(str, i2, threadPolicy);
                                cri.a("SoLoader", "Loaded: " + str);
                                synchronized (SoLoader.class) {
                                    hashSet.add(str);
                                }
                                if ((i2 & 16) == 0 && !TextUtils.isEmpty(str2)) {
                                    j.contains(str2);
                                }
                                reentrantReadWriteLock.readLock().unlock();
                                return true;
                            } catch (UnsatisfiedLinkError e2) {
                                String message = e2.getMessage();
                                if (message == null || !message.contains("unexpected e_machine:")) {
                                    throw e2;
                                }
                                d6f d6fVar = new d6f("APK was built for a different platform. Supported ABIs: " + Arrays.toString(SysUtil$MarshmallowSysdeps.getSupportedAbis()) + " error: " + message.substring(message.lastIndexOf("unexpected e_machine:")));
                                d6fVar.initCause(e2);
                                throw d6fVar;
                            }
                        }
                    }
                } catch (Throwable th) {
                    c.readLock().unlock();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
