package com.jakewharton.disklrucache;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: DiskLruCache.java */
/* loaded from: classes7.dex */
public final class a implements Closeable {

    /* renamed from: p, reason: collision with root package name */
    public static final Pattern f364059p = Pattern.compile("[a-z0-9_-]{1,64}");

    /* renamed from: q, reason: collision with root package name */
    public static final OutputStream f364060q = new b();

    /* renamed from: b, reason: collision with root package name */
    public final File f364061b;

    /* renamed from: c, reason: collision with root package name */
    public final File f364062c;

    /* renamed from: d, reason: collision with root package name */
    public final File f364063d;

    /* renamed from: e, reason: collision with root package name */
    public final File f364064e;

    /* renamed from: f, reason: collision with root package name */
    public final int f364065f;

    /* renamed from: g, reason: collision with root package name */
    public final long f364066g;

    /* renamed from: h, reason: collision with root package name */
    public final int f364067h;

    /* renamed from: j, reason: collision with root package name */
    public BufferedWriter f364069j;

    /* renamed from: l, reason: collision with root package name */
    public int f364071l;

    /* renamed from: i, reason: collision with root package name */
    public long f364068i = 0;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashMap<String, d> f364070k = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: m, reason: collision with root package name */
    public long f364072m = 0;

    /* renamed from: n, reason: collision with root package name */
    public final ThreadPoolExecutor f364073n = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: o, reason: collision with root package name */
    public final Callable<Void> f364074o = new CallableC10767a();

    /* compiled from: DiskLruCache.java */
    /* renamed from: com.jakewharton.disklrucache.a$a, reason: collision with other inner class name */
    public class CallableC10767a implements Callable<Void> {
        public CallableC10767a() {
        }

        @Override // java.util.concurrent.Callable
        public final Void call() {
            synchronized (a.this) {
                try {
                    a aVar = a.this;
                    if (aVar.f364069j == null) {
                        return null;
                    }
                    aVar.o();
                    if (a.this.f()) {
                        a.this.k();
                        a.this.f364071l = 0;
                    }
                    return null;
                } finally {
                }
            }
        }
    }

    /* compiled from: DiskLruCache.java */
    public final class c {

        /* renamed from: a, reason: collision with root package name */
        public final d f364076a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean[] f364077b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f364078c;

        public c(d dVar, CallableC10767a callableC10767a) {
            this.f364076a = dVar;
            this.f364077b = dVar.f364083c ? null : new boolean[a.this.f364067h];
        }

        public final void a() {
            a.a(a.this, this, false);
        }

        public final void b() {
            boolean z12 = this.f364078c;
            a aVar = a.this;
            if (!z12) {
                a.a(aVar, this, true);
            } else {
                a.a(aVar, this, false);
                aVar.m(this.f364076a.f364081a);
            }
        }

