package com.facebook.cache.disk;

import android.os.Environment;
import androidx.compose.foundation.H;
import com.facebook.cache.disk.e;
import com.facebook.common.file.FileUtils;
import com.facebook.common.internal.o;
import com.facebook.infer.annotation.Nullsafe;
import j.k0;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import pW0.C47024c;
import pW0.InterfaceC47022a;
import sW0.C48116a;
import sW0.InterfaceC48117b;
import yW0.C50194e;

/* compiled from: DefaultDiskStorage.java */
@Nullsafe
/* loaded from: classes5.dex */
public class a implements com.facebook.cache.disk.e {

    /* renamed from: f, reason: collision with root package name */
    public static final long f339738f = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f339739g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final File f339740a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f339741b;

    /* renamed from: c, reason: collision with root package name */
    public final File f339742c;

    /* renamed from: d, reason: collision with root package name */
    public final com.facebook.cache.common.h f339743d;

    /* renamed from: e, reason: collision with root package name */
    public final C50194e f339744e;

    /* compiled from: DefaultDiskStorage.java */
    @k0
    public static class c implements e.c {

        /* renamed from: a, reason: collision with root package name */
        public final String f339747a;

        /* renamed from: b, reason: collision with root package name */
        public final C47024c f339748b;

        /* renamed from: c, reason: collision with root package name */
        public long f339749c;

        /* renamed from: d, reason: collision with root package name */
        public long f339750d;

        public c(String str, File file, C10524a c10524a) {
            file.getClass();
            str.getClass();
            this.f339747a = str;
            this.f339748b = new C47024c(file);
            this.f339749c = -1L;
            this.f339750d = -1L;
        }

        @Override // com.facebook.cache.disk.e.c
        public final long a() {
            if (this.f339750d < 0) {
                this.f339750d = this.f339748b.f428572a.lastModified();
            }
            return this.f339750d;
        }

        @Override // com.facebook.cache.disk.e.c
        public final String getId() {
            return this.f339747a;
        }

        @Override // com.facebook.cache.disk.e.c
        public final long getSize() {
            if (this.f339749c < 0) {
                this.f339749c = this.f339748b.f428572a.length();
            }
            return this.f339749c;
        }
    }

    /* compiled from: DefaultDiskStorage.java */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        @e
        public final String f339751a;

