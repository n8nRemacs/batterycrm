package com.android.volley.toolbox;

import android.os.SystemClock;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.android.volley.j;
import j.k0;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: DiskBasedCache.java */
/* renamed from: com.android.volley.toolbox.k, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C27631k implements com.android.volley.j {

    /* renamed from: c, reason: collision with root package name */
    public final c f67128c;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f67126a = new LinkedHashMap(16, 0.75f, true);

    /* renamed from: b, reason: collision with root package name */
    public long f67127b = 0;

    /* renamed from: d, reason: collision with root package name */
    public final int f67129d = 5242880;

    /* compiled from: DiskBasedCache.java */
    /* renamed from: com.android.volley.toolbox.k$c */
    public interface c {
    }

    public C27631k(c cVar) {
        this.f67128c = cVar;
    }

    public static String d(String str) {
        int length = str.length() / 2;
        StringBuilder sbR = androidx.compose.foundation.H.r(String.valueOf(str.substring(0, length).hashCode()));
        sbR.append(String.valueOf(str.substring(length).hashCode()));
        return sbR.toString();
    }

    public static int g(InputStream inputStream) throws IOException {
        int i12 = inputStream.read();
        if (i12 != -1) {
            return i12;
        }
        throw new EOFException();
    }

    public static int h(InputStream inputStream) {
        return (g(inputStream) << 24) | g(inputStream) | (g(inputStream) << 8) | (g(inputStream) << 16);
    }

    public static long i(InputStream inputStream) {
        return (g(inputStream) & 255) | ((g(inputStream) & 255) << 8) | ((g(inputStream) & 255) << 16) | ((g(inputStream) & 255) << 24) | ((g(inputStream) & 255) << 32) | ((g(inputStream) & 255) << 40) | ((g(inputStream) & 255) << 48) | ((255 & g(inputStream)) << 56);
    }

    public static String j(b bVar) {
        return new String(k(bVar, i(bVar)), Constants.ENCODING);
    }

    @k0
    public static byte[] k(b bVar, long j12) throws IOException {
        long j13 = bVar.f67138b - bVar.f67139c;
        if (j12 >= 0 && j12 <= j13) {
            int i12 = (int) j12;
            if (i12 == j12) {
                byte[] bArr = new byte[i12];
                new DataInputStream(bVar).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sbQ = androidx.compose.foundation.H.q(j12, "streamToBytes length=", ", maxLength=");
        sbQ.append(j13);
        throw new IOException(sbQ.toString());
    }

    public static void l(BufferedOutputStream bufferedOutputStream, int i12) throws IOException {
        bufferedOutputStream.write(i12 & 255);
        bufferedOutputStream.write((i12 >> 8) & 255);
        bufferedOutputStream.write((i12 >> 16) & 255);
        bufferedOutputStream.write((i12 >> 24) & 255);
    }

    public static void m(BufferedOutputStream bufferedOutputStream, long j12) throws IOException {
        bufferedOutputStream.write((byte) j12);
        bufferedOutputStream.write((byte) (j12 >>> 8));
        bufferedOutputStream.write((byte) (j12 >>> 16));
        bufferedOutputStream.write((byte) (j12 >>> 24));
        bufferedOutputStream.write((byte) (j12 >>> 32));
        bufferedOutputStream.write((byte) (j12 >>> 40));
        bufferedOutputStream.write((byte) (j12 >>> 48));
        bufferedOutputStream.write((byte) (j12 >>> 56));
    }

    public static void n(BufferedOutputStream bufferedOutputStream, String str) throws IOException {
        byte[] bytes = str.getBytes(Constants.ENCODING);
        m(bufferedOutputStream, bytes.length);
        bufferedOutputStream.write(bytes, 0, bytes.length);
    }

    @Override // com.android.volley.j
    public final synchronized void a() {
        File fileA = ((L) this.f67128c).a();
        if (!fileA.exists()) {
            if (!fileA.mkdirs()) {
                com.android.volley.z.a("Unable to create cache dir %s", fileA.getAbsolutePath());
            }
            return;
        }
        File[] fileArrListFiles = fileA.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            try {
                long length = file.length();
                b bVar = new b(new BufferedInputStream(new FileInputStream(file)), length);
                try {
                    a aVarA = a.a(bVar);
                    aVarA.f67130a = length;
                    f(aVarA.f67131b, aVarA);
                    bVar.close();
                } catch (Throwable th2) {
                    bVar.close();
                    throw th2;
                }
            } catch (IOException unused) {
                file.delete();
            }
        }
    }

    @Override // com.android.volley.j
    public final synchronized void b(String str, j.a aVar) {
        BufferedOutputStream bufferedOutputStream;
        a aVar2;
        long j12 = this.f67127b;
        byte[] bArr = aVar.f67066a;
        long length = j12 + bArr.length;
        int i12 = this.f67129d;
        if (length <= i12 || bArr.length <= i12 * 0.9f) {
            File fileC = c(str);
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileC));
                aVar2 = new a(str, aVar);
            } catch (IOException unused) {
                if (!fileC.delete()) {
                    com.android.volley.z.a("Could not clean up file %s", fileC.getAbsolutePath());
                }
                if (!((L) this.f67128c).a().exists()) {
                    com.android.volley.z.a("Re-initializing cache after external clearing.", new Object[0]);
                    this.f67126a.clear();
                    this.f67127b = 0L;
                    a();
                }
            }
            if (!aVar2.c(bufferedOutputStream)) {
                bufferedOutputStream.close();
                com.android.volley.z.a("Failed to write header for %s", fileC.getAbsolutePath());
                throw new IOException();
            }
            bufferedOutputStream.write(aVar.f67066a);
            bufferedOutputStream.close();
            aVar2.f67130a = fileC.length();
            f(str, aVar2);
            e();
        }
    }

    public final File c(String str) {
        return new File(((L) this.f67128c).a(), d(str));
    }

    public final void e() {
        long j12 = this.f67127b;
        int i12 = this.f67129d;
        if (j12 < i12) {
            return;
        }
        int i13 = 0;
        if (com.android.volley.z.f67166a) {
            com.android.volley.z.b("Pruning old cache entries.", new Object[0]);
        }
        long j13 = this.f67127b;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Iterator it = this.f67126a.entrySet().iterator();
        while (it.hasNext()) {
            a aVar = (a) ((Map.Entry) it.next()).getValue();
            if (c(aVar.f67131b).delete()) {
                this.f67127b -= aVar.f67130a;
            } else {
                String str = aVar.f67131b;
                com.android.volley.z.a("Could not delete cache entry for key=%s, filename=%s", str, d(str));
            }
            it.remove();
            i13++;
            if (this.f67127b < i12 * 0.9f) {
                break;
            }
        }
        if (com.android.volley.z.f67166a) {
            com.android.volley.z.b("pruned %d files, %d bytes, %d ms", Integer.valueOf(i13), Long.valueOf(this.f67127b - j13), Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
        }
    }

    public final void f(String str, a aVar) {
        LinkedHashMap linkedHashMap = this.f67126a;
        if (linkedHashMap.containsKey(str)) {
            this.f67127b = (aVar.f67130a - ((a) linkedHashMap.get(str)).f67130a) + this.f67127b;
        } else {
            this.f67127b += aVar.f67130a;
        }
        linkedHashMap.put(str, aVar);
    }

    @Override // com.android.volley.j
    public final synchronized j.a get(String str) {
        a aVar = (a) this.f67126a.get(str);
        if (aVar == null) {
            return null;
        }
        File fileC = c(str);
        try {
            b bVar = new b(new BufferedInputStream(new FileInputStream(fileC)), fileC.length());
            try {
                a aVarA = a.a(bVar);
                if (TextUtils.equals(str, aVarA.f67131b)) {
                    return aVar.b(k(bVar, bVar.f67138b - bVar.f67139c));
                }
                com.android.volley.z.a("%s: key=%s, found=%s", fileC.getAbsolutePath(), str, aVarA.f67131b);
                a aVar2 = (a) this.f67126a.remove(str);
                if (aVar2 != null) {
                    this.f67127b -= aVar2.f67130a;
                }
                return null;
            } finally {
                bVar.close();
            }
        } catch (IOException e12) {
            com.android.volley.z.a("%s: %s", fileC.getAbsolutePath(), e12.toString());
            synchronized (this) {
                boolean zDelete = c(str).delete();
                a aVar3 = (a) this.f67126a.remove(str);
                if (aVar3 != null) {
                    this.f67127b -= aVar3.f67130a;
                }
                if (!zDelete) {
                    com.android.volley.z.a("Could not delete cache entry for key=%s, filename=%s", str, d(str));
                }
                return null;
            }
        }
    }

    @Override // com.android.volley.j
    public final synchronized void invalidate(String str) {
        j.a aVar = get(str);
        if (aVar != null) {
            aVar.f67071f = 0L;
            aVar.f67070e = 0L;
            b(str, aVar);
        }
    }

    /* compiled from: DiskBasedCache.java */
    @k0
    /* renamed from: com.android.volley.toolbox.k$b */
    public static class b extends FilterInputStream {

        /* renamed from: b, reason: collision with root package name */
        public final long f67138b;

        /* renamed from: c, reason: collision with root package name */
        public long f67139c;

        public b(BufferedInputStream bufferedInputStream, long j12) {
            super(bufferedInputStream);
            this.f67138b = j12;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int read() throws IOException {
            int i12 = super.read();
            if (i12 != -1) {
                this.f67139c++;
            }
            return i12;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int read(byte[] bArr, int i12, int i13) throws IOException {
            int i14 = super.read(bArr, i12, i13);
            if (i14 != -1) {
                this.f67139c += i14;
            }
            return i14;
        }
    }

    /* compiled from: DiskBasedCache.java */
    @k0
    /* renamed from: com.android.volley.toolbox.k$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public long f67130a;

        /* renamed from: b, reason: collision with root package name */
        public final String f67131b;

        /* renamed from: c, reason: collision with root package name */
        public final String f67132c;

        /* renamed from: d, reason: collision with root package name */
        public final long f67133d;

        /* renamed from: e, reason: collision with root package name */
        public final long f67134e;

        /* renamed from: f, reason: collision with root package name */
        public final long f67135f;

        /* renamed from: g, reason: collision with root package name */
        public final long f67136g;

        /* renamed from: h, reason: collision with root package name */
        public final List<com.android.volley.o> f67137h;

        public a(String str, String str2, long j12, long j13, long j14, long j15, List<com.android.volley.o> list) {
            this.f67131b = str;
            this.f67132c = "".equals(str2) ? null : str2;
            this.f67133d = j12;
            this.f67134e = j13;
            this.f67135f = j14;
            this.f67136g = j15;
            this.f67137h = list;
        }

        public static a a(b bVar) throws IOException {
            if (C27631k.h(bVar) != 538247942) {
                throw new IOException();
            }
            String strJ = C27631k.j(bVar);
            String strJ2 = C27631k.j(bVar);
            long jI2 = C27631k.i(bVar);
            long jI3 = C27631k.i(bVar);
            long jI4 = C27631k.i(bVar);
            long jI5 = C27631k.i(bVar);
            int iH2 = C27631k.h(bVar);
            if (iH2 < 0) {
                throw new IOException(AK.c.g(iH2, "readHeaderList size="));
            }
            List listEmptyList = iH2 == 0 ? Collections.emptyList() : new ArrayList();
            for (int i12 = 0; i12 < iH2; i12++) {
                listEmptyList.add(new com.android.volley.o(C27631k.j(bVar).intern(), C27631k.j(bVar).intern()));
            }
            return new a(strJ, strJ2, jI2, jI3, jI4, jI5, listEmptyList);
        }

        public final j.a b(byte[] bArr) {
            j.a aVar = new j.a();
            aVar.f67066a = bArr;
            aVar.f67067b = this.f67132c;
            aVar.f67068c = this.f67133d;
            aVar.f67069d = this.f67134e;
            aVar.f67070e = this.f67135f;
            aVar.f67071f = this.f67136g;
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            List<com.android.volley.o> list = this.f67137h;
            for (com.android.volley.o oVar : list) {
                treeMap.put(oVar.f67092a, oVar.f67093b);
            }
            aVar.f67072g = treeMap;
            aVar.f67073h = Collections.unmodifiableList(list);
            return aVar;
        }

        public final boolean c(BufferedOutputStream bufferedOutputStream) throws IOException {
            try {
                C27631k.l(bufferedOutputStream, 538247942);
                C27631k.n(bufferedOutputStream, this.f67131b);
                String str = this.f67132c;
                if (str == null) {
                    str = "";
                }
                C27631k.n(bufferedOutputStream, str);
                C27631k.m(bufferedOutputStream, this.f67133d);
                C27631k.m(bufferedOutputStream, this.f67134e);
                C27631k.m(bufferedOutputStream, this.f67135f);
                C27631k.m(bufferedOutputStream, this.f67136g);
                List<com.android.volley.o> list = this.f67137h;
                if (list != null) {
                    C27631k.l(bufferedOutputStream, list.size());
                    for (com.android.volley.o oVar : list) {
                        C27631k.n(bufferedOutputStream, oVar.f67092a);
                        C27631k.n(bufferedOutputStream, oVar.f67093b);
                    }
                } else {
                    C27631k.l(bufferedOutputStream, 0);
                }
                bufferedOutputStream.flush();
                return true;
            } catch (IOException e12) {
                com.android.volley.z.a("%s", e12.toString());
                return false;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.android.volley.o>] */
        /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r0v2 */
        public a(String str, j.a aVar) {
            String str2 = aVar.f67067b;
            long j12 = aVar.f67068c;
            long j13 = aVar.f67069d;
            long j14 = aVar.f67070e;
            long j15 = aVar.f67071f;
            List arrayList = aVar.f67073h;
            if (arrayList == 0) {
                Map<String, String> map = aVar.f67072g;
                arrayList = new ArrayList(map.size());
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    arrayList.add(new com.android.volley.o(entry.getKey(), entry.getValue()));
                }
            }
            this(str, str2, j12, j13, j14, j15, arrayList);
        }
    }
}
