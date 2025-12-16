package com.yandex.mobile.ads.impl;

import android.os.SystemClock;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.yandex.mobile.ads.impl.zg;
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

/* loaded from: classes8.dex */
public final class eq implements zg {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashMap f385070a = new LinkedHashMap(16, 0.75f, true);

    /* renamed from: b, reason: collision with root package name */
    private long f385071b = 0;

    /* renamed from: c, reason: collision with root package name */
    private final d f385072c;

    /* renamed from: d, reason: collision with root package name */
    private final int f385073d;

    public class a implements d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ File f385074a;

        public a(File file) {
            this.f385074a = file;
        }
    }

    public interface d {
    }

    public eq(File file, int i12) {
        this.f385072c = new a(file);
        this.f385073d = i12;
    }

    private void b() {
        if (this.f385071b < this.f385073d) {
            return;
        }
        boolean z12 = pk1.f388875a;
        SystemClock.elapsedRealtime();
        Iterator it = this.f385070a.entrySet().iterator();
        while (it.hasNext()) {
            b bVar = (b) ((Map.Entry) it.next()).getValue();
            String str = bVar.f385076b;
            File file = ((a) this.f385072c).f385074a;
            int length = str.length() / 2;
            StringBuilder sbA = Cif.a(String.valueOf(str.substring(0, length).hashCode()));
            sbA.append(String.valueOf(str.substring(length).hashCode()));
            if (new File(file, sbA.toString()).delete()) {
                this.f385071b -= bVar.f385075a;
            } else {
                String str2 = bVar.f385076b;
                int length2 = str2.length() / 2;
                String.valueOf(str2.substring(0, length2).hashCode());
                String.valueOf(str2.substring(length2).hashCode());
                boolean z13 = pk1.f388875a;
            }
            it.remove();
            if (this.f385071b < this.f385073d * 0.9f) {
                break;
            }
        }
        if (pk1.f388875a) {
            SystemClock.elapsedRealtime();
        }
    }

    @Override // com.yandex.mobile.ads.impl.zg
    public final synchronized void a() {
        File file = ((a) this.f385072c).f385074a;
        if (!file.exists()) {
            if (!file.mkdirs()) {
                file.getAbsolutePath();
                boolean z12 = pk1.f388875a;
            }
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            try {
                long length = file2.length();
                c cVar = new c(new BufferedInputStream(new FileInputStream(file2)), length);
                try {
                    b bVarA = b.a(cVar);
                    bVarA.f385075a = length;
                    String str = bVarA.f385076b;
                    if (this.f385070a.containsKey(str)) {
                        this.f385071b = (bVarA.f385075a - ((b) this.f385070a.get(str)).f385075a) + this.f385071b;
                    } else {
                        this.f385071b += bVarA.f385075a;
                    }
                    this.f385070a.put(str, bVarA);
                    cVar.close();
                } catch (Throwable th2) {
                    cVar.close();
                    throw th2;
                }
            } catch (IOException unused) {
                file2.delete();
            } catch (Throwable unused2) {
                xv.a(file2);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.zg
    public final synchronized zg.a get(String str) {
        b bVar = (b) this.f385070a.get(str);
        if (bVar == null) {
            return null;
        }
        File file = ((a) this.f385072c).f385074a;
        int length = str.length() / 2;
        StringBuilder sbA = Cif.a(String.valueOf(str.substring(0, length).hashCode()));
        sbA.append(String.valueOf(str.substring(length).hashCode()));
        File file2 = new File(file, sbA.toString());
        try {
            c cVar = new c(new BufferedInputStream(new FileInputStream(file2)), file2.length());
            try {
                if (TextUtils.equals(str, b.a(cVar).f385076b)) {
                    return bVar.a(a(cVar, cVar.a()));
                }
                file2.getAbsolutePath();
                boolean z12 = pk1.f388875a;
                b bVar2 = (b) this.f385070a.remove(str);
                if (bVar2 != null) {
                    this.f385071b -= bVar2.f385075a;
                }
                return null;
            } finally {
                cVar.close();
            }
        } catch (IOException unused) {
            file2.getAbsolutePath();
            boolean z13 = pk1.f388875a;
            synchronized (this) {
                try {
                    File file3 = ((a) this.f385072c).f385074a;
                    int length2 = str.length() / 2;
                    boolean zDelete = new File(file3, String.valueOf(str.substring(0, length2).hashCode()) + String.valueOf(str.substring(length2).hashCode())).delete();
                    b bVar3 = (b) this.f385070a.remove(str);
                    if (bVar3 != null) {
                        this.f385071b -= bVar3.f385075a;
                    }
                    if (!zDelete) {
                        int length3 = str.length() / 2;
                        String.valueOf(str.substring(0, length3).hashCode());
                        String.valueOf(str.substring(length3).hashCode());
                    }
                    return null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @j.k0
    public static class c extends FilterInputStream {

        /* renamed from: a, reason: collision with root package name */
        private final long f385083a;

        /* renamed from: b, reason: collision with root package name */
        private long f385084b;

        public c(BufferedInputStream bufferedInputStream, long j12) {
            super(bufferedInputStream);
            this.f385083a = j12;
        }

        public final long a() {
            return this.f385083a - this.f385084b;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int read() throws IOException {
            int i12 = super.read();
            if (i12 != -1) {
                this.f385084b++;
            }
            return i12;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int read(byte[] bArr, int i12, int i13) throws IOException {
            int i14 = super.read(bArr, i12, i13);
            if (i14 != -1) {
                this.f385084b += i14;
            }
            return i14;
        }
    }

    @j.k0
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        long f385075a;

        /* renamed from: b, reason: collision with root package name */
        final String f385076b;

        /* renamed from: c, reason: collision with root package name */
        final String f385077c;

        /* renamed from: d, reason: collision with root package name */
        final long f385078d;

        /* renamed from: e, reason: collision with root package name */
        final long f385079e;

        /* renamed from: f, reason: collision with root package name */
        final long f385080f;

        /* renamed from: g, reason: collision with root package name */
        final long f385081g;

        /* renamed from: h, reason: collision with root package name */
        final List<dz> f385082h;

        private b(String str, String str2, long j12, long j13, long j14, long j15, List<dz> list) {
            this.f385076b = str;
            this.f385077c = "".equals(str2) ? null : str2;
            this.f385078d = j12;
            this.f385079e = j13;
            this.f385080f = j14;
            this.f385081g = j15;
            this.f385082h = list;
        }

        private static List<dz> a(zg.a aVar) {
            List<dz> list = aVar.f392261h;
            if (list != null) {
                return list;
            }
            Map<String, String> map = aVar.f392260g;
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                arrayList.add(new dz(entry.getKey(), entry.getValue()));
            }
            return arrayList;
        }

        public static b a(c cVar) throws IOException {
            if (eq.a(cVar) == 538247942) {
                String str = new String(eq.a(cVar, eq.b(cVar)), Constants.ENCODING);
                String str2 = new String(eq.a(cVar, eq.b(cVar)), Constants.ENCODING);
                long jB2 = eq.b(cVar);
                long jB3 = eq.b(cVar);
                long jB4 = eq.b(cVar);
                long jB5 = eq.b(cVar);
                int iA2 = eq.a(cVar);
                if (iA2 >= 0) {
                    List listEmptyList = iA2 == 0 ? Collections.emptyList() : new ArrayList();
                    int i12 = 0;
                    while (i12 < iA2) {
                        listEmptyList.add(new dz(new String(eq.a(cVar, eq.b(cVar)), Constants.ENCODING).intern(), new String(eq.a(cVar, eq.b(cVar)), Constants.ENCODING).intern()));
                        i12++;
                        jB5 = jB5;
                        jB4 = jB4;
                    }
                    return new b(str, str2, jB2, jB3, jB4, jB5, listEmptyList);
                }
                throw new IOException(ba.a("readHeaderList size=", iA2));
            }
            throw new IOException();
        }

        public b(String str, zg.a aVar) {
            this(str, aVar.f392255b, aVar.f392256c, aVar.f392257d, aVar.f392258e, aVar.f392259f, a(aVar));
        }

        public final zg.a a(byte[] bArr) {
            zg.a aVar = new zg.a();
            aVar.f392254a = bArr;
            aVar.f392255b = this.f385077c;
            aVar.f392256c = this.f385078d;
            aVar.f392257d = this.f385079e;
            aVar.f392258e = this.f385080f;
            aVar.f392259f = this.f385081g;
            List<dz> list = this.f385082h;
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            for (dz dzVar : list) {
                treeMap.put(dzVar.a(), dzVar.b());
            }
            aVar.f392260g = treeMap;
            aVar.f392261h = Collections.unmodifiableList(this.f385082h);
            return aVar;
        }

        public final boolean a(BufferedOutputStream bufferedOutputStream) throws IOException {
            try {
                eq.a(bufferedOutputStream, 538247942);
                byte[] bytes = this.f385076b.getBytes(Constants.ENCODING);
                eq.a(bufferedOutputStream, bytes.length);
                bufferedOutputStream.write(bytes, 0, bytes.length);
                String str = this.f385077c;
                if (str == null) {
                    str = "";
                }
                byte[] bytes2 = str.getBytes(Constants.ENCODING);
                eq.a(bufferedOutputStream, bytes2.length);
                bufferedOutputStream.write(bytes2, 0, bytes2.length);
                eq.a(bufferedOutputStream, this.f385078d);
                eq.a(bufferedOutputStream, this.f385079e);
                eq.a(bufferedOutputStream, this.f385080f);
                eq.a(bufferedOutputStream, this.f385081g);
                List<dz> list = this.f385082h;
                if (list != null) {
                    eq.a(bufferedOutputStream, list.size());
                    for (dz dzVar : list) {
                        byte[] bytes3 = dzVar.a().getBytes(Constants.ENCODING);
                        eq.a(bufferedOutputStream, bytes3.length);
                        bufferedOutputStream.write(bytes3, 0, bytes3.length);
                        byte[] bytes4 = dzVar.b().getBytes(Constants.ENCODING);
                        eq.a(bufferedOutputStream, bytes4.length);
                        bufferedOutputStream.write(bytes4, 0, bytes4.length);
                    }
                } else {
                    eq.a(bufferedOutputStream, 0);
                }
                bufferedOutputStream.flush();
                return true;
            } catch (IOException unused) {
                boolean z12 = pk1.f388875a;
                return false;
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.zg
    public final synchronized void a(String str) {
        zg.a aVar = get(str);
        if (aVar != null) {
            aVar.f392259f = 0L;
            aVar.f392258e = 0L;
            a(str, aVar);
        }
    }

    public static long b(InputStream inputStream) throws IOException {
        int i12 = inputStream.read();
        if (i12 != -1) {
            long j12 = i12 & 255;
            int i13 = inputStream.read();
            if (i13 != -1) {
                long j13 = j12 | ((i13 & 255) << 8);
                int i14 = inputStream.read();
                if (i14 != -1) {
                    long j14 = j13 | ((i14 & 255) << 16);
                    int i15 = inputStream.read();
                    if (i15 != -1) {
                        long j15 = j14 | ((i15 & 255) << 24);
                        int i16 = inputStream.read();
                        if (i16 != -1) {
                            long j16 = j15 | ((i16 & 255) << 32);
                            int i17 = inputStream.read();
                            if (i17 != -1) {
                                long j17 = j16 | ((i17 & 255) << 40);
                                int i18 = inputStream.read();
                                if (i18 != -1) {
                                    long j18 = j17 | ((i18 & 255) << 48);
                                    int i19 = inputStream.read();
                                    if (i19 != -1) {
                                        return ((i19 & 255) << 56) | j18;
                                    }
                                    throw new EOFException();
                                }
                                throw new EOFException();
                            }
                            throw new EOFException();
                        }
                        throw new EOFException();
                    }
                    throw new EOFException();
                }
                throw new EOFException();
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    @Override // com.yandex.mobile.ads.impl.zg
    public final synchronized void a(String str, zg.a aVar) {
        BufferedOutputStream bufferedOutputStream;
        b bVar;
        long j12 = this.f385071b;
        byte[] bArr = aVar.f392254a;
        long length = j12 + bArr.length;
        int i12 = this.f385073d;
        if (length <= i12 || bArr.length <= i12 * 0.9f) {
            File file = ((a) this.f385072c).f385074a;
            int length2 = str.length() / 2;
            StringBuilder sbA = Cif.a(String.valueOf(str.substring(0, length2).hashCode()));
            sbA.append(String.valueOf(str.substring(length2).hashCode()));
            File file2 = new File(file, sbA.toString());
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
                bVar = new b(str, aVar);
            } catch (IOException unused) {
                if (!file2.delete()) {
                    file2.getAbsolutePath();
                    boolean z12 = pk1.f388875a;
                }
                if (!((a) this.f385072c).f385074a.exists()) {
                    boolean z13 = pk1.f388875a;
                    this.f385070a.clear();
                    this.f385071b = 0L;
                    a();
                }
            }
            if (bVar.a(bufferedOutputStream)) {
                bufferedOutputStream.write(aVar.f392254a);
                bufferedOutputStream.close();
                bVar.f385075a = file2.length();
                if (!this.f385070a.containsKey(str)) {
                    this.f385071b += bVar.f385075a;
                } else {
                    this.f385071b = (bVar.f385075a - ((b) this.f385070a.get(str)).f385075a) + this.f385071b;
                }
                this.f385070a.put(str, bVar);
                b();
                return;
            }
            bufferedOutputStream.close();
            file2.getAbsolutePath();
            boolean z14 = pk1.f388875a;
            throw new IOException();
        }
    }

    @j.k0
    public static byte[] a(c cVar, long j12) throws IOException {
        long jA2 = cVar.a();
        if (j12 >= 0 && j12 <= jA2) {
            int i12 = (int) j12;
            if (i12 == j12) {
                byte[] bArr = new byte[i12];
                new DataInputStream(cVar).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sbQ = androidx.compose.foundation.H.q(j12, "streamToBytes length=", ", maxLength=");
        sbQ.append(jA2);
        throw new IOException(sbQ.toString());
    }

    public static int a(InputStream inputStream) throws IOException {
        int i12 = inputStream.read();
        if (i12 != -1) {
            int i13 = inputStream.read();
            if (i13 != -1) {
                int i14 = i12 | (i13 << 8);
                int i15 = inputStream.read();
                if (i15 != -1) {
                    int i16 = i14 | (i15 << 16);
                    int i17 = inputStream.read();
                    if (i17 != -1) {
                        return (i17 << 24) | i16;
                    }
                    throw new EOFException();
                }
                throw new EOFException();
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public static void a(BufferedOutputStream bufferedOutputStream, int i12) throws IOException {
        bufferedOutputStream.write(i12 & 255);
        bufferedOutputStream.write((i12 >> 8) & 255);
        bufferedOutputStream.write((i12 >> 16) & 255);
        bufferedOutputStream.write((i12 >> 24) & 255);
    }

    public static void a(BufferedOutputStream bufferedOutputStream, long j12) throws IOException {
        bufferedOutputStream.write((byte) j12);
        bufferedOutputStream.write((byte) (j12 >>> 8));
        bufferedOutputStream.write((byte) (j12 >>> 16));
        bufferedOutputStream.write((byte) (j12 >>> 24));
        bufferedOutputStream.write((byte) (j12 >>> 32));
        bufferedOutputStream.write((byte) (j12 >>> 40));
        bufferedOutputStream.write((byte) (j12 >>> 48));
        bufferedOutputStream.write((byte) (j12 >>> 56));
    }
}
