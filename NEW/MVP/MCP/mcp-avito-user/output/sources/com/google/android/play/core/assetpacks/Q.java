package com.google.android.play.core.assetpacks;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* loaded from: classes6.dex */
final class Q {

    /* renamed from: c, reason: collision with root package name */
    public static final com.google.android.play.core.assetpacks.internal.F f358210c = new com.google.android.play.core.assetpacks.internal.F("AssetPackStorage");

    /* renamed from: d, reason: collision with root package name */
    public static final long f358211d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f358212e;

    /* renamed from: a, reason: collision with root package name */
    public final Context f358213a;

    /* renamed from: b, reason: collision with root package name */
    public final C37171q1 f358214b;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        f358211d = timeUnit.toMillis(14L);
        f358212e = timeUnit.toMillis(28L);
    }

    public Q(Context context, C37171q1 c37171q1) {
        this.f358213a = context;
        this.f358214b = c37171q1;
    }

    public static long b(File file, boolean z12) {
        if (!file.exists()) {
            return -1L;
        }
        ArrayList arrayList = new ArrayList();
        com.google.android.play.core.assetpacks.internal.F f12 = f358210c;
        if (z12 && file.listFiles().length > 1) {
            f12.e("Multiple pack versions found, using highest version code.", new Object[0]);
        }
        try {
            for (File file2 : file.listFiles()) {
                if (!file2.getName().equals("stale.tmp")) {
                    arrayList.add(Long.valueOf(file2.getName()));
                }
            }
        } catch (NumberFormatException e12) {
            f12.c(e12, "Corrupt asset pack directories.", new Object[0]);
        }
        if (arrayList.isEmpty()) {
            return -1L;
        }
        Collections.sort(arrayList);
        return ((Long) arrayList.get(arrayList.size() - 1)).longValue();
    }

    public static void g(File file) {
        if (file.listFiles() == null || file.listFiles().length <= 1) {
            return;
        }
        long jB2 = b(file, false);
        for (File file2 : file.listFiles()) {
            if (!file2.getName().equals(String.valueOf(jB2)) && !file2.getName().equals("stale.tmp")) {
                h(file2);
            }
        }
    }

    public static boolean h(File file) {
        File[] fileArrListFiles = file.listFiles();
        boolean zH2 = true;
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                zH2 &= h(file2);
            }
        }
        if (file.delete()) {
            return zH2;
        }
        return false;
    }

    public final void a(int i12, long j12, String str) {
        File fileC = c(str);
        if (fileC.exists()) {
            for (File file : fileC.listFiles()) {
                if (!file.getName().equals(String.valueOf(i12)) && !file.getName().equals("stale.tmp")) {
                    h(file);
                } else if (file.getName().equals(String.valueOf(i12))) {
                    for (File file2 : file.listFiles()) {
                        if (!file2.getName().equals(String.valueOf(j12))) {
                            h(file2);
                        }
                    }
                }
            }
        }
    }

    public final File c(String str) {
        return new File(e(), str);
    }

    public final File d(int i12, long j12, String str) {
        return new File(new File(new File(new File(e(), "_tmp"), str), String.valueOf(i12)), String.valueOf(j12));
    }

    public final File e() {
        return new File(this.f358213a.getFilesDir(), "assetpacks");
    }

    public final ArrayList f() {
        ArrayList arrayList = new ArrayList();
        try {
        } catch (IOException e12) {
            f358210c.b("Could not process directory while scanning installed packs. %s", e12);
        }
        if (e().exists() && e().listFiles() != null) {
            for (File file : e().listFiles()) {
                if (!file.getCanonicalPath().equals(new File(e(), "_tmp").getCanonicalPath())) {
                    arrayList.add(file);
                }
            }
            return arrayList;
        }
        return arrayList;
    }

    public final int i(int i12, long j12, String str) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        File file = new File(new File(d(i12, j12, str), "_packs"), "merge.tmp");
        if (!file.exists()) {
            return 0;
        }
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            properties.load(fileInputStream);
            fileInputStream.close();
            if (properties.getProperty("numberOfMerges") == null) {
                throw new C37184v0("Merge checkpoint file corrupt.");
            }
            try {
                return Integer.parseInt(properties.getProperty("numberOfMerges"));
            } catch (NumberFormatException e12) {
                throw new C37184v0("Merge checkpoint file corrupt.", e12);
            }
        } catch (Throwable th2) {
            try {
                fileInputStream.close();
            } catch (Throwable th3) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                } catch (Exception unused) {
                }
            }
            throw th2;
        }
    }

    public final File j(int i12, long j12, String str) {
        return new File(new File(c(str), String.valueOf(i12)), String.valueOf(j12));
    }

    public final File k(String str, String str2, int i12, long j12) {
        return new File(new File(new File(d(i12, j12, str), "_slices"), "_unverified"), str2);
    }

    public final File l(String str, String str2, int i12, long j12) {
        return new File(new File(new File(d(i12, j12, str), "_slices"), "_verified"), str2);
    }

    @j.P
    public final String m(String str) {
        int length;
        File file = new File(e(), str);
        boolean zExists = file.exists();
        com.google.android.play.core.assetpacks.internal.F f12 = f358210c;
        if (!zExists) {
            f12.a("Pack not found with pack name: %s", str);
            return null;
        }
        C37171q1 c37171q1 = this.f358214b;
        File file2 = new File(file, String.valueOf(c37171q1.a()));
        if (!file2.exists()) {
            f12.a("Pack not found with pack name: %s app version: %s", str, Integer.valueOf(c37171q1.a()));
            return null;
        }
        File[] fileArrListFiles = file2.listFiles();
        if (fileArrListFiles == null || (length = fileArrListFiles.length) == 0) {
            f12.a("No pack version found for pack name: %s app version: %s", str, Integer.valueOf(c37171q1.a()));
            return null;
        }
        if (length <= 1) {
            return fileArrListFiles[0].getCanonicalPath();
        }
        f12.b("Multiple pack versions found for pack name: %s app version: %s", str, Integer.valueOf(c37171q1.a()));
        return null;
    }

    public final HashMap n() {
        HashMap map = new HashMap();
        Iterator it = f().iterator();
        while (it.hasNext()) {
            String name = ((File) it.next()).getName();
            int iB2 = (int) b(c(name), true);
            long jB2 = b(new File(c(name), String.valueOf(iB2)), true);
            if (j(iB2, jB2, name).exists()) {
                map.put(name, Long.valueOf(jB2));
            }
        }
        return map;
    }
}
