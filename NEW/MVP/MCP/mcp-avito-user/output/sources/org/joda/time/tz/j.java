package org.joda.time.tz;

import com.avito.android.remote.model.messenger.context.ChannelContext;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Collections;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.AbstractC44868j;

/* compiled from: ZoneInfoProvider.java */
/* loaded from: classes7.dex */
public class j implements f {

    /* renamed from: a, reason: collision with root package name */
    public final File f420999a;

    /* renamed from: b, reason: collision with root package name */
    public final String f421000b;

    /* renamed from: c, reason: collision with root package name */
    public final ClassLoader f421001c;

    /* renamed from: d, reason: collision with root package name */
    public final ConcurrentHashMap f421002d;

    /* renamed from: e, reason: collision with root package name */
    public final SortedSet f421003e;

    /* compiled from: ZoneInfoProvider.java */
    public class a implements PrivilegedAction<InputStream> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f421004b;

        public a(String str) {
            this.f421004b = str;
        }

        @Override // java.security.PrivilegedAction
        public final InputStream run() {
            ClassLoader classLoader = j.this.f421001c;
            String str = this.f421004b;
            return classLoader != null ? classLoader.getResourceAsStream(str) : ClassLoader.getSystemResourceAsStream(str);
        }
    }

    public j() {
        this(0);
    }

    public static ConcurrentHashMap d(InputStream inputStream) throws IOException {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        try {
            f(dataInputStream, concurrentHashMap);
            concurrentHashMap.put("UTC", new SoftReference(AbstractC44868j.f420911c));
            return concurrentHashMap;
        } finally {
            try {
                dataInputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void f(DataInputStream dataInputStream, ConcurrentHashMap concurrentHashMap) throws IOException {
        int unsignedShort = dataInputStream.readUnsignedShort();
        String[] strArr = new String[unsignedShort];
        for (int i12 = 0; i12 < unsignedShort; i12++) {
            strArr[i12] = dataInputStream.readUTF().intern();
        }
        int unsignedShort2 = dataInputStream.readUnsignedShort();
        for (int i13 = 0; i13 < unsignedShort2; i13++) {
            try {
                concurrentHashMap.put(strArr[dataInputStream.readUnsignedShort()], strArr[dataInputStream.readUnsignedShort()]);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new IOException("Corrupt zone info map");
            }
        }
    }

    @Override // org.joda.time.tz.f
    public final AbstractC44868j a(String str) {
        Object obj = this.f421002d.get(str);
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof SoftReference)) {
            return str.equals(obj) ? c(str) : a((String) obj);
        }
        AbstractC44868j abstractC44868j = (AbstractC44868j) ((SoftReference) obj).get();
        return abstractC44868j != null ? abstractC44868j : c(str);
    }

    @Override // org.joda.time.tz.f
    public final Set<String> b() {
        return this.f421003e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0028: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:41), block:B:11:0x0028 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.joda.time.AbstractC44868j c(java.lang.String r6) throws java.lang.Throwable {
        /*
            r5 = this;
            java.util.concurrent.ConcurrentHashMap r0 = r5.f421002d
            r1 = 0
            java.io.InputStream r2 = r5.e(r6)     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L30
            boolean r3 = r2 instanceof java.io.DataInput     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c
            if (r3 == 0) goto L13
            r3 = r2
            java.io.DataInput r3 = (java.io.DataInput) r3     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c
            org.joda.time.j r3 = org.joda.time.tz.b.a(r3, r6)     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c
            goto L1c
        L13:
            java.io.DataInputStream r3 = new java.io.DataInputStream     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c
            org.joda.time.j r3 = org.joda.time.tz.b.a(r3, r6)     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c
        L1c:
            java.lang.ref.SoftReference r4 = new java.lang.ref.SoftReference     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c
            r0.put(r6, r4)     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c
            r2.close()     // Catch: java.io.IOException -> L27
        L27:
            return r3
        L28:
            r1 = r2
            goto L3e
        L2a:
            r6 = move-exception
            goto L28
        L2c:
            r3 = move-exception
            goto L32
        L2e:
            r6 = move-exception
            goto L3e
        L30:
            r3 = move-exception
            r2 = r1
        L32:
            r3.printStackTrace()     // Catch: java.lang.Throwable -> L2a
            r0.remove(r6)     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L3d
            r2.close()     // Catch: java.io.IOException -> L3d
        L3d:
            return r1
        L3e:
            if (r1 == 0) goto L43
            r1.close()     // Catch: java.io.IOException -> L43
        L43:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.tz.j.c(java.lang.String):org.joda.time.j");
    }

    public final InputStream e(String str) throws IOException {
        File file = this.f420999a;
        if (file != null) {
            return new FileInputStream(new File(file, str));
        }
        String strConcat = this.f421000b.concat(str);
        InputStream inputStream = (InputStream) AccessController.doPrivileged(new a(strConcat));
        if (inputStream != null) {
            return inputStream;
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Resource not found: \"");
        sb2.append(strConcat);
        sb2.append("\" ClassLoader: ");
        ClassLoader classLoader = this.f421001c;
        sb2.append(classLoader != null ? classLoader.toString() : ChannelContext.System.TYPE);
        throw new IOException(sb2.toString());
    }

    public j(File file) throws IOException {
        if (!file.exists()) {
            throw new IOException(androidx.compose.ui.graphics.colorspace.e.j(file, "File directory doesn't exist: "));
        }
        if (!file.isDirectory()) {
            throw new IOException(androidx.compose.ui.graphics.colorspace.e.j(file, "File doesn't refer to a directory: "));
        }
        this.f420999a = file;
        this.f421000b = null;
        this.f421001c = null;
        ConcurrentHashMap concurrentHashMapD = d(e("ZoneInfoMap"));
        this.f421002d = concurrentHashMapD;
        this.f421003e = Collections.unmodifiableSortedSet(new TreeSet(concurrentHashMapD.keySet()));
    }

    public j(int i12) throws IOException {
        String strConcat = "org/joda/time/tz/data".concat("/");
        this.f420999a = null;
        this.f421000b = strConcat;
        this.f421001c = getClass().getClassLoader();
        ConcurrentHashMap concurrentHashMapD = d(e("ZoneInfoMap"));
        this.f421002d = concurrentHashMapD;
        this.f421003e = Collections.unmodifiableSortedSet(new TreeSet(concurrentHashMapD.keySet()));
    }
}
