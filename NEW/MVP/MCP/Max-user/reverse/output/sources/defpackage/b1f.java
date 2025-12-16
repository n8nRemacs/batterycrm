package defpackage;

import android.database.SQLException;
import android.os.ConditionVariable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.media3.database.DatabaseIOException;
import androidx.media3.datasource.cache.Cache$CacheException;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.TreeSet;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public final class b1f implements ey0 {
    public static final HashSet j = new HashSet();
    public final File a;
    public final ny0 b;
    public final ra3 c;
    public final py0 d;
    public final HashMap e;
    public final Random f;
    public final boolean g;
    public long h;
    public Cache$CacheException i;

    public b1f(File file, ny0 ny0Var, df4 df4Var, boolean z) {
        fa6 fa6Var;
        boolean zAdd;
        ra3 ra3Var = new ra3();
        ra3Var.a = new HashMap();
        ra3Var.b = new SparseArray();
        ra3Var.c = new SparseBooleanArray();
        ra3Var.d = new SparseBooleanArray();
        py0 py0Var = null;
        if (df4Var != null) {
            fa6Var = new fa6();
            fa6Var.b = df4Var;
            fa6Var.c = new SparseArray();
        } else {
            fa6Var = null;
        }
        we weVar = new we(new File(file, "cached_content_index.exi"));
        if (fa6Var == null || z) {
            String str = zxg.a;
            ra3Var.e = weVar;
            ra3Var.f = fa6Var;
        } else {
            ra3Var.e = fa6Var;
            ra3Var.f = weVar;
        }
        if (df4Var != null && !z) {
            py0Var = new py0(0, df4Var);
        }
        synchronized (b1f.class) {
            zAdd = j.add(file.getAbsoluteFile());
        }
        if (!zAdd) {
            throw new IllegalStateException("Another SimpleCache instance uses the folder: " + file);
        }
        this.a = file;
        this.b = ny0Var;
        this.c = ra3Var;
        this.d = py0Var;
        this.e = new HashMap();
        this.f = new Random();
        this.g = true;
        this.h = -1L;
        ConditionVariable conditionVariable = new ConditionVariable();
        new rj4(this, conditionVariable, 2).start();
        conditionVariable.block();
    }

    public static void a(b1f b1fVar) throws NumberFormatException {
        long j2;
        py0 py0Var = b1fVar.d;
        ra3 ra3Var = b1fVar.c;
        File file = b1fVar.a;
        if (!file.exists()) {
            try {
                e(file);
            } catch (Cache$CacheException e) {
                b1fVar.i = e;
                return;
            }
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            String str = "Failed to list cache directory files: " + file;
            a8i.g("SimpleCache", str);
            b1fVar.i = new Cache$CacheException(str);
            return;
        }
        int length = fileArrListFiles.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                j2 = -1;
                break;
            }
            File file2 = fileArrListFiles[i];
            String name = file2.getName();
            if (name.endsWith(".uid")) {
                try {
                    j2 = Long.parseLong(name.substring(0, name.indexOf(46)), 16);
                    break;
                } catch (NumberFormatException unused) {
                    a8i.g("SimpleCache", "Malformed UID file: " + file2);
                    file2.delete();
                }
            }
            i++;
        }
        b1fVar.h = j2;
        if (j2 == -1) {
            try {
                b1fVar.h = f(file);
            } catch (IOException e2) {
                String str2 = "Failed to create cache UID: " + file;
                a8i.h("SimpleCache", str2, e2);
                b1fVar.i = new Cache$CacheException(str2, e2);
                return;
            }
        }
        try {
            ra3Var.h(b1fVar.h);
            if (py0Var != null) {
                py0Var.G(b1fVar.h);
                HashMap mapA = py0Var.A();
                b1fVar.j(file, true, fileArrListFiles, mapA);
                py0Var.K(mapA.keySet());
            } else {
                b1fVar.j(file, true, fileArrListFiles, null);
            }
            rrg it = hh7.j(((HashMap) ra3Var.a).keySet()).iterator();
            while (it.hasNext()) {
                ra3Var.k((String) it.next());
            }
            try {
                ra3Var.l();
            } catch (IOException e3) {
                a8i.h("SimpleCache", "Storing index file failed", e3);
            }
        } catch (IOException e4) {
            String str3 = "Failed to initialize cache indices: " + file;
            a8i.h("SimpleCache", str3, e4);
            b1fVar.i = new Cache$CacheException(str3, e4);
        }
    }

    public static void e(File file) throws Cache$CacheException {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = "Failed to create cache directory: " + file;
        a8i.g("SimpleCache", str);
        throw new Cache$CacheException(str);
    }

    public static long f(File file) throws IOException {
        long jNextLong = new SecureRandom().nextLong();
        long jAbs = jNextLong == Long.MIN_VALUE ? 0L : Math.abs(jNextLong);
        File file2 = new File(file, az1.i(Long.toString(jAbs, 16), ".uid"));
        if (file2.createNewFile()) {
            return jAbs;
        }
        throw new IOException("Failed to create UID file: " + file2);
    }

    public final void b(e1f e1fVar) {
        String str = e1fVar.a;
        this.c.g(str).c.add(e1fVar);
        ArrayList arrayList = (ArrayList) this.e.get(str);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((ny0) arrayList.get(size)).a(this, e1fVar);
            }
        }
        this.b.a(this, e1fVar);
    }

    public final synchronized void c(String str, k34 k34Var) {
        d();
        ra3 ra3Var = this.c;
        gz0 gz0VarG = ra3Var.g(str);
        vk4 vk4Var = gz0VarG.e;
        vk4 vk4VarB = vk4Var.b(k34Var);
        gz0VarG.e = vk4VarB;
        if (!vk4VarB.equals(vk4Var)) {
            ((hz0) ra3Var.e).e(gz0VarG);
        }
        try {
            this.c.l();
        } catch (IOException e) {
            throw new Cache$CacheException(e);
        }
    }

    public final synchronized void d() {
        Cache$CacheException cache$CacheException = this.i;
        if (cache$CacheException != null) {
            throw cache$CacheException;
        }
    }

    public final synchronized long g(long j2, long j3, String str) {
        long j4;
        long j5 = BuildConfig.MAX_TIME_TO_UPLOAD;
        long j6 = j3 == -1 ? Long.MAX_VALUE : j2 + j3;
        if (j6 >= 0) {
            j5 = j6;
        }
        long j7 = j2;
        j4 = 0;
        while (j7 < j5) {
            long jH = h(j7, j5 - j7, str);
            if (jH > 0) {
                j4 += jH;
            } else {
                jH = -jH;
            }
            j7 += jH;
        }
        return j4;
    }

    public final synchronized long h(long j2, long j3, String str) {
        gz0 gz0VarF;
        if (j3 == -1) {
            j3 = BuildConfig.MAX_TIME_TO_UPLOAD;
        }
        gz0VarF = this.c.f(str);
        return gz0VarF != null ? gz0VarF.a(j2, j3) : -j3;
    }

    public final synchronized vk4 i(String str) {
        gz0 gz0VarF;
        gz0VarF = this.c.f(str);
        return gz0VarF != null ? gz0VarF.e : vk4.c;
    }

    public final void j(File file, boolean z, File[] fileArr, Map map) throws NumberFormatException {
        long j2;
        long j3;
        if (fileArr == null || fileArr.length == 0) {
            if (z) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (z && name.indexOf(46) == -1) {
                j(file2, false, file2.listFiles(), map);
            } else if (!z || (!name.startsWith("cached_content_index.exi") && !name.endsWith(".uid"))) {
                oy0 oy0Var = map != null ? (oy0) map.remove(name) : null;
                if (oy0Var != null) {
                    j2 = oy0Var.a;
                    j3 = oy0Var.b;
                } else {
                    j2 = -1;
                    j3 = -9223372036854775807L;
                }
                e1f e1fVarC = e1f.c(file2, j2, j3, this.c);
                if (e1fVarC != null) {
                    b(e1fVarC);
                } else {
                    file2.delete();
                }
            }
        }
    }

    public final synchronized void k(e1f e1fVar) {
        gz0 gz0VarF = this.c.f(e1fVar.a);
        gz0VarF.getClass();
        long j2 = e1fVar.b;
        ArrayList arrayList = gz0VarF.d;
        for (int i = 0; i < arrayList.size(); i++) {
            if (((ez0) arrayList.get(i)).a == j2) {
                arrayList.remove(i);
                this.c.k(gz0VarF.b);
                notifyAll();
            }
        }
        throw new IllegalStateException();
    }

    public final synchronized void l(String str) {
        gz0 gz0VarF;
        synchronized (this) {
            try {
                gz0VarF = this.c.f(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = ((gz0VarF == null || gz0VarF.c.isEmpty()) ? new TreeSet() : new TreeSet((Collection) gz0VarF.c)).iterator();
        while (it.hasNext()) {
            m((xy0) it.next());
        }
    }

    public final void m(xy0 xy0Var) throws DatabaseIOException {
        String str = xy0Var.a;
        File file = xy0Var.o;
        ra3 ra3Var = this.c;
        gz0 gz0VarF = ra3Var.f(str);
        if (gz0VarF == null || !gz0VarF.c.remove(xy0Var)) {
            return;
        }
        if (file != null) {
            file.delete();
        }
        py0 py0Var = this.d;
        if (py0Var != null) {
            file.getClass();
            String name = file.getName();
            try {
                ((String) py0Var.c).getClass();
                try {
                    ((df4) py0Var.b).getWritableDatabase().delete((String) py0Var.c, "name = ?", new String[]{name});
                } catch (SQLException e) {
                    throw new DatabaseIOException(e);
                }
            } catch (IOException unused) {
                wy1.r("Failed to remove file index entry for: ", name, "SimpleCache");
            }
        }
        ra3Var.k(gz0VarF.b);
        ArrayList arrayList = (ArrayList) this.e.get(xy0Var.a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((ny0) arrayList.get(size)).d(this, xy0Var);
            }
        }
        this.b.d(this, xy0Var);
    }

    public final void n() throws DatabaseIOException {
        ArrayList arrayList = new ArrayList();
        Iterator it = Collections.unmodifiableCollection(((HashMap) this.c.a).values()).iterator();
        while (it.hasNext()) {
            Iterator it2 = ((gz0) it.next()).c.iterator();
            while (it2.hasNext()) {
                xy0 xy0Var = (xy0) it2.next();
                File file = xy0Var.o;
                file.getClass();
                if (file.length() != xy0Var.c) {
                    arrayList.add(xy0Var);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            m((xy0) arrayList.get(i));
        }
    }

    public final synchronized e1f o(long j2, long j3, String str) {
        long j4;
        e1f e1fVarB;
        d();
        gz0 gz0VarF = this.c.f(str);
        if (gz0VarF != null) {
            j4 = j2;
            while (true) {
                e1fVarB = gz0VarF.b(j4, j3);
                if (!e1fVarB.d) {
                    break;
                }
                File file = e1fVarB.o;
                file.getClass();
                if (file.length() == e1fVarB.c) {
                    break;
                }
                n();
            }
        } else {
            j4 = j2;
            e1fVarB = new e1f(str, j4, j3, -9223372036854775807L, null);
        }
        if (e1fVarB.d) {
            return p(str, e1fVarB);
        }
        gz0 gz0VarG = this.c.g(str);
        long j5 = e1fVarB.c;
        ArrayList arrayList = gz0VarG.d;
        for (int i = 0; i < arrayList.size(); i++) {
            ez0 ez0Var = (ez0) arrayList.get(i);
            long j6 = ez0Var.a;
            if (j6 <= j4) {
                long j7 = ez0Var.b;
                if (j7 == -1 || j6 + j7 > j4) {
                    return null;
                }
            } else {
                if (j5 == -1 || j4 + j5 > j6) {
                    return null;
                }
            }
        }
        arrayList.add(new ez0(j4, j5));
        return e1fVarB;
    }

    public final e1f p(String str, e1f e1fVar) throws SQLException {
        boolean z;
        File file;
        File file2 = e1fVar.o;
        if (!this.g) {
            return e1fVar;
        }
        file2.getClass();
        String name = file2.getName();
        long j2 = e1fVar.c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        py0 py0Var = this.d;
        if (py0Var != null) {
            try {
                py0Var.L(j2, jCurrentTimeMillis, name);
            } catch (IOException unused) {
                jCurrentTimeMillis = jCurrentTimeMillis;
                a8i.l("SimpleCache", "Failed to update index with new touch timestamp.");
            }
            z = false;
        } else {
            z = true;
        }
        gz0 gz0VarF = this.c.f(str);
        gz0VarF.getClass();
        TreeSet treeSet = gz0VarF.c;
        hsi.g(treeSet.remove(e1fVar));
        file2.getClass();
        if (z) {
            File parentFile = file2.getParentFile();
            parentFile.getClass();
            File fileD = e1f.d(parentFile, gz0VarF.a, e1fVar.b, jCurrentTimeMillis);
            if (file2.renameTo(fileD)) {
                file = fileD;
            } else {
                a8i.l("CachedContent", "Failed to rename " + file2 + " to " + fileD);
                file = file2;
            }
        } else {
            file = file2;
        }
        hsi.g(e1fVar.d);
        e1f e1fVar2 = new e1f(e1fVar.a, e1fVar.b, e1fVar.c, jCurrentTimeMillis, file);
        treeSet.add(e1fVar2);
        ArrayList arrayList = (ArrayList) this.e.get(e1fVar.a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((ny0) arrayList.get(size)).c(this, e1fVar, e1fVar2);
            }
        }
        this.b.c(this, e1fVar, e1fVar2);
        return e1fVar2;
    }
}
