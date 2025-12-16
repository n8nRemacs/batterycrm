package com.google.android.exoplayer2.upstream.cache;

import android.database.SQLException;
import android.os.ConditionVariable;
import com.google.android.exoplayer2.database.DatabaseIOException;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.h;
import com.google.android.exoplayer2.util.C36585a;
import com.google.android.exoplayer2.util.C36605v;
import com.google.common.collect.H1;
import j.P;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

/* compiled from: SimpleCache.java */
/* loaded from: classes6.dex */
public final class q implements Cache {

    /* renamed from: l, reason: collision with root package name */
    public static final HashSet<File> f347892l = new HashSet<>();

    /* renamed from: a, reason: collision with root package name */
    public final File f347893a;

    /* renamed from: b, reason: collision with root package name */
    public final m f347894b;

    /* renamed from: c, reason: collision with root package name */
    public final i f347895c;

    /* renamed from: d, reason: collision with root package name */
    @P
    public final d f347896d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap<String, ArrayList<Cache.a>> f347897e;

    /* renamed from: f, reason: collision with root package name */
    public final Random f347898f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f347899g;

    /* renamed from: h, reason: collision with root package name */
    public long f347900h;

    /* renamed from: i, reason: collision with root package name */
    public long f347901i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f347902j;

    /* renamed from: k, reason: collision with root package name */
    public Cache.CacheException f347903k;

    public q(File file, m mVar, com.google.android.exoplayer2.database.f fVar) {
        boolean zAdd;
        i iVar = new i(fVar, file);
        d dVar = new d(fVar);
        synchronized (q.class) {
            zAdd = f347892l.add(file.getAbsoluteFile());
        }
        if (!zAdd) {
            throw new IllegalStateException(androidx.compose.ui.graphics.colorspace.e.j(file, "Another SimpleCache instance uses the folder: "));
        }
        this.f347893a = file;
        this.f347894b = mVar;
        this.f347895c = iVar;
        this.f347896d = dVar;
        this.f347897e = new HashMap<>();
        this.f347898f = new Random();
        this.f347899g = true;
        this.f347900h = -1L;
        ConditionVariable conditionVariable = new ConditionVariable();
        new p(this, conditionVariable).start();
        conditionVariable.block();
    }

