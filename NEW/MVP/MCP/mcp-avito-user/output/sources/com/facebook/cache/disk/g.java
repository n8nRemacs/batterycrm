package com.facebook.cache.disk;

import android.os.StatFs;
import android.os.SystemClock;
import com.facebook.cache.disk.e;
import com.facebook.common.statfs.StatFsHelper;
import com.facebook.infer.annotation.Nullsafe;
import j.k0;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import pW0.C47024c;
import pW0.InterfaceC47022a;
import rW0.C47606c;
import rW0.InterfaceC47604a;
import uW0.C48986a;
import uW0.C48987b;
import yW0.C50194e;

/* compiled from: DiskStorageCache.java */
@J41.d
@Nullsafe
/* loaded from: classes5.dex */
public class g implements k, InterfaceC47604a {

    /* renamed from: o, reason: collision with root package name */
    public static final long f339773o = TimeUnit.HOURS.toMillis(2);

    /* renamed from: p, reason: collision with root package name */
    public static final long f339774p = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a, reason: collision with root package name */
    public final long f339775a;

    /* renamed from: b, reason: collision with root package name */
    public final long f339776b;

    /* renamed from: c, reason: collision with root package name */
    public final CountDownLatch f339777c;

    /* renamed from: d, reason: collision with root package name */
    public long f339778d;

    /* renamed from: e, reason: collision with root package name */
    public final com.facebook.cache.common.i f339779e;

    /* renamed from: f, reason: collision with root package name */
    @J41.a
    @k0
    public final HashSet f339780f;

    /* renamed from: g, reason: collision with root package name */
    public long f339781g;

    /* renamed from: h, reason: collision with root package name */
    public final StatFsHelper f339782h;

    /* renamed from: i, reason: collision with root package name */
    public final e f339783i;

    /* renamed from: j, reason: collision with root package name */
    public final c f339784j;

    /* renamed from: k, reason: collision with root package name */
    public final com.facebook.cache.common.h f339785k;

    /* renamed from: l, reason: collision with root package name */
    public final a f339786l;

    /* renamed from: m, reason: collision with root package name */
    public final C50194e f339787m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f339788n = new Object();

    /* compiled from: DiskStorageCache.java */
    @k0
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f339789a = false;

        /* renamed from: b, reason: collision with root package name */
        public long f339790b = -1;

        /* renamed from: c, reason: collision with root package name */
        public long f339791c = -1;

        public final synchronized long a() {
            return this.f339790b;
        }

