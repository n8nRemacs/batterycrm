package defpackage;

import android.os.ConditionVariable;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.android.exoplayer2.upstream.cache.Cache$CacheException;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final class a1f implements fy0 {
    public static final HashSet i = new HashSet();
    public final File a;
    public final v18 b;
    public final r30 c;
    public final HashMap d;
    public final Random e;
    public final boolean f;
    public long g;
    public Cache$CacheException h;

    public a1f(File file, v18 v18Var) {
        boolean zAdd;
        r30 r30Var = new r30();
        r30Var.b = new HashMap();
        r30Var.c = new SparseArray();
        r30Var.a = new SparseBooleanArray();
        r30Var.d = new SparseBooleanArray();
        lqh lqhVar = new lqh(new File(file, "cached_content_index.exi"));
        int i2 = xxg.a;
        r30Var.o = lqhVar;
        r30Var.X = null;
        synchronized (a1f.class) {
            zAdd = i.add(file.getAbsoluteFile());
        }
        if (!zAdd) {
            String strValueOf = String.valueOf(file);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 46);
            sb.append("Another SimpleCache instance uses the folder: ");
            sb.append(strValueOf);
            throw new IllegalStateException(sb.toString());
        }
        this.a = file;
        this.b = v18Var;
        this.c = r30Var;
        this.d = new HashMap();
        this.e = new Random();
        this.f = true;
        this.g = -1L;
        ConditionVariable conditionVariable = new ConditionVariable();
        new rj4(this, conditionVariable, 1).start();
        conditionVariable.block();
    }

    public static void a(a1f a1fVar) throws NumberFormatException {
        long j;
        r30 r30Var = a1fVar.c;
        File file = a1fVar.a;
        if (!file.exists()) {
            try {
                e(file);
            } catch (Cache$CacheException e) {
                a1fVar.h = e;
                return;
            }
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            String strValueOf = String.valueOf(file);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 38);
            sb.append("Failed to list cache directory files: ");
            sb.append(strValueOf);
            String string = sb.toString();
            Log.e("SimpleCache", string);
            a1fVar.h = new Cache$CacheException(string);
            return;
        }
        int length = fileArrListFiles.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                j = -1;
                break;
            }
            File file2 = fileArrListFiles[i2];
            String name = file2.getName();
            if (name.endsWith(".uid")) {
                try {
                    j = Long.parseLong(name.substring(0, name.indexOf(46)), 16);
                    break;
                } catch (NumberFormatException unused) {
                    String strValueOf2 = String.valueOf(file2);
                    StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 20);
                    sb2.append("Malformed UID file: ");
                    sb2.append(strValueOf2);
                    Log.e("SimpleCache", sb2.toString());
                    file2.delete();
                }
            }
            i2++;
        }
        a1fVar.g = j;
        if (j == -1) {
            try {
                a1fVar.g = f(file);
            } catch (IOException e2) {
                String strValueOf3 = String.valueOf(file);
                StringBuilder sb3 = new StringBuilder(strValueOf3.length() + 28);
                sb3.append("Failed to create cache UID: ");
                sb3.append(strValueOf3);
                String string2 = sb3.toString();
                pai.c("SimpleCache", string2, e2);
                a1fVar.h = new Cache$CacheException(string2, e2);
                return;
            }
        }
        try {
            r30Var.m(a1fVar.g);
            a1fVar.h(file, true, fileArrListFiles);
            rrg it = hh7.j(((HashMap) r30Var.b).keySet()).iterator();
            while (it.hasNext()) {
                r30Var.o((String) it.next());
            }
            try {
                r30Var.t();
            } catch (IOException e3) {
                pai.c("SimpleCache", "Storing index file failed", e3);
            }
        } catch (IOException e4) {
            String strValueOf4 = String.valueOf(file);
            StringBuilder sb4 = new StringBuilder(strValueOf4.length() + 36);
            sb4.append("Failed to initialize cache indices: ");
            sb4.append(strValueOf4);
            String string3 = sb4.toString();
            pai.c("SimpleCache", string3, e4);
            a1fVar.h = new Cache$CacheException(string3, e4);
        }
    }

    public static void e(File file) throws Cache$CacheException {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String strValueOf = String.valueOf(file);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 34);
        sb.append("Failed to create cache directory: ");
        sb.append(strValueOf);
        String string = sb.toString();
        Log.e("SimpleCache", string);
        throw new Cache$CacheException(string);
    }

    public static long f(File file) throws IOException {
        long jNextLong = new SecureRandom().nextLong();
        long jAbs = jNextLong == Long.MIN_VALUE ? 0L : Math.abs(jNextLong);
        String strValueOf = String.valueOf(Long.toString(jAbs, 16));
        File file2 = new File(file, ".uid".length() != 0 ? strValueOf.concat(".uid") : new String(strValueOf));
        if (file2.createNewFile()) {
            return jAbs;
        }
        String strValueOf2 = String.valueOf(file2);
        StringBuilder sb = new StringBuilder(strValueOf2.length() + 27);
        sb.append("Failed to create UID file: ");
        sb.append(strValueOf2);
        throw new IOException(sb.toString());
    }

    public final void b(d1f d1fVar) {
        String str = d1fVar.a;
        this.c.l(str).c.add(d1fVar);
        ArrayList arrayList = (ArrayList) this.d.get(str);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((v18) arrayList.get(size)).b(this, d1fVar);
            }
        }
        this.b.b(this, d1fVar);
    }

    public final synchronized void c(String str, j34 j34Var) {
        d();
        r30 r30Var = this.c;
        fz0 fz0VarL = r30Var.l(str);
        uk4 uk4Var = fz0VarL.e;
        uk4 uk4VarB = uk4Var.b(j34Var);
        fz0VarL.e = uk4VarB;
        if (!uk4VarB.equals(uk4Var)) {
            ((lqh) r30Var.o).q(fz0VarL);
        }
        try {
            this.c.t();
        } catch (IOException e) {
            throw new Cache$CacheException(e);
        }
    }

    public final synchronized void d() {
        Cache$CacheException cache$CacheException = this.h;
        if (cache$CacheException != null) {
            throw cache$CacheException;
        }
    }

    public final synchronized uk4 g(String str) {
        fz0 fz0VarK;
        fz0VarK = this.c.k(str);
        return fz0VarK != null ? fz0VarK.e : uk4.c;
    }

    public final void h(File file, boolean z, File[] fileArr) throws NumberFormatException {
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
                h(file2, false, file2.listFiles());
            } else if (!z || (!name.startsWith("cached_content_index.exi") && !name.endsWith(".uid"))) {
                d1f d1fVarC = d1f.c(file2, -1L, this.c);
                if (d1fVarC != null) {
                    b(d1fVarC);
                } else {
                    file2.delete();
                }
            }
        }
    }

    public final synchronized void i(d1f d1fVar) {
        fz0 fz0VarK = this.c.k(d1fVar.a);
        fz0VarK.getClass();
        long j = d1fVar.b;
        ArrayList arrayList = fz0VarK.d;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (((dz0) arrayList.get(i2)).a == j) {
                arrayList.remove(i2);
                this.c.o(fz0VarK.b);
                notifyAll();
            }
        }
        throw new IllegalStateException();
    }

    public final void j(wy0 wy0Var) {
        String str = wy0Var.a;
        long j = wy0Var.c;
        File file = wy0Var.o;
        r30 r30Var = this.c;
        fz0 fz0VarK = r30Var.k(str);
        if (fz0VarK == null || !fz0VarK.c.remove(wy0Var)) {
            return;
        }
        if (file != null) {
            file.delete();
        }
        r30Var.o(fz0VarK.b);
        ArrayList arrayList = (ArrayList) this.d.get(wy0Var.a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                v18 v18Var = (v18) arrayList.get(size);
                v18Var.a.remove(wy0Var);
                v18Var.b -= j;
            }
        }
        v18 v18Var2 = this.b;
        v18Var2.a.remove(wy0Var);
        v18Var2.b -= j;
    }

    public final void k() {
        ArrayList arrayList = new ArrayList();
        Iterator it = Collections.unmodifiableCollection(((HashMap) this.c.b).values()).iterator();
        while (it.hasNext()) {
            Iterator it2 = ((fz0) it.next()).c.iterator();
            while (it2.hasNext()) {
                wy0 wy0Var = (wy0) it2.next();
                if (wy0Var.o.length() != wy0Var.c) {
                    arrayList.add(wy0Var);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            j((wy0) arrayList.get(i2));
        }
    }

    public final synchronized d1f l(long j, long j2, String str) {
        long j3;
        d1f d1fVarA;
        d();
        fz0 fz0VarK = this.c.k(str);
        if (fz0VarK == null) {
            j3 = j;
            d1fVarA = new d1f(str, j3, j2, -9223372036854775807L, null);
        } else {
            j3 = j;
            while (true) {
                d1fVarA = fz0VarK.a(j3, j2);
                if (!d1fVarA.d || d1fVarA.o.length() == d1fVarA.c) {
                    break;
                }
                k();
            }
        }
        if (d1fVarA.d) {
            return m(str, d1fVarA);
        }
        fz0 fz0VarL = this.c.l(str);
        long j4 = d1fVarA.c;
        ArrayList arrayList = fz0VarL.d;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            dz0 dz0Var = (dz0) arrayList.get(i2);
            long j5 = dz0Var.a;
            if (j5 <= j3) {
                long j6 = dz0Var.b;
                if (j6 == -1 || j5 + j6 > j3) {
                    return null;
                }
            } else {
                if (j4 == -1 || j3 + j4 > j5) {
                    return null;
                }
            }
        }
        arrayList.add(new dz0(j3, j4));
        return d1fVarA;
    }

    public final d1f m(String str, d1f d1fVar) {
        File file;
        long j = d1fVar.c;
        File file2 = d1fVar.o;
        if (!this.f) {
            return d1fVar;
        }
        file2.getClass();
        file2.getName();
        long jCurrentTimeMillis = System.currentTimeMillis();
        fz0 fz0VarK = this.c.k(str);
        TreeSet treeSet = fz0VarK.c;
        fsi.d(treeSet.remove(d1fVar));
        File parentFile = file2.getParentFile();
        parentFile.getClass();
        File fileD = d1f.d(parentFile, fz0VarK.a, d1fVar.b, jCurrentTimeMillis);
        if (file2.renameTo(fileD)) {
            file = fileD;
        } else {
            String strValueOf = String.valueOf(file2);
            String strValueOf2 = String.valueOf(fileD);
            StringBuilder sb = new StringBuilder(strValueOf2.length() + strValueOf.length() + 21);
            sb.append("Failed to rename ");
            sb.append(strValueOf);
            sb.append(" to ");
            sb.append(strValueOf2);
            Log.w("CachedContent", sb.toString());
            file = file2;
        }
        fsi.d(d1fVar.d);
        d1f d1fVar2 = new d1f(d1fVar.a, d1fVar.b, d1fVar.c, jCurrentTimeMillis, file);
        treeSet.add(d1fVar2);
        ArrayList arrayList = (ArrayList) this.d.get(d1fVar.a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                v18 v18Var = (v18) arrayList.get(size);
                v18Var.a.remove(d1fVar);
                v18Var.b -= j;
                v18Var.b(this, d1fVar2);
            }
        }
        v18 v18Var2 = this.b;
        v18Var2.a.remove(d1fVar);
        v18Var2.b -= j;
        v18Var2.b(this, d1fVar2);
        return d1fVar2;
    }
}