    public static void j(q qVar) throws NumberFormatException {
        long j12;
        i iVar = qVar.f347895c;
        File file = qVar.f347893a;
        if (!file.exists()) {
            try {
                m(file);
            } catch (Cache.CacheException e12) {
                qVar.f347903k = e12;
                return;
            }
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            qVar.f347903k = new Cache.CacheException(androidx.compose.ui.graphics.colorspace.e.j(file, "Failed to list cache directory files: "));
            return;
        }
        int length = fileArrListFiles.length;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                j12 = -1;
                break;
            }
            File file2 = fileArrListFiles[i12];
            String name = file2.getName();
            if (name.endsWith(".uid")) {
                try {
                    j12 = Long.parseLong(name.substring(0, name.indexOf(46)), 16);
                    break;
                } catch (NumberFormatException unused) {
                    file2.toString();
                    file2.delete();
                }
            }
            i12++;
        }
        qVar.f347900h = j12;
        if (j12 == -1) {
            try {
                qVar.f347900h = n(file);
            } catch (IOException e13) {
                String str = "Failed to create cache UID: " + file;
                C36605v.a(str, e13);
                qVar.f347903k = new Cache.CacheException(str, e13);
                return;
            }
        }
        try {
            iVar.e(qVar.f347900h);
            d dVar = qVar.f347896d;
            if (dVar != null) {
                dVar.b(qVar.f347900h);
                HashMap mapA = dVar.a();
                qVar.p(file, true, fileArrListFiles, mapA);
                dVar.c(mapA.keySet());
            } else {
                qVar.p(file, true, fileArrListFiles, null);
            }
            Iterator it = H1.v(iVar.f347865a.keySet()).iterator();
            while (it.hasNext()) {
                iVar.f((String) it.next());
            }
            try {
                iVar.g();
            } catch (IOException e14) {
                C36605v.a("Storing index file failed", e14);
            }
        } catch (IOException e15) {
            String str2 = "Failed to initialize cache indices: " + file;
            C36605v.a(str2, e15);
            qVar.f347903k = new Cache.CacheException(str2, e15);
        }
    }

    public static void m(File file) throws Cache.CacheException {
        if (!file.mkdirs() && !file.isDirectory()) {
            throw new Cache.CacheException(androidx.compose.ui.graphics.colorspace.e.j(file, "Failed to create cache directory: "));
        }
    }

    public static long n(File file) throws IOException {
        long jNextLong = new SecureRandom().nextLong();
        long jAbs = jNextLong == Long.MIN_VALUE ? 0L : Math.abs(jNextLong);
        File file2 = new File(file, androidx.appcompat.app.r.q(Long.toString(jAbs, 16), ".uid"));
        if (file2.createNewFile()) {
            return jAbs;
        }
        throw new IOException(androidx.compose.ui.graphics.colorspace.e.j(file2, "Failed to create UID file: "));
    }

    public static synchronized void u(File file) {
        f347892l.remove(file.getAbsoluteFile());
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public final synchronized f a(long j12, long j13, String str) {
        f fVarI;
        C36585a.d(!this.f347902j);
        l();
        while (true) {
            fVarI = i(j12, j13, str);
            if (fVarI == null) {
                wait();
            }
        }
        return fVarI;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public final synchronized long b() {
        C36585a.d(!this.f347902j);
        return this.f347901i;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public final synchronized l c(String str) {
        h hVarC;
        C36585a.d(!this.f347902j);
        hVarC = this.f347895c.c(str);
        return hVarC != null ? hVarC.f347862e : l.f347883c;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public final synchronized void d(String str, k kVar) {
        C36585a.d(!this.f347902j);
        l();
        i iVar = this.f347895c;
        h hVarD = iVar.d(str);
        l lVar = hVarD.f347862e;
        l lVarA = lVar.a(kVar);
        hVarD.f347862e = lVarA;
        if (!lVarA.equals(lVar)) {
            iVar.f347869e.g(hVarD);
        }
        try {
            this.f347895c.g();
        } catch (IOException e12) {
            throw new Cache.CacheException(e12);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public final synchronized long e(long j12, long j13, String str) {
        long j14;
        long j15 = j13 == -1 ? Long.MAX_VALUE : j12 + j13;
        long j16 = j15 >= 0 ? j15 : Long.MAX_VALUE;
        long j17 = j12;
        j14 = 0;
        while (j17 < j16) {
            long jG2 = g(j17, j16 - j17, str);
            if (jG2 > 0) {
                j14 += jG2;
            } else {
                jG2 = -jG2;
            }
            j17 += jG2;
        }
        return j14;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public final synchronized void f(String str) {
        C36585a.d(!this.f347902j);
        Iterator it = o(str).iterator();
        while (it.hasNext()) {
            r((f) it.next());
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public final synchronized long g(long j12, long j13, String str) {
        h hVarC;
        C36585a.d(!this.f347902j);
        if (j13 == -1) {
            j13 = Long.MAX_VALUE;
        }
        hVarC = this.f347895c.c(str);
        return hVarC != null ? hVarC.a(j12, j13) : -j13;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public final synchronized void h(f fVar) {
        C36585a.d(!this.f347902j);
        h hVarC = this.f347895c.c(fVar.f347842b);
        hVarC.getClass();
        long j12 = fVar.f347843c;
        int i12 = 0;
        while (true) {
            ArrayList<h.a> arrayList = hVarC.f347861d;
            if (i12 >= arrayList.size()) {
                throw new IllegalStateException();
            }
            if (arrayList.get(i12).f347863a == j12) {
                arrayList.remove(i12);
                this.f347895c.f(hVarC.f347859b);
                notifyAll();
            } else {
                i12++;
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    @P
    public final synchronized f i(long j12, long j13, String str) {
        r rVarB;
        r rVar;
        C36585a.d(!this.f347902j);
        l();
        h hVarC = this.f347895c.c(str);
        if (hVarC == null) {
            rVar = new r(str, j12, j13, -9223372036854775807L, null);
        } else {
            while (true) {
                rVarB = hVarC.b(j12, j13);
                if (!rVarB.f347845e || rVarB.f347846f.length() == rVarB.f347844d) {
                    break;
                }
                s();
            }
            rVar = rVarB;
        }
        if (rVar.f347845e) {
            return t(str, rVar);
        }
        h hVarD = this.f347895c.d(str);
        long j14 = rVar.f347844d;
        int i12 = 0;
        while (true) {
            ArrayList<h.a> arrayList = hVarD.f347861d;
            if (i12 >= arrayList.size()) {
                arrayList.add(new h.a(j12, j14));
                return rVar;
            }
            h.a aVar = arrayList.get(i12);
            long j15 = aVar.f347863a;
            if (j15 <= j12) {
                long j16 = aVar.f347864b;
                if (j16 == -1 || j15 + j16 > j12) {
                    break;
                }
                i12++;
            } else {
                if (j14 == -1 || j12 + j14 > j15) {
                    break;
                }
                i12++;
            }
        }
        return null;
    }

    public final void k(r rVar) {
        i iVar = this.f347895c;
        String str = rVar.f347842b;
        iVar.d(str).f347860c.add(rVar);
        this.f347901i += rVar.f347844d;
        ArrayList<Cache.a> arrayList = this.f347897e.get(str);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).c(this, rVar);
            }
        }
        this.f347894b.c(this, rVar);
    }

    public final synchronized void l() {
        Cache.CacheException cacheException = this.f347903k;
        if (cacheException != null) {
            throw cacheException;
        }
    }

    public final synchronized TreeSet o(String str) {
        h hVarC;
        try {
            C36585a.d(!this.f347902j);
            hVarC = this.f347895c.c(str);
        } catch (Throwable th2) {
            throw th2;
        }
        return (hVarC == null || hVarC.f347860c.isEmpty()) ? new TreeSet() : new TreeSet((Collection) hVarC.f347860c);
    }

    public final void p(File file, boolean z12, @P File[] fileArr, @P HashMap map) {
        long j12;
        long j13;
        if (fileArr == null || fileArr.length == 0) {
            if (z12) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (z12 && name.indexOf(46) == -1) {
                p(file2, false, file2.listFiles(), map);
            } else if (!z12 || (!name.startsWith("cached_content_index.exi") && !name.endsWith(".uid"))) {
                c cVar = map != null ? (c) map.remove(name) : null;
                if (cVar != null) {
                    j13 = cVar.f347836a;
                    j12 = cVar.f347837b;
                } else {
                    j12 = -9223372036854775807L;
                    j13 = -1;
                }
                r rVarB = r.b(file2, j13, j12, this.f347895c);
                if (rVarB != null) {
                    k(rVarB);
                } else {
                    file2.delete();
                }
            }
        }
    }

    public final synchronized void q() {
        if (this.f347902j) {
            return;
        }
        this.f347897e.clear();
        s();
        try {
            try {
                this.f347895c.g();
                u(this.f347893a);
            } catch (IOException e12) {
                C36605v.a("Storing index file failed", e12);
                u(this.f347893a);
            }
            this.f347902j = true;
        } catch (Throwable th2) {
            u(this.f347893a);
            this.f347902j = true;
            throw th2;
        }
    }

    public final void r(f fVar) throws DatabaseIOException {
        String str = fVar.f347842b;
        i iVar = this.f347895c;
        h hVarC = iVar.c(str);
        if (hVarC == null || !hVarC.f347860c.remove(fVar)) {
            return;
        }
        File file = fVar.f347846f;
        if (file != null) {
            file.delete();
        }
        this.f347901i -= fVar.f347844d;
        d dVar = this.f347896d;
        if (dVar != null) {
            String name = file.getName();
            try {
                dVar.f347840b.getClass();
                try {
                    dVar.f347839a.getWritableDatabase().delete(dVar.f347840b, "name = ?", new String[]{name});
                } catch (SQLException e12) {
                    throw new DatabaseIOException(e12);
                }
            } catch (IOException unused) {
            }
        }
        iVar.f(hVarC.f347859b);
        ArrayList<Cache.a> arrayList = this.f347897e.get(fVar.f347842b);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).a(fVar);
            }
        }
        this.f347894b.a(fVar);
    }

    public final void s() throws DatabaseIOException {
        ArrayList arrayList = new ArrayList();
        Iterator it = Collections.unmodifiableCollection(this.f347895c.f347865a.values()).iterator();
        while (it.hasNext()) {
            Iterator<r> it2 = ((h) it.next()).f347860c.iterator();
            while (it2.hasNext()) {
                r next = it2.next();
                if (next.f347846f.length() != next.f347844d) {
                    arrayList.add(next);
                }
            }
        }
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            r((f) arrayList.get(i12));
        }
    }

    public final r t(String str, r rVar) {
        boolean z12;
        File file;
        if (!this.f347899g) {
            return rVar;
        }
        File file2 = rVar.f347846f;
        file2.getClass();
        String name = file2.getName();
        long j12 = rVar.f347844d;
        long jCurrentTimeMillis = System.currentTimeMillis();
        d dVar = this.f347896d;
        if (dVar != null) {
            try {
                dVar.d(j12, jCurrentTimeMillis, name);
            } catch (IOException unused) {
            }
            z12 = false;
        } else {
            z12 = true;
        }
        h hVarC = this.f347895c.c(str);
        TreeSet<r> treeSet = hVarC.f347860c;
        C36585a.d(treeSet.remove(rVar));
        file2.getClass();
        if (z12) {
            File parentFile = file2.getParentFile();
            parentFile.getClass();
            File fileC = r.c(parentFile, hVarC.f347858a, rVar.f347843c, jCurrentTimeMillis);
            if (file2.renameTo(fileC)) {
                file = fileC;
            } else {
                file2.toString();
                fileC.toString();
                file = file2;
            }
        } else {
            file = file2;
        }
        C36585a.d(rVar.f347845e);
        r rVar2 = new r(rVar.f347842b, rVar.f347843c, rVar.f347844d, jCurrentTimeMillis, file);
        treeSet.add(rVar2);
        ArrayList<Cache.a> arrayList = this.f347897e.get(rVar.f347842b);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).b(this, rVar, rVar2);
            }
        }
        this.f347894b.b(this, rVar, rVar2);
        return rVar2;
    }
}