        /* renamed from: b, reason: collision with root package name */
        public final String f339752b;

        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f339751a);
            sb2.append("(");
            return AK.c.s(sb2, this.f339752b, ")");
        }

        public d(@e String str, String str2) {
            this.f339751a = str;
            this.f339752b = str2;
        }
    }

    /* compiled from: DefaultDiskStorage.java */
    public @interface e {
    }

    /* compiled from: DefaultDiskStorage.java */
    public static class f extends IOException {
    }

    /* compiled from: DefaultDiskStorage.java */
    @k0
    public class g implements e.d {

        /* renamed from: a, reason: collision with root package name */
        public final String f339753a;

        /* renamed from: b, reason: collision with root package name */
        @k0
        public final File f339754b;

        public g(String str, File file) {
            this.f339753a = str;
            this.f339754b = file;
        }

        @Override // com.facebook.cache.disk.e.d
        public final void a(com.facebook.cache.common.k kVar) throws IOException {
            File file = this.f339754b;
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    com.facebook.common.internal.f fVar = new com.facebook.common.internal.f(fileOutputStream);
                    fVar.f339819b = 0L;
                    kVar.a(fVar);
                    fVar.flush();
                    long j12 = fVar.f339819b;
                    fileOutputStream.close();
                    if (file.length() == j12) {
                        return;
                    }
                    long length = file.length();
                    StringBuilder sbQ = H.q(j12, "File was not written completely. Expected: ", ", found: ");
                    sbQ.append(length);
                    throw new f(sbQ.toString());
                } catch (Throwable th2) {
                    fileOutputStream.close();
                    throw th2;
                }
            } catch (FileNotFoundException e12) {
                com.facebook.cache.common.h hVar = a.this.f339743d;
                int i12 = a.f339739g;
                hVar.getClass();
                throw e12;
            }
        }

        @Override // com.facebook.cache.disk.e.d
        public final C47024c commit() throws FileUtils.RenameException {
            a aVar = a.this;
            aVar.f339744e.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            File fileH = aVar.h(this.f339753a);
            try {
                FileUtils.b(this.f339754b, fileH);
                if (fileH.exists()) {
                    fileH.setLastModified(jCurrentTimeMillis);
                }
                return new C47024c(fileH);
            } catch (FileUtils.RenameException e12) {
                Throwable cause = e12.getCause();
                if (cause != null && !(cause instanceof FileUtils.ParentDirNotFoundException)) {
                    boolean z12 = cause instanceof FileNotFoundException;
                }
                int i12 = a.f339739g;
                aVar.f339743d.getClass();
                throw e12;
            }
        }

        @Override // com.facebook.cache.disk.e.d
        public final boolean s() {
            File file = this.f339754b;
            return !file.exists() || file.delete();
        }
    }

    /* compiled from: DefaultDiskStorage.java */
    public class h implements InterfaceC48117b {

        /* renamed from: a, reason: collision with root package name */
        public boolean f339756a;

        public h(C10524a c10524a) {
        }

        @Override // sW0.InterfaceC48117b
        public final void a(File file) {
            if (this.f339756a || !file.equals(a.this.f339742c)) {
                return;
            }
            this.f339756a = true;
        }

        @Override // sW0.InterfaceC48117b
        public final void b(File file) {
            a aVar;
            d dVarG;
            if (this.f339756a && (dVarG = a.g((aVar = a.this), file)) != null) {
                String str = dVarG.f339751a;
                if (str != ".tmp") {
                    o.d(str == ".cnt");
                    return;
                }
                long jLastModified = file.lastModified();
                aVar.f339744e.getClass();
                if (jLastModified > System.currentTimeMillis() - a.f339738f) {
                    return;
                }
            }
            file.delete();
        }

        @Override // sW0.InterfaceC48117b
        public final void c(File file) {
            a aVar = a.this;
            if (!aVar.f339740a.equals(file) && !this.f339756a) {
                file.delete();
            }
            if (this.f339756a && file.equals(aVar.f339742c)) {
                this.f339756a = false;
            }
        }
    }

    public a(File file, int i12, com.facebook.cache.common.h hVar) {
        this.f339740a = file;
        boolean zContains = false;
        try {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (externalStorageDirectory != null) {
                try {
                    zContains = file.getCanonicalPath().contains(externalStorageDirectory.toString());
                } catch (IOException unused) {
                    hVar.getClass();
                }
            }
        } catch (Exception unused2) {
            hVar.getClass();
        }
        this.f339741b = zContains;
        File file2 = new File(this.f339740a, AK.c.g(i12, "v2.ols100."));
        this.f339742c = file2;
        this.f339743d = hVar;
        File file3 = this.f339740a;
        if (!file3.exists()) {
            FileUtils.a(file2);
        } else if (!file2.exists()) {
            C48116a.a(file3);
            try {
                FileUtils.a(file2);
            } catch (FileUtils.CreateDirectoryException unused3) {
                file2.toString();
                this.f339743d.getClass();
            }
        }
        this.f339744e = C50194e.f443164a;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.cache.disk.a.d g(com.facebook.cache.disk.a r8, java.io.File r9) {
        /*
            r8.getClass()
            java.lang.String r0 = r9.getName()
            r1 = 46
            int r2 = r0.lastIndexOf(r1)
            r3 = 0
            if (r2 > 0) goto L12
        L10:
            r1 = r3
            goto L48
        L12:
            java.lang.String r4 = r0.substring(r2)
            java.lang.String r5 = ".cnt"
            boolean r6 = r5.equals(r4)
            java.lang.String r7 = ".tmp"
            if (r6 == 0) goto L21
            goto L2a
        L21:
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L29
            r5 = r7
            goto L2a
        L29:
            r5 = r3
        L2a:
            if (r5 != 0) goto L2d
            goto L10
        L2d:
            r4 = 0
            java.lang.String r0 = r0.substring(r4, r2)
            boolean r2 = r5.equals(r7)
            if (r2 == 0) goto L43
            int r1 = r0.lastIndexOf(r1)
            if (r1 > 0) goto L3f
            goto L10
        L3f:
            java.lang.String r0 = r0.substring(r4, r1)
        L43:
            com.facebook.cache.disk.a$d r1 = new com.facebook.cache.disk.a$d
            r1.<init>(r5, r0)
        L48:
            if (r1 != 0) goto L4b
            goto L61
        L4b:
            java.io.File r0 = new java.io.File
            java.lang.String r2 = r1.f339752b
            java.lang.String r8 = r8.i(r2)
            r0.<init>(r8)
            java.io.File r8 = r9.getParentFile()
            boolean r8 = r0.equals(r8)
            if (r8 == 0) goto L61
            r3 = r1
        L61:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cache.disk.a.g(com.facebook.cache.disk.a, java.io.File):com.facebook.cache.disk.a$d");
    }

    @Override // com.facebook.cache.disk.e
    public final void a() {
        C48116a.b(this.f339740a, new h(null));
    }

    @Override // com.facebook.cache.disk.e
    public final long b(e.c cVar) {
        File file = ((c) cVar).f339748b.f428572a;
        if (!file.exists()) {
            return 0L;
        }
        long length = file.length();
        if (file.delete()) {
            return length;
        }
        return -1L;
    }

    @Override // com.facebook.cache.disk.e
    @I41.h
    public final InterfaceC47022a c(String str, com.facebook.cache.common.c cVar) {
        File fileH = h(str);
        if (!fileH.exists()) {
            return null;
        }
        this.f339744e.getClass();
        fileH.setLastModified(System.currentTimeMillis());
        return new C47024c(fileH);
    }

    @Override // com.facebook.cache.disk.e
    public final e.d d(String str, com.facebook.cache.common.c cVar) throws IOException {
        String str2 = new d(".tmp", str).f339752b;
        File file = new File(i(str2));
        boolean zExists = file.exists();
        com.facebook.cache.common.h hVar = this.f339743d;
        if (!zExists) {
            try {
                FileUtils.a(file);
            } catch (FileUtils.CreateDirectoryException e12) {
                hVar.getClass();
                throw e12;
            }
        }
        try {
            return new g(str, File.createTempFile(str2.concat("."), ".tmp", file));
        } catch (IOException e13) {
            hVar.getClass();
            throw e13;
        }
    }

    @Override // com.facebook.cache.disk.e
    public final boolean e(String str, com.facebook.cache.common.c cVar) {
        File fileH = h(str);
        boolean zExists = fileH.exists();
        if (zExists) {
            this.f339744e.getClass();
            fileH.setLastModified(System.currentTimeMillis());
        }
        return zExists;
    }

    @Override // com.facebook.cache.disk.e
    public final Collection f() {
        b bVar = new b(null);
        C48116a.b(this.f339742c, bVar);
        return Collections.unmodifiableList(bVar.f339745a);
    }

    @k0
    public final File h(String str) {
        d dVar = new d(".cnt", str);
        String str2 = dVar.f339752b;
        StringBuilder sbR = H.r(i(str2));
        sbR.append(File.separator);
        sbR.append(str2);
        sbR.append(dVar.f339751a);
        return new File(sbR.toString());
    }

    public final String i(String str) {
        String strValueOf = String.valueOf(Math.abs(str.hashCode() % 100));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f339742c);
        return AK.c.s(sb2, File.separator, strValueOf);
    }

    @Override // com.facebook.cache.disk.e
    public final boolean isExternal() {
        return this.f339741b;
    }

    @Override // com.facebook.cache.disk.e
    public final long remove(String str) {
        File fileH = h(str);
        if (!fileH.exists()) {
            return 0L;
        }
        long length = fileH.length();
        if (fileH.delete()) {
            return length;
        }
        return -1L;
    }

    /* compiled from: DefaultDiskStorage.java */
    public class b implements InterfaceC48117b {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f339745a = new ArrayList();

        public b(C10524a c10524a) {
        }

        @Override // sW0.InterfaceC48117b
        public final void b(File file) {
            d dVarG = a.g(a.this, file);
            if (dVarG == null || dVarG.f339751a != ".cnt") {
                return;
            }
            this.f339745a.add(new c(dVarG.f339752b, file, null));
        }

        @Override // sW0.InterfaceC48117b
        public final void a(File file) {
        }

        @Override // sW0.InterfaceC48117b
        public final void c(File file) {
        }
    }
}
