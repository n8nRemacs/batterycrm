package defpackage;

import android.content.res.TypedArray;
import android.graphics.Color;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class a9h {
    public static int a(int i, int i2, long j) {
        return (Long.hashCode(j) + i) * i2;
    }

    public static int b(int i, int i2, boolean z) {
        return (Boolean.hashCode(z) + i) * i2;
    }

    public static wu5 c(int i, i5i i5iVar) {
        mli mliVar = new mli(i);
        if (((HashMap) i5iVar.b) == null) {
            i5iVar.b = new HashMap();
        }
        ((HashMap) i5iVar.b).put(emi.class, mliVar);
        return new wu5((String) i5iVar.a, ((HashMap) i5iVar.b) == null ? Collections.EMPTY_MAP : Collections.unmodifiableMap(new HashMap((HashMap) i5iVar.b)));
    }

    public static String d(long j, String str, String str2) {
        return str + j + str2;
    }

    public static String e(String str, long j, String str2, String str3) {
        return str + j + str2 + str3;
    }

    public static String f(String str, qyf qyfVar, String str2, qyf qyfVar2) {
        return str + qyfVar + str2 + qyfVar2;
    }

    public static HashMap g(Class cls, tci tciVar) {
        HashMap map = new HashMap();
        map.put(cls, tciVar);
        return map;
    }

    public static HashMap h(Class cls, mli mliVar) {
        HashMap map = new HashMap();
        map.put(cls, mliVar);
        return map;
    }

    public static HashSet i(HashMap map, String str, myf myfVar, int i) {
        map.put(str, myfVar);
        return new HashSet(i);
    }

    public static tci j(HashMap map, int i) {
        Collections.unmodifiableMap(new HashMap(map));
        return new tci(i);
    }

    public static mli k(HashMap map, int i) {
        Collections.unmodifiableMap(new HashMap(map));
        return new mli(i);
    }

    public static void l(int i, int i2, int i3, HashMap map, String str) {
        map.put(str, Integer.valueOf(Color.rgb(i, i2, i3)));
    }

    public static void m(ff6 ff6Var, sfg sfgVar) {
        sfgVar.d(new hf6(ff6Var));
    }

    public static /* synthetic */ void n(AutoCloseable autoCloseable) throws Exception {
        boolean zIsTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
                return;
            } else {
                if (!(autoCloseable instanceof MediaDrm)) {
                    throw new IllegalArgumentException();
                }
                ((MediaDrm) autoCloseable).release();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) autoCloseable;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static void o(String str, String str2, y6d y6dVar, String str3) {
        y6dVar.log(str3, str + str2);
    }

    public static void p(HashMap map) {
        Collections.unmodifiableMap(new HashMap(map));
    }

    public static /* synthetic */ String q(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "INACTIVE" : "ACTIVE_NON_STREAMING" : "ACTIVE_STREAMING";
    }

    public static /* synthetic */ int r(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("ATTENDEE")) {
            return 1;
        }
        if (str.equals("HAND_UP")) {
            return 2;
        }
        if (str.equals("FEEDBACK")) {
            return 3;
        }
        throw new IllegalArgumentException("No enum constant okcalls.r1.".concat(str));
    }
}