        public final OutputStream c(int i12) {
            FileOutputStream fileOutputStream;
            C10768a c10768a;
            synchronized (a.this) {
                try {
                    d dVar = this.f364076a;
                    if (dVar.f364084d != this) {
                        throw new IllegalStateException();
                    }
                    if (!dVar.f364083c) {
                        this.f364077b[i12] = true;
                    }
                    File fileB = dVar.b(i12);
                    try {
                        fileOutputStream = new FileOutputStream(fileB);
                    } catch (FileNotFoundException unused) {
                        a.this.f364061b.mkdirs();
                        try {
                            fileOutputStream = new FileOutputStream(fileB);
                        } catch (FileNotFoundException unused2) {
                            return a.f364060q;
                        }
                    }
                    c10768a = new C10768a(fileOutputStream, null);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return c10768a;
        }

        /* compiled from: DiskLruCache.java */
        /* renamed from: com.jakewharton.disklrucache.a$c$a, reason: collision with other inner class name */
        public class C10768a extends FilterOutputStream {
            public C10768a(OutputStream outputStream, CallableC10767a callableC10767a) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() throws IOException {
                try {
                    ((FilterOutputStream) this).out.close();
                } catch (IOException unused) {
                    c.this.f364078c = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public final void flush() throws IOException {
                try {
                    ((FilterOutputStream) this).out.flush();
                } catch (IOException unused) {
                    c.this.f364078c = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public final void write(int i12) throws IOException {
                try {
                    ((FilterOutputStream) this).out.write(i12);
                } catch (IOException unused) {
                    c.this.f364078c = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public final void write(byte[] bArr, int i12, int i13) throws IOException {
                try {
                    ((FilterOutputStream) this).out.write(bArr, i12, i13);
                } catch (IOException unused) {
                    c.this.f364078c = true;
                }
            }
        }
    }

    /* compiled from: DiskLruCache.java */
    public final class d {

        /* renamed from: a, reason: collision with root package name */
        public final String f364081a;

        /* renamed from: b, reason: collision with root package name */
        public final long[] f364082b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f364083c;

        /* renamed from: d, reason: collision with root package name */
        public c f364084d;

        /* renamed from: e, reason: collision with root package name */
        public long f364085e;

        public d(String str, CallableC10767a callableC10767a) {
            this.f364081a = str;
            this.f364082b = new long[a.this.f364067h];
        }

        public final File a(int i12) {
            return new File(a.this.f364061b, this.f364081a + "." + i12);
        }

        public final File b(int i12) {
            return new File(a.this.f364061b, this.f364081a + "." + i12 + ".tmp");
        }

        public final String c() {
            StringBuilder sb2 = new StringBuilder();
            for (long j12 : this.f364082b) {
                sb2.append(' ');
                sb2.append(j12);
            }
            return sb2.toString();
        }
    }

    /* compiled from: DiskLruCache.java */
    public final class e implements Closeable {

        /* renamed from: b, reason: collision with root package name */
        public final InputStream[] f364087b;

        public e(a aVar, String str, long j12, InputStream[] inputStreamArr, long[] jArr, CallableC10767a callableC10767a) {
            this.f364087b = inputStreamArr;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            for (InputStream inputStream : this.f364087b) {
                Charset charset = com.jakewharton.disklrucache.c.f364094a;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (RuntimeException e12) {
                        throw e12;
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    public a(File file, int i12, int i13, long j12) {
        this.f364061b = file;
        this.f364065f = i12;
        this.f364062c = new File(file, "journal");
        this.f364063d = new File(file, "journal.tmp");
        this.f364064e = new File(file, "journal.bkp");
        this.f364067h = i13;
        this.f364066g = j12;
    }

    public static void a(a aVar, c cVar, boolean z12) {
        synchronized (aVar) {
            d dVar = cVar.f364076a;
            if (dVar.f364084d != cVar) {
                throw new IllegalStateException();
            }
            if (z12 && !dVar.f364083c) {
                for (int i12 = 0; i12 < aVar.f364067h; i12++) {
                    if (!cVar.f364077b[i12]) {
                        cVar.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i12);
                    }
                    if (!dVar.b(i12).exists()) {
                        cVar.a();
                        return;
                    }
                }
            }
            for (int i13 = 0; i13 < aVar.f364067h; i13++) {
                File fileB = dVar.b(i13);
                if (!z12) {
                    b(fileB);
                } else if (fileB.exists()) {
                    File fileA = dVar.a(i13);
                    fileB.renameTo(fileA);
                    long j12 = dVar.f364082b[i13];
                    long length = fileA.length();
                    dVar.f364082b[i13] = length;
                    aVar.f364068i = (aVar.f364068i - j12) + length;
                }
            }
            aVar.f364071l++;
            dVar.f364084d = null;
            if (dVar.f364083c || z12) {
                dVar.f364083c = true;
                aVar.f364069j.write("CLEAN " + dVar.f364081a + dVar.c() + '\n');
                if (z12) {
                    long j13 = aVar.f364072m;
                    aVar.f364072m = 1 + j13;
                    dVar.f364085e = j13;
                }
            } else {
                aVar.f364070k.remove(dVar.f364081a);
                aVar.f364069j.write("REMOVE " + dVar.f364081a + '\n');
            }
            aVar.f364069j.flush();
            if (aVar.f364068i > aVar.f364066g || aVar.f()) {
                aVar.f364073n.submit(aVar.f364074o);
            }
        }
    }

    public static void b(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static a g(File file, int i12, int i13, long j12) throws IOException {
        if (j12 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i13 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                n(file2, file3, false);
            }
        }
        a aVar = new a(file, i12, i13, j12);
        File file4 = aVar.f364062c;
        if (file4.exists()) {
            try {
                aVar.i();
                aVar.h();
                aVar.f364069j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file4, true), com.jakewharton.disklrucache.c.f364094a));
                return aVar;
            } catch (IOException e12) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e12.getMessage() + ", removing");
                aVar.close();
                com.jakewharton.disklrucache.c.a(aVar.f364061b);
            }
        }
        file.mkdirs();
        a aVar2 = new a(file, i12, i13, j12);
        aVar2.k();
        return aVar2;
    }

    public static void n(File file, File file2, boolean z12) throws IOException {
        if (z12) {
            b(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public static void p(String str) {
        if (!f364059p.matcher(str).matches()) {
            throw new IllegalArgumentException(AK.c.k("keys must match regex [a-z0-9_-]{1,64}: \"", str, "\""));
        }
    }

    public final c c(String str) {
        synchronized (this) {
            try {
                if (this.f364069j == null) {
                    throw new IllegalStateException("cache is closed");
                }
                p(str);
                d dVar = this.f364070k.get(str);
                if (dVar == null) {
                    dVar = new d(str, null);
                    this.f364070k.put(str, dVar);
                } else if (dVar.f364084d != null) {
                    return null;
                }
                c cVar = new c(dVar, null);
                dVar.f364084d = cVar;
                this.f364069j.write("DIRTY " + str + '\n');
                this.f364069j.flush();
                return cVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f364069j == null) {
                return;
            }
            Iterator it = new ArrayList(this.f364070k.values()).iterator();
            while (it.hasNext()) {
                c cVar = ((d) it.next()).f364084d;
                if (cVar != null) {
                    cVar.a();
                }
            }
            o();
            this.f364069j.close();
            this.f364069j = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized e d(String str) {
        InputStream inputStream;
        if (this.f364069j == null) {
            throw new IllegalStateException("cache is closed");
        }
        p(str);
        d dVar = this.f364070k.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.f364083c) {
            return null;
        }
        InputStream[] inputStreamArr = new InputStream[this.f364067h];
        for (int i12 = 0; i12 < this.f364067h; i12++) {
            try {
                inputStreamArr[i12] = new FileInputStream(dVar.a(i12));
            } catch (FileNotFoundException unused) {
                for (int i13 = 0; i13 < this.f364067h && (inputStream = inputStreamArr[i13]) != null; i13++) {
                    Charset charset = com.jakewharton.disklrucache.c.f364094a;
                    try {
                        inputStream.close();
                    } catch (RuntimeException e12) {
                        throw e12;
                    } catch (Exception unused2) {
                    }
                }
                return null;
            }
        }
        this.f364071l++;
        this.f364069j.append((CharSequence) ("READ " + str + '\n'));
        if (f()) {
            this.f364073n.submit(this.f364074o);
        }
        return new e(this, str, dVar.f364085e, inputStreamArr, dVar.f364082b, null);
    }

    public final boolean f() {
        int i12 = this.f364071l;
        return i12 >= 2000 && i12 >= this.f364070k.size();
    }

    public final void h() throws IOException {
        b(this.f364063d);
        Iterator<d> it = this.f364070k.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            c cVar = next.f364084d;
            int i12 = this.f364067h;
            int i13 = 0;
            if (cVar == null) {
                while (i13 < i12) {
                    this.f364068i += next.f364082b[i13];
                    i13++;
                }
            } else {
                next.f364084d = null;
                while (i13 < i12) {
                    b(next.a(i13));
                    b(next.b(i13));
                    i13++;
                }
                it.remove();
            }
        }
    }

    public final void i() {
        com.jakewharton.disklrucache.b bVar = new com.jakewharton.disklrucache.b(new FileInputStream(this.f364062c), com.jakewharton.disklrucache.c.f364094a);
        try {
            String strA = bVar.a();
            String strA2 = bVar.a();
            String strA3 = bVar.a();
            String strA4 = bVar.a();
            String strA5 = bVar.a();
            if (!"libcore.io.DiskLruCache".equals(strA) || !"1".equals(strA2) || !Integer.toString(this.f364065f).equals(strA3) || !Integer.toString(this.f364067h).equals(strA4) || !"".equals(strA5)) {
                throw new IOException("unexpected journal header: [" + strA + ", " + strA2 + ", " + strA4 + ", " + strA5 + "]");
            }
            int i12 = 0;
            while (true) {
                try {
                    j(bVar.a());
                    i12++;
                } catch (EOFException unused) {
                    this.f364071l = i12 - this.f364070k.size();
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

    public final void j(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i12 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i12);
        LinkedHashMap<String, d> linkedHashMap = this.f364070k;
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
                dVar.f364084d = new c(dVar, null);
                return;
            } else {
                if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
        dVar.f364083c = true;
        dVar.f364084d = null;
        if (strArrSplit.length != a.this.f364067h) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
        }
        for (int i13 = 0; i13 < strArrSplit.length; i13++) {
            try {
                dVar.f364082b[i13] = Long.parseLong(strArrSplit[i13]);
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
            }
        }
    }

    public final synchronized void k() {
        try {
            BufferedWriter bufferedWriter = this.f364069j;
            if (bufferedWriter != null) {
                bufferedWriter.close();
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f364063d), com.jakewharton.disklrucache.c.f364094a));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write("1");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f364065f));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f364067h));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (d dVar : this.f364070k.values()) {
                    if (dVar.f364084d != null) {
                        bufferedWriter2.write("DIRTY " + dVar.f364081a + '\n');
                    } else {
                        bufferedWriter2.write("CLEAN " + dVar.f364081a + dVar.c() + '\n');
                    }
                }
                bufferedWriter2.close();
                if (this.f364062c.exists()) {
                    n(this.f364062c, this.f364064e, true);
                }
                n(this.f364063d, this.f364062c, false);
                this.f364064e.delete();
                this.f364069j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f364062c, true), com.jakewharton.disklrucache.c.f364094a));
            } catch (Throwable th2) {
                bufferedWriter2.close();
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized void m(String str) {
        try {
            if (this.f364069j == null) {
                throw new IllegalStateException("cache is closed");
            }
            p(str);
            d dVar = this.f364070k.get(str);
            if (dVar != null && dVar.f364084d == null) {
                for (int i12 = 0; i12 < this.f364067h; i12++) {
                    File fileA = dVar.a(i12);
                    if (fileA.exists() && !fileA.delete()) {
                        throw new IOException("failed to delete " + fileA);
                    }
                    long j12 = this.f364068i;
                    long[] jArr = dVar.f364082b;
                    this.f364068i = j12 - jArr[i12];
                    jArr[i12] = 0;
                }
                this.f364071l++;
                this.f364069j.append((CharSequence) ("REMOVE " + str + '\n'));
                this.f364070k.remove(str);
                if (f()) {
                    this.f364073n.submit(this.f364074o);
                }
            }
        } finally {
        }
    }

    public final void o() {
        while (this.f364068i > this.f364066g) {
            m(this.f364070k.entrySet().iterator().next().getKey());
        }
    }

    /* compiled from: DiskLruCache.java */
    public static class b extends OutputStream {
        @Override // java.io.OutputStream
        public final void write(int i12) {
        }
    }
}
