package com.facebook.soloader;

import android.content.Context;
import android.os.Build;
import android.os.StrictMode;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.soloader.SysUtil;
import iX0.C41358a;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;

@J41.d
/* loaded from: classes16.dex */
public class SoLoader {

    /* renamed from: b, reason: collision with root package name */
    @I41.h
    public static B f340847b;

    /* renamed from: f, reason: collision with root package name */
    @J41.a
    @I41.h
    public static G[] f340851f;

    /* renamed from: g, reason: collision with root package name */
    @J41.a
    @I41.h
    public static C36425b f340852g;

    /* renamed from: l, reason: collision with root package name */
    @J41.a
    public static int f340857l;

    /* renamed from: c, reason: collision with root package name */
    public static final ReentrantReadWriteLock f340848c = new ReentrantReadWriteLock();

    /* renamed from: d, reason: collision with root package name */
    @J41.a
    @I41.h
    public static volatile D[] f340849d = null;

    /* renamed from: e, reason: collision with root package name */
    @J41.a
    public static final AtomicInteger f340850e = new AtomicInteger(0);

    /* renamed from: h, reason: collision with root package name */
    @J41.a
    public static final HashSet<String> f340853h = new HashSet<>();

    /* renamed from: i, reason: collision with root package name */
    @J41.a
    public static final HashMap f340854i = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    public static final Set<String> f340855j = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: k, reason: collision with root package name */
    public static final String[] f340856k = {System.mapLibraryName("breakpad")};

    /* renamed from: m, reason: collision with root package name */
    public static int f340858m = 0;

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f340846a = true;

    public interface a {
    }

    @J41.c
    public static class b {
    }

    public static final class c extends UnsatisfiedLinkError {
    }

    public static void a(Context context, ArrayList arrayList) throws IOException {
        if ((f340857l & 8) != 0) {
            f340851f = null;
            File fileJ = G.j(context, "lib-main");
            try {
                SysUtil.a(fileJ);
                return;
            } catch (IOException unused) {
                fileJ.getCanonicalPath();
                return;
            }
        }
        File file = new File(context.getApplicationInfo().sourceDir);
        ArrayList arrayList2 = new ArrayList();
        C36424a c36424a = new C36424a(context, "lib-main", file);
        arrayList2.add(c36424a);
        if (Log.isLoggable("SoLoader", 3)) {
            c36424a.toString();
        }
        if (context.getApplicationInfo().splitSourceDirs != null) {
            Log.isLoggable("SoLoader", 3);
            String[] strArr = context.getApplicationInfo().splitSourceDirs;
            int length = strArr.length;
            int i12 = 0;
            int i13 = 0;
            while (i12 < length) {
                File file2 = new File(strArr[i12]);
                StringBuilder sb2 = new StringBuilder("lib-");
                int i14 = i13 + 1;
                sb2.append(i13);
                C36424a c36424a2 = new C36424a(context, sb2.toString(), file2);
                if (Log.isLoggable("SoLoader", 3)) {
                    c36424a2.toString();
                }
                arrayList2.add(c36424a2);
                i12++;
                i13 = i14;
            }
        }
        f340851f = (G[]) arrayList2.toArray(new G[arrayList2.size()]);
        arrayList.addAll(0, arrayList2);
    }

