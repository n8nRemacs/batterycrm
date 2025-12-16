package com.bumptech.glide.disklrucache;

import android.annotation.TargetApi;
import android.os.StrictMode;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: DiskLruCache.java */
/* loaded from: classes5.dex */
public final class a implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public final File f338705b;

    /* renamed from: c, reason: collision with root package name */
    public final File f338706c;

    /* renamed from: d, reason: collision with root package name */
    public final File f338707d;

    /* renamed from: e, reason: collision with root package name */
    public final File f338708e;

    /* renamed from: g, reason: collision with root package name */
    public final long f338710g;

    /* renamed from: j, reason: collision with root package name */
    public BufferedWriter f338713j;

    /* renamed from: l, reason: collision with root package name */
    public int f338715l;

    /* renamed from: i, reason: collision with root package name */
    public long f338712i = 0;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashMap<String, d> f338714k = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: m, reason: collision with root package name */
    public long f338716m = 0;

    /* renamed from: n, reason: collision with root package name */
    public final ThreadPoolExecutor f338717n = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b(null));

    /* renamed from: o, reason: collision with root package name */
    public final Callable<Void> f338718o = new CallableC10498a();

    /* renamed from: f, reason: collision with root package name */
    public final int f338709f = 1;

    /* renamed from: h, reason: collision with root package name */
    public final int f338711h = 1;

    /* compiled from: DiskLruCache.java */
    /* renamed from: com.bumptech.glide.disklrucache.a$a, reason: collision with other inner class name */
    public class CallableC10498a implements Callable<Void> {
        public CallableC10498a() {
        }

        @Override // java.util.concurrent.Callable
        public final Void call() {
            synchronized (a.this) {
                try {
                    a aVar = a.this;
                    if (aVar.f338713j == null) {
                        return null;
                    }
                    aVar.p();
                    if (a.this.h()) {
                        a.this.n();
                        a.this.f338715l = 0;
                    }
                    return null;
                } finally {
                }
            }
        }
    }

    /* compiled from: DiskLruCache.java */
    public static final class b implements ThreadFactory {
        public b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public final synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }

        public /* synthetic */ b(CallableC10498a callableC10498a) {
            this();
        }
    }

    /* compiled from: DiskLruCache.java */
    public final class c {

        /* renamed from: a, reason: collision with root package name */
        public final d f338720a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean[] f338721b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f338722c;

        public c(d dVar, CallableC10498a callableC10498a) {
            this.f338720a = dVar;
            this.f338721b = dVar.f338728e ? null : new boolean[a.this.f338711h];
        }

        public final void a() {
            a.a(a.this, this, false);
        }

        public final File b() {
            File file;
            synchronized (a.this) {
                try {
                    d dVar = this.f338720a;
                    if (dVar.f338729f != this) {
                        throw new IllegalStateException();
                    }
                    if (!dVar.f338728e) {
                        this.f338721b[0] = true;
                    }
                    file = dVar.f338727d[0];
                    if (!a.this.f338705b.exists()) {
                        a.this.f338705b.mkdirs();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return file;
        }
    }

    /* compiled from: DiskLruCache.java */
    public final class d {

        /* renamed from: a, reason: collision with root package name */
        public final String f338724a;

        /* renamed from: b, reason: collision with root package name */
        public final long[] f338725b;

        /* renamed from: c, reason: collision with root package name */
        public final File[] f338726c;

        /* renamed from: d, reason: collision with root package name */
        public final File[] f338727d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f338728e;

        /* renamed from: f, reason: collision with root package name */
        public c f338729f;

        /* renamed from: g, reason: collision with root package name */
        public long f338730g;

        public d(String str, CallableC10498a callableC10498a) {
            this.f338724a = str;
            int i12 = a.this.f338711h;
            this.f338725b = new long[i12];
            this.f338726c = new File[i12];
            this.f338727d = new File[i12];
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('.');
            int length = sb2.length();
            for (int i13 = 0; i13 < a.this.f338711h; i13++) {
                sb2.append(i13);
                File[] fileArr = this.f338726c;
                String string = sb2.toString();
                File file = a.this.f338705b;
                fileArr[i13] = new File(file, string);
                sb2.append(".tmp");
                this.f338727d[i13] = new File(file, sb2.toString());
                sb2.setLength(length);
            }
        }

        public final String a() {
            StringBuilder sb2 = new StringBuilder();
            for (long j12 : this.f338725b) {
                sb2.append(' ');
                sb2.append(j12);
            }
            return sb2.toString();
        }
    }

    /* compiled from: DiskLruCache.java */
    public final class e {

        /* renamed from: a, reason: collision with root package name */
        public final File[] f338732a;

        public e(a aVar, String str, long j12, File[] fileArr, long[] jArr, CallableC10498a callableC10498a) {
            this.f338732a = fileArr;
        }
    }

    public a(File file, long j12) {
        this.f338705b = file;
        this.f338706c = new File(file, "journal");
        this.f338707d = new File(file, "journal.tmp");
        this.f338708e = new File(file, "journal.bkp");
        this.f338710g = j12;
    }

    public static void a(a aVar, c cVar, boolean z12) {
        synchronized (aVar) {
            d dVar = cVar.f338720a;
            if (dVar.f338729f != cVar) {
                throw new IllegalStateException();
            }
            if (z12 && !dVar.f338728e) {
                for (int i12 = 0; i12 < aVar.f338711h; i12++) {
                    if (!cVar.f338721b[i12]) {
                        cVar.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i12);
                    }
                    if (!dVar.f338727d[i12].exists()) {
                        cVar.a();
                        return;
                    }
                }
            }
            for (int i13 = 0; i13 < aVar.f338711h; i13++) {
                File file = dVar.f338727d[i13];
                if (!z12) {
                    c(file);
                } else if (file.exists()) {
                    File file2 = dVar.f338726c[i13];
                    file.renameTo(file2);
                    long j12 = dVar.f338725b[i13];
                    long length = file2.length();
                    dVar.f338725b[i13] = length;
                    aVar.f338712i = (aVar.f338712i - j12) + length;
                }
            }
            aVar.f338715l++;
            dVar.f338729f = null;
            if (dVar.f338728e || z12) {
                dVar.f338728e = true;
                aVar.f338713j.append((CharSequence) "CLEAN");
                aVar.f338713j.append(' ');
                aVar.f338713j.append((CharSequence) dVar.f338724a);
                aVar.f338713j.append((CharSequence) dVar.a());
                aVar.f338713j.append('\n');
                if (z12) {
                    long j13 = aVar.f338716m;
                    aVar.f338716m = 1 + j13;
                    dVar.f338730g = j13;
                }
            } else {
                aVar.f338714k.remove(dVar.f338724a);
                aVar.f338713j.append((CharSequence) "REMOVE");
                aVar.f338713j.append(' ');
                aVar.f338713j.append((CharSequence) dVar.f338724a);
                aVar.f338713j.append('\n');
            }
            f(aVar.f338713j);
            if (aVar.f338712i > aVar.f338710g || aVar.h()) {
                aVar.f338717n.submit(aVar.f338718o);
            }
        }
    }

    @TargetApi(AvailableCode.ERROR_NO_ACTIVITY)
    public static void b(BufferedWriter bufferedWriter) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void c(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    @TargetApi(AvailableCode.ERROR_NO_ACTIVITY)
    public static void f(BufferedWriter bufferedWriter) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static a i(File file, long j12) throws IOException {
        if (j12 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                o(file2, file3, false);
            }
        }
        a aVar = new a(file, j12);
        if (aVar.f338706c.exists()) {
            try {
                aVar.k();
                aVar.j();
                return aVar;
            } catch (IOException e12) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e12.getMessage() + ", removing");
                aVar.close();
                com.bumptech.glide.disklrucache.c.a(aVar.f338705b);
            }
        }
        file.mkdirs();
        a aVar2 = new a(file, j12);
        aVar2.n();
        return aVar2;
    }

    public static void o(File file, File file2, boolean z12) throws IOException {
        if (z12) {
            c(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f338713j == null) {
                return;
            }
            Iterator it = new ArrayList(this.f338714k.values()).iterator();
            while (it.hasNext()) {
                c cVar = ((d) it.next()).f338729f;
                if (cVar != null) {
                    cVar.a();
                }
            }
            p();
            b(this.f338713j);
            this.f338713j = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final c d(String str) {
        synchronized (this) {
            try {
                if (this.f338713j == null) {
                    throw new IllegalStateException("cache is closed");
                }
                d dVar = this.f338714k.get(str);
                if (dVar == null) {
                    dVar = new d(str, null);
                    this.f338714k.put(str, dVar);
                } else if (dVar.f338729f != null) {
                    return null;
                }
                c cVar = new c(dVar, null);
                dVar.f338729f = cVar;
                this.f338713j.append((CharSequence) "DIRTY");
                this.f338713j.append(' ');
                this.f338713j.append((CharSequence) str);
                this.f338713j.append('\n');
                f(this.f338713j);
                return cVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized e g(String str) {
        if (this.f338713j == null) {
            throw new IllegalStateException("cache is closed");
        }
        d dVar = this.f338714k.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.f338728e) {
            return null;
        }
        for (File file : dVar.f338726c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.f338715l++;
        this.f338713j.append((CharSequence) "READ");
        this.f338713j.append(' ');
        this.f338713j.append((CharSequence) str);
        this.f338713j.append('\n');
        if (h()) {
            this.f338717n.submit(this.f338718o);
        }
        return new e(this, str, dVar.f338730g, dVar.f338726c, dVar.f338725b, null);
    }

    public final boolean h() {
        int i12 = this.f338715l;
        return i12 >= 2000 && i12 >= this.f338714k.size();
    }

    public final void j() throws IOException {
        c(this.f338707d);
        Iterator<d> it = this.f338714k.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            c cVar = next.f338729f;
            int i12 = this.f338711h;
            int i13 = 0;
            if (cVar == null) {
                while (i13 < i12) {
                    this.f338712i += next.f338725b[i13];
                    i13++;
                }
            } else {
                next.f338729f = null;
                while (i13 < i12) {
                    c(next.f338726c[i13]);
                    c(next.f338727d[i13]);
                    i13++;
                }
                it.remove();
            }
        }
    }

    public final void k() {
        File file = this.f338706c;
        com.bumptech.glide.disklrucache.b bVar = new com.bumptech.glide.disklrucache.b(new FileInputStream(file), com.bumptech.glide.disklrucache.c.f338739a);
        try {
            String strA = bVar.a();
            String strA2 = bVar.a();
            String strA3 = bVar.a();
            String strA4 = bVar.a();
            String strA5 = bVar.a();
            if (!"libcore.io.DiskLruCache".equals(strA) || !"1".equals(strA2) || !Integer.toString(this.f338709f).equals(strA3) || !Integer.toString(this.f338711h).equals(strA4) || !"".equals(strA5)) {
                throw new IOException("unexpected journal header: [" + strA + ", " + strA2 + ", " + strA4 + ", " + strA5 + "]");
            }
            int i12 = 0;
            while (true) {
                try {
                    m(bVar.a());
                    i12++;
                } catch (EOFException unused) {
                    this.f338715l = i12 - this.f338714k.size();
                    if (bVar.f338737f == -1) {
                        n();
                    } else {
                        this.f338713j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), com.bumptech.glide.disklrucache.c.f338739a));
                    }
                    try {
                        bVar.close();
                        return;
                    } catch (RuntimeException e12) {
                        throw e12;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th2) {
            try {
                bVar.close();
            } catch (RuntimeException e13) {
                throw e13;
            } catch (Exception unused3) {
            }
            throw th2;
        }
    }

    public final void m(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i12 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i12);
        LinkedHashMap<String, d> linkedHashMap = this.f338714k;
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i12);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i12, iIndexOf2);
        }
        d dVar = linkedHashMap.get(strSubstring);
        if (dVar == null) {
            dVar = new d(strSubstring, null);
            linkedHashMap.put(strSubstring, dVar);
        }
        if (iIndexOf2 == -1 || iIndexOf != 5 || !str.startsWith("CLEAN")) {
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                dVar.f338729f = new c(dVar, null);
                return;
            } else {
                if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
        dVar.f338728e = true;
        dVar.f338729f = null;
        if (strArrSplit.length != a.this.f338711h) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
        }
        for (int i13 = 0; i13 < strArrSplit.length; i13++) {
            try {
                dVar.f338725b[i13] = Long.parseLong(strArrSplit[i13]);
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
            }
        }
    }

    public final synchronized void n() {
        try {
            BufferedWriter bufferedWriter = this.f338713j;
            if (bufferedWriter != null) {
                b(bufferedWriter);
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f338707d), com.bumptech.glide.disklrucache.c.f338739a));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write("1");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f338709f));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f338711h));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (d dVar : this.f338714k.values()) {
                    if (dVar.f338729f != null) {
                        bufferedWriter2.write("DIRTY " + dVar.f338724a + '\n');
                    } else {
                        bufferedWriter2.write("CLEAN " + dVar.f338724a + dVar.a() + '\n');
                    }
                }
                b(bufferedWriter2);
                if (this.f338706c.exists()) {
                    o(this.f338706c, this.f338708e, true);
                }
                o(this.f338707d, this.f338706c, false);
                this.f338708e.delete();
                this.f338713j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f338706c, true), com.bumptech.glide.disklrucache.c.f338739a));
            } catch (Throwable th2) {
                b(bufferedWriter2);
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final void p() {
        while (this.f338712i > this.f338710g) {
            String key = this.f338714k.entrySet().iterator().next().getKey();
            synchronized (this) {
                try {
                    if (this.f338713j == null) {
                        throw new IllegalStateException("cache is closed");
                    }
                    d dVar = this.f338714k.get(key);
                    if (dVar != null && dVar.f338729f == null) {
                        for (int i12 = 0; i12 < this.f338711h; i12++) {
                            File file = dVar.f338726c[i12];
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + file);
                            }
                            long j12 = this.f338712i;
                            long[] jArr = dVar.f338725b;
                            this.f338712i = j12 - jArr[i12];
                            jArr[i12] = 0;
                        }
                        this.f338715l++;
                        this.f338713j.append((CharSequence) "REMOVE");
                        this.f338713j.append(' ');
                        this.f338713j.append((CharSequence) key);
                        this.f338713j.append('\n');
                        this.f338714k.remove(key);
                        if (h()) {
                            this.f338717n.submit(this.f338718o);
                        }
                    }
                } finally {
                }
            }
        }
    }
}