        public final synchronized void b(long j12, long j13) {
            if (this.f339789a) {
                this.f339790b += j12;
                this.f339791c += j13;
            }
        }
    }

    /* compiled from: DiskStorageCache.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final long f339792a;

        /* renamed from: b, reason: collision with root package name */
        public final long f339793b;

        public b(long j12, long j13, long j14) {
            this.f339792a = j13;
            this.f339793b = j14;
        }
    }

    public g(e eVar, c cVar, b bVar, com.facebook.cache.common.i iVar, com.facebook.cache.common.h hVar, @I41.h C47606c c47606c, ExecutorService executorService) {
        StatFsHelper statFsHelper;
        this.f339775a = bVar.f339792a;
        long j12 = bVar.f339793b;
        this.f339776b = j12;
        this.f339778d = j12;
        StatFsHelper statFsHelper2 = StatFsHelper.f339847h;
        synchronized (StatFsHelper.class) {
            try {
                if (StatFsHelper.f339847h == null) {
                    StatFsHelper.f339847h = new StatFsHelper();
                }
                statFsHelper = StatFsHelper.f339847h;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f339782h = statFsHelper;
        this.f339783i = eVar;
        this.f339784j = cVar;
        this.f339781g = -1L;
        this.f339779e = iVar;
        this.f339785k = hVar;
        this.f339786l = new a();
        this.f339787m = C50194e.f443164a;
        this.f339780f = new HashSet();
        this.f339777c = new CountDownLatch(0);
    }

    @Override // com.facebook.cache.disk.k
    @I41.h
    public final InterfaceC47022a a(com.facebook.cache.common.c cVar) {
        InterfaceC47022a interfaceC47022aC;
        n nVarA = n.a();
        nVarA.f339804a = cVar;
        try {
            synchronized (this.f339788n) {
                try {
                    ArrayList arrayListA = com.facebook.cache.common.d.a(cVar);
                    String str = null;
                    interfaceC47022aC = null;
                    for (int i12 = 0; i12 < arrayListA.size() && (interfaceC47022aC = this.f339783i.c((str = (String) arrayListA.get(i12)), cVar)) == null; i12++) {
                    }
                    if (interfaceC47022aC == null) {
                        this.f339779e.getClass();
                        this.f339780f.remove(str);
                    } else {
                        str.getClass();
                        this.f339779e.getClass();
                        this.f339780f.add(str);
                    }
                } finally {
                }
            }
            return interfaceC47022aC;
        } catch (IOException unused) {
            this.f339785k.getClass();
            this.f339779e.getClass();
            return null;
        } finally {
            nVarA.b();
        }
    }

    @Override // com.facebook.cache.disk.k
    public final void b(com.facebook.cache.common.c cVar) {
        synchronized (this.f339788n) {
            try {
                ArrayList arrayListA = com.facebook.cache.common.d.a(cVar);
                for (int i12 = 0; i12 < arrayListA.size(); i12++) {
                    String str = (String) arrayListA.get(i12);
                    this.f339783i.remove(str);
                    this.f339780f.remove(str);
                }
            } catch (IOException e12) {
                com.facebook.cache.common.h hVar = this.f339785k;
                e12.getMessage();
                hVar.getClass();
            }
        }
    }

    @Override // com.facebook.cache.disk.k
    public final boolean c(com.facebook.cache.common.c cVar) {
        try {
            synchronized (this.f339788n) {
                try {
                    ArrayList arrayListA = com.facebook.cache.common.d.a(cVar);
                    for (int i12 = 0; i12 < arrayListA.size(); i12++) {
                        String str = (String) arrayListA.get(i12);
                        if (this.f339783i.e(str, cVar)) {
                            this.f339780f.add(str);
                            return true;
                        }
                    }
                    return false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (IOException unused) {
            n nVarA = n.a();
            nVarA.f339804a = cVar;
            this.f339779e.getClass();
            nVarA.b();
            return false;
        }
    }

    @Override // com.facebook.cache.disk.k
    public final InterfaceC47022a d(com.facebook.cache.common.c cVar, com.facebook.cache.common.k kVar) {
        String strB;
        C47024c c47024cCommit;
        n nVarA = n.a();
        nVarA.f339804a = cVar;
        this.f339779e.getClass();
        synchronized (this.f339788n) {
            try {
                if (cVar instanceof com.facebook.cache.common.g) {
                    ((com.facebook.cache.common.g) cVar).getClass();
                    throw null;
                }
                strB = com.facebook.cache.common.d.b(cVar);
            } catch (UnsupportedEncodingException e12) {
                throw new RuntimeException(e12);
            }
        }
        try {
            try {
                e.d dVarH = h(strB, cVar);
                try {
                    dVarH.a(kVar);
                    synchronized (this.f339788n) {
                        c47024cCommit = dVarH.commit();
                        this.f339780f.add(strB);
                        this.f339786l.b(c47024cCommit.f428572a.length(), 1L);
                    }
                    c47024cCommit.size();
                    this.f339786l.a();
                    this.f339779e.getClass();
                    return c47024cCommit;
                } finally {
                    if (!dVarH.s()) {
                        C48986a.a(g.class, "Failed to delete temp file");
                    }
                }
            } catch (IOException e13) {
                this.f339779e.getClass();
                C48987b c48987b = C48986a.f440079a;
                if (c48987b.a(6)) {
                    c48987b.c(6, g.class.getSimpleName(), "Failed inserting a file into the cache", e13);
                }
                throw e13;
            }
        } finally {
            nVarA.b();
        }
    }

    @J41.a
    public final void e(long j12) throws IOException {
        e eVar = this.f339783i;
        try {
            ArrayList arrayListF = f(eVar.f());
            a aVar = this.f339786l;
            long jA2 = aVar.a() - j12;
            Iterator it = arrayListF.iterator();
            int i12 = 0;
            long j13 = 0;
            while (it.hasNext()) {
                e.c cVar = (e.c) it.next();
                if (j13 > jA2) {
                    break;
                }
                long jB2 = eVar.b(cVar);
                this.f339780f.remove(cVar.getId());
                if (jB2 > 0) {
                    i12++;
                    j13 += jB2;
                    n nVarA = n.a();
                    this.f339779e.getClass();
                    nVarA.b();
                }
            }
            aVar.b(-j13, -i12);
            eVar.a();
        } catch (IOException e12) {
            e12.getMessage();
            this.f339785k.getClass();
            throw e12;
        }
    }

    public final ArrayList f(Collection collection) {
        this.f339787m.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() + f339773o;
        ArrayList arrayList = new ArrayList(collection.size());
        ArrayList arrayList2 = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            e.c cVar = (e.c) it.next();
            if (cVar.a() > jCurrentTimeMillis) {
                arrayList.add(cVar);
            } else {
                arrayList2.add(cVar);
            }
        }
        this.f339784j.getClass();
        Collections.sort(arrayList2, new com.facebook.cache.disk.b());
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    @J41.a
    public final boolean g() {
        boolean z12;
        long j12;
        boolean z13;
        this.f339787m.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        a aVar = this.f339786l;
        synchronized (aVar) {
            z12 = aVar.f339789a;
        }
        long jMax = -1;
        if (z12) {
            long j13 = this.f339781g;
            if (j13 != -1 && jCurrentTimeMillis - j13 <= f339774p) {
                return false;
            }
        }
        this.f339787m.getClass();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        long j14 = f339773o + jCurrentTimeMillis2;
        try {
            long size = 0;
            boolean z14 = false;
            int i12 = 0;
            for (e.c cVar : this.f339783i.f()) {
                i12++;
                size += cVar.getSize();
                if (cVar.a() > j14) {
                    cVar.getSize();
                    jMax = Math.max(cVar.a() - jCurrentTimeMillis2, jMax);
                    z14 = true;
                }
            }
            if (z14) {
                this.f339785k.getClass();
            }
            a aVar2 = this.f339786l;
            synchronized (aVar2) {
                j12 = aVar2.f339791c;
            }
            long j15 = i12;
            if (j12 == j15 && this.f339786l.a() == size) {
                z13 = true;
            } else {
                a aVar3 = this.f339786l;
                synchronized (aVar3) {
                    aVar3.f339791c = j15;
                    aVar3.f339790b = size;
                    z13 = true;
                    aVar3.f339789a = true;
                }
            }
            this.f339781g = jCurrentTimeMillis2;
            return z13;
        } catch (IOException e12) {
            com.facebook.cache.common.h hVar = this.f339785k;
            e12.getMessage();
            hVar.getClass();
            return false;
        }
    }

    public final e.d h(String str, com.facebook.cache.common.c cVar) {
        synchronized (this.f339788n) {
            boolean zG2 = g();
            i();
            long jA2 = this.f339786l.a();
            if (jA2 > this.f339778d && !zG2) {
                a aVar = this.f339786l;
                synchronized (aVar) {
                    aVar.f339789a = false;
                    aVar.f339791c = -1L;
                    aVar.f339790b = -1L;
                }
                g();
            }
            long j12 = this.f339778d;
            if (jA2 > j12) {
                e((j12 * 9) / 10);
            }
        }
        return this.f339783i.d(str, cVar);
    }

    @J41.a
    public final void i() {
        boolean zIsExternal = this.f339783i.isExternal();
        StatFsHelper.StorageType storageType = StatFsHelper.StorageType.f339856b;
        StatFsHelper.StorageType storageType2 = zIsExternal ? StatFsHelper.StorageType.f339857c : storageType;
        StatFsHelper statFsHelper = this.f339782h;
        long jA2 = this.f339776b - this.f339786l.a();
        statFsHelper.a();
        statFsHelper.a();
        ReentrantLock reentrantLock = statFsHelper.f339854f;
        if (reentrantLock.tryLock()) {
            try {
                if (SystemClock.uptimeMillis() - statFsHelper.f339853e > StatFsHelper.f339848i) {
                    statFsHelper.f339849a = StatFsHelper.b(statFsHelper.f339849a, statFsHelper.f339850b);
                    statFsHelper.f339851c = StatFsHelper.b(statFsHelper.f339851c, statFsHelper.f339852d);
                    statFsHelper.f339853e = SystemClock.uptimeMillis();
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        StatFs statFs = storageType2 == storageType ? statFsHelper.f339849a : statFsHelper.f339851c;
        long availableBlocksLong = statFs != null ? statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong() : 0L;
        if (availableBlocksLong <= 0 || availableBlocksLong < jA2) {
            this.f339778d = this.f339775a;
        } else {
            this.f339778d = this.f339776b;
        }
    }
}