    public static void b(ArrayList<D> arrayList, String[] strArr) {
        String strR = SysUtil.MarshmallowSysdeps.is64Bit() ? "/system/lib64:/vendor/lib64" : "/system/lib:/vendor/lib";
        String str = System.getenv("LD_LIBRARY_PATH");
        if (str != null && !str.equals("")) {
            strR = androidx.appcompat.app.r.r(strR, ":", str);
        }
        Iterator it = new HashSet(Arrays.asList(strR.split(":"))).iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            Log.isLoggable("SoLoader", 3);
            arrayList.add(new C36427d(new File(str2), 2, strArr));
        }
    }

    public static void c(Context context, ArrayList<D> arrayList, int i12) {
        C36425b c36425b = new C36425b();
        Context applicationContext = context.getApplicationContext();
        c36425b.f340863a = applicationContext;
        if (applicationContext == null) {
            String str = context.getApplicationInfo().nativeLibraryDir;
            c36425b.f340863a = context;
        }
        c36425b.f340864b = i12;
        c36425b.f340865c = new C36427d(new File(c36425b.f340863a.getApplicationInfo().nativeLibraryDir), i12);
        f340852g = c36425b;
        if (Log.isLoggable("SoLoader", 3)) {
            f340852g.f340865c.toString();
        }
        arrayList.add(0, f340852g);
    }

    public static void d(Context context, ArrayList<D> arrayList) {
        if (context.getApplicationInfo().splitSourceDirs != null) {
            Log.isLoggable("SoLoader", 3);
            for (String str : context.getApplicationInfo().splitSourceDirs) {
                C36426c c36426c = new C36426c(new File(str));
                if (Log.isLoggable("SoLoader", 3)) {
                    c36426c.toString();
                }
                arrayList.add(0, c36426c);
            }
        }
        C36426c c36426c2 = new C36426c(context);
        if (Log.isLoggable("SoLoader", 3)) {
            c36426c2.toString();
        }
        arrayList.add(0, c36426c2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
    
        android.util.Log.isLoggable("SoLoader", 3);
        r5 = com.facebook.soloader.SoLoader.f340851f;
        r6 = r5.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
    
        if (r7 >= r6) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
    
        r8 = r5[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        monitor-enter(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
    
        r9 = r8.i(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        monitor-enter(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        r8.f340836e = r11;
        r8.b(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0064, code lost:
    
        monitor-exit(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0065, code lost:
    
        monitor-exit(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
    
        r8 = r8.a(r11, r12, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006a, code lost:
    
        if (r8 != 1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006c, code lost:
    
        r1 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006e, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0095, code lost:
    
        if (com.facebook.soloader.SoLoader.f340846a == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0097, code lost:
    
        android.os.Trace.endSection();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x009a, code lost:
    
        if (r3 == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x009c, code lost:
    
        android.os.StrictMode.setThreadPolicy(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x009f, code lost:
    
        if (r1 == 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a1, code lost:
    
        if (r1 != 3) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a3, code lost:
    
        r13 = new java.lang.StringBuilder("couldn't find DSO to load: ");
        r13.append(r11);
        r12.readLock().lock();
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b8, code lost:
    
        if (r11 >= com.facebook.soloader.SoLoader.f340849d.length) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ba, code lost:
    
        r13.append("\n\tSoSource ");
        r13.append(r11);
        r13.append(": ");
        r13.append(com.facebook.soloader.SoLoader.f340849d[r11].toString());
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d5, code lost:
    
        r11 = com.facebook.soloader.SoLoader.f340852g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d7, code lost:
    
        if (r11 == null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d9, code lost:
    
        r11 = r11.f340863a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e3, code lost:
    
        r12 = new java.io.File(r11.createPackageContext(r11.getPackageName(), 0).getApplicationInfo().nativeLibraryDir);
        r13.append("\n\tNative lib dir: ");
        r13.append(r12.getAbsolutePath());
        r13.append("\n");
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0100, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0106, code lost:
    
        throw new java.lang.RuntimeException(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0107, code lost:
    
        com.facebook.soloader.SoLoader.f340848c.readLock().unlock();
        r13.append(" result: ");
        r13.append(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0121, code lost:
    
        throw new java.lang.UnsatisfiedLinkError(r13.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0122, code lost:
    
        r12 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0123, code lost:
    
        r0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0128, code lost:
    
        android.os.Trace.endSection();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x012d, code lost:
    
        android.os.StrictMode.setThreadPolicy(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0135, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0146, code lost:
    
        r11 = r12.toString();
     */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(java.lang.String r11, int r12, @I41.h android.os.StrictMode.ThreadPolicy r13) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SoLoader.e(java.lang.String, int, android.os.StrictMode$ThreadPolicy):void");
    }

    public static synchronized void f() {
        Method method;
        try {
            if (f340847b != null) {
                return;
            }
            Runtime runtime = Runtime.getRuntime();
            String strJoin = null;
            if (Build.VERSION.SDK_INT > 27) {
                method = null;
            } else {
                try {
                    Method declaredMethod = Runtime.class.getDeclaredMethod("nativeLoad", String.class, ClassLoader.class, String.class);
                    declaredMethod.setAccessible(true);
                    method = declaredMethod;
                } catch (NoSuchMethodException | SecurityException unused) {
                }
            }
            boolean z12 = method != null;
            String strA = z12 ? SysUtil.Api14Utils.a() : null;
            if (strA != null) {
                String[] strArrSplit = strA.split(":");
                ArrayList arrayList = new ArrayList(strArrSplit.length);
                for (String str : strArrSplit) {
                    if (!str.contains("!")) {
                        arrayList.add(str);
                    }
                }
                strJoin = TextUtils.join(":", arrayList);
            }
            f340847b = new C(z12, strA, strJoin, runtime, method);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static void g(Context context, int i12, String[] strArr) {
        ReentrantReadWriteLock.WriteLock writeLock;
        int i13;
        if (f340849d != null) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f340848c;
        reentrantReadWriteLock.writeLock().lock();
        if (f340849d != null) {
            return;
        }
        try {
            f340857l = i12;
            ArrayList arrayList = new ArrayList();
            b(arrayList, strArr);
            if (context != null) {
                if ((i12 & 1) != 0) {
                    f340851f = null;
                    Log.isLoggable("SoLoader", 3);
                    arrayList.add(0, new q(context, "lib-main"));
                } else {
                    if ((i12 & 64) != 0) {
                        d(context, arrayList);
                    }
                    int i14 = f340858m;
                    if (i14 != 1) {
                        if (i14 != 2 && i14 != 3) {
                            throw new RuntimeException("Unsupported app type, we should not reach here");
                        }
                        i13 = 1;
                    } else {
                        i13 = 0;
                    }
                    c(context, arrayList, i13);
                    a(context, arrayList);
                }
            }
            D[] dArr = (D[]) arrayList.toArray(new D[arrayList.size()]);
            reentrantReadWriteLock.writeLock().lock();
            try {
                int i15 = (f340857l & 2) == 0 ? 0 : 1;
                reentrantReadWriteLock.writeLock().unlock();
                int length = dArr.length;
                while (true) {
                    int i16 = length - 1;
                    if (length <= 0) {
                        break;
                    }
                    if (Log.isLoggable("SoLoader", 3)) {
                        Objects.toString(dArr[i16]);
                    }
                    boolean z12 = f340846a;
                    if (z12) {
                        Api18TraceUtils.a("SoLoader", "_", dArr[i16].getClass().getSimpleName());
                    }
                    dArr[i16].b(i15);
                    if (z12) {
                        Trace.endSection();
                    }
                    length = i16;
                }
                f340849d = dArr;
                f340850e.getAndIncrement();
                if (Log.isLoggable("SoLoader", 3)) {
                    int length2 = f340849d.length;
                }
                reentrantReadWriteLock = f340848c;
            } finally {
                reentrantReadWriteLock.writeLock().unlock();
            }
        } catch (Throwable th2) {
            reentrantReadWriteLock = f340848c;
            throw th2;
        }
    }

    public static boolean h() {
        if (f340849d != null) {
            return true;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f340848c;
        reentrantReadWriteLock.readLock().lock();
        try {
            boolean z12 = f340849d != null;
            reentrantReadWriteLock.readLock().unlock();
            return z12;
        } catch (Throwable th2) {
            f340848c.readLock().unlock();
            throw th2;
        }
    }

    public static boolean i(String str, @I41.h String str2, int i12, @I41.h StrictMode.ThreadPolicy threadPolicy) {
        Object obj;
        if (!TextUtils.isEmpty(str2) && f340855j.contains(str2)) {
            return false;
        }
        synchronized (SoLoader.class) {
            try {
                HashSet<String> hashSet = f340853h;
                if (hashSet.contains(str)) {
                    return false;
                }
                HashMap map = f340854i;
                if (map.containsKey(str)) {
                    obj = map.get(str);
                } else {
                    Object obj2 = new Object();
                    map.put(str, obj2);
                    obj = obj2;
                }
                ReentrantReadWriteLock reentrantReadWriteLock = f340848c;
                reentrantReadWriteLock.readLock().lock();
                try {
                    synchronized (obj) {
                        synchronized (SoLoader.class) {
                            if (hashSet.contains(str)) {
                                reentrantReadWriteLock.readLock().unlock();
                                return false;
                            }
                            try {
                                Log.isLoggable("SoLoader", 3);
                                e(str, i12, threadPolicy);
                                Log.isLoggable("SoLoader", 3);
                                synchronized (SoLoader.class) {
                                    hashSet.add(str);
                                }
                                if ((i12 & 16) == 0 && !TextUtils.isEmpty(str2)) {
                                    f340855j.contains(str2);
                                }
                                reentrantReadWriteLock.readLock().unlock();
                                return true;
                            } catch (UnsatisfiedLinkError e12) {
                                String message = e12.getMessage();
                                if (message == null || !message.contains("unexpected e_machine:")) {
                                    throw e12;
                                }
                                c cVar = new c("APK was built for a different platform. Supported ABIs: " + Arrays.toString(SysUtil.MarshmallowSysdeps.getSupportedAbis()) + " error: " + message.substring(message.lastIndexOf("unexpected e_machine:")));
                                cVar.initCause(e12);
                                throw cVar;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    f340848c.readLock().unlock();
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static void init(Context context, int i12) {
        String[] strArr = f340856k;
        if (h()) {
            return;
        }
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            int i13 = f340858m;
            if (i13 == 0) {
                if ((i12 & 32) != 0 || context == null) {
                    i13 = 1;
                } else {
                    int i14 = context.getApplicationInfo().flags;
                    i13 = (i14 & 1) == 0 ? 1 : (i14 & 128) != 0 ? 3 : 2;
                    Log.isLoggable("SoLoader", 3);
                }
            }
            f340858m = i13;
            if ((i12 & 128) == 0 && SysUtil.d(i13, context)) {
                i12 |= 72;
            }
            f();
            g(context, i12, strArr);
            C41358a.b(new y());
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
        } catch (Throwable th2) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            throw th2;
        }
    }
}
